package b8;

import java.util.List;

/* loaded from: classes.dex */
public final class m1 {
    public final String A;
    public final df.l B;

    /* renamed from: a, reason: collision with root package name */
    public final String f2382a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2383b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2384c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2385d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2386f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2387g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2388h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2389j;

    /* renamed from: k, reason: collision with root package name */
    public final String f2390k;

    /* renamed from: l, reason: collision with root package name */
    public final d2 f2391l;

    /* renamed from: m, reason: collision with root package name */
    public final String f2392m;

    /* renamed from: n, reason: collision with root package name */
    public final String f2393n;

    /* renamed from: o, reason: collision with root package name */
    public final int f2394o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2395p;

    /* renamed from: q, reason: collision with root package name */
    public final int f2396q;

    /* renamed from: r, reason: collision with root package name */
    public final df.l f2397r;

    /* renamed from: s, reason: collision with root package name */
    public final h4 f2398s;

    /* renamed from: t, reason: collision with root package name */
    public final float f2399t;

    /* renamed from: u, reason: collision with root package name */
    public final String f2400u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2401v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2402w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f2403x;

    /* renamed from: y, reason: collision with root package name */
    public final List f2404y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2405z;

    public m1(String str, int i, int i10, int i11, int i12, int i13, boolean z3, String str2, String str3, d2 d2Var, String str4, int i14, int i15, int i16, df.l lVar, h4 h4Var, float f10, String str5, int i17, List list, int i18, df.l lVar2, int i19) {
        String str6;
        int i20 = (i19 & 2) != 0 ? 1 : i;
        boolean z9 = (i19 & 4) != 0;
        boolean z10 = (i19 & 8) == 0;
        int i21 = (i19 & 32) != 0 ? 0 : i11;
        boolean z11 = (i19 & 256) != 0 ? true : z3;
        df.l lVar3 = (131072 & i19) != 0 ? null : lVar;
        h4 h4Var2 = (262144 & i19) != 0 ? null : h4Var;
        float f11 = (1048576 & i19) != 0 ? 0.35f : f10;
        String str7 = (2097152 & i19) == 0 ? str5 : null;
        boolean z12 = (4194304 & i19) == 0;
        int i22 = (8388608 & i19) != 0 ? -12632254 : i17;
        boolean z13 = (16777216 & i19) != 0;
        List list2 = (33554432 & i19) != 0 ? qe.s.f24023u : list;
        int i23 = (i19 & 67108864) == 0 ? i18 : 0;
        if ((i19 & 134217728) != 0) {
            str6 = "";
        } else {
            str6 = "scraply_tier_100";
        }
        this.f2382a = str;
        this.f2383b = i20;
        this.f2384c = z9;
        this.f2385d = z10;
        this.e = i10;
        this.f2386f = i21;
        this.f2387g = i12;
        this.f2388h = i13;
        this.i = z11;
        this.f2389j = str2;
        this.f2390k = str3;
        this.f2391l = d2Var;
        this.f2392m = str4;
        this.f2393n = "template";
        this.f2394o = i14;
        this.f2395p = i15;
        this.f2396q = i16;
        this.f2397r = lVar3;
        this.f2398s = h4Var2;
        this.f2399t = f11;
        this.f2400u = str7;
        this.f2401v = z12;
        this.f2402w = i22;
        this.f2403x = z13;
        this.f2404y = list2;
        this.f2405z = i23;
        this.A = str6;
        this.B = lVar2;
    }

    public final int a() {
        return this.f2396q;
    }

    public final int b() {
        return this.f2395p;
    }

    public final int c() {
        return this.f2394o;
    }

    public final String d() {
        return this.f2393n;
    }

    public final String e() {
        return this.f2382a + "@" + this.f2383b;
    }

    public final df.l f() {
        return this.B;
    }

    public final String g() {
        return this.A;
    }

    public final String h() {
        return this.f2400u;
    }

    public final String i() {
        return this.f2392m;
    }
}
