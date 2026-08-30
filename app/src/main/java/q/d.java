package q;
import l.a;
import r0.i1;
import r0.y;

import wa.b9;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final l1 f22863a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22864b;

    /* renamed from: c, reason: collision with root package name */
    public final l f22865c;

    /* renamed from: d, reason: collision with root package name */
    public final i1 f22866d;
    public final i1 e;

    /* renamed from: f, reason: collision with root package name */
    public final m0 f22867f;

    /* renamed from: g, reason: collision with root package name */
    public final q f22868g;

    /* renamed from: h, reason: collision with root package name */
    public final q f22869h;
    public final q i;

    /* renamed from: j, reason: collision with root package name */
    public final q f22870j;

    public d(Object obj, l1 l1Var, Object obj2) {
        q qVar;
        q qVar2;
        this.f22863a = l1Var;
        this.f22864b = obj2;
        l lVar = new l(l1Var, obj, null, 60);
        this.f22865c = lVar;
        this.f22866d = y.B(Boolean.FALSE);
        this.e = y.B(obj);
        this.f22867f = new m0();
        new r0(obj2);
        q qVar3 = lVar.f22938w;
        boolean z3 = qVar3 instanceof m;
        if (z3) {
            qVar = e.e;
        } else if (qVar3 instanceof n) {
            qVar = e.f22878f;
        } else if (qVar3 instanceof o) {
            qVar = e.f22879g;
        } else {
            qVar = e.f22880h;
        }
        this.f22868g = qVar;
        if (z3) {
            qVar2 = e.f22874a;
        } else if (qVar3 instanceof n) {
            qVar2 = e.f22875b;
        } else if (qVar3 instanceof o) {
            qVar2 = e.f22876c;
        } else {
            qVar2 = e.f22877d;
        }
        this.f22869h = qVar2;
        this.i = qVar;
        this.f22870j = qVar2;
    }

    public static final Object a(d dVar, Object obj) {
        l1 l1Var = dVar.f22863a;
        q qVar = dVar.f22870j;
        q qVar2 = dVar.i;
        if (!kotlin.jvm.internal.a(qVar2, dVar.f22868g) || !kotlin.jvm.internal.a(qVar, dVar.f22869h)) {
            q qVar3 = (q) l1Var.f22943a.invoke(obj);
            int b10 = qVar3.b();
            boolean z3 = false;
            for (int i = 0; i < b10; i++) {
                if (qVar3.a(i) < qVar2.a(i) || qVar3.a(i) > qVar.a(i)) {
                    qVar3.e(i, b9.d(qVar3.a(i), qVar2.a(i), qVar.a(i)));
                    z3 = true;
                }
            }
            if (z3) {
                return l1Var.f22944b.invoke(qVar3);
            }
        }
        return obj;
    }

    public static final void b(d dVar) {
        l lVar = dVar.f22865c;
        lVar.f22938w.d();
        lVar.f22939x = Long.MIN_VALUE;
        dVar.f22866d.setValue(Boolean.FALSE);
    }

    public static Object c(d dVar, Object obj, k kVar, te.c cVar) {
        Object invoke = dVar.f22863a.f22944b.invoke(dVar.f22865c.f22938w);
        Object e = dVar.e();
        l1 l1Var = dVar.f22863a;
        return m0.a(dVar.f22867f, new a(dVar, invoke, new a1(kVar, l1Var, e, obj, (q) l1Var.f22943a.invoke(invoke)), dVar.f22865c.f22939x, null), cVar);
    }

    public final Object d() {
        return this.e.getValue();
    }

    public final Object e() {
        return this.f22865c.f22937v.getValue();
    }

    public final boolean f() {
        return ((Boolean) this.f22866d.getValue()).booleanValue();
    }

    public final Object g(Object obj, te.c cVar) {
        Object a10 = m0.a(this.f22867f, new b(this, obj, null), cVar);
        if (a10 == ue.a.f27192u) {
            return a10;
        }
        return pe.z.f22715a;
    }

    public final Object h(ve.i iVar) {
        Object a10 = m0.a(this.f22867f, new c(this, null), iVar);
        if (a10 == ue.a.f27192u) {
            return a10;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ d(Object obj, l1 l1Var, Object obj2, int i) {
        this(obj, l1Var, (i & 4) != 0 ? null : obj2);
    }
}
