package w7;
import k1.f;
import r0.a1;
import x.o;

import android.content.Context;

/* loaded from: classes.dex */
public final class l8 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28647u;

    /* renamed from: v, reason: collision with root package name */
    public a1 f28648v;

    /* renamed from: w, reason: collision with root package name */
    public int f28649w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f28650x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ma f28651y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f28652z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l8(Context context, ma maVar, a1 a1Var, te.c cVar, int i) {
        super(2, cVar);
        this.f28647u = i;
        this.f28650x = context;
        this.f28651y = maVar;
        this.f28652z = a1Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f28647u) {
            case 0:
                return new l8(this.f28650x, this.f28651y, this.f28652z, cVar, 0);
            case 1:
                return new l8(this.f28650x, this.f28651y, this.f28652z, cVar, 1);
            default:
                return new l8(this.f28650x, this.f28651y, this.f28652z, cVar, 2);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f28647u) {
            case 0:
                return ((l8) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            case 1:
                return ((l8) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((l8) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f28647u;
        pe.z zVar = pe.z.f22715a;
        ma maVar = this.f28651y;
        Context context = this.f28650x;
        a1 a1Var = this.f28652z;
        ue.a aVar = ue.a.f27192u;
        switch (i) {
            case 0:
                int i10 = this.f28649w;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a1Var = this.f28648v;
                        pe.a.e(obj);
                    } else {
                        q.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    p9 p9Var = p9.f28915a;
                    this.f28648v = a1Var;
                    this.f28649w = 1;
                    obj = p9.m(context, maVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                a1Var.setValue((f) obj);
                return zVar;
            case 1:
                int i11 = this.f28649w;
                if (i11 != 0) {
                    if (i11 == 1) {
                        a1Var = this.f28648v;
                        pe.a.e(obj);
                    } else {
                        q.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    p9 p9Var2 = p9.f28915a;
                    this.f28648v = a1Var;
                    this.f28649w = 1;
                    obj = p9.m(context, maVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                a1Var.setValue((f) obj);
                return zVar;
            default:
                int i12 = this.f28649w;
                if (i12 != 0) {
                    if (i12 == 1) {
                        a1Var = this.f28648v;
                        pe.a.e(obj);
                    } else {
                        q.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    p9 p9Var3 = p9.f28915a;
                    this.f28648v = a1Var;
                    this.f28649w = 1;
                    obj = p9.l(context, maVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                a1Var.setValue((l9) obj);
                return zVar;
        }
    }
}
