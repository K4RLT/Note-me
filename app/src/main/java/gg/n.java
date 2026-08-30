package gg;
import l.a;

import eg.p0;
import fg.z;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import qe.b0;
import qe.x;

/* loaded from: classes.dex */
public class n extends a {

    /* renamed from: f, reason: collision with root package name */
    public final z f17776f;

    /* renamed from: g, reason: collision with root package name */
    public final cg.d f17777g;

    /* renamed from: h, reason: collision with root package name */
    public int f17778h;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(fg.c cVar, z zVar, String str, cg.d dVar) {
        super(cVar, str);
        cVar.getClass();
        zVar.getClass();
        this.f17776f = zVar;
        this.f17777g = dVar;
    }

    @Override // gg.a
    public fg.m D(String str) {
        str.getClass();
        return (fg.m) x.a(str, R());
    }

    @Override // gg.a
    public String P(cg.d dVar, int i) {
        Object obj;
        dVar.getClass();
        fg.c cVar = this.f17758c;
        k.m(dVar, cVar);
        String g8 = dVar.g(i);
        if (this.e.f16988g && !R().f17001u.keySet().contains(g8)) {
            z5.h hVar = cVar.f16967c;
            androidx.ink.brush.b bVar = new androidx.ink.brush.b(dVar, 6, cVar);
            hVar.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) hVar.f31922v;
            Map map = (Map) concurrentHashMap.get(dVar);
            Object obj2 = null;
            l lVar = k.f17773a;
            if (map != null) {
                obj = map.get(lVar);
            } else {
                obj = null;
            }
            if (obj == null) {
                obj = null;
            }
            if (obj == null) {
                obj = bVar.invoke();
                Object obj3 = concurrentHashMap.get(dVar);
                if (obj3 == null) {
                    obj3 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(dVar, obj3);
                }
                ((Map) obj3).put(lVar, obj);
            }
            Map map2 = (Map) obj;
            Iterator it = R().f17001u.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj2 = next;
                    break;
                }
            }
            String str = (String) obj2;
            if (str != null) {
                return str;
            }
        }
        return g8;
    }

    @Override // gg.a
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public z R() {
        return this.f17776f;
    }

    @Override // gg.a, dg.a
    public void f(cg.d dVar) {
        Object obj;
        Set c10;
        dVar.getClass();
        fg.c cVar = this.f17758c;
        if (!k.j(dVar, cVar) && !(dVar.e() instanceof cg.b)) {
            k.m(dVar, cVar);
            if (!this.e.f16988g) {
                c10 = p0.b(dVar);
            } else {
                Set b10 = p0.b(dVar);
                z5.h hVar = cVar.f16967c;
                hVar.getClass();
                Map map = (Map) ((ConcurrentHashMap) hVar.f31922v).get(dVar);
                Set set = null;
                if (map != null) {
                    obj = map.get(k.f17773a);
                } else {
                    obj = null;
                }
                if (obj == null) {
                    obj = null;
                }
                Map map2 = (Map) obj;
                if (map2 != null) {
                    set = map2.keySet();
                }
                if (set == null) {
                    set = qe.u.f24025u;
                }
                c10 = b0.c(b10, set);
            }
            for (String str : R().f17001u.keySet()) {
                if (!c10.contains(str) && !kotlin.jvm.internal.a(str, this.f17759d)) {
                    throw k.d(-1, "Encountered an unknown key '" + str + "' at element: " + T() + "\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: " + ((Object) k.l(R().toString(), -1)));
                }
            }
        }
    }

    @Override // gg.a, dg.b
    public final dg.a k(cg.d dVar) {
        dVar.getClass();
        cg.d dVar2 = this.f17777g;
        if (dVar == dVar2) {
            fg.m E = E();
            String a10 = dVar2.a();
            if (E instanceof z) {
                return new n(this.f17758c, (z) E, this.f17759d, dVar2);
            }
            throw k.e(-1, "Expected " + kotlin.jvm.internal.z.a(z.class).c() + ", but had " + kotlin.jvm.internal.z.a(E.getClass()).c() + " as the serialized body of " + a10 + " at element: " + T(), E.toString());
        }
        return super.k(dVar);
    }

    @Override // gg.a, dg.b
    public final boolean p() {
        if (!this.i && super.p()) {
            return true;
        }
        return false;
    }

    @Override // dg.a
    public int t(cg.d dVar) {
        boolean z3;
        dVar.getClass();
        while (this.f17778h < dVar.f()) {
            int i = this.f17778h;
            this.f17778h = i + 1;
            String Q = Q(dVar, i);
            int i10 = this.f17778h - 1;
            this.i = false;
            if (!R().containsKey(Q)) {
                if (!this.f17758c.f16965a.f16986d && !dVar.j(i10) && dVar.i(i10).c()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.i = z3;
                if (z3) {
                }
            }
            this.e.getClass();
            return i10;
        }
        return -1;
    }

    public /* synthetic */ n(fg.c cVar, z zVar, String str, int i) {
        this(cVar, zVar, (i & 4) != 0 ? null : str, (cg.d) null);
    }
}
