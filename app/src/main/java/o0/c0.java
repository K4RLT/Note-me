package o0;
import k1.r;
import p.a;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f21435a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21436b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21437c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21438d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21439f;

    public c0(long j10, long j11, long j12, long j13, long j14, long j15) {
        this.f21435a = j10;
        this.f21436b = j11;
        this.f21437c = j12;
        this.f21438d = j13;
        this.e = j14;
        this.f21439f = j15;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof c0)) {
                c0 c0Var = (c0) obj;
                long j10 = c0Var.f21435a;
                int i = r.f19522m;
                if (pe.a(this.f21435a, j10) && pe.a(this.f21436b, c0Var.f21436b) && pe.a(this.f21437c, c0Var.f21437c) && pe.a(this.f21438d, c0Var.f21438d) && pe.a(this.e, c0Var.e) && pe.a(this.f21439f, c0Var.f21439f)) {
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
        return Long.hashCode(this.f21439f) + a.d(this.e, a.d(this.f21438d, a.d(this.f21437c, a.d(this.f21436b, Long.hashCode(this.f21435a) * 31, 31), 31), 31), 31);
    }
}
