package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class u4 extends x4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f11531b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11532c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11533d;
    public final String[] e;

    /* renamed from: f, reason: collision with root package name */
    public final x4[] f11534f;

    public u4(String str, boolean z3, boolean z9, String[] strArr, x4[] x4VarArr) {
        super("CTOC");
        this.f11531b = str;
        this.f11532c = z3;
        this.f11533d = z9;
        this.e = strArr;
        this.f11534f = x4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && u4.class == obj.getClass()) {
                u4 u4Var = (u4) obj;
                if (this.f11532c == u4Var.f11532c && this.f11533d == u4Var.f11533d && this.f11531b.equals(u4Var.f11531b) && Arrays.equals(this.e, u4Var.e) && Arrays.equals(this.f11534f, u4Var.f11534f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f11531b.hashCode() + (((((this.f11532c ? 1 : 0) + 527) * 31) + (this.f11533d ? 1 : 0)) * 31);
    }
}
