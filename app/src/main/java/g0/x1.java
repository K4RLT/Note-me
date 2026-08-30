package g0;
import b0.x;
import j1.b;
import q.x;
import r0.a1;
import r0.e1;
import t.c1;
import v.i;
import v1.h0;
import v1.w;

import wa.b9;

/* loaded from: classes.dex */
public final class x1 extends ve.i implements df.q {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17352u;

    /* renamed from: v, reason: collision with root package name */
    public int f17353v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ c1 f17354w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ long f17355x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f17356y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f17357z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1(Object obj, a1 a1Var, Object obj2, te.c cVar, int i) {
        super(3, cVar);
        this.f17352u = i;
        this.f17357z = obj;
        this.f17356y = a1Var;
        this.A = obj2;
    }

    @Override // df.q
    public final Object b(Object obj, Object obj2, Object obj3) {
        c1 c1Var = (c1) obj;
        b bVar = (b) obj2;
        switch (this.f17352u) {
            case 0:
                long j10 = bVar.f18762a;
                pf.z zVar = (pf.z) this.f17357z;
                i iVar = (i) this.A;
                x1 x1Var = new x1(zVar, this.f17356y, iVar, (te.c) obj3, 0);
                x1Var.f17354w = c1Var;
                x1Var.f17355x = j10;
                return x1Var.invokeSuspend(pe.z.f22715a);
            default:
                long j11 = bVar.f18762a;
                w wVar = (w) this.f17357z;
                e1 e1Var = (e1) this.A;
                x1 x1Var2 = new x1(wVar, this.f17356y, e1Var, (te.c) obj3, 1);
                x1Var2.f17354w = c1Var;
                x1Var2.f17355x = j11;
                return x1Var2.invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f17352u) {
            case 0:
                pf.z zVar = (pf.z) this.f17357z;
                int i = this.f17353v;
                if (i != 0) {
                    if (i == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    c1 c1Var = this.f17354w;
                    pf.x(zVar, null, new e7.n(this.f17356y, this.f17355x, (i) this.A, null, 1), 3);
                    this.f17353v = 1;
                    obj = c1Var.f(this);
                    ue.a aVar = ue.a.f27192u;
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                pf.x(zVar, null, new w1(this.f17356y, ((Boolean) obj).booleanValue(), (i) this.A, null), 3);
                return pe.z.f22715a;
            default:
                c1 c1Var2 = this.f17354w;
                long j10 = this.f17355x;
                int i10 = this.f17353v;
                a1 a1Var = this.f17356y;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                    } else {
                        x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    a1Var.setValue(Boolean.TRUE);
                    ((e1) this.A).i((0.11f * b9.d(Float.intBitsToFloat((int) (j10 >> 32)) / ((int) (((h0) ((w) this.f17357z)).S >> 32)), 0.0f, 1.0f)) + 0.02f);
                    this.f17354w = null;
                    this.f17355x = j10;
                    this.f17353v = 1;
                    Object f10 = c1Var2.f(this);
                    ue.a aVar2 = ue.a.f27192u;
                    if (f10 == aVar2) {
                        return aVar2;
                    }
                }
                a1Var.setValue(Boolean.FALSE);
                return pe.z.f22715a;
        }
    }
}
