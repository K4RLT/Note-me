package com.google.android.gms.internal.ads;
import ac.b;
import g5.q;

/* loaded from: classes.dex */
public final class h71 extends j71 {
    @Override // com.google.android.gms.internal.ads.j71
    public final /* synthetic */ void u(Object obj) {
        o((b) obj);
    }

    @Override // com.google.android.gms.internal.ads.j71
    public final Object v(Object obj, Throwable th) {
        j81 j81Var = (j81) obj;
        b l10 = j81Var.l(th);
        if (l10 != null) {
            return l10;
        }
        q.h(ay0.B("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", j81Var));
        return null;
    }
}
