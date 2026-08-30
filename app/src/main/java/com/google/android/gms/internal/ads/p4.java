package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p4 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9352a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9353b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9354c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9355d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9356f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9357g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f9358h;

    public p4(int i, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f9352a = i;
        this.f9353b = str;
        this.f9354c = str2;
        this.f9355d = i10;
        this.e = i11;
        this.f9356f = i12;
        this.f9357g = i13;
        this.f9358h = bArr;
    }

    public static p4 b(xk0 xk0Var) {
        int b10 = xk0Var.b();
        String h3 = ha.h(xk0Var.k(xk0Var.b(), StandardCharsets.US_ASCII));
        String k3 = xk0Var.k(xk0Var.b(), StandardCharsets.UTF_8);
        int b11 = xk0Var.b();
        int b12 = xk0Var.b();
        int b13 = xk0Var.b();
        int b14 = xk0Var.b();
        int b15 = xk0Var.b();
        byte[] bArr = new byte[b15];
        xk0Var.H(bArr, 0, b15);
        return new p4(b10, h3, k3, b11, b12, b13, b14, bArr);
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final void a(j6 j6Var) {
        j6Var.a(this.f9358h, this.f9352a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && p4.class == obj.getClass()) {
                p4 p4Var = (p4) obj;
                if (this.f9352a == p4Var.f9352a && this.f9353b.equals(p4Var.f9353b) && this.f9354c.equals(p4Var.f9354c) && this.f9355d == p4Var.f9355d && this.e == p4Var.e && this.f9356f == p4Var.f9356f && this.f9357g == p4Var.f9357g && Arrays.equals(this.f9358h, p4Var.f9358h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9358h) + ((((((((((this.f9354c.hashCode() + ((this.f9353b.hashCode() + ((this.f9352a + 527) * 31)) * 31)) * 31) + this.f9355d) * 31) + this.e) * 31) + this.f9356f) * 31) + this.f9357g) * 31);
    }

    public final String toString() {
        String str = this.f9353b;
        int length = String.valueOf(str).length() + 32;
        String str2 = this.f9354c;
        return a5.a.l(new StringBuilder(str2.length() + length), "Picture: mimeType=", str, ", description=", str2);
    }
}
