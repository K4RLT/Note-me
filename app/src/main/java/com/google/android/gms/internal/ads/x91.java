package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class x91 {

    /* renamed from: c, reason: collision with root package name */
    public static final x91 f12504c;

    /* renamed from: d, reason: collision with root package name */
    public static final x91 f12505d;
    public static final x91 e;

    /* renamed from: f, reason: collision with root package name */
    public static final x91 f12506f;

    /* renamed from: g, reason: collision with root package name */
    public static final x91 f12507g;

    /* renamed from: h, reason: collision with root package name */
    public static final x91 f12508h;
    public static final x91 i;

    /* renamed from: j, reason: collision with root package name */
    public static final x91 f12509j;

    /* renamed from: k, reason: collision with root package name */
    public static final x91 f12510k;

    /* renamed from: l, reason: collision with root package name */
    public static final x91 f12511l;

    /* renamed from: m, reason: collision with root package name */
    public static final x91 f12512m;

    /* renamed from: n, reason: collision with root package name */
    public static final x91 f12513n;

    /* renamed from: o, reason: collision with root package name */
    public static final x91 f12514o;

    /* renamed from: p, reason: collision with root package name */
    public static final x91 f12515p;

    /* renamed from: q, reason: collision with root package name */
    public static final x91 f12516q;

    /* renamed from: r, reason: collision with root package name */
    public static final x91 f12517r;

    /* renamed from: s, reason: collision with root package name */
    public static final x91 f12518s;

    /* renamed from: t, reason: collision with root package name */
    public static final x91 f12519t;

    /* renamed from: u, reason: collision with root package name */
    public static final x91 f12520u;

    /* renamed from: v, reason: collision with root package name */
    public static final x91 f12521v;

    /* renamed from: w, reason: collision with root package name */
    public static final x91 f12522w;

    /* renamed from: x, reason: collision with root package name */
    public static final x91 f12523x;

    /* renamed from: y, reason: collision with root package name */
    public static final x91 f12524y;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12525a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12526b;

    static {
        int i10 = 0;
        f12504c = new x91("UNKNOWN_PREFIX", i10);
        f12505d = new x91("TINK", i10);
        e = new x91("LEGACY", i10);
        f12506f = new x91("RAW", i10);
        f12507g = new x91("CRUNCHY", i10);
        f12508h = new x91("WITH_ID_REQUIREMENT", i10);
        int i11 = 1;
        i = new x91("TINK", i11);
        f12509j = new x91("CRUNCHY", i11);
        f12510k = new x91("NO_PREFIX", i11);
        int i12 = 2;
        f12511l = new x91("ASSUME_AES_GCM", i12);
        f12512m = new x91("ASSUME_XCHACHA20POLY1305", i12);
        f12513n = new x91("ASSUME_CHACHA20POLY1305", i12);
        f12514o = new x91("ASSUME_AES_CTR_HMAC", i12);
        f12515p = new x91("ASSUME_AES_EAX", i12);
        f12516q = new x91("ASSUME_AES_GCM_SIV", i12);
        int i13 = 3;
        f12517r = new x91("TINK", i13);
        f12518s = new x91("CRUNCHY", i13);
        f12519t = new x91("LEGACY", i13);
        f12520u = new x91("NO_PREFIX", i13);
        int i14 = 4;
        f12521v = new x91("TINK", i14);
        f12522w = new x91("CRUNCHY", i14);
        f12523x = new x91("LEGACY", i14);
        f12524y = new x91("NO_PREFIX", i14);
    }

    public /* synthetic */ x91(String str, int i10) {
        this.f12525a = i10;
        this.f12526b = str;
    }

    public String toString() {
        switch (this.f12525a) {
            case 0:
                return this.f12526b;
            case 1:
                return this.f12526b;
            case 2:
                return this.f12526b;
            case 3:
                return this.f12526b;
            case 4:
                return this.f12526b;
            default:
                return super.toString();
        }
    }
}
