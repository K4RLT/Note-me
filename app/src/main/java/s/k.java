package s;
import l.a;

import r0.i1;
import r0.y;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final i1 f24849a = y.B(h.f24847a);

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return kotlin.jvm.internal.a((j) ((k) obj).f24849a.getValue(), (j) this.f24849a.getValue());
    }

    public final int hashCode() {
        return ((j) this.f24849a.getValue()).hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + ((j) this.f24849a.getValue()) + ')';
    }
}
