package i7;

import com.daren.scraply.data.local.ScraplyDatabase_Impl;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import fa.l0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import l5.i;
import qe.m;
import ya.c0;
import ya.h0;
import ya.n9;

/* loaded from: classes.dex */
public final class f extends c4.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ScraplyDatabase_Impl f18336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ScraplyDatabase_Impl scraplyDatabase_Impl) {
        super("a3cb3db02351f16eec9518722667257f", 2, "60edf5911042dcdb3d555134ffa0e859");
        this.f18336d = scraplyDatabase_Impl;
    }

    @Override // c4.g
    public final void a(p5.a aVar) {
        aVar.getClass();
        n9.a(aVar, "CREATE TABLE IF NOT EXISTS `notebooks` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `pageCount` INTEGER NOT NULL, `colorR` REAL NOT NULL, `colorG` REAL NOT NULL, `colorB` REAL NOT NULL, `orderIndex` INTEGER NOT NULL, `coverConfig` TEXT, `backgroundConfig` TEXT, `sizeId` TEXT, `stackId` TEXT, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        n9.a(aVar, "CREATE INDEX IF NOT EXISTS `index_notebooks_stackId` ON `notebooks` (`stackId`)");
        n9.a(aVar, "CREATE TABLE IF NOT EXISTS `canvas_elements` (`id` TEXT NOT NULL, `notebookId` TEXT NOT NULL, `spreadIndex` INTEGER NOT NULL, `pageSide` INTEGER NOT NULL, `type` TEXT NOT NULL, `zIndex` INTEGER NOT NULL, `x` REAL NOT NULL, `y` REAL NOT NULL, `scale` REAL NOT NULL, `rotation` REAL NOT NULL, `payload` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`), FOREIGN KEY(`notebookId`) REFERENCES `notebooks`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        n9.a(aVar, "CREATE INDEX IF NOT EXISTS `index_canvas_elements_notebookId` ON `canvas_elements` (`notebookId`)");
        n9.a(aVar, "CREATE INDEX IF NOT EXISTS `index_canvas_elements_notebookId_spreadIndex` ON `canvas_elements` (`notebookId`, `spreadIndex`)");
        n9.a(aVar, "CREATE TABLE IF NOT EXISTS `stacks` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `orderIndex` INTEGER NOT NULL, `createdAt` INTEGER NOT NULL, `updatedAt` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        n9.a(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        n9.a(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a3cb3db02351f16eec9518722667257f')");
    }

    @Override // c4.g
    public final void b(p5.a aVar) {
        aVar.getClass();
        n9.a(aVar, "DROP TABLE IF EXISTS `notebooks`");
        n9.a(aVar, "DROP TABLE IF EXISTS `canvas_elements`");
        n9.a(aVar, "DROP TABLE IF EXISTS `stacks`");
    }

    @Override // c4.g
    public final void c(p5.a aVar) {
        aVar.getClass();
    }

    @Override // c4.g
    public final void d(p5.a aVar) {
        aVar.getClass();
        n9.a(aVar, "PRAGMA foreign_keys = ON");
        int i = ScraplyDatabase_Impl.f4154u;
        this.f18336d.s(aVar);
    }

    @Override // c4.g
    public final void e(p5.a aVar) {
        aVar.getClass();
    }

    @Override // c4.g
    public final void f(p5.a aVar) {
        aVar.getClass();
        c0.a(aVar);
    }

    @Override // c4.g
    public final l0 g(p5.a aVar) {
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(FacebookMediationAdapter.KEY_ID, new l5.f(1, 1, FacebookMediationAdapter.KEY_ID, "TEXT", null, true));
        linkedHashMap.put("title", new l5.f(0, 1, "title", "TEXT", null, true));
        linkedHashMap.put("pageCount", new l5.f(0, 1, "pageCount", "INTEGER", null, true));
        linkedHashMap.put("colorR", new l5.f(0, 1, "colorR", "REAL", null, true));
        linkedHashMap.put("colorG", new l5.f(0, 1, "colorG", "REAL", null, true));
        linkedHashMap.put("colorB", new l5.f(0, 1, "colorB", "REAL", null, true));
        linkedHashMap.put("orderIndex", new l5.f(0, 1, "orderIndex", "INTEGER", null, true));
        linkedHashMap.put("coverConfig", new l5.f(0, 1, "coverConfig", "TEXT", null, false));
        linkedHashMap.put("backgroundConfig", new l5.f(0, 1, "backgroundConfig", "TEXT", null, false));
        linkedHashMap.put("sizeId", new l5.f(0, 1, "sizeId", "TEXT", null, false));
        linkedHashMap.put("stackId", new l5.f(0, 1, "stackId", "TEXT", null, false));
        linkedHashMap.put("createdAt", new l5.f(0, 1, "createdAt", "INTEGER", null, true));
        linkedHashMap.put("updatedAt", new l5.f(0, 1, "updatedAt", "INTEGER", null, true));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new l5.h("index_notebooks_stackId", false, m.g("stackId"), m.g("ASC")));
        i iVar = new i("notebooks", linkedHashMap, linkedHashSet, linkedHashSet2);
        i a10 = h0.a(aVar, "notebooks");
        if (!iVar.equals(a10)) {
            return new l0(false, "notebooks(com.daren.scraply.data.local.entity.NotebookEntity).\n Expected:\n" + iVar + "\n Found:\n" + a10);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(FacebookMediationAdapter.KEY_ID, new l5.f(1, 1, FacebookMediationAdapter.KEY_ID, "TEXT", null, true));
        linkedHashMap2.put("notebookId", new l5.f(0, 1, "notebookId", "TEXT", null, true));
        linkedHashMap2.put("spreadIndex", new l5.f(0, 1, "spreadIndex", "INTEGER", null, true));
        linkedHashMap2.put("pageSide", new l5.f(0, 1, "pageSide", "INTEGER", null, true));
        linkedHashMap2.put("type", new l5.f(0, 1, "type", "TEXT", null, true));
        linkedHashMap2.put("zIndex", new l5.f(0, 1, "zIndex", "INTEGER", null, true));
        linkedHashMap2.put("x", new l5.f(0, 1, "x", "REAL", null, true));
        linkedHashMap2.put("y", new l5.f(0, 1, "y", "REAL", null, true));
        linkedHashMap2.put("scale", new l5.f(0, 1, "scale", "REAL", null, true));
        linkedHashMap2.put("rotation", new l5.f(0, 1, "rotation", "REAL", null, true));
        linkedHashMap2.put("payload", new l5.f(0, 1, "payload", "TEXT", null, true));
        linkedHashMap2.put("createdAt", new l5.f(0, 1, "createdAt", "INTEGER", null, true));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new l5.g("notebooks", "CASCADE", "NO ACTION", m.g("notebookId"), m.g(FacebookMediationAdapter.KEY_ID)));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new l5.h("index_canvas_elements_notebookId", false, m.g("notebookId"), m.g("ASC")));
        linkedHashSet4.add(new l5.h("index_canvas_elements_notebookId_spreadIndex", false, m.h("notebookId", "spreadIndex"), m.h("ASC", "ASC")));
        i iVar2 = new i("canvas_elements", linkedHashMap2, linkedHashSet3, linkedHashSet4);
        i a11 = h0.a(aVar, "canvas_elements");
        if (!iVar2.equals(a11)) {
            return new l0(false, "canvas_elements(com.daren.scraply.data.local.entity.CanvasElementEntity).\n Expected:\n" + iVar2 + "\n Found:\n" + a11);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(FacebookMediationAdapter.KEY_ID, new l5.f(1, 1, FacebookMediationAdapter.KEY_ID, "TEXT", null, true));
        linkedHashMap3.put("title", new l5.f(0, 1, "title", "TEXT", null, true));
        linkedHashMap3.put("orderIndex", new l5.f(0, 1, "orderIndex", "INTEGER", null, true));
        linkedHashMap3.put("createdAt", new l5.f(0, 1, "createdAt", "INTEGER", null, true));
        linkedHashMap3.put("updatedAt", new l5.f(0, 1, "updatedAt", "INTEGER", null, true));
        i iVar3 = new i("stacks", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        i a12 = h0.a(aVar, "stacks");
        if (!iVar3.equals(a12)) {
            return new l0(false, "stacks(com.daren.scraply.data.local.entity.StackEntity).\n Expected:\n" + iVar3 + "\n Found:\n" + a12);
        }
        return new l0(true, (String) null);
    }
}
