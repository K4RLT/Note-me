package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class j6 {

    /* renamed from: c, reason: collision with root package name */
    public static final j6 f13458c = new j6();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f13460b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final a6 f13459a = new a6(0);

    public final m6 a(Class cls) {
        m6 k3;
        Charset charset = u5.f13575a;
        j4 j4Var = null;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f13460b;
            m6 m6Var = (m6) concurrentHashMap.get(cls);
            if (m6Var == null) {
                a6 a6Var = this.f13459a;
                a6Var.getClass();
                s6 s6Var = n6.f13506a;
                if (!q5.class.isAssignableFrom(cls)) {
                    int i = e5.f13399a;
                }
                l6 a10 = ((a6) a6Var.f13354v).a(cls);
                if ((a10.f13486d & 2) == 2) {
                    int i10 = e5.f13399a;
                    s6 s6Var2 = n6.f13506a;
                    j4 j4Var2 = l5.f13482a;
                    k3 = new h6(s6Var2, a10.f13483a);
                } else {
                    int i11 = e5.f13399a;
                    int i12 = i6.f13446a;
                    int i13 = y5.f13617a;
                    s6 s6Var3 = n6.f13506a;
                    if (a10.a() - 1 != 1) {
                        j4Var = l5.f13482a;
                    }
                    int i14 = d6.f13390a;
                    k3 = g6.k(a10, s6Var3, j4Var);
                }
                m6 m6Var2 = (m6) concurrentHashMap.putIfAbsent(cls, k3);
                if (m6Var2 != null) {
                    return m6Var2;
                }
                return k3;
            }
            return m6Var;
        }
        g5.q.h("messageType");
        return null;
    }
}
