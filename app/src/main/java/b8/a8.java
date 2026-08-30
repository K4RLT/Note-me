package b8;
import a0.l0;
import d1.r;
import r0.m;
import r0.y;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class a8 implements df.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f1842u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Serializable f1843v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f1844w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f1845x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.l f1846y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f1847z;

    public /* synthetic */ a8(String str, Integer num, boolean z3, df.a aVar, df.a aVar2, df.l lVar, df.a aVar3, int i) {
        this.f1842u = 2;
        this.f1843v = str;
        this.f1844w = num;
        this.f1845x = z3;
        this.f1847z = aVar;
        this.A = aVar2;
        this.f1846y = lVar;
        this.B = aVar3;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1842u) {
            case 0:
                ((Integer) obj2).getClass();
                int L = y.L(1572865);
                z9.j((ArrayList) this.f1843v, (Map) this.f1844w, this.f1845x, this.f1846y, (l0) this.f1847z, (Set) this.A, (r) this.B, (m) obj, L);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int L2 = y.L(1572865);
                z9.j((ArrayList) this.f1843v, (Map) this.f1844w, this.f1845x, this.f1846y, (l0) this.f1847z, (Set) this.A, (r) this.B, (m) obj, L2);
                break;
            default:
                ((Integer) obj2).getClass();
                int L3 = y.L(27649);
                w7.n4.v0((String) this.f1843v, (Integer) this.f1844w, this.f1845x, (df.a) this.f1847z, (df.a) this.A, this.f1846y, (df.a) this.B, (m) obj, L3);
                break;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ a8(ArrayList arrayList, Map map, boolean z3, df.l lVar, l0 l0Var, Set set, r rVar, int i, int i10) {
        this.f1842u = i10;
        this.f1843v = arrayList;
        this.f1844w = map;
        this.f1845x = z3;
        this.f1846y = lVar;
        this.f1847z = l0Var;
        this.A = set;
        this.B = rVar;
    }
}
