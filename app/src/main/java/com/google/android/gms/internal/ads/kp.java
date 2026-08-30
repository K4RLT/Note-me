package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class kp implements j81 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g30 f7832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7833c;

    public /* synthetic */ kp(g30 g30Var, String str, int i) {
        this.f7831a = i;
        this.f7832b = g30Var;
        this.f7833c = str;
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final ac.b l(Object obj) {
        int i = this.f7831a;
        String str = this.f7833c;
        g30 g30Var = this.f7832b;
        switch (i) {
            case 0:
                String str2 = (String) obj;
                hp hpVar = lp.f8076a;
                if (((Boolean) g9.r.e.f17698c.a(sl.f10986vb)).booleanValue() && g30Var != null && g30.b(str)) {
                    return g30Var.a(str2, g9.p.f17688g.e);
                }
                return ed1.e(str2);
            default:
                g30Var.e.f(new ac.a(g30Var, 12, (Throwable) obj));
                return ed1.e(str);
        }
    }
}
