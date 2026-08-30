package k0;
import p.a;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final x2.j f19392a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19393b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19394c;

    public q(x2.j jVar, int i, long j10) {
        this.f19392a = jVar;
        this.f19393b = i;
        this.f19394c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f19392a == qVar.f19392a && this.f19393b == qVar.f19393b && this.f19394c == qVar.f19394c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19394c) + a.b(this.f19393b, this.f19392a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AnchorInfo(direction=" + this.f19392a + ", offset=" + this.f19393b + ", selectableId=" + this.f19394c + ')';
    }
}
