package com.google.android.gms.internal.mlkit_vision_digital_ink;
import q.x;
import x.n;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class y4 implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public static final y4 f15272w = new y4(a4.f14012w, a4.f14011v);

    /* renamed from: u, reason: collision with root package name */
    public final a4 f15273u;

    /* renamed from: v, reason: collision with root package name */
    public final a4 f15274v;

    public y4(a4 a4Var, a4 a4Var2) {
        this.f15273u = a4Var;
        this.f15274v = a4Var2;
        if (a4Var.a(a4Var2) <= 0 && a4Var != a4.f14011v && a4Var2 != a4.f14012w) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(16);
        a4Var.b(sb2);
        sb2.append("..");
        a4Var2.c(sb2);
        q.x.n("Invalid range: ".concat(sb2.toString()));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y4) {
            y4 y4Var = (y4) obj;
            if (this.f15273u.equals(y4Var.f15273u) && this.f15274v.equals(y4Var.f15274v)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15274v.hashCode() + (this.f15273u.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(16);
        this.f15273u.b(sb2);
        sb2.append("..");
        this.f15274v.c(sb2);
        return sb2.toString();
    }
}
