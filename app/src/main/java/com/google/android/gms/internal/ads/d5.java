package com.google.android.gms.internal.ads;
import d5.a;
import g3.a;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d5 extends x4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f5308b;

    /* renamed from: c, reason: collision with root package name */
    public final d51 f5309c;

    public d5(String str, String str2, y51 y51Var) {
        super(str);
        b80.l(!y51Var.isEmpty());
        this.f5308b = str2;
        d51 u9 = d51.u(y51Var);
        this.f5309c = u9;
    }

    public static ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01aa A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x023d, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x023d, blocks: (B:6:0x015a, B:18:0x01a1, B:20:0x01aa, B:21:0x01b4, B:27:0x004e, B:29:0x0057, B:30:0x0061, B:84:0x01f8), top: B:2:0x0010 }] */
    @Override // com.google.android.gms.internal.ads.q7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.j6 r11) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d5.a(com.google.android.gms.internal.ads.j6):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && d5.class == obj.getClass()) {
                d5 d5Var = (d5) obj;
                if (this.f12467a.equals(d5Var.f12467a) && Objects.equals(this.f5308b, d5Var.f5308b) && this.f5309c.equals(d5Var.f5309c)) {
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
        String str = this.f5308b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.f5309c.hashCode() + (((hashCode * 31) + i) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String valueOf = String.valueOf(this.f5309c);
        String str = this.f12467a;
        int length = str.length();
        String str2 = this.f5308b;
        StringBuilder sb2 = new StringBuilder(length + 14 + String.valueOf(str2).length() + 9 + valueOf.length());
        g3.a.t(sb2, str, ": description=", str2, ": values=");
        sb2.append(valueOf);
        return sb2.toString();
    }
}
