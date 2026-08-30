package b8;
import d1.r;
import e1.k;
import m7.e;
import r0.m;
import r0.y;

/* loaded from: classes.dex */
public final /* synthetic */ class t7 implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2790u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f2791v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2792w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2793x;

    public /* synthetic */ t7(String str, float f10, df.l lVar, int i) {
        this.f2790u = 2;
        this.f2792w = str;
        this.f2791v = f10;
        this.f2793x = lVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2790u) {
            case 0:
                ((Integer) obj2).getClass();
                int L = y.L(49);
                k(this.f2791v, (df.a) this.f2792w, (r) this.f2793x, (m) obj, L);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int L2 = y.L(49);
                k(this.f2791v, (df.a) this.f2792w, (r) this.f2793x, (m) obj, L2);
                break;
            default:
                ((Integer) obj2).getClass();
                int L3 = y.L(1);
                w7.e((String) this.f2792w, this.f2791v, (df.l) this.f2793x, (m) obj, L3);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ t7(float f10, df.a aVar, r rVar, int i, int i10) {
        this.f2790u = i10;
        this.f2791v = f10;
        this.f2792w = aVar;
        this.f2793x = rVar;
    }
}
