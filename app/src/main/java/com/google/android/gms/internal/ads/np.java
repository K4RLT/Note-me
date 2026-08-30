package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class np implements mp {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f8795u;

    /* renamed from: v, reason: collision with root package name */
    public final nf0 f8796v;

    public /* synthetic */ np(nf0 nf0Var, int i) {
        this.f8795u = i;
        this.f8796v = nf0Var;
    }

    @Override // com.google.android.gms.internal.ads.mp
    public final void d(Object obj, Map map) {
        switch (this.f8795u) {
            case 0:
                if (map != null && map.containsKey("persistentData") && !TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
                    nf0 nf0Var = this.f8796v;
                    String str = (String) map.get("persistentData");
                    synchronized (nf0Var) {
                        nf0Var.f8709x = str;
                        f9.k.C.f16817h.g().g(nf0Var.f8709x);
                    }
                    return;
                }
                return;
            default:
                if (map != null && map.containsKey("extras")) {
                    long j10 = Long.MAX_VALUE;
                    if (map.containsKey("expires")) {
                        try {
                            j10 = Long.parseLong((String) map.get("expires"));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    nf0 nf0Var2 = this.f8796v;
                    String str2 = (String) map.get("extras");
                    synchronized (nf0Var2) {
                        nf0Var2.f8700o = str2;
                        nf0Var2.f8702q = j10;
                        nf0Var2.m();
                    }
                    return;
                }
                return;
        }
    }
}
