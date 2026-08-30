package x2;
import l.a;
import p.a;

import k1.n0;

/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f30043a;

    /* renamed from: b, reason: collision with root package name */
    public final float f30044b;

    public b(n0 n0Var, float f10) {
        this.f30043a = n0Var;
        this.f30044b = f10;
    }

    @Override // x2.o
    public final float a() {
        return this.f30044b;
    }

    @Override // x2.o
    public final long b() {
        int i = k1.r.f19522m;
        return k1.r.f19521l;
    }

    @Override // x2.o
    public final k1.n c() {
        return this.f30043a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (kotlin.jvm.internal.a(this.f30043a, bVar.f30043a) && Float.compare(this.f30044b, bVar.f30044b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30044b) + (this.f30043a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BrushStyle(value=");
        sb2.append(this.f30043a);
        sb2.append(", alpha=");
        return a.m(sb2, this.f30044b, ')');
    }
}
