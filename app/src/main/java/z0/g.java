package z0;

import c7.x;
import r0.a0;
import r0.p1;
import r0.q2;
import w0.k;

/* loaded from: classes.dex */
public final class g extends w0.b implements a0 {

    /* renamed from: x, reason: collision with root package name */
    public static final g f31761x = new w0.b(k.e, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [z0.f, w0.d] */
    @Override // w0.b
    public final w0.d a() {
        w0.d dVar = new w0.d(this);
        dVar.A = this;
        return dVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z0.f, w0.d] */
    @Override // w0.b
    public final w0.d b() {
        w0.d dVar = new w0.d(this);
        dVar.A = this;
        return dVar;
    }

    @Override // w0.b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        return super.containsKey((p1) obj);
    }

    @Override // w0.b, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof q2)) {
            return false;
        }
        return super.containsValue((q2) obj);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [z0.g, w0.b] */
    public final g e(p1 p1Var, q2 q2Var) {
        x u9 = this.f27660u.u(p1Var.hashCode(), 0, p1Var, q2Var);
        if (u9 == null) {
            return this;
        }
        return new w0.b((k) u9.f4003w, this.f27661v + u9.f4002v);
    }

    @Override // w0.b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof p1)) {
            return null;
        }
        return (q2) super.get((p1) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof p1)) {
            return obj2;
        }
        return (q2) super.getOrDefault((p1) obj, (q2) obj2);
    }
}