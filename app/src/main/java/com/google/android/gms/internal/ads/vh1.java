package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class vh1 extends dn1 {
    private static final vh1 zzb;
    private static volatile fo1 zzc;
    private String zza = "";

    static {
        vh1 vh1Var = new vh1();
        zzb = vh1Var;
        dn1.t(vh1.class, vh1Var);
    }

    public static vh1 A(om1 om1Var, wm1 wm1Var) {
        return (vh1) dn1.m(zzb, om1Var, wm1Var);
    }

    public static uh1 B() {
        return (uh1) zzb.q();
    }

    public static vh1 C() {
        return zzb;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza = str;
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
                                fo1 fo1Var2 = zzc;
                                if (fo1Var2 == null) {
                                    synchronized (vh1.class) {
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
                return new vh1();
            }
            return new jo1(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zza"});
        }
        return (byte) 1;
    }

    public final String z() {
        return this.zza;
    }
}
