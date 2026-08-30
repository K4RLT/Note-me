package w7;
import k2.b;
import r0.a1;
import v1.b;
import v1.l;
import x.o;

/* loaded from: classes.dex */
public final class r1 extends ve.h implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public int f28982u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f28983v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f28984w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f28985x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(a1 a1Var, boolean z3, te.c cVar) {
        super(2, cVar);
        this.f28984w = a1Var;
        this.f28985x = z3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        r1 r1Var = new r1(this.f28984w, this.f28985x, cVar);
        r1Var.f28983v = obj;
        return r1Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((b) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        b bVar = (b) this.f28983v;
        int i = this.f28982u;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
            } else {
                q.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            this.f28983v = null;
            this.f28982u = 1;
            Object b10 = t.b(bVar, false, l.f27331u, this);
            ue.a aVar = ue.a.f27192u;
            if (b10 == aVar) {
                return aVar;
            }
        }
        a1 a1Var = this.f28984w;
        if (((Boolean) a1Var.getValue()).booleanValue() && !this.f28985x) {
            a1Var.setValue(Boolean.FALSE);
        }
        return pe.z.f22715a;
    }
}
