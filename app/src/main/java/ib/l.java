package ib;

import a6.x;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.pu1;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements m, e, d, b {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f18376u;

    /* renamed from: v, reason: collision with root package name */
    public final Executor f18377v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f18378w;

    /* renamed from: x, reason: collision with root package name */
    public Object f18379x;

    public l(Executor executor, b bVar) {
        this.f18376u = 0;
        this.f18378w = new Object();
        this.f18377v = executor;
        this.f18379x = bVar;
    }

    @Override // ib.b
    public void a() {
        ((o) this.f18379x).q();
    }

    @Override // ib.m
    public final void b(o oVar) {
        switch (this.f18376u) {
            case 0:
                if (oVar.f18384d) {
                    synchronized (this.f18378w) {
                        try {
                            if (((b) this.f18379x) != null) {
                                this.f18377v.execute(new x(21, this));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f18378w) {
                    try {
                        if (((c) this.f18379x) != null) {
                            this.f18377v.execute(new ou1(18, this, oVar, false));
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 2:
                if (!oVar.l() && !oVar.f18384d) {
                    synchronized (this.f18378w) {
                        try {
                            if (((d) this.f18379x) != null) {
                                this.f18377v.execute(new pu1(16, this, oVar, false));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 3:
                if (oVar.l()) {
                    synchronized (this.f18378w) {
                        try {
                            if (((e) this.f18379x) != null) {
                                this.f18377v.execute(new iv1(17, this, oVar, false));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.f18377v.execute(new ou1(19, this, oVar, false));
                return;
        }
    }

    @Override // ib.m
    public final void c() {
        switch (this.f18376u) {
            case 0:
                synchronized (this.f18378w) {
                    this.f18379x = null;
                }
                return;
            case 1:
                synchronized (this.f18378w) {
                    this.f18379x = null;
                }
                return;
            case 2:
                synchronized (this.f18378w) {
                    this.f18379x = null;
                }
                return;
            case 3:
                synchronized (this.f18378w) {
                    this.f18379x = null;
                }
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // ib.e
    public void d(Object obj) {
        ((o) this.f18379x).p(obj);
    }

    @Override // ib.d
    public void w(Exception exc) {
        ((o) this.f18379x).o(exc);
    }

    public l(Executor executor, c cVar) {
        this.f18376u = 1;
        this.f18378w = new Object();
        this.f18377v = executor;
        this.f18379x = cVar;
    }

    public l(Executor executor, d dVar) {
        this.f18376u = 2;
        this.f18378w = new Object();
        this.f18377v = executor;
        this.f18379x = dVar;
    }

    public l(Executor executor, e eVar) {
        this.f18376u = 3;
        this.f18378w = new Object();
        this.f18377v = executor;
        this.f18379x = eVar;
    }

    public l(Executor executor, g gVar, o oVar) {
        this.f18376u = 4;
        this.f18377v = executor;
        this.f18378w = gVar;
        this.f18379x = oVar;
    }
}
