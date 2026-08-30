package b8;
import d1.r;
import j1.b;
import r0.a1;
import r0.e1;
import r0.m;
import r0.y;
import v1.t;
import v5.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2782u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f2783v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f2784w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2785x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f2786y;

    public /* synthetic */ t5(String str, float f10, e1 e1Var, a1 a1Var) {
        this.f2783v = str;
        this.f2784w = f10;
        this.f2785x = e1Var;
        this.f2786y = a1Var;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2782u;
        pe.z zVar = pe.z.f22715a;
        Object obj3 = this.f2786y;
        Object obj4 = this.f2785x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                a(this.f2783v, (w7.l9) obj4, this.f2784w, (r) obj3, (m) obj, y.L(3073));
                return zVar;
            default:
                e1 e1Var = (e1) obj4;
                a1 a1Var = (a1) obj3;
                t tVar = (t) obj;
                tVar.getClass();
                tVar.a();
                float f10 = w7.m7.f28734c;
                e1Var.i(Float.intBitsToFloat((int) (((b) obj2).f18762a & 4294967295L)) + e1Var.h());
                List list = (List) a1Var.getValue();
                String str = this.f2783v;
                int indexOf = list.indexOf(str);
                if (indexOf >= 0) {
                    float h3 = e1Var.h();
                    float f11 = this.f2784w;
                    int e = wa.b9.e(ff.a.b(h3 / f11) + indexOf, 0, ((List) a1Var.getValue()).size() - 1);
                    if (e != indexOf) {
                        ArrayList R = qe.l.R((List) a1Var.getValue());
                        R.remove(indexOf);
                        R.add(e, str);
                        a1Var.setValue(R);
                        e1Var.i(e1Var.h() - ((e - indexOf) * f11));
                    }
                }
                return zVar;
        }
    }

    public /* synthetic */ t5(String str, w7.l9 l9Var, float f10, r rVar, int i) {
        this.f2783v = str;
        this.f2785x = l9Var;
        this.f2784w = f10;
        this.f2786y = rVar;
    }
}
