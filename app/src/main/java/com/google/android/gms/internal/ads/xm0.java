package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class xm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12591a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f12592b;

    public /* synthetic */ xm0(Boolean bool, int i) {
        this.f12591a = i;
        this.f12592b = bool;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void l(Object obj) {
        switch (this.f12591a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Boolean bool = this.f12592b;
                if (bool != null) {
                    bundle.putBoolean("hw_accel", bool.booleanValue());
                    return;
                }
                return;
            default:
                Bundle bundle2 = (Bundle) obj;
                Boolean bool2 = this.f12592b;
                if (bool2 == null) {
                    bundle2.putInt("lft", -1);
                    return;
                } else if (bool2.booleanValue()) {
                    bundle2.putInt("lft", 1);
                    return;
                } else {
                    bundle2.putInt("lft", 0);
                    return;
                }
        }
    }
}
