package je;

import com.google.android.gms.internal.mlkit_vision_digital_ink.z4;
import g5.q;
import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final List f19180a;

    public f(z4 z4Var) {
        if (z4Var != null) {
            this.f19180a = z4Var;
        } else {
            q.h("Null strokes");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f19180a.equals(((f) obj).f19180a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19180a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return p.a.k("Ink{strokes=", this.f19180a.toString(), "}");
    }
}
