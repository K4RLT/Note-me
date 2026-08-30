package w7;
import r0.a1;
import x.o;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class t4 extends ve.i implements df.p {
    public final /* synthetic */ Context A;
    public final /* synthetic */ int B;

    /* renamed from: u, reason: collision with root package name */
    public a1 f29126u;

    /* renamed from: v, reason: collision with root package name */
    public int f29127v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f29128w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f29129x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29130y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f29131z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(a1 a1Var, boolean z3, u7.m3 m3Var, int i, Context context, int i10, te.c cVar) {
        super(2, cVar);
        this.f29128w = a1Var;
        this.f29129x = z3;
        this.f29130y = m3Var;
        this.f29131z = i;
        this.A = context;
        this.B = i10;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new t4(this.f29128w, this.f29129x, this.f29130y, this.f29131z, this.A, this.B, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t4) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        a1 a1Var;
        int i = this.f29127v;
        if (i != 0) {
            if (i == 1) {
                a1Var = this.f29126u;
                pe.a.e(obj);
            } else {
                q.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            wf.e eVar = pf.l0.f22767a;
            wf.d dVar = wf.d.f29913w;
            s4 s4Var = new s4(this.f29129x, this.f29130y, this.f29131z, this.A, this.B, null);
            a1Var = this.f29128w;
            this.f29126u = a1Var;
            this.f29127v = 1;
            obj = pf.b0.J(dVar, s4Var, this);
            ue.a aVar = ue.a.f27192u;
            if (obj == aVar) {
                return aVar;
            }
        }
        a1Var.setValue((Bitmap) obj);
        return pe.z.f22715a;
    }
}
