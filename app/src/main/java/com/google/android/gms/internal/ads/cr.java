package com.google.android.gms.internal.ads;
import a0.k;
import c2.b;
import fa.y;
import k9.a0;

/* loaded from: classes.dex */
public final class cr extends c2.b {

    /* renamed from: d, reason: collision with root package name */
    public final Object f5143d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int f5144f;

    public cr() {
        super(1);
        this.f5143d = new Object();
        this.e = false;
        this.f5144f = 0;
    }

    public final br l() {
        boolean z3;
        br brVar = new br(this);
        k9.a0.k("createNewReference: Trying to acquire lock");
        synchronized (this.f5143d) {
            k9.a0.k("createNewReference: Lock acquired");
            i(new lx0(this, brVar), new tf(this, brVar));
            if (this.f5144f >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            fa.y.k(z3);
            this.f5144f++;
        }
        k9.a0.k("createNewReference: Lock released");
        return brVar;
    }

    public final void m() {
        boolean z3;
        k9.a0.k("releaseOneReference: Trying to acquire lock");
        synchronized (this.f5143d) {
            k9.a0.k("releaseOneReference: Lock acquired");
            if (this.f5144f > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            fa.y.k(z3);
            k9.a0.k("Releasing 1 reference for JS Engine");
            this.f5144f--;
            o();
        }
        k9.a0.k("releaseOneReference: Lock released");
    }

    public final void n() {
        boolean z3;
        k9.a0.k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.f5143d) {
            k9.a0.k("markAsDestroyable: Lock acquired");
            if (this.f5144f >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            fa.y.k(z3);
            k9.a0.k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.e = true;
            o();
        }
        k9.a0.k("markAsDestroyable: Lock released");
    }

    public final void o() {
        boolean z3;
        k9.a0.k("maybeDestroy: Trying to acquire lock");
        synchronized (this.f5143d) {
            try {
                k9.a0.k("maybeDestroy: Lock acquired");
                if (this.f5144f >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                fa.y.k(z3);
                if (this.e && this.f5144f == 0) {
                    k9.a0.k("No reference is left (including root). Cleaning up engine.");
                    i(new fp(3), new fp(17));
                } else {
                    k9.a0.k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        k9.a0.k("maybeDestroy: Lock released");
    }
}
