package com.google.android.gms.internal.measurement;
import q.x;

import java.util.List;

/* loaded from: classes.dex */
public final class y1 extends b5 {
    private static final y1 zzc;
    private static volatile v5 zzd;
    private int zze;
    private int zzf;
    private boolean zzh;
    private String zzg = "";
    private i5 zzi = x5.f13969x;

    static {
        y1 y1Var = new y1();
        zzc = y1Var;
        b5.i(y1.class, y1Var);
    }

    public static y1 r() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.measurement.b5
    public final Object g(int i) {
        v5 v5Var;
        switch (z1.f13990a[i - 1]) {
            case 1:
                return new y1();
            case 2:
                return new a5(zzc);
            case 3:
                return new z5(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", a2.f13630c, "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                v5 v5Var2 = zzd;
                if (v5Var2 == null) {
                    synchronized (y1.class) {
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
                x.h();
                return null;
        }
    }

    public final int p() {
        return this.zzi.size();
    }

    public final int q() {
        int i;
        switch (this.zzf) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final String s() {
        return this.zzg;
    }

    public final List t() {
        return this.zzi;
    }

    public final boolean u() {
        return this.zzh;
    }

    public final boolean v() {
        if ((this.zze & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean w() {
        if ((this.zze & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean x() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }
}
