package fa;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o implements da.b {

    /* renamed from: c, reason: collision with root package name */
    public static final o f16905c = new o(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f16906b;

    public /* synthetic */ o(String str) {
        this.f16906b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return y.l(this.f16906b, ((o) obj).f16906b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16906b});
    }
}
