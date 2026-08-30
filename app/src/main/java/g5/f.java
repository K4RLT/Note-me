package g5;

import g0.u1;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final v f17437a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f17438b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f17439c;

    /* renamed from: d, reason: collision with root package name */
    public final ReentrantLock f17440d;
    public final fg.o e;

    /* renamed from: f, reason: collision with root package name */
    public final fg.o f17441f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f17442g;

    public f(v vVar, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f17437a = vVar;
        o0 o0Var = new o0(vVar, hashMap, hashMap2, strArr, vVar.f17543k, new u1(1, this, f.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 1));
        this.f17438b = o0Var;
        this.f17439c = new LinkedHashMap();
        this.f17440d = new ReentrantLock();
        this.e = new fg.o(this);
        this.f17441f = new fg.o(this);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.f17442g = new Object();
        o0Var.f17505k = new a1.c(17, this);
    }
}
