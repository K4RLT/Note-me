package com.google.android.gms.internal.ads;
import g9.a;
import la.a;

import android.os.SystemClock;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class n50 implements k70, a, a80, b70, s60, k80 {

    /* renamed from: u, reason: collision with root package name */
    public final a f8546u;

    /* renamed from: v, reason: collision with root package name */
    public final lx f8547v;

    public n50(a aVar, lx lxVar) {
        this.f8546u = aVar;
        this.f8547v = lxVar;
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void B(nk nkVar) {
        lx lxVar = this.f8547v;
        synchronized (lxVar.f8169d) {
            sx sxVar = lxVar.f8167b;
            synchronized (sxVar.f11183u) {
                sxVar.f11186x.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void C() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void E() {
        lx lxVar = this.f8547v;
        synchronized (lxVar.f8169d) {
            try {
                if (lxVar.f8174k != -1) {
                    LinkedList linkedList = lxVar.f8168c;
                    if (!linkedList.isEmpty()) {
                        kx kxVar = (kx) linkedList.getLast();
                        if (kxVar.f7895b == -1) {
                            kxVar.f7896c.f8166a.getClass();
                            kxVar.f7895b = SystemClock.elapsedRealtime();
                            lxVar.f8167b.a(lxVar);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void F() {
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void G(nk nkVar) {
    }

    @Override // a
    public final void L() {
        lx lxVar = this.f8547v;
        synchronized (lxVar.f8169d) {
            if (lxVar.f8174k != -1) {
                kx kxVar = new kx(lxVar);
                kxVar.f7896c.f8166a.getClass();
                kxVar.f7894a = SystemClock.elapsedRealtime();
                lxVar.f8168c.add(kxVar);
                lxVar.i++;
                sx sxVar = lxVar.f8167b;
                synchronized (sxVar.f11183u) {
                    qx qxVar = sxVar.f11186x;
                    synchronized (qxVar.f10015f) {
                        qxVar.f10018j++;
                    }
                }
                sxVar.a(lxVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void S(wp0 wp0Var) {
        a aVar = this.f8546u;
        lx lxVar = this.f8547v;
        aVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (lxVar.f8169d) {
            try {
                lxVar.f8174k = elapsedRealtime;
                if (elapsedRealtime != -1) {
                    lxVar.f8167b.a(lxVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void a() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void c(nk nkVar) {
        lx lxVar = this.f8547v;
        synchronized (lxVar.f8169d) {
            sx sxVar = lxVar.f8167b;
            synchronized (sxVar.f11183u) {
                sxVar.f11186x.b();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k70
    public final void e() {
        lx lxVar = this.f8547v;
        synchronized (lxVar.f8169d) {
            try {
                if (lxVar.f8174k != -1) {
                    lxVar.f8166a.getClass();
                    lxVar.f8172h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a80
    public final void r(dv dvVar) {
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void w(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.b70
    public final void y() {
        lx lxVar = this.f8547v;
        synchronized (lxVar.f8169d) {
            try {
                if (lxVar.f8174k != -1 && lxVar.f8171g == -1) {
                    lxVar.f8166a.getClass();
                    lxVar.f8171g = SystemClock.elapsedRealtime();
                    lxVar.f8167b.a(lxVar);
                }
                sx sxVar = lxVar.f8167b;
                synchronized (sxVar.f11183u) {
                    qx qxVar = sxVar.f11186x;
                    synchronized (qxVar.f10015f) {
                        qxVar.f10019k++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void z(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.k80
    public final void D() {
    }

    @Override // com.google.android.gms.internal.ads.s60
    public final void v(iv ivVar, String str, String str2) {
    }
}
