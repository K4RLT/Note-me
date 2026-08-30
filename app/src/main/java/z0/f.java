package z0;

import r0.p1;
import r0.q2;
import w0.k;

/* loaded from: classes.dex */
public final class f extends w0.d {
    public g A;

    @Override // w0.d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof p1)) {
            return false;
        }
        return super.containsKey((p1) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof q2)) {
            return false;
        }
        return super.containsValue((q2) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, y0.b] */
    /* JADX WARN: Type inference failed for: r1v2, types: [w0.b] */
    @Override // w0.d
    /* renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g b() {
        k kVar = this.f27667w;
        g gVar = this.A;
        k kVar2 = gVar.f27660u;
        g gVar2 = gVar;
        if (kVar != kVar2) {
            this.f27666v = new Object();
            gVar2 = new w0.b(this.f27667w, this.f27670z);
        }
        this.A = gVar2;
        return gVar2;
    }

    @Override // w0.d, java.util.AbstractMap, java.util.Map
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

    @Override // w0.d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof p1)) {
            return null;
        }
        return (q2) super.remove((p1) obj);
    }
}
