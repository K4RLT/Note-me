package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class os extends nn implements ho {
    private static final os zza;
    private static volatile mo zze;
    private int zzf;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private int zzl;
    private String zzg = "";
    private String zzk = "";

    static {
        os osVar = new os();
        zza = osVar;
        nn.m(os.class, osVar);
    }

    public static /* synthetic */ void B(os osVar) {
        osVar.zzf |= 4;
        osVar.zzi = true;
    }

    public static /* synthetic */ void C(os osVar, String str) {
        str.getClass();
        osVar.zzf |= 16;
        osVar.zzk = str;
    }

    public static /* synthetic */ void D(os osVar, int i) {
        osVar.zzf |= 32;
        osVar.zzl = i;
    }

    public static /* synthetic */ void E(os osVar, String str) {
        osVar.zzf |= 1;
        osVar.zzg = str;
    }

    public static void F(os osVar, ds dsVar) {
        osVar.zzh = dsVar.f14212u;
        osVar.zzf |= 2;
    }

    public static /* synthetic */ void G(os osVar, long j10) {
        osVar.zzf |= 8;
        osVar.zzj = j10;
    }

    public static ns w() {
        return (ns) zza.f();
    }

    public static os x() {
        return zza;
    }

    public static mo y() {
        return (mo) zza.q(7, null);
    }

    public final String A() {
        return this.zzg;
    }

    public final boolean H() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.nn
    public final Object q(int i, nn nnVar) {
        mo moVar;
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 == 6) {
                                mo moVar2 = zze;
                                if (moVar2 == null) {
                                    synchronized (os.class) {
                                        try {
                                            moVar = zze;
                                            if (moVar == null) {
                                                moVar = new in(zza);
                                                zze = moVar;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return moVar;
                                }
                                return moVar2;
                            }
                            throw null;
                        }
                        return zza;
                    }
                    return new hn(zza);
                }
                return new os();
            }
            return new qo(zza, "\u0001\u0006\u0000\u0001\u0004\u000b\u0006\u0000\u0000\u0000\u0004ဈ\u0000\u0005᠌\u0001\bဇ\u0002\tဂ\u0003\nဈ\u0004\u000bင\u0005", new Object[]{"zzf", "zzg", "zzh", lp.f14626w, "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final int t() {
        return this.zzl;
    }

    public final long u() {
        return this.zzj;
    }

    public final ds v() {
        ds dsVar;
        int i = this.zzh;
        ds dsVar2 = ds.NONE;
        switch (i) {
            case 0:
                dsVar = dsVar2;
                break;
            case 1:
                dsVar = ds.SUBSCRIBED;
                break;
            case 2:
                dsVar = ds.DOWNLOAD_IN_PROGRESS;
                break;
            case 3:
                dsVar = ds.DOWNLOAD_FAILED;
                break;
            case 4:
                dsVar = ds.DOWNLOAD_COMPLETE;
                break;
            case 5:
                dsVar = ds.INTERNAL_ERROR;
                break;
            case 6:
                dsVar = ds.CORRUPTED;
                break;
            default:
                dsVar = null;
                break;
        }
        if (dsVar == null) {
            return dsVar2;
        }
        return dsVar;
    }

    public final String z() {
        return this.zzk;
    }
}
