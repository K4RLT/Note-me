package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14995a;

    public /* synthetic */ t0(int i) {
        this.f14995a = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        switch (this.f14995a) {
            case 0:
                return n5.m("");
            case 1:
                cx.j((IOException) obj, "%s: IOException while adding group for download", "MobileDataDownload");
                return n5.m(Boolean.FALSE);
            case 2:
                return n5.m(ce.f14159u);
            case 3:
                if (!((Boolean) obj).booleanValue()) {
                    return n5.l(new IOException("Failed to commit new group metadata to disk."));
                }
                return va.f15125v;
            case 4:
                int i = jr.f14529v;
                ra.e eVar = new ra.e(21, false);
                eVar.f24675v = vq.UNABLE_TO_UPDATE_GROUP_METADATA_ERROR;
                eVar.f24677x = (IOException) obj;
                return n5.l(eVar.C());
            case 5:
                return va.f15125v;
            case 6:
                ((Boolean) obj).getClass();
                return va.f15125v;
            default:
                return n5.m(((os) obj).v());
        }
    }
}
