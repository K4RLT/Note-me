package com.google.android.gms.internal.play_billing;
import j2.u;
import q.h;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class m2 {

    /* renamed from: c, reason: collision with root package name */
    public static final m2 f15489c = new m2();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f15491b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final d2 f15490a = new d2();

    public final p2 a(Class cls) {
        p2 u9;
        Charset charset = w1.f15539a;
        p1 p1Var = null;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f15491b;
            p2 p2Var = (p2) concurrentHashMap.get(cls);
            if (p2Var == null) {
                d2 d2Var = this.f15490a;
                d2Var.getClass();
                p1 p1Var2 = q2.f15517a;
                if (!r1.class.isAssignableFrom(cls)) {
                    int i = d1.f15402a;
                }
                o2 a10 = ((d2) d2Var.f15404a).a(cls);
                if ((a10.f15502d & 2) == 2) {
                    int i10 = d1.f15402a;
                    p1 p1Var3 = q2.f15517a;
                    p1 p1Var4 = l1.f15481a;
                    u9 = new k2(p1Var3, a10.f15499a);
                } else {
                    int i11 = d1.f15402a;
                    int i12 = l2.f15482a;
                    int i13 = b2.f15383a;
                    p1 p1Var5 = q2.f15517a;
                    if (a10.a() - 1 != 1) {
                        p1Var = l1.f15481a;
                    }
                    int i14 = f2.f15423a;
                    u9 = j2.u(a10, p1Var5, p1Var);
                }
                p2 p2Var2 = (p2) concurrentHashMap.putIfAbsent(cls, u9);
                if (p2Var2 != null) {
                    return p2Var2;
                }
                return u9;
            }
            return p2Var;
        }
        g5.q.h("messageType");
        return null;
    }
}
