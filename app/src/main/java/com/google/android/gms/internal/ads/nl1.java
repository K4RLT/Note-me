package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nl1 extends ll1 {

    /* renamed from: u, reason: collision with root package name */
    public final wl1 f8756u = new wl1();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof nl1) && ((nl1) obj).f8756u.equals(this.f8756u)) {
            return true;
        }
        return false;
    }

    public final ll1 g(String str) {
        return (ll1) this.f8756u.get(str);
    }

    public final int hashCode() {
        return this.f8756u.hashCode();
    }
}
