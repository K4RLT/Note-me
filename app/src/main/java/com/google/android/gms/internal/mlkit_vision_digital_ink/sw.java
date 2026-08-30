package com.google.android.gms.internal.mlkit_vision_digital_ink;

import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class sw implements ea {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14992a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jr f14993b;

    public /* synthetic */ sw(jr jrVar, int i) {
        this.f14992a = i;
        this.f14993b = jrVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_digital_ink.ea
    public final ya l(Object obj) {
        switch (this.f14992a) {
            case 0:
                this.f14993b.addSuppressed((IOException) obj);
                return va.f15125v;
            case 1:
                return n5.l(this.f14993b);
            case 2:
                this.f14993b.addSuppressed((IOException) obj);
                return va.f15125v;
            default:
                return n5.l(this.f14993b);
        }
    }
}
