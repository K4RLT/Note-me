package je;

import com.google.android.gms.internal.mlkit_vision_digital_ink.z4;
import g5.q;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final List f19184a;

    public h(z4 z4Var) {
        if (z4Var != null) {
            this.f19184a = z4Var;
        } else {
            q.h("Null points");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof h) && this.f19184a.equals(((h) obj).f19184a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f19184a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return p.a.k("Stroke{properties=null, points=", this.f19184a.toString(), "}");
    }
}
