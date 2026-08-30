package jb;

import c4.s;

/* loaded from: classes.dex */
public final class h extends com.google.android.gms.internal.play_billing.d {

    /* renamed from: v, reason: collision with root package name */
    public final s f19113v;

    /* renamed from: w, reason: collision with root package name */
    public final ib.h f19114w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f19115x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f19116y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ib.h hVar, String str) {
        super(1);
        this.f19116y = iVar;
        s sVar = new s("OnRequestInstallCallback");
        this.f19115x = iVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f19113v = sVar;
        this.f19114w = hVar;
    }
}
