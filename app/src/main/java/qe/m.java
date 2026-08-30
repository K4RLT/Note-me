package qe;
import x.l;
import x.n;
import q.x;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ya.ac;

/* loaded from: classes.dex */
public abstract class m {
    public static ArrayList a(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new i(objArr, true));
    }

    public static int b(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size >= 0) {
            if (size > size2) {
                x.l(g3.a.j("toIndex (", size, ") is greater than size (", ").", size2));
            }
        } else {
            x.n(g3.a.i("fromIndex (0) is greater than toIndex (", size, ")."));
        }
        int i = size - 1;
        int i10 = 0;
        while (i10 <= i) {
            int i11 = (i10 + i) >>> 1;
            int a10 = ac.a((Comparable) arrayList.get(i11), comparable);
            if (a10 < 0) {
                i10 = i11 + 1;
            } else if (a10 > 0) {
                i = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public static re.b c(re.b bVar) {
        bVar.o();
        bVar.f24752w = true;
        if (bVar.f24751v > 0) {
            return bVar;
        }
        return re.b.f24749x;
    }

    public static int d(Iterable iterable, int i) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    public static re.b e() {
        return new re.b(10);
    }

    public static int f(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static List g(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List h(Object... objArr) {
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            asList.getClass();
            return asList;
        }
        return s.f24023u;
    }

    public static ArrayList i(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new i(objArr, true));
    }

    public static final List j(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return g(list.get(0));
        }
        return s.f24023u;
    }

    public static void k() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void l() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
