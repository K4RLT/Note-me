package j6;
import d.b;
import d.i;
import l.a;
import q.f;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f18944a;

    /* renamed from: b, reason: collision with root package name */
    public int f18945b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18946c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18947d;
    public a6.g e;

    /* renamed from: f, reason: collision with root package name */
    public final a6.g f18948f;

    /* renamed from: g, reason: collision with root package name */
    public long f18949g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18950h;
    public final long i;

    /* renamed from: j, reason: collision with root package name */
    public a6.d f18951j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18952k;

    /* renamed from: l, reason: collision with root package name */
    public final int f18953l;

    /* renamed from: m, reason: collision with root package name */
    public final long f18954m;

    /* renamed from: n, reason: collision with root package name */
    public long f18955n;

    /* renamed from: o, reason: collision with root package name */
    public final long f18956o;

    /* renamed from: p, reason: collision with root package name */
    public final long f18957p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f18958q;

    /* renamed from: r, reason: collision with root package name */
    public final int f18959r;

    /* renamed from: s, reason: collision with root package name */
    public final int f18960s;

    /* renamed from: t, reason: collision with root package name */
    public final int f18961t;

    /* renamed from: u, reason: collision with root package name */
    public final long f18962u;

    /* renamed from: v, reason: collision with root package name */
    public final int f18963v;

    /* renamed from: w, reason: collision with root package name */
    public final int f18964w;

    static {
        a6.f("WorkSpec");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ p(java.lang.String r36, int r37, java.lang.String r38, java.lang.String r39, a6.g r40, a6.g r41, long r42, long r44, long r46, a6.d r48, int r49, int r50, long r51, long r53, long r55, long r57, boolean r59, int r60, int r61, long r62, int r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.p.<init>(java.lang.String, int, java.lang.String, java.lang.String, a6.g, a6.g, long, long, long, a6.d, int, int, long, long, long, long, boolean, int, int, long, int, int, int):void");
    }

    public final long a() {
        long j10;
        boolean z3 = true;
        if (this.f18945b != 1 || this.f18952k <= 0) {
            z3 = false;
        }
        long j11 = this.f18955n;
        boolean c10 = c();
        long j12 = this.f18949g;
        int i = this.f18953l;
        if (i != 0) {
            long j13 = this.f18962u;
            int i10 = this.f18960s;
            if (j13 != Long.MAX_VALUE && c10) {
                if (i10 != 0) {
                    long j14 = j11 + 900000;
                    if (j13 < j14) {
                        return j14;
                    }
                    return j13;
                }
                return j13;
            }
            if (z3) {
                int i11 = this.f18952k;
                long j15 = this.f18954m;
                if (i == 2) {
                    j12 = j15 * i11;
                } else {
                    j12 = Math.scalb((float) j15, i11 - 1);
                }
                if (j12 > 18000000) {
                    j12 = 18000000;
                }
            } else {
                if (c10) {
                    long j16 = this.f18950h;
                    if (i10 == 0) {
                        j10 = j11 + j12;
                    } else {
                        j10 = j11 + j16;
                    }
                    long j17 = j10;
                    long j18 = this.i;
                    if (j18 != j16 && i10 == 0) {
                        return j17 + (j16 - j18);
                    }
                    return j17;
                }
                if (j11 == -1) {
                    return Long.MAX_VALUE;
                }
            }
            return j11 + j12;
        }
        throw null;
    }

    public final boolean b() {
        return !kotlin.jvm.internal.a(a6.i, this.f18951j);
    }

    public final boolean c() {
        if (this.f18950h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (!kotlin.jvm.internal.a(this.f18944a, pVar.f18944a) || this.f18945b != pVar.f18945b || !kotlin.jvm.internal.a(this.f18946c, pVar.f18946c) || !kotlin.jvm.internal.a(this.f18947d, pVar.f18947d) || !kotlin.jvm.internal.a(this.e, pVar.e) || !kotlin.jvm.internal.a(this.f18948f, pVar.f18948f) || this.f18949g != pVar.f18949g || this.f18950h != pVar.f18950h || this.i != pVar.i || !kotlin.jvm.internal.a(this.f18951j, pVar.f18951j) || this.f18952k != pVar.f18952k || this.f18953l != pVar.f18953l || this.f18954m != pVar.f18954m || this.f18955n != pVar.f18955n || this.f18956o != pVar.f18956o || this.f18957p != pVar.f18957p || this.f18958q != pVar.f18958q || this.f18959r != pVar.f18959r || this.f18960s != pVar.f18960s || this.f18961t != pVar.f18961t || this.f18962u != pVar.f18962u || this.f18963v != pVar.f18963v || this.f18964w != pVar.f18964w) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int d2 = a.d(this.f18957p, a.d(this.f18956o, a.d(this.f18955n, a.d(this.f18954m, (q0.b(this.f18953l) + a.b(this.f18952k, (this.f18951j.hashCode() + a.d(this.i, a.d(this.f18950h, a.d(this.f18949g, (this.f18948f.hashCode() + ((this.e.hashCode() + g3.a.e(this.f18947d, g3.a.e(this.f18946c, (q0.b(this.f18945b) + (this.f18944a.hashCode() * 31)) * 31, 31), 31)) * 31)) * 31, 31), 31), 31)) * 31, 31)) * 31, 31), 31), 31), 31);
        boolean z3 = this.f18958q;
        int i = z3;
        if (z3 != 0) {
            i = 1;
        }
        return Integer.hashCode(this.f18964w) + a.b(this.f18963v, a.d(this.f18962u, a.b(this.f18961t, a.b(this.f18960s, (q0.b(this.f18959r) + ((d2 + i) * 31)) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return a.n(new StringBuilder("{WorkSpec: "), this.f18944a, '}');
    }

    public p(String str, int i, String str2, String str3, a6.g gVar, a6.g gVar2, long j10, long j11, long j12, a6.d dVar, int i10, int i11, long j13, long j14, long j15, long j16, boolean z3, int i12, int i13, int i14, long j17, int i15, int i16) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        str2.getClass();
        str3.getClass();
        gVar.getClass();
        gVar2.getClass();
        dVar.getClass();
        if (i11 == 0) {
            throw null;
        }
        if (i12 != 0) {
            this.f18944a = str;
            this.f18945b = i;
            this.f18946c = str2;
            this.f18947d = str3;
            this.e = gVar;
            this.f18948f = gVar2;
            this.f18949g = j10;
            this.f18950h = j11;
            this.i = j12;
            this.f18951j = dVar;
            this.f18952k = i10;
            this.f18953l = i11;
            this.f18954m = j13;
            this.f18955n = j14;
            this.f18956o = j15;
            this.f18957p = j16;
            this.f18958q = z3;
            this.f18959r = i12;
            this.f18960s = i13;
            this.f18961t = i14;
            this.f18962u = j17;
            this.f18963v = i15;
            this.f18964w = i16;
            return;
        }
        throw null;
    }
}
