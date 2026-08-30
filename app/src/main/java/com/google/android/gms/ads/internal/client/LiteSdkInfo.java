package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.vr;
import g9.b1;
import g9.l2;

/* loaded from: classes.dex */
public class LiteSdkInfo extends b1 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // g9.c1
    public vr getAdapterCreator() {
        return new tr();
    }

    @Override // g9.c1
    public l2 getLiteSdkVersion() {
        return new l2("25.4.0", ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION);
    }
}
