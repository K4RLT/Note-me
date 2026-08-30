package ya;

import com.google.android.gms.internal.ads.a41;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class dg implements k {

    /* renamed from: u, reason: collision with root package name */
    public transient yc f31203u;

    /* renamed from: v, reason: collision with root package name */
    public transient a41 f31204v;

    public final Map a() {
        a41 a41Var = this.f31204v;
        if (a41Var == null) {
            eg egVar = (eg) this;
            a41 a41Var2 = new a41(egVar, egVar.f31286w);
            this.f31204v = a41Var2;
            return a41Var2;
        }
        return a41Var;
    }

    public final Set b() {
        yc ycVar = this.f31203u;
        if (ycVar == null) {
            eg egVar = (eg) this;
            yc ycVar2 = new yc(egVar, egVar.f31286w);
            this.f31203u = ycVar2;
            return ycVar2;
        }
        return ycVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return a().equals(((dg) ((k) obj)).a());
    }

    public final int hashCode() {
        return ((a41) a()).f4356v.hashCode();
    }

    public final String toString() {
        return ((a41) a()).f4356v.toString();
    }
}
