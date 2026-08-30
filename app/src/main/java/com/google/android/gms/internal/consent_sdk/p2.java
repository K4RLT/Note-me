package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
public final class p2 extends q5 {
    private static final p2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;
    private int zzh;

    static {
        p2 p2Var = new p2();
        zzb = p2Var;
        q5.k(p2.class, p2Var);
    }

    public static o2 l() {
        return (o2) zzb.g();
    }

    public static /* synthetic */ void m(p2 p2Var, b2 b2Var) {
        p2Var.zzf = b2Var;
        p2Var.zze = 38;
    }

    public static /* synthetic */ void n(p2 p2Var, long j10) {
        p2Var.zzd |= 1;
        p2Var.zzg = j10;
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
                return new p2();
            }
            return new l6(zzb, "\u0004\u0019\u0001\u0001\b&\u0019\u0000\u0000\u0000\b<\u0000\tဂ\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001dင\u0001\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000", new Object[]{"zzf", "zze", "zzd", r3.class, "zzg", d4.class, v2.class, b1.class, g3.class, h1.class, n2.class, e1.class, o1.class, y2.class, a3.class, s4.class, y3.class, z4.class, "zzh", y4.class, g4.class, r1.class, o4.class, n4.class, i1.class, b5.class, t4.class, b2.class});
        }
        return (byte) 1;
    }
}
