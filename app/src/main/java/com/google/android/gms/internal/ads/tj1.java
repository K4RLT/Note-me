package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class tj1 {

    /* renamed from: g, reason: collision with root package name */
    public static final BigInteger f11358g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f11359h;

    /* renamed from: a, reason: collision with root package name */
    public Integer f11360a = null;

    /* renamed from: b, reason: collision with root package name */
    public BigInteger f11361b = vj1.f11922g;

    /* renamed from: c, reason: collision with root package name */
    public uj1 f11362c = null;

    /* renamed from: d, reason: collision with root package name */
    public uj1 f11363d = null;
    public Integer e = null;

    /* renamed from: f, reason: collision with root package name */
    public w91 f11364f = w91.f12194u;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        f11358g = valueOf;
        f11359h = valueOf.pow(256);
    }

    public final void a(int i) {
        this.f11360a = Integer.valueOf(i);
    }

    public final void b(int i) {
        if (i >= 0) {
            this.e = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
    }

    public final vj1 c() {
        Integer num = this.f11360a;
        if (num != null) {
            if (this.f11361b != null) {
                if (this.f11362c != null) {
                    if (this.f11363d != null) {
                        if (this.f11364f != null) {
                            if (this.e != null) {
                                if (num.intValue() >= 2048) {
                                    if (this.f11362c == this.f11363d) {
                                        BigInteger bigInteger = this.f11361b;
                                        int compareTo = bigInteger.compareTo(vj1.f11922g);
                                        if (compareTo != 0) {
                                            if (compareTo >= 0) {
                                                if (!bigInteger.mod(f11358g).equals(BigInteger.ZERO)) {
                                                    if (bigInteger.compareTo(f11359h) > 0) {
                                                        throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
                                                    }
                                                } else {
                                                    throw new InvalidAlgorithmParameterException("Invalid public exponent");
                                                }
                                            } else {
                                                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
                                            }
                                        }
                                        return new vj1(this.f11360a.intValue(), this.f11361b, this.f11364f, this.f11362c, this.f11363d, this.e.intValue());
                                    }
                                    androidx.datastore.preferences.protobuf.s1.q("MGF1 hash is different from signature hash");
                                    return null;
                                }
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.f11360a, 2048));
                            }
                            androidx.datastore.preferences.protobuf.s1.q("salt length is not set");
                            return null;
                        }
                        androidx.datastore.preferences.protobuf.s1.q("variant is not set");
                        return null;
                    }
                    androidx.datastore.preferences.protobuf.s1.q("mgf1 hash type is not set");
                    return null;
                }
                androidx.datastore.preferences.protobuf.s1.q("signature hash type is not set");
                return null;
            }
            androidx.datastore.preferences.protobuf.s1.q("publicExponent is not set");
            return null;
        }
        androidx.datastore.preferences.protobuf.s1.q("key size is not set");
        return null;
    }
}
