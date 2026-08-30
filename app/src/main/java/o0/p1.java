package o0;
import k1.r;
import p.a;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f21620a;

    /* renamed from: b, reason: collision with root package name */
    public final long f21621b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21622c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21623d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21624f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21625g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21626h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public final long f21627j;

    /* renamed from: k, reason: collision with root package name */
    public final long f21628k;

    /* renamed from: l, reason: collision with root package name */
    public final long f21629l;

    /* renamed from: m, reason: collision with root package name */
    public final long f21630m;

    /* renamed from: n, reason: collision with root package name */
    public final long f21631n;

    /* renamed from: o, reason: collision with root package name */
    public final long f21632o;

    /* renamed from: p, reason: collision with root package name */
    public final long f21633p;

    public p1(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25) {
        this.f21620a = j10;
        this.f21621b = j11;
        this.f21622c = j12;
        this.f21623d = j13;
        this.e = j14;
        this.f21624f = j15;
        this.f21625g = j16;
        this.f21626h = j17;
        this.i = j18;
        this.f21627j = j19;
        this.f21628k = j20;
        this.f21629l = j21;
        this.f21630m = j22;
        this.f21631n = j23;
        this.f21632o = j24;
        this.f21633p = j25;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof p1)) {
                p1 p1Var = (p1) obj;
                long j10 = p1Var.f21620a;
                int i = r.f19522m;
                if (pe.a(this.f21620a, j10) && pe.a(this.f21621b, p1Var.f21621b) && pe.a(this.f21622c, p1Var.f21622c) && pe.a(this.f21623d, p1Var.f21623d) && pe.a(this.e, p1Var.e) && pe.a(this.f21624f, p1Var.f21624f) && pe.a(this.f21625g, p1Var.f21625g) && pe.a(this.f21626h, p1Var.f21626h) && pe.a(this.i, p1Var.i) && pe.a(this.f21627j, p1Var.f21627j) && pe.a(this.f21628k, p1Var.f21628k) && pe.a(this.f21629l, p1Var.f21629l) && pe.a(this.f21630m, p1Var.f21630m) && pe.a(this.f21631n, p1Var.f21631n) && pe.a(this.f21632o, p1Var.f21632o) && pe.a(this.f21633p, p1Var.f21633p)) {
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
        return Long.hashCode(this.f21633p) + a.d(this.f21632o, a.d(this.f21631n, a.d(this.f21630m, a.d(this.f21629l, a.d(this.f21628k, a.d(this.f21627j, a.d(this.i, a.d(this.f21626h, a.d(this.f21625g, a.d(this.f21624f, a.d(this.e, a.d(this.f21623d, a.d(this.f21622c, a.d(this.f21621b, Long.hashCode(this.f21620a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
