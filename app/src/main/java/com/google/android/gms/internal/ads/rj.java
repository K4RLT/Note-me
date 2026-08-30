package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class rj extends dn1 {
    private static final rj zzG;
    private static volatile fo1 zzH = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final in1 zzx = new s6(26);
    private int zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private long zzF;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzu;
    private long zzv;
    private hn1 zzw = en1.f5735y;
    private oj zzy;
    private int zzz;

    static {
        rj rjVar = new rj();
        zzG = rjVar;
        dn1.t(rj.class, rjVar);
    }

    public static rj O(byte[] bArr) {
        rj rjVar = zzG;
        int length = bArr.length;
        wm1 wm1Var = wm1.f12302a;
        int i = em1.f5727a;
        dn1 x9 = dn1.x(rjVar, bArr, length, wm1.f12303b);
        dn1.y(x9);
        return (rj) x9;
    }

    public static qj P() {
        return (qj) zzG.q();
    }

    public final void A(int i) {
        this.zzp = a5.a.b(i);
        this.zzn |= 2;
    }

    public final void B(long j10) {
        this.zzn |= 4;
        this.zzu = j10;
    }

    public final void C(long j10) {
        this.zzn |= 8;
        this.zzv = j10;
    }

    public final void D(ArrayList arrayList) {
        List list = this.zzw;
        if (!((dm1) list).f5462u) {
            int size = list.size();
            this.zzw = ((en1) list).B(size + size);
        }
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            ((en1) this.zzw).g(((wk) obj).f12259u);
        }
    }

    public final void E(oj ojVar) {
        this.zzy = ojVar;
        this.zzn |= 16;
    }

    public final void F(int i) {
        this.zzz = a5.a.b(i);
        this.zzn |= 32;
    }

    public final void G(int i) {
        this.zzA = a5.a.b(i);
        this.zzn |= 64;
    }

    public final void H(int i) {
        this.zzB = a5.a.b(i);
        this.zzn |= 128;
    }

    public final void I(int i) {
        this.zzn |= 256;
        this.zzC = i;
    }

    public final void J(int i) {
        this.zzD = a5.a.b(i);
        this.zzn |= 512;
    }

    public final void K(tj tjVar) {
        this.zzE = tjVar.f11357u;
        this.zzn |= 1024;
    }

    public final void L(long j10) {
        this.zzn |= 2048;
        this.zzF = j10;
    }

    public final long M() {
        return this.zzo;
    }

    public final int N() {
        int i;
        int i10 = this.zzp;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 1000) {
                    i = 0;
                } else {
                    i = 3;
                }
            } else {
                i = 2;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
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
                                fo1 fo1Var2 = zzH;
                                if (fo1Var2 == null) {
                                    synchronized (rj.class) {
                                        try {
                                            fo1Var = zzH;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzG);
                                                zzH = fo1Var;
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
                        return zzG;
                    }
                    return new bn1(zzG);
                }
                return new rj();
            }
            nd ndVar = nd.f8669x;
            return new jo1(zzG, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzn", "zzo", "zzp", ndVar, "zzu", "zzv", "zzw", nd.f8667v, "zzy", "zzz", ndVar, "zzA", ndVar, "zzB", ndVar, "zzC", "zzD", ndVar, "zzE", nd.f8664s, "zzF"});
        }
        return (byte) 1;
    }

    public final void z(long j10) {
        this.zzn |= 1;
        this.zzo = j10;
    }
}
