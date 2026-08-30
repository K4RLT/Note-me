package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class n91 extends dn1 {
    private static final n91 zzb;
    private static volatile fo1 zzc;
    private kn1 zza = io1.f7187y;

    static {
        n91 n91Var = new n91();
        zzb = n91Var;
        dn1.t(n91.class, n91Var);
    }

    public static k91 A() {
        return (k91) zzb.q();
    }

    public final void B(m91 m91Var) {
        kn1 kn1Var = this.zza;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zza = kn1Var.B(size + size);
        }
        this.zza.add(m91Var);
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
                                fo1 fo1Var2 = zzc;
                                if (fo1Var2 == null) {
                                    synchronized (n91.class) {
                                        try {
                                            fo1Var = zzc;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzb);
                                                zzc = fo1Var;
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
                        return zzb;
                    }
                    return new bn1(zzb);
                }
                return new n91();
            }
            return new jo1(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zza", m91.class});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zza.size();
    }
}
