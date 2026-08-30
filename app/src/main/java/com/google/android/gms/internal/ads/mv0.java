package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class mv0 extends dn1 {
    private static final mv0 zzf;
    private static volatile fo1 zzg;
    private int zza;
    private int zzb;
    private String zzc = "";
    private String zzd = "";
    private kv0 zze;

    static {
        mv0 mv0Var = new mv0();
        zzf = mv0Var;
        dn1.t(mv0.class, mv0Var);
    }

    public static lv0 z() {
        return (lv0) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void B(kv0 kv0Var) {
        this.zze = kv0Var;
        this.zza |= 8;
    }

    public final /* synthetic */ void C(int i) {
        this.zzb = 1;
        this.zza = 1 | this.zza;
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
                                    synchronized (mv0.class) {
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
                return new mv0();
            }
            return new jo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zza", "zzb", nd.f8671z, "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
