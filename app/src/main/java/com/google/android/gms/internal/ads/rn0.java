package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class rn0 implements pn0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10254a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10255b;

    public rn0(int i, int i10) {
        this.f10254a = i;
        this.f10255b = i10;
    }

    @Override // com.google.android.gms.internal.ads.pn0
    public final void l(Object obj) {
        int i;
        Bundle bundle = (Bundle) obj;
        int i10 = this.f10254a;
        if (i10 != -1 && (i = this.f10255b) != -1) {
            bundle.putInt("sessions_without_flags", i10);
            bundle.putInt("crashes_without_flags", i);
            g9.p pVar = g9.p.f17688g;
            if (g9.r.e.f17698c.f9873j) {
                bundle.putBoolean("did_reset", true);
            }
        }
    }
}
