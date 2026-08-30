package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class kv1 {

    /* renamed from: a, reason: collision with root package name */
    public final mw1 f7888a;

    /* renamed from: b, reason: collision with root package name */
    public final d71 f7889b;

    /* renamed from: c, reason: collision with root package name */
    public final uh f7890c;

    /* renamed from: d, reason: collision with root package name */
    public final yx1 f7891d;

    public /* synthetic */ kv1(na1 na1Var) {
        this.f7888a = (mw1) na1Var.f8630b;
        this.f7889b = (d71) na1Var.f8631c;
        this.f7890c = (uh) na1Var.f8632d;
        this.f7891d = (yx1) na1Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv1)) {
            return false;
        }
        kv1 kv1Var = (kv1) obj;
        if (this.f7888a.equals(kv1Var.f7888a) && Objects.equals(this.f7889b, kv1Var.f7889b) && this.f7890c.equals(kv1Var.f7890c) && Objects.equals(this.f7891d, kv1Var.f7891d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f7888a.hashCode() * 961;
        int i = 0;
        d71 d71Var = this.f7889b;
        if (d71Var == null) {
            hashCode = 0;
        } else {
            hashCode = d71Var.hashCode();
        }
        int hashCode3 = this.f7890c.hashCode() + ((hashCode2 + hashCode) * 31);
        yx1 yx1Var = this.f7891d;
        if (yx1Var != null) {
            i = yx1Var.hashCode();
        }
        return (hashCode3 * 31) + i;
    }
}
