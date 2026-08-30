package w4;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f27707a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            if (l.a(this.f27707a, ((b) obj).f27707a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f27707a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f27707a + ')';
    }
}
