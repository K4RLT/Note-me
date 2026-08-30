package com.google.android.gms.internal.measurement;
import g3.a;
import j6.e;
import j6.n;
import o0.f;
import q.x;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class i8 extends j {

    /* renamed from: w, reason: collision with root package name */
    public final o5 f13782w;

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f13783x;

    public i8(o5 o5Var) {
        super("require");
        this.f13783x = new HashMap();
        this.f13782w = o5Var;
    }

    @Override // com.google.android.gms.internal.measurement.j
    public final n e(n nVar, List list) {
        n nVar2;
        f(1, "require", list);
        String b10 = ((e) nVar.f18939w).k(nVar, (n) list.get(0)).b();
        HashMap hashMap = this.f13783x;
        if (hashMap.containsKey(b10)) {
            return (n) hashMap.get(b10);
        }
        HashMap hashMap2 = (HashMap) this.f13782w.f13873u;
        if (hashMap2.containsKey(b10)) {
            try {
                nVar2 = (n) ((Callable) hashMap2.get(b10)).call();
            } catch (Exception unused) {
                x.o(a.k("Failed to create API implementation: ", b10));
                return null;
            }
        } else {
            nVar2 = n.f13848h;
        }
        if (nVar2 instanceof j) {
            hashMap.put(b10, (j) nVar2);
        }
        return nVar2;
    }
}
