package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final /* synthetic */ class pt implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ or f14810b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tr f14811c;

    public /* synthetic */ pt(com.google.android.gms.internal.ads.hb hbVar, or orVar, tr trVar, int i) {
        this.f14809a = i;
        this.f14810b = orVar;
        this.f14811c = trVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        switch (this.f14809a) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    or orVar = this.f14810b;
                    String D = orVar.D();
                    tr trVar = this.f14811c;
                    cx.g("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", D, trVar.P());
                    com.google.android.gms.internal.ads.hb.x(trVar, orVar, 14);
                }
                return va.f15125v;
            default:
                or orVar2 = this.f14810b;
                String D2 = orVar2.D();
                tr trVar2 = this.f14811c;
                cx.b("%s: File couldn't be shared before download %s, filegroup %s", "FileGroupManager", D2, trVar2.P());
                com.google.android.gms.internal.ads.hb.x(trVar2, orVar2, ((fx) obj).f14344u);
                return va.f15125v;
        }
    }
}
