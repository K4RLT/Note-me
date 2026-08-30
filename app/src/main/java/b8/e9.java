package b8;
import ha.b;
import j6.e;
import kb.a;
import r0.l;
import r0.m;
import r0.n2;
import r0.r;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e9 extends kotlin.jvm.internal.m implements df.r {
    public final /* synthetic */ Set A;
    public final /* synthetic */ n2 B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ List f2035u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ df.l f2036v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ df.l f2037w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f2038x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.l f2039y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e f2040z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(List list, df.l lVar, df.l lVar2, String str, df.l lVar3, e eVar, Set set, n2 n2Var) {
        super(4);
        this.f2035u = list;
        this.f2036v = lVar;
        this.f2037w = lVar2;
        this.f2038x = str;
        this.f2039y = lVar3;
        this.f2040z = eVar;
        this.A = set;
        this.B = n2Var;
    }

    @Override // df.r
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z3;
        boolean z9;
        int i10;
        int i11;
        b bVar = (b) obj;
        int intValue = ((Number) obj2).intValue();
        m mVar = (m) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            if (((r) mVar).f(bVar)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i = i11 | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            if (((r) mVar).d(intValue)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i |= i10;
        }
        if ((i & 147) != 146) {
            z3 = true;
        } else {
            z3 = false;
        }
        r rVar = (r) mVar;
        if (rVar.R(i & 1, z3)) {
            int i12 = i & 126;
            ca caVar = (ca) this.f2035u.get(intValue);
            rVar.a0(1453517501);
            ConcurrentHashMap concurrentHashMap = ha.f2170a;
            Map map = (Map) this.B.getValue();
            ma maVar = ma.NOTEBOOKS;
            String str = caVar.f1935a;
            String str2 = caVar.f1937c;
            map.getClass();
            maVar.getClass();
            str.getClass();
            Set set = (Set) map.get(maVar);
            if (set == null) {
                set = qe.u.f24025u;
            }
            boolean contains = set.contains(b(maVar, str));
            File file = (File) this.f2036v.invoke(caVar);
            List list = (List) this.f2037w.invoke(caVar);
            if (!mf.f.u(str2) && str2.equals(this.f2038x)) {
                z9 = true;
            } else {
                z9 = false;
            }
            df.l lVar = this.f2039y;
            boolean f10 = rVar.f(lVar) | rVar.f(caVar);
            Object O = rVar.O();
            if (f10 || O == l.f24285a) {
                O = new c9(lVar, caVar, 0);
                rVar.k0(O);
            }
            a(caVar, file, list, z9, (df.a) O, null, this.f2040z, intValue, contains, this.A, rVar, (i12 << 18) & 29360128);
            rVar.p(false);
        } else {
            rVar.U();
        }
        return pe.z.f22715a;
    }
}
