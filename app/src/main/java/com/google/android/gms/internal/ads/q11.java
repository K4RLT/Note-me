package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class q11 implements l11 {

    /* renamed from: a, reason: collision with root package name */
    public final u01 f9704a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f9705b;

    /* renamed from: c, reason: collision with root package name */
    public final h21 f9706c;

    public q11(u01 u01Var, ExecutorService executorService, h21 h21Var) {
        this.f9704a = u01Var;
        this.f9705b = executorService;
        this.f9706c = h21Var;
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final ac.b a() {
        h91 E = ed1.E(new p11(this, 0), this.f9705b);
        this.f9706c.e(15314, E);
        return E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.k11
    public final ac.b b(vy0 vy0Var, byte[] bArr) {
        h91 E = ed1.E(new h60(this, vy0Var, bArr, 3), this.f9705b);
        this.f9706c.e(15305, E);
        return E;
    }

    @Override // com.google.android.gms.internal.ads.k11
    public final ac.b c(vy0 vy0Var, byte[] bArr, byte[] bArr2) {
        h91 E = ed1.E(new vb0(this, vy0Var, bArr, bArr2, 7), this.f9705b);
        this.f9706c.e(15321, E);
        return E;
    }

    @Override // com.google.android.gms.internal.ads.k11
    public final ac.b zza() {
        return ed1.e(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.k11
    public final h91 zzb() {
        h91 E = ed1.E(new p11(this, 1), this.f9705b);
        this.f9706c.e(15302, E);
        return E;
    }
}
