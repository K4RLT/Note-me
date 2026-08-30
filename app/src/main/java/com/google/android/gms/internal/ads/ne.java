package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class ne extends dn1 {
    private static final ne zzf;
    private static volatile fo1 zzg;
    private int zza;
    private om1 zzb;
    private om1 zzc;
    private om1 zzd;
    private om1 zze;

    static {
        ne neVar = new ne();
        zzf = neVar;
        dn1.t(ne.class, neVar);
    }

    public ne() {
        mm1 mm1Var = om1.f9167v;
        this.zzb = mm1Var;
        this.zzc = mm1Var;
        this.zzd = mm1Var;
        this.zze = mm1Var;
    }

    public static ne D(byte[] bArr, wm1 wm1Var) {
        dn1 x9 = dn1.x(zzf, bArr, bArr.length, wm1Var);
        dn1.y(x9);
        return (ne) x9;
    }

    public static me E() {
        return (me) zzf.q();
    }

    public final om1 A() {
        return this.zzc;
    }

    public final om1 B() {
        return this.zzd;
    }

    public final om1 C() {
        return this.zze;
    }

    public final /* synthetic */ void F(om1 om1Var) {
        om1Var.getClass();
        this.zza |= 1;
        this.zzb = om1Var;
    }

    public final /* synthetic */ void G(om1 om1Var) {
        om1Var.getClass();
        this.zza |= 2;
        this.zzc = om1Var;
    }

    public final /* synthetic */ void H(om1 om1Var) {
        om1Var.getClass();
        this.zza |= 4;
        this.zzd = om1Var;
    }

    public final /* synthetic */ void I(om1 om1Var) {
        om1Var.getClass();
        this.zza |= 8;
        this.zze = om1Var;
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
                                    synchronized (ne.class) {
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
                return new ne();
            }
            return new jo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }

    public final om1 z() {
        return this.zzb;
    }
}
