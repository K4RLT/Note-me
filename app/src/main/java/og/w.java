package og;
import q.h;
import q.x;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long f22065a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f22066b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22067c;

    /* renamed from: d, reason: collision with root package name */
    public final r f22068d;
    public final ArrayDeque e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22069f;

    /* renamed from: g, reason: collision with root package name */
    public final v f22070g;

    /* renamed from: h, reason: collision with root package name */
    public final u f22071h;
    public final ig.s i;

    /* renamed from: j, reason: collision with root package name */
    public final ig.s f22072j;

    /* renamed from: k, reason: collision with root package name */
    public int f22073k;

    public w(int i, r rVar, boolean z3, boolean z9, ig.l lVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        int i10 = 1;
        this.i = new ig.s(i10, this);
        this.f22072j = new ig.s(i10, this);
        this.f22073k = 0;
        if (rVar != null) {
            this.f22067c = i;
            this.f22068d = rVar;
            this.f22066b = rVar.I.b();
            v vVar = new v(this, rVar.H.b());
            this.f22070g = vVar;
            u uVar = new u(this);
            this.f22071h = uVar;
            vVar.f22063y = z9;
            uVar.f22057w = z3;
            if (lVar != null) {
                arrayDeque.add(lVar);
            }
            if (f() && lVar != null) {
                x.o("locally-initiated streams shouldn't have headers yet");
                throw null;
            }
            if (f() || lVar != null) {
                return;
            }
            x.o("remotely-initiated streams should have headers");
            throw null;
        }
        g5.h("connection == null");
        throw null;
    }

    public final void a() {
        boolean z3;
        boolean g8;
        synchronized (this) {
            try {
                v vVar = this.f22070g;
                if (!vVar.f22063y && vVar.f22062x) {
                    u uVar = this.f22071h;
                    if (!uVar.f22057w) {
                        if (uVar.f22056v) {
                        }
                    }
                    z3 = true;
                    g8 = g();
                }
                z3 = false;
                g8 = g();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            c(6);
        } else if (!g8) {
            this.f22068d.p(this.f22067c);
        }
    }

    public final void b() {
        u uVar = this.f22071h;
        if (!uVar.f22056v) {
            if (!uVar.f22057w) {
                int i = this.f22073k;
                if (i == 0) {
                    return;
                } else {
                    throw new a0(i);
                }
            }
            x.p("stream finished");
            return;
        }
        x.p("stream closed");
    }

    public final void c(int i) {
        if (!d(i)) {
            return;
        }
        this.f22068d.L.r(this.f22067c, i);
    }

    public final boolean d(int i) {
        synchronized (this) {
            try {
                if (this.f22073k != 0) {
                    return false;
                }
                if (this.f22070g.f22063y && this.f22071h.f22057w) {
                    return false;
                }
                this.f22073k = i;
                notifyAll();
                this.f22068d.p(this.f22067c);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final u e() {
        synchronized (this) {
            try {
                if (!this.f22069f && !f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f22071h;
    }

    public final boolean f() {
        boolean z3;
        if ((this.f22067c & 1) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f22068d.f22038u == z3) {
            return true;
        }
        return false;
    }

    public final synchronized boolean g() {
        try {
            if (this.f22073k != 0) {
                return false;
            }
            v vVar = this.f22070g;
            if (!vVar.f22063y) {
                if (vVar.f22062x) {
                }
                return true;
            }
            u uVar = this.f22071h;
            if (uVar.f22057w || uVar.f22056v) {
                if (this.f22069f) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void h() {
        boolean g8;
        synchronized (this) {
            this.f22070g.f22063y = true;
            g8 = g();
            notifyAll();
        }
        if (!g8) {
            this.f22068d.p(this.f22067c);
        }
    }
}
