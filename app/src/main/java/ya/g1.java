package ya;
import fa.y;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final ab f31300a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f31301b;

    /* renamed from: c, reason: collision with root package name */
    public final pe f31302c;

    public /* synthetic */ g1(y yVar) {
        this.f31300a = (ab) yVar.f31591v;
        this.f31301b = (Boolean) yVar.f31592w;
        this.f31302c = (pe) yVar.f31593x;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (y.l(this.f31300a, g1Var.f31300a) && y.l(this.f31301b, g1Var.f31301b) && y.l(null, null) && y.l(this.f31302c, g1Var.f31302c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31300a, this.f31301b, null, this.f31302c});
    }
}
