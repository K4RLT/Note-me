package com.google.android.gms.internal.ads;
import d.b;
import q0.d;

/* loaded from: classes.dex */
public final class mw0 extends dn1 {
    private static final mw0 zzn;
    private static volatile fo1 zzo;
    private int zza;
    private String zzb = "";
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private jn1 zzk;
    private jn1 zzl;
    private jn1 zzm;

    static {
        mw0 mw0Var = new mw0();
        zzn = mw0Var;
        dn1.t(mw0.class, mw0Var);
    }

    public mw0() {
        vn1 vn1Var = vn1.f11956y;
        this.zzk = vn1Var;
        this.zzl = vn1Var;
        this.zzm = vn1Var;
    }

    public static mw0 Q() {
        return zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(long j10) {
        jn1 jn1Var = this.zzm;
        if (!((dm1) jn1Var).f5462u) {
            this.zzm = dn1.k(jn1Var);
        }
        ((vn1) this.zzm).d(j10);
    }

    public final void B() {
        this.zzm = vn1.f11956y;
    }

    public final String C() {
        return this.zzb;
    }

    public final long D() {
        return this.zzc;
    }

    public final int E() {
        return this.zzd;
    }

    public final boolean F() {
        return this.zze;
    }

    public final boolean G() {
        return this.zzf;
    }

    public final long H() {
        return this.zzg;
    }

    public final long I() {
        return this.zzh;
    }

    public final long J() {
        return this.zzi;
    }

    public final boolean K() {
        return (this.zza & 64) != 0;
    }

    public final jn1 L() {
        return this.zzk;
    }

    public final int M() {
        return this.zzk.size();
    }

    public final int N() {
        return this.zzl.size();
    }

    public final jn1 O() {
        return this.zzm;
    }

    public final int P() {
        return this.zzm.size();
    }

    public final /* synthetic */ void R(String str) {
        str.getClass();
        this.zzb = str;
    }

    public final /* synthetic */ void S(long j10) {
        this.zza |= 1;
        this.zzc = j10;
    }

    public final /* synthetic */ void T(int i) {
        this.zza |= 2;
        this.zzd = i;
    }

    public final /* synthetic */ void U() {
        this.zza |= 4;
        this.zze = true;
    }

    public final /* synthetic */ void V(boolean z3) {
        this.zza |= 8;
        this.zzf = true;
    }

    public final /* synthetic */ void W(long j10) {
        this.zza |= 16;
        this.zzg = j10;
    }

    public final /* synthetic */ void X(long j10) {
        this.zzh = j10;
    }

    public final /* synthetic */ void Y(long j10) {
        this.zza |= 32;
        this.zzi = j10;
    }

    public final /* synthetic */ void Z(long j10) {
        this.zza |= 64;
        this.zzj = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a0(long j10) {
        jn1 jn1Var = this.zzk;
        if (!((dm1) jn1Var).f5462u) {
            this.zzk = dn1.k(jn1Var);
        }
        ((vn1) this.zzk).d(j10);
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
                                fo1 fo1Var2 = zzo;
                                if (fo1Var2 == null) {
                                    synchronized (mw0.class) {
                                        try {
                                            fo1Var = zzo;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzn);
                                                zzo = fo1Var;
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
                        return zzn;
                    }
                    return new bn1(zzn);
                }
                return new mw0();
            }
            return new jo1(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        return (byte) 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(long j10) {
        jn1 jn1Var = this.zzl;
        if (!((dm1) jn1Var).f5462u) {
            this.zzl = dn1.k(jn1Var);
        }
        ((vn1) this.zzl).d(j10);
    }
}
