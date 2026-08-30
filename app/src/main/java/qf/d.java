package qf;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.ads.ou1;
import java.util.concurrent.CancellationException;
import pf.b0;
import pf.g0;
import pf.l;
import pf.l0;
import pf.n0;
import pf.p1;
import pf.v;
import te.g;
import uf.n;

/* loaded from: classes.dex */
public final class d extends v implements g0 {

    /* renamed from: w, reason: collision with root package name */
    public final Handler f24034w;

    /* renamed from: x, reason: collision with root package name */
    public final String f24035x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f24036y;

    /* renamed from: z, reason: collision with root package name */
    public final d f24037z;

    public d(Handler handler, String str, boolean z3) {
        d dVar;
        this.f24034w = handler;
        this.f24035x = str;
        this.f24036y = z3;
        if (z3) {
            dVar = this;
        } else {
            dVar = new d(handler, str, true);
        }
        this.f24037z = dVar;
    }

    @Override // pf.g0
    public final n0 A(long j10, final Runnable runnable, g gVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f24034w.postDelayed(runnable, j10)) {
            return new n0() { // from class: qf.c
                @Override // pf.n0
                public final void a() {
                    d.this.f24034w.removeCallbacks(runnable);
                }
            };
        }
        a0(gVar, runnable);
        return p1.f22779u;
    }

    @Override // pf.g0
    public final void K(long j10, l lVar) {
        ou1 ou1Var = new ou1(lVar, 28, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f24034w.postDelayed(ou1Var, j10)) {
            lVar.u(new androidx.ink.authoring.compose.d(this, 16, ou1Var));
        } else {
            a0(lVar.f22766y, ou1Var);
        }
    }

    @Override // pf.v
    public final void W(g gVar, Runnable runnable) {
        if (!this.f24034w.post(runnable)) {
            a0(gVar, runnable);
        }
    }

    @Override // pf.v
    public final boolean Y(g gVar) {
        if (this.f24036y && kotlin.jvm.internal.l.a(Looper.myLooper(), this.f24034w.getLooper())) {
            return false;
        }
        return true;
    }

    public final void a0(g gVar, Runnable runnable) {
        b0.h(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        wf.e eVar = l0.f22767a;
        wf.d.f29913w.W(gVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f24034w == this.f24034w && dVar.f24036y == this.f24036y) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int identityHashCode = System.identityHashCode(this.f24034w);
        if (this.f24036y) {
            i = 1231;
        } else {
            i = 1237;
        }
        return identityHashCode ^ i;
    }

    @Override // pf.v
    public final String toString() {
        d dVar;
        String str;
        wf.e eVar = l0.f22767a;
        d dVar2 = n.f27235a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f24037z;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            if (this == dVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.f24035x;
            if (str2 == null) {
                str2 = this.f24034w.toString();
            }
            if (this.f24036y) {
                return a5.a.g(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    public d(Handler handler) {
        this(handler, null, false);
    }
}
