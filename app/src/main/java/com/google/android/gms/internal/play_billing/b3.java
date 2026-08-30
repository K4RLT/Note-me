package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes.dex */
public final class b3 extends r1 {
    private static final b3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private g3 zzh;
    private int zzi;

    static {
        b3 b3Var = new b3();
        zzb = b3Var;
        r1.f(b3.class, b3Var);
    }

    public static /* synthetic */ void p(b3 b3Var, q3 q3Var) {
        b3Var.zzf = q3Var;
        b3Var.zze = 7;
    }

    public static /* synthetic */ void q(b3 b3Var, y3 y3Var) {
        b3Var.zzf = y3Var;
        b3Var.zze = 6;
    }

    public static /* synthetic */ void r(b3 b3Var, int i) {
        b3Var.zzg = i - 1;
        b3Var.zzd |= 1;
    }

    public static a3 s() {
        return (a3) zzb.k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, com.google.android.gms.internal.ads.fm1] */
    public static b3 t(byte[] bArr, k1 k1Var) {
        b3 b3Var = zzb;
        int length = bArr.length;
        if (length != 0) {
            r1 n10 = b3Var.n();
            try {
                p2 a10 = m2.f15489c.a(n10.getClass());
                Object obj = new Object();
                k1Var.getClass();
                a10.c(n10, bArr, 0, length, obj);
                a10.b(n10);
                b3Var = n10;
            } catch (r2 e) {
                androidx.datastore.preferences.protobuf.s1.v(e.getMessage());
                return null;
            } catch (y1 e8) {
                throw e8;
            } catch (IOException e10) {
                if (e10.getCause() instanceof y1) {
                    throw ((y1) e10.getCause());
                }
                throw new IOException(e10.getMessage(), e10);
            } catch (IndexOutOfBoundsException unused) {
                androidx.datastore.preferences.protobuf.s1.v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        if (b3Var != null && !r1.i(b3Var, true)) {
            androidx.datastore.preferences.protobuf.s1.v(new r2().getMessage());
            return null;
        }
        return b3Var;
    }

    public static void v(b3 b3Var, i3 i3Var) {
        b3Var.zzi = i3Var.f15455u;
        b3Var.zzd |= 4;
    }

    public static /* synthetic */ void w(b3 b3Var, g3 g3Var) {
        b3Var.zzh = g3Var;
        b3Var.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.play_billing.r1
    public final Object j(int i) {
        int i10 = i - 1;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            return zzb;
                        }
                        throw null;
                    }
                    return new q1(zzb);
                }
                return new b3();
            }
            return new o2(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", a1.f15372c, "zzh", n3.class, "zzi", a1.e, y3.class, q3.class});
        }
        return (byte) 1;
    }

    public final q3 u() {
        if (this.zze == 7) {
            return (q3) this.zzf;
        }
        return q3.p();
    }
}
