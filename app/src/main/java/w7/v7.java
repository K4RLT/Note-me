package w7;
import p.a;
import r0.a1;
import x.o;

import android.content.Context;

/* loaded from: classes.dex */
public final class v7 extends ve.i implements df.p {
    public final /* synthetic */ ma A;
    public final /* synthetic */ Context B;
    public final /* synthetic */ e3 C;
    public final /* synthetic */ a1 D;
    public final /* synthetic */ a1 E;
    public final /* synthetic */ a1 F;

    /* renamed from: u, reason: collision with root package name */
    public int f29296u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29297v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f29298w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f29299x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f29300y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.v f29301z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(u7.m3 m3Var, int i, int i10, kotlin.jvm.internal.v vVar, kotlin.jvm.internal.v vVar2, ma maVar, Context context, e3 e3Var, a1 a1Var, a1 a1Var2, a1 a1Var3, te.c cVar) {
        super(2, cVar);
        this.f29297v = m3Var;
        this.f29298w = i;
        this.f29299x = i10;
        this.f29300y = vVar;
        this.f29301z = vVar2;
        this.A = maVar;
        this.B = context;
        this.C = e3Var;
        this.D = a1Var;
        this.E = a1Var2;
        this.F = a1Var3;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        return new v7(this.f29297v, this.f29298w, this.f29299x, this.f29300y, this.f29301z, this.A, this.B, this.C, this.D, this.E, this.F, cVar);
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        return ((v7) create((pf.z) obj, (te.c) obj2)).invokeSuspend(pe.z.f22715a);
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        Object J;
        int i = this.f29296u;
        ma maVar = this.A;
        if (i != 0) {
            if (i == 1) {
                pe.a.e(obj);
                J = obj;
            } else {
                q.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            pe.a.e(obj);
            wf.e eVar = pf.l0.f22767a;
            wf.d dVar = wf.d.f29913w;
            androidx.lifecycle.q qVar = new androidx.lifecycle.q(this.B, maVar, null, 26);
            this.f29296u = 1;
            J = pf.b0.J(dVar, qVar, this);
            ue.a aVar = ue.a.f27192u;
            if (J == aVar) {
                return aVar;
            }
        }
        String str = (String) J;
        pe.z zVar = pe.z.f22715a;
        if (str == null) {
            return zVar;
        }
        String i10 = a.i();
        u7.b bVar = new u7.b(i10, str, this.f29300y.f19784u, this.f29301z.f19784u, 0.7f, 0.0f, null, false, null, null, 0.0f, null, 4194240);
        p9 p9Var = p9.f28915a;
        u7.m3.n(this.f29297v, this.f29298w, this.f29299x, bVar, "sticker", p9.o(maVar), 32);
        float f10 = w7.f29379a;
        this.C.w(true);
        this.D.setValue(null);
        this.E.setValue(null);
        this.F.setValue(i10);
        return zVar;
    }
}
