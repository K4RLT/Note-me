package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class m60 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8268a;

    /* renamed from: b, reason: collision with root package name */
    public final k60 f8269b;

    public /* synthetic */ m60(k60 k60Var, int i) {
        this.f8268a = i;
        this.f8269b = k60Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final Object zzb() {
        switch (this.f8268a) {
            case 0:
                return (Bundle) this.f8269b.f7668c;
            case 1:
                return (xp0) this.f8269b.f7669d;
            default:
                return this.f8269b.a();
        }
    }
}
