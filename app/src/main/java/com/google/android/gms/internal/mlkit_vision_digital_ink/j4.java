package com.google.android.gms.internal.mlkit_vision_digital_ink;
import b4.b;
import e5.f;
import g5.q;
import p.a;
import q.h;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f14495a;

    /* renamed from: b, reason: collision with root package name */
    public int f14496b = 0;

    /* renamed from: c, reason: collision with root package name */
    public i4 f14497c;

    public j4(int i) {
        this.f14495a = new Object[i + i];
    }

    public final void a(Object obj, Object obj2) {
        d(this.f14496b + 1);
        if (obj != null) {
            if (obj2 == null) {
                g5.q.h(p.a.k("null value in entry: ", obj.toString(), "=null"));
            }
        } else {
            g5.q.h("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        Object[] objArr = this.f14495a;
        int i = this.f14496b;
        int i10 = i + i;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        this.f14496b = i + 1;
    }

    public final void b(Set set) {
        if (set instanceof Collection) {
            d(set.size() + this.f14496b);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            a(entry.getKey(), entry.getValue());
        }
    }

    public final e5 c(boolean z3) {
        i4 i4Var;
        i4 i4Var2;
        if (z3 && (i4Var2 = this.f14497c) != null) {
            throw i4Var2.a();
        }
        e5 f10 = e5.f(this.f14496b, this.f14495a, this);
        if (z3 && (i4Var = this.f14497c) != null) {
            throw i4Var.a();
        }
        return f10;
    }

    public final void d(int i) {
        Object[] objArr = this.f14495a;
        int length = objArr.length;
        int i10 = i + i;
        if (i10 > length) {
            this.f14495a = Arrays.copyOf(objArr, b4.b(length, i10));
        }
    }
}
