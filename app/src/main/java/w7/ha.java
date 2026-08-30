package w7;
import lb.g;
import r0.a1;

/* loaded from: classes.dex */
public final class ha implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28373u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28374v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28375w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f28376x;

    public /* synthetic */ ha(int i, Object obj, Object obj2, Object obj3) {
        this.f28373u = i;
        this.f28374v = obj;
        this.f28375w = obj2;
        this.f28376x = obj3;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f28373u) {
            case 0:
                ((df.p) this.f28374v).invoke((t9) this.f28375w, (String) this.f28376x);
                return pe.z.f22715a;
            case 1:
                ((df.p) this.f28374v).invoke((t9) this.f28375w, (String) this.f28376x);
                return pe.z.f22715a;
            default:
                ((a1) this.f28374v).setValue(Long.valueOf(System.currentTimeMillis()));
                ((a1) this.f28375w).setValue(null);
                g(0.0f, (a1) this.f28376x);
                return pe.z.f22715a;
        }
    }
}
