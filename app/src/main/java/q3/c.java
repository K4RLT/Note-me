package q3;
import c.c;

import android.os.Build;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f23387a;

    public c(DisplayCutout displayCutout) {
        this.f23387a = displayCutout;
    }

    public final j3.c a() {
        if (Build.VERSION.SDK_INT >= 30) {
            return j3.c.c(f2.c.e(this.f23387a));
        }
        return j3.c.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return this.f23387a.equals(((c) obj).f23387a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f23387a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f23387a + "}";
    }
}
