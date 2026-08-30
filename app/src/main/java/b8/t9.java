package b8;
import r0.a1;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final class t9 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2800u;

    /* renamed from: v, reason: collision with root package name */
    public a1 f2801v;

    /* renamed from: w, reason: collision with root package name */
    public int f2802w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f2803x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f2804y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f2805z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t9(Context context, a1 a1Var, a1 a1Var2, te.c cVar, int i) {
        super(2, cVar);
        this.f2800u = i;
        this.f2803x = context;
        this.f2804y = a1Var;
        this.f2805z = a1Var2;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f2800u) {
            case 0:
                return new t9(this.f2803x, this.f2804y, this.f2805z, cVar, 0);
            default:
                return new t9(this.f2803x, this.f2804y, this.f2805z, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f2800u) {
            case 0:
                return ((t9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((t9) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        int i = this.f2800u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f2805z;
        Context context = this.f2803x;
        a1 a1Var2 = this.f2804y;
        ue.a aVar = ue.a.f27192u;
        switch (i) {
            case 0:
                int i10 = this.f2802w;
                if (i10 != 0) {
                    if (i10 == 1) {
                        a1Var2 = this.f2801v;
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    wf.e eVar = pf.l0.f22767a;
                    wf.d dVar = wf.d.f29913w;
                    n9 n9Var = new n9(1, context, null);
                    this.f2801v = a1Var2;
                    this.f2802w = 1;
                    obj = pf.b0.J(dVar, n9Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                q.t tVar = z9.f3099a;
                a1Var2.setValue((List) obj);
                a1Var.setValue(la.PICK_NOTEBOOK);
                return zVar;
            default:
                int i11 = this.f2802w;
                if (i11 != 0) {
                    if (i11 == 1) {
                        a1Var2 = this.f2801v;
                        pe.a.e(obj);
                    } else {
                        q.x.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    wf.e eVar2 = pf.l0.f22767a;
                    wf.d dVar2 = wf.d.f29913w;
                    n9 n9Var2 = new n9(2, context, null);
                    this.f2801v = a1Var2;
                    this.f2802w = 1;
                    obj = pf.b0.J(dVar2, n9Var2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                q.t tVar2 = z9.f3099a;
                a1Var2.setValue((List) obj);
                a1Var.setValue(la.PICK_NOTEBOOK);
                return zVar;
        }
    }
}
