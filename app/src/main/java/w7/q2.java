package w7;
import a.a;
import b.c;
import j1.b;
import p.a;

/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f28943a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28944b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28945c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28946d;

    public q2(long j10, float f10, float f11, float f12) {
        this.f28943a = j10;
        this.f28944b = f10;
        this.f28945c = f11;
        this.f28946d = f12;
    }

    public final float a() {
        return this.f28944b;
    }

    public final float b() {
        return this.f28945c;
    }

    public final long c() {
        return this.f28943a;
    }

    public final float d() {
        return this.f28946d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q2) {
                q2 q2Var = (q2) obj;
                if (!b.c(this.f28943a, q2Var.f28943a) || Float.compare(this.f28944b, q2Var.f28944b) != 0 || Float.compare(this.f28945c, q2Var.f28945c) != 0 || Float.compare(this.f28946d, q2Var.f28946d) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28946d) + a.a(a.a(Long.hashCode(this.f28943a) * 31, 31, this.f28944b), 31, this.f28945c);
    }

    public final String toString() {
        return "TapeCommitState(start=" + b.j(this.f28943a) + ", angleDeg=" + this.f28944b + ", lengthPx=" + this.f28945c + ", thickPx=" + this.f28946d + ")";
    }
}
