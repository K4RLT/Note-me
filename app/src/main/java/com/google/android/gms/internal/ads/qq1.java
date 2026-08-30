package com.google.android.gms.internal.ads;
import q0.d;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class qq1 extends dn1 {
    private static final qq1 zzQ;
    private static volatile fo1 zzR;
    private oq1 zzA;
    private kn1 zzB;
    private tp1 zzC;
    private String zzD;
    private op1 zzE;
    private kn1 zzF;
    private int zzG;
    private kn1 zzH;
    private kn1 zzI;
    private long zzJ;
    private pq1 zzK;
    private dq1 zzL;
    private String zzM;
    private nq1 zzN;
    private kn1 zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private rp1 zzg;
    private kn1 zzh;
    private kn1 zzi;
    private String zzj;
    private gq1 zzk;
    private boolean zzl;
    private kn1 zzm;
    private String zzn;
    private boolean zzo;
    private boolean zzp;
    private om1 zzu;
    private lq1 zzv;
    private boolean zzw;
    private String zzx;
    private kn1 zzy;
    private kn1 zzz;
    private byte zzP = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        qq1 qq1Var = new qq1();
        zzQ = qq1Var;
        dn1.t(qq1.class, qq1Var);
    }

    public qq1() {
        io1 io1Var = io1.f7187y;
        this.zzh = io1Var;
        this.zzi = io1Var;
        this.zzj = "";
        this.zzm = io1Var;
        this.zzn = "";
        this.zzu = om1.f9167v;
        this.zzx = "";
        this.zzy = io1Var;
        this.zzz = io1Var;
        this.zzB = io1Var;
        this.zzD = "";
        this.zzF = io1Var;
        this.zzH = io1Var;
        this.zzI = io1Var;
        this.zzM = "";
        this.zzO = io1Var;
    }

    public static pp1 C() {
        return (pp1) zzQ.q();
    }

    public final List A() {
        return this.zzh;
    }

    public final String B() {
        return this.zzj;
    }

    public final /* synthetic */ void D(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    public final /* synthetic */ void E(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    public final /* synthetic */ void F(rp1 rp1Var) {
        this.zzg = rp1Var;
        this.zza |= 32;
    }

    public final void G(jq1 jq1Var) {
        kn1 kn1Var = this.zzh;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzh = kn1Var.B(size + size);
        }
        this.zzh.add(jq1Var);
    }

    public final /* synthetic */ void H(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void I() {
        this.zza &= -65;
        this.zzj = zzQ.zzj;
    }

    public final /* synthetic */ void J(gq1 gq1Var) {
        this.zzk = gq1Var;
        this.zza |= 128;
    }

    public final /* synthetic */ void K(lq1 lq1Var) {
        this.zzv = lq1Var;
        this.zza |= 8192;
    }

    public final void L(ArrayList arrayList) {
        kn1 kn1Var = this.zzy;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzy = kn1Var.B(size + size);
        }
        cm1.e(arrayList, this.zzy);
    }

    public final void M(ArrayList arrayList) {
        kn1 kn1Var = this.zzz;
        if (!((dm1) kn1Var).f5462u) {
            int size = kn1Var.size();
            this.zzz = kn1Var.B(size + size);
        }
        cm1.e(arrayList, this.zzz);
    }

    public final /* synthetic */ void N(int i) {
        this.zzb = i - 1;
        this.zza |= 1;
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        byte b10;
        fo1 fo1Var;
        switch (d.b(i)) {
            case 0:
                return Byte.valueOf(this.zzP);
            case 1:
                if (dn1Var == null) {
                    b10 = 0;
                } else {
                    b10 = 1;
                }
                this.zzP = b10;
                return null;
            case 2:
                return new jo1(zzQ, "\u0001$\u0000\u0001\u0001%$\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001d᠌\u0014\u001e\u001b\u001f\u001b ဂ\u0015!ဉ\u0016\"ဉ\u0017#ဈ\u0018$ဉ\u0019%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", jq1.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", np1.f8806k, "zzc", np1.e, "zzg", "zzj", "zzk", "zzu", "zzi", sq1.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", uq1.class, "zzC", "zzD", "zzE", "zzF", up1.class, "zzG", np1.f8810o, "zzH", cq1.class, "zzI", eq1.class, "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", mq1.class});
            case 3:
                return new qq1();
            case 4:
                return new bn1(zzQ);
            case 5:
                return zzQ;
            case 6:
                fo1 fo1Var2 = zzR;
                if (fo1Var2 == null) {
                    synchronized (qq1.class) {
                        try {
                            fo1Var = zzR;
                            if (fo1Var == null) {
                                fo1Var = new cn1(zzQ);
                                zzR = fo1Var;
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
        return this.zzd;
    }
}
