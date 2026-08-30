package ic;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements dd.c, dd.b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18410a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f18411b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Executor f18412c;

    public l(Executor executor) {
        this.f18412c = executor;
    }

    public final synchronized void a(Executor executor, dd.a aVar) {
        try {
            executor.getClass();
            if (!this.f18410a.containsKey(bc.b.class)) {
                this.f18410a.put(bc.b.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f18410a.get(bc.b.class)).put(aVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
