package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class m91 extends dn1 {
    private static final m91 zzf;
    private static volatile fo1 zzg;
    private int zza;
    private j91 zzb;
    private to1 zzc;
    private kn1 zzd = io1.f7187y;
    private jn1 zze = vn1.f11956y;

    static {
        m91 m91Var = new m91();
        zzf = m91Var;
        dn1.t(m91.class, m91Var);
    }

    public static l91 z() {
        return (l91) zzf.q();
    }

    public final /* synthetic */ void A(j91 j91Var) {
        this.zzb = j91Var;
        this.zza |= 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(ArrayDeque arrayDeque) {
        jn1 jn1Var = this.zze;
        if (!((dm1) jn1Var).f5462u) {
            this.zze = dn1.k(jn1Var);
        }
        cm1.e(arrayDeque, this.zze);
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
                                fo1 fo1Var2 = zzg;
                                if (fo1Var2 == null) {
                                    synchronized (m91.class) {
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
                return new m91();
            }
            return new jo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004%", new Object[]{"zza", "zzb", "zzc", "zzd", to1.class, "zze"});
        }
        return (byte) 1;
    }
}
