package com.google.android.gms.internal.measurement;
import q.x;
import x.h;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class k3 extends b5 {
    private static final k3 zzc;
    private static volatile v5 zzd;
    private f5 zze;
    private f5 zzf;
    private i5 zzg;
    private i5 zzh;

    static {
        k3 k3Var = new k3();
        zzc = k3Var;
        b5.i(k3.class, k3Var);
    }

    public k3() {
        n5 n5Var = n5.f13859x;
        this.zze = n5Var;
        this.zzf = n5Var;
        x5 x5Var = x5.f13969x;
        this.zzg = x5Var;
        this.zzh = x5Var;
    }

    public static void A(k3 k3Var, Iterable iterable) {
        i5 i5Var = k3Var.zzh;
        if (!((o4) i5Var).f13871u) {
            k3Var.zzh = b5.e(i5Var);
        }
        m4.b(iterable, k3Var.zzh);
    }

    public static j3 B() {
        return (j3) zzc.k();
    }

    public static k3 C() {
        return zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q(k3 k3Var, Iterable iterable) {
        f5 f5Var = k3Var.zze;
        if (!((o4) f5Var).f13871u) {
            k3Var.zze = b5.f(f5Var);
        }
        m4.b(iterable, k3Var.zze);
    }

    public static void r(k3 k3Var) {
        k3Var.getClass();
        k3Var.zze = n5.f13859x;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void t(k3 k3Var, List list) {
        f5 f5Var = k3Var.zzf;
        if (!((o4) f5Var).f13871u) {
            k3Var.zzf = b5.f(f5Var);
        }
        m4.b(list, k3Var.zzf);
    }

    public static void u(k3 k3Var) {
        k3Var.getClass();
        k3Var.zzf = n5.f13859x;
    }

    public static void w(k3 k3Var) {
        k3Var.getClass();
        k3Var.zzg = x5.f13969x;
    }

    public static void x(k3 k3Var, ArrayList arrayList) {
        i5 i5Var = k3Var.zzg;
        if (!((o4) i5Var).f13871u) {
            k3Var.zzg = b5.e(i5Var);
        }
        m4.b(arrayList, k3Var.zzg);
    }

    public static void z(k3 k3Var) {
        k3Var.getClass();
        k3Var.zzh = x5.f13969x;
    }

    public final i5 D() {
        return this.zzg;
    }

    public final List E() {
        return this.zzf;
    }

    public final i5 F() {
        return this.zzh;
    }

    public final List G() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (p3.f13878a[i - 1]) {
            case 1:
                return new k3();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", x2.class, "zzh", m3.class});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (k3.class) {
                        try {
                            v5Var = zzd;
                            if (v5Var == null) {
                                v5Var = new c5(6);
                                zzd = v5Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return v5Var;
                }
                return v5Var2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                q.x.h();
                return null;
        }
    }

    public final int p() {
        return this.zzg.size();
    }

    public final int s() {
        return this.zzf.size();
    }

    public final int v() {
        return this.zzh.size();
    }

    public final int y() {
        return this.zze.size();
    }
}
