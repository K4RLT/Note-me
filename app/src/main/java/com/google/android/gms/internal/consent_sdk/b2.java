package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class b2 extends q5 {
    private static final b2 zzb;
    private int zzd;
    private y1 zze;
    private a2 zzg;
    private w1 zzh;
    private t1 zzi;
    private String zzf = "";
    private t5 zzj = k6.f13475y;

    static {
        b2 b2Var = new b2();
        zzb = b2Var;
        q5.k(b2.class, b2Var);
    }

    public static u1 l() {
        return (u1) zzb.g();
    }

    public static void m(b2 b2Var, String str) {
        str.getClass();
        t5 t5Var = b2Var.zzj;
        if (!((d5) t5Var).f13389u) {
            int size = t5Var.size();
            b2Var.zzj = t5Var.f(size + size);
        }
        b2Var.zzj.add(str);
    }

    public static /* synthetic */ void n(b2 b2Var, String str) {
        b2Var.zzd |= 2;
        b2Var.zzf = str;
    }

    public static /* synthetic */ void o(b2 b2Var, t1 t1Var) {
        b2Var.zzi = t1Var;
        b2Var.zzd |= 16;
    }

    public static /* synthetic */ void p(b2 b2Var, w1 w1Var) {
        b2Var.zzh = w1Var;
        b2Var.zzd |= 8;
    }

    public static /* synthetic */ void q(b2 b2Var, y1 y1Var) {
        b2Var.zze = y1Var;
        b2Var.zzd |= 1;
    }

    public static /* synthetic */ void r(b2 b2Var, a2 a2Var) {
        b2Var.zzg = a2Var;
        b2Var.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.q5
    public final Object f(int i) {
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new p5(zzb);
                }
                return new b2();
            }
            return new l6(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
