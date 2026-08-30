package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class fr implements rq, er {

    /* renamed from: u, reason: collision with root package name */
    public final er f6151u;

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f6152v = new HashSet();

    public fr(uq uqVar) {
        this.f6151u = uqVar;
    }

    @Override // com.google.android.gms.internal.ads.er
    public final void e(String str, mp mpVar) {
        this.f6151u.e(str, mpVar);
        this.f6152v.remove(new AbstractMap.SimpleEntry(str, mpVar));
    }

    @Override // com.google.android.gms.internal.ads.er
    public final void l(String str, mp mpVar) {
        this.f6151u.l(str, mpVar);
        this.f6152v.add(new AbstractMap.SimpleEntry(str, mpVar));
    }

    @Override // com.google.android.gms.internal.ads.rq, com.google.android.gms.internal.ads.vq
    public final void o(String str) {
        this.f6151u.o(str);
    }
}
