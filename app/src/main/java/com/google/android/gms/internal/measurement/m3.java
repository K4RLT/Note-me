package com.google.android.gms.internal.measurement;
import q.x;

import java.util.List;

/* loaded from: classes.dex */
public final class m3 extends b5 {
    private static final m3 zzc;
    private static volatile v5 zzd;
    private int zze;
    private int zzf;
    private f5 zzg = n5.f13859x;

    static {
        m3 m3Var = new m3();
        zzc = m3Var;
        b5.i(m3.class, m3Var);
    }

    public static void r(m3 m3Var, int i) {
        m3Var.zze |= 1;
        m3Var.zzf = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(m3 m3Var, List list) {
        f5 f5Var = m3Var.zzg;
        if (!((o4) f5Var).f13871u) {
            m3Var.zzg = b5.f(f5Var);
        }
        m4.b(list, m3Var.zzg);
    }

    public static l3 u() {
        return (l3) zzc.k();
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (p3.f13878a[i - 1]) {
            case 1:
                return new m3();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (m3.class) {
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
                x.h();
                return null;
        }
    }

    public final int p() {
        return this.zzg.size();
    }

    public final long q(int i) {
        return ((n5) this.zzg).b(i);
    }

    public final int t() {
        return this.zzf;
    }

    public final List v() {
        return this.zzg;
    }

    public final boolean w() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }
}
