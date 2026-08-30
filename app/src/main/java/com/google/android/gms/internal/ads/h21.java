package com.google.android.gms.internal.ads;
import ac.b;

/* loaded from: classes.dex */
public final class h21 {

    /* renamed from: a, reason: collision with root package name */
    public final ry0 f6570a;

    public h21(mx0 mx0Var, ry0 ry0Var) {
        this.f6570a = ry0Var;
    }

    public final g21 a(int i) {
        return new g21(i, this.f6570a);
    }

    public final void b(int i) {
        this.f6570a.a(i - 1, -1L, null, null);
    }

    public final void c(int i, String str) {
        this.f6570a.a(i - 1, -1L, null, str);
    }

    public final void d(int i, Throwable th) {
        this.f6570a.a(i - 1, -1L, th, null);
    }

    public final void e(int i, ac.b bVar) {
        g21 a10 = a(i);
        a10.a();
        bVar.a(new t81(bVar, 0, new lt0(this, a10)), o81.f9033u);
    }

    public final void f(int i, Runnable runnable) {
        try {
            a(i).a();
            runnable.run();
        } finally {
        }
    }
}
