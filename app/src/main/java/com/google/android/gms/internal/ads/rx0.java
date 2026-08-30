package com.google.android.gms.internal.ads;
import q0.d;

/* loaded from: classes.dex */
public final class rx0 extends dn1 {
    private static final rx0 zzE;
    private static volatile fo1 zzF;
    private boolean zzC;
    private boolean zzD;
    private int zza;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzh;
    private ux0 zzj;
    private boolean zzk;
    private wx0 zzn;
    private int zzc = 1;
    private boolean zzd = true;
    private String zzg = "unknown_host";
    private boolean zzi = true;
    private long zzl = 100;
    private long zzm = 2000;
    private long zzo = 10;
    private long zzp = 100;
    private long zzu = 20000;
    private String zzv = "";
    private String zzw = "";
    private long zzx = 500;
    private long zzy = 3000;
    private boolean zzz = true;
    private boolean zzA = true;
    private boolean zzB = true;

    static {
        rx0 rx0Var = new rx0();
        zzE = rx0Var;
        dn1.t(rx0.class, rx0Var);
    }

    public static qx0 j0() {
        return (qx0) zzE.q();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zza |= 32;
        this.zzg = str;
    }

    public final /* synthetic */ void B(ux0 ux0Var) {
        this.zzj = ux0Var;
        this.zza |= 256;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 1024;
        this.zzl = j10;
    }

    public final /* synthetic */ void D(long j10) {
        this.zza |= 2048;
        this.zzm = j10;
    }

    public final /* synthetic */ void E(wx0 wx0Var) {
        this.zzn = wx0Var;
        this.zza |= 4096;
    }

    public final /* synthetic */ void F(long j10) {
        this.zza |= 524288;
        this.zzy = j10;
    }

    public final /* synthetic */ void G(boolean z3) {
        this.zza |= 1048576;
        this.zzz = z3;
    }

    public final /* synthetic */ void H(boolean z3) {
        this.zza |= 16777216;
        this.zzD = z3;
    }

    public final int I() {
        int c10 = b80.c(this.zzb);
        if (c10 == 0) {
            return 1;
        }
        return c10;
    }

    public final int J() {
        int c10 = b80.c(this.zzc);
        if (c10 == 0) {
            return 2;
        }
        return c10;
    }

    public final int K() {
        int i = this.zzh;
        int i10 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final /* synthetic */ void L(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    public final void M() {
        this.zzh = 1;
        this.zza |= 64;
    }

    public final boolean N() {
        return this.zzd;
    }

    public final boolean O() {
        return this.zze;
    }

    public final boolean P() {
        return this.zzf;
    }

    public final String Q() {
        return this.zzg;
    }

    public final boolean R() {
        return this.zzi;
    }

    public final ux0 S() {
        ux0 ux0Var = this.zzj;
        if (ux0Var == null) {
            return ux0.E();
        }
        return ux0Var;
    }

    public final boolean T() {
        return this.zzk;
    }

    public final long U() {
        return this.zzl;
    }

    public final long V() {
        return this.zzm;
    }

    public final wx0 W() {
        wx0 wx0Var = this.zzn;
        if (wx0Var == null) {
            return wx0.H();
        }
        return wx0Var;
    }

    public final long X() {
        return this.zzo;
    }

    public final long Y() {
        return this.zzp;
    }

    public final long Z() {
        return this.zzu;
    }

    public final String a0() {
        return this.zzv;
    }

    public final String b0() {
        return this.zzw;
    }

    public final long c0() {
        return this.zzx;
    }

    public final long d0() {
        return this.zzy;
    }

    public final boolean e0() {
        return this.zzz;
    }

    public final boolean f0() {
        return this.zzA;
    }

    public final boolean g0() {
        return this.zzB;
    }

    public final boolean h0() {
        return this.zzC;
    }

    public final boolean i0() {
        return this.zzD;
    }

    public final /* synthetic */ void k0(boolean z3) {
        this.zza |= 4;
        this.zzd = z3;
    }

    public final /* synthetic */ void l0(boolean z3) {
        this.zza |= 8;
        this.zze = z3;
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
                                fo1 fo1Var2 = zzF;
                                if (fo1Var2 == null) {
                                    synchronized (rx0.class) {
                                        try {
                                            fo1Var = zzF;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzE);
                                                zzF = fo1Var;
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
                        return zzE;
                    }
                    return new bn1(zzE);
                }
                return new rx0();
            }
            nd ndVar = nd.A;
            return new jo1(zzE, "\u0004\u0019\u0000\u0001\u0001\u001a\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006\u001aဇ\u0018", new Object[]{"zza", "zzb", ndVar, "zzg", "zzi", "zzj", "zzk", "zzm", "zzn", "zzd", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzl", "zzA", "zzB", "zzC", "zzc", ndVar, "zze", "zzf", "zzh", "zzD"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void z(boolean z3) {
        this.zza |= 16;
        this.zzf = z3;
    }
}
