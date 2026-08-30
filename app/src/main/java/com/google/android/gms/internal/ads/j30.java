package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class j30 implements sr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7307a;

    /* renamed from: b, reason: collision with root package name */
    public final g50 f7308b;

    /* renamed from: c, reason: collision with root package name */
    public final wr1 f7309c;

    public j30(rr1 rr1Var, g50 g50Var) {
        this.f7307a = 2;
        this.f7309c = rr1Var;
        this.f7308b = g50Var;
    }

    @Override // com.google.android.gms.internal.ads.wr1
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f7307a) {
            case 0:
                return new i30(this.f7308b.a(), ((v10) this.f7309c).zzb());
            case 1:
                return new h90(this.f7308b.a(), (xs0) this.f7309c.zzb());
            default:
                return new d90((Context) this.f7309c.zzb(), new HashSet(), this.f7308b.a());
        }
    }

    public /* synthetic */ j30(g50 g50Var, wr1 wr1Var, int i) {
        this.f7307a = i;
        this.f7308b = g50Var;
        this.f7309c = wr1Var;
    }
}
