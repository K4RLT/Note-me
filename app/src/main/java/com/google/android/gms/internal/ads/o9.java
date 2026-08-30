package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class o9 implements j9 {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f9035l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final zd1 f9036a;

    /* renamed from: b, reason: collision with root package name */
    public final xk0 f9037b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f9038c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final m9 f9039d;
    public final w9 e;

    /* renamed from: f, reason: collision with root package name */
    public n9 f9040f;

    /* renamed from: g, reason: collision with root package name */
    public long f9041g;

    /* renamed from: h, reason: collision with root package name */
    public String f9042h;
    public i3 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9043j;

    /* renamed from: k, reason: collision with root package name */
    public long f9044k;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, com.google.android.gms.internal.ads.m9] */
    public o9(zd1 zd1Var) {
        this.f9036a = zd1Var;
        ?? obj = new Object();
        obj.e = new byte[128];
        this.f9039d = obj;
        this.f9044k = -9223372036854775807L;
        this.e = new w9(178);
        this.f9037b = new xk0();
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(p2 p2Var, fa faVar) {
        faVar.a();
        faVar.b();
        this.f9042h = faVar.e;
        faVar.b();
        i3 A = p2Var.A(faVar.f5998d, 2);
        this.i = A;
        this.f9040f = new n9(A);
        this.f9036a.c(p2Var, faVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013c  */
    @Override // com.google.android.gms.internal.ads.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.xk0 r20) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o9.c(com.google.android.gms.internal.ads.xk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void d(int i, long j10) {
        this.f9044k = j10;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void n() {
        n9 n9Var = this.f9040f;
        n9Var.getClass();
        n9Var.b(0, this.f9041g, this.f9043j);
        n9 n9Var2 = this.f9040f;
        n9Var2.f8594b = false;
        n9Var2.f8595c = false;
        n9Var2.f8596d = false;
        n9Var2.e = -1;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        xy.a0(this.f9038c);
        m9 m9Var = this.f9039d;
        m9Var.f8278a = false;
        m9Var.f8280c = 0;
        m9Var.f8279b = 0;
        n9 n9Var = this.f9040f;
        if (n9Var != null) {
            n9Var.f8594b = false;
            n9Var.f8595c = false;
            n9Var.f8596d = false;
            n9Var.e = -1;
        }
        this.e.a();
        this.f9041g = 0L;
        this.f9044k = -9223372036854775807L;
    }
}
