package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class wp1 extends dn1 {
    private static final wp1 zze;
    private static volatile fo1 zzf;
    private int zza;
    private om1 zzb;
    private om1 zzc;
    private byte zzd = 2;

    static {
        wp1 wp1Var = new wp1();
        zze = wp1Var;
        dn1.t(wp1.class, wp1Var);
    }

    public wp1() {
        mm1 mm1Var = om1.f9167v;
        this.zzb = mm1Var;
        this.zzc = mm1Var;
    }

    public static vp1 z() {
        return (vp1) zze.q();
    }

    public final /* synthetic */ void A(mm1 mm1Var) {
        mm1Var.getClass();
        this.zza |= 1;
        this.zzb = mm1Var;
    }

    public final /* synthetic */ void B(om1 om1Var) {
        om1Var.getClass();
        this.zza |= 2;
        this.zzc = om1Var;
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        byte b10;
        fo1 fo1Var;
        switch (q0.d.b(i)) {
            case 0:
                return Byte.valueOf(this.zzd);
            case 1:
                if (dn1Var == null) {
                    b10 = 0;
                } else {
                    b10 = 1;
                }
                this.zzd = b10;
                return null;
            case 2:
                return new jo1(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case 3:
                return new wp1();
            case 4:
                return new bn1(zze);
            case 5:
                return zze;
            case 6:
                fo1 fo1Var2 = zzf;
                if (fo1Var2 == null) {
                    synchronized (wp1.class) {
                        try {
                            fo1Var = zzf;
                            if (fo1Var == null) {
                                fo1Var = new cn1(zze);
                                zzf = fo1Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return fo1Var;
                }
                return fo1Var2;
            default:
                throw null;
        }
    }
}
