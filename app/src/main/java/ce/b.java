package ce;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4099a;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof b) && this.f4099a == ((b) obj).f4099a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.FALSE, Boolean.valueOf(this.f4099a)});
    }
}
