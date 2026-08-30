package b0;
import d1.q;
import l.a;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s extends q implements b2.n {
    public androidx.compose.foundation.lazy.layout.b I;

    @Override // q
    public final void Q0() {
        this.I.getClass();
    }

    @Override // q
    public final void R0() {
        androidx.compose.foundation.lazy.layout.b bVar = this.I;
        bVar.d();
        bVar.f521b = null;
    }

    @Override // b2.n
    public final void e0(b2.l0 l0Var) {
        ArrayList arrayList = this.I.f526h;
        if (arrayList.size() <= 0) {
            l0Var.b();
        } else {
            a5.a.p(arrayList.get(0));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && kotlin.jvm.internal.a(this.I, ((s) obj).I)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.I.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.I + ')';
    }
}
