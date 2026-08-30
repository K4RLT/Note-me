package com.google.android.gms.internal.ads;
import s9.p;

/* loaded from: classes.dex */
public final /* synthetic */ class xq0 implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f12606u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f12607v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f12608w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f12609x;

    public /* synthetic */ xq0(int i, Object obj, boolean z3, boolean z9) {
        this.f12606u = i;
        this.f12609x = obj;
        this.f12607v = z3;
        this.f12608w = z9;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f12606u) {
            case 0:
                ((com.google.android.gms.internal.mlkit_vision_digital_ink.iw) ((is0) this.f12609x).f7206w).C(this.f12607v, this.f12608w);
                return;
            default:
                ((s9.p) this.f12609x).d(this.f12607v, this.f12608w);
                return;
        }
    }
}
