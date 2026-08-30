package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f9 implements j9 {

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f5973x = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5974a;

    /* renamed from: d, reason: collision with root package name */
    public final String f5977d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5978f;

    /* renamed from: g, reason: collision with root package name */
    public String f5979g;

    /* renamed from: h, reason: collision with root package name */
    public i3 f5980h;
    public i3 i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5984m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5985n;

    /* renamed from: q, reason: collision with root package name */
    public int f5988q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5989r;

    /* renamed from: t, reason: collision with root package name */
    public int f5991t;

    /* renamed from: v, reason: collision with root package name */
    public i3 f5993v;

    /* renamed from: w, reason: collision with root package name */
    public long f5994w;

    /* renamed from: b, reason: collision with root package name */
    public final tk0 f5975b = new tk0(new byte[7], 7);

    /* renamed from: c, reason: collision with root package name */
    public final xk0 f5976c = new xk0(Arrays.copyOf(f5973x, 10));

    /* renamed from: o, reason: collision with root package name */
    public int f5986o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f5987p = -1;

    /* renamed from: s, reason: collision with root package name */
    public long f5990s = -9223372036854775807L;

    /* renamed from: u, reason: collision with root package name */
    public long f5992u = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    public int f5981j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f5982k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f5983l = 256;

    public f9(String str, int i, String str2, boolean z3) {
        this.f5974a = z3;
        this.f5977d = str;
        this.e = i;
        this.f5978f = str2;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(p2 p2Var, fa faVar) {
        faVar.a();
        faVar.b();
        this.f5979g = faVar.e;
        faVar.b();
        i3 A = p2Var.A(faVar.f5998d, 1);
        this.f5980h = A;
        this.f5993v = A;
        if (this.f5974a) {
            faVar.a();
            faVar.b();
            i3 A2 = p2Var.A(faVar.f5998d, 5);
            this.i = A2;
            rv1 rv1Var = new rv1();
            faVar.b();
            rv1Var.f10296a = faVar.e;
            rv1Var.d(this.f5978f);
            rv1Var.e("application/id3");
            A2.e(new mw1(rv1Var));
            return;
        }
        this.i = new l2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0223, code lost:
    
        r19 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0317 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.xk0 r21) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f9.c(com.google.android.gms.internal.ads.xk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void d(int i, long j10) {
        this.f5992u = j10;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        this.f5992u = -9223372036854775807L;
        this.f5985n = false;
        this.f5981j = 0;
        this.f5982k = 0;
        this.f5983l = 256;
    }
}
