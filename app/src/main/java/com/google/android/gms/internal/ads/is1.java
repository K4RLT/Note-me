package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class is1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7209a;

    /* renamed from: b, reason: collision with root package name */
    public final mw1 f7210b;

    /* renamed from: c, reason: collision with root package name */
    public final mw1 f7211c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7212d;
    public final int e;

    public is1(String str, mw1 mw1Var, mw1 mw1Var2, int i, int i10) {
        boolean z3;
        if (i != 0) {
            z3 = false;
            i10 = i10 == 0 ? 0 : i10;
            b80.l(z3);
            b80.l(true ^ TextUtils.isEmpty(str));
            this.f7209a = str;
            this.f7210b = mw1Var;
            mw1Var2.getClass();
            this.f7211c = mw1Var2;
            this.f7212d = i;
            this.e = i10;
        }
        z3 = true;
        b80.l(z3);
        b80.l(true ^ TextUtils.isEmpty(str));
        this.f7209a = str;
        this.f7210b = mw1Var;
        mw1Var2.getClass();
        this.f7211c = mw1Var2;
        this.f7212d = i;
        this.e = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && is1.class == obj.getClass()) {
            is1 is1Var = (is1) obj;
            if (this.f7212d == is1Var.f7212d && this.e == is1Var.e && this.f7209a.equals(is1Var.f7209a) && this.f7210b.equals(is1Var.f7210b) && this.f7211c.equals(is1Var.f7211c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7211c.hashCode() + ((this.f7210b.hashCode() + ((this.f7209a.hashCode() + ((((this.f7212d + 527) * 31) + this.e) * 31)) * 31)) * 31);
    }
}
