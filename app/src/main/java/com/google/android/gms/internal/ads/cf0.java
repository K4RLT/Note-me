package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class cf0 implements u80 {

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f5083u = new Bundle();

    @Override // com.google.android.gms.internal.ads.u80
    public final void H(String str) {
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final synchronized void o(String str) {
        this.f5083u.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final synchronized void p(String str, String str2) {
        this.f5083u.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.u80
    public final synchronized void t(String str) {
        this.f5083u.putInt(str, 2);
    }
}
