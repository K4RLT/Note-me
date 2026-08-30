package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6571a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f6572b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6573c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6574d;

    public h3(int i, int i10, int i11, byte[] bArr) {
        this.f6571a = i;
        this.f6572b = bArr;
        this.f6573c = i10;
        this.f6574d = i11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && h3.class == obj.getClass()) {
                h3 h3Var = (h3) obj;
                if (this.f6571a == h3Var.f6571a && this.f6573c == h3Var.f6573c && this.f6574d == h3Var.f6574d && Arrays.equals(this.f6572b, h3Var.f6572b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f6572b) + (this.f6571a * 31)) * 31) + this.f6573c) * 31) + this.f6574d;
    }
}
