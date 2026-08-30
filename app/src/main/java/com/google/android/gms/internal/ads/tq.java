package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class tq implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11413u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ uq f11414v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f11415w;

    public /* synthetic */ tq(uq uqVar, String str, int i) {
        this.f11413u = i;
        this.f11414v = uqVar;
        this.f11415w = str;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f11413u) {
            case 0:
                h00 h00Var = this.f11414v.f11699u;
                if (h00Var != null) {
                    h00Var.loadData(this.f11415w, "text/html", "UTF-8");
                    return;
                }
                return;
            default:
                h00 h00Var2 = this.f11414v.f11699u;
                if (h00Var2 != null) {
                    h00Var2.o(this.f11415w);
                    return;
                }
                return;
        }
    }
}
