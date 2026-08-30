package p;
import a.a;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f22249a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22250b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22251c;

    public s0(float f10, float f11, long j10) {
        this.f22249a = f10;
        this.f22250b = f11;
        this.f22251c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        if (Float.compare(this.f22249a, s0Var.f22249a) == 0 && Float.compare(this.f22250b, s0Var.f22250b) == 0 && this.f22251c == s0Var.f22251c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22251c) + a(Float.hashCode(this.f22249a) * 31, 31, this.f22250b);
    }

    public final String toString() {
        return "FlingInfo(initialVelocity=" + this.f22249a + ", distance=" + this.f22250b + ", duration=" + this.f22251c + ')';
    }
}
