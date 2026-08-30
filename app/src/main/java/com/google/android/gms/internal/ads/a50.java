package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class a50 implements b50 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4363a;

    public a50(Map map) {
        this.f4363a = map;
    }

    @Override // com.google.android.gms.internal.ads.b50
    public final di0 a(int i, String str) {
        return (di0) this.f4363a.get(str);
    }
}
