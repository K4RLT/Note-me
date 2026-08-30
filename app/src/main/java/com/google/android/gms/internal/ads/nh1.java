package com.google.android.gms.internal.ads;
import q0.d;

import java.io.ByteArrayInputStream;
import java.util.List;

/* loaded from: classes.dex */
public final class nh1 extends dn1 {
    private static final nh1 zzc;
    private static volatile fo1 zzd;
    private int zza;
    private kn1 zzb = io1.f7187y;

    static {
        nh1 nh1Var = new nh1();
        zzc = nh1Var;
        dn1.t(nh1.class, nh1Var);
    }

    public static nh1 D(byte[] bArr, wm1 wm1Var) {
        dn1 x9 = dn1.x(zzc, bArr, bArr.length, wm1Var);
        dn1.y(x9);
        return (nh1) x9;
    }

    public static nh1 E(ByteArrayInputStream byteArrayInputStream, wm1 wm1Var) {
        dn1 l10 = dn1.l(zzc, new qm1(byteArrayInputStream), wm1Var);
        dn1.y(l10);
        return (nh1) l10;
    }

    public static kh1 F() {
        return (kh1) zzc.q();
    }

    public final List A() {
        return this.zzb;
    }

    public final int B() {
        return this.zzb.size();
    }

    public final mh1 C(int i) {
        return (mh1) this.zzb.get(i);
    }

    public final /* synthetic */ void G(int i) {
        this.zza = i;
    }

    public final void H(mh1 mh1Var) {
        kn1 kn1Var = this.zzb;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzb = kn1Var.B(size + size);
        }
        this.zzb.add(mh1Var);
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
                                fo1 fo1Var2 = zzd;
                                if (fo1Var2 == null) {
                                    synchronized (nh1.class) {
                                        try {
                                            fo1Var = zzd;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzc);
                                                zzd = fo1Var;
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
                        return zzc;
                    }
                    return new bn1(zzc);
                }
                return new nh1();
            }
            return new jo1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", mh1.class});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zza;
    }
}
