package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ur1 extends qr1 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11707b = 0;

    static {
        tr1.a(Collections.EMPTY_MAP);
    }

    public static to0 a(int i) {
        return new to0(i);
    }

    @Override // com.google.android.gms.internal.ads.wr1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        Map map = this.f9980a;
        LinkedHashMap d2 = gm1.d(map.size());
        for (Map.Entry entry : map.entrySet()) {
            d2.put(entry.getKey(), ((wr1) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(d2);
    }
}
