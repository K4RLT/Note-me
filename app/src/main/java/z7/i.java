package z7;
import c.o;

import pf.b0;
import pf.z;
import q.x;
import r0.a1;

/* loaded from: classes.dex */
public final class i extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f31956u;

    /* renamed from: v, reason: collision with root package name */
    public int f31957v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f31958w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f31959x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(boolean z3, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f31956u = i;
        this.f31958w = z3;
        this.f31959x = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f31956u) {
            case 0:
                return new i(this.f31958w, this.f31959x, cVar, 0);
            default:
                return new i(this.f31958w, this.f31959x, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f31956u) {
            case 0:
                return ((i) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((i) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f31956u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f31959x;
        boolean z3 = this.f31958w;
        ue.a aVar = ue.a.f27192u;
        switch (i) {
            case 0:
                int i10 = this.f31957v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    if (!z3) {
                        this.f31957v = 1;
                        if (b0.j(300L, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        return zVar;
                    }
                }
                m mVar = m.MAIN;
                int i11 = l.f31962a;
                a1Var.setValue(mVar);
                return zVar;
            default:
                int i12 = this.f31957v;
                if (i12 != 0) {
                    if (i12 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    if (z3) {
                        f7.o("settings");
                        return zVar;
                    }
                    this.f31957v = 1;
                    if (b0.j(340L, this) == aVar) {
                        return aVar;
                    }
                }
                a1Var.setValue(null);
                return zVar;
        }
    }
}
