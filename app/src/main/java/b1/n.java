package b1;

import java.util.ArrayList;
import w7.t9;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1377u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f1378v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f1379w;

    public /* synthetic */ n(df.l lVar, df.l lVar2, int i) {
        this.f1377u = i;
        this.f1378v = lVar;
        this.f1379w = lVar2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f1377u) {
            case 0:
                this.f1378v.invoke(obj);
                this.f1379w.invoke(obj);
                break;
            case 1:
                this.f1378v.invoke(obj);
                this.f1379w.invoke(obj);
                break;
            default:
                t9 t9Var = (t9) obj;
                t9Var.getClass();
                ArrayList h3 = t9Var.h();
                if (h3.size() == 1) {
                    this.f1378v.invoke(qe.l.w(h3));
                } else {
                    this.f1379w.invoke("tapes/" + t9Var.f29155a.f29080a);
                }
                return pe.z.f22715a;
        }
        return pe.z.f22715a;
    }
}
