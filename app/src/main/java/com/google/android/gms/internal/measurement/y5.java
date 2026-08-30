package com.google.android.gms.internal.measurement;
import d.b;
import g5.q;
import q.h;
import q0.d;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class y5 {

    /* renamed from: c, reason: collision with root package name */
    public static final y5 f13983c = new y5();

    /* renamed from: a, reason: collision with root package name */
    public final o5 f13984a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f13985b = new ConcurrentHashMap();

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.google.android.gms.internal.measurement.o5] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, com.google.android.gms.internal.measurement.o5] */
    public y5() {
        r5[] r5VarArr = {c5.f13672v, o5.f13872v};
        com.google.android.gms.internal.measurement.o5 obj = new Object();
        obj.f13873u = r5VarArr;
        com.google.android.gms.internal.measurement.o5 obj2 = new Object();
        Charset charset = d5.f13686a;
        obj2.f13873u = obj;
        this.f13984a = obj2;
    }

    public final a6 a(Class cls) {
        Charset charset = d5.f13686a;
        c5 c5Var = null;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f13985b;
            a6 a6Var = (a6) concurrentHashMap.get(cls);
            if (a6Var == null) {
                o5 o5Var = this.f13984a;
                o5Var.getClass();
                b5.class.isAssignableFrom(cls);
                z5 b10 = ((o5) o5Var.f13873u).b(cls);
                if ((b10.f13996d & 2) == 2) {
                    a6Var = new u5(b10.f13993a);
                } else {
                    if (p5.f13879a[q0.d.b(b10.a())] != 1) {
                        c5Var = o0.f13869a;
                    }
                    a6Var = t5.k(b10, c5Var);
                }
                a6 a6Var2 = (a6) concurrentHashMap.putIfAbsent(cls, a6Var);
                if (a6Var2 != null) {
                    return a6Var2;
                }
            }
            return a6Var;
        }
        g5.q.h("messageType");
        return null;
    }
}
