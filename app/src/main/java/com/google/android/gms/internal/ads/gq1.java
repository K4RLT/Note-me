package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class gq1 extends dn1 {
    private static final gq1 zzf;
    private static volatile fo1 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private om1 zzd;
    private om1 zze;

    static {
        gq1 gq1Var = new gq1();
        zzf = gq1Var;
        dn1.t(gq1.class, gq1Var);
    }

    public gq1() {
        mm1 mm1Var = om1.f9167v;
        this.zzd = mm1Var;
        this.zze = mm1Var;
    }

    public static fq1 z() {
        return (fq1) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        this.zza |= 2;
        this.zzc = "image/png";
    }

    public final /* synthetic */ void B(om1 om1Var) {
        om1Var.getClass();
        this.zza |= 4;
        this.zzd = om1Var;
    }

    public final /* synthetic */ void C(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        fo1 fo1Var;
        int b10 = d.b(i);
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            if (b10 == 6) {
                                fo1 fo1Var2 = zzg;
                                if (fo1Var2 == null) {
                                    synchronized (gq1.class) {
                                        try {
                                            fo1Var = zzg;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzf);
                                                zzg = fo1Var;
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
                        return zzf;
                    }
                    return new bn1(zzf);
                }
                return new gq1();
            }
            return new jo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", np1.f8805j, "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
