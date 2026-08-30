package p;
import l.c;
import l.d;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final d f22218a;

    /* renamed from: b, reason: collision with root package name */
    public long f22219b;

    public o1(d dVar, long j10) {
        this.f22218a = dVar;
        this.f22219b = j10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o1) {
                o1 o1Var = (o1) obj;
                if (!this.f22218a.equals(o1Var.f22218a) || !y2.c(this.f22219b, o1Var.f22219b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22219b) + (this.f22218a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.f22218a + ", startSize=" + ((Object) y2.d(this.f22219b)) + ')';
    }
}
