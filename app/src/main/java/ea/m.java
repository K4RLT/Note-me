package ea;

import com.google.android.gms.internal.ads.mu;
import fa.y;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final a f16022a;

    /* renamed from: b, reason: collision with root package name */
    public final ca.d f16023b;

    public /* synthetic */ m(a aVar, ca.d dVar) {
        this.f16022a = aVar;
        this.f16023b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (y.l(this.f16022a, mVar.f16022a) && y.l(this.f16023b, mVar.f16023b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16022a, this.f16023b});
    }

    public final String toString() {
        mu muVar = new mu(this);
        muVar.f(this.f16022a, "key");
        muVar.f(this.f16023b, "feature");
        return muVar.toString();
    }
}
