package com.google.android.gms.internal.ads;
import g9.a;
import g9.e2;
import g9.k0;
import g9.z1;
import l9.i;
import z8.c;
import z8.k;
import z8.l;
import z8.s;

import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class sf0 extends c {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f10604u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f10605v;

    /* renamed from: w, reason: collision with root package name */
    public Object f10606w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f10607x;

    public sf0(wf0 wf0Var, String str, k kVar) {
        this.f10604u = 0;
        this.f10605v = str;
        this.f10606w = kVar;
        Objects.requireNonNull(wf0Var);
        this.f10607x = wf0Var;
    }

    @Override // c, a
    public void L() {
        switch (this.f10604u) {
            case 1:
                synchronized (this.f10605v) {
                    try {
                        c cVar = (c) this.f10606w;
                        if (cVar != null) {
                            cVar.L();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // c
    public void a() {
        switch (this.f10604u) {
            case 1:
                synchronized (this.f10605v) {
                    try {
                        c cVar = (c) this.f10606w;
                        if (cVar != null) {
                            cVar.a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // c
    public final void b(l lVar) {
        switch (this.f10604u) {
            case 0:
                ((wf0) this.f10607x).w4(wf0.z4(lVar));
                return;
            default:
                e2 e2Var = (e2) this.f10607x;
                s sVar = (s) e2Var.f17617d;
                k0 k0Var = (k0) e2Var.f17621j;
                z1 z1Var = null;
                if (k0Var != null) {
                    try {
                        z1Var = k0Var.U();
                    } catch (RemoteException e) {
                        i.i(e, "#007 Could not call remote method.");
                    }
                }
                sVar.a(z1Var);
                synchronized (this.f10605v) {
                    try {
                        c cVar = (c) this.f10606w;
                        if (cVar != null) {
                            cVar.b(lVar);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // c
    public void c() {
        switch (this.f10604u) {
            case 1:
                synchronized (this.f10605v) {
                    try {
                        c cVar = (c) this.f10606w;
                        if (cVar != null) {
                            cVar.c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // c
    public final void e() {
        switch (this.f10604u) {
            case 0:
                ((wf0) this.f10607x).v4((k) this.f10606w, (String) this.f10605v);
                return;
            default:
                e2 e2Var = (e2) this.f10607x;
                s sVar = (s) e2Var.f17617d;
                k0 k0Var = (k0) e2Var.f17621j;
                z1 z1Var = null;
                if (k0Var != null) {
                    try {
                        z1Var = k0Var.U();
                    } catch (RemoteException e) {
                        i.i(e, "#007 Could not call remote method.");
                    }
                }
                sVar.a(z1Var);
                synchronized (this.f10605v) {
                    try {
                        c cVar = (c) this.f10606w;
                        if (cVar != null) {
                            cVar.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // c
    public void k() {
        switch (this.f10604u) {
            case 1:
                synchronized (this.f10605v) {
                    try {
                        c cVar = (c) this.f10606w;
                        if (cVar != null) {
                            cVar.k();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    public sf0(e2 e2Var) {
        this.f10604u = 1;
        this.f10607x = e2Var;
        this.f10605v = new Object();
    }
}
