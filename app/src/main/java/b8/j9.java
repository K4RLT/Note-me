package b8;
import ha.b;
import r0.m;
import r0.n2;
import r0.r;
import z0.h;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class j9 implements df.p {
    public final /* synthetic */ n2 A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ma f2267u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w7.s9 f2268v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n2 f2269w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Map f2270x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.l f2271y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f2272z;

    public j9(ma maVar, w7.s9 s9Var, n2 n2Var, Map map, df.l lVar, float f10, n2 n2Var2) {
        this.f2267u = maVar;
        this.f2268v = s9Var;
        this.f2269w = n2Var;
        this.f2270x = map;
        this.f2271y = lVar;
        this.f2272z = f10;
        this.A = n2Var2;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        m mVar = (m) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(intValue & 1, z3)) {
            ConcurrentHashMap concurrentHashMap = ha.f2170a;
            q.t tVar = z9.f3099a;
            Map map = (Map) this.f2269w.getValue();
            w7.s9 s9Var = this.f2268v;
            String str = s9Var.f29080a;
            map.getClass();
            ma maVar = this.f2267u;
            maVar.getClass();
            str.getClass();
            Set set = (Set) map.get(maVar);
            if (set == null) {
                set = qe.u.f24025u;
            }
            z9.a(set.contains(b(maVar, str)), h.d(-628696172, new i9(s9Var, this.f2270x, this.f2271y, this.f2272z, this.A), rVar), rVar, 48);
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
