package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class ho1 {

    /* renamed from: c, reason: collision with root package name */
    public static final ho1 f6854c = new ho1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f6856b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final tf f6855a = new tf(1);

    public final oo1 a(Class cls) {
        oo1 y10;
        ConcurrentHashMap concurrentHashMap = this.f6856b;
        Object obj = concurrentHashMap.get(cls);
        if (obj == null) {
            tf tfVar = this.f6855a;
            tfVar.getClass();
            ck1 ck1Var = xy.M;
            s6 s6Var = po1.f9572a;
            if (!dn1.class.isAssignableFrom(cls)) {
                int i = em1.f5727a;
            }
            int i10 = em1.f5727a;
            jo1 b10 = ((zq0) tfVar.f11339v).b(cls);
            if ((b10.f7502d & 2) == 2) {
                y10 = new do1(po1.f9572a, b10.f7499a);
            } else {
                int i11 = eo1.f5742a;
                int i12 = un1.f11690a;
                s6 s6Var2 = po1.f9572a;
                if (b10.a() - 1 == 1) {
                    ck1Var = null;
                }
                int i13 = yn1.f12924a;
                y10 = bo1.y(b10, s6Var2, ck1Var);
            }
            oo1 oo1Var = (oo1) concurrentHashMap.putIfAbsent(cls, y10);
            if (oo1Var != null) {
                return oo1Var;
            }
            return y10;
        }
        return (oo1) obj;
    }
}
