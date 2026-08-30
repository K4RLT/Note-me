package v6;

import java.util.List;
import r6.m;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: u, reason: collision with root package name */
    public final b f27385u;

    /* renamed from: v, reason: collision with root package name */
    public final b f27386v;

    public c(b bVar, b bVar2) {
        this.f27385u = bVar;
        this.f27386v = bVar2;
    }

    @Override // v6.e
    public final r6.e b() {
        return new m(this.f27385u.b(), this.f27386v.b());
    }

    @Override // v6.e
    public final List c() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // v6.e
    public final boolean d() {
        if (this.f27385u.d() && this.f27386v.d()) {
            return true;
        }
        return false;
    }
}
