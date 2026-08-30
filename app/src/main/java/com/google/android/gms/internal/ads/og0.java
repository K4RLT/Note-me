package com.google.android.gms.internal.ads;
import k9.l;
import k9.m;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class og0 extends zu {

    /* renamed from: u, reason: collision with root package name */
    public final yx f9117u;

    /* renamed from: v, reason: collision with root package name */
    public final dv f9118v;

    public og0(yx yxVar, dv dvVar) {
        this.f9117u = yxVar;
        this.f9118v = dvVar;
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void b3(m mVar) {
        mVar.getClass();
        this.f9117u.c(new l(mVar.f19711u, mVar.f19712v));
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void e2(ParcelFileDescriptor parcelFileDescriptor, dv dvVar) {
        this.f9117u.b(new wg0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), dvVar));
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void e3(ParcelFileDescriptor parcelFileDescriptor) {
        this.f9117u.b(new wg0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f9118v));
    }
}
