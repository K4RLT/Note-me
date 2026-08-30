package a1;

import pe.z;
import r0.y;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f199u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z0.c f200v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f201w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f202x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f203y;

    public /* synthetic */ h(l lVar, Object obj, z0.c cVar, int i) {
        this.f203y = lVar;
        this.f201w = obj;
        this.f200v = cVar;
        this.f202x = i;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f199u) {
            case 0:
                ((Integer) obj2).getClass();
                int L = y.L(this.f202x | 1);
                ((l) this.f203y).a(this.f201w, this.f200v, (r0.m) obj, L);
                break;
            default:
                ((Integer) obj2).getClass();
                int L2 = y.L(this.f202x) | 1;
                this.f200v.i(this.f201w, this.f203y, (r0.m) obj, L2);
                break;
        }
        return z.f22715a;
    }

    public /* synthetic */ h(z0.c cVar, Object obj, Object obj2, int i) {
        this.f200v = cVar;
        this.f201w = obj;
        this.f203y = obj2;
        this.f202x = i;
    }
}
