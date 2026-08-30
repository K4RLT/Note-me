package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class zh1 extends dn1 {
    private static final zh1 zzd;
    private static volatile fo1 zze;
    private int zza;
    private String zzb = "";
    private ih1 zzc;

    static {
        zh1 zh1Var = new zh1();
        zzd = zh1Var;
        dn1.t(zh1.class, zh1Var);
    }

    public static zh1 B(om1 om1Var, wm1 wm1Var) {
        return (zh1) dn1.m(zzd, om1Var, wm1Var);
    }

    public static yh1 C() {
        return (yh1) zzd.q();
    }

    public static zh1 D() {
        return zzd;
    }

    public final ih1 A() {
        ih1 ih1Var = this.zzc;
        if (ih1Var == null) {
            return ih1.D();
        }
        return ih1Var;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void F(ih1 ih1Var) {
        ih1Var.getClass();
        this.zzc = ih1Var;
        this.zza |= 1;
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
                                fo1 fo1Var2 = zze;
                                if (fo1Var2 == null) {
                                    synchronized (zh1.class) {
                                        try {
                                            fo1Var = zze;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzd);
                                                zze = fo1Var;
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
                        return zzd;
                    }
                    return new bn1(zzd);
                }
                return new zh1();
            }
            return new jo1(zzd, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final String z() {
        return this.zzb;
    }
}
