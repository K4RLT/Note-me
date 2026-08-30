package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ze1 extends v91 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13158a;

    public ze1(int i) {
        this.f13158a = i;
    }

    public static ze1 b(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i * 8)));
        }
        return new ze1(i);
    }

    @Override // com.google.android.gms.internal.ads.v91
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ze1) || ((ze1) obj).f13158a != this.f13158a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(ze1.class, Integer.valueOf(this.f13158a));
    }

    public final String toString() {
        int i = this.f13158a;
        return a5.a.j(new StringBuilder(String.valueOf(i).length() + 34), "AesCmac PRF Parameters (", i, "-byte key)");
    }
}
