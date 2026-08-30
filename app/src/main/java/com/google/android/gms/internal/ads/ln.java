package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ln {

    /* renamed from: a, reason: collision with root package name */
    public final int f8066a;

    /* renamed from: b, reason: collision with root package name */
    public final hi f8067b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8068c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f8069d;
    public final boolean[] e;

    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public ln(hi hiVar, boolean z3, int[] iArr, boolean[] zArr) {
        boolean z9;
        int i = hiVar.f6819a;
        this.f8066a = i;
        if (i == iArr.length && i == zArr.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        b80.l(z9);
        this.f8067b = hiVar;
        this.f8068c = z3 && i > 1;
        this.f8069d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ln.class == obj.getClass()) {
            ln lnVar = (ln) obj;
            if (this.f8068c == lnVar.f8068c && this.f8067b.equals(lnVar.f8067b) && Arrays.equals(this.f8069d, lnVar.f8069d) && Arrays.equals(this.e, lnVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.f8069d) + (((this.f8067b.hashCode() * 31) + (this.f8068c ? 1 : 0)) * 31)) * 31);
    }
}
