package com.google.android.gms.internal.ads;

import androidx.ink.storage.DecompressedBytes;
import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class je extends dn1 {
    private static final je zzbp;
    private static volatile fo1 zzbq;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzH;
    private long zzI;
    private long zzJ;
    private long zzL;
    private ke zzO;
    private int zza;
    private int zzaA;
    private String zzaB;
    private kn1 zzaC;
    private int zzaD;
    private kn1 zzaE;
    private de zzaF;
    private ce zzaG;
    private String zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private long zzaL;
    private long zzaM;
    private long zzaN;
    private long zzaO;
    private String zzaP;
    private long zzaQ;
    private zd zzaR;
    private ae zzaS;
    private long zzaT;
    private long zzaU;
    private int zzaV;
    private String zzaW;
    private String zzaX;
    private long zzaY;
    private long zzaZ;
    private fe zzag;
    private kn1 zzah;
    private he zzai;
    private long zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private long zzaq;
    private String zzar;
    private long zzas;
    private int zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private se zzax;
    private long zzay;
    private int zzaz;
    private int zzb;
    private int zzba;
    private yd zzbb;
    private boolean zzbc;
    private long zzbd;
    private String zzbe;
    private int zzbf;
    private boolean zzbg;
    private String zzbh;
    private long zzbi;
    private re zzbj;
    private long zzbk;
    private String zzbl;
    private hn1 zzbm;
    private long zzbn;
    private int zzbo;
    private int zzc;
    private int zzd;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zze = "";
    private String zzf = "";
    private String zzu = "";
    private String zzE = "";
    private String zzF = "D";
    private String zzG = "";
    private String zzK = "";
    private long zzM = -1;
    private long zzN = -1;
    private long zzP = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private String zzV = "D";
    private String zzW = "D";
    private long zzX = -1;
    private int zzY = AdError.NETWORK_ERROR_CODE;
    private int zzZ = AdError.NETWORK_ERROR_CODE;
    private long zzaa = -1;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private int zzaf = AdError.NETWORK_ERROR_CODE;

    static {
        je jeVar = new je();
        zzbp = jeVar;
        dn1.t(je.class, jeVar);
    }

    public je() {
        io1 io1Var = io1.f7187y;
        this.zzah = io1Var;
        this.zzaj = -1L;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = -1L;
        this.zzar = "D";
        this.zzas = -1L;
        this.zzay = -1L;
        this.zzaz = AdError.NETWORK_ERROR_CODE;
        this.zzaA = AdError.NETWORK_ERROR_CODE;
        this.zzaB = "D";
        this.zzaC = io1Var;
        this.zzaD = AdError.NETWORK_ERROR_CODE;
        this.zzaE = io1Var;
        this.zzaH = "";
        this.zzaI = -1L;
        this.zzaJ = -1L;
        this.zzaK = -1L;
        this.zzaL = -1L;
        this.zzaO = -1L;
        this.zzaP = "";
        this.zzaT = -1L;
        this.zzaU = -1L;
        this.zzaW = "";
        this.zzaX = "";
        this.zzaY = -1L;
        this.zzaZ = -1L;
        this.zzbe = "";
        this.zzbf = 2;
        this.zzbh = "";
        this.zzbk = -1L;
        this.zzbl = "";
        this.zzbm = en1.f5735y;
        this.zzbn = -1L;
        this.zzbo = AdError.NETWORK_ERROR_CODE;
    }

    public static je A0(byte[] bArr, wm1 wm1Var) {
        return (je) dn1.n(zzbp, bArr, wm1Var);
    }

    public static wd B0() {
        return (wd) zzbp.q();
    }

    public static je C0() {
        return zzbp;
    }

    public final /* synthetic */ void A(long j10) {
        this.zza |= 33554432;
        this.zzH = j10;
    }

    public final /* synthetic */ void B(long j10) {
        this.zza |= 67108864;
        this.zzI = j10;
    }

    public final /* synthetic */ void C(long j10) {
        this.zza |= 134217728;
        this.zzJ = j10;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zza |= 268435456;
        this.zzK = str;
    }

    public final /* synthetic */ void D0(String str) {
        str.getClass();
        this.zza |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void E(long j10) {
        this.zza |= 536870912;
        this.zzL = j10;
    }

    public final /* synthetic */ void E0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void F(long j10) {
        this.zza |= 1073741824;
        this.zzM = j10;
    }

    public final /* synthetic */ void F0(long j10) {
        this.zza |= 4;
        this.zzg = j10;
    }

    public final /* synthetic */ void G(long j10) {
        this.zza |= Integer.MIN_VALUE;
        this.zzN = j10;
    }

    public final /* synthetic */ void G0(long j10) {
        this.zza |= 16;
        this.zzi = j10;
    }

    public final /* synthetic */ void H(long j10) {
        this.zzb |= 2;
        this.zzP = j10;
    }

    public final /* synthetic */ void H0(long j10) {
        this.zza |= 32;
        this.zzj = j10;
    }

    public final /* synthetic */ void I(long j10) {
        this.zzb |= 4;
        this.zzQ = j10;
    }

    public final /* synthetic */ void I0(long j10) {
        this.zza |= 1024;
        this.zzo = j10;
    }

    public final /* synthetic */ void J(long j10) {
        this.zzb |= 8;
        this.zzR = j10;
    }

    public final /* synthetic */ void J0(long j10) {
        this.zza |= 2048;
        this.zzp = j10;
    }

    public final /* synthetic */ void K(long j10) {
        this.zzb |= 16;
        this.zzS = j10;
    }

    public final /* synthetic */ void K0(long j10) {
        this.zza |= 8192;
        this.zzv = j10;
    }

    public final /* synthetic */ void L(long j10) {
        this.zzb |= 32;
        this.zzT = j10;
    }

    public final /* synthetic */ void L0(long j10) {
        this.zza |= 16384;
        this.zzw = j10;
    }

    public final /* synthetic */ void M(long j10) {
        this.zzb |= 64;
        this.zzU = j10;
    }

    public final /* synthetic */ void M0(long j10) {
        this.zza |= DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY;
        this.zzx = j10;
    }

    public final /* synthetic */ void N(String str) {
        str.getClass();
        this.zzb |= 128;
        this.zzV = str;
    }

    public final /* synthetic */ void N0(long j10) {
        this.zza |= 65536;
        this.zzy = j10;
    }

    public final /* synthetic */ void O(String str) {
        str.getClass();
        this.zzb |= 256;
        this.zzW = str;
    }

    public final /* synthetic */ void O0(long j10) {
        this.zza |= 524288;
        this.zzB = j10;
    }

    public final /* synthetic */ void P(long j10) {
        this.zzb |= 4096;
        this.zzaa = j10;
    }

    public final /* synthetic */ void P0(long j10) {
        this.zza |= 1048576;
        this.zzC = j10;
    }

    public final /* synthetic */ void Q(long j10) {
        this.zzb |= 8192;
        this.zzab = j10;
    }

    public final /* synthetic */ void Q0(long j10) {
        this.zza |= 2097152;
        this.zzD = j10;
    }

    public final /* synthetic */ void R(long j10) {
        this.zzb |= 16384;
        this.zzac = j10;
    }

    public final /* synthetic */ void R0(String str) {
        str.getClass();
        this.zza |= 4194304;
        this.zzE = str;
    }

    public final /* synthetic */ void S(fe feVar) {
        this.zzag = feVar;
        this.zzb |= 262144;
    }

    public final void T(fe feVar) {
        kn1 kn1Var = this.zzah;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzah = kn1Var.B(size + size);
        }
        this.zzah.add(feVar);
    }

    public final void U() {
        this.zzah = io1.f7187y;
    }

    public final /* synthetic */ void V(he heVar) {
        this.zzai = heVar;
        this.zzb |= 524288;
    }

    public final /* synthetic */ void W(long j10) {
        this.zzb |= 1048576;
        this.zzaj = j10;
    }

    public final /* synthetic */ void X(long j10) {
        this.zzb |= 2097152;
        this.zzak = j10;
    }

    public final /* synthetic */ void Y(long j10) {
        this.zzb |= 4194304;
        this.zzal = j10;
    }

    public final boolean Z() {
        return (this.zza & 4194304) != 0;
    }

    public final /* synthetic */ void a0(long j10) {
        this.zzb |= 8388608;
        this.zzam = j10;
    }

    public final /* synthetic */ void b0(long j10) {
        this.zzb |= 16777216;
        this.zzan = j10;
    }

    public final /* synthetic */ void c0(long j10) {
        this.zzb |= 67108864;
        this.zzap = j10;
    }

    public final /* synthetic */ void d0(long j10) {
        this.zzb |= 134217728;
        this.zzaq = j10;
    }

    public final /* synthetic */ void e0(String str) {
        str.getClass();
        this.zzb |= 268435456;
        this.zzar = str;
    }

    public final /* synthetic */ void f0(String str) {
        str.getClass();
        this.zzc |= 1024;
        this.zzaH = str;
    }

    public final /* synthetic */ void g0(long j10) {
        this.zzc |= 2048;
        this.zzaI = j10;
    }

    public final /* synthetic */ void h0(long j10) {
        this.zzc |= 4096;
        this.zzaJ = j10;
    }

    public final /* synthetic */ void i0(long j10) {
        this.zzc |= 8192;
        this.zzaK = j10;
    }

    public final /* synthetic */ void j0(long j10) {
        this.zzc |= 16384;
        this.zzaL = j10;
    }

    public final /* synthetic */ void k0(String str) {
        str.getClass();
        this.zzc |= 262144;
        this.zzaP = str;
    }

    public final /* synthetic */ void l0(long j10) {
        this.zzc |= 8388608;
        this.zzaU = j10;
    }

    public final /* synthetic */ void m0(long j10) {
        this.zzd |= 32;
        this.zzbi = j10;
    }

    public final /* synthetic */ void n0(re reVar) {
        reVar.getClass();
        this.zzbj = reVar;
        this.zzd |= 64;
    }

    public final /* synthetic */ void o0(int i) {
        this.zzY = i - 1;
        this.zzb |= 1024;
    }

    public final /* synthetic */ void p0(int i) {
        this.zzZ = i - 1;
        this.zzb |= 2048;
    }

    public final /* synthetic */ void q0(int i) {
        this.zzaf = i - 1;
        this.zzb |= 131072;
    }

    public final /* synthetic */ void r0(int i) {
        this.zzaz = i - 1;
        this.zzc |= 16;
    }

    public final /* synthetic */ void s0(int i) {
        this.zzaA = i - 1;
        this.zzc |= 32;
    }

    public final /* synthetic */ void t0(int i) {
        this.zzaV = i - 1;
        this.zzc |= 16777216;
    }

    public final String u0() {
        return this.zzE;
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
                                fo1 fo1Var2 = zzbq;
                                if (fo1Var2 == null) {
                                    synchronized (je.class) {
                                        try {
                                            fo1Var = zzbq;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzbp);
                                                zzbq = fo1Var;
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
                        return zzbp;
                    }
                    return new bn1(zzbp);
                }
                return new je();
            }
            nd ndVar = nd.f8653g;
            nd ndVar2 = nd.f8658m;
            return new jo1(zzbp, "\u0001o\u0000\u0004\u0001Įo\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ`\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈa\u0019ဂe\u001a᠌b\u001bဈ\u0016\u001cဇc\u001dဈ\u0018\u001eဈd\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈJSဂKTဂLUဂMVဂNWဂOXဂQYဈRZဉT[ဉU\\ဂV]ဂW^᠌X_᠌@`ဉIaဂPbဈYcဈZdဂ[eဂ\\f᠌]gဂShဉ^iဇ_j'kဂil᠌jÉဉfĭဂgĮဈh", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzbd", "zzC", "zzD", "zzbe", "zzbi", "zzbf", ndVar, "zzE", "zzbg", "zzG", "zzbh", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzah", fe.class, "zzT", "zzU", "zzV", "zzW", "zzY", ndVar2, "zzZ", ndVar2, "zzag", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", ndVar2, "zzai", "zzaj", "zzak", "zzal", "zzam", "zzap", "zzaq", "zzas", "zzat", nd.f8657l, "zzau", nd.f8659n, "zzar", "zzaw", nd.f8652f, "zzax", "zzay", "zzan", "zzao", "zzaz", ndVar2, "zzX", "zzF", "zzaA", ndVar2, "zzaB", "zzaC", be.class, "zzaD", ndVar2, "zzaE", xd.class, "zzaF", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaO", "zzaP", "zzaR", "zzaS", "zzaT", "zzaU", "zzaV", nd.f8655j, "zzav", nd.f8654h, "zzaG", "zzaN", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", nd.f8656k, "zzaQ", "zzbb", "zzbc", "zzbm", "zzbn", "zzbo", ndVar2, "zzbj", "zzbk", "zzbl"});
        }
        return (byte) 1;
    }

    public final boolean v0() {
        return (this.zzb & 1048576) != 0;
    }

    public final long w0() {
        return this.zzaj;
    }

    public final long x0() {
        return this.zzan;
    }

    public final boolean y0() {
        return (this.zzd & 64) != 0;
    }

    public final /* synthetic */ void z(String str) {
        str.getClass();
        this.zza |= 16777216;
        this.zzG = str;
    }

    public final re z0() {
        re reVar = this.zzbj;
        if (reVar == null) {
            return re.D();
        }
        return reVar;
    }
}
