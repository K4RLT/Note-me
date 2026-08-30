package com.google.android.gms.internal.ads;
import a0.k;
import c2.b;
import k9.a0;

/* loaded from: classes.dex */
public final class br extends c2.b {

    /* renamed from: d, reason: collision with root package name */
    public final Object f4867d;
    public final cr e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4868f;

    public br(cr crVar) {
        super(1);
        this.f4867d = new Object();
        this.e = crVar;
    }

    public final void l() {
        k9.a0.k("release: Trying to acquire lock");
        synchronized (this.f4867d) {
            try {
                k9.a0.k("release: Lock acquired");
                if (this.f4868f) {
                    k9.a0.k("release: Lock already released");
                    return;
                }
                this.f4868f = true;
                i(new fp(2), new fp(17));
                i(new jk0(this), new hx0(this));
                k9.a0.k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
