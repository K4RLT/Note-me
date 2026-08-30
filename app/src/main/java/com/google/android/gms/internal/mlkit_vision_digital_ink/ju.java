package com.google.android.gms.internal.mlkit_vision_digital_ink;
import ra.e;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class ju implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14531a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fs f14532b;

    public /* synthetic */ ju(com.google.android.gms.internal.ads.hb hbVar, tr trVar, fs fsVar) {
        this.f14532b = fsVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        int i = this.f14531a;
        fs fsVar = this.f14532b;
        switch (i) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    cx.g("%s: Failed to remove pending version for group: '%s'; account: '%s'", "FileGroupManager", fsVar.w(), fsVar.v());
                    return n5.l(new IOException("Failed to remove pending group: ".concat(String.valueOf(fsVar.w()))));
                }
                int i10 = jr.f14529v;
                e eVar = new e(21, false);
                eVar.f24675v = vq.CUSTOM_FILEGROUP_VALIDATION_FAILED;
                eVar.f24676w = "CUSTOM_FILEGROUP_VALIDATION_FAILED";
                return n5.l(eVar.C());
            default:
                gs gsVar = (gs) obj;
                if (gsVar == null) {
                    gsVar = gs.t();
                }
                if (gsVar.v()) {
                    return va.f15125v;
                }
                cx.b("%s: Trying to add group %s that requires activation %s.", "FileGroupManager", fsVar.w(), fsVar.x());
                throw new Exception();
        }
    }

    public /* synthetic */ ju(fs fsVar) {
        this.f14532b = fsVar;
    }
}
