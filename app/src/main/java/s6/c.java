package s6;
import g.b;

import pe.z;
import pf.b0;
import pf.o1;
import q.x;
import r0.i1;

/* loaded from: classes.dex */
public final class c extends ve.i implements df.l {
    public final /* synthetic */ float A;
    public final /* synthetic */ k B;

    /* renamed from: u, reason: collision with root package name */
    public int f24933u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g f24934v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f24935w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ float f24936x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f24937y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ o6.a f24938z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, int i, float f10, l lVar, o6.a aVar, float f11, k kVar, te.c cVar) {
        super(1, cVar);
        this.f24934v = gVar;
        this.f24935w = i;
        this.f24936x = f10;
        this.f24937y = lVar;
        this.f24938z = aVar;
        this.A = f11;
        this.B = kVar;
    }

    @Override // ve.a
    public final te.c create(te.c cVar) {
        return new c(this.f24934v, this.f24935w, this.f24936x, this.f24937y, this.f24938z, this.A, this.B, cVar);
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        return ((c) create((te.c) obj)).invokeSuspend(z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        te.g gVar;
        int i = this.f24933u;
        z zVar = z.f22715a;
        g gVar2 = this.f24934v;
        try {
            if (i != 0) {
                if (i == 1) {
                    pe.a.e(obj);
                } else {
                    x.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                pe.a.e(obj);
                gVar2.g(this.f24935w);
                i1 i1Var = gVar2.f24948u;
                gVar2.f24950w.setValue(Integer.MAX_VALUE);
                i1 i1Var2 = gVar2.f24951x;
                Boolean bool = Boolean.FALSE;
                i1Var2.setValue(bool);
                i1 i1Var3 = gVar2.f24953z;
                float f10 = this.f24936x;
                i1Var3.setValue(Float.valueOf(f10));
                gVar2.f24952y.setValue(this.f24937y);
                i1 i1Var4 = gVar2.C;
                o6.a aVar = this.f24938z;
                i1Var4.setValue(aVar);
                gVar2.h(this.A);
                gVar2.A.setValue(bool);
                gVar2.F.setValue(Long.MIN_VALUE);
                if (aVar == null) {
                    i1Var.setValue(bool);
                    return zVar;
                }
                if (Float.isInfinite(f10)) {
                    gVar2.h(gVar2.e());
                    i1Var.setValue(bool);
                    gVar2.g(Integer.MAX_VALUE);
                    return zVar;
                }
                i1Var.setValue(Boolean.TRUE);
                int ordinal = this.B.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        gVar = o1.f22776v;
                    } else {
                        throw new ab.b(false);
                    }
                } else {
                    gVar = te.h.f25707u;
                }
                p7.k kVar = new p7.k(this.B, b0.p(getContext()), this.f24935w, this.f24934v, (te.c) null);
                this.f24933u = 1;
                Object J = b0.J(gVar, kVar, this);
                ue.a aVar2 = ue.a.f27192u;
                if (J == aVar2) {
                    return aVar2;
                }
            }
            b0.k(getContext());
            b(gVar2, false);
            return zVar;
        } catch (Throwable th) {
            b(gVar2, false);
            throw th;
        }
    }
}
