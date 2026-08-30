package xa;
import n0.b;
import q.f;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class d1 extends h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f30403b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f30404c;

    public d1(Object obj, Method method) {
        this.f30403b = method;
        this.f30404c = obj;
    }

    @Override // xa.h1
    public final Object a(Class cls) {
        String b10 = b(cls);
        if (b10 == null) {
            return this.f30403b.invoke(this.f30404c, cls);
        }
        g5.f("UnsafeAllocator is used for non-instantiable type: ".concat(b10));
        return null;
    }
}
