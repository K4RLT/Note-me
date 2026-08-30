package xa;
import n0.b;
import q.f;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f1 extends h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f30412b;

    public f1(Method method) {
        this.f30412b = method;
    }

    @Override // xa.h1
    public final Object a(Class cls) {
        String b10 = b(cls);
        if (b10 == null) {
            return this.f30412b.invoke(null, cls, Object.class);
        }
        g5.f("UnsafeAllocator is used for non-instantiable type: ".concat(b10));
        return null;
    }
}
