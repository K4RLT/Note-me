package rf;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.j implements df.q {

    /* renamed from: u, reason: collision with root package name */
    public static final e f24777u = new kotlin.jvm.internal.j(3, h.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        h hVar = (h) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = h.f24784v;
        hVar.getClass();
        if (obj3 == j.f24800l) {
            obj3 = new m(hVar.q());
        }
        return new o(obj3);
    }
}
