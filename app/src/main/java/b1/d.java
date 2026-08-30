package b1;
import n.j0;
import p.b;
import p.e;
import p.l;
import p.r;
import p.s;
import p.u;

import java.util.ArrayList;
import java.util.HashMap;
import n.q0;
import r0.n1;

/* loaded from: classes.dex */
public class d extends i {

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f1320n = new int[0];
    public final df.l e;

    /* renamed from: f, reason: collision with root package name */
    public final df.l f1321f;

    /* renamed from: g, reason: collision with root package name */
    public int f1322g;

    /* renamed from: h, reason: collision with root package name */
    public j0 f1323h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public m f1324j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f1325k;

    /* renamed from: l, reason: collision with root package name */
    public int f1326l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1327m;

    public d(long j10, m mVar, df.l lVar, df.l lVar2) {
        super(j10, mVar);
        this.e = lVar;
        this.f1321f = lVar2;
        this.f1324j = m.f1366y;
        this.f1325k = f1320n;
        this.f1326l = 1;
    }

    public final void A(long j10) {
        synchronized (p.f1387c) {
            this.f1324j = this.f1324j.n(j10);
        }
    }

    public void B(j0 j0Var) {
        this.f1323h = j0Var;
    }

    public d C(df.l lVar, df.l lVar2) {
        if (this.f1347c) {
            n1.a("Cannot use a disposed snapshot");
        }
        if (this.f1327m && this.f1348d < 0) {
            n1.b("Unsupported operation on a disposed or applied snapshot");
        }
        A(g());
        Object obj = p.f1387c;
        synchronized (obj) {
            try {
                long j10 = e;
                long j11 = 1;
                e = j10 + j11;
                p.f1388d = p.f1388d.n(j10);
                m d2 = d();
                r(d2.n(j10));
                try {
                    e eVar = new e(j10, e(d2, g() + j11, j10), l(lVar, e(), true), b(lVar2, i()), this);
                    if (!this.f1327m && !this.f1347c) {
                        long g8 = g();
                        synchronized (obj) {
                            long j12 = e;
                            e = j12 + j11;
                            s(j12);
                            p.f1388d = p.f1388d.n(g());
                        }
                        r(e(d(), g8 + j11, g()));
                        return eVar;
                    }
                    return eVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // b1.i
    public final void b() {
        p.f1388d = p.f1388d.b(g()).a(this.f1324j);
    }

    @Override // b1.i
    public void c() {
        if (!this.f1347c) {
            this.f1347c = true;
            synchronized (p.f1387c) {
                o();
            }
            l();
        }
    }

    @Override // b1.i
    public boolean f() {
        return false;
    }

    @Override // b1.i
    public int h() {
        return this.f1322g;
    }

    @Override // b1.i
    public df.l i() {
        return this.f1321f;
    }

    @Override // b1.i
    public void k() {
        this.f1326l++;
    }

    @Override // b1.i
    public void l() {
        if (this.f1326l <= 0) {
            n1.a("no pending nested snapshots");
        }
        int i = this.f1326l - 1;
        this.f1326l = i;
        if (i == 0 && !this.f1327m) {
            j0 x9 = x();
            if (x9 != null) {
                if (this.f1327m) {
                    n1.b("Unsupported operation on a snapshot that has been applied");
                }
                B(null);
                long g8 = g();
                Object[] objArr = x9.f20899b;
                long[] jArr = x9.f20898a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j10 = jArr[i10];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j10) < 128) {
                                    for (j0 b10 = ((h0) objArr[(i10 << 3) + i12]).b(); b10 != null; b10 = b10.f1351b) {
                                        long j11 = b10.f1350a;
                                        if (j11 == g8 || qe.l.s(this.f1324j, Long.valueOf(j11))) {
                                            a1.j jVar = p.f1385a;
                                            b10.f1350a = 0L;
                                        }
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            a();
        }
    }

    @Override // b1.i
    public void m() {
        if (!this.f1327m && !this.f1347c) {
            v();
        }
    }

    @Override // b1.i
    public void n(h0 h0Var) {
        j0 x9 = x();
        if (x9 == null) {
            int i = q0.f20928a;
            x9 = new j0();
            B(x9);
        }
        x9.a(h0Var);
    }

    @Override // b1.i
    public final void p() {
        int length = this.f1325k.length;
        for (int i = 0; i < length; i++) {
            u(this.f1325k[i]);
        }
        o();
    }

    @Override // b1.i
    public void t(int i) {
        this.f1322g = i;
    }

    @Override // b1.i
    public i u(df.l lVar) {
        if (this.f1347c) {
            n1.a("Cannot use a disposed snapshot");
        }
        if (this.f1327m && this.f1348d < 0) {
            n1.b("Unsupported operation on a disposed or applied snapshot");
        }
        long g8 = g();
        A(g());
        Object obj = p.f1387c;
        synchronized (obj) {
            try {
                long j10 = e;
                long j11 = 1;
                e = j10 + j11;
                p.f1388d = p.f1388d.n(j10);
                try {
                    f fVar = new f(j10, e(d(), g8 + j11, j10), l(lVar, e(), true), this);
                    if (!this.f1327m && !this.f1347c) {
                        long g10 = g();
                        synchronized (obj) {
                            long j12 = e;
                            e = j12 + j11;
                            s(j12);
                            p.f1388d = p.f1388d.n(g());
                        }
                        r(e(d(), g10 + j11, g()));
                        return fVar;
                    }
                    return fVar;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void v() {
        long j10;
        A(g());
        if (!this.f1327m && !this.f1347c) {
            long g8 = g();
            synchronized (p.f1387c) {
                long j11 = e;
                j10 = 1;
                e = j11 + j10;
                s(j11);
                p.f1388d = p.f1388d.n(g());
            }
            r(e(d(), g8 + j10, g()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b1 A[LOOP:1: B:31:0x00af->B:32:0x00b1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:37:0x00c0, B:39:0x00d0, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00f8, B:50:0x0106, B:56:0x0117, B:59:0x0121, B:61:0x012b, B:63:0x0135, B:65:0x013b, B:67:0x0145, B:73:0x014d, B:75:0x0150, B:77:0x0154, B:79:0x015b, B:81:0x0167, B:87:0x010e), top: B:36:0x00c0 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154 A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:37:0x00c0, B:39:0x00d0, B:42:0x00dc, B:44:0x00e8, B:46:0x00f2, B:48:0x00f8, B:50:0x0106, B:56:0x0117, B:59:0x0121, B:61:0x012b, B:63:0x0135, B:65:0x013b, B:67:0x0145, B:73:0x014d, B:75:0x0150, B:77:0x0154, B:79:0x015b, B:81:0x0167, B:87:0x010e), top: B:36:0x00c0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b1.w w() {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b1.d.w():b1.w");
    }

    public j0 x() {
        return this.f1323h;
    }

    @Override // b1.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public df.l e() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [b1.w, java.lang.Object] */
    public final w z(long j10, j0 j0Var, HashMap hashMap, m mVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        m mVar2;
        Object[] objArr;
        long[] jArr;
        m mVar3;
        Object[] objArr2;
        long[] jArr2;
        int i;
        long j11;
        ArrayList arrayList4;
        j0 g8;
        pe.j jVar;
        ArrayList arrayList5;
        m k3 = d().n(g()).k(this.f1324j);
        Object[] objArr3 = j0Var.f20899b;
        long[] jArr3 = j0Var.f20898a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i10 = 0;
            arrayList3 = null;
            arrayList2 = null;
            while (true) {
                long j12 = jArr3[i10];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j12 & 255) < 128) {
                            objArr2 = objArr3;
                            h0 h0Var = (h0) objArr3[(i10 << 3) + i12];
                            jArr2 = jArr3;
                            j0 b10 = h0Var.b();
                            i = i12;
                            ArrayList arrayList6 = arrayList3;
                            j0 s10 = s(b10, j10, mVar);
                            if (s10 == null) {
                                mVar3 = k3;
                                arrayList4 = arrayList2;
                                j11 = j12;
                            } else {
                                arrayList4 = arrayList2;
                                j11 = j12;
                                j0 s11 = s(b10, g(), k3);
                                if (s11 == null) {
                                    mVar3 = k3;
                                } else {
                                    mVar3 = k3;
                                    if (s11.f1350a != 1 && !s10.equals(s11)) {
                                        j0 s12 = s(b10, g(), d());
                                        if (s12 != null) {
                                            if (hashMap == null || (g8 = (j0) hashMap.get(s10)) == null) {
                                                g8 = h0Var.g(s11, s10, s12);
                                            }
                                            if (g8 == null) {
                                                return new Object();
                                            }
                                            if (!g8.equals(s12)) {
                                                if (g8.equals(s10)) {
                                                    if (arrayList6 == null) {
                                                        arrayList5 = new ArrayList();
                                                    } else {
                                                        arrayList5 = arrayList6;
                                                    }
                                                    arrayList5.add(new pe.j(h0Var, s10.b(g())));
                                                    if (arrayList4 == null) {
                                                        arrayList2 = new ArrayList();
                                                    } else {
                                                        arrayList2 = arrayList4;
                                                    }
                                                    arrayList2.add(h0Var);
                                                    arrayList3 = arrayList5;
                                                } else {
                                                    if (arrayList6 == null) {
                                                        arrayList3 = new ArrayList();
                                                    } else {
                                                        arrayList3 = arrayList6;
                                                    }
                                                    if (!g8.equals(s11)) {
                                                        jVar = new pe.j(h0Var, g8);
                                                    } else {
                                                        jVar = new pe.j(h0Var, s11.b(g()));
                                                    }
                                                    arrayList3.add(jVar);
                                                    arrayList2 = arrayList4;
                                                }
                                            }
                                        } else {
                                            r();
                                            throw null;
                                        }
                                    }
                                }
                            }
                            arrayList3 = arrayList6;
                            arrayList2 = arrayList4;
                        } else {
                            mVar3 = k3;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i = i12;
                            j11 = j12;
                        }
                        j12 = j11 >> 8;
                        i12 = i + 1;
                        jArr3 = jArr2;
                        objArr3 = objArr2;
                        k3 = mVar3;
                    }
                    mVar2 = k3;
                    objArr = objArr3;
                    jArr = jArr3;
                    if (i11 != 8) {
                        break;
                    }
                } else {
                    mVar2 = k3;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                if (i10 != length) {
                    i10++;
                    jArr3 = jArr;
                    objArr3 = objArr;
                    k3 = mVar2;
                } else {
                    arrayList = arrayList3;
                    break;
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        arrayList3 = arrayList;
        if (arrayList3 != null) {
            v();
            int size = arrayList3.size();
            for (int i13 = 0; i13 < size; i13++) {
                pe.j jVar2 = (pe.j) arrayList3.get(i13);
                h0 h0Var2 = (h0) jVar2.f22693u;
                j0 j0Var2 = (j0) jVar2.f22694v;
                j0Var2.f1350a = j10;
                synchronized (p.f1387c) {
                    j0Var2.f1351b = h0Var2.b();
                    h0Var2.a(j0Var2);
                }
            }
        }
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                j0Var.l((h0) arrayList2.get(i14));
            }
            ArrayList arrayList7 = this.i;
            if (arrayList7 != null) {
                arrayList2 = qe.l.E(arrayList7, arrayList2);
            }
            this.i = arrayList2;
        }
        return k.f1352c;
    }
}
