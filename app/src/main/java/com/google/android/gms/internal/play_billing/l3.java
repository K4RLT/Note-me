package com.google.android.gms.internal.play_billing;

import android.os.Build;

/* loaded from: classes.dex */
public final class l3 extends r1 {
    private static final l3 zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        l3 l3Var = new l3();
        zzb = l3Var;
        r1.f(l3.class, l3Var);
    }

    public static /* synthetic */ void A(l3 l3Var, int i) {
        l3Var.zzd |= 128;
        l3Var.zzl = i;
    }

    public static /* synthetic */ void B(l3 l3Var, int i) {
        l3Var.zzd |= 256;
        l3Var.zzm = i;
    }

    public static /* synthetic */ void C(l3 l3Var, int i) {
        l3Var.zzd |= 8;
        l3Var.zzh = i;
    }

    public static /* synthetic */ void D(l3 l3Var, long j10) {
        l3Var.zzd |= 16;
        l3Var.zzi = j10;
    }

    public static /* synthetic */ void E(l3 l3Var, long j10) {
        l3Var.zzd |= 32;
        l3Var.zzj = j10;
    }

    public static /* synthetic */ void p(l3 l3Var) {
        l3Var.zzd |= 512;
        l3Var.zzn = 837283956L;
    }

    public static /* synthetic */ void q(l3 l3Var, String str) {
        str.getClass();
        l3Var.zzd |= 4;
        l3Var.zzg = str;
    }

    public static /* synthetic */ void r(l3 l3Var) {
        String str = Build.BRAND;
        str.getClass();
        l3Var.zzd |= 1024;
        l3Var.zzo = str;
    }

    public static /* synthetic */ void s(l3 l3Var) {
        String str = Build.FINGERPRINT;
        str.getClass();
        l3Var.zzd |= 8192;
        l3Var.zzr = str;
    }

    public static /* synthetic */ void t(l3 l3Var) {
        String str = Build.MANUFACTURER;
        str.getClass();
        l3Var.zzd |= 4096;
        l3Var.zzq = str;
    }

    public static /* synthetic */ void u(l3 l3Var) {
        String str = Build.MODEL;
        str.getClass();
        l3Var.zzd |= 2048;
        l3Var.zzp = str;
    }

    public static /* synthetic */ void v(l3 l3Var, int i) {
        l3Var.zzd |= 16384;
        l3Var.zzs = i;
    }

    public static /* synthetic */ void w(l3 l3Var, boolean z3) {
        l3Var.zzd |= 64;
        l3Var.zzk = z3;
    }

    public static /* synthetic */ void x(l3 l3Var) {
        l3Var.zzd |= 1;
        l3Var.zze = "8.2.0";
    }

    public static /* synthetic */ void y(l3 l3Var, String str) {
        l3Var.zzd |= 2;
        l3Var.zzf = str;
    }

    public static k3 z() {
        return (k3) zzb.k();
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final Object j(int i) {
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new q1(zzb);
                }
                return new l3();
            }
            return new o2(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        return (byte) 1;
    }
}
