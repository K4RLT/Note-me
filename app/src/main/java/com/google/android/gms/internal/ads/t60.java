package com.google.android.gms.internal.ads;
import g9.y1;

/* loaded from: classes.dex */
public final /* synthetic */ class t60 implements n80 {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f11259u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y1 f11260v;

    public /* synthetic */ t60(int i, y1 y1Var) {
        this.f11259u = i;
        this.f11260v = y1Var;
    }

    @Override // com.google.android.gms.internal.ads.n80, com.google.android.gms.internal.ads.ie0
    /* renamed from: l */
    public final /* synthetic */ void mo205l(Object obj) {
        switch (this.f11259u) {
            case 0:
                ((v60) obj).x(this.f11260v);
                return;
            default:
                ((w60) obj).F(this.f11260v);
                return;
        }
    }
}
