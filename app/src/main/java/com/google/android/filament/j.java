package com.google.android.filament;

import com.google.android.gms.internal.ads.fl;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.ij;
import com.google.android.gms.internal.ads.s00;
import com.google.android.gms.internal.ads.uk;
import com.google.android.gms.internal.ads.vk;

/* loaded from: classes.dex */
public final class j implements ij {

    /* renamed from: u, reason: collision with root package name */
    public boolean f4252u;

    /* renamed from: v, reason: collision with root package name */
    public int f4253v;

    @Override // com.google.android.gms.internal.ads.ij
    public void a(fl flVar) {
        int i = s00.f10415w0;
        uk A = vk.A();
        boolean z3 = ((vk) A.f4845v).z();
        boolean z9 = this.f4252u;
        if (z3 != z9) {
            A.b();
            ((vk) A.f4845v).B(z9);
        }
        int i10 = this.f4253v;
        A.b();
        ((vk) A.f4845v).C(i10);
        vk vkVar = (vk) A.c();
        flVar.b();
        ((gl) flVar.f4845v).I(vkVar);
    }
}
