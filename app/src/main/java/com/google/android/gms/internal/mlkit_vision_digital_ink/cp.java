package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;

/* loaded from: classes.dex */
public abstract class cp {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14164a;

    public cp() {
        this.f14164a = new ConcurrentHashMap();
    }

    public abstract double a(long j10, Object obj);

    public abstract Object b();

    public abstract float c(long j10, Object obj);

    public Object d(a6 a6Var, gn gnVar) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f14164a;
        Object obj = concurrentHashMap.get(a6Var);
        if (obj != null) {
            return obj;
        }
        Object b10 = b();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(a6Var, b10);
        if (putIfAbsent == null) {
            int a10 = gnVar.a();
            for (int i = 0; i < a10; i++) {
                if (u5.f15047f.equals(gnVar.i(i))) {
                    gnVar.r(i);
                }
            }
            return b10;
        }
        return putIfAbsent;
    }

    public void e(RuntimeException runtimeException, q5 q5Var) {
        Log.e("AbstractAndroidBackend", "Internal logging error", runtimeException);
    }

    public abstract void f(q5 q5Var);

    public abstract void g(Object obj, long j10, boolean z3);

    public abstract void h(Object obj, long j10, byte b10);

    public abstract boolean i(Level level);

    public abstract void j(Object obj, long j10, double d2);

    public abstract void k(Object obj, long j10, float f10);

    public abstract boolean l(long j10, Object obj);
}
