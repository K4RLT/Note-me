package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class zz implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13340u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b00 f13341v;

    public /* synthetic */ zz(b00 b00Var, int i) {
        this.f13340u = i;
        this.f13341v = b00Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f13340u) {
            case 0:
                b00 b00Var = this.f13341v;
                ly lyVar = b00Var.f4649y;
                if (lyVar != null) {
                    if (!b00Var.f4650z) {
                        lyVar.k();
                        b00Var.f4650z = true;
                    }
                    b00Var.f4649y.f();
                    return;
                }
                return;
            case 1:
                ly lyVar2 = this.f13341v.f4649y;
                if (lyVar2 != null) {
                    lyVar2.g();
                    return;
                }
                return;
            default:
                ly lyVar3 = this.f13341v.f4649y;
                if (lyVar3 != null) {
                    lyVar3.e();
                    return;
                }
                return;
        }
    }
}
