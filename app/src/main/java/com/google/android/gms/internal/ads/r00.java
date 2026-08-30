package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class r00 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10045u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s00 f10046v;

    public /* synthetic */ r00(s00 s00Var, int i) {
        this.f10045u = i;
        this.f10046v = s00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10045u) {
            case 0:
                s00.z(this.f10046v);
                return;
            default:
                this.f10046v.D();
                return;
        }
    }
}
