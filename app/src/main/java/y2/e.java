package y2;
import a.a;
import p.a;

import q.x;
import ya.ae;

/* loaded from: classes.dex */
public final class e implements c {

    /* renamed from: u, reason: collision with root package name */
    public final float f30802u;

    /* renamed from: v, reason: collision with root package name */
    public final float f30803v;

    /* renamed from: w, reason: collision with root package name */
    public final z2.a f30804w;

    public e(float f10, float f11, z2.a aVar) {
        this.f30802u = f10;
        this.f30803v = f11;
        this.f30804w = aVar;
    }

    @Override // y2.c
    public final float a() {
        return this.f30802u;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (Float.compare(this.f30802u, eVar.f30802u) != 0 || Float.compare(this.f30803v, eVar.f30803v) != 0 || !this.f30804w.equals(eVar.f30804w)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f30804w.hashCode() + a.a(Float.hashCode(this.f30802u) * 31, 31, this.f30803v);
    }

    @Override // y2.c
    public final float i0() {
        return this.f30803v;
    }

    @Override // y2.c
    public final long o(float f10) {
        return ae.f(4294967296L, this.f30804w.a(f10));
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f30802u + ", fontScale=" + this.f30803v + ", converter=" + this.f30804w + ')';
    }

    @Override // y2.c
    public final float x(long j10) {
        if (a(o.b(j10), 4294967296L)) {
            return this.f30804w.b(o.c(j10));
        }
        x.o("Only Sp can convert to Px");
        return 0.0f;
    }
}
