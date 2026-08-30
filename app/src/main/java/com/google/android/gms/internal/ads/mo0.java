package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class mo0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8388u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ no0 f8389v;

    public /* synthetic */ mo0(no0 no0Var, int i) {
        this.f8388u = i;
        this.f8389v = no0Var;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f8388u) {
            case 0:
                no0 no0Var = this.f8389v;
                no0Var.f8785u.b().execute(new mo0(no0Var, 1));
                return;
            default:
                this.f8389v.v4(5);
                return;
        }
    }
}
