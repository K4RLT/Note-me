package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a00 {
    public static final a00 e = new a00(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f4299a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4300b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4301c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4302d;

    public a00(int i, int i10, int i11) {
        int i12;
        this.f4299a = i;
        this.f4300b = i10;
        this.f4301c = i11;
        if (bq0.d(i11)) {
            i12 = bq0.f(i11) * i10;
        } else {
            i12 = -1;
        }
        this.f4302d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a00)) {
            return false;
        }
        a00 a00Var = (a00) obj;
        if (this.f4299a == a00Var.f4299a && this.f4300b == a00Var.f4300b && this.f4301c == a00Var.f4301c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f4299a), Integer.valueOf(this.f4300b), Integer.valueOf(this.f4301c));
    }

    public final String toString() {
        int i = this.f4299a;
        int length = String.valueOf(i).length();
        int i10 = this.f4300b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f4301c;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i11).length() + 1);
        g3.a.r(i, i10, "AudioFormat[sampleRate=", ", channelCount=", sb2);
        return a5.a.j(sb2, ", encoding=", i11, "]");
    }
}
