package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class ue extends dn1 {
    private static final ue zzf;
    private static volatile fo1 zzg;
    private int zza;
    private kn1 zzb = io1.f7187y;
    private om1 zzc = om1.f9167v;
    private int zzd = 1;
    private int zze = 1;

    static {
        ue ueVar = new ue();
        zzf = ueVar;
        dn1.t(ue.class, ueVar);
    }

    public static te z() {
        return (te) zzf.q();
    }

    public final void A(om1 om1Var) {
        om1Var.getClass();
        kn1 kn1Var = this.zzb;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzb = kn1Var.B(size + size);
        }
        this.zzb.add(om1Var);
    }

    public final /* synthetic */ void B(om1 om1Var) {
        om1Var.getClass();
        this.zza |= 1;
        this.zzc = om1Var;
    }

    public final /* synthetic */ void C(int i) {
        this.zzd = 4;
        this.zza |= 2;
    }

    public final /* synthetic */ void D(int i) {
        this.zze = i - 1;
        this.zza |= 4;
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
                                    synchronized (ue.class) {
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
                return new ue();
            }
            return new jo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", nd.f8659n, "zze", nd.f8657l});
        }
        return (byte) 1;
    }
}
