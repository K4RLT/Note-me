package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class nj1 {
    public static final BigInteger e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigInteger f8735f;

    /* renamed from: a, reason: collision with root package name */
    public Integer f8736a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f8737b = pj1.e;

    /* renamed from: c, reason: collision with root package name */
    public oj1 f8738c = null;

    /* renamed from: d, reason: collision with root package name */
    public q91 f8739d = q91.N;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        e = valueOf;
        f8735f = valueOf.pow(256);
    }

    public final void a(int i) {
        this.f8736a = Integer.valueOf(i);
    }

    public final pj1 b() {
        Integer num = this.f8736a;
        if (num != null) {
            if (this.f8737b != null) {
                if (this.f8738c != null) {
                    if (this.f8739d != null) {
                        if (num.intValue() >= 2048) {
                            BigInteger bigInteger = this.f8737b;
                            int compareTo = bigInteger.compareTo(pj1.e);
                            if (compareTo != 0) {
                                if (compareTo >= 0) {
                                    if (!bigInteger.mod(e).equals(BigInteger.ZERO)) {
                                        if (bigInteger.compareTo(f8735f) > 0) {
                                            throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
                                        }
                                    } else {
                                        throw new InvalidAlgorithmParameterException("Invalid public exponent");
                                    }
                                } else {
                                    throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
                                }
                            }
                            return new pj1(this.f8736a.intValue(), this.f8737b, this.f8739d, this.f8738c);
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f8736a));
                    }
                    androidx.datastore.preferences.protobuf.s1.q("variant is not set");
                    return null;
                }
                androidx.datastore.preferences.protobuf.s1.q("hash type is not set");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("publicExponent is not set");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("key size is not set");
        return null;
    }
}
