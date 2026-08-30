package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes.dex */
public final class z0 extends HandlerThread implements Handler.Callback {

    /* renamed from: u, reason: collision with root package name */
    public tc0 f13019u;

    /* renamed from: v, reason: collision with root package name */
    public Handler f13020v;

    /* renamed from: w, reason: collision with root package name */
    public Error f13021w;

    /* renamed from: x, reason: collision with root package name */
    public RuntimeException f13022x;

    /* renamed from: y, reason: collision with root package name */
    public a1 f13023y;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z3;
        tc0 tc0Var;
        int i = message.what;
        try {
            if (i != 1) {
                if (i == 2) {
                    try {
                        tc0Var = this.f13019u;
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    if (tc0Var != null) {
                        tc0Var.b();
                        return true;
                    }
                    throw null;
                }
            } else {
                try {
                    int i10 = message.arg1;
                    tc0 tc0Var2 = this.f13019u;
                    if (tc0Var2 != null) {
                        tc0Var2.a(i10);
                        SurfaceTexture surfaceTexture = this.f13019u.f11323z;
                        surfaceTexture.getClass();
                        if (i10 != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.f13023y = new a1(this, surfaceTexture, z3);
                        synchronized (this) {
                            notify();
                        }
                        return true;
                    }
                    throw null;
                } catch (dd0 e) {
                    x21.P("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.f13022x = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e8) {
                    x21.P("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                    this.f13021w = e8;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    x21.P("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f13022x = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
