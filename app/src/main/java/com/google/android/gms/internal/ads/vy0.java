package com.google.android.gms.internal.ads;
import q0.d;

import java.util.List;

/* loaded from: classes.dex */
public final class vy0 extends dn1 {
    private static final vy0 zzf;
    private static volatile fo1 zzg;
    private int zza;
    private Object zzc;
    private int zzd;
    private int zzb = 0;
    private hn1 zze = en1.f5735y;

    static {
        vy0 vy0Var = new vy0();
        zzf = vy0Var;
        dn1.t(vy0.class, vy0Var);
    }

    public static vy0 D(mm1 mm1Var) {
        vy0 vy0Var = zzf;
        wm1 wm1Var = wm1.f12302a;
        int i = em1.f5727a;
        dn1 m4 = dn1.m(vy0Var, mm1Var, wm1.f12303b);
        dn1.y(m4);
        return (vy0) m4;
    }

    public static uy0 E() {
        return (uy0) zzf.q();
    }

    public static vy0 F() {
        return zzf;
    }

    public final kh A() {
        if (this.zzb == 2) {
            return (kh) this.zzc;
        }
        return kh.C();
    }

    public final hh B() {
        hh a10 = hh.a(this.zzd);
        return a10 == null ? hh.UNSUPPORTED : a10;
    }

    public final List C() {
        return this.zze;
    }

    public final /* synthetic */ void G(mh mhVar) {
        mhVar.getClass();
        this.zzc = mhVar;
        this.zzb = 1;
    }

    public final /* synthetic */ void H(kh khVar) {
        khVar.getClass();
        this.zzc = khVar;
        this.zzb = 2;
    }

    public final void I(hh hhVar) {
        this.zzd = hhVar.f6816u;
        this.zza |= 1;
    }

    public final void J(hn1 hn1Var) {
        List list = this.zze;
        if (!((dm1) list).f5462u) {
            int size = list.size();
            this.zze = ((en1) list).B(size + size);
        }
        cm1.e(hn1Var, this.zze);
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
                                    synchronized (vy0.class) {
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
                return new vy0();
            }
            return new jo1(zzf, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"zzc", "zzb", "zza", mh.class, kh.class, "zzd", nd.f8660o, "zze"});
        }
        return (byte) 1;
    }

    public final mh z() {
        if (this.zzb == 1) {
            return (mh) this.zzc;
        }
        return mh.H();
    }
}
