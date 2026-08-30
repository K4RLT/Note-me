package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

import com.facebook.ads.AdError;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class gl extends dn1 {
    private static final gl zzF;
    private static volatile fo1 zzG = null;
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private oj zzA;
    private mj zzB;
    private uj zzC;
    private vk zzD;
    private nk zzE;
    private int zzn;
    private int zzo;
    private int zzu;
    private bk zzw;
    private dl zzy;
    private el zzz;
    private String zzp = "";
    private int zzv = AdError.NETWORK_ERROR_CODE;
    private jn1 zzx = vn1.f11956y;

    static {
        gl glVar = new gl();
        zzF = glVar;
        dn1.t(gl.class, glVar);
    }

    public static fl K() {
        return (fl) zzF.q();
    }

    public final void A(String str) {
        str.getClass();
        this.zzn |= 2;
        this.zzp = str;
    }

    public final mj B() {
        mj mjVar = this.zzB;
        if (mjVar == null) {
            return mj.z();
        }
        return mjVar;
    }

    public final void C(nk nkVar) {
        this.zzE = nkVar;
        this.zzn |= 2048;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(ArrayList arrayList) {
        jn1 jn1Var = this.zzx;
        if (!((dm1) jn1Var).f5462u) {
            this.zzx = dn1.k(jn1Var);
        }
        cm1.e(arrayList, this.zzx);
    }

    public final void E() {
        this.zzx = vn1.f11956y;
    }

    public final void F(dl dlVar) {
        this.zzy = dlVar;
        this.zzn |= 32;
    }

    public final void G(mj mjVar) {
        this.zzB = mjVar;
        this.zzn |= 256;
    }

    public final void H(uj ujVar) {
        this.zzC = ujVar;
        this.zzn |= 512;
    }

    public final void I(vk vkVar) {
        this.zzD = vkVar;
        this.zzn |= 1024;
    }

    public final String J() {
        return this.zzp;
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
                                fo1 fo1Var2 = zzG;
                                if (fo1Var2 == null) {
                                    synchronized (gl.class) {
                                        try {
                                            fo1Var = zzG;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzF);
                                                zzG = fo1Var;
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
                        return zzF;
                    }
                    return new bn1(zzF);
                }
                return new gl();
            }
            return new jo1(zzF, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzn", "zzo", "zzp", "zzu", "zzv", nd.f8669x, "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE"});
        }
        return (byte) 1;
    }

    public final dl z() {
        dl dlVar = this.zzy;
        if (dlVar == null) {
            return dl.z();
        }
        return dlVar;
    }
}
