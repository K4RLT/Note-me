package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class w4 extends x4 implements Serializable {

    /* renamed from: v, reason: collision with root package name */
    public static final w4 f15177v = new w4(0);

    /* renamed from: w, reason: collision with root package name */
    public static final w4 f15178w = new w4(1);

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f15179u;

    public /* synthetic */ w4(int i) {
        this.f15179u = i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.f15179u) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                y4 y4Var = (y4) obj;
                y4 y4Var2 = (y4) obj2;
                return z3.f15322a.b(y4Var.f15273u, y4Var2.f15273u).b(y4Var.f15274v, y4Var2.f15274v).a();
        }
    }

    public String toString() {
        switch (this.f15179u) {
            case 0:
                return "Ordering.natural()";
            default:
                return super.toString();
        }
    }
}
