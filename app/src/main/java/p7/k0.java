package p7;
import o0.h;

import android.content.Context;
import r0.a1;
import u7.m3;

/* loaded from: classes.dex */
public final class k0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22519u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f22520v;

    /* renamed from: w, reason: collision with root package name */
    public int f22521w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f22522x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f22523y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(boolean z3, m3 m3Var, int i, kotlin.jvm.internal.y yVar, te.c cVar) {
        super(2, cVar);
        this.f22520v = z3;
        this.f22522x = m3Var;
        this.f22521w = i;
        this.f22523y = yVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f22519u) {
            case 0:
                return new k0(this.f22520v, (e0) this.f22522x, (a1) this.f22523y, cVar);
            default:
                return new k0(this.f22520v, (m3) this.f22522x, this.f22521w, (kotlin.jvm.internal.y) this.f22523y, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f22519u) {
            case 0:
                return ((k0) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                k0 k0Var = (k0) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                k0Var.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f22519u;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = this.f22523y;
        Object obj3 = this.f22522x;
        boolean z3 = this.f22520v;
        switch (i) {
            case 0:
                a1 a1Var = (a1) obj2;
                int i10 = this.f22521w;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    if (z3) {
                        a1Var.setValue(Boolean.TRUE);
                        return zVar;
                    }
                    ((e0) obj3).b();
                    this.f22521w = 1;
                    Object j10 = pf.b0.j(150L, this);
                    ue.a aVar = ue.a.f27192u;
                    if (j10 == aVar) {
                        return aVar;
                    }
                }
                a1Var.setValue(Boolean.FALSE);
                return zVar;
            default:
                pe.a.e(obj);
                if (z3) {
                    m3 m3Var = (m3) obj3;
                    int i11 = this.f22521w;
                    Context context = (Context) ((kotlin.jvm.internal.y) obj2).f19787u;
                    context.getClass();
                    String N = m3Var.N(context, i11);
                    if (N != null) {
                        y4.a h3 = androidx.lifecycle.h(m3Var);
                        wf.e eVar = pf.l0.f22767a;
                        pf.b0.x(h3, wf.d.f29913w, new k(i11, context, N, (te.c) null, m3Var), 2);
                    }
                }
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(boolean z3, e0 e0Var, a1 a1Var, te.c cVar) {
        super(2, cVar);
        this.f22520v = z3;
        this.f22522x = e0Var;
        this.f22523y = a1Var;
    }
}
