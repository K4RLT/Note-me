package com.google.android.gms.internal.ads;
import ac.b;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class s11 implements k11 {

    /* renamed from: a, reason: collision with root package name */
    public final ly0 f10451a;

    /* renamed from: b, reason: collision with root package name */
    public final ly0 f10452b;

    /* renamed from: c, reason: collision with root package name */
    public final pr1 f10453c;

    /* renamed from: d, reason: collision with root package name */
    public final h21 f10454d;
    public final ExecutorService e;

    public s11(ly0 ly0Var, ly0 ly0Var2, pr1 pr1Var, ExecutorService executorService, h21 h21Var) {
        this.f10451a = ly0Var;
        this.f10452b = ly0Var2;
        this.f10453c = pr1Var;
        this.f10454d = h21Var;
        this.e = executorService;
    }

    @Override // com.google.android.gms.internal.ads.k11
    public final b b(vy0 vy0Var, byte[] bArr) {
        h91 a10 = this.f10452b.a(bArr);
        this.f10454d.e(20305, a10);
        return ed1.c0(q81.t(a10), new r11(this, vy0Var, 0), o81.f9033u);
    }

    @Override // com.google.android.gms.internal.ads.k11
    public final b c(vy0 vy0Var, byte[] bArr, byte[] bArr2) {
        h91 a10 = ((ly0) this.f10453c.zzb()).a(bArr);
        h21 h21Var = this.f10454d;
        h21Var.e(20307, a10);
        h91 a11 = this.f10452b.a(bArr2);
        h21Var.e(20305, a11);
        return ed1.c0(q81.t(new k81(d51.v(new b[]{a10, a11}), true)), new r11(this, vy0Var, 1), o81.f9033u);
    }

    @Override // com.google.android.gms.internal.ads.k11
    public final b zza() {
        return ed1.e(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.k11
    public final h91 zzb() {
        ly0 ly0Var = this.f10451a;
        ly0Var.getClass();
        h91 E = ed1.E(new bo0(4, ly0Var), ly0Var.f8186b);
        this.f10454d.e(20302, E);
        return E;
    }
}
