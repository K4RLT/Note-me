package fb;

import fa.y;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements da.b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f16932b = new Object();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && y.l(null, null) && y.l(null, null) && y.l(null, null) && y.l(null, null) && y.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Arrays.hashCode(new Object[]{bool, bool, null, bool, bool, null, null, null, null});
    }
}
