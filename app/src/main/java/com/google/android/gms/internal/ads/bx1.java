package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class bx1 implements fx1, zb0 {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ bx1 f4903u = new Object();

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ bx1 f4904v = new Object();

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ bx1 f4905w = new Object();

    @Override // com.google.android.gms.internal.ads.fx1, com.google.android.gms.internal.ads.zb0
    /* renamed from: l */
    public /* synthetic */ int mo213l(Object obj) {
        HashMap hashMap = gx1.f6499a;
        String str = ((ww1) obj).f12352a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zb0
    /* renamed from: l */
    public /* synthetic */ void mo213l(Object obj) {
        ((qy1) obj).getClass();
    }
}
