package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c5 extends x4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f5001b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f5002c;

    public c5(String str, byte[] bArr) {
        super("PRIV");
        this.f5001b = str;
        this.f5002c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && c5.class == obj.getClass()) {
                c5 c5Var = (c5) obj;
                if (this.f5001b.equals(c5Var.f5001b) && Arrays.equals(this.f5002c, c5Var.f5002c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f5002c) + ((this.f5001b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f12467a;
        int length = str.length() + 8;
        String str2 = this.f5001b;
        return p.a.o(new StringBuilder(str2.length() + length), str, ": owner=", str2);
    }
}
