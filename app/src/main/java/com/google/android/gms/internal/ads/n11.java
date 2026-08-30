package com.google.android.gms.internal.ads;
import ac.b;

import java.io.File;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class n11 implements l11 {

    /* renamed from: a, reason: collision with root package name */
    public final ly0 f8512a;

    /* renamed from: b, reason: collision with root package name */
    public final ly0 f8513b;

    /* renamed from: c, reason: collision with root package name */
    public final ly0 f8514c;

    /* renamed from: d, reason: collision with root package name */
    public final ly0 f8515d;
    public final pr1 e;

    /* renamed from: f, reason: collision with root package name */
    public final pr1 f8516f;

    /* renamed from: g, reason: collision with root package name */
    public final File f8517g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f8518h;
    public final h21 i;

    public n11(ly0 ly0Var, ly0 ly0Var2, pr1 pr1Var, ly0 ly0Var3, ly0 ly0Var4, pr1 pr1Var2, File file, ExecutorService executorService, h21 h21Var) {
        this.f8512a = ly0Var;
        this.f8514c = ly0Var2;
        this.e = pr1Var;
        this.f8513b = ly0Var3;
        this.f8515d = ly0Var4;
        this.f8516f = pr1Var2;
        this.f8517g = file;
        this.f8518h = executorService;
        this.i = h21Var;
    }

    @Override // com.google.android.gms.internal.ads.l11
    public final b a() {
        ly0 ly0Var = this.f8512a;
        ly0Var.getClass();
        c81 d02 = ed1.d0(q81.t(ed1.E(new bo0(4, ly0Var), ly0Var.f8186b)), new cv(12, this), o81.f9033u);
        this.i.e(15314, d02);
        return d02;
    }

    @Override // com.google.android.gms.internal.ads.k11
    public final b b(vy0 vy0Var, byte[] bArr) {
        h91 a10 = this.f8515d.a(bArr);
        this.i.e(15305, a10);
        return ed1.c0(q81.t(a10), new m11(this, vy0Var, 0), o81.f9033u);
    }

    @Override // com.google.android.gms.internal.ads.k11
    public final b c(vy0 vy0Var, byte[] bArr, byte[] bArr2) {
        h91 a10 = ((ly0) this.f8516f.zzb()).a(bArr);
        h21 h21Var = this.i;
        h21Var.e(15307, a10);
        h91 a11 = this.f8515d.a(bArr2);
        h21Var.e(15305, a11);
        return ed1.c0(q81.t(new k81(d51.v(new b[]{a10, a11}), true)), new m11(this, vy0Var, 1), o81.f9033u);
    }

    @Override // com.google.android.gms.internal.ads.k11
    public final b zza() {
        return ed1.E(new bo0(7, this), this.f8518h);
    }

    @Override // com.google.android.gms.internal.ads.k11
    public final h91 zzb() {
        ly0 ly0Var = this.f8512a;
        ly0Var.getClass();
        h91 E = ed1.E(new bo0(4, ly0Var), ly0Var.f8186b);
        this.i.e(15302, E);
        return E;
    }
}
