package com.google.android.gms.internal.ads;
import q0.d;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class uj extends dn1 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final uj zzv;
    private static volatile fo1 zzw;
    private int zzi;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzp;
    private int zzu;
    private kn1 zzj = io1.f7187y;
    private String zzn = "";
    private String zzo = "";

    static {
        uj ujVar = new uj();
        zzv = ujVar;
        dn1.t(uj.class, ujVar);
    }

    public static sj z() {
        return (sj) zzv.q();
    }

    public final void A(ArrayList arrayList) {
        kn1 kn1Var = this.zzj;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzj = kn1Var.B(size + size);
        }
        cm1.e(arrayList, this.zzj);
    }

    public final void B(int i) {
        this.zzi |= 1;
        this.zzk = i;
    }

    public final void C(int i) {
        this.zzi |= 2;
        this.zzl = i;
    }

    public final void D(long j10) {
        this.zzi |= 4;
        this.zzm = j10;
    }

    public final void E(String str) {
        str.getClass();
        this.zzi |= 8;
        this.zzn = str;
    }

    public final void F() {
        String str = Build.MODEL;
        str.getClass();
        this.zzi |= 16;
        this.zzo = str;
    }

    public final void G(long j10) {
        this.zzi |= 32;
        this.zzp = j10;
    }

    public final void H(int i) {
        this.zzi |= 64;
        this.zzu = i;
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
                                fo1 fo1Var2 = zzw;
                                if (fo1Var2 == null) {
                                    synchronized (uj.class) {
                                        try {
                                            fo1Var = zzw;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzv);
                                                zzw = fo1Var;
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
                        return zzv;
                    }
                    return new bn1(zzv);
                }
                return new uj();
            }
            return new jo1(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzi", "zzj", rj.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu"});
        }
        return (byte) 1;
    }
}
