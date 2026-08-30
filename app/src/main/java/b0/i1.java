package b0;
import b0.g1;
import b0.m0;
import w.a;

import android.os.Trace;
import java.util.List;

/* loaded from: classes.dex */
public final class i1 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1203a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1204b;

    /* renamed from: c, reason: collision with root package name */
    public final j6.i f1205c;

    /* renamed from: d, reason: collision with root package name */
    public z1.i1 f1206d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1207f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1208g;

    /* renamed from: h, reason: collision with root package name */
    public g1 f1209h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public long f1210j;

    /* renamed from: k, reason: collision with root package name */
    public long f1211k;

    /* renamed from: l, reason: collision with root package name */
    public long f1212l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ra.e f1213m;

    public i1(ra.e eVar, int i, long j10, j6.i iVar) {
        this.f1213m = eVar;
        this.f1203a = i;
        this.f1204b = j10;
        this.f1205c = iVar;
        int i10 = nf.i.f21355b;
        this.f1212l = System.nanoTime() - nf.i.f21354a;
    }

    @Override // m0
    public final void a() {
        this.i = true;
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [kotlin.jvm.internal.m, df.l] */
    public final boolean b(a aVar) {
        long j10;
        long j11;
        long j12;
        boolean z3;
        boolean z9;
        long j13;
        long j14 = aVar.f1139v;
        ra.e eVar = this.f1213m;
        z zVar = (z) ((w) eVar.f24675v).f1272b.invoke();
        if (!this.f1207f) {
            int a10 = zVar.a();
            int i = this.f1203a;
            if (i >= 0 && i < a10) {
                Object c10 = zVar.c(i);
                this.f1210j = Math.max(0L, j14 - System.nanoTime());
                int i10 = nf.i.f21355b;
                this.f1212l = System.nanoTime() - nf.i.f21354a;
                this.f1211k = 0L;
                z1.i1 i1Var = this.f1206d;
                j6.i iVar = this.f1205c;
                if (i1Var != null) {
                    j11 = j14;
                    j10 = 0;
                } else {
                    j10 = 0;
                    long j15 = this.f1210j;
                    long j16 = iVar.e(c10).f1160a;
                    if ((!this.i || j15 <= 0) && j16 >= j15) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:compose");
                    try {
                        if (this.f1206d != null) {
                            a.a("Request was already composed!");
                        }
                        Object b10 = zVar.b(i);
                        this.f1206d = ((z1.k1) eVar.f24676w).a().f(((w) eVar.f24675v).a(b10, i, c10), b10);
                        Trace.endSection();
                        d();
                        long j17 = this.f1211k;
                        c cVar = (c) iVar.f18924u;
                        long j18 = cVar.f1160a;
                        if (j18 == 0) {
                            j11 = j14;
                            j12 = j17;
                        } else {
                            long j19 = 4;
                            j11 = j14;
                            j12 = (j17 / j19) + ((j18 / j19) * 3);
                            cVar = cVar;
                        }
                        cVar.f1160a = j12;
                        c e = iVar.e(c10);
                        long j20 = e.f1160a;
                        if (j20 != 0) {
                            long j21 = 4;
                            j17 = (j17 / j21) + ((j20 / j21) * 3);
                        }
                        e.f1160a = j17;
                    } finally {
                    }
                }
                if (!this.i) {
                    if (!this.f1208g) {
                        if (this.f1210j <= j10) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.f1209h = c();
                            this.f1208g = true;
                        } finally {
                        }
                    }
                    g1 g1Var = this.f1209h;
                    if (g1Var != null) {
                        List[] listArr = (List[]) g1Var.f1191x;
                        int i11 = g1Var.f1188u;
                        List list = (List) g1Var.f1190w;
                        if (i11 < list.size()) {
                            if (((i1) g1Var.f1192y).f1207f) {
                                a.c("Should not execute nested prefetch on canceled request");
                            }
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (g1Var.f1188u < list.size()) {
                                try {
                                    if (listArr[g1Var.f1188u] == null) {
                                        long j22 = j10;
                                        if (Math.max(j22, j11 - System.nanoTime()) <= j22) {
                                            return true;
                                        }
                                        int i12 = g1Var.f1188u;
                                        n0 n0Var = (n0) list.get(i12);
                                        Object r8 = n0Var.f1234a;
                                        l0 l0Var = new l0(n0Var);
                                        r8.invoke(l0Var);
                                        listArr[i12] = l0Var.f1226a;
                                    }
                                    List list2 = listArr[g1Var.f1188u];
                                    list2.getClass();
                                    while (g1Var.f1189v < list2.size()) {
                                        if (((i1) list2.get(g1Var.f1189v)).b(aVar)) {
                                            return true;
                                        }
                                        g1Var.f1189v++;
                                    }
                                    g1Var.f1189v = 0;
                                    g1Var.f1188u++;
                                    j10 = 0;
                                } finally {
                                }
                            }
                        }
                    }
                    d();
                }
                if (!this.e) {
                    long j23 = this.f1204b;
                    int i13 = (int) (3 & j23);
                    int i14 = (((i13 & 2) >> 1) * 3) + ((i13 & 1) << 1);
                    int i15 = (((int) (j23 >> 33)) & ((1 << (i14 + 13)) - 1)) - 1;
                    int i16 = (((1 << (18 - i14)) - 1) & ((int) (j23 >> (i14 + 46)))) - 1;
                    if (i15 == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i16 == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!(z9 | z3)) {
                        long j24 = this.f1210j;
                        long j25 = iVar.e(c10).f1161b;
                        if ((!this.i || j24 <= 0) && j25 >= j24) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            if (this.f1207f) {
                                a.a("Callers should check whether the request is still valid before calling performMeasure()");
                            }
                            if (this.e) {
                                a.a("Request was already measured!");
                            }
                            this.e = true;
                            z1.i1 i1Var2 = this.f1206d;
                            if (i1Var2 != null) {
                                int b11 = i1Var2.b();
                                for (int i17 = 0; i17 < b11; i17++) {
                                    i1Var2.d(i17, j23);
                                }
                            } else {
                                a.b("performComposition() must be called before performMeasure()");
                                l4.a.p();
                            }
                            Trace.endSection();
                            d();
                            long j26 = this.f1211k;
                            c cVar2 = (c) iVar.f18924u;
                            long j27 = cVar2.f1161b;
                            if (j27 == 0) {
                                j13 = j26;
                            } else {
                                long j28 = 4;
                                j13 = (j26 / j28) + ((j27 / j28) * 3);
                            }
                            cVar2.f1161b = j13;
                            c e8 = iVar.e(c10);
                            long j29 = e8.f1161b;
                            if (j29 != 0) {
                                long j30 = 4;
                                j26 = (j26 / j30) + ((j29 / j30) * 3);
                            }
                            e8.f1161b = j26;
                            return false;
                        } finally {
                        }
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r1v1, types: [g1, java.lang.Object] */
    public final g1 c() {
        z1.i1 i1Var = this.f1206d;
        if (i1Var != null) {
            Object obj = new Object();
            i1Var.c(new h1(obj, 0));
            List list = (List) obj.f19787u;
            if (list != null) {
                Object obj2 = new Object();
                obj2.f1192y = this;
                obj2.f1190w = list;
                obj2.f1191x = new List[list.size()];
                if (list.isEmpty()) {
                    a.a("NestedPrefetchController shouldn't be created with no states");
                }
                return obj2;
            }
            return null;
        }
        a.b("Should precompose before resolving nested prefetch states");
        l4.a.p();
        return null;
    }

    @Override // m0
    public final void cancel() {
        if (!this.f1207f) {
            this.f1207f = true;
            z1.i1 i1Var = this.f1206d;
            if (i1Var != null) {
                i1Var.a();
            }
            this.f1206d = null;
        }
    }

    public final void d() {
        long j10;
        long j11;
        long j12;
        int i = nf.i.f21355b;
        long nanoTime = System.nanoTime() - nf.i.f21354a;
        long j13 = this.f1212l;
        long j14 = Long.MAX_VALUE;
        long j15 = 0;
        if (((j13 - 1) | 1) == Long.MAX_VALUE) {
            if (nanoTime == j13) {
                nf.a aVar = nf.b.f21330v;
            } else {
                if (j13 < 0) {
                    j12 = nf.b.f21332x;
                } else {
                    j12 = nf.b.f21331w;
                }
                j15 = nf.b.h(j12);
            }
        } else if ((1 | (nanoTime - 1)) == Long.MAX_VALUE) {
            if (nanoTime < 0) {
                j11 = nf.b.f21332x;
            } else {
                j11 = nf.b.f21331w;
            }
            j15 = j11;
        } else {
            long j16 = nanoTime - j13;
            long j17 = (j16 ^ nanoTime) & (~(j16 ^ j13));
            nf.d dVar = nf.d.NANOSECONDS;
            if (j17 < 0) {
                nf.d dVar2 = nf.d.MILLISECONDS;
                if (dVar.compareTo(dVar2) < 0) {
                    long j18 = (nanoTime / 1000000) - (j13 / 1000000);
                    long j19 = (nanoTime % 1000000) - (j13 % 1000000);
                    nf.a aVar2 = nf.b.f21330v;
                    j15 = nf.b.f(nf.f.j(j18, dVar2), nf.f.j(j19, dVar));
                } else {
                    if (j16 < 0) {
                        j10 = nf.b.f21332x;
                    } else {
                        j10 = nf.b.f21331w;
                    }
                    j15 = nf.b.h(j10);
                }
            } else {
                j15 = nf.f.j(j16, dVar);
            }
        }
        long j20 = j15 >> 1;
        nf.a aVar3 = nf.b.f21330v;
        if ((1 & ((int) j15)) == 0) {
            j14 = j20;
        } else if (j20 <= 9223372036854L) {
            if (j20 < -9223372036854L) {
                j14 = Long.MIN_VALUE;
            } else {
                j14 = j20 * 1000000;
            }
        }
        this.f1211k = j14;
        this.f1210j -= j14;
        this.f1212l = nanoTime;
    }

    public final String toString() {
        boolean z3;
        StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
        sb2.append(this.f1203a);
        sb2.append(", constraints = ");
        sb2.append((Object) y2.a.k(this.f1204b));
        sb2.append(", isComposed = ");
        if (this.f1206d != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        sb2.append(z3);
        sb2.append(", isMeasured = ");
        sb2.append(this.e);
        sb2.append(", isCanceled = ");
        sb2.append(this.f1207f);
        sb2.append(" }");
        return sb2.toString();
    }
}