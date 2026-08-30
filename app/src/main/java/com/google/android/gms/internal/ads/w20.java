package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class w20 implements u20 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12109a;

    /* renamed from: b, reason: collision with root package name */
    public final nf0 f12110b;

    public /* synthetic */ w20(nf0 nf0Var, int i) {
        this.f12109a = i;
        this.f12110b = nf0Var;
    }

    @Override // com.google.android.gms.internal.ads.u20
    public final void a(HashMap hashMap) {
        switch (this.f12109a) {
            case 0:
                String str = (String) hashMap.get("gesture");
                if (!TextUtils.isEmpty(str)) {
                    int hashCode = str.hashCode();
                    nf0 nf0Var = this.f12110b;
                    if (hashCode != 97520651) {
                        if (hashCode == 109399814 && str.equals("shake")) {
                            nf0Var.h(kf0.f7730v, true);
                            return;
                        }
                    } else if (str.equals("flick")) {
                        nf0Var.h(kf0.f7731w, true);
                        return;
                    }
                    nf0Var.h(kf0.f7729u, true);
                    return;
                }
                return;
            default:
                String str2 = (String) hashMap.get("test_mode_enabled");
                if (!TextUtils.isEmpty(str2)) {
                    this.f12110b.b(str2.equals("true"));
                    return;
                }
                return;
        }
    }
}
