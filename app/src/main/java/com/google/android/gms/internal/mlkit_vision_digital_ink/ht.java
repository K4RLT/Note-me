package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final class ht {

    /* renamed from: a, reason: collision with root package name */
    public final String f14438a;

    public ht(String str) {
        this.f14438a = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof ht) && this.f14438a.equals(((ht) obj).f14438a)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14438a.hashCode() ^ (-722379962);
    }

    public final String toString() {
        return this.f14438a;
    }
}
