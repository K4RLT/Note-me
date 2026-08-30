package com.google.android.gms.internal.ads;
import g9.f3;
import g9.r;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zl0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13205a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13206b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13207c;

    public /* synthetic */ zl0(int i, Object obj, boolean z3) {
        this.f13205a = i;
        this.f13206b = obj;
        this.f13207c = z3;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        switch (this.f13205a) {
            case 0:
                String str = (String) this.f13206b;
                Bundle bundle = (Bundle) obj;
                if (str != null) {
                    Bundle d2 = b80.d("pii", bundle);
                    d2.putString("afai", str);
                    d2.putBoolean("is_afai_lat", this.f13207c);
                    return;
                }
                return;
            case 1:
                Bundle bundle2 = (Bundle) obj;
                bundle2.putString("gct", (String) this.f13206b);
                if (this.f13207c) {
                    bundle2.putString("de", "1");
                    return;
                }
                return;
            default:
                Bundle bundle3 = (Bundle) obj;
                if (((Boolean) r.e.f17698c.a(sl.f10922r6)).booleanValue()) {
                    bundle3.putBoolean("app_switched", this.f13207c);
                }
                f3 f3Var = (f3) this.f13206b;
                if (f3Var != null) {
                    int i = f3Var.f17635u;
                    if (i == 1) {
                        bundle3.putString("avo", "p");
                        return;
                    } else {
                        if (i == 2) {
                            bundle3.putString("avo", "l");
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }
}
