package com.google.android.gms.internal.ads;
import g3.a;

/* loaded from: classes.dex */
public final class a5 extends x4 {

    /* renamed from: b, reason: collision with root package name */
    public final String f4360b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4361c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4362d;

    public a5(String str, String str2, String str3) {
        super("----");
        this.f4360b = str;
        this.f4361c = str2;
        this.f4362d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a5.class == obj.getClass()) {
                a5 a5Var = (a5) obj;
                if (this.f4361c.equals(a5Var.f4361c) && this.f4360b.equals(a5Var.f4360b) && this.f4362d.equals(a5Var.f4362d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4362d.hashCode() + ((this.f4361c.hashCode() + ((this.f4360b.hashCode() + 527) * 31)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.x4
    public final String toString() {
        String str = this.f12467a;
        int length = str.length() + 9;
        String str2 = this.f4360b;
        int length2 = str2.length() + length + 14;
        String str3 = this.f4361c;
        StringBuilder sb2 = new StringBuilder(str3.length() + length2);
        g3.a.t(sb2, str, ": domain=", str2, ", description=");
        sb2.append(str3);
        return sb2.toString();
    }
}
