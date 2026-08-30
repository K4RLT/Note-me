package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class gh1 extends dn1 {
    private static final gh1 zzd;
    private static volatile fo1 zze;
    private String zza = "";
    private om1 zzb = om1.f9167v;
    private int zzc;

    static {
        gh1 gh1Var = new gh1();
        zzd = gh1Var;
        dn1.t(gh1.class, gh1Var);
    }

    public static fh1 B() {
        return (fh1) zzd.q();
    }

    public static gh1 C() {
        return zzd;
    }

    public final om1 A() {
        return this.zzb;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza = str;
    }

    public final /* synthetic */ void E(om1 om1Var) {
        om1Var.getClass();
        this.zzb = om1Var;
    }

    public final int F() {
        int i = this.zzc;
        int i10 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? 0 : 6 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final /* synthetic */ void G(int i) {
        this.zzc = i - 2;
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
                                    synchronized (gh1.class) {
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
                return new gh1();
            }
            return new jo1(zzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zza", "zzb", "zzc"});
        }
        return (byte) 1;
    }

    public final String z() {
        return this.zza;
    }
}
