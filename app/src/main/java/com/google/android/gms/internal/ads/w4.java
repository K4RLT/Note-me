package com.google.android.gms.internal.ads;
import g3.a;
import p.a;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w4 extends x4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f12129b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12130c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12131d;
    public final byte[] e;

    public w4(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f12129b = str;
        this.f12130c = str2;
        this.f12131d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w4.class == obj.getClass()) {
                w4 w4Var = (w4) obj;
                if (Objects.equals(this.f12129b, w4Var.f12129b) && this.f12130c.equals(w4Var.f12130c) && this.f12131d.equals(w4Var.f12131d) && Arrays.equals(this.e, w4Var.e)) {
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
        String str = this.f12129b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.e) + ((this.f12131d.hashCode() + ((this.f12130c.hashCode() + ((i + 527) * 31)) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f12467a;
        int length = str.length();
        String str2 = this.f12129b;
        int length2 = length + 11 + String.valueOf(str2).length() + 11;
        String str3 = this.f12130c;
        int length3 = str3.length() + length2 + 14;
        String str4 = this.f12131d;
        StringBuilder sb2 = new StringBuilder(str4.length() + length3);
        g3.a.t(sb2, str, ": mimeType=", str2, ", filename=");
        return p.a.o(sb2, str3, ", description=", str4);
    }
}
