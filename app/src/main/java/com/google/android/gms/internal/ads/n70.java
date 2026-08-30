package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* loaded from: classes.dex */
public final class n70 extends um1 implements dp {

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f8582w;

    public n70(Set set) {
        super(set);
        this.f8582w = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.dp
    public final synchronized void v(String str, Bundle bundle) {
        this.f8582w.putAll(bundle);
        P1(f70.B);
    }
}
