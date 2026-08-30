package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class er1 extends dn1 {
    private static final er1 zzl;
    private static volatile fo1 zzm;
    private int zza;
    private om1 zzb = om1.f9167v;
    private hn1 zzc;
    private long zzd;
    private hn1 zze;
    private kn1 zzf;
    private String zzg;
    private kn1 zzh;
    private fr1 zzi;
    private gr1 zzj;
    private il1 zzk;

    static {
        er1 er1Var = new er1();
        zzl = er1Var;
        dn1.t(er1.class, er1Var);
    }

    public er1() {
        en1 en1Var = en1.f5735y;
        this.zzc = en1Var;
        this.zze = en1Var;
        io1 io1Var = io1.f7187y;
        this.zzf = io1Var;
        this.zzg = "";
        this.zzh = io1Var;
    }

    public static er1 z(byte[] bArr, wm1 wm1Var) {
        dn1 x9 = dn1.x(zzl, bArr, bArr.length, wm1Var);
        dn1.y(x9);
        return (er1) x9;
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
                                fo1 fo1Var2 = zzm;
                                if (fo1Var2 == null) {
                                    synchronized (er1.class) {
                                        try {
                                            fo1Var = zzm;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzl);
                                                zzm = fo1Var;
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
                        return zzl;
                    }
                    return new bn1(zzl);
                }
                return new er1();
            }
            return new jo1(zzl, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0004\u0000\u0001'\u0002ဂ\u0001\u0003'\u0004\u001b\u0005ဉ\u0003\u0007ဈ\u0002\tဉ\u0004\n\u001a\rည\u0000\u000fဉ\u0005", new Object[]{"zza", "zzc", "zzd", "zze", "zzh", zq1.class, "zzi", "zzg", "zzj", "zzf", "zzb", "zzk"});
        }
        return (byte) 1;
    }
}
