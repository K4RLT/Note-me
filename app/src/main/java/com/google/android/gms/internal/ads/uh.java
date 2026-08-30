package com.google.android.gms.internal.ads;
import g5.q;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class uh {

    /* renamed from: a, reason: collision with root package name */
    public static final zf f11636a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.zf] */
    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public abstract int a();

    public abstract ah b(int i, ah ahVar, long j10);

    public abstract int c();

    public abstract qg d(int i, qg qgVar, boolean z3);

    public abstract int e(Object obj);

    public final boolean equals(Object obj) {
        int j10;
        if (this != obj) {
            if (obj instanceof uh) {
                uh uhVar = (uh) obj;
                if (uhVar.a() == a() && uhVar.c() == c()) {
                    ah ahVar = new ah();
                    qg qgVar = new qg();
                    ah ahVar2 = new ah();
                    qg qgVar2 = new qg();
                    int i = 0;
                    while (true) {
                        if (i < a()) {
                            if (!b(i, ahVar, 0L).equals(uhVar.b(i, ahVar2, 0L))) {
                                break;
                            }
                            i++;
                        } else {
                            int i10 = 0;
                            while (true) {
                                if (i10 < c()) {
                                    if (!d(i10, qgVar, true).equals(uhVar.d(i10, qgVar2, true))) {
                                        break;
                                    }
                                    i10++;
                                } else {
                                    int k3 = k(true);
                                    if (k3 == uhVar.k(true) && (j10 = j(true)) == uhVar.j(true)) {
                                        while (k3 != j10) {
                                            int h3 = h(k3, 0, true);
                                            if (h3 == uhVar.h(k3, 0, true)) {
                                                k3 = h3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract Object f(int i);

    public final boolean g() {
        if (a() == 0) {
            return true;
        }
        return false;
    }

    public int h(int i, int i10, boolean z3) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (i == j(z3)) {
                        return k(z3);
                    }
                    return i + 1;
                }
                q.l();
                return 0;
            }
            return i;
        }
        if (i == j(z3)) {
            return -1;
        }
        return i + 1;
    }

    public final int hashCode() {
        int i;
        ah ahVar = new ah();
        qg qgVar = new qg();
        int a10 = a() + 217;
        int i10 = 0;
        while (true) {
            i = a10 * 31;
            if (i10 >= a()) {
                break;
            }
            a10 = i + b(i10, ahVar, 0L).hashCode();
            i10++;
        }
        int c10 = c() + i;
        for (int i11 = 0; i11 < c(); i11++) {
            c10 = (c10 * 31) + d(i11, qgVar, true).hashCode();
        }
        int k3 = k(true);
        while (k3 != -1) {
            c10 = (c10 * 31) + k3;
            k3 = h(k3, 0, true);
        }
        return c10;
    }

    public int i(int i) {
        if (i == k(false)) {
            return -1;
        }
        return i - 1;
    }

    public int j(boolean z3) {
        if (g()) {
            return -1;
        }
        return a() - 1;
    }

    public int k(boolean z3) {
        if (g()) {
            return -1;
        }
        return 0;
    }

    public final int l(int i, qg qgVar, ah ahVar, int i10, boolean z3) {
        int i11 = d(i, qgVar, false).f9841c;
        if (b(i11, ahVar, 0L).f4507l == i) {
            int h3 = h(i11, i10, z3);
            if (h3 == -1) {
                return -1;
            }
            return b(h3, ahVar, 0L).f4506k;
        }
        return i + 1;
    }

    public final Pair m(ah ahVar, qg qgVar, int i, long j10) {
        Pair n10 = n(ahVar, qgVar, i, j10, 0L);
        n10.getClass();
        return n10;
    }

    public final Pair n(ah ahVar, qg qgVar, int i, long j10, long j11) {
        b80.N(i, a());
        b(i, ahVar, j11);
        if (j10 == -9223372036854775807L) {
            ahVar.getClass();
            j10 = 0;
        }
        int i10 = ahVar.f4506k;
        d(i10, qgVar, false);
        while (i10 < ahVar.f4507l) {
            qgVar.getClass();
            if (j10 == 0) {
                break;
            }
            int i11 = i10 + 1;
            d(i11, qgVar, false).getClass();
            if (j10 < 0) {
                break;
            }
            i10 = i11;
        }
        d(i10, qgVar, true);
        qgVar.getClass();
        long j12 = qgVar.f9842d;
        if (j12 != -9223372036854775807L) {
            j10 = Math.min(j10, j12 - 1);
        }
        long max = Math.max(0L, j10);
        Object obj = qgVar.f9840b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public qg o(Object obj, qg qgVar) {
        return d(e(obj), qgVar, true);
    }
}
