package b8;
import r0.a1;
import x7.q;
import y2.l;

/* loaded from: classes.dex */
public final /* synthetic */ class y4 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3032u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f3033v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f3034w;

    public /* synthetic */ y4(df.l lVar, a1 a1Var, int i) {
        this.f3032u = i;
        this.f3033v = lVar;
        this.f3034w = a1Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f3032u) {
            case 0:
                this.f3034w.setValue(new l(((l) obj).f30813a));
                this.f3033v.invoke(Float.valueOf((int) (r4.f30813a >> 32)));
                return pe.z.f22715a;
            case 1:
                q qVar = (q) obj;
                qVar.getClass();
                if (qVar == q.EVERYTHING) {
                    this.f3034w.setValue(Boolean.TRUE);
                } else {
                    this.f3033v.invoke(qVar);
                }
                return pe.z.f22715a;
            default:
                String str = (String) obj;
                str.getClass();
                this.f3034w.setValue(Boolean.FALSE);
                this.f3033v.invoke(str);
                return pe.z.f22715a;
        }
    }
}
