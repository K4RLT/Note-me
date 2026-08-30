package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class op1 extends dn1 {
    private static final op1 zzy;
    private static volatile fo1 zzz;
    private int zza;
    private int zzb;
    private boolean zzc;
    private String zzd = "";
    private kn1 zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private String zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private kn1 zzo;
    private boolean zzp;
    private long zzu;
    private hn1 zzv;
    private boolean zzw;
    private hn1 zzx;

    static {
        op1 op1Var = new op1();
        zzy = op1Var;
        dn1.t(op1.class, op1Var);
    }

    public op1() {
        io1 io1Var = io1.f7187y;
        this.zze = io1Var;
        this.zzj = "";
        this.zzo = io1Var;
        en1 en1Var = en1.f5735y;
        this.zzv = en1Var;
        this.zzx = en1Var;
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        fo1 fo1Var;
        int b10 = q0.d.b(i);
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            if (b10 == 6) {
                                fo1 fo1Var2 = zzz;
                                if (fo1Var2 == null) {
                                    synchronized (op1.class) {
                                        try {
                                            fo1Var = zzz;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzy);
                                                zzz = fo1Var;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return fo1Var;
                                }
                                return fo1Var2;
                            }
                            throw null;
                        }
                        return zzy;
                    }
                    return new bn1(zzy);
                }
                return new op1();
            }
            return new jo1(zzy, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zza", "zzb", np1.f8801d, "zzc", "zzd", "zze", "zzf", np1.f8799b, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", mp1.class, "zzp", "zzu", "zzv", nd.D, "zzw", "zzx", np1.f8800c});
        }
        return (byte) 1;
    }
}
