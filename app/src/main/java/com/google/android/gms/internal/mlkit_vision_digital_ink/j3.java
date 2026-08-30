package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public abstract class j3 {
    public abstract n4 a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j3) {
            return a().equals(((j3) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
