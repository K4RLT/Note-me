package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class eh1 extends dn1 {
    private static final eh1 zzc;
    private static volatile fo1 zzd;
    private int zza;
    private int zzb;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.dn1, com.google.android.gms.internal.ads.eh1] */
    static {
        dn1 dn1Var = new dn1();
        zzc = dn1Var;
        dn1.t(eh1.class, dn1Var);
    }

    public static dh1 B() {
        return (dh1) zzc.q();
    }

    public static eh1 C() {
        return zzc;
    }

    public final int A() {
        return this.zzb;
    }

    public final /* synthetic */ void D(yg1 yg1Var) {
        this.zza = yg1Var.zza();
    }

    public final /* synthetic */ void E(int i) {
        this.zzb = i;
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
                                    synchronized (eh1.class) {
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
                return new dn1();
            }
            return new jo1(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zza", "zzb"});
        }
        return (byte) 1;
    }

    public final yg1 z() {
        yg1 a10 = yg1.a(this.zza);
        return a10 == null ? yg1.UNRECOGNIZED : a10;
    }
}