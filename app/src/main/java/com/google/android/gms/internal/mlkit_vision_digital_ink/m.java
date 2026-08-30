package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends nn implements ho {
    private static final m zza;
    private static volatile mo zze;
    private int zzf;
    private int zzj;
    private int zzk;
    private un zzl;
    private long zzm;
    private String zzn;
    private un zzo;
    private om zzp;
    private om zzq;
    private xq zzr;
    private String zzs;
    private byte zzt = 2;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        m mVar = new m();
        zza = mVar;
        nn.m(m.class, mVar);
    }

    public m() {
        po poVar = po.f14806y;
        this.zzl = poVar;
        this.zzn = "";
        this.zzo = poVar;
        this.zzs = "";
    }

    public static void D(m mVar, ArrayList arrayList) {
        un unVar = mVar.zzl;
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            mVar.zzl = unVar.f(size + size);
        }
        km.c(arrayList, mVar.zzl);
    }

    public static void E(m mVar, un unVar) {
        un unVar2 = mVar.zzo;
        if (!((mm) unVar2).f14670u) {
            int size = unVar2.size();
            mVar.zzo = unVar2.f(size + size);
        }
        km.c(unVar, mVar.zzo);
    }

    public static void F(m mVar, ax axVar) {
        un unVar = mVar.zzl;
        if (!((mm) unVar).f14670u) {
            int size = unVar.size();
            mVar.zzl = unVar.f(size + size);
        }
        mVar.zzl.add(axVar);
    }

    public static /* synthetic */ void G(m mVar, String str) {
        mVar.zzf |= 4;
        mVar.zzi = str;
    }

    public static /* synthetic */ void H(m mVar, long j10) {
        mVar.zzf |= 32;
        mVar.zzm = j10;
    }

    public static /* synthetic */ void I(m mVar, om omVar) {
        omVar.getClass();
        mVar.zzq = omVar;
        mVar.zzf |= 256;
    }

    public static /* synthetic */ void J(m mVar, om omVar) {
        omVar.getClass();
        mVar.zzp = omVar;
        mVar.zzf |= 128;
    }

    public static /* synthetic */ void K(m mVar, String str) {
        str.getClass();
        mVar.zzf |= 1;
        mVar.zzg = str;
    }

    public static /* synthetic */ void L(m mVar, String str) {
        str.getClass();
        mVar.zzf |= 1024;
        mVar.zzs = str;
    }

    public static /* synthetic */ void M(m mVar, String str) {
        str.getClass();
        mVar.zzf |= 2;
        mVar.zzh = str;
    }

    public static void N(m mVar, b bVar) {
        mVar.zzk = bVar.f14046u;
        mVar.zzf |= 16;
    }

    public static /* synthetic */ void O(m mVar, String str) {
        mVar.zzf |= 64;
        mVar.zzn = str;
    }

    public static /* synthetic */ void P(m mVar, int i) {
        mVar.zzf |= 8;
        mVar.zzj = i;
    }

    public static gx x() {
        return (gx) zza.f();
    }

    public final String A() {
        return this.zzh;
    }

    public final String B() {
        return this.zzn;
    }

    public final un C() {
        return this.zzl;
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
                                this.zzt = b10;
                                return null;
                            }
                            mo moVar2 = zze;
                            if (moVar2 == null) {
                                synchronized (m.class) {
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
                return new m();
            }
            return new qo(zza, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0002\u0001\u0001ဈ\u0000\u0002Л\u0003ဈ\u0001\u0004င\u0003\u0005᠌\u0004\u0006ဈ\u0002\bဂ\u0005\n\u001a\u000bဉ\u0007\fဈ\u0006\rဉ\b\u000eဉ\t\u000fဈ\n", new Object[]{"zzf", "zzg", "zzl", ax.class, "zzh", "zzj", "zzk", lp.f14627x, "zzi", "zzm", "zzo", "zzp", "zzn", "zzq", "zzr", "zzs"});
        }
        return Byte.valueOf(this.zzt);
    }

    public final int t() {
        return this.zzl.size();
    }

    public final int u() {
        return this.zzj;
    }

    public final long v() {
        return this.zzm;
    }

    public final ax w(int i) {
        return (ax) this.zzl.get(i);
    }

    public final b y() {
        b bVar;
        int i = this.zzk;
        b bVar2 = b.UNSPECIFIED;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        bVar = null;
                    } else {
                        bVar = b.PENDING_CUSTOM_VALIDATION;
                    }
                } else {
                    bVar = b.PENDING;
                }
            } else {
                bVar = b.DOWNLOADED;
            }
        } else {
            bVar = bVar2;
        }
        if (bVar == null) {
            return bVar2;
        }
        return bVar;
    }

    public final String z() {
        return this.zzg;
    }
}
