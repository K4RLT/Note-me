package u7;
import r0.j0;

import ya.he;

/* loaded from: classes.dex */
public final /* synthetic */ class q3 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26749u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o1 f26750v;

    public /* synthetic */ q3(o1 o1Var, int i) {
        this.f26749u = i;
        this.f26750v = o1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f26749u) {
            case 0:
                o1 o1Var = this.f26750v;
                String str = (String) obj;
                str.getClass();
                o1Var.i = str;
                return pe.z.f22715a;
            default:
                o1 o1Var2 = this.f26750v;
                ((j0) obj).getClass();
                he.f31325a = new t3(o1Var2, 1);
                return new t0(2);
        }
    }
}
