package com.google.android.gms.internal.ads;
import ac.b;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class c50 implements rj0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f5003a;

    public c50(z40 z40Var) {
        this.f5003a = Collections.singletonList(ed1.e(z40Var));
    }

    @Override // com.google.android.gms.internal.ads.rj0
    public final void m() {
        Iterator it = this.f5003a.iterator();
        while (it.hasNext()) {
            ed1.i0((ac.b) it.next(), new fp(25), o81.f9033u);
        }
    }

    public c50(List list) {
        this.f5003a = list;
    }
}
