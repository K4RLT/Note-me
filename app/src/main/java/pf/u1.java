package pf;

/* loaded from: classes.dex */
public abstract class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f22799a = new ThreadLocal();

    public static q0 a() {
        ThreadLocal threadLocal = f22799a;
        q0 q0Var = (q0) threadLocal.get();
        if (q0Var == null) {
            h hVar = new h(Thread.currentThread());
            threadLocal.set(hVar);
            return hVar;
        }
        return q0Var;
    }
}
