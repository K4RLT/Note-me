package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gv1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6481a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6482b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6483c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6484d;
    public final l50 e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6485f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6486g;

    public /* synthetic */ gv1(y2 y2Var) {
        this.f6481a = y2Var.f12755a;
        this.f6482b = y2Var.f12756b;
        this.f6483c = y2Var.f12757c;
        this.f6484d = y2Var.f12758d;
        this.e = (l50) y2Var.f12760g;
        this.f6485f = y2Var.e;
        this.f6486g = y2Var.f12759f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gv1.class == obj.getClass()) {
            gv1 gv1Var = (gv1) obj;
            if (this.f6481a == gv1Var.f6481a && this.f6482b == gv1Var.f6482b && this.f6483c == gv1Var.f6483c && this.f6484d == gv1Var.f6484d && this.f6485f == gv1Var.f6485f && this.f6486g == gv1Var.f6486g && this.e.equals(gv1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.f6481a);
        Integer valueOf2 = Integer.valueOf(this.f6482b);
        Integer valueOf3 = Integer.valueOf(this.f6483c);
        Boolean bool = Boolean.FALSE;
        return Objects.hash(valueOf, valueOf2, valueOf3, bool, bool, Integer.valueOf(this.f6484d), this.e, Integer.valueOf(this.f6485f), Integer.valueOf(this.f6486g), bool, bool);
    }
}
