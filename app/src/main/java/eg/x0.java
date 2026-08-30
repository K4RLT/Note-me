package eg;
import l.a;
import p0.b;

import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class x0 implements cg.d, j {

    /* renamed from: a, reason: collision with root package name */
    public final cg.d f16596a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16597b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f16598c;

    public x0(cg.d dVar) {
        dVar.getClass();
        this.f16596a = dVar;
        this.f16597b = dVar.a() + '?';
        this.f16598c = b(dVar);
    }

    @Override // cg.d
    public final String a() {
        return this.f16597b;
    }

    @Override // eg.j
    public final Set b() {
        return this.f16598c;
    }

    @Override // cg.d
    public final boolean c() {
        return true;
    }

    @Override // cg.d
    public final int d(String str) {
        str.getClass();
        return this.f16596a.d(str);
    }

    @Override // cg.d
    public final wa.z e() {
        return this.f16596a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        if (kotlin.jvm.internal.a(this.f16596a, ((x0) obj).f16596a)) {
            return true;
        }
        return false;
    }

    @Override // cg.d
    public final int f() {
        return this.f16596a.f();
    }

    @Override // cg.d
    public final String g(int i) {
        return this.f16596a.g(i);
    }

    @Override // cg.d
    public final List getAnnotations() {
        return this.f16596a.getAnnotations();
    }

    @Override // cg.d
    public final List h(int i) {
        return this.f16596a.h(i);
    }

    public final int hashCode() {
        return this.f16596a.hashCode() * 31;
    }

    @Override // cg.d
    public final cg.d i(int i) {
        return this.f16596a.i(i);
    }

    @Override // cg.d
    public final boolean isInline() {
        return this.f16596a.isInline();
    }

    @Override // cg.d
    public final boolean j(int i) {
        return this.f16596a.j(i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f16596a);
        sb2.append('?');
        return sb2.toString();
    }
}
