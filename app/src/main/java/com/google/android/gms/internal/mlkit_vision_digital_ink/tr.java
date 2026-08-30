package com.google.android.gms.internal.mlkit_vision_digital_ink;
import f7.d;

/* loaded from: classes.dex */
public final class tr extends nn implements ho {
    private static final tr zza;
    private static volatile mo zze;
    private xq zzA;
    private vo zzB;
    private String zzD;
    private int zzf;
    private qr zzg;
    private int zzj;
    private om zzk;
    private om zzl;
    private om zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private vr zzr;
    private boolean zzs;
    private un zzt;
    private int zzu;
    private un zzv;
    private int zzw;
    private long zzx;
    private String zzy;
    private un zzz;
    private eo zzC = eo.f14266v;
    private String zzh = "";
    private String zzi = "";

    static {
        tr trVar = new tr();
        zza = trVar;
        nn.m(tr.class, trVar);
    }

    public tr() {
        po poVar = po.f14806y;
        this.zzt = poVar;
        this.zzv = poVar;
        this.zzy = "";
        this.zzz = poVar;
        this.zzD = "";
    }

    public static tr I() {
        return zza;
    }

    public static tr J(byte[] bArr, bn bnVar) {
        nn r8 = nn.r(zza, bArr, bArr.length, bnVar);
        if (r8 != null && !nn.s(r8, true)) {
            androidx.datastore.preferences.protobuf.s1.u(new xo().getMessage());
            return null;
        }
        return (tr) r8;
    }

    public static mo O() {
        return (mo) zza.q(7, null);
    }

    public static void X(tr trVar, Iterable iterable) {
        un unVar = trVar.zzt;
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            trVar.zzt = unVar.f(size + size);
        }
        km.c(iterable, trVar.zzt);
    }

    public static void t(tr trVar) {
        trVar.zzt = po.f14806y;
    }

    public static /* synthetic */ void u(tr trVar, qr qrVar) {
        trVar.zzg = qrVar;
        trVar.zzf |= 1;
    }

    public static /* synthetic */ void v(tr trVar, String str) {
        trVar.zzf |= 524288;
        trVar.zzD = str;
    }

    public final int A() {
        return this.zzt.size();
    }

    public final int B() {
        return this.zzj;
    }

    public final int C() {
        return this.zzu;
    }

    public final long D() {
        return this.zzx;
    }

    public final long E() {
        return this.zzq;
    }

    public final long F() {
        return this.zzp;
    }

    public final or G(int i) {
        return (or) this.zzt.get(i);
    }

    public final qr H() {
        qr qrVar = this.zzg;
        if (qrVar == null) {
            return qr.x();
        }
        return qrVar;
    }

    public final vr K() {
        vr vrVar = this.zzr;
        if (vrVar == null) {
            return vr.u();
        }
        return vrVar;
    }

    public final om L() {
        om omVar = this.zzm;
        if (omVar == null) {
            return om.t();
        }
        return omVar;
    }

    public final om M() {
        om omVar = this.zzl;
        if (omVar == null) {
            return om.t();
        }
        return omVar;
    }

    public final om N() {
        om omVar = this.zzk;
        if (omVar == null) {
            return om.t();
        }
        return omVar;
    }

    public final String P() {
        return this.zzh;
    }

    public final String Q() {
        return this.zzD;
    }

    public final String R() {
        return this.zzi;
    }

    public final String S() {
        return this.zzy;
    }

    public final un T() {
        return this.zzt;
    }

    public final un U() {
        return this.zzv;
    }

    public final un V() {
        return this.zzz;
    }

    public final xq W() {
        xq xqVar = this.zzA;
        if (xqVar == null) {
            return xq.t();
        }
        return xqVar;
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
                                    synchronized (tr.class) {
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
                return new tr();
            }
            return new qo(zza, "\u0001\u0018\u0000\u0001\u0001年皤\u0018\u0001\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003ဂ\t\u0006ဈ\u0002\nင\u0003\u000bဂ\n\f᠌\b\rဉ\u000b\u000eဇ\f\u0010င\r\u0011\u001b\u0013᠌\u000e\u0014ဉ\u0004\u0015᠌\u0007\u0017ဂ\u000f\u0019\u001a\u001aဈ\u0010\u001bဉ\u0005\u001cဉ\u0011\u001dဉ\u0006\u001eဉ\u0012\u001f2Ϩဈ\u0013年皤ဉ\u0000", new Object[]{"zzf", "zzh", "zzt", or.class, "zzp", "zzi", "zzj", "zzq", "zzo", lp.f14621r, "zzr", "zzs", "zzu", "zzv", wr.class, "zzw", lp.f14628y, "zzk", "zzn", lp.f14617n, "zzx", "zzz", "zzy", "zzl", "zzA", "zzm", "zzB", "zzC", sr.f14980a, "zzD", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean w() {
        return this.zzs;
    }

    public final boolean x() {
        return (this.zzf & 32) != 0;
    }

    public final int y() {
        int i = tl.i(this.zzo);
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int z() {
        int d2 = d(this.zzw);
        if (d2 == 0) {
            return 1;
        }
        return d2;
    }
}
