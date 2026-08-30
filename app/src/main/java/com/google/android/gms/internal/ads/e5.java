package com.google.android.gms.internal.ads;
import p.a;

import java.util.Objects;

/* loaded from: classes.dex */
public final class e5 extends x4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f5590b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5591c;

    public e5(String str, String str2, String str3) {
        super(str);
        this.f5590b = str2;
        this.f5591c = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e5.class == obj.getClass()) {
                e5 e5Var = (e5) obj;
                if (this.f12467a.equals(e5Var.f12467a) && Objects.equals(this.f5590b, e5Var.f5590b) && this.f5591c.equals(e5Var.f5591c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f12467a.hashCode() + 527;
        String str = this.f5590b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.f5591c.hashCode() + (((hashCode * 31) + i) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f12467a;
        int length = str.length() + 6;
        String str2 = this.f5591c;
        return p.a.o(new StringBuilder(str2.length() + length), str, ": url=", str2);
    }
}
