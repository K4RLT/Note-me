package xa;
import q.b;
import q.f;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class p0 implements Cloneable, j0 {

    /* renamed from: w, reason: collision with root package name */
    public static final p0 f30494w = new p0();

    /* renamed from: u, reason: collision with root package name */
    public final List f30495u;

    /* renamed from: v, reason: collision with root package name */
    public final List f30496v;

    public p0() {
        List list = Collections.EMPTY_LIST;
        this.f30495u = list;
        this.f30496v = list;
    }

    @Override // xa.j0
    public final i0 a(z zVar, k2 k2Var) {
        Class cls = k2Var.f30449a;
        boolean b10 = b(cls, true);
        boolean b11 = b(cls, false);
        if (!b10 && !b11) {
            return null;
        }
        return new o0(this, b11, zVar, k2Var);
    }

    public final boolean b(Class cls, boolean z3) {
        List list;
        if (!z3) {
            if (!Enum.class.isAssignableFrom(cls)) {
                u0 u0Var = g2.f30419a;
                if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                    return true;
                }
            }
            list = this.f30496v;
        } else {
            list = this.f30495u;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        g5.b();
        return false;
    }

    public final Object clone() {
        try {
            return (p0) super.clone();
        } catch (CloneNotSupportedException e) {
            g5.f(e);
            return null;
        }
    }
}
