package h8;

import d1.r;
import pe.z;
import r0.y;
import wa.u7;
import ya.yb;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17962u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f17963v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f17964w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f17965x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ pe.d f17966y;

    public /* synthetic */ m(String str, boolean z3, df.a aVar, z0.c cVar, int i) {
        this.f17962u = 3;
        this.f17964w = str;
        this.f17963v = z3;
        this.f17965x = aVar;
        this.f17966y = cVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f17962u) {
            case 0:
                r rVar = (r) this.f17964w;
                f fVar = (f) this.f17965x;
                ((Integer) obj2).getClass();
                rVar.getClass();
                fVar.getClass();
                int L = y.L(7);
                u7.a(rVar, fVar, this.f17963v, (df.l) this.f17966y, (r0.m) obj, L);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int L2 = y.L(49);
                yb.b(this.f17963v, (df.a) this.f17964w, (df.a) this.f17965x, (df.a) this.f17966y, (r0.m) obj, L2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int L3 = y.L(1);
                z7.p.g((String) this.f17964w, (String) this.f17965x, this.f17963v, (df.l) this.f17966y, (r0.m) obj, L3);
                break;
            default:
                ((Integer) obj2).getClass();
                int L4 = y.L(3457);
                z7.p.f((String) this.f17964w, this.f17963v, (df.a) this.f17965x, (z0.c) this.f17966y, (r0.m) obj, L4);
                break;
        }
        return z.f22715a;
    }

    public /* synthetic */ m(Object obj, Object obj2, boolean z3, df.l lVar, int i, int i10) {
        this.f17962u = i10;
        this.f17964w = obj;
        this.f17965x = obj2;
        this.f17963v = z3;
        this.f17966y = lVar;
    }

    public /* synthetic */ m(boolean z3, df.a aVar, df.a aVar2, df.a aVar3, int i) {
        this.f17962u = 1;
        this.f17963v = z3;
        this.f17964w = aVar;
        this.f17965x = aVar2;
        this.f17966y = aVar3;
    }
}
