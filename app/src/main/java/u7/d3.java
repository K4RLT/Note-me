package u7;
import m3.h;
import o7.a;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class d3 extends ve.i implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26061u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List f26062v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m3 f26063w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d3(List list, m3 m3Var, te.c cVar, int i) {
        super(2, cVar);
        this.f26061u = i;
        this.f26062v = list;
        this.f26063w = m3Var;
    }

    @Override // ve.a
    public final te.c create(Object obj, te.c cVar) {
        switch (this.f26061u) {
            case 0:
                return new d3(this.f26062v, this.f26063w, cVar, 0);
            default:
                return new d3(this.f26062v, this.f26063w, cVar, 1);
        }
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        pf.z zVar = (pf.z) obj;
        te.c cVar = (te.c) obj2;
        switch (this.f26061u) {
            case 0:
                return ((d3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
            default:
                return ((d3) create(zVar, cVar)).invokeSuspend(pe.z.f22715a);
        }
    }

    @Override // ve.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f26061u) {
            case 0:
                pe.a.e(obj);
                x2 x2Var = new x2();
                Iterator it = this.f26062v.iterator();
                while (it.hasNext()) {
                    h(this.f26063w, x2Var, (a) it.next());
                }
                return x2Var;
            default:
                pe.a.e(obj);
                x2 x2Var2 = new x2();
                Iterator it2 = this.f26062v.iterator();
                while (it2.hasNext()) {
                    h(this.f26063w, x2Var2, (a) it2.next());
                }
                return x2Var2;
        }
    }
}
