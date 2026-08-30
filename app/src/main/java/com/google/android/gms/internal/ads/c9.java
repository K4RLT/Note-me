package com.google.android.gms.internal.ads;
import c9.c;

/* loaded from: classes.dex */
public final class c9 implements j9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5036a;

    /* renamed from: b, reason: collision with root package name */
    public final tk0 f5037b;

    /* renamed from: c, reason: collision with root package name */
    public final xk0 f5038c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5039d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5040f;

    /* renamed from: g, reason: collision with root package name */
    public String f5041g;

    /* renamed from: h, reason: collision with root package name */
    public i3 f5042h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f5043j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5044k;

    /* renamed from: l, reason: collision with root package name */
    public long f5045l;

    /* renamed from: m, reason: collision with root package name */
    public mw1 f5046m;

    /* renamed from: n, reason: collision with root package name */
    public int f5047n;

    /* renamed from: o, reason: collision with root package name */
    public long f5048o;

    public c9(String str, int i, int i10, String str2) {
        this.f5036a = i10;
        switch (i10) {
            case 1:
                tk0 tk0Var = new tk0(new byte[16], 16);
                this.f5037b = tk0Var;
                this.f5038c = new xk0(tk0Var.f11365a);
                this.i = 0;
                this.f5043j = 0;
                this.f5044k = false;
                this.f5048o = -9223372036854775807L;
                this.f5039d = str;
                this.e = i;
                this.f5040f = str2;
                return;
            default:
                tk0 tk0Var2 = new tk0(new byte[128], 128);
                this.f5037b = tk0Var2;
                this.f5038c = new xk0(tk0Var2.f11365a);
                this.i = 0;
                this.f5048o = -9223372036854775807L;
                this.f5039d = str;
                this.e = i;
                this.f5040f = str2;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(p2 p2Var, fa faVar) {
        switch (this.f5036a) {
            case 0:
                faVar.a();
                faVar.b();
                this.f5041g = faVar.e;
                faVar.b();
                this.f5042h = p2Var.A(faVar.f5998d, 1);
                return;
            default:
                faVar.a();
                faVar.b();
                this.f5041g = faVar.e;
                faVar.b();
                this.f5042h = p2Var.A(faVar.f5998d, 1);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03ab A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0121  */
    @Override // com.google.android.gms.internal.ads.j9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(com.google.android.gms.internal.ads.xk0 r25) {
        /*
            Method dump skipped, instructions count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c(com.google.android.gms.internal.ads.xk0):void");
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void d(int i, long j10) {
        switch (this.f5036a) {
            case 0:
                this.f5048o = j10;
                return;
            default:
                this.f5048o = j10;
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        switch (this.f5036a) {
            case 0:
                this.i = 0;
                this.f5043j = 0;
                this.f5044k = false;
                this.f5048o = -9223372036854775807L;
                return;
            default:
                this.i = 0;
                this.f5043j = 0;
                this.f5044k = false;
                this.f5048o = -9223372036854775807L;
                return;
        }
    }
}
