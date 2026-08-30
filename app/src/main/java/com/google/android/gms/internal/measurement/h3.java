package com.google.android.gms.internal.measurement;

import android.os.Build;
import androidx.ink.storage.DecompressedBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class h3 extends b5 {
    private static final h3 zzc;
    private static volatile v5 zzd;
    private String zzaa;
    private long zzab;
    private int zzac;
    private String zzad;
    private String zzae;
    private boolean zzaf;
    private i5 zzag;
    private String zzah;
    private int zzai;
    private int zzaj;
    private int zzak;
    private String zzal;
    private long zzam;
    private long zzan;
    private String zzao;
    private String zzap;
    private int zzaq;
    private String zzar;
    private i3 zzas;
    private g5 zzat;
    private long zzau;
    private long zzav;
    private String zzaw;
    private String zzax;
    private int zzay;
    private boolean zzaz;
    private String zzba;
    private boolean zzbb;
    private d3 zzbc;
    private String zzbd;
    private i5 zzbe;
    private String zzbf;
    private long zzbg;
    private boolean zzbh;
    private String zzbi;
    private boolean zzbj;
    private String zzbk;
    private int zzbl;
    private String zzbm;
    private t2 zzbn;
    private int zzbo;
    private q2 zzbp;
    private int zze;
    private int zzf;
    private int zzg;
    private i5 zzh;
    private i5 zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;

    static {
        h3 h3Var = new h3();
        zzc = h3Var;
        b5.i(h3.class, h3Var);
    }

    public h3() {
        x5 x5Var = x5.f13969x;
        this.zzh = x5Var;
        this.zzi = x5Var;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzt = "";
        this.zzu = "";
        this.zzv = "";
        this.zzy = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = "";
        this.zzag = x5Var;
        this.zzah = "";
        this.zzal = "";
        this.zzao = "";
        this.zzap = "";
        this.zzar = "";
        this.zzat = e5.f13730x;
        this.zzaw = "";
        this.zzax = "";
        this.zzba = "";
        this.zzbd = "";
        this.zzbe = x5Var;
        this.zzbf = "";
        this.zzbi = "";
        this.zzbk = "";
        this.zzbm = "";
    }

    public static void A(h3 h3Var, boolean z3) {
        h3Var.zzf |= 65536;
        h3Var.zzbh = z3;
    }

    public static void B(h3 h3Var) {
        h3Var.zze &= -268435457;
        h3Var.zzal = zzc.zzal;
    }

    public static void B1(h3 h3Var) {
        h3Var.zze |= DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY;
        h3Var.zzx = 97001L;
    }

    public static void C1(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zze |= 512;
        h3Var.zzr = str;
    }

    public static void D1(h3 h3Var) {
        h3Var.zze &= -2097153;
        h3Var.zzad = zzc.zzad;
    }

    public static void F1(h3 h3Var) {
        h3Var.getClass();
        h3Var.zzag = x5.f13969x;
    }

    public static void G1(h3 h3Var, long j10) {
        h3Var.zze |= 524288;
        h3Var.zzab = j10;
    }

    public static void H1(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zze |= 2048;
        h3Var.zzt = str;
    }

    public static void I0(h3 h3Var) {
        h3Var.zzf &= -8193;
        h3Var.zzbd = zzc.zzbd;
    }

    public static void J0(h3 h3Var, int i) {
        h3Var.zzf |= 1048576;
        h3Var.zzbl = i;
    }

    public static void J1(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zze |= 4096;
        h3Var.zzu = str;
    }

    public static void K0(h3 h3Var, long j10) {
        h3Var.zzf |= 32;
        h3Var.zzav = j10;
    }

    public static void L0(h3 h3Var, String str) {
        h3Var.getClass();
        h3Var.zzf |= 128;
        h3Var.zzax = str;
    }

    public static void L1(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zze |= 8192;
        h3Var.zzv = str;
    }

    public static void M0(h3 h3Var, ArrayList arrayList) {
        h3Var.U0();
        m4.b(arrayList, h3Var.zzh);
    }

    public static void N0(h3 h3Var, boolean z3) {
        h3Var.zze |= 131072;
        h3Var.zzz = z3;
    }

    public static void N1(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zze |= 65536;
        h3Var.zzy = str;
    }

    public static void P0(h3 h3Var) {
        h3Var.getClass();
        h3Var.zzh = x5.f13969x;
    }

    public static void P1(h3 h3Var, String str) {
        h3Var.getClass();
        h3Var.zze |= 262144;
        h3Var.zzaa = str;
    }

    public static void Q0(h3 h3Var, int i) {
        h3Var.zzf |= 8388608;
        h3Var.zzbo = i;
    }

    public static void R0(h3 h3Var, long j10) {
        h3Var.zzf |= DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY;
        h3Var.zzbg = j10;
    }

    public static void R1(h3 h3Var, String str) {
        h3Var.getClass();
        h3Var.zze |= 2097152;
        h3Var.zzad = str;
    }

    public static void S0(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zzf |= 8192;
        h3Var.zzbd = str;
    }

    public static void T0(h3 h3Var) {
        h3Var.zze |= 8388608;
        h3Var.zzaf = false;
    }

    public static void T1(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zze |= 4194304;
        h3Var.zzae = str;
    }

    public static void V1(h3 h3Var, String str) {
        h3Var.getClass();
        h3Var.zze |= 16777216;
        h3Var.zzah = str;
    }

    public static void X0(h3 h3Var) {
        h3Var.zze &= -17;
        h3Var.zzm = 0L;
    }

    public static void Y0(h3 h3Var, int i) {
        h3Var.U0();
        h3Var.zzh.remove(i);
    }

    public static void Z0(h3 h3Var, long j10) {
        h3Var.zze |= 2;
        h3Var.zzj = j10;
    }

    public static g3 Z1() {
        return (g3) zzc.k();
    }

    public static void a1(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zzf |= 16384;
        h3Var.zzbf = str;
    }

    public static void b1(h3 h3Var, ArrayList arrayList) {
        i5 i5Var = h3Var.zzag;
        if (!((o4) i5Var).f13871u) {
            h3Var.zzag = b5.e(i5Var);
        }
        m4.b(arrayList, h3Var.zzag);
    }

    public static void d1(h3 h3Var) {
        h3Var.zze &= -33;
        h3Var.zzn = 0L;
    }

    public static void e0(h3 h3Var) {
        h3Var.zze &= Integer.MAX_VALUE;
        h3Var.zzao = zzc.zzao;
    }

    public static void e1(h3 h3Var, int i) {
        h3Var.V0();
        h3Var.zzi.remove(i);
    }

    public static void f0(h3 h3Var, long j10) {
        h3Var.zzf |= 16;
        h3Var.zzau = j10;
    }

    public static void f1(h3 h3Var, long j10) {
        h3Var.zze |= 4;
        h3Var.zzk = j10;
    }

    public static void g0(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zzf |= 4;
        h3Var.zzar = str;
    }

    public static void g1(h3 h3Var, String str) {
        h3Var.getClass();
        h3Var.zzf |= 131072;
        h3Var.zzbi = str;
    }

    public static void h0(h3 h3Var, Set set) {
        i5 i5Var = h3Var.zzbe;
        if (!((o4) i5Var).f13871u) {
            h3Var.zzbe = b5.e(i5Var);
        }
        m4.b(set, h3Var.zzbe);
    }

    public static void i0(h3 h3Var, boolean z3) {
        h3Var.zzf |= 262144;
        h3Var.zzbj = z3;
    }

    public static void i1(h3 h3Var) {
        h3Var.zze &= -257;
        h3Var.zzq = zzc.zzq;
    }

    public static void j0(h3 h3Var) {
        h3Var.zze |= 1;
        h3Var.zzg = 1;
    }

    public static void j1(h3 h3Var, int i) {
        h3Var.zze |= 1024;
        h3Var.zzs = i;
    }

    public static void k1(h3 h3Var, long j10) {
        h3Var.zze |= 8;
        h3Var.zzl = j10;
    }

    public static void l1(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zzf |= 524288;
        h3Var.zzbk = str;
    }

    public static void n1(h3 h3Var) {
        h3Var.getClass();
        h3Var.zze |= 64;
        h3Var.zzo = "android";
    }

    public static void o1(h3 h3Var, int i) {
        h3Var.zze |= 1048576;
        h3Var.zzac = i;
    }

    public static void p1(h3 h3Var, long j10) {
        h3Var.zze |= 16;
        h3Var.zzm = j10;
    }

    public static void q1(h3 h3Var) {
        h3Var.zze &= -65537;
        h3Var.zzy = zzc.zzy;
    }

    public static void r(h3 h3Var, int i) {
        h3Var.zzf |= 2;
        h3Var.zzaq = i;
    }

    public static void s(h3 h3Var, int i, z2 z2Var) {
        h3Var.getClass();
        h3Var.U0();
        h3Var.zzh.set(i, z2Var);
    }

    public static void s1(h3 h3Var) {
        h3Var.zze &= -131073;
        h3Var.zzz = false;
    }

    public static void t(h3 h3Var, int i, o3 o3Var) {
        h3Var.getClass();
        h3Var.V0();
        h3Var.zzi.set(i, o3Var);
    }

    public static void t1(h3 h3Var, int i) {
        h3Var.zze |= 33554432;
        h3Var.zzai = i;
    }

    public static void u(h3 h3Var, long j10) {
        h3Var.zze |= 536870912;
        h3Var.zzam = j10;
    }

    public static void u1(h3 h3Var, long j10) {
        h3Var.zze |= 32;
        h3Var.zzn = j10;
    }

    public static void v(h3 h3Var, q2 q2Var) {
        h3Var.getClass();
        h3Var.zzbp = q2Var;
        h3Var.zzf |= 16777216;
    }

    public static void v1(h3 h3Var, String str) {
        h3Var.getClass();
        str.getClass();
        h3Var.zze |= 128;
        h3Var.zzp = str;
    }

    public static void w(h3 h3Var, t2 t2Var) {
        h3Var.getClass();
        h3Var.zzbn = t2Var;
        h3Var.zzf |= 4194304;
    }

    public static void x(h3 h3Var, z2 z2Var) {
        h3Var.getClass();
        h3Var.U0();
        h3Var.zzh.add(z2Var);
    }

    public static void x1(h3 h3Var) {
        String str = Build.MODEL;
        h3Var.getClass();
        str.getClass();
        h3Var.zze |= 256;
        h3Var.zzq = str;
    }

    public static void y(h3 h3Var, o3 o3Var) {
        h3Var.getClass();
        h3Var.V0();
        h3Var.zzi.add(o3Var);
    }

    public static void y1(h3 h3Var, long j10) {
        h3Var.zze |= 16384;
        h3Var.zzw = j10;
    }

    public static void z(h3 h3Var, ArrayList arrayList) {
        int i;
        List list = h3Var.zzat;
        if (!((o4) list).f13871u) {
            int size = list.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size << 1;
            }
            e5 e5Var = (e5) list;
            if (i >= e5Var.f13732w) {
                h3Var.zzat = new e5(Arrays.copyOf(e5Var.f13731v, i), e5Var.f13732w, true);
            } else {
                q.x.m();
                return;
            }
        }
        m4.b(arrayList, h3Var.zzat);
    }

    public static void z1(h3 h3Var) {
        h3Var.zze &= -262145;
        h3Var.zzaa = zzc.zzaa;
    }

    public final boolean A0() {
        if ((this.zze & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final long A1() {
        return this.zzab;
    }

    public final boolean B0() {
        if ((this.zzf & 8192) != 0) {
            return true;
        }
        return false;
    }

    public final String C() {
        return this.zzaa;
    }

    public final boolean C0() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final String D() {
        return this.zzt;
    }

    public final boolean D0() {
        if ((this.zzf & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0) {
            return true;
        }
        return false;
    }

    public final String E() {
        return this.zzv;
    }

    public final boolean E0() {
        if ((this.zze & 1024) != 0) {
            return true;
        }
        return false;
    }

    public final long E1() {
        return this.zzau;
    }

    public final String F() {
        return this.zzbi;
    }

    public final boolean F0() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String G() {
        return this.zzax;
    }

    public final boolean G0() {
        if ((this.zze & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0) {
            return true;
        }
        return false;
    }

    public final String H() {
        return this.zzbk;
    }

    public final int H0() {
        return this.zzac;
    }

    public final String I() {
        return this.zzq;
    }

    public final long I1() {
        return this.zzl;
    }

    public final String J() {
        return this.zzao;
    }

    public final String K() {
        return this.zzah;
    }

    public final long K1() {
        return this.zzw;
    }

    public final String L() {
        return this.zzae;
    }

    public final String M() {
        return this.zzad;
    }

    public final long M1() {
        return this.zzn;
    }

    public final String N() {
        return this.zzp;
    }

    public final String O() {
        return this.zzo;
    }

    public final int O0() {
        return this.zzbo;
    }

    public final long O1() {
        return this.zzm;
    }

    public final String P() {
        return this.zzy;
    }

    public final String Q() {
        return this.zzbd;
    }

    public final long Q1() {
        return this.zzk;
    }

    public final String R() {
        return this.zzr;
    }

    public final i5 S() {
        return this.zzag;
    }

    public final long S1() {
        return this.zzbg;
    }

    public final i5 T() {
        return this.zzh;
    }

    public final i5 U() {
        return this.zzi;
    }

    public final void U0() {
        i5 i5Var = this.zzh;
        if (!((o4) i5Var).f13871u) {
            this.zzh = b5.e(i5Var);
        }
    }

    public final long U1() {
        return this.zzj;
    }

    public final boolean V() {
        return this.zzbh;
    }

    public final void V0() {
        i5 i5Var = this.zzi;
        if (!((o4) i5Var).f13871u) {
            this.zzi = b5.e(i5Var);
        }
    }

    public final boolean W() {
        return this.zzbj;
    }

    public final int W0() {
        return this.zzh.size();
    }

    public final long W1() {
        return this.zzx;
    }

    public final boolean X() {
        return this.zzz;
    }

    public final q2 X1() {
        q2 q2Var = this.zzbp;
        if (q2Var == null) {
            return q2.C();
        }
        return q2Var;
    }

    public final boolean Y() {
        return this.zzaf;
    }

    public final t2 Y1() {
        t2 t2Var = this.zzbn;
        if (t2Var == null) {
            return t2.s();
        }
        return t2Var;
    }

    public final boolean Z() {
        if ((this.zzf & 16777216) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        if ((this.zze & 33554432) != 0) {
            return true;
        }
        return false;
    }

    public final String a2() {
        return this.zzar;
    }

    public final boolean b0() {
        if ((this.zzf & 4194304) != 0) {
            return true;
        }
        return false;
    }

    public final String b2() {
        return this.zzu;
    }

    public final int c0() {
        return this.zzai;
    }

    public final int c1() {
        return this.zzg;
    }

    public final o3 d0(int i) {
        return (o3) this.zzi.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (p3.f13878a[i - 1]) {
            case 1:
                return new h3();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001>\u0000\u0002\u0001O>\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8", new Object[]{"zze", "zzf", "zzg", "zzh", z2.class, "zzi", o3.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", v2.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", a2.f13632f, "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (h3.class) {
                        try {
                            v5Var = zzd;
                            if (v5Var == null) {
                                v5Var = new c5(6);
                                zzd = v5Var;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return v5Var;
                }
                return v5Var2;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                q.x.h();
                return null;
        }
    }

    public final int h1() {
        return this.zzaq;
    }

    public final boolean k0() {
        if ((this.zze & 1048576) != 0) {
            return true;
        }
        return false;
    }

    public final boolean l0() {
        if ((this.zze & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        if ((this.zzf & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final int m1() {
        return this.zzs;
    }

    public final boolean n0() {
        if ((this.zzf & 128) != 0) {
            return true;
        }
        return false;
    }

    public final boolean o0() {
        if ((this.zzf & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final int p() {
        return this.zzbl;
    }

    public final boolean p0() {
        if ((this.zzf & 8388608) != 0) {
            return true;
        }
        return false;
    }

    public final z2 q(int i) {
        return (z2) this.zzh.get(i);
    }

    public final boolean q0() {
        if ((this.zze & 524288) != 0) {
            return true;
        }
        return false;
    }

    public final boolean r0() {
        if ((this.zzf & 16) != 0) {
            return true;
        }
        return false;
    }

    public final int r1() {
        return this.zzi.size();
    }

    public final boolean s0() {
        if ((this.zze & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean t0() {
        if ((this.zze & 16384) != 0) {
            return true;
        }
        return false;
    }

    public final boolean u0() {
        if ((this.zzf & 262144) != 0) {
            return true;
        }
        return false;
    }

    public final boolean v0() {
        if ((this.zze & 131072) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w0() {
        if ((this.zze & 32) != 0) {
            return true;
        }
        return false;
    }

    public final long w1() {
        return this.zzam;
    }

    public final boolean x0() {
        if ((this.zze & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean y0() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean z0() {
        if ((this.zzf & 2) != 0) {
            return true;
        }
        return false;
    }
}
