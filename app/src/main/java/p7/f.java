package p7;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final float f22475a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22476b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22477c;

    public f(float f10, float f11, long j10) {
        this.f22475a = f10;
        this.f22476b = f11;
        this.f22477c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Float.compare(this.f22475a, fVar.f22475a) == 0 && Float.compare(this.f22476b, fVar.f22476b) == 0 && this.f22477c == fVar.f22477c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22477c) + a.a(Float.hashCode(this.f22475a) * 31, 31, this.f22476b);
    }

    public final String toString() {
        return "TimedPoint(x=" + this.f22475a + ", y=" + this.f22476b + ", t=" + this.f22477c + ")";
    }
}
