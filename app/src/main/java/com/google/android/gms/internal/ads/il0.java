package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class il0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7162a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7163b;

    public /* synthetic */ il0(int i, boolean z3) {
        this.f7162a = i;
        this.f7163b = z3;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void l(Object obj) {
        String str;
        switch (this.f7162a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                if (true != this.f7163b) {
                    str = "0";
                } else {
                    str = "1";
                }
                bundle.putString("adid_p", str);
                return;
            case 1:
                ((Bundle) obj).putBoolean("ibrr", this.f7163b);
                return;
            case 2:
                ((Bundle) obj).putBoolean("is_gbid", this.f7163b);
                return;
            default:
                Bundle bundle2 = (Bundle) obj;
                if (this.f7163b) {
                    bundle2.putBoolean("sdk_prefetch", true);
                    return;
                }
                return;
        }
    }
}
