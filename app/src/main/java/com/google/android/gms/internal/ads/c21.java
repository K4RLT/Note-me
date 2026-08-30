package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c21 implements y11 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4972a = new ArrayList();

    @Override // com.google.android.gms.internal.ads.y11
    public final synchronized void c(HashMap hashMap, Context context, View view) {
        ArrayList arrayList = this.f4972a;
        hashMap.put("vst", new ArrayList(arrayList));
        arrayList.clear();
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void a(HashMap hashMap) {
    }

    @Override // com.google.android.gms.internal.ads.y11
    public final void b(HashMap hashMap) {
    }
}
