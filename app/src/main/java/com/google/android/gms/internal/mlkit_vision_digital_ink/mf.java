package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class mf extends kn {
    private static final mf zze;
    private static volatile mo zzf;
    private ai zzA;
    private zh zzB;
    private mi zzC;
    private pi zzD;
    private oi zzE;
    private qi zzF;
    private ui zzG;
    private zi zzH;
    private li zzI;
    private jj zzJ;
    private zd zzK;
    private wd zzL;
    private yd zzM;
    private be zzN;
    private ae zzO;
    private de zzP;
    private ee zzQ;
    private fe zzR;
    private ge zzS;
    private he zzT;
    private rd zzU;
    private td zzV;
    private sd zzW;
    private vf zzX;
    private qe zzY;
    private dc zzZ;
    private ud zzaA;
    private le zzaB;
    private ke zzaC;
    private je zzaD;
    private mh zzaE;
    private oh zzaF;
    private nh zzaG;
    private pc zzaH;
    private rh zzaI;
    private sh zzaJ;
    private th zzaK;
    private tc zzaL;
    private ok zzaM;
    private al zzaN;
    private ci zzaO;
    private ei zzaP;
    private gi zzaQ;
    private zc zzaR;
    private qf zzaS;
    private nf zzaT;
    private vh zzaU;
    private xh zzaV;
    private wh zzaW;
    private vc zzaX;
    private bh zzaY;
    private ch zzaZ;
    private fc zzaa;
    private rc zzab;
    private hc zzac;
    private xc zzad;
    private bd zzae;
    private od zzaf;
    private ed zzag;
    private gd zzah;
    private un zzai;
    private un zzaj;
    private nj zzak;
    private uf zzal;
    private yf zzam;
    private vd zzan;
    private pf zzao;
    private wf zzap;
    private jf zzaq;
    private se zzar;
    private re zzas;
    private ue zzat;
    private jg zzau;
    private ig zzav;
    private bc zzaw;
    private cl zzax;
    private el zzay;
    private dl zzaz;
    private df zzbA;
    private lh zzbB;
    private cj zzbC;
    private fj zzbD;
    private dj zzbE;
    private md zzbF;
    private wk zzbG;
    private ze zzbH;
    private ze zzbI;
    private ze zzbJ;
    private ye zzbK;
    private xe zzbL;
    private we zzbM;
    private hk zzbN;
    private ak zzbO;
    private ek zzbP;
    private gk zzbQ;
    private fk zzbR;
    private zj zzbS;
    private yj zzbT;
    private dk zzbU;
    private ck zzbV;
    private vj zzbW;
    private uj zzbX;
    private tj zzbY;
    private qj zzbZ;
    private dh zzba;
    private lc zzbb;
    private yg zzbc;
    private zg zzbd;
    private ah zzbe;
    private jc zzbf;
    private eh zzbg;
    private gh zzbh;
    private hh zzbi;
    private nc zzbj;
    private kk zzbk;
    private zf zzbl;
    private ag zzbm;
    private cg zzbn;
    private aj zzbo;
    private kd zzbp;
    private uk zzbq;
    private wi zzbr;
    private id zzbs;
    private lk zzbt;
    private wg zzbu;
    private kh zzbv;
    private jh zzbw;
    private lh zzbx;
    private lh zzby;
    private df zzbz;
    private pj zzca;
    private oj zzcb;
    private qk zzcc;
    private sk zzcd;
    private pk zzce;
    private byte zzcf = 2;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private zk zzl;
    private int zzm;
    private boolean zzn;
    private int zzo;
    private dg zzp;
    private pe zzq;
    private oe zzr;
    private me zzs;
    private ph zzt;
    private qh zzu;
    private hj zzv;
    private gj zzw;
    private lg zzx;
    private mg zzy;
    private yh zzz;

    static {
        mf mfVar = new mf();
        zze = mfVar;
        nn.m(mf.class, mfVar);
    }

    public mf() {
        po poVar = po.f14806y;
        this.zzai = poVar;
        this.zzaj = poVar;
    }

    public static lf u() {
        return (lf) zze.f();
    }

    public static mf v() {
        return zze;
    }

    public static /* synthetic */ void x(mf mfVar, zk zkVar) {
        mfVar.zzl = zkVar;
        mfVar.zzg |= 1;
    }

    public static /* synthetic */ void y(mf mfVar) {
        mfVar.zzo = 2;
        mfVar.zzg |= 8;
    }

    public static /* synthetic */ void z(mf mfVar, int i) {
        mfVar.zzm = i - 1;
        mfVar.zzg |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.nn
    public final Object q(int i, nn nnVar) {
        mo moVar;
        byte b10;
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (nnVar == null) {
                                    b10 = 0;
                                } else {
                                    b10 = 1;
                                }
                                this.zzcf = b10;
                                return null;
                            }
                            mo moVar2 = zzf;
                            if (moVar2 == null) {
                                synchronized (mf.class) {
                                    try {
                                        moVar = zzf;
                                        if (moVar == null) {
                                            moVar = new in(zze);
                                            zzf = moVar;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return moVar;
                            }
                            return moVar2;
                        }
                        return zze;
                    }
                    return new hn(zze);
                }
                return new mf();
            }
            return new qo(zze, "\u0004\u0096\u0000\u0005\u0001\u0098\u0096\u0000\u0002\u0002\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0004\u0004ဉ\u0006\u0005ဉ\b\u0006ဉ\n\u0007ဉ\f\bဉ\u0019\tဉ\u001a\nဉ\u001b\u000bဉ\u001c\fဉ\u001d\rဉ\u001e\u000eဉ\u001f\u000fဉ \u0010ဉ!\u0011ဉ\"\u0012ဉ\u0010\u0013ဉ\u0016\u0014ဉ\u0005\u0015ဉ\u0017\u0016ဉ\u0018\u0017ဉ#\u0018ဉ$\u0019ဉ%\u001aဉ\u0011\u001bဉ\u0012\u001cဉ\u0013\u001dဉ\u0007\u001eဉ(\u001fဉ) ဉ*!ဉ+\"ဉ,#ဉ-$ဉ.%ဇ\u0002'ဉ&(ဉ')Л*ဉ1,ဉ\u0014-ဉ\u0015.ဉ//ဉ00ဉ\u000e1ဉ\u000f2ဉ23ဉ34ဉ45ဉ56ဉ67ဉ;8ဉ<9ဉ=:ဉ\r;ဉ\t<ဉ7=᠌\u0003>ဉ>?ဉ?@ဉ@AဉABဉBCဉCDဉDEЛFဉEGဉFHဉGIဉHJဉIKဉJLဉKMဉLNဉMOဉ\u000bPဉNQဉORဉPSဉQTဉRUဉ8Vဉ9Wဉ:XဉSYဉTZဉU[ဉV\\ဉW]ဉX^ဉY_ဉZ`ဉ[aဉ\\bဉ]cဉ^dဉ_eဉ`fဉagဉbhဉciဉdjဉekဉflဉgmဉhnဉioဉjpဉkqဉlrဉmsဉntဉouဉpvဉqwဉrxဉsyဉtzဉu{ဉv|ဉw}ဉx~ဉy\u007fဉz\u0080ဉ{\u0081ဉ|\u0082ဉ}\u0083ဉ~\u0084ဉ\u0082\u0085ဉ\u0083\u0086ဉ\u0084\u0087ဉ\u0085\u0088ဉ\u0086\u0089ဉ\u0087\u008aဉ\u0088\u008bဉ\u0089\u008cဉ\u008a\u008dဉ\u008b\u008eဉ\u008c\u008fဉ\u008d\u0090ဉ\u007f\u0091ဉ\u0080\u0092ဉ\u0081\u0093ဉ\u008e\u0094ဉ\u008f\u0095ဉ\u0090\u0096ဉ\u0091\u0097ဉ\u0092\u0098ဉ\u0093", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", hf.f14404c, "zzp", "zzr", "zzt", "zzv", "zzx", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzB", "zzH", "zzq", "zzI", "zzJ", "zzU", "zzV", "zzW", "zzC", "zzD", "zzE", "zzs", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzn", "zzX", "zzY", "zzai", rp.class, "zzak", "zzF", "zzG", "zzag", "zzah", "zzz", "zzA", "zzal", "zzam", "zzan", "zzao", "zzap", "zzau", "zzav", "zzaw", "zzy", "zzu", "zzaq", "zzo", b9.f14078l, "zzax", "zzay", "zzaz", "zzaA", "zzaB", "zzaC", "zzaD", "zzaj", fq.class, "zzaE", "zzaF", "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzw", "zzaN", "zzaO", "zzaP", "zzaQ", "zzaR", "zzar", "zzas", "zzat", "zzaS", "zzaT", "zzaU", "zzaV", "zzaW", "zzaX", "zzaY", "zzaZ", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp", "zzbq", "zzbr", "zzbs", "zzbt", "zzbu", "zzbv", "zzbw", "zzbx", "zzby", "zzbz", "zzbA", "zzbB", "zzbC", "zzbD", "zzbE", "zzbF", "zzbG", "zzbH", "zzbI", "zzbJ", "zzbN", "zzbO", "zzbP", "zzbQ", "zzbR", "zzbS", "zzbT", "zzbU", "zzbV", "zzbW", "zzbX", "zzbY", "zzbK", "zzbL", "zzbM", "zzbZ", "zzca", "zzcb", "zzcc", "zzcd", "zzce"});
        }
        return Byte.valueOf(this.zzcf);
    }

    public final zk w() {
        zk zkVar = this.zzl;
        return zkVar == null ? zk.u() : zkVar;
    }
}
