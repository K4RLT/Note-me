package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class e20 implements t10 {

    /* renamed from: b, reason: collision with root package name */
    public a00 f5577b;

    /* renamed from: c, reason: collision with root package name */
    public a00 f5578c;

    /* renamed from: d, reason: collision with root package name */
    public a00 f5579d;
    public a00 e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f5580f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f5581g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5582h;

    public e20() {
        ByteBuffer byteBuffer = t10.f11228a;
        this.f5580f = byteBuffer;
        this.f5581g = byteBuffer;
        a00 a00Var = a00.e;
        this.f5579d = a00Var;
        this.e = a00Var;
        this.f5577b = a00Var;
        this.f5578c = a00Var;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void a() {
        this.f5582h = true;
        l();
    }

    @Override // com.google.android.gms.internal.ads.t10
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.f5581g;
        this.f5581g = t10.f11228a;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public boolean c() {
        if (this.e != a00.e) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public boolean e() {
        return this.f5582h && this.f5581g == t10.f11228a;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void f() {
        ByteBuffer byteBuffer = t10.f11228a;
        this.f5581g = byteBuffer;
        this.f5582h = false;
        this.f5580f = byteBuffer;
        a00 a00Var = a00.e;
        this.f5579d = a00Var;
        this.e = a00Var;
        this.f5577b = a00Var;
        this.f5578c = a00Var;
        n();
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final a00 h(a00 a00Var) {
        this.f5579d = a00Var;
        this.e = k(a00Var);
        if (c()) {
            return this.e;
        }
        return a00.e;
    }

    @Override // com.google.android.gms.internal.ads.t10
    public final void i(w00 w00Var) {
        this.f5581g = t10.f11228a;
        this.f5582h = false;
        this.f5577b = this.f5579d;
        this.f5578c = this.e;
        m();
    }

    public final ByteBuffer j(int i) {
        if (this.f5580f.capacity() < i) {
            this.f5580f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f5580f.clear();
        }
        ByteBuffer byteBuffer = this.f5580f;
        this.f5581g = byteBuffer;
        return byteBuffer;
    }

    public abstract a00 k(a00 a00Var);

    public void l() {
    }

    public void n() {
    }

    public void m() {
    }
}
