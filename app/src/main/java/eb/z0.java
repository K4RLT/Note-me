package eb;

import java.lang.Thread;

/* loaded from: classes.dex */
public final class z0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f16468a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f16469b;

    public z0(y0 y0Var, String str) {
        this.f16469b = y0Var;
        this.f16468a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f16469b.f().A.f(th, this.f16468a);
    }
}
