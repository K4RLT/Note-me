package com.google.android.gms.internal.measurement;
import b6.e;
import g5.q;
import q.b;
import q.x;
import x.h;

import android.os.UserManager;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a4 {

    /* renamed from: a, reason: collision with root package name */
    public static UserManager f13636a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f13637b = false;

    public static int A(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e5) {
            e5 e5Var = (e5) list;
            int i10 = 0;
            while (i < size) {
                i10 += t4.t(e5Var.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += t4.t(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static void B(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            int i10 = 0;
            if (list instanceof e5) {
                e5 e5Var = (e5) list;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < e5Var.f13732w; i12++) {
                        e5Var.a(i12);
                        Logger logger = t4.e;
                        i11 += 4;
                    }
                    t4Var.n(i11);
                    while (i10 < e5Var.f13732w) {
                        t4Var.b(e5Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < e5Var.f13732w) {
                    t4Var.c(i, e5Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                t4Var.o(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    Logger logger2 = t4.e;
                    i13 += 4;
                }
                t4Var.n(i13);
                while (i10 < list.size()) {
                    t4Var.b(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                t4Var.c(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static int C(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n5) {
            n5 n5Var = (n5) list;
            int i10 = 0;
            while (i < size) {
                i10 += t4.r(n5Var.b(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += t4.r(((Long) list.get(i)).longValue());
            i++;
        }
        return i11;
    }

    public static void D(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            int i10 = 0;
            if (list instanceof n5) {
                n5 n5Var = (n5) list;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < n5Var.f13861w; i12++) {
                        n5Var.b(i12);
                        Logger logger = t4.e;
                        i11 += 8;
                    }
                    t4Var.n(i11);
                    while (i10 < n5Var.f13861w) {
                        t4Var.e(n5Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < n5Var.f13861w) {
                    t4Var.d(i, n5Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                t4Var.o(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    Logger logger2 = t4.e;
                    i13 += 8;
                }
                t4Var.n(i13);
                while (i10 < list.size()) {
                    t4Var.e(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                t4Var.d(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void E(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            int i10 = 0;
            if (list instanceof e5) {
                e5 e5Var = (e5) list;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < e5Var.f13732w; i12++) {
                        int a10 = e5Var.a(i12);
                        i11 += t4.t((a10 >> 31) ^ (a10 << 1));
                    }
                    t4Var.n(i11);
                    while (i10 < e5Var.f13732w) {
                        int a11 = e5Var.a(i10);
                        t4Var.n((a11 >> 31) ^ (a11 << 1));
                        i10++;
                    }
                    return;
                }
                while (i10 < e5Var.f13732w) {
                    int a12 = e5Var.a(i10);
                    t4Var.q(i, (a12 >> 31) ^ (a12 << 1));
                    i10++;
                }
                return;
            }
            if (z3) {
                t4Var.o(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    int intValue = ((Integer) list.get(i14)).intValue();
                    i13 += t4.t((intValue >> 31) ^ (intValue << 1));
                }
                t4Var.n(i13);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    t4Var.n((intValue2 >> 31) ^ (intValue2 << 1));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                t4Var.q(i, (intValue3 >> 31) ^ (intValue3 << 1));
                i10++;
            }
        }
    }

    public static void F(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            int i10 = 0;
            if (list instanceof n5) {
                n5 n5Var = (n5) list;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < n5Var.f13861w; i12++) {
                        long b10 = n5Var.b(i12);
                        i11 += t4.r((b10 >> 63) ^ (b10 << 1));
                    }
                    t4Var.n(i11);
                    while (i10 < n5Var.f13861w) {
                        long b11 = n5Var.b(i10);
                        t4Var.l((b11 >> 63) ^ (b11 << 1));
                        i10++;
                    }
                    return;
                }
                while (i10 < n5Var.f13861w) {
                    long b12 = n5Var.b(i10);
                    t4Var.k(i, (b12 >> 63) ^ (b12 << 1));
                    i10++;
                }
                return;
            }
            if (z3) {
                t4Var.o(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    long longValue = ((Long) list.get(i14)).longValue();
                    i13 += t4.r((longValue >> 63) ^ (longValue << 1));
                }
                t4Var.n(i13);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    t4Var.l((longValue2 >> 63) ^ (longValue2 << 1));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                t4Var.k(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i10++;
            }
        }
    }

    public static void G(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            int i10 = 0;
            if (list instanceof e5) {
                e5 e5Var = (e5) list;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < e5Var.f13732w; i12++) {
                        i11 += t4.t(e5Var.a(i12));
                    }
                    t4Var.n(i11);
                    while (i10 < e5Var.f13732w) {
                        t4Var.n(e5Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < e5Var.f13732w) {
                    t4Var.q(i, e5Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                t4Var.o(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += t4.t(((Integer) list.get(i14)).intValue());
                }
                t4Var.n(i13);
                while (i10 < list.size()) {
                    t4Var.n(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                t4Var.q(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void H(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            int i10 = 0;
            if (list instanceof n5) {
                n5 n5Var = (n5) list;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < n5Var.f13861w; i12++) {
                        i11 += t4.r(n5Var.b(i12));
                    }
                    t4Var.n(i11);
                    while (i10 < n5Var.f13861w) {
                        t4Var.l(n5Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < n5Var.f13861w) {
                    t4Var.k(i, n5Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                t4Var.o(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += t4.r(((Long) list.get(i14)).longValue());
                }
                t4Var.n(i13);
                while (i10 < list.size()) {
                    t4Var.l(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                t4Var.k(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static int a(int i, int i10, com.google.android.gms.internal.ads.r7 r7Var, byte[] bArr) {
        int i11 = i & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            r7Var.f10135v = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            r7Var.f10135v = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            r7Var.f10135v = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            r7Var.f10135v = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                r7Var.f10135v = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int b(int i, byte[] bArr, int i10, int i11, i5 i5Var, com.google.android.gms.internal.ads.r7 r7Var) {
        e5 e5Var = (e5) i5Var;
        int n10 = n(bArr, i10, r7Var);
        e5Var.b(r7Var.f10135v);
        while (n10 < i11) {
            int n11 = n(bArr, n10, r7Var);
            if (i != r7Var.f10135v) {
                break;
            }
            n10 = n(bArr, n11, r7Var);
            e5Var.b(r7Var.f10135v);
        }
        return n10;
    }

    public static int c(int i, byte[] bArr, int i10, int i11, b6 b6Var, com.google.android.gms.internal.ads.r7 r7Var) {
        if ((i >>> 3) != 0) {
            int i12 = i & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                b6Var.c(i, Integer.valueOf(m(bArr, i10)));
                                return i10 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        b6 e = b6.e();
                        int i13 = (i & (-8)) | 4;
                        int i14 = 0;
                        while (true) {
                            if (i10 >= i11) {
                                break;
                            }
                            int n10 = n(bArr, i10, r7Var);
                            int i15 = r7Var.f10135v;
                            if (i15 != i13) {
                                i10 = c(i15, bArr, n10, i11, e, r7Var);
                                i14 = i15;
                            } else {
                                i14 = i15;
                                i10 = n10;
                                break;
                            }
                        }
                        if (i10 <= i11 && i14 == i13) {
                            b6Var.c(i, e);
                            return i10;
                        }
                        throw h5.c();
                    }
                    int n11 = n(bArr, i10, r7Var);
                    int i16 = r7Var.f10135v;
                    if (i16 >= 0) {
                        if (i16 <= bArr.length - n11) {
                            if (i16 == 0) {
                                b6Var.c(i, s4.f13907w);
                            } else {
                                b6Var.c(i, s4.d(bArr, n11, i16));
                            }
                            return n11 + i16;
                        }
                        throw h5.d();
                    }
                    throw h5.b();
                }
                b6Var.c(i, Long.valueOf(q(bArr, i10)));
                return i10 + 8;
            }
            int p10 = p(bArr, i10, r7Var);
            b6Var.c(i, Long.valueOf(r7Var.f10136w));
            return p10;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int d(a6 a6Var, int i, byte[] bArr, int i10, int i11, i5 i5Var, com.google.android.gms.internal.ads.r7 r7Var) {
        b5 zza = a6Var.zza();
        a6 a6Var2 = a6Var;
        byte[] bArr2 = bArr;
        int i12 = i11;
        com.google.android.gms.internal.ads.r7 r7Var2 = r7Var;
        int e = e(zza, a6Var2, bArr2, i10, i12, r7Var2);
        a6Var2.c(zza);
        r7Var2.f10137x = zza;
        i5Var.add(zza);
        while (e < i12) {
            com.google.android.gms.internal.ads.r7 r7Var3 = r7Var2;
            int i13 = i12;
            int n10 = n(bArr2, e, r7Var3);
            if (i != r7Var3.f10135v) {
                break;
            }
            byte[] bArr3 = bArr2;
            a6 a6Var3 = a6Var2;
            b5 zza2 = a6Var3.zza();
            e = e(zza2, a6Var3, bArr3, n10, i13, r7Var3);
            a6Var2 = a6Var3;
            bArr2 = bArr3;
            i12 = i13;
            r7Var2 = r7Var3;
            a6Var2.c(zza2);
            r7Var2.f10137x = zza2;
            i5Var.add(zza2);
        }
        return e;
    }

    public static int e(Object obj, a6 a6Var, byte[] bArr, int i, int i10, com.google.android.gms.internal.ads.r7 r7Var) {
        int i11 = i + 1;
        int i12 = bArr[i];
        if (i12 < 0) {
            i11 = a(i12, i11, r7Var, bArr);
            i12 = r7Var.f10135v;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = i13 + i12;
            a6Var.h(obj, bArr, i13, i14, r7Var);
            r7Var.f10137x = obj;
            return i14;
        }
        throw h5.d();
    }

    public static int f(byte[] bArr, int i, com.google.android.gms.internal.ads.r7 r7Var) {
        int n10 = n(bArr, i, r7Var);
        int i10 = r7Var.f10135v;
        if (i10 >= 0) {
            if (i10 <= bArr.length - n10) {
                if (i10 == 0) {
                    r7Var.f10137x = s4.f13907w;
                    return n10;
                }
                r7Var.f10137x = s4.d(bArr, n10, i10);
                return n10 + i10;
            }
            throw h5.d();
        }
        throw h5.b();
    }

    public static void g(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            if (!(list instanceof p4)) {
                if (z3) {
                    t4Var.o(i, 2);
                    int i10 = 0;
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        ((Boolean) list.get(i11)).getClass();
                        Logger logger = t4.e;
                        i10++;
                    }
                    t4Var.n(i10);
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        t4Var.a(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
                    }
                    return;
                }
                for (int i13 = 0; i13 < list.size(); i13++) {
                    boolean booleanValue = ((Boolean) list.get(i13)).booleanValue();
                    t4Var.o(i, 0);
                    t4Var.a(booleanValue ? (byte) 1 : (byte) 0);
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void h(Object obj, Object obj2) {
        b5 b5Var = (b5) obj;
        b6 b6Var = b5Var.zzb;
        b6 b6Var2 = ((b5) obj2).zzb;
        b6 b6Var3 = b6.f13654f;
        if (!b6Var3.equals(b6Var2)) {
            if (b6Var3.equals(b6Var)) {
                int i = b6Var.f13655a + b6Var2.f13655a;
                int[] copyOf = Arrays.copyOf(b6Var.f13656b, i);
                System.arraycopy(b6Var2.f13656b, 0, copyOf, b6Var.f13655a, b6Var2.f13655a);
                Object[] copyOf2 = Arrays.copyOf(b6Var.f13657c, i);
                System.arraycopy(b6Var2.f13657c, 0, copyOf2, b6Var.f13655a, b6Var2.f13655a);
                b6Var = new b6(i, copyOf, copyOf2, true);
            } else {
                b6Var.getClass();
                if (!b6Var2.equals(b6Var3)) {
                    if (b6Var.e) {
                        int i10 = b6Var.f13655a + b6Var2.f13655a;
                        b6Var.b(i10);
                        System.arraycopy(b6Var2.f13656b, 0, b6Var.f13656b, b6Var.f13655a, b6Var2.f13655a);
                        System.arraycopy(b6Var2.f13657c, 0, b6Var.f13657c, b6Var.f13655a, b6Var2.f13655a);
                        b6Var.f13655a = i10;
                    } else {
                        q.x.h();
                        return;
                    }
                }
            }
        }
        b5Var.zzb = b6Var;
    }

    public static boolean i(byte b10) {
        if (b10 > -65) {
            return true;
        }
        return false;
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e5) {
            e5 e5Var = (e5) list;
            int i10 = 0;
            while (i < size) {
                i10 += t4.r(e5Var.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += t4.r(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static void l(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            if (!(list instanceof u4)) {
                int i10 = 0;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Double) list.get(i12)).getClass();
                        Logger logger = t4.e;
                        i11 += 8;
                    }
                    t4Var.n(i11);
                    while (i10 < list.size()) {
                        t4Var.e(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    double doubleValue = ((Double) list.get(i10)).doubleValue();
                    t4Var.getClass();
                    t4Var.d(i, Double.doubleToRawLongBits(doubleValue));
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static int m(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int n(byte[] bArr, int i, com.google.android.gms.internal.ads.r7 r7Var) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 >= 0) {
            r7Var.f10135v = b10;
            return i10;
        }
        return a(b10, i10, r7Var, bArr);
    }

    public static void o(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            int i10 = 0;
            if (list instanceof e5) {
                e5 e5Var = (e5) list;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < e5Var.f13732w; i12++) {
                        i11 += t4.r(e5Var.a(i12));
                    }
                    t4Var.n(i11);
                    while (i10 < e5Var.f13732w) {
                        t4Var.i(e5Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < e5Var.f13732w) {
                    t4Var.j(i, e5Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                t4Var.o(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += t4.r(((Integer) list.get(i14)).intValue());
                }
                t4Var.n(i13);
                while (i10 < list.size()) {
                    t4Var.i(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                t4Var.j(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static int p(byte[] bArr, int i, com.google.android.gms.internal.ads.r7 r7Var) {
        int i10 = i + 1;
        long j10 = bArr[i];
        if (j10 >= 0) {
            r7Var.f10136w = j10;
            return i10;
        }
        int i11 = i + 2;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j11 |= (r10 & Byte.MAX_VALUE) << i12;
            b10 = bArr[i11];
            i11 = i13;
        }
        r7Var.f10136w = j11;
        return i11;
    }

    public static long q(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static void r(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            int i10 = 0;
            if (list instanceof e5) {
                e5 e5Var = (e5) list;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < e5Var.f13732w; i12++) {
                        e5Var.a(i12);
                        Logger logger = t4.e;
                        i11 += 4;
                    }
                    t4Var.n(i11);
                    while (i10 < e5Var.f13732w) {
                        t4Var.b(e5Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < e5Var.f13732w) {
                    t4Var.c(i, e5Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                t4Var.o(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    Logger logger2 = t4.e;
                    i13 += 4;
                }
                t4Var.n(i13);
                while (i10 < list.size()) {
                    t4Var.b(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                t4Var.c(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static int s(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e5) {
            e5 e5Var = (e5) list;
            int i10 = 0;
            while (i < size) {
                i10 += t4.r(e5Var.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += t4.r(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static void t(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            int i10 = 0;
            if (list instanceof n5) {
                n5 n5Var = (n5) list;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < n5Var.f13861w; i12++) {
                        n5Var.b(i12);
                        Logger logger = t4.e;
                        i11 += 8;
                    }
                    t4Var.n(i11);
                    while (i10 < n5Var.f13861w) {
                        t4Var.e(n5Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < n5Var.f13861w) {
                    t4Var.d(i, n5Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                t4Var.o(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    Logger logger2 = t4.e;
                    i13 += 8;
                }
                t4Var.n(i13);
                while (i10 < list.size()) {
                    t4Var.e(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                t4Var.d(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n5) {
            n5 n5Var = (n5) list;
            int i10 = 0;
            while (i < size) {
                i10 += t4.r(n5Var.b(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += t4.r(((Long) list.get(i)).longValue());
            i++;
        }
        return i11;
    }

    public static void v(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            if (!(list instanceof z4)) {
                int i10 = 0;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Float) list.get(i12)).getClass();
                        Logger logger = t4.e;
                        i11 += 4;
                    }
                    t4Var.n(i11);
                    while (i10 < list.size()) {
                        t4Var.b(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    float floatValue = ((Float) list.get(i10)).floatValue();
                    t4Var.getClass();
                    t4Var.c(i, Float.floatToRawIntBits(floatValue));
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof e5) {
            e5 e5Var = (e5) list;
            int i10 = 0;
            while (i < size) {
                int a10 = e5Var.a(i);
                i10 += t4.t((a10 >> 31) ^ (a10 << 1));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i11 += t4.t((intValue >> 31) ^ (intValue << 1));
            i++;
        }
        return i11;
    }

    public static void x(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            int i10 = 0;
            if (list instanceof e5) {
                e5 e5Var = (e5) list;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < e5Var.f13732w; i12++) {
                        i11 += t4.r(e5Var.a(i12));
                    }
                    t4Var.n(i11);
                    while (i10 < e5Var.f13732w) {
                        t4Var.i(e5Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < e5Var.f13732w) {
                    t4Var.j(i, e5Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                t4Var.o(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += t4.r(((Integer) list.get(i14)).intValue());
                }
                t4Var.n(i13);
                while (i10 < list.size()) {
                    t4Var.i(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                t4Var.j(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static int y(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof n5) {
            n5 n5Var = (n5) list;
            int i10 = 0;
            while (i < size) {
                long b10 = n5Var.b(i);
                i10 += t4.r((b10 >> 63) ^ (b10 << 1));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            long longValue = ((Long) list.get(i)).longValue();
            i11 += t4.r((longValue >> 63) ^ (longValue << 1));
            i++;
        }
        return i11;
    }

    public static void z(int i, List list, o5 o5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            t4 t4Var = (t4) o5Var.f13873u;
            int i10 = 0;
            if (list instanceof n5) {
                n5 n5Var = (n5) list;
                if (z3) {
                    t4Var.o(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < n5Var.f13861w; i12++) {
                        i11 += t4.r(n5Var.b(i12));
                    }
                    t4Var.n(i11);
                    while (i10 < n5Var.f13861w) {
                        t4Var.l(n5Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < n5Var.f13861w) {
                    t4Var.k(i, n5Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                t4Var.o(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += t4.r(((Long) list.get(i14)).longValue());
                }
                t4Var.n(i13);
                while (i10 < list.size()) {
                    t4Var.l(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                t4Var.k(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }
}
