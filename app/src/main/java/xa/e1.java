package xa;
import n0.b;
import q.f;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e1 extends h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f30408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f30409c;

    public e1(int i, Method method) {
        this.f30408b = method;
        this.f30409c = i;
    }

    @Override // xa.h1
    public final Object a(Class cls) {
        String b10 = b(cls);
        if (b10 == null) {
            return this.f30408b.invoke(null, cls, Integer.valueOf(this.f30409c));
        }
        g5.f("UnsafeAllocator is used for non-instantiable type: ".concat(b10));
        return null;
    }
}
