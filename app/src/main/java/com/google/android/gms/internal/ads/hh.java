package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum hh implements fn1 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);


    /* renamed from: u, reason: collision with root package name */
    public final int f6816u;

    hh(int i) {
        this.f6816u = i;
    }

    public static hh a(int i) {
        if (i == 0) {
            return UNSUPPORTED;
        }
        if (i == 2) {
            return ARM7;
        }
        if (i == 999) {
            return UNKNOWN;
        }
        if (i == 4) {
            return X86;
        }
        if (i == 5) {
            return ARM64;
        }
        if (i == 6) {
            return X86_64;
        }
        if (i != 7) {
            return null;
        }
        return RISCV64;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f6816u);
    }

    @Override // com.google.android.gms.internal.ads.fn1
    public final int zza() {
        return this.f6816u;
    }
}
