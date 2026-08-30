package xa;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class v1 extends t1 {

    /* renamed from: b, reason: collision with root package name */
    public final c1 f30692b;

    public v1(c1 c1Var, w1 w1Var) {
        super(w1Var);
        this.f30692b = c1Var;
    }

    @Override // xa.t1
    public final Object c() {
        return this.f30692b.zza();
    }

    @Override // xa.t1
    public final void e(Object obj, l2 l2Var, s1 s1Var) {
        Field field = s1Var.f30519a;
        Object a10 = s1Var.f30521c.a(l2Var);
        if (a10 == null && s1Var.f30522d) {
            return;
        }
        if (!s1Var.e) {
            field.set(obj, a10);
            return;
        }
        throw new ab.b("Cannot set value of 'static final' ".concat(g2.c(field, false)), 21);
    }

    @Override // xa.t1
    public final Object d(Object obj) {
        return obj;
    }
}
