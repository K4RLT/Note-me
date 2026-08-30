package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class zp1 extends dn1 {
    private static final zp1 zzh;
    private static volatile fo1 zzi;
    private int zza;
    private yp1 zzb;
    private om1 zzd;
    private om1 zze;
    private int zzf;
    private byte zzg = 2;
    private kn1 zzc = io1.f7187y;

    static {
        zp1 zp1Var = new zp1();
        zzh = zp1Var;
        dn1.t(zp1.class, zp1Var);
    }

    public zp1() {
        mm1 mm1Var = om1.f9167v;
        this.zzd = mm1Var;
        this.zze = mm1Var;
    }

    public static xp1 z() {
        return (xp1) zzh.q();
    }

    public final void A(wp1 wp1Var) {
        kn1 kn1Var = this.zzc;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzc = kn1Var.B(size + size);
        }
        this.zzc.add(wp1Var);
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        byte b10;
        fo1 fo1Var;
        switch (q0.d.b(i)) {
            case 0:
                return Byte.valueOf(this.zzg);
            case 1:
                if (dn1Var == null) {
                    b10 = 0;
                } else {
                    b10 = 1;
                }
                this.zzg = b10;
                return null;
            case 2:
                return new jo1(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", wp1.class, "zzd", "zze", "zzf"});
            case 3:
                return new zp1();
            case 4:
                return new bn1(zzh);
            case 5:
                return zzh;
            case 6:
                fo1 fo1Var2 = zzi;
                if (fo1Var2 == null) {
                    synchronized (zp1.class) {
                        try {
                            fo1Var = zzi;
                            if (fo1Var == null) {
                                fo1Var = new cn1(zzh);
                                zzi = fo1Var;
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
