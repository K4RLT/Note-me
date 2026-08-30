package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class lt1 {

    /* renamed from: a, reason: collision with root package name */
    public final rx1 f8136a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8137b;

    /* renamed from: c, reason: collision with root package name */
    public final sy1[] f8138c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8139d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8140f;

    /* renamed from: g, reason: collision with root package name */
    public mt1 f8141g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8142h;
    public final boolean[] i;

    /* renamed from: j, reason: collision with root package name */
    public final zw1[] f8143j;

    /* renamed from: k, reason: collision with root package name */
    public final p f8144k;

    /* renamed from: l, reason: collision with root package name */
    public final ak0 f8145l;

    /* renamed from: m, reason: collision with root package name */
    public lt1 f8146m;

    /* renamed from: n, reason: collision with root package name */
    public zy1 f8147n;

    /* renamed from: o, reason: collision with root package name */
    public u f8148o;

    /* renamed from: p, reason: collision with root package name */
    public long f8149p;

    public lt1(zw1[] zw1VarArr, long j10, p pVar, w wVar, ak0 ak0Var, mt1 mt1Var, u uVar) {
        this.f8143j = zw1VarArr;
        this.f8149p = j10;
        this.f8144k = pVar;
        this.f8145l = ak0Var;
        yx1 yx1Var = mt1Var.f8413a;
        this.f8137b = yx1Var.f13003a;
        this.f8141g = mt1Var;
        this.f8147n = zy1.f13336d;
        this.f8148o = uVar;
        this.f8138c = new sy1[2];
        this.i = new boolean[2];
        long j11 = mt1Var.f8414b;
        ak0Var.getClass();
        int i = zt1.f13263k;
        Pair pair = (Pair) yx1Var.f13003a;
        Object obj = pair.first;
        yx1 a10 = yx1Var.a(pair.second);
        tt1 tt1Var = (tt1) ((HashMap) ak0Var.f4534z).get(obj);
        tt1Var.getClass();
        ((HashSet) ak0Var.C).add(tt1Var);
        st1 st1Var = (st1) ((HashMap) ak0Var.B).get(tt1Var);
        if (st1Var != null) {
            st1Var.f11133a.o(st1Var.f11134b);
        }
        tt1Var.f11445c.add(a10);
        rx1 c10 = tt1Var.f11443a.c(a10, wVar, j11);
        ((IdentityHashMap) ak0Var.f4533y).put(c10, tt1Var);
        ak0Var.j();
        this.f8136a = c10;
    }

    public final long a() {
        return this.f8141g.f8414b + this.f8149p;
    }

    public final boolean b() {
        if (this.e) {
            if (!this.f8140f || this.f8136a.zzb() == Long.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean c() {
        if (this.e) {
            if (b() || d() - this.f8141g.f8414b >= -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final long d() {
        long j10;
        if (!this.e) {
            return this.f8141g.f8414b;
        }
        if (this.f8140f) {
            j10 = this.f8136a.zzb();
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == Long.MIN_VALUE) {
            return this.f8141g.e;
        }
        return j10;
    }

    public final void e(uh uhVar) {
        this.e = true;
        this.f8147n = this.f8136a.n();
        u f10 = f(uhVar);
        mt1 mt1Var = this.f8141g;
        long j10 = mt1Var.f8414b;
        long j11 = mt1Var.e;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        long g8 = g(f10, j10, false, new boolean[2]);
        long j12 = this.f8149p;
        mt1 mt1Var2 = this.f8141g;
        this.f8149p = (mt1Var2.f8414b - g8) + j12;
        this.f8141g = mt1Var2.a(g8, mt1Var2.f8415c);
    }

    /* JADX WARN: Removed duplicated region for block: B:220:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x045d  */
    /* JADX WARN: Type inference failed for: r1v20, types: [com.google.android.gms.internal.ads.y41, com.google.android.gms.internal.ads.a51] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.google.android.gms.internal.ads.i51, com.google.android.gms.internal.ads.y41] */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.google.android.gms.internal.ads.v31, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:198:0x045a -> B:183:0x042e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.u f(com.google.android.gms.internal.ads.uh r34) {
        /*
            Method dump skipped, instructions count: 2169
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lt1.f(com.google.android.gms.internal.ads.uh):com.google.android.gms.internal.ads.u");
    }

    public final long g(u uVar, long j10, boolean z3, boolean[] zArr) {
        zw1[] zw1VarArr;
        boolean z9;
        int i = 0;
        while (true) {
            boolean z10 = true;
            if (i >= uVar.f11497u) {
                break;
            }
            if (z3 || !uVar.d(this.f8148o, i)) {
                z10 = false;
            }
            this.i[i] = z10;
            i++;
        }
        int i10 = 0;
        while (true) {
            zw1VarArr = this.f8143j;
            if (i10 >= 2) {
                break;
            }
            zw1VarArr[i10].getClass();
            i10++;
        }
        l();
        this.f8148o = uVar;
        if (this.f8146m == null) {
            int i11 = 0;
            while (true) {
                u uVar2 = this.f8148o;
                if (i11 >= uVar2.f11497u) {
                    break;
                }
                uVar2.c(i11);
                r rVar = ((r[]) this.f8148o.f11499w)[i11];
                i11++;
            }
        }
        r[] rVarArr = (r[]) uVar.f11499w;
        rx1 rx1Var = this.f8136a;
        boolean[] zArr2 = this.i;
        sy1[] sy1VarArr = this.f8138c;
        long i12 = rx1Var.i(rVarArr, zArr2, sy1VarArr, zArr, j10);
        for (int i13 = 0; i13 < 2; i13++) {
            zw1VarArr[i13].getClass();
        }
        this.f8140f = false;
        for (int i14 = 0; i14 < 2; i14++) {
            if (sy1VarArr[i14] != null) {
                b80.K(uVar.c(i14));
                zw1VarArr[i14].getClass();
                this.f8140f = true;
            } else {
                if (rVarArr[i14] == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                b80.K(z9);
            }
        }
        return i12;
    }

    public final void h() {
        l();
        ak0 ak0Var = this.f8145l;
        rx1 rx1Var = this.f8136a;
        try {
            IdentityHashMap identityHashMap = (IdentityHashMap) ak0Var.f4533y;
            tt1 tt1Var = (tt1) identityHashMap.remove(rx1Var);
            tt1Var.getClass();
            tt1Var.f11443a.b(rx1Var);
            tt1Var.f11445c.remove(rx1Var.f10330u);
            if (!identityHashMap.isEmpty()) {
                ak0Var.j();
            }
            ak0Var.m(tt1Var);
        } catch (RuntimeException e) {
            x21.P("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final lt1 i() {
        return this.f8146m;
    }

    public final zy1 j() {
        return this.f8147n;
    }

    public final u k() {
        return this.f8148o;
    }

    public final void l() {
        if (this.f8146m == null) {
            int i = 0;
            while (true) {
                u uVar = this.f8148o;
                if (i < uVar.f11497u) {
                    uVar.c(i);
                    r rVar = ((r[]) this.f8148o.f11499w)[i];
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
