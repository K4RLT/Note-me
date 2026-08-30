package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class w51 extends x51 implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final w51 f12146v = new w51(0);

    /* renamed from: w, reason: collision with root package name */
    public static final w51 f12147w = new w51(1);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12148u;

    public /* synthetic */ w51(int i) {
        this.f12148u = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f12148u) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f12148u) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
