package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class t9 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11273a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11274b;

    /* renamed from: c, reason: collision with root package name */
    public final xk0 f11275c;

    /* renamed from: d, reason: collision with root package name */
    public final tk0 f11276d;
    public i3 e;

    /* renamed from: f, reason: collision with root package name */
    public String f11277f;

    /* renamed from: g, reason: collision with root package name */
    public mw1 f11278g;

    /* renamed from: h, reason: collision with root package name */
    public int f11279h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f11280j;

    /* renamed from: k, reason: collision with root package name */
    public int f11281k;

    /* renamed from: l, reason: collision with root package name */
    public long f11282l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11283m;

    /* renamed from: n, reason: collision with root package name */
    public int f11284n;

    /* renamed from: o, reason: collision with root package name */
    public int f11285o;

    /* renamed from: p, reason: collision with root package name */
    public int f11286p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11287q;

    /* renamed from: r, reason: collision with root package name */
    public long f11288r;

    /* renamed from: s, reason: collision with root package name */
    public int f11289s;

    /* renamed from: t, reason: collision with root package name */
    public long f11290t;

    /* renamed from: u, reason: collision with root package name */
    public int f11291u;

    /* renamed from: v, reason: collision with root package name */
    public String f11292v;

    public t9(String str, int i) {
        this.f11273a = str;
        this.f11274b = i;
        xk0 xk0Var = new xk0(1024);
        this.f11275c = xk0Var;
        byte[] bArr = xk0Var.f12580a;
        this.f11276d = new tk0(bArr, bArr.length);
        this.f11282l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(p2 p2Var, fa faVar) {
        faVar.a();
        faVar.b();
        this.e = p2Var.A(faVar.f5998d, 1);
        faVar.b();
        this.f11277f = faVar.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x019d, code lost:
    
        if (r23.f11283m == false) goto L68;
     */
    @Override // com.google.android.gms.internal.ads.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.xk0 r24) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t9.c(com.google.android.gms.internal.ads.xk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void d(int i, long j10) {
        this.f11282l = j10;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        this.f11279h = 0;
        this.f11282l = -9223372036854775807L;
        this.f11283m = false;
    }
}
