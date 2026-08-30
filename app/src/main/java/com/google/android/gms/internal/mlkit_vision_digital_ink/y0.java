package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.net.Uri;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.consent_sdk.c f15267b;

    public /* synthetic */ y0(com.google.android.gms.internal.consent_sdk.c cVar, int i) {
        this.f15266a = i;
        this.f15267b = cVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        ya yaVar;
        switch (this.f15266a) {
            case 0:
                com.google.android.gms.internal.consent_sdk.c cVar = this.f15267b;
                Uri uri = (Uri) obj;
                Uri build = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".bak")).build();
                try {
                    i iVar = (i) cVar.f13375z;
                    if (iVar.g(build)) {
                        iVar.e(build, uri);
                    }
                    return va.f15125v;
                } catch (IOException e) {
                    return n5.l(e);
                }
            default:
                com.google.android.gms.internal.consent_sdk.c cVar2 = this.f15267b;
                synchronized (cVar2.B) {
                    yaVar = (ya) cVar2.D;
                }
                return yaVar;
        }
    }
}
