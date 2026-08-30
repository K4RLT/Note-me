package com.google.android.gms.internal.mlkit_vision_digital_ink;
import g5.q;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class oo {

    /* renamed from: c, reason: collision with root package name */
    public static final oo f14756c = new oo();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f14758b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final s5 f14757a = new s5(1);

    public final ro a(Class cls) {
        ro D;
        Charset charset = vn.f15137a;
        jm jmVar = null;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f14758b;
            ro roVar = (ro) concurrentHashMap.get(cls);
            if (roVar == null) {
                s5 s5Var = this.f14757a;
                s5Var.getClass();
                jm jmVar2 = so.f14979a;
                nn.class.isAssignableFrom(cls);
                qo a10 = ((s5) s5Var.f14961v).a(cls);
                if ((a10.f14855d & 2) == 2) {
                    jm jmVar3 = so.f14979a;
                    jm jmVar4 = cn.f14162a;
                    D = new ko(jmVar3, a10.f14852a);
                } else {
                    int i = lo.f14606a;
                    int i10 = ao.f14026a;
                    jm jmVar5 = so.f14979a;
                    if (a10.a() - 1 != 1) {
                        jmVar = cn.f14162a;
                    }
                    int i11 = fo.f14314a;
                    D = jo.D(a10, jmVar5, jmVar);
                }
                ro roVar2 = (ro) concurrentHashMap.putIfAbsent(cls, D);
                if (roVar2 != null) {
                    return roVar2;
                }
                return D;
            }
            return roVar;
        }
        q.h("messageType");
        return null;
    }
}
