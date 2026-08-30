package u2;

import df.l;
import k1.l0;
import k1.n;
import k1.n0;
import pe.z;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25829u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f25830v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f25831w;

    public /* synthetic */ d(Object obj, long j10, int i) {
        this.f25829u = i;
        this.f25831w = obj;
        this.f25830v = j10;
    }

    @Override // df.a
    public final Object invoke() {
        switch (this.f25829u) {
            case 0:
                return ((n0) ((n) this.f25831w)).b(this.f25830v);
            default:
                ((l) this.f25831w).invoke(Integer.valueOf(l0.F(this.f25830v)));
                return z.f22715a;
        }
    }
}
