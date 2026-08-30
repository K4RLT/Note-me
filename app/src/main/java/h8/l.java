package h8;

import pe.z;
import r0.a1;
import u7.k6;
import wa.t7;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17958u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a1 f17959v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f17960w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f17961x;

    public /* synthetic */ l(int i, a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f17958u = i;
        this.f17959v = a1Var;
        this.f17960w = a1Var2;
        this.f17961x = a1Var3;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f17958u;
        z zVar = z.f22715a;
        a1 a1Var = this.f17961x;
        a1 a1Var2 = this.f17960w;
        a1 a1Var3 = this.f17959v;
        switch (i) {
            case 0:
                a1Var3.getClass();
                a1Var2.getClass();
                a1Var.getClass();
                a1Var3.setValue(new y2.l(((y2.l) obj).f30813a));
                long j10 = ((y2.l) a1Var3.getValue()).f30813a;
                a1Var2.setValue(Float.valueOf(Math.min((int) (j10 >> 32), (int) (j10 & 4294967295L)) * 0.5f));
                a1Var.setValue(new j1.b(t7.a(((y2.l) a1Var3.getValue()).f30813a)));
                return zVar;
            default:
                float f10 = k6.f26414a;
                Boolean bool = Boolean.FALSE;
                a1Var3.setValue(bool);
                a1Var2.setValue(bool);
                a1Var.setValue(bool);
                return zVar;
        }
    }
}
