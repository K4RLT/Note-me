package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zt0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13260a = 1;

    /* renamed from: b, reason: collision with root package name */
    public String f13261b;

    /* renamed from: c, reason: collision with root package name */
    public String f13262c;

    public zt0(String str, String str2) {
        this.f13261b = str;
        this.f13262c = str2;
    }

    public boolean equals(Object obj) {
        switch (this.f13260a) {
            case 1:
                if (!(obj instanceof p3.b) || this.f13261b != null || this.f13262c != null) {
                    return false;
                }
                return true;
            default:
                return super.equals(obj);
        }
    }

    public int hashCode() {
        int hashCode;
        switch (this.f13260a) {
            case 1:
                String str = this.f13261b;
                int i = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                String str2 = this.f13262c;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode ^ i;
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f13260a) {
            case 1:
                return "Pair{" + ((Object) this.f13261b) + " " + ((Object) this.f13262c) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zt0() {
    }
}
