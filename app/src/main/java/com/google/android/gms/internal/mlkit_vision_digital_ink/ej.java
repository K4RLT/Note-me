package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ej extends nn implements ho {
    private static final ej zza;
    private static volatile mo zze;
    private xq zzA;
    private vo zzB;
    private int zzf;
    private int zzi;
    private om zzj;
    private om zzk;
    private om zzl;
    private kr zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private long zzq;
    private lm zzr;
    private boolean zzs;
    private un zzt;
    private int zzu;
    private un zzv;
    private int zzw;
    private long zzx;
    private String zzy;
    private un zzz;
    private eo zzC = eo.f14266v;
    private byte zzD = 2;
    private String zzg = "";
    private String zzh = "";

    static {
        ej ejVar = new ej();
        zza = ejVar;
        nn.m(ej.class, ejVar);
    }

    public ej() {
        po poVar = po.f14806y;
        this.zzt = poVar;
        this.zzv = poVar;
        this.zzy = "";
        this.zzz = poVar;
    }

    public static void B(ej ejVar, fh fhVar) {
        un unVar = ejVar.zzt;
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            ejVar.zzt = unVar.f(size + size);
        }
        ejVar.zzt.add(fhVar);
    }

    public static /* synthetic */ void C(ej ejVar, String str) {
        ejVar.zzf |= 1;
        ejVar.zzg = str;
    }

    public static /* synthetic */ void D(ej ejVar, String str) {
        str.getClass();
        ejVar.zzf |= 2;
        ejVar.zzh = str;
    }

    public static fi w() {
        return (fi) zza.f();
    }

    public final un A() {
        return this.zzt;
    }

    public final boolean E() {
        return (this.zzf & 2) != 0;
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
                                this.zzD = b10;
                                return null;
                            }
                            mo moVar2 = zze;
                            if (moVar2 == null) {
                                synchronized (ej.class) {
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
                        return zza;
                    }
                    return new hn(zza);
                }
                return new ej();
            }
            return new qo(zza, "\u0001\u0017\u0000\u0001\u0001\u001f\u0017\u0001\u0003\u0001\u0001ဈ\u0000\u0002Л\u0003ဂ\t\u0006ဈ\u0001\nင\u0002\u000bဂ\n\f᠌\b\rဉ\u000b\u000eဇ\f\u0010င\r\u0011\u001b\u0013᠌\u000e\u0014ဉ\u0003\u0015᠌\u0007\u0016ဉ\u0006\u0017ဂ\u000f\u0019\u001a\u001aဈ\u0010\u001bဉ\u0004\u001cဉ\u0011\u001dဉ\u0005\u001eဉ\u0012\u001f2", new Object[]{"zzf", "zzg", "zzt", fh.class, "zzp", "zzh", "zzi", "zzq", "zzo", hf.f14425z, "zzr", "zzs", "zzu", "zzv", on.class, "zzw", lp.f14628y, "zzj", "zzn", lp.f14617n, "zzm", "zzx", "zzz", "zzy", "zzk", "zzA", "zzl", "zzB", "zzC", si.f14971a});
        }
        return Byte.valueOf(this.zzD);
    }

    public final int t() {
        return this.zzt.size();
    }

    public final int u() {
        return this.zzi;
    }

    public final long v() {
        return this.zzx;
    }

    public final String x() {
        return this.zzg;
    }

    public final String y() {
        return this.zzh;
    }

    public final String z() {
        return this.zzy;
    }
}
