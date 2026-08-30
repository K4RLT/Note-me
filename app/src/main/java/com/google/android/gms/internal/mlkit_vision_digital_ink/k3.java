package com.google.android.gms.internal.mlkit_vision_digital_ink;

import com.google.android.gms.internal.ads.j41;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class k3 extends i3 implements Serializable {

    /* renamed from: w, reason: collision with root package name */
    public final transient w3 f14542w;

    public k3() {
        w3 w3Var = new w3();
        pa.p(w3Var.isEmpty());
        this.f14542w = w3Var;
    }

    public final List c(String str) {
        Object obj = (Collection) this.f14542w.get(str);
        if (obj == null) {
            obj = new ArrayList(3);
        }
        List list = (List) obj;
        if (list instanceof RandomAccess) {
            return new j41(this, str, list, (j41) null);
        }
        return new j41(this, str, list, (j41) null);
    }
}
