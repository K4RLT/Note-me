package fg;

import a0.f0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final b f16964d = new c(new j(false, false, false, true, "    ", "type", true, a.f16957v), hg.a.f18030a);

    /* renamed from: a, reason: collision with root package name */
    public final j f16965a;

    /* renamed from: b, reason: collision with root package name */
    public final eb.y f16966b;

    /* renamed from: c, reason: collision with root package name */
    public final z5.h f16967c = new z5.h(17);

    public c(j jVar, eb.y yVar) {
        this.f16965a = jVar;
        this.f16966b = yVar;
    }

    public final Object a(ag.a aVar, String str) {
        aVar.getClass();
        str.getClass();
        f0 f0Var = new f0(str);
        Object q10 = new gg.s(this, gg.w.f17809w, f0Var, aVar.d()).q(aVar);
        if (f0Var.e() == 10) {
            return q10;
        }
        f0.u(f0Var, "Expected EOF after parsing, but had " + str.charAt(f0Var.f47b - 1) + " instead", 0, 6);
        throw null;
    }

    public final String b(ag.a aVar, Object obj) {
        char[] cArr;
        Object removeLast;
        c7.f0 f0Var;
        aVar.getClass();
        c7.x xVar = new c7.x(12, (byte) 0);
        gg.c cVar = gg.c.f17761c;
        synchronized (cVar) {
            qe.j jVar = cVar.f17762a;
            cArr = null;
            if (jVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = jVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                cVar.f17763b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        xVar.f4003w = cArr;
        try {
            gg.w wVar = gg.w.f17809w;
            gg.t[] tVarArr = new gg.t[gg.w.B.a()];
            if (this.f16965a.f16985c) {
                f0Var = new gg.g(xVar, this);
            } else {
                f0Var = new c7.f0(xVar);
            }
            new gg.t(f0Var, this, wVar, tVarArr).s(aVar, obj);
            return xVar.toString();
        } finally {
            xVar.l();
        }
    }

    public final m c(String str) {
        str.getClass();
        return (m) a(p.f16992a, str);
    }
}
