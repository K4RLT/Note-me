package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class v9 implements j9 {
    public String e;

    /* renamed from: f, reason: collision with root package name */
    public i3 f11843f;
    public boolean i;

    /* renamed from: k, reason: collision with root package name */
    public int f11847k;

    /* renamed from: l, reason: collision with root package name */
    public int f11848l;

    /* renamed from: n, reason: collision with root package name */
    public int f11850n;

    /* renamed from: o, reason: collision with root package name */
    public int f11851o;

    /* renamed from: s, reason: collision with root package name */
    public int f11855s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11857u;

    /* renamed from: d, reason: collision with root package name */
    public int f11842d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final xk0 f11839a = new xk0(new byte[15], 2);

    /* renamed from: b, reason: collision with root package name */
    public final tk0 f11840b = new tk0();

    /* renamed from: c, reason: collision with root package name */
    public final xk0 f11841c = new xk0();

    /* renamed from: p, reason: collision with root package name */
    public final b6 f11852p = new b6();

    /* renamed from: q, reason: collision with root package name */
    public int f11853q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f11854r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f11856t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11846j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11849m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f11844g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f11845h = -9.223372036854776E18d;

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(p2 p2Var, fa faVar) {
        faVar.a();
        faVar.b();
        this.e = faVar.e;
        faVar.b();
        this.f11843f = p2Var.A(faVar.f5998d, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:207:0x02b0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04cc A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.xk0 r25) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v9.c(com.google.android.gms.internal.ads.xk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void d(int i, long j10) {
        this.f11847k = i;
        if (!this.f11846j && (this.f11851o != 0 || !this.f11849m)) {
            this.i = true;
        }
        if (j10 != -9223372036854775807L) {
            double d2 = j10;
            if (this.i) {
                this.f11845h = d2;
            } else {
                this.f11844g = d2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        this.f11842d = 0;
        this.f11848l = 0;
        this.f11839a.y(2);
        this.f11850n = 0;
        this.f11851o = 0;
        this.f11853q = -2147483647;
        this.f11854r = -1;
        this.f11855s = 0;
        this.f11856t = -1L;
        this.f11857u = false;
        this.i = false;
        this.f11849m = true;
        this.f11846j = true;
        this.f11844g = -9.223372036854776E18d;
        this.f11845h = -9.223372036854776E18d;
    }
}
