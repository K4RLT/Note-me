package com.google.android.gms.internal.ads;
import q0.d;

import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public final class md extends dn1 {
    private static final md zzu;
    private static volatile fo1 zzv;
    private int zza;
    private long zzc;
    private int zzg;
    private long zzi;
    private long zzl;
    private long zzm;
    private int zzo;
    private int zzp;
    private kn1 zzb = io1.f7187y;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzj = "";
    private String zzk = "";
    private hn1 zzn = en1.f5735y;

    static {
        md mdVar = new md();
        zzu = mdVar;
        dn1.t(md.class, mdVar);
    }

    public static ld z() {
        return (ld) zzu.q();
    }

    public final void A(ud udVar) {
        kn1 kn1Var = this.zzb;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzb = kn1Var.B(size + size);
        }
        this.zzb.add(udVar);
    }

    public final void B() {
        this.zzb = io1.f7187y;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    public final /* synthetic */ void D(String str) {
        String str2 = Build.MODEL;
        str2.getClass();
        this.zza |= 2;
        this.zzd = str2;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zza |= 4;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zza |= 8;
        this.zzf = str;
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzh = str;
    }

    public final /* synthetic */ void H(long j10) {
        this.zza |= 64;
        this.zzi = j10;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zza |= 128;
        this.zzj = str;
    }

    public final /* synthetic */ void J(String str) {
        str.getClass();
        this.zza |= 256;
        this.zzk = str;
    }

    public final /* synthetic */ void K(long j10) {
        this.zza |= 512;
        this.zzl = j10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zza |= 1024;
        this.zzm = j10;
    }

    public final void M(hn1 hn1Var) {
        List list = this.zzn;
        if (!((dm1) list).f5462u) {
            int size = list.size();
            this.zzn = ((en1) list).B(size + size);
        }
        cm1.e(hn1Var, this.zzn);
    }

    public final /* synthetic */ void N(int i) {
        this.zzg = i - 1;
        this.zza |= 16;
    }

    public final void O(int i) {
        this.zzo = i - 2;
        this.zza |= 2048;
    }

    public final /* synthetic */ void P(int i) {
        this.zzp = 1;
        this.zza |= 4096;
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
                                fo1 fo1Var2 = zzv;
                                if (fo1Var2 == null) {
                                    synchronized (md.class) {
                                        try {
                                            fo1Var = zzv;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzu);
                                                zzv = fo1Var;
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
                        return zzu;
                    }
                    return new bn1(zzu);
                }
                return new md();
            }
            return new jo1(zzu, "\u0004\u000f\u0000\u0001\bB\u000f\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'Aဌ\u000bBဌ\f", new Object[]{"zza", "zzb", ud.class, "zzc", "zzd", "zze", "zzf", "zzg", nd.f8651d, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        return (byte) 1;
    }
}
