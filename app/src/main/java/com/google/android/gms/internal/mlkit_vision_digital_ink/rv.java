package com.google.android.gms.internal.mlkit_vision_digital_ink;

/* loaded from: classes.dex */
public final /* synthetic */ class rv implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14936a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ls f14937b;

    public /* synthetic */ rv(ls lsVar, int i) {
        this.f14936a = i;
        this.f14937b = lsVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        int i = this.f14936a;
        vq vqVar = vq.SHARED_FILE_NOT_FOUND_ERROR;
        ls lsVar = this.f14937b;
        switch (i) {
            case 0:
                os osVar = (os) obj;
                if (osVar == null) {
                    cx.i("%s: getSharedFile called on file that doesn't exist! Key = %s", "SharedFileManager", lsVar);
                    return n5.l(new Exception());
                }
                return n5.m(osVar);
            case 1:
                cx.i("%s: Start download called on file that doesn't exist. Key = %s!", "SharedFileManager", lsVar);
                int i10 = jr.f14529v;
                ra.e eVar = new ra.e(21, false);
                eVar.f24675v = vqVar;
                eVar.f24677x = (vv) obj;
                return n5.l(eVar.C());
            case 2:
                if (!((Boolean) obj).booleanValue()) {
                    cx.i("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", lsVar);
                    return n5.m(Boolean.FALSE);
                }
                return n5.m(Boolean.TRUE);
            case 3:
                if (!((Boolean) obj).booleanValue()) {
                    cx.i("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", lsVar);
                    int i11 = jr.f14529v;
                    ra.e eVar2 = new ra.e(21, false);
                    eVar2.f24675v = vq.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
                    return n5.l(eVar2.C());
                }
                return va.f15125v;
            default:
                os osVar2 = (os) obj;
                if (osVar2 == null) {
                    cx.i("%s: Shared file not found, newFileKey = %s", "DownloaderCallbackImpl", lsVar);
                    int i12 = jr.f14529v;
                    ra.e eVar3 = new ra.e(21, false);
                    eVar3.f24675v = vqVar;
                    return n5.l(eVar3.C());
                }
                return n5.m(osVar2);
        }
    }
}
