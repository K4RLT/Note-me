package z;
import m.e;

import a0.c0;
import a0.g0;
import a0.h0;
import a0.j0;
import a1.t;
import b0.f0;
import b0.k0;
import b0.m0;
import b0.n0;
import b1.w;
import b2.i0;
import com.google.android.gms.internal.ads.x90;
import java.util.Collection;
import pe.z;
import r.u0;
import r0.a1;
import r0.i1;
import r0.v0;
import r0.y;
import t.s1;

/* loaded from: classes.dex */
public final class m implements s1 {

    /* renamed from: w, reason: collision with root package name */
    public static final x90 f31727w = t.b(k.f31720u, h.f31687x);

    /* renamed from: a, reason: collision with root package name */
    public final a0.a f31728a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31729b;

    /* renamed from: c, reason: collision with root package name */
    public i f31730c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f31731d;
    public final i1 e;

    /* renamed from: f, reason: collision with root package name */
    public final v.i f31732f;

    /* renamed from: g, reason: collision with root package name */
    public float f31733g;

    /* renamed from: h, reason: collision with root package name */
    public final t.l f31734h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public i0 f31735j;

    /* renamed from: k, reason: collision with root package name */
    public final h0 f31736k;

    /* renamed from: l, reason: collision with root package name */
    public final b0.e f31737l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.b f31738m;

    /* renamed from: n, reason: collision with root package name */
    public final pd.c f31739n;

    /* renamed from: o, reason: collision with root package name */
    public final n0 f31740o;

    /* renamed from: p, reason: collision with root package name */
    public final t.a f31741p;

    /* renamed from: q, reason: collision with root package name */
    public final k0 f31742q;

    /* renamed from: r, reason: collision with root package name */
    public final a1 f31743r;

    /* renamed from: s, reason: collision with root package name */
    public final i1 f31744s;

    /* renamed from: t, reason: collision with root package name */
    public final i1 f31745t;

    /* renamed from: u, reason: collision with root package name */
    public final a1 f31746u;

    /* renamed from: v, reason: collision with root package name */
    public final z5.h f31747v;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, a0.a] */
    /* JADX WARN: Type inference failed for: r4v6, types: [b0.e, java.lang.Object] */
    public m(int i, int i10) {
        Object obj = new Object();
        obj.f0a = -1;
        this.f31728a = obj;
        this.f31731d = new c0(i, i10, 1);
        this.e = new i1(o.f31748a, v0.f24418w);
        this.f31732f = new v.i();
        this.f31734h = new t.l(new p.c0(14, this));
        this.i = true;
        this.f31736k = new h0(this, 2);
        this.f31737l = new Object();
        this.f31738m = new androidx.compose.foundation.lazy.layout.b();
        this.f31739n = new pd.c(2, false);
        this.f31740o = new n0(new g0(this, i, 3));
        this.f31741p = new t.a(11, this);
        this.f31742q = new k0();
        this.f31743r = f0.h();
        Boolean bool = Boolean.FALSE;
        this.f31744s = y.B(bool);
        this.f31745t = y.B(bool);
        this.f31746u = f0.h();
        this.f31747v = new z5.h(2);
    }

    public static Object k(m mVar, int i, ve.i iVar) {
        mVar.getClass();
        Object e = mVar.e(u0.f24148u, new j0(mVar, i, null, 22), iVar);
        if (e == ue.a.f27192u) {
            return e;
        }
        return z.f22715a;
    }

    @Override // t.s1
    public final boolean a() {
        return this.f31734h.a();
    }

    @Override // t.s1
    public final boolean b() {
        return ((Boolean) this.f31745t.getValue()).booleanValue();
    }

    @Override // t.s1
    public final boolean c() {
        return ((Boolean) this.f31744s.getValue()).booleanValue();
    }

    @Override // t.s1
    public final float d(float f10) {
        return this.f31734h.d(f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        if (r8.e(r6, r7, r0) != r4) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // t.s1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(r.u0 r6, df.p r7, te.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof z.l
            if (r0 == 0) goto L13
            r0 = r8
            z.l r0 = (z.l) r0
            int r1 = r0.f31726z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31726z = r1
            goto L18
        L13:
            z.l r0 = new z.l
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f31724x
            int r1 = r0.f31726z
            r2 = 2
            r3 = 1
            ue.a r4 = ue.a.f27192u
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            pe.a.e(r8)
            goto L68
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            q.x.o(r6)
            r6 = 0
            return r6
        L31:
            ve.i r6 = r0.f31723w
            r7 = r6
            df.p r7 = (df.p) r7
            r.u0 r6 = r0.f31722v
            z.m r1 = r0.f31721u
            pe.a.e(r8)
            goto L56
        L3e:
            pe.a.e(r8)
            r0.f31721u = r5
            r0.f31722v = r6
            r8 = r7
            ve.i r8 = (ve.i) r8
            r0.f31723w = r8
            r0.f31726z = r3
            b0.e r8 = r5.f31737l
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r4) goto L55
            goto L67
        L55:
            r1 = r5
        L56:
            t.l r8 = r1.f31734h
            r1 = 0
            r0.f31721u = r1
            r0.f31722v = r1
            r0.f31723w = r1
            r0.f31726z = r2
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r4) goto L68
        L67:
            return r4
        L68:
            pe.z r6 = pe.z.f22715a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z.e(r.u0, df.p, te.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    public final void f(i iVar, boolean z3, boolean z9) {
        int i;
        boolean z10;
        Object obj;
        boolean z11;
        int i10;
        if (!z3 && this.f31729b) {
            this.f31730c = iVar;
            return;
        }
        boolean z12 = true;
        if (z3) {
            this.f31729b = true;
        }
        j jVar = iVar.f31689a;
        Object r22 = iVar.f31697k;
        int i11 = iVar.f31690b;
        int i12 = 0;
        if (jVar != null) {
            i = jVar.f31704a;
        } else {
            i = 0;
        }
        if (i == 0 && i11 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f31745t.setValue(Boolean.valueOf(z10));
        this.f31744s.setValue(Boolean.valueOf(iVar.f31691c));
        this.f31733g -= iVar.f31692d;
        this.e.setValue(iVar);
        c0 c0Var = this.f31731d;
        if (z9) {
            c0Var.getClass();
            if (i11 < 0.0f) {
                z12 = false;
            }
            if (!z12) {
                w.a.c("scrollOffset should be non-negative");
            }
            c0Var.f29c.i(i11);
        } else {
            c0Var.getClass();
            if (jVar != null) {
                obj = jVar.i;
            } else {
                obj = null;
            }
            c0Var.e = obj;
            if (c0Var.f30d || iVar.f31700n > 0) {
                c0Var.f30d = true;
                if (i11 >= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    w.a.c("scrollOffset should be non-negative");
                }
                if (jVar != null) {
                    i12 = jVar.f31704a;
                }
                c0Var.a(i12, i11);
            }
            if (this.i) {
                a0.a aVar = this.f31728a;
                if (aVar.f0a != -1 && !((Collection) r22).isEmpty()) {
                    if (aVar.f1b) {
                        i10 = ((j) qe.l.C(r22)).f31704a + 1;
                    } else {
                        i10 = ((j) qe.l.w(r22)).f31704a - 1;
                    }
                    if (aVar.f0a != i10) {
                        aVar.f0a = -1;
                        m0 m0Var = (m0) aVar.f2c;
                        if (m0Var != null) {
                            m0Var.cancel();
                        }
                        aVar.f2c = null;
                    }
                }
            }
        }
        if (z3) {
            this.f31747v.q(iVar.f31693f, iVar.i, iVar.f31695h);
        }
    }

    public final int g() {
        return this.f31731d.f28b.h();
    }

    public final int h() {
        return this.f31731d.f29c.h();
    }

    public final i i() {
        return (i) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final void j(float f10, i iVar) {
        boolean z3;
        int i;
        m0 m0Var;
        m0 m0Var2;
        df.l lVar;
        m0 m0Var3;
        if (this.i) {
            a0.a aVar = this.f31728a;
            aVar.getClass();
            Object r12 = iVar.f31697k;
            if (!((Collection) r12).isEmpty()) {
                if (f10 < 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    i = ((j) qe.l.C(r12)).f31704a + 1;
                } else {
                    i = ((j) qe.l.w(r12)).f31704a - 1;
                }
                if (i >= 0 && i < iVar.f31700n) {
                    if (i != aVar.f0a) {
                        if (aVar.f1b != z3 && (m0Var3 = (m0) aVar.f2c) != null) {
                            m0Var3.cancel();
                        }
                        aVar.f1b = z3;
                        aVar.f0a = i;
                        m mVar = (m) this.f31741p.f25315v;
                        b1.i d2 = w.d();
                        if (d2 != null) {
                            lVar = d2.e();
                        } else {
                            lVar = null;
                        }
                        b1.i g8 = w.g(d2);
                        try {
                            long j10 = ((i) mVar.e.getValue()).f31696j;
                            w.j(d2, g8, lVar);
                            aVar.f2c = mVar.f31740o.a(i, j10);
                        } catch (Throwable th) {
                            w.j(d2, g8, lVar);
                            throw th;
                        }
                    }
                    if (z3) {
                        j jVar = (j) qe.l.C(r12);
                        if (((jVar.f31713l + jVar.f31714m) + iVar.f31703q) - iVar.f31699m < (-f10) && (m0Var2 = (m0) aVar.f2c) != null) {
                            m0Var2.a();
                            return;
                        }
                        return;
                    }
                    if (iVar.f31698l - ((j) qe.l.w(r12)).f31713l < f10 && (m0Var = (m0) aVar.f2c) != null) {
                        m0Var.a();
                    }
                }
            }
        }
    }

    public final void l(int i) {
        c0 c0Var = this.f31731d;
        if (c0Var.f28b.h() != i || c0Var.f29c.h() != 0) {
            androidx.compose.foundation.lazy.layout.b bVar = this.f31738m;
            bVar.d();
            bVar.f521b = null;
        }
        c0Var.a(i, 0);
        c0Var.e = null;
        i0 i0Var = this.f31735j;
        if (i0Var != null) {
            i0Var.k();
        }
    }
}