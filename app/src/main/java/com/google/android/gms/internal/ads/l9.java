package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class l9 implements j9 {

    /* renamed from: r, reason: collision with root package name */
    public static final double[] f7975r = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f7976a;

    /* renamed from: b, reason: collision with root package name */
    public i3 f7977b;

    /* renamed from: c, reason: collision with root package name */
    public final zd1 f7978c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7979d;
    public final xk0 e;

    /* renamed from: f, reason: collision with root package name */
    public final w9 f7980f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f7981g = new boolean[4];

    /* renamed from: h, reason: collision with root package name */
    public final k9 f7982h;
    public long i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7983j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7984k;

    /* renamed from: l, reason: collision with root package name */
    public long f7985l;

    /* renamed from: m, reason: collision with root package name */
    public long f7986m;

    /* renamed from: n, reason: collision with root package name */
    public long f7987n;

    /* renamed from: o, reason: collision with root package name */
    public long f7988o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7989p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7990q;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, com.google.android.gms.internal.ads.k9] */
    public l9(zd1 zd1Var, String str) {
        xk0 xk0Var;
        this.f7978c = zd1Var;
        this.f7979d = str;
        ?? obj = new Object();
        obj.f7687d = new byte[128];
        this.f7982h = obj;
        if (zd1Var != null) {
            this.f7980f = new w9(178);
            xk0Var = new xk0();
        } else {
            xk0Var = null;
            this.f7980f = null;
        }
        this.e = xk0Var;
        this.f7986m = -9223372036854775807L;
        this.f7988o = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(p2 p2Var, fa faVar) {
        faVar.a();
        faVar.b();
        this.f7976a = faVar.e;
        faVar.b();
        this.f7977b = p2Var.A(faVar.f5998d, 2);
        zd1 zd1Var = this.f7978c;
        if (zd1Var != null) {
            zd1Var.c(p2Var, faVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0114  */
    @Override // com.google.android.gms.internal.ads.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.xk0 r23) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l9.c(com.google.android.gms.internal.ads.xk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void d(int i, long j10) {
        this.f7986m = j10;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void n() {
        i3 i3Var = this.f7977b;
        i3Var.getClass();
        long j10 = this.f7988o;
        if (j10 != -9223372036854775807L) {
            boolean z3 = this.f7989p;
            i3Var.c(j10, z3 ? 1 : 0, (int) (this.i - this.f7987n), 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        xy.a0(this.f7981g);
        k9 k9Var = this.f7982h;
        k9Var.f7684a = false;
        k9Var.f7685b = 0;
        k9Var.f7686c = 0;
        w9 w9Var = this.f7980f;
        if (w9Var != null) {
            w9Var.a();
        }
        this.i = 0L;
        this.f7983j = false;
        this.f7986m = -9223372036854775807L;
        this.f7988o = -9223372036854775807L;
    }
}
