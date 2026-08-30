package com.google.android.gms.internal.ads;
import c4.i;
import g9.r;
import m.a;
import r.e;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class am extends m.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bm f4537a;

    public am(bm bmVar) {
        this.f4537a = bmVar;
    }

    @Override // m.a
    public final void e(int i, Bundle bundle) {
        bm bmVar = this.f4537a;
        bmVar.getClass();
        if (((Boolean) g9.r.e.f17698c.a(sl.f11029y5)).booleanValue() && bmVar.f4826x != null) {
            xx.f12651a.execute(new c4.i(bmVar, i, 2));
        }
    }
}
