package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class l4 implements k4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f7931a;

    /* renamed from: b, reason: collision with root package name */
    public final long f7932b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7933c;

    /* renamed from: d, reason: collision with root package name */
    public final ox1 f7934d;

    public l4(long j10, long j11, boolean z3, ox1 ox1Var) {
        boolean z9 = true;
        if (j10 != -9223372036854775807L && j11 != -9223372036854775807L && j10 > j11) {
            z9 = false;
        }
        b80.l(z9);
        this.f7931a = j10;
        this.f7932b = j11;
        this.f7933c = z3;
        this.f7934d = ox1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l4.class == obj.getClass()) {
            l4 l4Var = (l4) obj;
            if (this.f7931a == l4Var.f7931a && this.f7932b == l4Var.f7932b && this.f7933c == l4Var.f7933c && Objects.equals(this.f7934d, l4Var.f7934d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = Long.hashCode(this.f7932b) + ((Long.hashCode(this.f7931a) + 527) * 31);
        ox1 ox1Var = this.f7934d;
        if (ox1Var != null) {
            i = ox1Var.hashCode();
        } else {
            i = 0;
        }
        return (((hashCode * 31) + (this.f7933c ? 1 : 0)) * 31) + i;
    }

    public final String toString() {
        Object valueOf;
        String sb2;
        String concat;
        long j10 = this.f7931a;
        if (j10 == -9223372036854775807L) {
            valueOf = "UNSET";
        } else {
            valueOf = Long.valueOf(j10);
        }
        long j11 = this.f7932b;
        String obj = valueOf.toString();
        String str = "";
        if (j11 == -9223372036854775807L) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(j11).length() + 12);
            sb3.append(", endTimeMs=");
            sb3.append(j11);
            sb2 = sb3.toString();
        }
        ox1 ox1Var = this.f7934d;
        if (ox1Var == null) {
            concat = "";
        } else {
            concat = ", title=".concat(ox1Var.toString());
        }
        if (true == this.f7933c) {
            str = ", hidden";
        }
        StringBuilder sb4 = new StringBuilder(str.length() + sb2.length() + obj.length() + 21 + concat.length());
        g3.a.t(sb4, "Chapter: startTimeMs=", obj, sb2, str);
        sb4.append(concat);
        return sb4.toString();
    }
}
