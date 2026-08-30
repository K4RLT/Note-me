package com.google.android.gms.internal.measurement;
import q.x;

import java.util.List;

/* loaded from: classes.dex */
public final class j2 extends b5 {
    private static final j2 zzc;
    private static volatile v5 zzd;
    private int zze;
    private long zzf;
    private String zzg = "";
    private int zzh;
    private i5 zzi;
    private i5 zzj;
    private i5 zzk;
    private String zzl;
    private boolean zzm;
    private i5 zzn;
    private i5 zzo;
    private String zzp;
    private String zzq;
    private e2 zzr;
    private k2 zzs;
    private n2 zzt;
    private l2 zzu;

    static {
        j2 j2Var = new j2();
        zzc = j2Var;
        b5.i(j2.class, j2Var);
    }

    public j2() {
        x5 x5Var = x5.f13969x;
        this.zzi = x5Var;
        this.zzj = x5Var;
        this.zzk = x5Var;
        this.zzl = "";
        this.zzn = x5Var;
        this.zzo = x5Var;
        this.zzp = "";
        this.zzq = "";
    }

    public static void r(j2 j2Var) {
        j2Var.getClass();
        j2Var.zzk = x5.f13969x;
    }

    public static void s(j2 j2Var, int i, h2 h2Var) {
        j2Var.getClass();
        i5 i5Var = j2Var.zzj;
        if (!((o4) i5Var).f13871u) {
            j2Var.zzj = b5.e(i5Var);
        }
        j2Var.zzj.set(i, h2Var);
    }

    public static i2 w() {
        return (i2) zzc.k();
    }

    public static j2 x() {
        return zzc;
    }

    public final String A() {
        return this.zzp;
    }

    public final List B() {
        return this.zzk;
    }

    public final i5 C() {
        return this.zzo;
    }

    public final i5 D() {
        return this.zzn;
    }

    public final i5 E() {
        return this.zzi;
    }

    public final boolean F() {
        return this.zzm;
    }

    public final boolean G() {
        if ((this.zze & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean H() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean I() {
        if ((this.zze & 512) != 0) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (o2.f13870a[i - 1]) {
            case 1:
                return new j2();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", m2.class, "zzj", h2.class, "zzk", p1.class, "zzl", "zzm", "zzn", s3.class, "zzo", f2.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (j2.class) {
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
        return this.zzn.size();
    }

    public final h2 q(int i) {
        return (h2) this.zzj.get(i);
    }

    public final int t() {
        return this.zzj.size();
    }

    public final long u() {
        return this.zzf;
    }

    public final e2 v() {
        e2 e2Var = this.zzr;
        if (e2Var == null) {
            return e2.p();
        }
        return e2Var;
    }

    public final n2 y() {
        n2 n2Var = this.zzt;
        if (n2Var == null) {
            return n2.q();
        }
        return n2Var;
    }

    public final String z() {
        return this.zzg;
    }
}
