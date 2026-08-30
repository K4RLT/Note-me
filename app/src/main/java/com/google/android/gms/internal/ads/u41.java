package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class u41 extends w41 {
    public static final w41 f(int i) {
        return i < 0 ? w41.f12134b : i > 0 ? w41.f12135c : w41.f12133a;
    }

    @Override // com.google.android.gms.internal.ads.w41
    public final w41 a(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.w41
    public final w41 b(int i, int i10) {
        return f(Integer.compare(i, i10));
    }

    @Override // com.google.android.gms.internal.ads.w41
    public final w41 c(boolean z3, boolean z9) {
        return f(Boolean.compare(z9, z3));
    }

    @Override // com.google.android.gms.internal.ads.w41
    public final w41 d(boolean z3, boolean z9) {
        return f(Boolean.compare(z3, z9));
    }

    @Override // com.google.android.gms.internal.ads.w41
    public final int e() {
        return 0;
    }
}
