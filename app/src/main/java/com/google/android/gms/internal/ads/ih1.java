package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class ih1 extends dn1 {
    private static final ih1 zzd;
    private static volatile fo1 zze;
    private String zza = "";
    private om1 zzb = om1.f9167v;
    private int zzc;

    static {
        ih1 ih1Var = new ih1();
        zzd = ih1Var;
        dn1.t(ih1.class, ih1Var);
    }

    public static ih1 B(byte[] bArr, wm1 wm1Var) {
        dn1 x9 = dn1.x(zzd, bArr, bArr.length, wm1Var);
        dn1.y(x9);
        return (ih1) x9;
    }

    public static hh1 C() {
        return (hh1) zzd.q();
    }

    public static ih1 D() {
        return zzd;
    }

    public final om1 A() {
        return this.zzb;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void F(om1 om1Var) {
        om1Var.getClass();
        this.zzb = om1Var;
    }

    public final int G() {
        int l10 = ct.l(this.zzc);
        if (l10 == 0) {
            return 1;
        }
        return l10;
    }

    public final void H(int i) {
        if (i != 1) {
            this.zzc = i - 2;
        } else {
            ln1.a();
            throw null;
        }
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
                                fo1 fo1Var2 = zze;
                                if (fo1Var2 == null) {
                                    synchronized (ih1.class) {
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
                return new ih1();
            }
            return new jo1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final String z() {
        return this.zza;
    }
}
