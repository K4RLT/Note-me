package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u6 {
    public static final s6 e;

    /* renamed from: f, reason: collision with root package name */
    public static final t6 f15050f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15051a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15052b;

    /* renamed from: c, reason: collision with root package name */
    public final s6 f15053c;

    /* renamed from: d, reason: collision with root package name */
    public t6 f15054d;

    static {
        int i = 0;
        e = new s6(i);
        f15050f = new t6(i);
    }

    public u6(u6 u6Var) {
        HashMap hashMap = new HashMap();
        this.f15051a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f15052b = hashMap2;
        hashMap.putAll(u6Var.f15051a);
        hashMap2.putAll(u6Var.f15052b);
        this.f15053c = u6Var.f15053c;
        this.f15054d = u6Var.f15054d;
    }

    public void a(d6 d6Var, Object obj, p6 p6Var) {
        s6 s6Var = (s6) this.f15051a.get(d6Var);
        if (s6Var != null) {
            s6Var.a(d6Var, obj, p6Var);
        } else {
            this.f15053c.a(d6Var, obj, p6Var);
        }
    }

    public void b(d6 d6Var, Iterator it, p6 p6Var) {
        t6 t6Var = (t6) this.f15052b.get(d6Var);
        if (t6Var != null) {
            t6Var.a(d6Var, it, p6Var);
            return;
        }
        t6 t6Var2 = this.f15054d;
        if (t6Var2 != null && !this.f15051a.containsKey(d6Var)) {
            t6Var2.a(d6Var, it, p6Var);
        } else {
            while (it.hasNext()) {
                a(d6Var, it.next(), p6Var);
            }
        }
    }

    public /* synthetic */ u6() {
        this.f15051a = new HashMap();
        this.f15052b = new HashMap();
        this.f15054d = null;
        this.f15053c = f7.f14302u;
    }
}
