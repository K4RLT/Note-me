package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        b bVar = new b("internal.platform", 4);
        bVar.f13785v.put("getVersion", new b("getVersion", 0));
        return bVar;
    }
}
