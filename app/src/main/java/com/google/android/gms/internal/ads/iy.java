package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* loaded from: classes.dex */
public abstract class iy extends TextureView {

    /* renamed from: u, reason: collision with root package name */
    public final ny f7251u;

    /* renamed from: v, reason: collision with root package name */
    public final sy f7252v;

    public iy(Context context) {
        super(context);
        this.f7251u = new ny();
        this.f7252v = new sy(context, this);
    }

    public void A(String str, String[] strArr, Integer num) {
        f(str);
    }

    public void B(int i) {
    }

    public void C(int i) {
    }

    public void a(int i) {
    }

    public void b(int i) {
    }

    public void c(int i) {
    }

    public abstract String d();

    public abstract void e(ly lyVar);

    public abstract void f(String str);

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract int j();

    public abstract int k();

    public abstract void l(int i);

    public abstract void m(float f10, float f11);

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract long q();

    public abstract long r();

    public abstract int s();

    public abstract void t();

    public Integer z() {
        return null;
    }
}
