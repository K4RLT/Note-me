package com.google.android.gms.internal.consent_sdk;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n6 {

    /* renamed from: a, reason: collision with root package name */
    public static final s6 f13506a;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.consent_sdk.s6] */
    static {
        int i = e5.f13399a;
        f13506a = new Object();
    }

    public static void a(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            int i10 = 0;
            if (list instanceof r5) {
                r5 r5Var = (r5) list;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < r5Var.f13538w; i12++) {
                        int a10 = r5Var.a(i12);
                        i11 += i5.h((a10 >> 31) ^ (a10 + a10));
                    }
                    i5Var.z(i11);
                    while (i10 < r5Var.f13538w) {
                        int a11 = r5Var.a(i10);
                        i5Var.z((a11 >> 31) ^ (a11 + a11));
                        i10++;
                    }
                    return;
                }
                while (i10 < r5Var.f13538w) {
                    int a12 = r5Var.a(i10);
                    i5Var.y(i, (a12 >> 31) ^ (a12 + a12));
                    i10++;
                }
                return;
            }
            if (z3) {
                i5Var.x(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    int intValue = ((Integer) list.get(i14)).intValue();
                    i13 += i5.h((intValue >> 31) ^ (intValue + intValue));
                }
                i5Var.z(i13);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    i5Var.z((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                i5Var.y(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }

    public static void b(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            if (!(list instanceof z5)) {
                int i10 = 0;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        long longValue = ((Long) list.get(i12)).longValue();
                        i11 += i5.i((longValue >> 63) ^ (longValue + longValue));
                    }
                    i5Var.z(i11);
                    while (i10 < list.size()) {
                        long longValue2 = ((Long) list.get(i10)).longValue();
                        i5Var.B((longValue2 >> 63) ^ (longValue2 + longValue2));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    long longValue3 = ((Long) list.get(i10)).longValue();
                    i5Var.A(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void c(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            int i10 = 0;
            if (list instanceof r5) {
                r5 r5Var = (r5) list;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < r5Var.f13538w; i12++) {
                        i11 += i5.h(r5Var.a(i12));
                    }
                    i5Var.z(i11);
                    while (i10 < r5Var.f13538w) {
                        i5Var.z(r5Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < r5Var.f13538w) {
                    i5Var.y(i, r5Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                i5Var.x(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += i5.h(((Integer) list.get(i14)).intValue());
                }
                i5Var.z(i13);
                while (i10 < list.size()) {
                    i5Var.z(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                i5Var.y(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void d(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            if (!(list instanceof z5)) {
                int i10 = 0;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        i11 += i5.i(((Long) list.get(i12)).longValue());
                    }
                    i5Var.z(i11);
                    while (i10 < list.size()) {
                        i5Var.B(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i5Var.A(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r5) {
            r5 r5Var = (r5) list;
            int i10 = 0;
            while (i < size) {
                i10 += i5.i(r5Var.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += i5.i(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i5.h(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (i5.h(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r5) {
            r5 r5Var = (r5) list;
            int i10 = 0;
            while (i < size) {
                i10 += i5.i(r5Var.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += i5.i(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof z5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i += i5.i(((Long) list.get(i10)).longValue());
        }
        return i;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r5) {
            r5 r5Var = (r5) list;
            int i10 = 0;
            while (i < size) {
                int a10 = r5Var.a(i);
                i10 += i5.h((a10 >> 31) ^ (a10 + a10));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i11 += i5.h((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i11;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof z5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i += i5.i((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof r5) {
            r5 r5Var = (r5) list;
            int i10 = 0;
            while (i < size) {
                i10 += i5.h(r5Var.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += i5.h(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof z5) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i += i5.i(((Long) list.get(i10)).longValue());
        }
        return i;
    }

    public static void o(Object obj, Object obj2) {
        q5 q5Var = (q5) obj;
        r6 r6Var = q5Var.zzc;
        r6 r6Var2 = ((q5) obj2).zzc;
        r6 r6Var3 = r6.e;
        if (!r6Var3.equals(r6Var2)) {
            if (r6Var3.equals(r6Var)) {
                r6Var.getClass();
                r6Var2.getClass();
                int[] copyOf = Arrays.copyOf(r6Var.f13539a, 0);
                System.arraycopy(r6Var2.f13539a, 0, copyOf, 0, 0);
                Object[] copyOf2 = Arrays.copyOf(r6Var.f13540b, 0);
                System.arraycopy(r6Var2.f13540b, 0, copyOf2, 0, 0);
                r6Var = new r6(copyOf, copyOf2, true);
            } else {
                r6Var.getClass();
                if (!r6Var2.equals(r6Var3)) {
                    if (r6Var.f13542d) {
                        System.arraycopy(r6Var2.f13539a, 0, r6Var.f13539a, 0, 0);
                        System.arraycopy(r6Var2.f13540b, 0, r6Var.f13540b, 0, 0);
                    } else {
                        q.x.h();
                        return;
                    }
                }
            }
        }
        q5Var.zzc = r6Var;
    }

    public static void p(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            if (!(list instanceof f5)) {
                int i10 = 0;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Boolean) list.get(i12)).getClass();
                        i11++;
                    }
                    i5Var.z(i11);
                    while (i10 < list.size()) {
                        byte booleanValue = ((Boolean) list.get(i10)).booleanValue();
                        if (i5Var.e == i5Var.f13444d) {
                            i5Var.j();
                        }
                        byte[] bArr = i5Var.f13443c;
                        int i13 = i5Var.e;
                        bArr[i13] = booleanValue;
                        i5Var.e = i13 + 1;
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    byte booleanValue2 = ((Boolean) list.get(i10)).booleanValue();
                    i5Var.k(11);
                    i5Var.n(i << 3);
                    byte[] bArr2 = i5Var.f13443c;
                    int i14 = i5Var.e;
                    bArr2[i14] = booleanValue2;
                    i5Var.e = i14 + 1;
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void q(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            if (!(list instanceof j5)) {
                int i10 = 0;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Double) list.get(i12)).getClass();
                        i11 += 8;
                    }
                    i5Var.z(i11);
                    while (i10 < list.size()) {
                        i5Var.t(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i5Var.s(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void r(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            int i10 = 0;
            if (list instanceof r5) {
                r5 r5Var = (r5) list;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < r5Var.f13538w; i12++) {
                        i11 += i5.i(r5Var.a(i12));
                    }
                    i5Var.z(i11);
                    while (i10 < r5Var.f13538w) {
                        i5Var.v(r5Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < r5Var.f13538w) {
                    i5Var.u(i, r5Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                i5Var.x(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += i5.i(((Integer) list.get(i14)).intValue());
                }
                i5Var.z(i13);
                while (i10 < list.size()) {
                    i5Var.v(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                i5Var.u(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void s(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            int i10 = 0;
            if (list instanceof r5) {
                r5 r5Var = (r5) list;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < r5Var.f13538w; i12++) {
                        r5Var.a(i12);
                        i11 += 4;
                    }
                    i5Var.z(i11);
                    while (i10 < r5Var.f13538w) {
                        i5Var.r(r5Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < r5Var.f13538w) {
                    i5Var.q(i, r5Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                i5Var.x(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                i5Var.z(i13);
                while (i10 < list.size()) {
                    i5Var.r(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                i5Var.q(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void t(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            if (!(list instanceof z5)) {
                int i10 = 0;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Long) list.get(i12)).getClass();
                        i11 += 8;
                    }
                    i5Var.z(i11);
                    while (i10 < list.size()) {
                        i5Var.t(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i5Var.s(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void u(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            if (!(list instanceof o5)) {
                int i10 = 0;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Float) list.get(i12)).getClass();
                        i11 += 4;
                    }
                    i5Var.z(i11);
                    while (i10 < list.size()) {
                        i5Var.r(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i5Var.q(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void v(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            int i10 = 0;
            if (list instanceof r5) {
                r5 r5Var = (r5) list;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < r5Var.f13538w; i12++) {
                        i11 += i5.i(r5Var.a(i12));
                    }
                    i5Var.z(i11);
                    while (i10 < r5Var.f13538w) {
                        i5Var.v(r5Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < r5Var.f13538w) {
                    i5Var.u(i, r5Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                i5Var.x(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += i5.i(((Integer) list.get(i14)).intValue());
                }
                i5Var.z(i13);
                while (i10 < list.size()) {
                    i5Var.v(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                i5Var.u(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void w(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            if (!(list instanceof z5)) {
                int i10 = 0;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        i11 += i5.i(((Long) list.get(i12)).longValue());
                    }
                    i5Var.z(i11);
                    while (i10 < list.size()) {
                        i5Var.B(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i5Var.A(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void x(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            int i10 = 0;
            if (list instanceof r5) {
                r5 r5Var = (r5) list;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < r5Var.f13538w; i12++) {
                        r5Var.a(i12);
                        i11 += 4;
                    }
                    i5Var.z(i11);
                    while (i10 < r5Var.f13538w) {
                        i5Var.r(r5Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < r5Var.f13538w) {
                    i5Var.q(i, r5Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                i5Var.x(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                i5Var.z(i13);
                while (i10 < list.size()) {
                    i5Var.r(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                i5Var.q(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void y(int i, List list, a6 a6Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i5 i5Var = (i5) a6Var.f13354v;
            if (!(list instanceof z5)) {
                int i10 = 0;
                if (z3) {
                    i5Var.x(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Long) list.get(i12)).getClass();
                        i11 += 8;
                    }
                    i5Var.z(i11);
                    while (i10 < list.size()) {
                        i5Var.t(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i5Var.s(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }
}
