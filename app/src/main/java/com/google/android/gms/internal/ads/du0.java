package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class du0 extends gu0 {

    /* renamed from: x, reason: collision with root package name */
    public static final du0 f5522x = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.gu0
    public final boolean a() {
        Iterator it = Collections.unmodifiableCollection(eu0.f5810c.f5812b).iterator();
        while (it.hasNext()) {
            View view = (View) ((tt0) it.next()).f11439c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.gu0
    public final void b(boolean z3) {
        String str;
        Iterator it = Collections.unmodifiableCollection(eu0.f5810c.f5811a).iterator();
        while (it.hasNext()) {
            nu0 nu0Var = ((tt0) it.next()).f11440d;
            if (nu0Var.f8868b.get() != 0) {
                if (true != z3) {
                    str = "backgrounded";
                } else {
                    str = "foregrounded";
                }
                s6.A.C(nu0Var.c(), "setState", str, nu0Var.f8867a);
            }
        }
    }
}
