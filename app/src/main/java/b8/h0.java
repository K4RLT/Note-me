package b8;
import f7.c;
import r0.a1;

/* loaded from: classes.dex */
public final class h0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2145u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f2146v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f2145u = i;
        this.f2146v = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2145u) {
            case 0:
                return new h0(this.f2146v, cVar, 0);
            case 1:
                return new h0(this.f2146v, cVar, 1);
            case 2:
                return new h0(this.f2146v, cVar, 2);
            default:
                return new h0(this.f2146v, cVar, 3);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2145u) {
            case 0:
                h0 h0Var = (h0) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                h0Var.invokeSuspend(zVar2);
                return zVar2;
            case 1:
                h0 h0Var2 = (h0) create(zVar, cVar);
                pe.z zVar3 = pe.z.f22715a;
                h0Var2.invokeSuspend(zVar3);
                return zVar3;
            case 2:
                h0 h0Var3 = (h0) create(zVar, cVar);
                pe.z zVar4 = pe.z.f22715a;
                h0Var3.invokeSuspend(zVar4);
                return zVar4;
            default:
                h0 h0Var4 = (h0) create(zVar, cVar);
                pe.z zVar5 = pe.z.f22715a;
                h0Var4.invokeSuspend(zVar5);
                return zVar5;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2145u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f2146v;
        switch (i) {
            case 0:
                pe.a.e(obj);
                a1Var.setValue(Boolean.TRUE);
                return zVar;
            case 1:
                pe.a.e(obj);
                w7.n4.s0(a1Var, false);
                return zVar;
            case 2:
                pe.a.e(obj);
                String str = (String) a1Var.getValue();
                if (str != null) {
                    c.k(str);
                }
                return zVar;
            default:
                pe.a.e(obj);
                float f10 = w7.h8.f28370a;
                a1Var.setValue(Boolean.FALSE);
                return zVar;
        }
    }
}
