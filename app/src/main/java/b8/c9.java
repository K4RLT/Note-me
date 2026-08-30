package b8;
import k7.f;
import r0.a1;

/* loaded from: classes.dex */
public final class c9 implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1932u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ pe.d f1933v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1934w;

    public /* synthetic */ c9(pe.d dVar, Object obj, int i) {
        this.f1932u = i;
        this.f1933v = dVar;
        this.f1934w = obj;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f1932u) {
            case 0:
                ((df.l) this.f1933v).invoke((ca) this.f1934w);
                return pe.z.f22715a;
            case 1:
                ((df.l) this.f1933v).invoke((f) this.f1934w);
                return pe.z.f22715a;
            case 2:
                ((df.l) this.f1933v).invoke((w7.ma) this.f1934w);
                return pe.z.f22715a;
            case 3:
                ((df.l) this.f1933v).invoke((w7.t9) this.f1934w);
                return pe.z.f22715a;
            default:
                if (System.currentTimeMillis() - ((Number) ((a1) this.f1934w).getValue()).longValue() > 250) {
                    ((df.a) this.f1933v).invoke();
                }
                return pe.z.f22715a;
        }
    }
}
