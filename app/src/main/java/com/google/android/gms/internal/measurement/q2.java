package com.google.android.gms.internal.measurement;
import q.x;
import x.h;

/* loaded from: classes.dex */
public final class q2 extends b5 {
    private static final q2 zzc;
    private static volatile v5 zzd;
    private int zze;
    private long zzi;
    private long zzm;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        q2 q2Var = new q2();
        zzc = q2Var;
        b5.i(q2.class, q2Var);
    }

    public static void A(q2 q2Var) {
        q2Var.zze &= -17;
        q2Var.zzj = zzc.zzj;
    }

    public static void B(q2 q2Var, String str) {
        q2Var.getClass();
        q2Var.zze |= 16;
        q2Var.zzj = str;
    }

    public static q2 C() {
        return zzc;
    }

    public static void D(q2 q2Var) {
        q2Var.zze &= -33;
        q2Var.zzk = zzc.zzk;
    }

    public static void E(q2 q2Var, String str) {
        q2Var.getClass();
        q2Var.zze |= 32;
        q2Var.zzk = str;
    }

    public static void G(q2 q2Var) {
        q2Var.zze &= -65;
        q2Var.zzl = zzc.zzl;
    }

    public static void H(q2 q2Var, String str) {
        q2Var.getClass();
        q2Var.zze |= 64;
        q2Var.zzl = str;
    }

    public static void q(q2 q2Var) {
        q2Var.zze &= -2;
        q2Var.zzf = zzc.zzf;
    }

    public static void r(q2 q2Var, long j10) {
        q2Var.zze |= 8;
        q2Var.zzi = j10;
    }

    public static void s(q2 q2Var, String str) {
        q2Var.getClass();
        q2Var.zze |= 1;
        q2Var.zzf = str;
    }

    public static void u(q2 q2Var) {
        q2Var.zze &= -3;
        q2Var.zzg = zzc.zzg;
    }

    public static void v(q2 q2Var, long j10) {
        q2Var.zze |= 128;
        q2Var.zzm = j10;
    }

    public static void w(q2 q2Var, String str) {
        q2Var.getClass();
        q2Var.zze |= 2;
        q2Var.zzg = str;
    }

    public static void x(q2 q2Var) {
        q2Var.zze &= -5;
        q2Var.zzh = zzc.zzh;
    }

    public static void y(q2 q2Var, String str) {
        q2Var.getClass();
        q2Var.zze |= 4;
        q2Var.zzh = str;
    }

    public static p2 z() {
        return (p2) zzc.k();
    }

    public final String F() {
        return this.zzh;
    }

    public final String I() {
        return this.zzg;
    }

    public final String J() {
        return this.zzf;
    }

    public final String K() {
        return this.zzl;
    }

    public final String L() {
        return this.zzk;
    }

    public final String M() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (p3.f13878a[i - 1]) {
            case 1:
                return new q2();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (q2.class) {
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

    public final long p() {
        return this.zzi;
    }

    public final long t() {
        return this.zzm;
    }
}
