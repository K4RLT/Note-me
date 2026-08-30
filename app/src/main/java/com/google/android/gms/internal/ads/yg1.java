package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum yg1 implements fn1 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: u, reason: collision with root package name */
    public final int f12873u;

    yg1(int i) {
        this.f12873u = i;
    }

    public static yg1 a(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12873u);
    }

    @Override // com.google.android.gms.internal.ads.fn1
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.f12873u;
        }
        ln1.a();
        throw null;
    }
}
