package qe;
import b0.d;
import g.a;
import m.g;
import m.j;
import p.m;
import q.n;
import q.x;
import x.b;

import b8.x7;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class l extends q {
    public static /* synthetic */ void A(List list, StringBuilder sb2, a1.f fVar, int i) {
        if ((i & 64) != 0) {
            fVar = null;
        }
        z(list, sb2, "\n", "", "", "...", fVar);
    }

    public static String B(Iterable iterable, String str, String str2, String str3, df.l lVar, int i) {
        String str4;
        String str5;
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str6 = str;
        if ((i & 2) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i & 4) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        if ((i & 32) != 0) {
            lVar = null;
        }
        iterable.getClass();
        StringBuilder sb2 = new StringBuilder();
        z(iterable, sb2, str6, str4, str5, "...", lVar);
        return sb2.toString();
    }

    public static Object C(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        l4.a.h("List is empty.");
        return null;
    }

    public static Object D(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList E(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        n(arrayList2, iterable);
        return arrayList2;
    }

    public static ArrayList F(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object G(Collection collection) {
        gf.c cVar = gf.d.f17754u;
        collection.getClass();
        if (!collection.isEmpty()) {
            Collection collection2 = collection;
            int d2 = gf.d.f17755v.d(collection.size());
            boolean z3 = collection2 instanceof List;
            if (z3) {
                return ((List) collection2).get(d2);
            }
            x7 x7Var = new x7(d2, 5);
            if (z3) {
                List list = (List) collection2;
                if (d2 >= 0 && d2 < list.size()) {
                    return list.get(d2);
                }
                x7Var.invoke(Integer.valueOf(d2));
                throw null;
            }
            if (d2 >= 0) {
                int i = 0;
                for (Object obj : collection2) {
                    int i10 = i + 1;
                    if (d2 == i) {
                        return obj;
                    }
                    i = i10;
                }
                x7Var.invoke(Integer.valueOf(d2));
                throw null;
            }
            x7Var.invoke(Integer.valueOf(d2));
            throw null;
        }
        l4.a.h("Collection is empty.");
        return null;
    }

    public static List H(Iterable iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return P(iterable);
        }
        List S = S(iterable);
        Collections.reverse(S);
        return S;
    }

    public static Object I(List list) {
        list.getClass();
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            x.n("List has more than one element.");
            return null;
        }
        l4.a.h("List is empty.");
        return null;
    }

    public static List J(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return P(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            Comparable[] comparableArr = (Comparable[]) array;
            comparableArr.getClass();
            if (comparableArr.length > 1) {
                Arrays.sort(comparableArr);
            }
            array.getClass();
            List asList = Arrays.asList(array);
            asList.getClass();
            return asList;
        }
        List S = S(iterable);
        if (((ArrayList) S).size() > 1) {
            Collections.sort(S);
        }
        return S;
    }

    public static List K(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return P(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            array.getClass();
            if (array.length > 1) {
                Arrays.sort(array, comparator);
            }
            List asList = Arrays.asList(array);
            asList.getClass();
            return asList;
        }
        List S = S(iterable);
        m(S, comparator);
        return S;
    }

    public static List L(Iterable iterable, int i) {
        iterable.getClass();
        if (i >= 0) {
            if (i == 0) {
                return s.f24023u;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return P(iterable);
                }
                if (i == 1) {
                    return g(v(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                arrayList.add(it.next());
                i10++;
                if (i10 == i) {
                    break;
                }
            }
            return j(arrayList);
        }
        x.j(g3.a.i("Requested element count ", i, " is less than zero."));
        return null;
    }

    public static final void M(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static float[] N(List list) {
        list.getClass();
        float[] fArr = new float[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static int[] O(Collection collection) {
        collection.getClass();
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List P(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return new ArrayList(collection);
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return g(next);
            }
            return s.f24023u;
        }
        return j(S(iterable));
    }

    public static long[] Q(ArrayList arrayList) {
        long[] jArr = new long[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            jArr[i] = ((Number) obj).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList R(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List S(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        M(iterable, arrayList);
        return arrayList;
    }

    public static Set T(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        M(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set U(Iterable iterable) {
        Object next;
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(b(collection.size()));
                    M(iterable, linkedHashSet);
                    return linkedHashSet;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = collection.iterator().next();
                }
                return d(next);
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            M(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                if (size2 != 1) {
                    return linkedHashSet2;
                }
                return d(linkedHashSet2.iterator().next());
            }
        }
        return u.f24025u;
    }

    public static ArrayList r(Iterable iterable, int i) {
        Iterator a10;
        int i10;
        iterable.getClass();
        if (i > 0 && i > 0) {
            if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
                List list = (List) iterable;
                int size = list.size();
                int i11 = size / i;
                if (size % i == 0) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                ArrayList arrayList = new ArrayList(i11 + i10);
                int i12 = 0;
                while (i12 >= 0 && i12 < size) {
                    int i13 = size - i12;
                    if (i <= i13) {
                        i13 = i;
                    }
                    ArrayList arrayList2 = new ArrayList(i13);
                    for (int i14 = 0; i14 < i13; i14++) {
                        arrayList2.add(list.get(i14 + i12));
                    }
                    arrayList.add(arrayList2);
                    i12 += i;
                }
                return arrayList;
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = iterable.iterator();
            it.getClass();
            if (!it.hasNext()) {
                a10 = r.f24022u;
            } else {
                a10 = lf.a(new c0(i, i, it, null));
            }
            while (a10.hasNext()) {
                arrayList3.add((List) a10.next());
            }
            return arrayList3;
        }
        x.j(g3.a.i("size ", i, " must be greater than zero."));
        return null;
    }

    public static boolean s(Iterable iterable, Object obj) {
        int i;
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            i = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i10 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i10 >= 0) {
                        if (kotlin.jvm.internal.a(obj, next)) {
                            i = i10;
                            break;
                        }
                        i10++;
                    } else {
                        m.l();
                        throw null;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }

    public static List t(Iterable iterable, int i) {
        ArrayList arrayList;
        Object obj;
        if (i >= 0) {
            if (i == 0) {
                return P(iterable);
            }
            if (iterable instanceof Collection) {
                int size = ((Collection) iterable).size() - i;
                if (size <= 0) {
                    return s.f24023u;
                }
                if (size == 1) {
                    if (iterable instanceof List) {
                        obj = C((List) iterable);
                    } else {
                        Iterator it = iterable.iterator();
                        if (it.hasNext()) {
                            Object next = it.next();
                            while (it.hasNext()) {
                                next = it.next();
                            }
                            obj = next;
                        } else {
                            l4.a.h("Collection is empty.");
                            return null;
                        }
                    }
                    return g(obj);
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        List list = (List) iterable;
                        int size2 = list.size();
                        while (i < size2) {
                            arrayList.add(list.get(i));
                            i++;
                        }
                    } else {
                        ListIterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            int i10 = 0;
            for (Object obj2 : iterable) {
                if (i10 >= i) {
                    arrayList.add(obj2);
                } else {
                    i10++;
                }
            }
            return j(arrayList);
        }
        x.j(g3.a.i("Requested element count ", i, " is less than zero."));
        return null;
    }

    public static ArrayList u(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object v(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return w((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        l4.a.h("Collection is empty.");
        return null;
    }

    public static Object w(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        l4.a.h("List is empty.");
        return null;
    }

    public static Object x(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object y(int i, List list) {
        list.getClass();
        if (i >= 0 && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public static final void z(Iterable iterable, StringBuilder sb2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, df.l lVar) {
        iterable.getClass();
        sb2.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb2.append(charSequence);
            }
            mf.a(sb2, obj, lVar);
        }
        sb2.append(charSequence3);
    }
}
