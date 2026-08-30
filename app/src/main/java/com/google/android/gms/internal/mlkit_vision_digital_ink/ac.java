package com.google.android.gms.internal.mlkit_vision_digital_ink;
import zb.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ac extends nn implements ho {
    public static final mn zza;
    private static final ac zze;
    private static volatile mo zzf;
    private int zzg;
    private int zzh;
    private yb zzi;
    private sb zzj;
    private rb zzk;
    private ub zzl;
    private wb zzm;
    private jb zzn;
    private long zzo;
    private nb zzp;
    private lb zzq;
    private tn zzr = pn.f14802y;

    static {
        ac acVar = new ac();
        zze = acVar;
        nn.m(ac.class, acVar);
        zza = new mn(mf.v(), acVar, acVar, new ln(43, gp.f14375y));
    }

    public static /* synthetic */ void A(ac acVar, sb sbVar) {
        sbVar.getClass();
        acVar.zzj = sbVar;
        acVar.zzg |= 4;
    }

    public static /* synthetic */ void B(ac acVar, nb nbVar) {
        acVar.zzp = nbVar;
        acVar.zzg |= 256;
    }

    public static /* synthetic */ void C(ac acVar, yb ybVar) {
        acVar.zzi = ybVar;
        acVar.zzg |= 2;
    }

    public static /* synthetic */ void D(ac acVar, ub ubVar) {
        acVar.zzl = ubVar;
        acVar.zzg |= 16;
    }

    public static void E(ac acVar, zb zbVar) {
        acVar.zzh = zbVar.f15348u;
        acVar.zzg |= 1;
    }

    public static kb t() {
        return (kb) zze.f();
    }

    public static void v(ac acVar, ArrayList arrayList) {
        List list = acVar.zzr;
        if (!((mm) list).f14670u) {
            int size = list.size();
            acVar.zzr = ((pn) list).f(size + size);
        }
        km.c(arrayList, acVar.zzr);
    }

    public static /* synthetic */ void w(ac acVar) {
        acVar.zzn = null;
        acVar.zzg &= -65;
    }

    public static /* synthetic */ void x(ac acVar, jb jbVar) {
        acVar.zzn = jbVar;
        acVar.zzg |= 64;
    }

    public static /* synthetic */ void y(ac acVar, long j10) {
        acVar.zzg |= 128;
        acVar.zzo = j10;
    }

    public static /* synthetic */ void z(ac acVar, rb rbVar) {
        acVar.zzk = rbVar;
        acVar.zzg |= 8;
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
                                mo moVar2 = zzf;
                                if (moVar2 == null) {
                                    synchronized (ac.class) {
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
                            throw null;
                        }
                        return zze;
                    }
                    return new hn(zze);
                }
                return new ac();
            }
            return new qo(zze, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဃ\u0007\u0006ဉ\u0006\u0007ဉ\u0004\bဉ\u0005\tဉ\b\nဉ\t\u000b\u0016", new Object[]{"zzg", "zzh", b9.f14073f, "zzi", "zzj", "zzk", "zzo", "zzn", "zzl", "zzm", "zzp", "zzq", "zzr"});
        }
        return (byte) 1;
    }

    public final zb u() {
        zb a10 = zb.a(this.zzh);
        return a10 == null ? zb.UNKNOWN_ERROR : a10;
    }
}
