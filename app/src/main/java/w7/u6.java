package w7;
import r0.o1;
import x.o;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class u6 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29215u;

    /* renamed from: v, reason: collision with root package name */
    public o1 f29216v;

    /* renamed from: w, reason: collision with root package name */
    public int f29217w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f29218x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d5 f29219y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6(d5 d5Var, te.c cVar, int i) {
        super(2, cVar);
        this.f29215u = i;
        this.f29219y = d5Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f29215u) {
            case 0:
                u6 u6Var = new u6(this.f29219y, cVar, 0);
                u6Var.f29218x = obj;
                return u6Var;
            default:
                u6 u6Var2 = new u6(this.f29219y, cVar, 1);
                u6Var2.f29218x = obj;
                return u6Var2;
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        o1 o1Var = (o1) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f29215u) {
            case 0:
                return ((u6) create(o1Var, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((u6) create(o1Var, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        String str;
        int i = this.f29215u;
        pe.z zVar = pe.z.f22715a;
        d5 d5Var = this.f29219y;
        ue.a aVar = ue.a.f27192u;
        Bitmap bitmap = null;
        switch (i) {
            case 0:
                o1 o1Var = (o1) this.f29218x;
                int i10 = this.f29217w;
                if (i10 != 0) {
                    if (i10 == 1) {
                        o1Var = this.f29216v;
                        pe.a.e(obj);
                    } else {
                        q.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    String str2 = d5Var.f28081b;
                    if (str2 != null) {
                        wf.e eVar = pf.l0.f22767a;
                        wf.d dVar = wf.d.f29913w;
                        u7.h6 h6Var = new u7.h6(4, str2, null);
                        this.f29218x = null;
                        this.f29216v = o1Var;
                        this.f29217w = 1;
                        obj = pf.b0.J(dVar, h6Var, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    o1Var.setValue(bitmap);
                    return zVar;
                }
                bitmap = (Bitmap) obj;
                o1Var.setValue(bitmap);
                return zVar;
            default:
                o1 o1Var2 = (o1) this.f29218x;
                int i11 = this.f29217w;
                if (i11 != 0) {
                    if (i11 == 1) {
                        o1Var2 = this.f29216v;
                        pe.a.e(obj);
                    } else {
                        q.o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    pe.a.e(obj);
                    if (d5Var != null) {
                        str = d5Var.f28081b;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        wf.e eVar2 = pf.l0.f22767a;
                        wf.d dVar2 = wf.d.f29913w;
                        u7.h6 h6Var2 = new u7.h6(5, str, null);
                        this.f29218x = null;
                        this.f29216v = o1Var2;
                        this.f29217w = 1;
                        obj = pf.b0.J(dVar2, h6Var2, this);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    o1Var2.setValue(bitmap);
                    return zVar;
                }
                bitmap = (Bitmap) obj;
                o1Var2.setValue(bitmap);
                return zVar;
        }
    }
}
