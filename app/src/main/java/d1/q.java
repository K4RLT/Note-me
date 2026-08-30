package d1;
import r.b0;

import b2.k1;
import b2.r1;
import c2.x;
import pf.d1;
import pf.f1;
import pf.w;
import pf.z;

/* loaded from: classes.dex */
public abstract class q implements b2.j {
    public r1 A;
    public k1 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public a0.o G;
    public boolean H;

    /* renamed from: v, reason: collision with root package name */
    public uf.c f15689v;

    /* renamed from: w, reason: collision with root package name */
    public int f15690w;

    /* renamed from: y, reason: collision with root package name */
    public q f15692y;

    /* renamed from: z, reason: collision with root package name */
    public q f15693z;

    /* renamed from: u, reason: collision with root package name */
    public q f15688u = this;

    /* renamed from: x, reason: collision with root package name */
    public int f15691x = -1;

    public final z M0() {
        uf.c cVar = this.f15689v;
        if (cVar == null) {
            uf.c b10 = b0.b(((x) b2.l.v(this)).getCoroutineContext().V(new f1((d1) ((x) b2.l.v(this)).getCoroutineContext().L(w.f22803v))));
            this.f15689v = b10;
            return b10;
        }
        return cVar;
    }

    public boolean N0() {
        return !(this instanceof b0);
    }

    public void O0() {
        if (this.H) {
            y1.a.b("node attached multiple times");
        }
        if (this.B == null) {
            y1.a.b("attach invoked on a node without a coordinator");
        }
        this.H = true;
        this.E = true;
    }

    public void P0() {
        if (!this.H) {
            y1.a.b("Cannot detach a node that is not attached");
        }
        if (this.E) {
            y1.a.b("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.F) {
            y1.a.b("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.H = false;
        uf.c cVar = this.f15689v;
        if (cVar != null) {
            b0.g(cVar, new y1.b("The Modifier.Node was detached", 0));
            this.f15689v = null;
        }
    }

    public void T0() {
        if (!this.H) {
            y1.a.b("reset() called on an unattached node");
        }
        S0();
    }

    public void U0() {
        if (!this.H) {
            y1.a.b("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.E) {
            y1.a.b("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.E = false;
        Q0();
        this.F = true;
    }

    public void V0() {
        if (!this.H) {
            y1.a.b("node detached multiple times");
        }
        if (this.B == null) {
            y1.a.b("detach invoked on a node without a coordinator");
        }
        if (!this.F) {
            y1.a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.F = false;
        a0.o oVar = this.G;
        if (oVar != null) {
            oVar.invoke();
        }
        R0();
    }

    public void W0(q qVar) {
        this.f15688u = qVar;
    }

    public void X0(k1 k1Var) {
        this.B = k1Var;
    }

    public void Q0() {
    }

    public void R0() {
    }

    public void S0() {
    }
}
