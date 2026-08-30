package ya;

import com.google.android.gms.internal.ads.j41;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class f extends cg implements Serializable {

    /* renamed from: u, reason: collision with root package name */
    public final Object f31287u;

    /* renamed from: v, reason: collision with root package name */
    public final j41 f31288v;

    public f(Object obj, j41 j41Var) {
        this.f31287u = obj;
        this.f31288v = j41Var;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f31287u;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f31288v;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
