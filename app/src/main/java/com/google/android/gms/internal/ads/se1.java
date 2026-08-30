package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class se1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ne1 f10599a;

    /* renamed from: b, reason: collision with root package name */
    public static final ne1 f10600b;

    /* renamed from: c, reason: collision with root package name */
    public static final ie1 f10601c;

    static {
        me1 me1Var = me1.f8334f;
        me1 me1Var2 = me1.f8333d;
        ja1 ja1Var = ja1.G;
        try {
            na1 na1Var = new na1(3);
            na1Var.a(32);
            na1Var.d(16);
            na1Var.e = ja1Var;
            na1Var.f8632d = me1Var2;
            f10599a = na1Var.k();
            try {
                na1 na1Var2 = new na1(3);
                na1Var2.a(32);
                na1Var2.d(32);
                na1Var2.e = ja1Var;
                na1Var2.f8632d = me1Var2;
                na1Var2.k();
                try {
                    na1 na1Var3 = new na1(3);
                    na1Var3.a(64);
                    na1Var3.d(32);
                    na1Var3.e = ja1Var;
                    na1Var3.f8632d = me1Var;
                    na1Var3.k();
                    try {
                        na1 na1Var4 = new na1(3);
                        na1Var4.a(64);
                        na1Var4.d(64);
                        na1Var4.e = ja1Var;
                        na1Var4.f8632d = me1Var;
                        f10600b = na1Var4.k();
                        try {
                            hq0 hq0Var = new hq0(23);
                            hq0Var.p(32);
                            hq0Var.t(16);
                            hq0Var.f6874x = x91.f12517r;
                            f10601c = hq0Var.B();
                        } catch (Exception e) {
                            androidx.datastore.preferences.protobuf.s1.n(e);
                        }
                    } catch (Exception e8) {
                        androidx.datastore.preferences.protobuf.s1.n(e8);
                    }
                } catch (Exception e10) {
                    androidx.datastore.preferences.protobuf.s1.n(e10);
                }
            } catch (Exception e11) {
                androidx.datastore.preferences.protobuf.s1.n(e11);
            }
        } catch (Exception e12) {
            androidx.datastore.preferences.protobuf.s1.n(e12);
        }
    }
}
