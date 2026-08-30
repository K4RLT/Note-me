package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ul0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11669a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11670b;

    public /* synthetic */ ul0(int i, ArrayList arrayList) {
        this.f11669a = i;
        this.f11670b = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        switch (this.f11669a) {
            case 0:
                ((Bundle) obj).putStringArrayList("ad_types", this.f11670b);
                return;
            default:
                Bundle bundle = (Bundle) obj;
                ArrayList arrayList = this.f11670b;
                if (arrayList != null) {
                    bundle.putStringArrayList("android_permissions", new ArrayList<>(arrayList));
                    return;
                }
                return;
        }
    }
}
