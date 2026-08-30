package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public final class aa0 implements mp {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f4425u;

    /* renamed from: v, reason: collision with root package name */
    public final WeakReference f4426v;

    public /* synthetic */ aa0(ca0 ca0Var, int i) {
        this.f4425u = i;
        switch (i) {
            case 1:
                this.f4426v = new WeakReference(ca0Var);
                return;
            default:
                this.f4426v = new WeakReference(ca0Var);
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final void d(Object obj, Map map) {
        switch (this.f4425u) {
            case 0:
                ca0 ca0Var = (ca0) this.f4426v.get();
                if (ca0Var != null) {
                    e90 e90Var = ca0Var.C;
                    if ("_ac".equals((String) map.get("eventName"))) {
                        ca0Var.B.L();
                        if (((Boolean) g9.r.e.f17698c.a(sl.f10750gc)).booleanValue()) {
                            e90Var.M();
                            if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                                e90Var.Q();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ca0 ca0Var2 = (ca0) this.f4426v.get();
                if (ca0Var2 != null) {
                    e90 e90Var2 = ca0Var2.C;
                    ca0Var2.B.L();
                    if (((Boolean) g9.r.e.f17698c.a(sl.f10750gc)).booleanValue()) {
                        e90Var2.M();
                        if (!TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                            e90Var2.Q();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
