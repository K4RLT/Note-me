package c0;
import a0.g;
import q.e;
import q.k;
import q.x;

import t.f1;

/* loaded from: classes.dex */
public final class e0 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public int f3301u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f3302v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f3303w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f3304x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f3305y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k f3306z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var, int i, float f10, k kVar, te.c cVar) {
        super(2, cVar);
        this.f3303w = i0Var;
        this.f3304x = i;
        this.f3305y = f10;
        this.f3306z = kVar;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        e0 e0Var = new e0(this.f3303w, this.f3304x, this.f3305y, this.f3306z, cVar);
        e0Var.f3302v = obj;
        return e0Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((f1) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i;
        int i10 = this.f3301u;
        pe.z zVar = pe.z.f22715a;
        if (i10 != 0) {
            if (i10 == 1) {
                pe.a.e(obj);
                return zVar;
            }
            x.o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pe.a.e(obj);
        f1 f1Var = (f1) this.f3302v;
        i0 i0Var = this.f3303w;
        boolean z3 = false;
        a0 a0Var = new a0(f1Var, i0Var, 0);
        d0 d0Var = new d0(0, i0Var);
        this.f3301u = 1;
        float f10 = m0.f3374a;
        int i11 = this.f3304x;
        d0Var.invoke(a0Var, new Integer(i11));
        if (i11 > i0Var.e) {
            z3 = true;
        }
        int e = (a0Var.e() - i0Var.e) + 1;
        if (((z3 && i11 > a0Var.e()) || (!z3 && i11 < i0Var.e)) && Math.abs(i11 - i0Var.e) >= 3) {
            int i12 = i0Var.e;
            if (!z3 ? (i = e + i11) <= i12 : (i = i11 - e) >= i12) {
                i12 = i;
            }
            a0Var.f(i12);
        }
        Object d2 = e.d(0.0f, a0Var.b(i11) + this.f3305y, this.f3306z, new g(new Object(), 5, a0Var), this, 4);
        ue.a aVar = ue.a.f27192u;
        if (d2 != aVar) {
            d2 = zVar;
        }
        if (d2 == aVar) {
            return aVar;
        }
        return zVar;
    }
}
