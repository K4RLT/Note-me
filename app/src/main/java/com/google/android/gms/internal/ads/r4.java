package com.google.android.gms.internal.ads;
import g3.a;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r4 extends x4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f10075b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10076c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10077d;
    public final byte[] e;

    public r4(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f10075b = str;
        this.f10076c = str2;
        this.f10077d = i;
        this.e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.q7
    public final void a(j6 j6Var) {
        j6Var.a(this.e, this.f10077d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && r4.class == obj.getClass()) {
                r4 r4Var = (r4) obj;
                if (this.f10077d == r4Var.f10077d && this.f10075b.equals(r4Var.f10075b) && Objects.equals(this.f10076c, r4Var.f10076c) && Arrays.equals(this.e, r4Var.e)) {
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
        int hashCode = this.f10075b.hashCode();
        String str = this.f10076c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.e) + ((((((this.f10077d + 527) * 31) + hashCode) * 31) + i) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f12467a;
        int length = str.length();
        String str2 = this.f10075b;
        int length2 = str2.length();
        String str3 = this.f10076c;
        StringBuilder sb2 = new StringBuilder(length + 11 + length2 + 14 + String.valueOf(str3).length());
        g3.a.t(sb2, str, ": mimeType=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
