package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class cx1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5217a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5218b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5219c;

    public cx1(String str, boolean z3, boolean z9) {
        this.f5217a = str;
        this.f5218b = z3;
        this.f5219c = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == cx1.class) {
                cx1 cx1Var = (cx1) obj;
                if (TextUtils.equals(this.f5217a, cx1Var.f5217a) && this.f5218b == cx1Var.f5218b && this.f5219c == cx1Var.f5219c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f5217a.hashCode() + 31;
        int i10 = 1231;
        if (true != this.f5218b) {
            i = 1237;
        } else {
            i = 1231;
        }
        int i11 = ((hashCode * 31) + i) * 31;
        if (true != this.f5219c) {
            i10 = 1237;
        }
        return i11 + i10;
    }
}
