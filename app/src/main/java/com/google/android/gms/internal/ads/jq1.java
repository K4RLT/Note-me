package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class jq1 extends dn1 {
    private static final jq1 zzl;
    private static volatile fo1 zzm;
    private int zza;
    private int zzb;
    private zp1 zzd;
    private bq1 zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private hn1 zzg = en1.f5735y;
    private String zzh = "";
    private kn1 zzj = io1.f7187y;

    static {
        jq1 jq1Var = new jq1();
        zzl = jq1Var;
        dn1.t(jq1.class, jq1Var);
    }

    public static hq1 B() {
        return (hq1) zzl.q();
    }

    public final int A() {
        return this.zzj.size();
    }

    public final /* synthetic */ void C(int i) {
        this.zza |= 1;
        this.zzb = i;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    public final /* synthetic */ void E(zp1 zp1Var) {
        this.zzd = zp1Var;
        this.zza |= 4;
    }

    public final void F(String str) {
        str.getClass();
        kn1 kn1Var = this.zzj;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzj = kn1Var.B(size + size);
        }
        this.zzj.add(str);
    }

    public final /* synthetic */ void G(int i) {
        this.zzi = i - 1;
        this.zza |= 64;
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        byte b10;
        fo1 fo1Var;
        switch (d.b(i)) {
            case 0:
                return Byte.valueOf(this.zzk);
            case 1:
                if (dn1Var == null) {
                    b10 = 0;
                } else {
                    b10 = 1;
                }
                this.zzk = b10;
                return null;
            case 2:
                return new jo1(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", np1.f8807l, "zzj"});
            case 3:
                return new jq1();
            case 4:
                return new bn1(zzl);
            case 5:
                return zzl;
            case 6:
                fo1 fo1Var2 = zzm;
                if (fo1Var2 == null) {
                    synchronized (jq1.class) {
                        try {
                            fo1Var = zzm;
                            if (fo1Var == null) {
                                fo1Var = new cn1(zzl);
                                zzm = fo1Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return fo1Var;
                }
                return fo1Var2;
            default:
                throw null;
        }
    }

    public final String z() {
        return this.zzc;
    }
}
