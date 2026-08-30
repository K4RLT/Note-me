package g0;
import b0.i;
import c2.p0;
import r0.a1;
import t.c1;
import t.k2;
import t.t1;
import v.i;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import w7.gb;

/* loaded from: classes.dex */
public final class y1 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17362a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17363b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17364c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17365d;
    public final /* synthetic */ Object e;

    public y1(df.l lVar, df.p pVar, df.a aVar, p7.e0 e0Var) {
        this.f17363b = lVar;
        this.f17364c = pVar;
        this.f17365d = aVar;
        this.e = e0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        int i = this.f17362a;
        pe.z zVar = pe.z.f22715a;
        ue.a aVar = ue.a.f27192u;
        Object obj = this.f17365d;
        Object obj2 = this.f17364c;
        Object obj3 = this.e;
        Object obj4 = this.f17363b;
        switch (i) {
            case 0:
                x1 x1Var = new x1((pf.z) obj4, (a1) obj2, (i) obj3, null, 0);
                p0 p0Var = new p0((a1) obj, 3);
                s6.r rVar = k2.f25444a;
                Object i10 = pf.i(new b8.a1(wVar, x1Var, p0Var, new c1(wVar), (te.c) null), cVar);
                if (i10 != aVar) {
                    i10 = zVar;
                }
                if (i10 == aVar) {
                    return i10;
                }
                return zVar;
            case 1:
                Object e = t1.e(wVar, new p7.j0((df.l) obj4, (df.p) obj2, (df.a) obj, (p7.e0) obj3, null), cVar);
                if (e == aVar) {
                    return e;
                }
                return zVar;
            default:
                Object e8 = t1.e(wVar, new gb((df.p) obj4, (df.a) obj3, (a1) obj2, (a1) obj, null), cVar);
                if (e8 == aVar) {
                    return e8;
                }
                return zVar;
        }
    }

    public y1(df.p pVar, df.a aVar, a1 a1Var, a1 a1Var2) {
        this.f17363b = pVar;
        this.e = aVar;
        this.f17364c = a1Var;
        this.f17365d = a1Var2;
    }

    public y1(pf.z zVar, a1 a1Var, i iVar, a1 a1Var2) {
        this.f17363b = zVar;
        this.f17364c = a1Var;
        this.e = iVar;
        this.f17365d = a1Var2;
    }
}
