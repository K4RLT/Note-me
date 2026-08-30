package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ze {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13145a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13146b;

    /* renamed from: c, reason: collision with root package name */
    public final y4 f13147c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f13148d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13149f;

    /* renamed from: g, reason: collision with root package name */
    public final long f13150g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13151h;
    public final int i;

    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public ze(Object obj, int i, y4 y4Var, Object obj2, int i10, long j10, long j11, int i11, int i12) {
        boolean z3;
        if (i >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        b80.l(i10 >= 0);
        this.f13145a = obj;
        this.f13146b = i;
        this.f13147c = y4Var;
        this.f13148d = obj2;
        this.e = i10;
        this.f13149f = j10;
        this.f13150g = j11;
        this.f13151h = i11;
        this.i = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ze.class == obj.getClass()) {
            ze zeVar = (ze) obj;
            if (this.f13146b == zeVar.f13146b && this.e == zeVar.e && this.f13149f == zeVar.f13149f && this.f13150g == zeVar.f13150g && this.f13151h == zeVar.f13151h && this.i == zeVar.i && Objects.equals(this.f13147c, zeVar.f13147c) && Objects.equals(this.f13145a, zeVar.f13145a) && Objects.equals(this.f13148d, zeVar.f13148d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13145a, Integer.valueOf(this.f13146b), this.f13147c, this.f13148d, Integer.valueOf(this.e), Long.valueOf(this.f13149f), Long.valueOf(this.f13150g), Integer.valueOf(this.f13151h), Integer.valueOf(this.i));
    }

    public final String toString() {
        int i = this.f13146b;
        int length = String.valueOf(i).length();
        int i10 = this.e;
        int length2 = String.valueOf(i10).length();
        long j10 = this.f13149f;
        StringBuilder sb2 = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j10).length());
        g3.a.r(i, i10, "mediaItem=", ", period=", sb2);
        sb2.append(", pos=");
        sb2.append(j10);
        String sb3 = sb2.toString();
        int i11 = this.f13151h;
        if (i11 == -1) {
            return sb3;
        }
        int length3 = sb3.length();
        long j11 = this.f13150g;
        int length4 = String.valueOf(i11).length() + length3 + 13 + String.valueOf(j11).length() + 10;
        int i12 = this.i;
        StringBuilder sb4 = new StringBuilder(length4 + 5 + String.valueOf(i12).length());
        sb4.append(sb3);
        sb4.append(", contentPos=");
        sb4.append(j11);
        return g3.a.f(i11, i12, ", adGroup=", ", ad=", sb4);
    }
}
