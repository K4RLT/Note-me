package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final j6.i f13941a;

    /* renamed from: b, reason: collision with root package name */
    public j6.n f13942b;

    /* renamed from: c, reason: collision with root package name */
    public final ra.e f13943c;

    /* renamed from: d, reason: collision with root package name */
    public final j6.c f13944d;

    public v() {
        j6.i iVar = new j6.i(4);
        this.f13941a = iVar;
        this.f13942b = ((j6.n) iVar.f18925v).u();
        ra.e eVar = new ra.e(13, false);
        eVar.f24675v = new c("", 0L, null);
        eVar.f24676w = new c("", 0L, null);
        eVar.f24677x = new ArrayList();
        this.f13943c = eVar;
        this.f13944d = new j6.c(10);
        a aVar = new a(0);
        aVar.f13621b = this;
        o5 o5Var = (o5) iVar.f18927x;
        ((HashMap) o5Var.f13873u).put("internal.registerCallback", aVar);
        a aVar2 = new a(1);
        aVar2.f13621b = this;
        ((HashMap) o5Var.f13873u).put("internal.eventLogger", aVar2);
    }

    public final void a(s3 s3Var) {
        j jVar;
        j6.i iVar = this.f13941a;
        try {
            this.f13942b = ((j6.n) iVar.f18925v).u();
            if (!(iVar.o(this.f13942b, (t3[]) s3Var.q().toArray(new t3[0])) instanceof h)) {
                for (r3 r3Var : s3Var.p().r()) {
                    i5 q10 = r3Var.q();
                    String p10 = r3Var.p();
                    Iterator it = q10.iterator();
                    while (it.hasNext()) {
                        n o10 = iVar.o(this.f13942b, (t3) it.next());
                        if (o10 instanceof m) {
                            j6.n nVar = this.f13942b;
                            if (!nVar.x(p10)) {
                                jVar = null;
                            } else {
                                n t3 = nVar.t(p10);
                                if (t3 instanceof j) {
                                    jVar = (j) t3;
                                } else {
                                    throw new IllegalStateException("Invalid function name: " + p10);
                                }
                            }
                            if (jVar != null) {
                                jVar.e(this.f13942b, Collections.singletonList(o10));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: " + p10);
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    public final boolean b(c cVar) {
        ra.e eVar = this.f13943c;
        try {
            eVar.f24675v = cVar;
            eVar.f24676w = (c) cVar.clone();
            ((ArrayList) eVar.f24677x).clear();
            ((j6.n) this.f13941a.f18926w).y("runtime.counter", new g(Double.valueOf(0.0d)));
            this.f13944d.k(this.f13942b.u(), eVar);
            if (((c) eVar.f24676w).equals((c) eVar.f24675v)) {
                if (((ArrayList) eVar.f24677x).isEmpty()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }
}
