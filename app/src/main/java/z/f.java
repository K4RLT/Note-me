package z;
import l.a;

import b0.e1;
import b0.f0;
import b0.z;
import r0.r;

/* loaded from: classes.dex */
public final class f implements z {

    /* renamed from: a, reason: collision with root package name */
    public final m f31670a;

    /* renamed from: b, reason: collision with root package name */
    public final e f31671b;

    /* renamed from: c, reason: collision with root package name */
    public final b f31672c;

    /* renamed from: d, reason: collision with root package name */
    public final e1 f31673d;

    public f(m mVar, e eVar, b bVar, e1 e1Var) {
        this.f31670a = mVar;
        this.f31671b = eVar;
        this.f31672c = bVar;
        this.f31673d = e1Var;
    }

    @Override // b0.z
    public final int a() {
        return this.f31671b.k().f1179b;
    }

    @Override // b0.z
    public final Object b(int i) {
        Object e = this.f31673d.e(i);
        if (e == null) {
            return this.f31671b.l(i);
        }
        return e;
    }

    @Override // b0.z
    public final Object c(int i) {
        return this.f31671b.j(i);
    }

    @Override // b0.z
    public final int d(Object obj) {
        return this.f31673d.d(obj);
    }

    @Override // b0.z
    public final void e(int i, Object obj, r rVar) {
        rVar.a0(-462424778);
        f0.b(obj, i, this.f31670a.f31742q, z0.h.d(-824725566, new a0.k(this, i, 3), rVar), rVar, 3072);
        rVar.p(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        return kotlin.jvm.internal.a(this.f31671b, ((f) obj).f31671b);
    }

    public final int hashCode() {
        return this.f31671b.hashCode();
    }
}
