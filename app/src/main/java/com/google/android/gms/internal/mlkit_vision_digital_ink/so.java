package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;
import q.b;
import q.x;
import x.h;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class so {

    /* renamed from: a, reason: collision with root package name */
    public static final jm f14979a;

    static {
        oo ooVar = oo.f14756c;
        f14979a = new jm(4);
    }

    public static void A(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            if (!(list instanceof bo)) {
                int i10 = 0;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        i11 += ym.d(((Long) list.get(i12)).longValue());
                    }
                    ymVar.y(i11);
                    while (i10 < list.size()) {
                        ymVar.A(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    ymVar.z(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void a(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            int i10 = 0;
            if (list instanceof pn) {
                pn pnVar = (pn) list;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < pnVar.f14804w; i12++) {
                        pnVar.a(i12);
                        i11 += 4;
                    }
                    ymVar.y(i11);
                    while (i10 < pnVar.f14804w) {
                        ymVar.m(pnVar.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < pnVar.f14804w) {
                    ymVar.l(i, pnVar.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                ymVar.w(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                ymVar.y(i13);
                while (i10 < list.size()) {
                    ymVar.m(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                ymVar.l(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void b(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            if (!(list instanceof bo)) {
                int i10 = 0;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Long) list.get(i12)).getClass();
                        i11 += 8;
                    }
                    ymVar.y(i11);
                    while (i10 < list.size()) {
                        ymVar.o(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    ymVar.n(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void c(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            int i10 = 0;
            if (list instanceof pn) {
                pn pnVar = (pn) list;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < pnVar.f14804w; i12++) {
                        int a10 = pnVar.a(i12);
                        i11 += ym.c((a10 >> 31) ^ (a10 + a10));
                    }
                    ymVar.y(i11);
                    while (i10 < pnVar.f14804w) {
                        int a11 = pnVar.a(i10);
                        ymVar.y((a11 >> 31) ^ (a11 + a11));
                        i10++;
                    }
                    return;
                }
                while (i10 < pnVar.f14804w) {
                    int a12 = pnVar.a(i10);
                    ymVar.x(i, (a12 >> 31) ^ (a12 + a12));
                    i10++;
                }
                return;
            }
            if (z3) {
                ymVar.w(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    int intValue = ((Integer) list.get(i14)).intValue();
                    i13 += ym.c((intValue >> 31) ^ (intValue + intValue));
                }
                ymVar.y(i13);
                while (i10 < list.size()) {
                    int intValue2 = ((Integer) list.get(i10)).intValue();
                    ymVar.y((intValue2 >> 31) ^ (intValue2 + intValue2));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                int intValue3 = ((Integer) list.get(i10)).intValue();
                ymVar.x(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i10++;
            }
        }
    }

    public static void d(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            if (!(list instanceof bo)) {
                int i10 = 0;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        long longValue = ((Long) list.get(i12)).longValue();
                        i11 += ym.d((longValue >> 63) ^ (longValue + longValue));
                    }
                    ymVar.y(i11);
                    while (i10 < list.size()) {
                        long longValue2 = ((Long) list.get(i10)).longValue();
                        ymVar.A((longValue2 >> 63) ^ (longValue2 + longValue2));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    long longValue3 = ((Long) list.get(i10)).longValue();
                    ymVar.z(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void e(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            int i10 = 0;
            if (list instanceof pn) {
                pn pnVar = (pn) list;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < pnVar.f14804w; i12++) {
                        i11 += ym.c(pnVar.a(i12));
                    }
                    ymVar.y(i11);
                    while (i10 < pnVar.f14804w) {
                        ymVar.y(pnVar.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < pnVar.f14804w) {
                    ymVar.x(i, pnVar.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                ymVar.w(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += ym.c(((Integer) list.get(i14)).intValue());
                }
                ymVar.y(i13);
                while (i10 < list.size()) {
                    ymVar.y(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                ymVar.x(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void f(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            if (!(list instanceof bo)) {
                int i10 = 0;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        i11 += ym.d(((Long) list.get(i12)).longValue());
                    }
                    ymVar.y(i11);
                    while (i10 < list.size()) {
                        ymVar.A(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    ymVar.z(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int h(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pn) {
            pn pnVar = (pn) list;
            int i10 = 0;
            while (i < size) {
                i10 += ym.d(pnVar.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += ym.d(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ym.c(i << 3) + 4) * size;
    }

    public static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ym.c(i << 3) + 8) * size;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pn) {
            pn pnVar = (pn) list;
            int i10 = 0;
            while (i < size) {
                i10 += ym.d(pnVar.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += ym.d(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof bo) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i += ym.d(((Long) list.get(i10)).longValue());
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pn) {
            pn pnVar = (pn) list;
            int i10 = 0;
            while (i < size) {
                int a10 = pnVar.a(i);
                i10 += ym.c((a10 >> 31) ^ (a10 + a10));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            int intValue = ((Integer) list.get(i)).intValue();
            i11 += ym.c((intValue >> 31) ^ (intValue + intValue));
            i++;
        }
        return i11;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof bo) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long longValue = ((Long) list.get(i10)).longValue();
            i += ym.d((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int o(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pn) {
            pn pnVar = (pn) list;
            int i10 = 0;
            while (i < size) {
                i10 += ym.c(pnVar.a(i));
                i++;
            }
            return i10;
        }
        int i11 = 0;
        while (i < size) {
            i11 += ym.c(((Integer) list.get(i)).intValue());
            i++;
        }
        return i11;
    }

    public static int p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof bo) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i += ym.d(((Long) list.get(i10)).longValue());
        }
        return i;
    }

    public static Object q(Object obj, int i, un unVar, rn rnVar, Object obj2, jm jmVar) {
        if (rnVar == null) {
            return obj2;
        }
        if (unVar != null) {
            int size = unVar.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) unVar.get(i11);
                int intValue = num.intValue();
                if (rnVar.e(intValue)) {
                    if (i11 != i10) {
                        unVar.set(i10, num);
                    }
                    i10++;
                } else {
                    if (obj2 == null) {
                        jmVar.getClass();
                        obj2 = jm.g(obj);
                    }
                    jmVar.getClass();
                    ((yo) obj2).c(i << 3, Long.valueOf(intValue));
                }
            }
            if (i10 != size) {
                unVar.subList(i10, size).clear();
            }
            return obj2;
        }
        Iterator it = unVar.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            if (!rnVar.e(intValue2)) {
                if (obj2 == null) {
                    jmVar.getClass();
                    obj2 = jm.g(obj);
                }
                jmVar.getClass();
                ((yo) obj2).c(i << 3, Long.valueOf(intValue2));
                it.remove();
            }
        }
        return obj2;
    }

    public static void r(Object obj, Object obj2) {
        dn dnVar = ((kn) obj2).zza;
        if (!dnVar.f14195a.isEmpty()) {
            dn t3 = ((kn) obj).t();
            t3.getClass();
            to toVar = dnVar.f14195a;
            int i = toVar.f15015v;
            for (int i10 = 0; i10 < i; i10++) {
                t3.h(toVar.c(i10));
            }
            Iterator it = toVar.a().iterator();
            while (it.hasNext()) {
                t3.h((Map.Entry) it.next());
            }
        }
    }

    public static void s(Object obj, Object obj2) {
        nn nnVar = (nn) obj;
        yo yoVar = nnVar.zzc;
        yo yoVar2 = ((nn) obj2).zzc;
        yo yoVar3 = yo.f15293f;
        if (!yoVar3.equals(yoVar2)) {
            if (yoVar3.equals(yoVar)) {
                int i = yoVar.f15294a + yoVar2.f15294a;
                int[] copyOf = Arrays.copyOf(yoVar.f15295b, i);
                System.arraycopy(yoVar2.f15295b, 0, copyOf, yoVar.f15294a, yoVar2.f15294a);
                Object[] copyOf2 = Arrays.copyOf(yoVar.f15296c, i);
                System.arraycopy(yoVar2.f15296c, 0, copyOf2, yoVar.f15294a, yoVar2.f15294a);
                yoVar = new yo(i, copyOf, copyOf2, true);
            } else {
                yoVar.getClass();
                if (!yoVar2.equals(yoVar3)) {
                    if (yoVar.e) {
                        int i10 = yoVar.f15294a + yoVar2.f15294a;
                        yoVar.e(i10);
                        System.arraycopy(yoVar2.f15295b, 0, yoVar.f15295b, yoVar.f15294a, yoVar2.f15294a);
                        System.arraycopy(yoVar2.f15296c, 0, yoVar.f15296c, yoVar.f15294a, yoVar2.f15294a);
                        yoVar.f15294a = i10;
                    } else {
                        q.x.h();
                        return;
                    }
                }
            }
        }
        nnVar.zzc = yoVar;
    }

    public static void t(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            if (!(list instanceof qm)) {
                int i10 = 0;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Boolean) list.get(i12)).getClass();
                        i11++;
                    }
                    ymVar.y(i11);
                    while (i10 < list.size()) {
                        ymVar.f(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    ymVar.g(i, ((Boolean) list.get(i10)).booleanValue());
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void u(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            if (!(list instanceof zm)) {
                int i10 = 0;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Double) list.get(i12)).getClass();
                        i11 += 8;
                    }
                    ymVar.y(i11);
                    while (i10 < list.size()) {
                        ymVar.o(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    ymVar.n(i, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void v(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            int i10 = 0;
            if (list instanceof pn) {
                pn pnVar = (pn) list;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < pnVar.f14804w; i12++) {
                        i11 += ym.d(pnVar.a(i12));
                    }
                    ymVar.y(i11);
                    while (i10 < pnVar.f14804w) {
                        ymVar.q(pnVar.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < pnVar.f14804w) {
                    ymVar.p(i, pnVar.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                ymVar.w(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += ym.d(((Integer) list.get(i14)).intValue());
                }
                ymVar.y(i13);
                while (i10 < list.size()) {
                    ymVar.q(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                ymVar.p(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void w(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            int i10 = 0;
            if (list instanceof pn) {
                pn pnVar = (pn) list;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < pnVar.f14804w; i12++) {
                        pnVar.a(i12);
                        i11 += 4;
                    }
                    ymVar.y(i11);
                    while (i10 < pnVar.f14804w) {
                        ymVar.m(pnVar.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < pnVar.f14804w) {
                    ymVar.l(i, pnVar.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                ymVar.w(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Integer) list.get(i14)).getClass();
                    i13 += 4;
                }
                ymVar.y(i13);
                while (i10 < list.size()) {
                    ymVar.m(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                ymVar.l(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }

    public static void x(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            if (!(list instanceof bo)) {
                int i10 = 0;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        ((Long) list.get(i12)).getClass();
                        i11 += 8;
                    }
                    ymVar.y(i11);
                    while (i10 < list.size()) {
                        ymVar.o(((Long) list.get(i10)).longValue());
                        i10++;
                    }
                    return;
                }
                while (i10 < list.size()) {
                    ymVar.n(i, ((Long) list.get(i10)).longValue());
                    i10++;
                }
                return;
            }
            g5.q.b();
        }
    }

    public static void y(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            int i10 = 0;
            if (list instanceof fn) {
                fn fnVar = (fn) list;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < fnVar.f14313w; i12++) {
                        fnVar.b(i12);
                        float f10 = fnVar.f14312v[i12];
                        i11 += 4;
                    }
                    ymVar.y(i11);
                    while (i10 < fnVar.f14313w) {
                        fnVar.b(i10);
                        ymVar.m(Float.floatToRawIntBits(fnVar.f14312v[i10]));
                        i10++;
                    }
                    return;
                }
                while (i10 < fnVar.f14313w) {
                    fnVar.b(i10);
                    ymVar.l(i, Float.floatToRawIntBits(fnVar.f14312v[i10]));
                    i10++;
                }
                return;
            }
            if (z3) {
                ymVar.w(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    ((Float) list.get(i14)).getClass();
                    i13 += 4;
                }
                ymVar.y(i13);
                while (i10 < list.size()) {
                    ymVar.m(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                ymVar.l(i, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
        }
    }

    public static void z(int i, List list, s5 s5Var, boolean z3) {
        if (list != null && !list.isEmpty()) {
            ym ymVar = (ym) s5Var.f14961v;
            int i10 = 0;
            if (list instanceof pn) {
                pn pnVar = (pn) list;
                if (z3) {
                    ymVar.w(i, 2);
                    int i11 = 0;
                    for (int i12 = 0; i12 < pnVar.f14804w; i12++) {
                        i11 += ym.d(pnVar.a(i12));
                    }
                    ymVar.y(i11);
                    while (i10 < pnVar.f14804w) {
                        ymVar.q(pnVar.a(i10));
                        i10++;
                    }
                    return;
                }
                while (i10 < pnVar.f14804w) {
                    ymVar.p(i, pnVar.a(i10));
                    i10++;
                }
                return;
            }
            if (z3) {
                ymVar.w(i, 2);
                int i13 = 0;
                for (int i14 = 0; i14 < list.size(); i14++) {
                    i13 += ym.d(((Integer) list.get(i14)).intValue());
                }
                ymVar.y(i13);
                while (i10 < list.size()) {
                    ymVar.q(((Integer) list.get(i10)).intValue());
                    i10++;
                }
                return;
            }
            while (i10 < list.size()) {
                ymVar.p(i, ((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
    }
}
