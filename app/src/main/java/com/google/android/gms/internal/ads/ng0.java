package com.google.android.gms.internal.ads;
import k9.l;
import k9.m;

import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class ng0 extends zu {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ pg0 f8713u;

    public ng0(pg0 pg0Var) {
        this.f8713u = pg0Var;
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void b3(m mVar) {
        yx yxVar = this.f8713u.f9514u;
        mVar.getClass();
        yxVar.c(new l(mVar.f19711u, mVar.f19712v));
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void e2(ParcelFileDescriptor parcelFileDescriptor, dv dvVar) {
        this.f8713u.f9514u.b(new wg0(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), dvVar));
    }

    @Override // com.google.android.gms.internal.ads.av
    public final void e3(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        pg0 pg0Var = this.f8713u;
        pg0Var.f9514u.b(new wg0(autoCloseInputStream, pg0Var.f9518y));
    }
}
