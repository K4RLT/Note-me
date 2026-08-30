package g0;
import a0.f0;
import k1.l0;
import k1.r;
import m2.g;
import m2.h;
import m2.p0;
import r0.i1;
import r0.q1;
import r0.y;
import z1.x;

import c2.n2;
import com.google.android.gms.internal.ads.mu;

/* loaded from: classes.dex */
public final class e1 {
    public final i1 A;

    /* renamed from: a, reason: collision with root package name */
    public o1 f17062a;

    /* renamed from: b, reason: collision with root package name */
    public final q1 f17063b;

    /* renamed from: c, reason: collision with root package name */
    public final n2 f17064c;

    /* renamed from: d, reason: collision with root package name */
    public final mu f17065d;
    public r2.b0 e;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f17066f;

    /* renamed from: g, reason: collision with root package name */
    public final i1 f17067g;

    /* renamed from: h, reason: collision with root package name */
    public x f17068h;
    public final i1 i;

    /* renamed from: j, reason: collision with root package name */
    public g f17069j;

    /* renamed from: k, reason: collision with root package name */
    public final i1 f17070k;

    /* renamed from: l, reason: collision with root package name */
    public final i1 f17071l;

    /* renamed from: m, reason: collision with root package name */
    public final i1 f17072m;

    /* renamed from: n, reason: collision with root package name */
    public final i1 f17073n;

    /* renamed from: o, reason: collision with root package name */
    public final i1 f17074o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17075p;

    /* renamed from: q, reason: collision with root package name */
    public final i1 f17076q;

    /* renamed from: r, reason: collision with root package name */
    public final b1 f17077r;

    /* renamed from: s, reason: collision with root package name */
    public final i1 f17078s;

    /* renamed from: t, reason: collision with root package name */
    public final i1 f17079t;

    /* renamed from: u, reason: collision with root package name */
    public df.l f17080u;

    /* renamed from: v, reason: collision with root package name */
    public final i0 f17081v;

    /* renamed from: w, reason: collision with root package name */
    public final i0 f17082w;

    /* renamed from: x, reason: collision with root package name */
    public final f0 f17083x;

    /* renamed from: y, reason: collision with root package name */
    public long f17084y;

    /* renamed from: z, reason: collision with root package name */
    public final i1 f17085z;

    public e1(o1 o1Var, q1 q1Var, n2 n2Var) {
        this.f17062a = o1Var;
        this.f17063b = q1Var;
        this.f17064c = n2Var;
        mu muVar = new mu(19);
        g gVar = h.f20483a;
        long j10 = p0.f20544b;
        r2.x xVar = new r2.x(gVar, j10, (p0) null);
        muVar.f8422v = xVar;
        muVar.f8423w = new com.google.android.gms.internal.ads.a2(gVar, xVar.f24516b);
        this.f17065d = muVar;
        Boolean bool = Boolean.FALSE;
        this.f17066f = y.B(bool);
        this.f17067g = y.B(new y2.f(0));
        this.i = y.B(null);
        this.f17070k = y.B(s0.f17275u);
        this.f17071l = y.B(bool);
        this.f17072m = y.B(bool);
        this.f17073n = y.B(bool);
        this.f17074o = y.B(bool);
        this.f17075p = true;
        this.f17076q = y.B(Boolean.TRUE);
        this.f17077r = new b1(n2Var);
        this.f17078s = y.B(bool);
        this.f17079t = y.B(bool);
        this.f17080u = l.A;
        this.f17081v = new i0(this, 3);
        this.f17082w = new i0(this, 2);
        this.f17083x = l0.i();
        this.f17084y = r.f19521l;
        this.f17085z = y.B(new p0(j10));
        this.A = y.B(new p0(j10));
    }

    public final s0 a() {
        return (s0) this.f17070k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f17066f.getValue()).booleanValue();
    }

    public final x c() {
        x xVar = this.f17068h;
        if (xVar != null && xVar.i()) {
            return xVar;
        }
        return null;
    }

    public final g2 d() {
        return (g2) this.i.getValue();
    }

    public final void e(long j10) {
        this.A.setValue(new p0(j10));
    }

    public final void f(long j10) {
        this.f17085z.setValue(new p0(j10));
    }
}
