package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d30 implements u20 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5297a;

    /* renamed from: b, reason: collision with root package name */
    public final k9.c0 f5298b = f9.k.C.f16817h.g();

    public d30(Context context) {
        this.f5297a = context;
    }

    @Override // com.google.android.gms.internal.ads.u20
    public final void a(HashMap hashMap) {
        String str;
        if (!hashMap.isEmpty() && (str = (String) hashMap.get("gad_idless")) != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            this.f5298b.s(parseBoolean);
            if (parseBoolean) {
                wa.f9.a(this.f5297a);
            }
        }
    }
}
