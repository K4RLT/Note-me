package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b81 extends d81 {
    @Override // com.google.android.gms.internal.ads.d81
    public final /* synthetic */ void u(Object obj) {
        o((ac.b) obj);
    }

    @Override // com.google.android.gms.internal.ads.d81
    public final Object v(Object obj, Object obj2) {
        j81 j81Var = (j81) obj;
        ac.b l10 = j81Var.l(obj2);
        if (l10 != null) {
            return l10;
        }
        g5.q.h(ay0.B("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", j81Var));
        return null;
    }
}
