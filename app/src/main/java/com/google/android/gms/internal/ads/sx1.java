package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class sx1 extends px1 {
    public static final Object e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f11191c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f11192d;

    public sx1(uh uhVar, Object obj, Object obj2) {
        super(uhVar);
        this.f11191c = obj;
        this.f11192d = obj2;
    }

    @Override // com.google.android.gms.internal.ads.px1, com.google.android.gms.internal.ads.uh
    public final ah b(int i, ah ahVar, long j10) {
        this.f9656b.b(i, ahVar, j10);
        if (Objects.equals(ahVar.f4498a, this.f11191c)) {
            ahVar.f4498a = ah.f4496m;
        }
        return ahVar;
    }

    @Override // com.google.android.gms.internal.ads.px1, com.google.android.gms.internal.ads.uh
    public final qg d(int i, qg qgVar, boolean z3) {
        this.f9656b.d(i, qgVar, z3);
        if (Objects.equals(qgVar.f9840b, this.f11192d) && z3) {
            qgVar.f9840b = e;
        }
        return qgVar;
    }

    @Override // com.google.android.gms.internal.ads.px1, com.google.android.gms.internal.ads.uh
    public final int e(Object obj) {
        Object obj2;
        if (e.equals(obj) && (obj2 = this.f11192d) != null) {
            obj = obj2;
        }
        return this.f9656b.e(obj);
    }

    @Override // com.google.android.gms.internal.ads.px1, com.google.android.gms.internal.ads.uh
    public final Object f(int i) {
        Object f10 = this.f9656b.f(i);
        if (Objects.equals(f10, this.f11192d)) {
            return e;
        }
        return f10;
    }
}
