package ub;

import ib.h;

/* loaded from: classes.dex */
public final class e extends com.google.android.gms.internal.play_billing.d {

    /* renamed from: v, reason: collision with root package name */
    public final c7.a f27152v;

    /* renamed from: w, reason: collision with root package name */
    public final h f27153w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f27154x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, h hVar) {
        super(5);
        c7.a aVar = new c7.a("OnRequestInstallCallback", 10);
        this.f27154x = fVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.f27152v = aVar;
        this.f27153w = hVar;
    }
}
