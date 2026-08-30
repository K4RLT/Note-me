package com.google.android.gms.internal.ads;
import a5.a;

/* loaded from: classes.dex */
public final class zu0 implements q7 {

    /* renamed from: a, reason: collision with root package name */
    public final int f13271a;

    public zu0(int i) {
        this.f13271a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zu0) && this.f13271a == ((zu0) obj).f13271a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13271a;
    }

    public final String toString() {
        int i = this.f13271a;
        return a5.a.f(i, "Mp4AlternateGroup: ", new StringBuilder(String.valueOf(i).length() + 19));
    }
}
