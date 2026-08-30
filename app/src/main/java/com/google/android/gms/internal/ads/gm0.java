package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class gm0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6432a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f6433b;

    public /* synthetic */ gm0(int i, Integer num) {
        this.f6432a = i;
        this.f6433b = num;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final /* bridge */ /* synthetic */ void l(Object obj) {
        switch (this.f6432a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Integer num = this.f6433b;
                if (num != null) {
                    bundle.putInt("aos", num.intValue());
                    return;
                }
                return;
            default:
                Bundle bundle2 = (Bundle) obj;
                Integer num2 = this.f6433b;
                if (num2 != null) {
                    bundle2.putInt("dspct", Math.min(num2.intValue(), 20));
                    return;
                }
                return;
        }
    }
}
