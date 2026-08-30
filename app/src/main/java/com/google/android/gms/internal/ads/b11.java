package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class b11 implements f31 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b11 f4658b = new b11(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ b11 f4659c = new b11(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ b11 f4660d = new b11(2);
    public static final /* synthetic */ b11 e = new b11(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b11 f4661f = new b11(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ b11 f4662g = new b11(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4663a;

    public /* synthetic */ b11(int i) {
        this.f4663a = i;
    }

    @Override // com.google.android.gms.internal.ads.f31
    public final Object apply(Object obj) {
        switch (this.f4663a) {
            case 0:
                return null;
            case 1:
                return g11.a(5);
            case 2:
                ox1 ox1Var = (ox1) obj;
                int i = mw1.R;
                String str = ox1Var.f9261a;
                String str2 = ox1Var.f9262b;
                return p.a.o(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, ": ", str2);
            case 3:
                n2 n2Var = (n2) obj;
                n2Var.getClass();
                return n2Var.getClass().getSimpleName();
            case 4:
                return d51.u(ed1.C(((xx1) obj).n().f13338b, f4662g));
            default:
                zy1 zy1Var = zy1.f13336d;
                return Integer.valueOf(((hi) obj).f6821c);
        }
    }
}
