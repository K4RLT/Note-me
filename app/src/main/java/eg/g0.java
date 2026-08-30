package eg;
import i1.c;
import q.x;
import x.a;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g0 extends a {

    /* renamed from: a, reason: collision with root package name */
    public final ag.a f16518a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f16519b;

    public g0(ag.a aVar) {
        b1 b1Var = b1.f16494a;
        this.f16518a = aVar;
        this.f16519b = new f0(b1.f16495b, aVar.d());
    }

    @Override // ag.a
    public final void a(gg.t tVar, Object obj) {
        h(obj);
        f0 f0Var = this.f16519b;
        f0Var.getClass();
        gg.t a10 = tVar.a(f0Var);
        Iterator g8 = g(obj);
        int i = 0;
        while (g8.hasNext()) {
            Map.Entry entry = (Map.Entry) g8.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i10 = i + 1;
            a10.r(f0Var, i, b1.f16494a, key);
            i += 2;
            a10.r(f0Var, i10, this.f16518a, value);
        }
        a10.w(f0Var);
    }

    @Override // ag.a
    public final cg.d d() {
        return this.f16519b;
    }

    @Override // eg.a
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // eg.a
    public final int f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // eg.a
    public final Iterator g(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // eg.a
    public final int h(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // eg.a
    public final void j(dg.a aVar, int i, Object obj) {
        Object s10;
        Map map = (Map) obj;
        map.getClass();
        b1 b1Var = b1.f16494a;
        f0 f0Var = this.f16519b;
        Object s11 = aVar.s(f0Var, i, b1Var, null);
        int t3 = aVar.t(f0Var);
        if (t3 == i + 1) {
            boolean containsKey = map.containsKey(s11);
            ag.a aVar2 = this.f16518a;
            if (containsKey && !(aVar2.d().e() instanceof cg.c)) {
                s10 = aVar.s(f0Var, t3, aVar2, qe.a(s11, map));
            } else {
                s10 = aVar.s(f0Var, t3, aVar2, null);
            }
            map.put(s11, s10);
            return;
        }
        x.j(w7.c("Value must follow key in a map, index for key: ", i, t3, ", returned index for value: "));
    }

    @Override // eg.a
    public final Object k(Object obj) {
        throw null;
    }

    @Override // eg.a
    public final Object l(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }
}
