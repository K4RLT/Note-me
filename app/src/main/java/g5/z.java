package g5;
import c0.a;
import d0.a;
import d0.b;
import f.a;
import l.a;
import m.c;
import m.e;
import q.m;
import q.x;
import z.e;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.iw0;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class z extends iw0 {

    /* renamed from: c, reason: collision with root package name */
    public a f17549c;

    /* renamed from: d, reason: collision with root package name */
    public final List f17550d;
    public final z5.h e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a aVar, z5.h hVar) {
        super(20, 1);
        aVar.getClass();
        this.f17550d = aVar.e;
        this.f17549c = aVar;
        this.e = hVar;
    }

    @Override // com.google.android.gms.internal.ads.iw0
    public final void c(r5.c cVar) {
        Cursor r8 = cVar.r(new c7.a(7, "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'", false));
        try {
            boolean z3 = false;
            if (r8.moveToFirst()) {
                if (r8.getInt(0) == 0) {
                    z3 = true;
                }
            }
            r8.close();
            z5.h.f(cVar);
            if (!z3) {
                fa.l0 k3 = z5.h.k(cVar);
                if (!k3.f16896a) {
                    m(k3.f16897b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = cVar.f24554u;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
            List list = this.f17550d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).a(cVar);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                pa.a(r8, th);
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.iw0
    public final void d(r5.c cVar, int i, int i10) {
        f(cVar, i, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    @Override // com.google.android.gms.internal.ads.iw0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(r5.c r8) {
        /*
            r7 = this;
            android.database.sqlite.SQLiteDatabase r0 = r8.f24554u
            c7.a r1 = new c7.a
            r2 = 7
            r3 = 0
            java.lang.String r4 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            r1.<init>(r2, r4, r3)
            android.database.Cursor r1 = r8.r(r1)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            if (r2 == 0) goto L21
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L21
            r2 = 1
            goto L22
        L1e:
            r8 = move-exception
            goto Lb1
        L21:
            r2 = r3
        L22:
            r1.close()
            r1 = 0
            if (r2 == 0) goto L67
            c7.a r2 = new c7.a
            r4 = 7
            r5 = 0
            java.lang.String r6 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r2.<init>(r4, r6, r5)
            android.database.Cursor r2 = r8.r(r2)
            boolean r4 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L40
            if (r4 == 0) goto L42
            java.lang.String r3 = r2.getString(r3)     // Catch: java.lang.Throwable -> L40
            goto L43
        L40:
            r8 = move-exception
            goto L61
        L42:
            r3 = r1
        L43:
            r2.close()
            java.lang.String r2 = "7d73d21f1bd82c9e5268b6dcf9fde2cb"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L79
            java.lang.String r2 = "3071c8717539de5d5353f4c8cd59a032"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L57
            goto L79
        L57:
            java.lang.String r8 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 7d73d21f1bd82c9e5268b6dcf9fde2cb, found: "
            java.lang.String r8 = g3.a.k(r8, r3)
            x.o(r8)
            return
        L61:
            throw r8     // Catch: java.lang.Throwable -> L62
        L62:
            r0 = move-exception
            pa.a(r2, r8)
            throw r0
        L67:
            fa.l0 r2 = z5.h.k(r8)
            boolean r3 = r2.f16896a
            if (r3 == 0) goto La9
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r0.execSQL(r2)
            java.lang.String r2 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')"
            r0.execSQL(r2)
        L79:
            z5.h r2 = r7.e
            java.lang.Object r2 = r2.f31922v
            androidx.work.impl.WorkDatabase_Impl r2 = (androidx.work.impl.WorkDatabase_Impl) r2
            java.lang.String r3 = "PRAGMA foreign_keys = ON"
            r0.execSQL(r3)
            s5.a r0 = new s5.a
            r0.<init>(r8)
            r2.s(r0)
            java.util.List r0 = r7.f17550d
            if (r0 == 0) goto La6
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L96:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La6
            java.lang.Object r2 = r0.next()
            g5.s r2 = (g5.s) r2
            r2.b(r8)
            goto L96
        La6:
            r7.f17549c = r1
            return
        La9:
            java.lang.String r8 = "Pre-packaged database has an invalid schema: "
            java.lang.String r0 = r2.f16897b
            g5.m(r0, r8)
            return
        Lb1:
            throw r8     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r0 = move-exception
            pa.a(r1, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.e(r5.c):void");
    }

    @Override // com.google.android.gms.internal.ads.iw0
    public final void f(r5.c cVar, int i, int i10) {
        SQLiteDatabase sQLiteDatabase = cVar.f24554u;
        a aVar = this.f17549c;
        if (aVar != null) {
            z5.h hVar = aVar.f17401d;
            hVar.getClass();
            List<j5.a> a10 = ya.a(hVar, i, i10);
            if (a10 != null) {
                ya.a(new s5.a(cVar));
                for (j5.a aVar2 : a10) {
                    aVar2.getClass();
                    aVar2.a(cVar);
                }
                fa.l0 k3 = z5.h.k(cVar);
                if (k3.f16896a) {
                    sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
                    return;
                } else {
                    m(k3.f16897b, "Migration didn't properly handle: ");
                    return;
                }
            }
        }
        a aVar3 = this.f17549c;
        if (aVar3 != null && !ya.b(aVar3, i, i10)) {
            if (aVar3.f17414s) {
                Cursor r8 = cVar.r(new c7.a(7, "SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'", false));
                try {
                    re.b e = qe.e();
                    while (r8.moveToNext()) {
                        String string = r8.getString(0);
                        string.getClass();
                        if (!string.startsWith("sqlite_") && !string.equals("android_metadata")) {
                            e.add(new pe.j(string, Boolean.valueOf(kotlin.jvm.internal.a(r8.getString(1), "view"))));
                        }
                    }
                    re.b c10 = qe.c(e);
                    r8.close();
                    ListIterator listIterator = c10.listIterator(0);
                    while (true) {
                        b1.c0 c0Var = (b1.c0) listIterator;
                        if (!c0Var.hasNext()) {
                            break;
                        }
                        pe.j jVar = (pe.j) c0Var.next();
                        String str = (String) jVar.f22693u;
                        if (((Boolean) jVar.f22694v).booleanValue()) {
                            sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
                        } else {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                        }
                    }
                } finally {
                }
            } else {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Dependency`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkTag`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkName`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Preference`");
            }
            List list = this.f17550d;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((s) it.next()).getClass();
                }
            }
            z5.h.f(cVar);
            return;
        }
        x.o(g3.a.j("A migration from ", i, " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.", i10));
    }

    @Override // com.google.android.gms.internal.ads.iw0
    public final void b(r5.c cVar) {
    }
}
