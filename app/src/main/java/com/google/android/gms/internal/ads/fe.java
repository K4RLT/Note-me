package com.google.android.gms.internal.ads;

import androidx.ink.storage.DecompressedBytes;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class fe extends dn1 {
    private static final fe zzA;
    private static volatile fo1 zzB;
    private int zza;
    private long zzu;
    private long zzv;
    private long zzb = -1;
    private long zzc = -1;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private int zzh = AdError.NETWORK_ERROR_CODE;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = AdError.NETWORK_ERROR_CODE;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private long zzp = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        fe feVar = new fe();
        zzA = feVar;
        dn1.t(fe.class, feVar);
    }

    public static ee z() {
        return (ee) zzA.q();
    }

    public final /* synthetic */ void A(long j10) {
        this.zza |= 1;
        this.zzb = j10;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 2;
        this.zzc = j10;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 4;
        this.zzd = j10;
    }

    public final /* synthetic */ void D(long j10) {
        this.zza |= 8;
        this.zze = j10;
    }

    public final /* synthetic */ void E() {
        this.zza &= -9;
        this.zze = -1L;
    }

    public final /* synthetic */ void F(long j10) {
        this.zza |= 16;
        this.zzf = j10;
    }

    public final /* synthetic */ void G(long j10) {
        this.zza |= 32;
        this.zzg = j10;
    }

    public final /* synthetic */ void H(long j10) {
        this.zza |= 128;
        this.zzi = j10;
    }

    public final /* synthetic */ void I(long j10) {
        this.zza |= 256;
        this.zzj = j10;
    }

    public final /* synthetic */ void J(long j10) {
        this.zza |= 512;
        this.zzk = j10;
    }

    public final /* synthetic */ void K(long j10) {
        this.zza |= 2048;
        this.zzm = j10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zza |= 4096;
        this.zzn = j10;
    }

    public final /* synthetic */ void M(long j10) {
        this.zza |= 8192;
        this.zzo = j10;
    }

    public final /* synthetic */ void N(long j10) {
        this.zza |= 16384;
        this.zzp = j10;
    }

    public final /* synthetic */ void O(long j10) {
        this.zza |= DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY;
        this.zzu = j10;
    }

    public final /* synthetic */ void P(long j10) {
        this.zza |= 65536;
        this.zzv = j10;
    }

    public final /* synthetic */ void Q(long j10) {
        this.zza |= 131072;
        this.zzw = j10;
    }

    public final /* synthetic */ void R(long j10) {
        this.zza |= 262144;
        this.zzx = j10;
    }

    public final /* synthetic */ void S(int i) {
        this.zzh = i - 1;
        this.zza |= 64;
    }

    public final /* synthetic */ void T(int i) {
        this.zzl = i - 1;
        this.zza |= 1024;
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
                                fo1 fo1Var2 = zzB;
                                if (fo1Var2 == null) {
                                    synchronized (fe.class) {
                                        try {
                                            fo1Var = zzB;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzA);
                                                zzB = fo1Var;
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
                        return zzA;
                    }
                    return new bn1(zzA);
                }
                return new fe();
            }
            nd ndVar = nd.f8658m;
            return new jo1(zzA, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", ndVar, "zzi", "zzj", "zzk", "zzl", ndVar, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        return (byte) 1;
    }
}
