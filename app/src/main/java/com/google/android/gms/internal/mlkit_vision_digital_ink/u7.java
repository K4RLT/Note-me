package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u7 {

    /* renamed from: b, reason: collision with root package name */
    public static final r7 f15055b = new r7(0);

    /* renamed from: c, reason: collision with root package name */
    public static final u7 f15056c;

    /* renamed from: a, reason: collision with root package name */
    public final t7 f15057a;

    static {
        List list = Collections.EMPTY_LIST;
        f15056c = new u7(new t7());
    }

    public u7(t7 t7Var) {
        this.f15057a = t7Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof u7) && ((u7) obj).f15057a.equals(this.f15057a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ~this.f15057a.hashCode();
    }

    public final String toString() {
        return this.f15057a.toString();
    }
}
