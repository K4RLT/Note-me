package y2;
import p.a;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: u, reason: collision with root package name */
    public final float f30800u;

    /* renamed from: v, reason: collision with root package name */
    public final float f30801v;

    public d(float f10, float f11) {
        this.f30800u = f10;
        this.f30801v = f11;
    }

    @Override // y2.c
    public final float a() {
        return this.f30800u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Float.compare(this.f30800u, dVar.f30800u) == 0 && Float.compare(this.f30801v, dVar.f30801v) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f30801v) + (Float.hashCode(this.f30800u) * 31);
    }

    @Override // y2.c
    public final float i0() {
        return this.f30801v;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.f30800u);
        sb2.append(", fontScale=");
        return a.m(sb2, this.f30801v, ')');
    }
}
