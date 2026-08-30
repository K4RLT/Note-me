package com.google.android.gms.internal.play_billing;
import i1.o;
import i1.p;
import q.b;
import q.x;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class q2 {

    /* renamed from: a, reason: collision with root package name */
    public static final p1 f15517a;

    static {
        int i = d1.f15402a;
        f15517a = new p1(7);
    }

    public static void a(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            if (!(list instanceof c2)) {
                int i10 = 0;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Long) list.get(i12)).getClass();
                        i11 += 8;
                    }
                    i1Var.l(i11);
                    while (i10 < list.size()) {
                        i1Var.g(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i1Var.f(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.b();
        }
    }

    public static void b(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            int i10 = 0;
            if (list instanceof s1) {
                s1 s1Var = (s1) list;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < s1Var.f15526w; i12++) {
                        int a10 = s1Var.a(i12);
                        i11 += o((a10 >> 31) ^ (a10 + a10));
                    }
                    i1Var.l(i11);
                    while (i10 < s1Var.f15526w) {
                        int a11 = s1Var.a(i10);
                        i1Var.l((a11 >> 31) ^ (a11 + a11));
                        i10++;
                    }
                    return;
                }
                while (i10 < s1Var.f15526w) {
                    int a12 = s1Var.a(i10);
                    i1Var.k(i, (a12 >> 31) ^ (a12 + a12));
                    i10++;
                }
                return;
            }
            if (z3) {
                i1Var.j(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    int intValue = ((Integer) list.get(i14)).intValue();
                    i13 += o((intValue >> 31) ^ (intValue + intValue));
                }
                i1Var.l(i13);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    i1Var.l((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                i1Var.k(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }

    public static void c(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            if (!(list instanceof c2)) {
                int i10 = 0;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        long longValue = ((Long) list.get(i12)).longValue();
                        i11 += p((longValue >> 63) ^ (longValue + longValue));
                    }
                    i1Var.l(i11);
                    while (i10 < list.size()) {
                        long longValue2 = ((Long) list.get(i10)).longValue();
                        i1Var.n((longValue2 >> 63) ^ (longValue2 + longValue2));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    long longValue3 = ((Long) list.get(i10)).longValue();
                    i1Var.m(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                    i10++;
                }
                return;
            }
            g5.b();
        }
    }

    public static void d(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            int i10 = 0;
            if (list instanceof s1) {
                s1 s1Var = (s1) list;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < s1Var.f15526w; i12++) {
                        i11 += o(s1Var.a(i12));
                    }
                    i1Var.l(i11);
                    while (i10 < s1Var.f15526w) {
                        i1Var.l(s1Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < s1Var.f15526w) {
                    i1Var.k(i, s1Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                i1Var.j(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += o(((Integer) list.get(i14)).intValue());
                }
                i1Var.l(i13);
                while (i10 < list.size()) {
                    i1Var.l(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                i1Var.k(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void e(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            if (!(list instanceof c2)) {
                int i10 = 0;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        i11 += p(((Long) list.get(i12)).longValue());
                    }
                    i1Var.l(i11);
                    while (i10 < list.size()) {
                        i1Var.n(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i1Var.m(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.b();
        }
    }

    public static boolean f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int g(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            int i10 = 0;
            while (i < size) {
                i10 += p(s1Var.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += p(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o(i << 3) + 4) * size;
    }

    public static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o(i << 3) + 8) * size;
    }

    public static int j(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            int i10 = 0;
            while (i < size) {
                i10 += p(s1Var.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += p(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i += p(((Long) list.get(i10)).longValue());
        }
        return i;
    }

    public static int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            int i10 = 0;
            while (i < size) {
                int a10 = s1Var.a(i);
                i10 += o((a10 >> 31) ^ (a10 + a10));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i11 += o((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i11;
    }

    public static int m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i += p((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int n(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s1) {
            s1 s1Var = (s1) list;
            int i10 = 0;
            while (i < size) {
                i10 += o(s1Var.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += o(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static int o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof c2) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i += p(((Long) list.get(i10)).longValue());
        }
        return i;
    }

    public static void p(Object obj, Object obj2) {
        r1 r1Var = (r1) obj;
        s2 s2Var = r1Var.zzc;
        s2 s2Var2 = ((r1) obj2).zzc;
        s2 s2Var3 = s2.f15527f;
        if (!s2Var3.equals(s2Var2)) {
            if (s2Var3.equals(s2Var)) {
                int i = s2Var.f15528a + s2Var2.f15528a;
                int[] copyOf = Arrays.copyOf(s2Var.f15529b, i);
                System.arraycopy(s2Var2.f15529b, 0, copyOf, s2Var.f15528a, s2Var2.f15528a);
                Object[] copyOf2 = Arrays.copyOf(s2Var.f15530c, i);
                System.arraycopy(s2Var2.f15530c, 0, copyOf2, s2Var.f15528a, s2Var2.f15528a);
                s2Var = new s2(i, copyOf, copyOf2, true);
            } else {
                s2Var.getClass();
                if (!s2Var2.equals(s2Var3)) {
                    if (s2Var.e) {
                        int i10 = s2Var.f15528a + s2Var2.f15528a;
                        s2Var.e(i10);
                        System.arraycopy(s2Var2.f15529b, 0, s2Var.f15529b, s2Var.f15528a, s2Var2.f15528a);
                        System.arraycopy(s2Var2.f15530c, 0, s2Var.f15530c, s2Var.f15528a, s2Var2.f15528a);
                        s2Var.f15528a = i10;
                    } else {
                        x.h();
                        return;
                    }
                }
            }
        }
        r1Var.zzc = s2Var;
    }

    public static void q(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            if (!(list instanceof e1)) {
                int i10 = 0;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Boolean) list.get(i12)).getClass();
                        i11++;
                    }
                    i1Var.l(i11);
                    while (i10 < list.size()) {
                        i1Var.a(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    boolean booleanValue = ((Boolean) list.get(i10)).booleanValue();
                    i1Var.l(i << 3);
                    i1Var.a(booleanValue ? (byte) 1 : (byte) 0);
                    i10++;
                }
                return;
            }
            g5.b();
        }
    }

    public static void r(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            if (!(list instanceof j1)) {
                int i10 = 0;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Double) list.get(i12)).getClass();
                        i11 += 8;
                    }
                    i1Var.l(i11);
                    while (i10 < list.size()) {
                        i1Var.g(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i1Var.f(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            g5.b();
        }
    }

    public static void s(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            int i10 = 0;
            if (list instanceof s1) {
                s1 s1Var = (s1) list;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < s1Var.f15526w; i12++) {
                        i11 += p(s1Var.a(i12));
                    }
                    i1Var.l(i11);
                    while (i10 < s1Var.f15526w) {
                        i1Var.i(s1Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < s1Var.f15526w) {
                    i1Var.h(i, s1Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                i1Var.j(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += p(((Integer) list.get(i14)).intValue());
                }
                i1Var.l(i13);
                while (i10 < list.size()) {
                    i1Var.i(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                i1Var.h(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void t(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            int i10 = 0;
            if (list instanceof s1) {
                s1 s1Var = (s1) list;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < s1Var.f15526w; i12++) {
                        s1Var.a(i12);
                        i11 += 4;
                    }
                    i1Var.l(i11);
                    while (i10 < s1Var.f15526w) {
                        i1Var.e(s1Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < s1Var.f15526w) {
                    i1Var.d(i, s1Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                i1Var.j(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                i1Var.l(i13);
                while (i10 < list.size()) {
                    i1Var.e(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                i1Var.d(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void u(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            if (!(list instanceof c2)) {
                int i10 = 0;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Long) list.get(i12)).getClass();
                        i11 += 8;
                    }
                    i1Var.l(i11);
                    while (i10 < list.size()) {
                        i1Var.g(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i1Var.f(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.b();
        }
    }

    public static void v(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            if (!(list instanceof n1)) {
                int i10 = 0;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Float) list.get(i12)).getClass();
                        i11 += 4;
                    }
                    i1Var.l(i11);
                    while (i10 < list.size()) {
                        i1Var.e(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i1Var.d(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            g5.b();
        }
    }

    public static void w(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            int i10 = 0;
            if (list instanceof s1) {
                s1 s1Var = (s1) list;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < s1Var.f15526w; i12++) {
                        i11 += p(s1Var.a(i12));
                    }
                    i1Var.l(i11);
                    while (i10 < s1Var.f15526w) {
                        i1Var.i(s1Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < s1Var.f15526w) {
                    i1Var.h(i, s1Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                i1Var.j(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += p(((Integer) list.get(i14)).intValue());
                }
                i1Var.l(i13);
                while (i10 < list.size()) {
                    i1Var.i(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                i1Var.h(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void x(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            if (!(list instanceof c2)) {
                int i10 = 0;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        i11 += p(((Long) list.get(i12)).longValue());
                    }
                    i1Var.l(i11);
                    while (i10 < list.size()) {
                        i1Var.n(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    i1Var.m(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.b();
        }
    }

    public static void y(int i, List list, d2 d2Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            i1 i1Var = (i1) d2Var.f15404a;
            int i10 = 0;
            if (list instanceof s1) {
                s1 s1Var = (s1) list;
                if (z3) {
                    i1Var.j(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < s1Var.f15526w; i12++) {
                        s1Var.a(i12);
                        i11 += 4;
                    }
                    i1Var.l(i11);
                    while (i10 < s1Var.f15526w) {
                        i1Var.e(s1Var.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < s1Var.f15526w) {
                    i1Var.d(i, s1Var.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                i1Var.j(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                i1Var.l(i13);
                while (i10 < list.size()) {
                    i1Var.e(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                i1Var.d(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }
}
