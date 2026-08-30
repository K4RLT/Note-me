package b1;
import p.e;

/* loaded from: classes.dex */
public final class b implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1305u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f1306v;

    public /* synthetic */ b(int i, df.l lVar) {
        this.f1305u = i;
        this.f1306v = lVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        long j10;
        switch (this.f1305u) {
            case 0:
                m mVar = (m) obj;
                synchronized (p.f1387c) {
                    j10 = e;
                    e = 1 + j10;
                }
                return new g(j10, mVar, this.f1306v);
            default:
                this.f1306v.invoke(Integer.valueOf(k1.l0.F(((k1.r) obj).f19523a)));
                return pe.z.f22715a;
        }
    }
}
