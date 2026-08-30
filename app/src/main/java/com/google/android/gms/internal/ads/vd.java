package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class vd extends dn1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11886a = 0;
    private static final vd zzg;
    private static volatile fo1 zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        vd vdVar = new vd();
        zzg = vdVar;
        dn1.t(vd.class, vdVar);
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
                                fo1 fo1Var2 = zzh;
                                if (fo1Var2 == null) {
                                    synchronized (vd.class) {
                                        try {
                                            fo1Var = zzh;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzg);
                                                zzh = fo1Var;
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
                        return zzg;
                    }
                    return new bn1(zzg);
                }
                return new vd();
            }
            return new jo1(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
