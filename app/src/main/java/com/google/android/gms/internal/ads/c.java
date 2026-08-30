package com.google.android.gms.internal.ads;
import oc.f;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Comparator {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4928u;

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ c f4923v = new c(0);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ c f4924w = new c(1);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ c f4925x = new c(2);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ c f4926y = new c(3);

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ c f4927z = new c(4);
    public static final /* synthetic */ c A = new c(5);
    public static final /* synthetic */ c B = new c(6);
    public static final /* synthetic */ c C = new c(7);
    public static final /* synthetic */ c D = new c(8);
    public static final /* synthetic */ c E = new c(9);
    public static final /* synthetic */ c F = new c(10);
    public static final /* synthetic */ c G = new c(11);
    public static final /* synthetic */ c H = new c(12);
    public static final /* synthetic */ c I = new c(13);
    public static final /* synthetic */ c J = new c(18);
    public static final /* synthetic */ c K = new c(20);
    public static final /* synthetic */ c L = new c(21);

    public /* synthetic */ c(int i) {
        this.f4928u = i;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int length;
        int bitCount;
        int bitCount2;
        int i = 0;
        switch (this.f4928u) {
            case 0:
                return ((b) Collections.max((List) obj)).compareTo((b) Collections.max((List) obj2));
            case 1:
                return Integer.compare(((g) ((List) obj).get(0)).f6231z, ((g) ((List) obj2).get(0)).f6231z);
            case 2:
                return ((k) ((List) obj).get(0)).compareTo((k) ((List) obj2).get(0));
            case 3:
                List list = (List) obj2;
                List list2 = (List) obj;
                return u41.f(o.c((o) Collections.max(list2, E), (o) Collections.max(list, A))).b(list2.size(), list.size()).a((o) Collections.max(list2, B), (o) Collections.max(list, C), D).e();
            case 4:
                Integer num = (Integer) obj2;
                Integer num2 = (Integer) obj;
                if (num2.intValue() == -1) {
                    if (num.intValue() != -1) {
                        return -1;
                    }
                    return 0;
                }
                if (num.intValue() == -1) {
                    return 1;
                }
                return num2.intValue() - num.intValue();
            case 5:
                return o.c((o) obj, (o) obj2);
            case 6:
                return o.d((o) obj, (o) obj2);
            case 7:
                return o.d((o) obj, (o) obj2);
            case 8:
                return o.d((o) obj, (o) obj2);
            case 9:
                return o.c((o) obj, (o) obj2);
            case 10:
                return Float.compare(((g0) obj).f6234c, ((g0) obj2).f6234c);
            case 11:
                return ((g0) obj).f6232a - ((g0) obj2).f6232a;
            case 12:
                return Integer.compare(((w8) obj).f12167a.f12487b, ((w8) obj2).f12167a.f12487b);
            case 13:
                return Long.compare(((v8) obj).f11828b, ((v8) obj2).f11828b);
            case 14:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 15:
                oc ocVar = (oc) obj;
                oc ocVar2 = (oc) obj2;
                int i10 = 0;
                while (true) {
                    length = ocVar.f9089a.length;
                    if (i < length && i10 < ocVar2.f9089a.length) {
                        int compare = Integer.compare(f(ocVar.b(i)), f(ocVar2.b(i10)));
                        if (compare == 0) {
                            i++;
                            i10++;
                        } else {
                            return compare;
                        }
                    }
                }
                return Integer.compare(length, ocVar2.f9089a.length);
            case 16:
                ni niVar = (ni) obj;
                ni niVar2 = (ni) obj2;
                int i11 = niVar.f8720c - niVar2.f8720c;
                if (i11 == 0) {
                    return Long.compare(niVar.f8718a, niVar2.f8718a);
                }
                return i11;
            case 17:
                li liVar = (li) obj;
                li liVar2 = (li) obj2;
                float f10 = liVar.f8035b;
                float f11 = liVar2.f8035b;
                if (f10 < f11) {
                    return -1;
                }
                if (f10 <= f11) {
                    float f12 = liVar.f8034a;
                    float f13 = liVar2.f8034a;
                    if (f12 < f13) {
                        return -1;
                    }
                    if (f12 <= f13) {
                        float f14 = (liVar.f8037d - f10) * (liVar.f8036c - f12);
                        float f15 = (liVar2.f8037d - f11) * (liVar2.f8036c - f13);
                        if (f14 > f15) {
                            return -1;
                        }
                        if (f14 >= f15) {
                            return 0;
                        }
                    }
                }
                return 1;
            case 18:
                kt0 kt0Var = (kt0) obj2;
                kt0 kt0Var2 = (kt0) obj;
                int compare2 = Double.compare(kt0Var.e, kt0Var2.e);
                if (compare2 == 0) {
                    return Long.compare(kt0Var2.f7873b, kt0Var.f7873b);
                }
                return compare2;
            case 19:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 20:
                bitCount = Integer.bitCount(((Integer) obj2).intValue());
                bitCount2 = Integer.bitCount(((Integer) obj).intValue());
                return bitCount - bitCount2;
            default:
                bitCount = ((mw1) obj2).f8454j;
                bitCount2 = ((mw1) obj).f8454j;
                return bitCount - bitCount2;
        }
    }
}
