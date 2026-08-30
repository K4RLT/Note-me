package com.google.android.gms.internal.ads;
import f9.k;
import g9.r;
import r.e;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class b30 implements u20 {
    @Override // com.google.android.gms.internal.ads.u20
    public final void a(HashMap hashMap) {
        if (((Boolean) g9.r.e.f17698c.a(sl.Ob)).booleanValue() && !hashMap.isEmpty()) {
            String str = (String) hashMap.get("is_topics_ad_personalization_allowed");
            if (!TextUtils.isEmpty(str)) {
                f9.k.C.f16817h.g().u(Boolean.parseBoolean(str));
            }
        }
    }
}
