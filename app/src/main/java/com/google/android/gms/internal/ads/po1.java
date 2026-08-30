package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class po1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s6 f9572a;

    static {
        int i = em1.f5727a;
        f9572a = new s6(6);
    }

    public static int A(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof en1) {
            en1 en1Var = (en1) list;
            int i10 = 0;
            while (i < size) {
                int d2 = en1Var.d(i);
                i10 += um1.T((d2 >> 31) ^ (d2 + d2));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i11 += um1.T((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i11;
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (um1.T(i << 3) + 4) * size;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (um1.T(i << 3) + 8) * size;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static void d(Object obj, Object obj2) {
        dn1 dn1Var = (dn1) obj;
        vo1 vo1Var = dn1Var.zzt;
        vo1 vo1Var2 = ((dn1) obj2).zzt;
        vo1 vo1Var3 = vo1.f11961f;
        if (!vo1Var3.equals(vo1Var2)) {
            if (vo1Var3.equals(vo1Var)) {
                int i = vo1Var.f11962a + vo1Var2.f11962a;
                int[] copyOf = Arrays.copyOf(vo1Var.f11963b, i);
                System.arraycopy(vo1Var2.f11963b, 0, copyOf, vo1Var.f11962a, vo1Var2.f11962a);
                Object[] copyOf2 = Arrays.copyOf(vo1Var.f11964c, i);
                System.arraycopy(vo1Var2.f11964c, 0, copyOf2, vo1Var.f11962a, vo1Var2.f11962a);
                vo1Var = new vo1(i, copyOf, copyOf2, true);
            } else {
                vo1Var.getClass();
                if (!vo1Var2.equals(vo1Var3)) {
                    if (vo1Var.e) {
                        int i10 = vo1Var.f11962a + vo1Var2.f11962a;
                        vo1Var.e(i10);
                        System.arraycopy(vo1Var2.f11963b, 0, vo1Var.f11963b, vo1Var.f11962a, vo1Var2.f11962a);
                        System.arraycopy(vo1Var2.f11964c, 0, vo1Var.f11964c, vo1Var.f11962a, vo1Var2.f11962a);
                        vo1Var.f11962a = i10;
                    } else {
                        q.x.h();
                        return;
                    }
                }
            }
        }
        dn1Var.zzt = vo1Var;
    }

    public static Object e(Object obj, int i, kn1 kn1Var, gn1 gn1Var, Object obj2) {
        if (gn1Var == null) {
            return obj2;
        }
        if (kn1Var != null) {
            int size = kn1Var.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) kn1Var.get(i11);
                int intValue = num.intValue();
                if (gn1Var.e(intValue)) {
                    if (i11 != i10) {
                        kn1Var.set(i10, num);
                    }
                    i10++;
                } else {
                    obj2 = f(i, intValue, obj, obj2);
                }
            }
            if (i10 != size) {
                kn1Var.subList(i10, size).clear();
            }
            return obj2;
        }
        Iterator it = kn1Var.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!gn1Var.e(intValue2)) {
                obj2 = f(i, intValue2, obj, obj2);
                it.remove();
            }
        }
        return obj2;
    }

    public static Object f(int i, int i10, Object obj, Object obj2) {
        if (obj2 == null) {
            obj2 = s6.D(obj);
        }
        ((vo1) obj2).d(i << 3, Long.valueOf(i10));
        return obj2;
    }

    public static void g(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            if (!(list instanceof vm1)) {
                int i10 = 0;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Double) list.get(i12)).getClass();
                        i11 += 8;
                    }
                    um1Var.M1(i11);
                    while (i10 < list.size()) {
                        um1Var.R1(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    um1Var.w1(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void h(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            if (!(list instanceof zm1)) {
                int i10 = 0;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Float) list.get(i12)).getClass();
                        i11 += 4;
                    }
                    um1Var.M1(i11);
                    while (i10 < list.size()) {
                        um1Var.O1(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    um1Var.s1(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void i(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            int i10 = 0;
            if (list instanceof vn1) {
                vn1 vn1Var = (vn1) list;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < vn1Var.f11958w; i12++) {
                        i11 += um1.V(vn1Var.b(i12));
                    }
                    um1Var.M1(i11);
                    while (i10 < vn1Var.f11958w) {
                        um1Var.Q1(vn1Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < vn1Var.f11958w) {
                    um1Var.u1(i, vn1Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                um1Var.a0(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += um1.V(((Long) list.get(i14)).longValue());
                }
                um1Var.M1(i13);
                while (i10 < list.size()) {
                    um1Var.Q1(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                um1Var.u1(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void j(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            int i10 = 0;
            if (list instanceof vn1) {
                vn1 vn1Var = (vn1) list;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < vn1Var.f11958w; i12++) {
                        i11 += um1.V(vn1Var.b(i12));
                    }
                    um1Var.M1(i11);
                    while (i10 < vn1Var.f11958w) {
                        um1Var.Q1(vn1Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < vn1Var.f11958w) {
                    um1Var.u1(i, vn1Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                um1Var.a0(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += um1.V(((Long) list.get(i14)).longValue());
                }
                um1Var.M1(i13);
                while (i10 < list.size()) {
                    um1Var.Q1(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                um1Var.u1(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void k(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            int i10 = 0;
            if (list instanceof vn1) {
                vn1 vn1Var = (vn1) list;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < vn1Var.f11958w; i12++) {
                        long b10 = vn1Var.b(i12);
                        i11 += um1.V((b10 >> 63) ^ (b10 + b10));
                    }
                    um1Var.M1(i11);
                    while (i10 < vn1Var.f11958w) {
                        long b11 = vn1Var.b(i10);
                        um1Var.Q1((b11 >> 63) ^ (b11 + b11));
                        i10++;
                    }
                    return;
                }
                while (i10 < vn1Var.f11958w) {
                    long b12 = vn1Var.b(i10);
                    um1Var.u1(i, (b12 >> 63) ^ (b12 + b12));
                    i10++;
                }
                return;
            }
            if (z3) {
                um1Var.a0(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    long longValue = ((Long) list.get(i14)).longValue();
                    i13 += um1.V((longValue >> 63) ^ (longValue + longValue));
                }
                um1Var.M1(i13);
                while (i10 < list.size()) {
                    long longValue2 = ((Long) list.get(i10)).longValue();
                    um1Var.Q1((longValue2 >> 63) ^ (longValue2 + longValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                long longValue3 = ((Long) list.get(i10)).longValue();
                um1Var.u1(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i10++;
            }
        }
    }

    public static void l(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            int i10 = 0;
            if (list instanceof vn1) {
                vn1 vn1Var = (vn1) list;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < vn1Var.f11958w; i12++) {
                        vn1Var.b(i12);
                        i11 += 8;
                    }
                    um1Var.M1(i11);
                    while (i10 < vn1Var.f11958w) {
                        um1Var.R1(vn1Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < vn1Var.f11958w) {
                    um1Var.w1(i, vn1Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                um1Var.a0(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                um1Var.M1(i13);
                while (i10 < list.size()) {
                    um1Var.R1(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                um1Var.w1(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void m(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            int i10 = 0;
            if (list instanceof vn1) {
                vn1 vn1Var = (vn1) list;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < vn1Var.f11958w; i12++) {
                        vn1Var.b(i12);
                        i11 += 8;
                    }
                    um1Var.M1(i11);
                    while (i10 < vn1Var.f11958w) {
                        um1Var.R1(vn1Var.b(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < vn1Var.f11958w) {
                    um1Var.w1(i, vn1Var.b(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                um1Var.a0(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Long) list.get(i14)).getClass();
                    i13 += 8;
                }
                um1Var.M1(i13);
                while (i10 < list.size()) {
                    um1Var.R1(((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                um1Var.w1(i, ((Long) list.get(i10)).longValue());
                i10++;
            }
        }
    }

    public static void n(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            int i10 = 0;
            if (list instanceof en1) {
                en1 en1Var = (en1) list;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < en1Var.f5737w; i12++) {
                        i11 += um1.V(en1Var.d(i12));
                    }
                    um1Var.M1(i11);
                    while (i10 < en1Var.f5737w) {
                        um1Var.K1(en1Var.d(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < en1Var.f5737w) {
                    um1Var.d0(i, en1Var.d(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                um1Var.a0(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += um1.V(((Integer) list.get(i14)).intValue());
                }
                um1Var.M1(i13);
                while (i10 < list.size()) {
                    um1Var.K1(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                um1Var.d0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void o(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            int i10 = 0;
            if (list instanceof en1) {
                en1 en1Var = (en1) list;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < en1Var.f5737w; i12++) {
                        i11 += um1.T(en1Var.d(i12));
                    }
                    um1Var.M1(i11);
                    while (i10 < en1Var.f5737w) {
                        um1Var.M1(en1Var.d(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < en1Var.f5737w) {
                    um1Var.f0(i, en1Var.d(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                um1Var.a0(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += um1.T(((Integer) list.get(i14)).intValue());
                }
                um1Var.M1(i13);
                while (i10 < list.size()) {
                    um1Var.M1(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                um1Var.f0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void p(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            int i10 = 0;
            if (list instanceof en1) {
                en1 en1Var = (en1) list;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < en1Var.f5737w; i12++) {
                        int d2 = en1Var.d(i12);
                        i11 += um1.T((d2 >> 31) ^ (d2 + d2));
                    }
                    um1Var.M1(i11);
                    while (i10 < en1Var.f5737w) {
                        int d10 = en1Var.d(i10);
                        um1Var.M1((d10 >> 31) ^ (d10 + d10));
                        i10++;
                    }
                    return;
                }
                while (i10 < en1Var.f5737w) {
                    int d11 = en1Var.d(i10);
                    um1Var.f0(i, (d11 >> 31) ^ (d11 + d11));
                    i10++;
                }
                return;
            }
            if (z3) {
                um1Var.a0(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    int intValue = ((Integer) list.get(i14)).intValue();
                    i13 += um1.T((intValue >> 31) ^ (intValue + intValue));
                }
                um1Var.M1(i13);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    um1Var.M1((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                um1Var.f0(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }

    public static void q(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            int i10 = 0;
            if (list instanceof en1) {
                en1 en1Var = (en1) list;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < en1Var.f5737w; i12++) {
                        en1Var.d(i12);
                        i11 += 4;
                    }
                    um1Var.M1(i11);
                    while (i10 < en1Var.f5737w) {
                        um1Var.O1(en1Var.d(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < en1Var.f5737w) {
                    um1Var.s1(i, en1Var.d(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                um1Var.a0(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                um1Var.M1(i13);
                while (i10 < list.size()) {
                    um1Var.O1(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                um1Var.s1(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void r(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            int i10 = 0;
            if (list instanceof en1) {
                en1 en1Var = (en1) list;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < en1Var.f5737w; i12++) {
                        en1Var.d(i12);
                        i11 += 4;
                    }
                    um1Var.M1(i11);
                    while (i10 < en1Var.f5737w) {
                        um1Var.O1(en1Var.d(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < en1Var.f5737w) {
                    um1Var.s1(i, en1Var.d(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                um1Var.a0(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                um1Var.M1(i13);
                while (i10 < list.size()) {
                    um1Var.O1(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                um1Var.s1(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void s(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            int i10 = 0;
            if (list instanceof en1) {
                en1 en1Var = (en1) list;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < en1Var.f5737w; i12++) {
                        i11 += um1.V(en1Var.d(i12));
                    }
                    um1Var.M1(i11);
                    while (i10 < en1Var.f5737w) {
                        um1Var.K1(en1Var.d(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < en1Var.f5737w) {
                    um1Var.d0(i, en1Var.d(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                um1Var.a0(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += um1.V(((Integer) list.get(i14)).intValue());
                }
                um1Var.M1(i13);
                while (i10 < list.size()) {
                    um1Var.K1(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                um1Var.d0(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void t(int i, List list, lt0 lt0Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            um1 um1Var = (um1) lt0Var.f8135v;
            if (!(list instanceof hm1)) {
                int i10 = 0;
                if (z3) {
                    um1Var.a0(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Boolean) list.get(i12)).getClass();
                        i11++;
                    }
                    um1Var.M1(i11);
                    while (i10 < list.size()) {
                        um1Var.I1(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    um1Var.y1(i, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static int u(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof vn1) {
            vn1 vn1Var = (vn1) list;
            int i10 = 0;
            while (i < size) {
                i10 += um1.V(vn1Var.b(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += um1.V(((Long) list.get(i)).longValue());
            i++;
        }
        return i11;
    }

    public static int v(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof vn1) {
            vn1 vn1Var = (vn1) list;
            int i10 = 0;
            while (i < size) {
                i10 += um1.V(vn1Var.b(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += um1.V(((Long) list.get(i)).longValue());
            i++;
        }
        return i11;
    }

    public static int w(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof vn1) {
            vn1 vn1Var = (vn1) list;
            int i10 = 0;
            while (i < size) {
                long b10 = vn1Var.b(i);
                i10 += um1.V((b10 >> 63) ^ (b10 + b10));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            long longValue = ((Long) list.get(i)).longValue();
            i11 += um1.V((longValue >> 63) ^ (longValue + longValue));
            i++;
        }
        return i11;
    }

    public static int x(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof en1) {
            en1 en1Var = (en1) list;
            int i10 = 0;
            while (i < size) {
                i10 += um1.V(en1Var.d(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += um1.V(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static int y(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof en1) {
            en1 en1Var = (en1) list;
            int i10 = 0;
            while (i < size) {
                i10 += um1.V(en1Var.d(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += um1.V(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static int z(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof en1) {
            en1 en1Var = (en1) list;
            int i10 = 0;
            while (i < size) {
                i10 += um1.T(en1Var.d(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += um1.T(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }
}
