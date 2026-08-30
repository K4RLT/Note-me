package g5;
import d0.a;
import d0.b;
import m.c;
import m.e;
import m.j;
import q.x;

import android.content.Context;
import android.content.Intent;
import androidx.datastore.preferences.protobuf.s1;
import com.google.android.gms.internal.ads.is0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import ya.n9;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17506a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17507b;

    /* renamed from: c, reason: collision with root package name */
    public final a f17508c;

    /* renamed from: d, reason: collision with root package name */
    public final c4.g f17509d;
    public final List e;

    /* renamed from: f, reason: collision with root package name */
    public final i5.b f17510f;

    /* renamed from: g, reason: collision with root package name */
    public final q5.b f17511g;

    /* renamed from: h, reason: collision with root package name */
    public r5.c f17512h;

    public p(a aVar, c4.g gVar, u uVar) {
        int i;
        i5.b fVar;
        t tVar = aVar.f17403g;
        q5.a aVar2 = aVar.f17400c;
        p5.b bVar = aVar.f17415t;
        String str = aVar.f17399b;
        this.f17508c = aVar;
        this.f17509d = gVar;
        List list = aVar.e;
        this.e = list == null ? qe.s.f24023u : list;
        if (bVar == null) {
            if (aVar2 != null) {
                Context context = aVar.f17398a;
                context.getClass();
                q5.b c10 = aVar2.c(new is0(context, str, new o(this, gVar.f3833a), false, false));
                this.f17511g = c10;
                this.f17510f = new i5.s(new k6.i(c10), str == null ? ":memory:" : str, uVar);
            } else {
                x.n("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
        } else {
            this.f17511g = null;
            if (bVar.o()) {
                fVar = new i5.s(new gw(this, bVar), str == null ? ":memory:" : str, uVar);
            } else if (str == null) {
                fVar = new i5.f(new gw(this, bVar));
            } else {
                gw gwVar = new gw(this, bVar);
                int ordinal = tVar.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i = 4;
                    } else {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + tVar + '\'').toString());
                    }
                } else {
                    i = 1;
                }
                int ordinal2 = tVar.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + tVar + '\'').toString());
                }
                fVar = new i5.f(gwVar, str, i);
            }
            this.f17510f = fVar;
        }
        boolean z3 = tVar == t.f17532w;
        q5.b bVar2 = this.f17511g;
        if (bVar2 != null) {
            bVar2.setWriteAheadLoggingEnabled(z3);
        }
    }

    public static final void a(p pVar, p5.a aVar) {
        Object kVar;
        c4.g gVar = pVar.f17509d;
        b(aVar);
        a aVar2 = pVar.f17508c;
        t tVar = aVar2.f17403g;
        t tVar2 = t.f17532w;
        if (tVar == tVar2) {
            n9.a(aVar, "PRAGMA journal_mode = WAL");
        } else {
            n9.a(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aVar2.f17403g == tVar2) {
            n9.a(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            n9.a(aVar, "PRAGMA synchronous = FULL");
        }
        p5.c T = aVar.T("PRAGMA user_version");
        try {
            T.P();
            int i = (int) T.getLong(0);
            ug.a.b(T, null);
            int i10 = gVar.f3833a;
            if (i != i10) {
                n9.a(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        pVar.c(aVar);
                    } else {
                        pVar.d(aVar, i, i10);
                    }
                    n9.a(aVar, "PRAGMA user_version = " + i10);
                    kVar = pe.z.f22715a;
                } catch (Throwable th) {
                    kVar = new pe.k(th);
                }
                if (!(kVar instanceof pe.k)) {
                    n9.a(aVar, "END TRANSACTION");
                }
                Throwable a10 = pe.a(kVar);
                if (a10 != null) {
                    n9.a(aVar, "ROLLBACK TRANSACTION");
                    throw a10;
                }
            }
            pVar.e(aVar);
        } finally {
        }
    }

    public static void b(p5.a aVar) {
        p5.c T = aVar.T("PRAGMA busy_timeout");
        try {
            T.P();
            long j10 = T.getLong(0);
            ug.a.b(T, null);
            if (j10 < 3000) {
                n9.a(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ug.a.b(T, th);
                throw th2;
            }
        }
    }

    public final void c(p5.a aVar) {
        aVar.getClass();
        p5.c T = aVar.T("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z3 = false;
            if (T.P()) {
                if (T.getLong(0) == 0) {
                    z3 = true;
                }
            }
            ug.a.b(T, null);
            c4.g gVar = this.f17509d;
            gVar.a(aVar);
            if (!z3) {
                fa.l0 g8 = gVar.g(aVar);
                if (!g8.f16896a) {
                    s1.j(g8.f16897b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            n9.a(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            n9.a(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) gVar.f3834b) + "')");
            gVar.c(aVar);
            for (s sVar : this.e) {
                sVar.getClass();
                if (aVar instanceof s5.a) {
                    sVar.a(((s5.a) aVar).f24910u);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ug.a.b(T, th);
                throw th2;
            }
        }
    }

    public final void d(p5.a aVar, int i, int i10) {
        aVar.getClass();
        a aVar2 = this.f17508c;
        List<j5.a> a10 = ya.a(aVar2.f17401d, i, i10);
        c4.g gVar = this.f17509d;
        if (a10 != null) {
            gVar.f(aVar);
            for (j5.a aVar3 : a10) {
                aVar3.getClass();
                if (aVar instanceof s5.a) {
                    aVar3.a(((s5.a) aVar).f24910u);
                } else {
                    throw new Error("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                }
            }
            fa.l0 g8 = gVar.g(aVar);
            if (g8.f16896a) {
                gVar.e(aVar);
                n9.a(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                n9.a(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) gVar.f3834b) + "')");
                return;
            }
            s1.j(g8.f16897b, "Migration didn't properly handle: ");
            return;
        }
        if (!ya.b(aVar2, i, i10)) {
            if (aVar2.f17414s) {
                p5.c T = aVar.T("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                try {
                    re.b e = qe.e();
                    while (T.P()) {
                        String D = T.D(0);
                        if (!mf.j(D, "sqlite_") && !D.equals("android_metadata")) {
                            e.add(new pe.j(D, Boolean.valueOf(kotlin.jvm.internal.a(T.D(1), "view"))));
                        }
                    }
                    re.b c10 = qe.c(e);
                    ug.a.b(T, null);
                    ListIterator listIterator = c10.listIterator(0);
                    while (true) {
                        b1.c0 c0Var = (b1.c0) listIterator;
                        if (!c0Var.hasNext()) {
                            break;
                        }
                        pe.j jVar = (pe.j) c0Var.next();
                        String str = (String) jVar.f22693u;
                        if (((Boolean) jVar.f22694v).booleanValue()) {
                            n9.a(aVar, "DROP VIEW IF EXISTS `" + str + '`');
                        } else {
                            n9.a(aVar, "DROP TABLE IF EXISTS `" + str + '`');
                        }
                    }
                } finally {
                }
            } else {
                gVar.b(aVar);
            }
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((s) it.next()).getClass();
                if (aVar instanceof s5.a) {
                    ((s5.a) aVar).f24910u.getClass();
                }
            }
            gVar.a(aVar);
            return;
        }
        throw new IllegalStateException(("A migration from " + i + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(p5.a r10) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.e(p5.a):void");
    }

    public p(a aVar, a1.f fVar, u uVar) {
        t tVar = aVar.f17403g;
        this.f17508c = aVar;
        this.f17509d = new c4.g("", -1, "");
        List list = aVar.e;
        qe.s sVar = qe.s.f24023u;
        this.e = list == null ? sVar : list;
        ArrayList F = qe.l.F(list == null ? sVar : list, new b6.b(new a1.f(11, this)));
        Context context = aVar.f17398a;
        String str = aVar.f17399b;
        q5.a aVar2 = aVar.f17400c;
        z5.h hVar = aVar.f17401d;
        boolean z3 = aVar.f17402f;
        Executor executor = aVar.f17404h;
        Executor executor2 = aVar.i;
        Intent intent = aVar.f17405j;
        boolean z9 = aVar.f17406k;
        boolean z10 = aVar.f17407l;
        Set set = aVar.f17408m;
        String str2 = aVar.f17409n;
        File file = aVar.f17410o;
        Callable callable = aVar.f17411p;
        List list2 = aVar.f17412q;
        List list3 = aVar.f17413r;
        boolean z11 = aVar.f17414s;
        p5.b bVar = aVar.f17415t;
        te.g gVar = aVar.f17416u;
        context.getClass();
        hVar.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        a aVar3 = new a(context, str, aVar2, hVar, F, z3, tVar, executor, executor2, intent, z9, z10, set, str2, file, callable, list2, list3, z11, bVar, gVar);
        aVar3.f17417v = aVar.f17417v;
        q5.b bVar2 = (q5.b) fVar.invoke(aVar3);
        this.f17511g = bVar2;
        k6.i iVar = new k6.i(bVar2);
        String str3 = aVar.f17399b;
        this.f17510f = new i5.s(iVar, str3 == null ? ":memory:" : str3, uVar);
        boolean z12 = tVar == t.f17532w;
        if (bVar2 != null) {
            bVar2.setWriteAheadLoggingEnabled(z12);
        }
    }
}
