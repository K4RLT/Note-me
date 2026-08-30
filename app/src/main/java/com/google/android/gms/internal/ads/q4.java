package com.google.android.gms.internal.ads;
import g3.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class q4 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f9732a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9733b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9734c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9735d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9736f;

    public q4(int i, int i10, String str, String str2, String str3, boolean z3) {
        boolean z9 = true;
        if (i10 != -1 && i10 <= 0) {
            z9 = false;
        }
        b80.l(z9);
        this.f9732a = i;
        this.f9733b = str;
        this.f9734c = str2;
        this.f9735d = str3;
        this.e = z3;
        this.f9736f = i10;
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final void a(j6 j6Var) {
        String str = this.f9734c;
        if (str != null) {
            j6Var.f7358y = str;
        }
        String str2 = this.f9733b;
        if (str2 != null) {
            j6Var.f7357x = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q4.class == obj.getClass()) {
            q4 q4Var = (q4) obj;
            if (this.f9732a == q4Var.f9732a && Objects.equals(this.f9733b, q4Var.f9733b) && Objects.equals(this.f9734c, q4Var.f9734c) && Objects.equals(this.f9735d, q4Var.f9735d) && this.e == q4Var.e && this.f9736f == q4Var.f9736f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i10;
        int i11 = 0;
        String str = this.f9733b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        String str2 = this.f9734c;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = ((this.f9732a + 527) * 31) + i;
        String str3 = this.f9735d;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return (((((((i12 * 31) + i10) * 31) + i11) * 31) + (this.e ? 1 : 0)) * 31) + this.f9736f;
    }

    public final String toString() {
        String str = this.f9734c;
        int length = String.valueOf(str).length();
        String str2 = this.f9733b;
        int length2 = String.valueOf(str2).length();
        int i = this.f9732a;
        int length3 = String.valueOf(i).length();
        int i10 = this.f9736f;
        StringBuilder sb2 = new StringBuilder(length + 28 + length2 + 11 + length3 + 19 + String.valueOf(i10).length());
        a.t(sb2, "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        return a.f(i, i10, "\", bitrate=", ", metadataInterval=", sb2);
    }
}
