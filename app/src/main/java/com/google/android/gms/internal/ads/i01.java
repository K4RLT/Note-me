package com.google.android.gms.internal.ads;
import ac.b;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class i01 implements wy0 {

    /* renamed from: a, reason: collision with root package name */
    public final pr1 f6949a;

    /* renamed from: b, reason: collision with root package name */
    public final pr1 f6950b;

    /* renamed from: c, reason: collision with root package name */
    public final pr1 f6951c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6952d;
    public final long e;

    public i01(pr1 pr1Var, pr1 pr1Var2, pr1 pr1Var3, boolean z3, long j10) {
        this.f6949a = pr1Var;
        this.f6950b = pr1Var2;
        this.f6951c = pr1Var3;
        this.f6952d = z3;
        this.e = j10;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final b a(Context context, View view, Activity activity) {
        return ((w01) this.f6950b.zzb()).a(context, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final void b(InputEvent inputEvent) {
        ((w01) this.f6950b.zzb()).b(inputEvent);
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final b c(Context context) {
        return ((w01) this.f6950b.zzb()).c(context);
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final b d(Context context, String str, View view) {
        return ((w01) this.f6950b.zzb()).d(context, str, view);
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int e() {
        return ((w01) this.f6950b.zzb()).e();
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final String zza() {
        return ((w01) this.f6950b.zzb()).zza();
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final b zzb() {
        boolean z3 = this.f6952d;
        o81 o81Var = o81.f9033u;
        if (z3) {
            final int i = 1;
            b81 c02 = ed1.c0(ed1.S(q81.t(((p01) this.f6949a.zzb()).a()), Throwable.class, i6.f7017v, o81Var), new j81(this) { // from class: com.google.android.gms.internal.ads.g01

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i01 f6237b;

                {
                    this.f6237b = this;
                }

                @Override // com.google.android.gms.internal.ads.j81
                public final /* synthetic */ b l(Object obj) {
                    switch (i) {
                        case 0:
                            return ((w01) this.f6237b.f6950b.zzb()).zzb();
                        case 1:
                            return ((k11) this.f6237b.f6951c.zzb()).zza();
                        default:
                            return ((w01) this.f6237b.f6950b.zzb()).zzb();
                    }
                }
            }, o81Var);
            final int i10 = 2;
            return ed1.c0(c02, new j81(this) { // from class: com.google.android.gms.internal.ads.g01

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i01 f6237b;

                {
                    this.f6237b = this;
                }

                @Override // com.google.android.gms.internal.ads.j81
                public final /* synthetic */ b l(Object obj) {
                    switch (i10) {
                        case 0:
                            return ((w01) this.f6237b.f6950b.zzb()).zzb();
                        case 1:
                            return ((k11) this.f6237b.f6951c.zzb()).zza();
                        default:
                            return ((w01) this.f6237b.f6950b.zzb()).zzb();
                    }
                }
            }, o81Var);
        }
        final int i11 = 0;
        b81 c03 = ed1.c0(ed1.S(q81.t(((k11) this.f6951c.zzb()).zza()), Throwable.class, i6.f7018w, o81Var), new j81(this) { // from class: com.google.android.gms.internal.ads.g01

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i01 f6237b;

            {
                this.f6237b = this;
            }

            @Override // com.google.android.gms.internal.ads.j81
            public final /* synthetic */ b l(Object obj) {
                switch (i11) {
                    case 0:
                        return ((w01) this.f6237b.f6950b.zzb()).zzb();
                    case 1:
                        return ((k11) this.f6237b.f6951c.zzb()).zza();
                    default:
                        return ((w01) this.f6237b.f6950b.zzb()).zzb();
                }
            }
        }, o81Var);
        c03.a(new qu0(4, this), o81Var);
        return c03;
    }
}
