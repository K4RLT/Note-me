package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
public final class kv0 extends dn1 {
    private static final kv0 zzf;
    private static volatile fo1 zzg;
    private int zza;
    private hn1 zzb = en1.f5735y;
    private String zzc = "";
    private String zzd = "";
    private String zze = "";

    static {
        kv0 kv0Var = new kv0();
        zzf = kv0Var;
        dn1.t(kv0.class, kv0Var);
    }

    public static jv0 z() {
        return (jv0) zzf.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 1;
        this.zzc = str;
    }

    public final void B(int i) {
        List list = this.zzb;
        if (!((dm1) list).f5462u) {
            int size = list.size();
            this.zzb = ((en1) list).B(size + size);
        }
        ((en1) this.zzb).g(2);
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
                                    synchronized (kv0.class) {
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
                return new kv0();
            }
            return new jo1(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zza", "zzb", nd.f8670y, "zzc", "zzd", "zze"});
        }
        return (byte) 1;
    }
}
