package eg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: b, reason: collision with root package name */
    public final b f16496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v0, types: [eg.b, eg.h0] */
    public c(ag.a aVar) {
        super(aVar);
        aVar.getClass();
        cg.d d2 = aVar.d();
        d2.getClass();
        this.f16496b = new h0(d2);
    }

    @Override // ag.a
    public final cg.d d() {
        return this.f16496b;
    }

    @Override // eg.a
    public final Object e() {
        return new ArrayList();
    }

    @Override // eg.a
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // eg.a
    public final Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // eg.a
    public final int h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // eg.a
    public final Object k(Object obj) {
        throw null;
    }

    @Override // eg.a
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }

    @Override // eg.n
    public final void m(Object obj, int i, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
