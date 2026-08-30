package o0;
import k1.r;
import p.a;
import u.a;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final long f21690a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21691b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21692c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21693d;

    public u(long j10, long j11, long j12, long j13) {
        this.f21690a = j10;
        this.f21691b = j11;
        this.f21692c = j12;
        this.f21693d = j13;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof u)) {
                u uVar = (u) obj;
                long j10 = uVar.f21690a;
                int i = r.f19522m;
                if (pe.a(this.f21690a, j10) && pe.a(this.f21691b, uVar.f21691b) && pe.a(this.f21692c, uVar.f21692c) && pe.a(this.f21693d, uVar.f21693d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = r.f19522m;
        return Long.hashCode(this.f21693d) + a.d(this.f21692c, a.d(this.f21691b, Long.hashCode(this.f21690a) * 31, 31), 31);
    }
}
