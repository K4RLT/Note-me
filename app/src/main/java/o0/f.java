package o0;
import k1.r;
import p.a;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f21467a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21468b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21469c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21470d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21471f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21472g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21473h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f21474j;

    /* renamed from: k, reason: collision with root package name */
    public final long f21475k;

    /* renamed from: l, reason: collision with root package name */
    public final long f21476l;

    public f(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.f21467a = j10;
        this.f21468b = j11;
        this.f21469c = j12;
        this.f21470d = j13;
        this.e = j14;
        this.f21471f = j15;
        this.f21472g = j16;
        this.f21473h = j17;
        this.i = j18;
        this.f21474j = j19;
        this.f21475k = j20;
        this.f21476l = j21;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof f)) {
                f fVar = (f) obj;
                long j10 = fVar.f21467a;
                int i = r.f19522m;
                if (pe.a(this.f21467a, j10) && pe.a(this.f21468b, fVar.f21468b) && pe.a(this.f21469c, fVar.f21469c) && pe.a(this.f21470d, fVar.f21470d) && pe.a(this.e, fVar.e) && pe.a(this.f21471f, fVar.f21471f) && pe.a(this.f21472g, fVar.f21472g) && pe.a(this.f21473h, fVar.f21473h) && pe.a(this.i, fVar.i) && pe.a(this.f21474j, fVar.f21474j) && pe.a(this.f21475k, fVar.f21475k) && pe.a(this.f21476l, fVar.f21476l)) {
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
        return Long.hashCode(this.f21476l) + a.d(this.f21475k, a.d(this.f21474j, a.d(this.i, a.d(this.f21473h, a.d(this.f21472g, a.d(this.f21471f, a.d(this.e, a.d(this.f21470d, a.d(this.f21469c, a.d(this.f21468b, Long.hashCode(this.f21467a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
