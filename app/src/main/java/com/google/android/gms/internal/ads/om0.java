package com.google.android.gms.internal.ads;
import ac.b;

import android.content.Context;

/* loaded from: classes.dex */
public final class om0 implements qn0 {

    /* renamed from: c, reason: collision with root package name */
    public static String f9164c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9165a;

    /* renamed from: b, reason: collision with root package name */
    public final wx f9166b;

    public om0(Context context, wx wxVar) {
        this.f9165a = 3;
        this.f9166b = wxVar;
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final ac.b zza() {
        switch (this.f9165a) {
            case 0:
                return this.f9166b.j(new kl(1));
            case 1:
                return this.f9166b.j(kl.f7795c);
            case 2:
                return this.f9166b.j(kl.f7796d);
            case 3:
                return this.f9166b.j(new kl(this));
            case 4:
                return this.f9166b.j(new kl(5));
            default:
                return this.f9166b.j(kl.e);
        }
    }

    @Override // com.google.android.gms.internal.ads.qn0
    public final int zzb() {
        switch (this.f9165a) {
            case 0:
                return 55;
            case 1:
                return 20;
            case 2:
                return 24;
            case 3:
                return 27;
            case 4:
                return 45;
            default:
                return 51;
        }
    }

    public /* synthetic */ om0(wx wxVar, int i) {
        this.f9165a = i;
        this.f9166b = wxVar;
    }
}
