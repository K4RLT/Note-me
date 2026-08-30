package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tg extends wg {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11341h;

    public tg(dg dgVar, wd wdVar, int i) {
        super(dgVar, "NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", wdVar, i, 61);
        this.f11341h = dgVar.f5430o.f12863a;
    }

    @Override // com.google.android.gms.internal.ads.wg
    public final void a() {
        long longValue = ((Long) this.e.invoke(null, this.f12232a.f5418a, Boolean.valueOf(this.f11341h))).longValue();
        wd wdVar = this.f12235d;
        synchronized (wdVar) {
            wdVar.b();
            ((je) wdVar.f4845v).a0(longValue);
        }
    }
}
