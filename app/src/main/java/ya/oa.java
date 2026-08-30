package ya;
import fa.y;

import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class oa {

    /* renamed from: a, reason: collision with root package name */
    public final na f31415a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f31416b;

    public /* synthetic */ oa(iw iwVar) {
        this.f31415a = (na) iwVar.f14489v;
        this.f31416b = (Integer) iwVar.f14490w;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oa)) {
            return false;
        }
        oa oaVar = (oa) obj;
        if (y.l(this.f31415a, oaVar.f31415a) && y.l(this.f31416b, oaVar.f31416b) && y.l(null, null) && y.l(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31415a, this.f31416b, null, null});
    }
}
