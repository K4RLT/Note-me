package w7;
import p7.x0;
import p7.y0;
import x.o;

import android.content.Context;

/* loaded from: classes.dex */
public final class p1 extends ve.i implements df.p {
    public final /* synthetic */ float A;
    public final /* synthetic */ float B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28875u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f28876v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28877w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28878x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f28879y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f28880z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(int i, int i10, u7.m3 m3Var, int i11, kotlin.jvm.internal.y yVar, float f10, float f11, te.c cVar) {
        super(2, cVar);
        this.f28876v = i;
        this.f28877w = i10;
        this.f28878x = m3Var;
        this.f28879y = i11;
        this.f28880z = yVar;
        this.A = f10;
        this.B = f11;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f28875u) {
            case 0:
                return new p1(this.A, this.B, this.f28877w, this.f28879y, this.f28880z, cVar, this.f28878x);
            default:
                return new p1(this.f28876v, this.f28877w, this.f28878x, this.f28879y, this.f28880z, this.A, this.B, cVar);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f28875u) {
            case 0:
                return ((p1) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                p1 p1Var = (p1) create(zVar, cVar);
                pe.z zVar2 = pe.z.f22715a;
                p1Var.invokeSuspend(zVar2);
                return zVar2;
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f28875u;
        pe.z zVar = pe.z.f22715a;
        switch (i) {
            case 0:
                int i10 = this.f28876v;
                if (i10 != 0) {
                    if (i10 == 1) {
                        pe.a.e(obj);
                        return zVar;
                    }
                    q.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                pe.a.e(obj);
                float f10 = this.A;
                if (f10 > 0.0f) {
                    float f11 = this.B;
                    if (f11 > 0.0f) {
                        wf.e eVar = pf.l0.f22767a;
                        l1 l1Var = new l1(f10, f11, this.f28877w, this.f28879y, this.f28880z, null, this.f28878x);
                        this.f28876v = 1;
                        Object J = pf.b0.J(eVar, l1Var, this);
                        ue.a aVar = ue.a.f27192u;
                        if (J == aVar) {
                            return aVar;
                        }
                        return zVar;
                    }
                    return zVar;
                }
                return zVar;
            default:
                pe.a.e(obj);
                int i11 = this.f28876v;
                int[] iArr = {i11 + 1, i11 - 1};
                for (int i12 = 0; i12 < 2; i12++) {
                    int i13 = iArr[i12];
                    if (i13 >= 0 && i13 < this.f28877w) {
                        for (int i14 = 0; i14 < 2; i14++) {
                            x0 x0Var = y0.f22611a;
                            y0.g(this.f28878x.s1(this.f28879y, i13, i14, (Context) this.f28880z.f19787u), this.A, this.B);
                        }
                    }
                }
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(float f10, float f11, int i, int i10, kotlin.jvm.internal.y yVar, te.c cVar, u7.m3 m3Var) {
        super(2, cVar);
        this.A = f10;
        this.B = f11;
        this.f28878x = m3Var;
        this.f28877w = i;
        this.f28879y = i10;
        this.f28880z = yVar;
    }
}
