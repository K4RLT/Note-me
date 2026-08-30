package com.google.android.gms.internal.ads;
import q0.d;

import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class qw0 extends dn1 {
    private static final qw0 zzb;
    private static volatile fo1 zzc;
    private xn1 zza = xn1.f12598v;

    static {
        qw0 qw0Var = new qw0();
        zzb = qw0Var;
        dn1.t(qw0.class, qw0Var);
    }

    public static qw0 B(FileInputStream fileInputStream) {
        qw0 qw0Var = zzb;
        qm1 qm1Var = new qm1(fileInputStream);
        wm1 wm1Var = wm1.f12302a;
        int i = em1.f5727a;
        dn1 l10 = dn1.l(qw0Var, qm1Var, wm1.f12303b);
        dn1.y(l10);
        return (qw0) l10;
    }

    public static qw0 C() {
        return zzb;
    }

    public final Map A() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final xn1 D() {
        xn1 xn1Var = this.zza;
        if (!xn1Var.f12599u) {
            this.zza = xn1Var.a();
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.dn1
    public final Object v(int i, dn1 dn1Var) {
        fo1 fo1Var;
        int b10 = d.b(i);
        if (b10 != 0) {
            if (b10 != 2) {
                if (b10 != 3) {
                    if (b10 != 4) {
                        if (b10 != 5) {
                            if (b10 == 6) {
                                fo1 fo1Var2 = zzc;
                                if (fo1Var2 == null) {
                                    synchronized (qw0.class) {
                                        try {
                                            fo1Var = zzc;
                                            if (fo1Var == null) {
                                                fo1Var = new cn1(zzb);
                                                zzc = fo1Var;
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
                        return zzb;
                    }
                    return new bn1(zzb);
                }
                return new qw0();
            }
            return new jo1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", ow0.f9251a});
        }
        return (byte) 1;
    }

    public final int z() {
        return this.zza.size();
    }
}
