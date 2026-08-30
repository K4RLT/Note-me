package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class q91 implements s81, n80 {
    public static final q91 A;
    public static final q91 B;
    public static final q91 C;
    public static final q91 D;
    public static final q91 E;
    public static final q91 F;
    public static final q91 G;
    public static final q91 H;
    public static final q91 I;
    public static final q91 J;
    public static final q91 K;
    public static final q91 L;
    public static final q91 M;
    public static final q91 N;

    /* renamed from: w, reason: collision with root package name */
    public static final q91 f9787w;

    /* renamed from: x, reason: collision with root package name */
    public static final q91 f9788x;

    /* renamed from: y, reason: collision with root package name */
    public static final q91 f9789y;

    /* renamed from: z, reason: collision with root package name */
    public static final q91 f9790z;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f9791u;

    /* renamed from: v, reason: collision with root package name */
    public final String f9792v;

    static {
        int i = 0;
        f9787w = new q91("ENABLED", i);
        f9788x = new q91("DISABLED", i);
        f9789y = new q91("DESTROYED", i);
        int i10 = 1;
        f9790z = new q91("TINK", i10);
        A = new q91("CRUNCHY", i10);
        B = new q91("NO_PREFIX", i10);
        int i11 = 2;
        C = new q91("TINK", i11);
        D = new q91("CRUNCHY", i11);
        E = new q91("NO_PREFIX", i11);
        int i12 = 3;
        F = new q91("TINK", i12);
        G = new q91("NO_PREFIX", i12);
        int i13 = 4;
        H = new q91("SHA256", i13);
        I = new q91("SHA384", i13);
        J = new q91("SHA512", i13);
        int i14 = 5;
        K = new q91("TINK", i14);
        L = new q91("CRUNCHY", i14);
        M = new q91("LEGACY", i14);
        N = new q91("NO_PREFIX", i14);
    }

    public /* synthetic */ q91(String str, int i) {
        this.f9791u = i;
        this.f9792v = str;
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public /* synthetic */ void mo205l(Object obj) {
        ((u80) obj).o(this.f9792v);
    }

    @Override // com.google.android.gms.internal.ads.s81
    public void t(Throwable th) {
        f9.k.C.f16817h.e(this.f9792v, th);
    }

    public String toString() {
        switch (this.f9791u) {
            case 0:
                return this.f9792v;
            case 1:
                return this.f9792v;
            case 2:
                return this.f9792v;
            case 3:
                return this.f9792v;
            case 4:
                return this.f9792v;
            case 5:
                return this.f9792v;
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.s81
    /* renamed from: r */
    public void mo202r(Object obj) {
    }
}
