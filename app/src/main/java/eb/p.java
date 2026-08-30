package eb;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f16294a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16295b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16296c;

    /* renamed from: d, reason: collision with root package name */
    public final long f16297d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f16298f;

    /* renamed from: g, reason: collision with root package name */
    public final long f16299g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f16300h;
    public final Long i;

    /* renamed from: j, reason: collision with root package name */
    public final Long f16301j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f16302k;

    public p(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        boolean z3;
        boolean z9;
        boolean z10;
        fa.y.e(str);
        fa.y.e(str2);
        if (j10 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        fa.y.b(z3);
        if (j11 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        fa.y.b(z9);
        if (j12 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        fa.y.b(z10);
        fa.y.b(j14 >= 0);
        this.f16294a = str;
        this.f16295b = str2;
        this.f16296c = j10;
        this.f16297d = j11;
        this.e = j12;
        this.f16298f = j13;
        this.f16299g = j14;
        this.f16300h = l10;
        this.i = l11;
        this.f16301j = l12;
        this.f16302k = bool;
    }

    public final p a(long j10) {
        return new p(this.f16294a, this.f16295b, this.f16296c, this.f16297d, this.e, j10, this.f16299g, this.f16300h, this.i, this.f16301j, this.f16302k);
    }

    public final p b(Long l10, Long l11, Boolean bool) {
        Boolean bool2;
        if (bool != null && !bool.booleanValue()) {
            bool2 = null;
        } else {
            bool2 = bool;
        }
        return new p(this.f16294a, this.f16295b, this.f16296c, this.f16297d, this.e, this.f16298f, this.f16299g, this.f16300h, l10, l11, bool2);
    }

    public p(long j10, String str, String str2) {
        this(str, str2, 0L, 0L, 0L, j10, 0L, null, null, null, null);
    }
}
