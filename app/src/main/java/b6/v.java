package b6;
import a.a;
import m.a;
import q.d;
import q.f;
import v.e;

import android.content.Context;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import g5.a0;
import java.util.ArrayList;
import java.util.LinkedList;
import ya.c0;

/* loaded from: classes.dex */
public final class v implements Runnable {
    public static final String M = a6.f("WorkerWrapper");
    public final a6.a B;
    public final a6.r C;
    public final h D;
    public final WorkDatabase E;
    public final j6.q F;
    public final j6.c G;
    public final ArrayList H;
    public String I;

    /* renamed from: u, reason: collision with root package name */
    public final Context f1787u;

    /* renamed from: v, reason: collision with root package name */
    public final String f1788v;

    /* renamed from: w, reason: collision with root package name */
    public final ra.e f1789w;

    /* renamed from: x, reason: collision with root package name */
    public final j6.p f1790x;

    /* renamed from: y, reason: collision with root package name */
    public a6.p f1791y;

    /* renamed from: z, reason: collision with root package name */
    public final m6.b f1792z;
    public a6.o A = new a6.l();
    public final l6.j J = new Object();
    public final l6.j K = new Object();
    public volatile int L = -256;

    /* JADX WARN: Type inference failed for: r0v1, types: [l6.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l6.j, java.lang.Object] */
    public v(u uVar) {
        this.f1787u = (Context) uVar.f1781u;
        this.f1792z = (m6.b) uVar.f1783w;
        this.D = (h) uVar.f1782v;
        j6.p pVar = (j6.p) uVar.f1786z;
        this.f1790x = pVar;
        this.f1788v = pVar.f18944a;
        this.f1789w = (ra.e) uVar.B;
        this.f1791y = null;
        a6.a aVar = (a6.a) uVar.f1784x;
        this.B = aVar;
        this.C = aVar.f247c;
        WorkDatabase workDatabase = (WorkDatabase) uVar.f1785y;
        this.E = workDatabase;
        this.F = workDatabase.C();
        this.G = workDatabase.x();
        this.H = (ArrayList) uVar.A;
    }

    public final void a(a6.o oVar) {
        boolean z3;
        boolean z9 = oVar instanceof a6.n;
        j6.p pVar = this.f1790x;
        String str = M;
        if (z9) {
            a6.d().e(str, "Worker result SUCCESS for " + this.I);
            if (pVar.c()) {
                d();
                return;
            }
            j6.c cVar = this.G;
            String str2 = this.f1788v;
            j6.q qVar = this.F;
            WorkDatabase workDatabase = this.E;
            workDatabase.c();
            try {
                qVar.p(3, str2);
                qVar.o(str2, ((a6.n) this.A).f281a);
                this.C.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList b10 = cVar.b(str2);
                int size = b10.size();
                int i = 0;
                while (i < size) {
                    Object obj = b10.get(i);
                    i++;
                    String str3 = (String) obj;
                    if (qVar.g(str3) == 5) {
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) cVar.f18914v;
                        a0 k3 = a0.k(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                        if (str3 == null) {
                            k3.g(1);
                        } else {
                            k3.n(1, str3);
                        }
                        workDatabase_Impl.b();
                        Cursor d2 = c0.d(workDatabase_Impl, k3, false);
                        try {
                            if (d2.moveToFirst() && d2.getInt(0) != 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                a6.d().e(str, "Setting status to enqueued for " + str3);
                                qVar.p(1, str3);
                                qVar.n(currentTimeMillis, str3);
                            }
                        } finally {
                            d2.close();
                            k3.m();
                        }
                    }
                }
                workDatabase.v();
                workDatabase.h();
                e(false);
                return;
            } catch (Throwable th) {
                workDatabase.h();
                e(false);
                throw th;
            }
        }
        if (oVar instanceof a6.m) {
            a6.d().e(str, "Worker result RETRY for " + this.I);
            c();
            return;
        }
        a6.d().e(str, "Worker result FAILURE for " + this.I);
        if (pVar.c()) {
            d();
        } else {
            g();
        }
    }

    public final void b() {
        if (!h()) {
            this.E.c();
            try {
                int g8 = this.F.g(this.f1788v);
                j6.n B = this.E.B();
                String str = this.f1788v;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) B.f18938v;
                workDatabase_Impl.b();
                j6.h hVar = (j6.h) B.f18940x;
                r5.j a10 = hVar.a();
                if (str == null) {
                    a10.g(1);
                } else {
                    a10.n(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a10.f();
                    workDatabase_Impl.v();
                    if (g8 == 0) {
                        e(false);
                    } else if (g8 == 2) {
                        a(this.A);
                    } else if (!a5.a(g8)) {
                        this.L = -512;
                        c();
                    }
                    this.E.v();
                    this.E.h();
                } finally {
                    workDatabase_Impl.h();
                    hVar.f(a10);
                }
            } catch (Throwable th) {
                this.E.h();
                throw th;
            }
        }
    }

    public final void c() {
        String str = this.f1788v;
        j6.q qVar = this.F;
        WorkDatabase workDatabase = this.E;
        workDatabase.c();
        try {
            qVar.p(1, str);
            this.C.getClass();
            qVar.n(System.currentTimeMillis(), str);
            qVar.m(this.f1790x.f18963v, str);
            qVar.l(-1L, str);
            workDatabase.v();
        } finally {
            workDatabase.h();
            e(true);
        }
    }

    public final void d() {
        String str = this.f1788v;
        j6.q qVar = this.F;
        WorkDatabase workDatabase = this.E;
        workDatabase.c();
        try {
            this.C.getClass();
            qVar.n(System.currentTimeMillis(), str);
            WorkDatabase_Impl workDatabase_Impl = qVar.f18965a;
            qVar.p(1, str);
            workDatabase_Impl.b();
            j6.h hVar = qVar.f18972j;
            r5.j a10 = hVar.a();
            if (str == null) {
                a10.g(1);
            } else {
                a10.n(1, str);
            }
            workDatabase_Impl.c();
            try {
                a10.f();
                workDatabase_Impl.v();
                workDatabase_Impl.h();
                hVar.f(a10);
                qVar.m(this.f1790x.f18963v, str);
                workDatabase_Impl.b();
                j6.h hVar2 = qVar.f18969f;
                r5.j a11 = hVar2.a();
                if (str == null) {
                    a11.g(1);
                } else {
                    a11.n(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a11.f();
                    workDatabase_Impl.v();
                    workDatabase_Impl.h();
                    hVar2.f(a11);
                    qVar.l(-1L, str);
                    workDatabase.v();
                } catch (Throwable th) {
                    workDatabase_Impl.h();
                    hVar2.f(a11);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase_Impl.h();
                hVar.f(a10);
                throw th2;
            }
        } finally {
            workDatabase.h();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0005, B:10:0x0030, B:12:0x0038, B:14:0x0044, B:15:0x005d, B:22:0x0071, B:23:0x0077, B:5:0x001e, B:7:0x0025), top: B:2:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:3:0x0005, B:10:0x0030, B:12:0x0038, B:14:0x0044, B:15:0x005d, B:22:0x0071, B:23:0x0077, B:5:0x001e, B:7:0x0025), top: B:2:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.E
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.E     // Catch: java.lang.Throwable -> L40
            j6.q r0 = r0.C()     // Catch: java.lang.Throwable -> L40
            r0.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            g5.a0 r1 = g5.a0.k(r2, r1)     // Catch: java.lang.Throwable -> L40
            androidx.work.impl.WorkDatabase_Impl r0 = r0.f18965a     // Catch: java.lang.Throwable -> L40
            r0.b()     // Catch: java.lang.Throwable -> L40
            android.database.Cursor r0 = ya.c0.d(r0, r1, r2)     // Catch: java.lang.Throwable -> L40
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2d
            r4 = 1
            if (r3 == 0) goto L2f
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L2f
            r3 = r4
            goto L30
        L2d:
            r6 = move-exception
            goto L71
        L2f:
            r3 = r2
        L30:
            r0.close()     // Catch: java.lang.Throwable -> L40
            r1.m()     // Catch: java.lang.Throwable -> L40
            if (r3 != 0) goto L42
            android.content.Context r0 = r5.f1787u     // Catch: java.lang.Throwable -> L40
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            k6.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L40
            goto L42
        L40:
            r6 = move-exception
            goto L78
        L42:
            if (r6 == 0) goto L5d
            j6.q r0 = r5.F     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f1788v     // Catch: java.lang.Throwable -> L40
            r0.p(r4, r1)     // Catch: java.lang.Throwable -> L40
            j6.q r0 = r5.F     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f1788v     // Catch: java.lang.Throwable -> L40
            int r2 = r5.L     // Catch: java.lang.Throwable -> L40
            r0.q(r2, r1)     // Catch: java.lang.Throwable -> L40
            j6.q r0 = r5.F     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r5.f1788v     // Catch: java.lang.Throwable -> L40
            r2 = -1
            r0.l(r2, r1)     // Catch: java.lang.Throwable -> L40
        L5d:
            androidx.work.impl.WorkDatabase r0 = r5.E     // Catch: java.lang.Throwable -> L40
            r0.v()     // Catch: java.lang.Throwable -> L40
            androidx.work.impl.WorkDatabase r0 = r5.E
            r0.h()
            l6.j r0 = r5.J
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.j(r6)
            return
        L71:
            r0.close()     // Catch: java.lang.Throwable -> L40
            r1.m()     // Catch: java.lang.Throwable -> L40
            throw r6     // Catch: java.lang.Throwable -> L40
        L78:
            androidx.work.impl.WorkDatabase r0 = r5.E
            r0.h()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.e(boolean):void");
    }

    public final void f() {
        j6.q qVar = this.F;
        String str = this.f1788v;
        int g8 = qVar.g(str);
        String str2 = M;
        if (g8 == 2) {
            a6.d().a(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        a6.d().a(str2, "Status for " + str + " is " + a5.a.y(g8) + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.f1788v;
        WorkDatabase workDatabase = this.E;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                j6.q qVar = this.F;
                if (!isEmpty) {
                    String str2 = (String) linkedList.remove();
                    if (qVar.g(str2) != 6) {
                        qVar.p(4, str2);
                    }
                    linkedList.addAll(this.G.b(str2));
                } else {
                    a6.g gVar = ((a6.l) this.A).f280a;
                    qVar.m(this.f1790x.f18963v, str);
                    qVar.o(str, gVar);
                    workDatabase.v();
                    return;
                }
            }
        } finally {
            workDatabase.h();
            e(false);
        }
    }

    public final boolean h() {
        if (this.L == -256) {
            return false;
        }
        a6.d().a(M, "Work interrupted for " + this.I);
        if (this.F.g(this.f1788v) == 0) {
            e(false);
            return true;
        }
        e(!a5.a(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r8 != false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.work.WorkerParameters, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.v.run():void");
    }
}
