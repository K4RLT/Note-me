package a0;
import f0.b;
import b0.f0;
import b0.z;
import l.a;

import b0.e1;

/* loaded from: classes.dex */
public final class l implements z {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f82a;

    /* renamed from: b, reason: collision with root package name */
    public final j f83b;

    /* renamed from: c, reason: collision with root package name */
    public final e1 f84c;

    public l(l0 l0Var, j jVar, e1 e1Var) {
        this.f82a = l0Var;
        this.f83b = jVar;
        this.f84c = e1Var;
    }

    @Override // z
    public final int a() {
        return this.f83b.k().f1179b;
    }

    @Override // z
    public final Object b(int i) {
        Object e = this.f84c.e(i);
        if (e == null) {
            return this.f83b.l(i);
        }
        return e;
    }

    @Override // z
    public final Object c(int i) {
        return this.f83b.j(i);
    }

    @Override // z
    public final int d(Object obj) {
        return this.f84c.d(obj);
    }

    @Override // z
    public final void e(int i, Object obj, r0.r rVar) {
        rVar.a0(1493551140);
        f0.b(obj, i, this.f82a.f100q, z0.h.d(726189336, new k(this, i, 0), rVar), rVar, 3072);
        rVar.p(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return kotlin.jvm.internal.a(this.f83b, ((l) obj).f83b);
    }

    public final int hashCode() {
        return this.f83b.hashCode();
    }
}
