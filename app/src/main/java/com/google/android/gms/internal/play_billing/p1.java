package com.google.android.gms.internal.play_billing;
import q.x;
import x.n;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class p1 implements h2 {

    /* renamed from: b, reason: collision with root package name */
    public static final p1 f15508b = new p1(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15509a;

    public /* synthetic */ p1(int i) {
        this.f15509a = i;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, com.google.android.gms.internal.play_billing.e2] */
    public static final e2 c(Object obj, Object obj2) {
        e2 e2Var = (e2) obj;
        e2 e2Var2 = (e2) obj2;
        if (!e2Var2.isEmpty()) {
            if (!e2Var.f15413u) {
                if (e2Var.isEmpty()) {
                    e2Var = new e2();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e2Var);
                    linkedHashMap.f15413u = true;
                    e2Var = linkedHashMap;
                }
            }
            e2Var.b();
            if (!e2Var2.isEmpty()) {
                e2Var.putAll(e2Var2);
            }
        }
        return e2Var;
    }

    @Override // com.google.android.gms.internal.play_billing.h2
    public o2 a(Class cls) {
        switch (this.f15509a) {
            case 0:
                if (r1.class.isAssignableFrom(cls)) {
                    try {
                        return (o2) r1.m(cls.asSubclass(r1.class)).j(3);
                    } catch (Exception e) {
                        l4.a.k("Unable to get message info for ".concat(cls.getName()), e);
                    }
                } else {
                    q.x.n("Unsupported message type: ".concat(cls.getName()));
                }
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.google.android.gms.internal.play_billing.h2
    public boolean b(Class cls) {
        switch (this.f15509a) {
            case 0:
                return r1.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
