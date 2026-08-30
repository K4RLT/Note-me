package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s4 extends x4 {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f10490b;

    public s4(String str, byte[] bArr) {
        super(str);
        this.f10490b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s4.class == obj.getClass()) {
                s4 s4Var = (s4) obj;
                if (this.f12467a.equals(s4Var.f12467a) && Arrays.equals(this.f10490b, s4Var.f10490b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10490b) + ((this.f12467a.hashCode() + 527) * 31);
    }
}
