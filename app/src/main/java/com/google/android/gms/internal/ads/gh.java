package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class gh extends dn1 {
    private static final gh zzd;
    private static volatile fo1 zze;
    private int zza;
    private kn1 zzb = io1.f7187y;
    private yg zzc;

    static {
        gh ghVar = new gh();
        zzd = ghVar;
        dn1.t(gh.class, ghVar);
    }

    public static fh z() {
        return (fh) zzd.q();
    }

    public final void A(eh ehVar) {
        kn1 kn1Var = this.zzb;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzb = kn1Var.B(size + size);
        }
        this.zzb.add(ehVar);
    }

    public final /* synthetic */ void B(yg ygVar) {
        ygVar.getClass();
        this.zzc = ygVar;
        this.zza |= 1;
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
                                fo1 fo1Var2 = zze;
                                if (fo1Var2 == null) {
                                    synchronized (gh.class) {
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
                return new gh();
            }
            return new jo1(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zza", "zzb", eh.class, "zzc"});
        }
        return (byte) 1;
    }
}
