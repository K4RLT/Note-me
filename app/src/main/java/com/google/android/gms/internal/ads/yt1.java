package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class yt1 extends px1 {

    /* renamed from: c, reason: collision with root package name */
    public final ah f12968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt1(zt1 zt1Var, uh uhVar) {
        super(uhVar);
        Objects.requireNonNull(zt1Var);
        this.f12968c = new ah();
    }

    @Override // com.google.android.gms.internal.ads.px1, com.google.android.gms.internal.ads.uh
    public final qg d(int i, qg qgVar, boolean z3) {
        uh uhVar = this.f9656b;
        qg d2 = uhVar.d(i, qgVar, z3);
        if (uhVar.b(d2.f9841c, this.f12968c, 0L).b()) {
            Object obj = qgVar.f9839a;
            Object obj2 = qgVar.f9840b;
            int i10 = qgVar.f9841c;
            long j10 = qgVar.f9842d;
            eu euVar = eu.f5807b;
            d2.a(obj, obj2, i10, j10, true);
            return d2;
        }
        d2.e = true;
        return d2;
    }
}
