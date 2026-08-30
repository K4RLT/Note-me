package w0;

import n.s;
import q1.y;

/* loaded from: classes.dex */
public final class a extends s implements ef.c {

    /* renamed from: x, reason: collision with root package name */
    public final y f27657x;

    /* renamed from: y, reason: collision with root package name */
    public Object f27658y;

    public a(y yVar, Object obj, Object obj2) {
        super(obj, 1, obj2);
        this.f27657x = yVar;
        this.f27658y = obj2;
    }

    @Override // n.s, java.util.Map.Entry
    public final Object getValue() {
        return this.f27658y;
    }

    @Override // n.s, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        Object obj2 = this.f27658y;
        this.f27658y = obj;
        e eVar = (e) this.f27657x.f23320v;
        d dVar = eVar.f27671x;
        Object obj3 = this.f20936v;
        if (!dVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z3 = eVar.f27664w;
        if (z3) {
            if (z3) {
                l lVar = eVar.f27662u[eVar.f27663v];
                Object obj4 = lVar.f27683u[lVar.f27685w];
                dVar.put(obj3, obj);
                if (obj4 != null) {
                    i = obj4.hashCode();
                } else {
                    i = 0;
                }
                eVar.c(i, dVar.f27667w, obj4, 0);
            } else {
                l4.a.c();
                return null;
            }
        } else {
            dVar.put(obj3, obj);
        }
        eVar.A = dVar.f27669y;
        return obj2;
    }
}
