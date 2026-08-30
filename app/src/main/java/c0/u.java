package c0;
import f0.b;
import a0.k;
import b0.f0;
import b0.z;
import l.a;

import b0.e1;

/* loaded from: classes.dex */
public final class u implements z {

    /* renamed from: a, reason: collision with root package name */
    public final d f3404a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f3405b;

    /* renamed from: c, reason: collision with root package name */
    public final e1 f3406c;

    public u(d dVar, t tVar, e1 e1Var) {
        this.f3404a = dVar;
        this.f3405b = tVar;
        this.f3406c = e1Var;
    }

    @Override // z
    public final int a() {
        return this.f3405b.k().f1179b;
    }

    @Override // z
    public final Object b(int i) {
        Object e = this.f3406c.e(i);
        if (e == null) {
            return this.f3405b.l(i);
        }
        return e;
    }

    @Override // z
    public final int d(Object obj) {
        return this.f3406c.d(obj);
    }

    @Override // z
    public final void e(int i, Object obj, r0.r rVar) {
        rVar.a0(-1201380429);
        f0.b(obj, i, this.f3404a.B, z0.h.d(1142237095, new k(this, i, 1), rVar), rVar, 3072);
        rVar.p(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        return kotlin.jvm.internal.a(this.f3405b, ((u) obj).f3405b);
    }

    public final int hashCode() {
        return this.f3405b.hashCode();
    }
}
