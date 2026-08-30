package c0;
import a0.h0;
import b.b;
import b0.e;
import b0.f0;
import b0.i0;
import b0.k0;
import b0.m0;
import b0.n0;
import c0.c0;
import c0.e0;
import c0.g0;
import c0.x;
import c0.z;
import q.r0;
import t.l;
import v.i;
import w.a;

import java.util.List;
import r.u0;
import r0.a1;
import r0.e1;
import r0.f1;
import r0.i1;
import r0.v0;
import t.s1;
import wa.b9;

/* loaded from: classes.dex */
public abstract class i0 implements s1 {
    public long A;
    public final k0 B;
    public final a1 C;
    public final a1 D;
    public final i1 E;
    public final i1 F;
    public final i1 G;
    public final i1 H;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3332a;

    /* renamed from: b, reason: collision with root package name */
    public x f3333b;

    /* renamed from: c, reason: collision with root package name */
    public final i1 f3334c;

    /* renamed from: d, reason: collision with root package name */
    public final z f3335d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public int f3336f;

    /* renamed from: g, reason: collision with root package name */
    public long f3337g;

    /* renamed from: h, reason: collision with root package name */
    public long f3338h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f3339j;

    /* renamed from: k, reason: collision with root package name */
    public final l f3340k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3341l;

    /* renamed from: m, reason: collision with root package name */
    public int f3342m;

    /* renamed from: n, reason: collision with root package name */
    public m0 f3343n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3344o;

    /* renamed from: p, reason: collision with root package name */
    public final i1 f3345p;

    /* renamed from: q, reason: collision with root package name */
    public y2.c f3346q;

    /* renamed from: r, reason: collision with root package name */
    public final i f3347r;

    /* renamed from: s, reason: collision with root package name */
    public final f1 f3348s;

    /* renamed from: t, reason: collision with root package name */
    public final f1 f3349t;

    /* renamed from: u, reason: collision with root package name */
    public final r0.g0 f3350u;

    /* renamed from: v, reason: collision with root package name */
    public final n0 f3351v;

    /* renamed from: w, reason: collision with root package name */
    public final pd.c f3352w;

    /* renamed from: x, reason: collision with root package name */
    public final e f3353x;

    /* renamed from: y, reason: collision with root package name */
    public final i1 f3354y;

    /* renamed from: z, reason: collision with root package name */
    public final h0 f3355z;

    /* JADX WARN: Type inference failed for: r0v5, types: [z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [e, java.lang.Object] */
    public i0(int i, float f10) {
        double d2 = f10;
        if (-0.5d > d2 || d2 > 0.5d) {
            a.a("currentPageOffsetFraction " + f10 + " is not within the range -0.5 to 0.5");
        }
        this.f3334c = r0.y.B(new j1.b(0L));
        Object obj = new Object();
        obj.f3437v = this;
        obj.f3438w = new f1(i);
        obj.f3439x = new e1(f10);
        obj.f3441z = new b0.i0(i, 30, 100);
        this.f3335d = obj;
        this.e = i;
        this.f3337g = Long.MAX_VALUE;
        this.f3340k = new l(new f0(this, 1));
        this.f3341l = true;
        this.f3342m = -1;
        this.f3345p = new i1(m0.f3375b, v0.f24418w);
        this.f3346q = m0.f3376c;
        this.f3347r = new i();
        this.f3348s = new f1(-1);
        this.f3349t = new f1(i);
        v0 v0Var = v0.f24421z;
        this.f3350u = r0.y.s(new h0(this, 0), v0Var);
        r0.y.s(new h0(this, 1), v0Var);
        this.f3351v = new n0(new f0(this, 0));
        this.f3352w = new pd.c(2, false);
        this.f3353x = new Object();
        this.f3354y = r0.y.B(null);
        this.f3355z = new h0(this, 1);
        this.A = y2.b(0, 0, 15);
        this.B = new k0();
        this.C = f0.h();
        this.D = f0.h();
        Boolean bool = Boolean.FALSE;
        this.E = r0.y.B(bool);
        this.F = r0.y.B(bool);
        this.G = r0.y.B(bool);
        this.H = r0.y.B(bool);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        if (r9.e(r7, r8, r0) != r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        if (r9 == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object s(c0.i0 r6, u0 r7, df.p r8, te.c r9) {
        /*
            boolean r0 = r9 instanceof g0
            if (r0 == 0) goto L13
            r0 = r9
            g0 r0 = (g0) r0
            int r1 = r0.f3322z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3322z = r1
            goto L18
        L13:
            g0 r0 = new g0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f3320x
            int r1 = r0.f3322z
            pe.z r2 = pe.z.f22715a
            r3 = 2
            r4 = 1
            ue.a r5 = ue.a.f27192u
            if (r1 == 0) goto L42
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2e
            c0.i0 r6 = r0.f3317u
            pe.a.e(r9)
            goto L80
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r6)
            r6 = 0
            return r6
        L35:
            ve.i r6 = r0.f3319w
            r8 = r6
            df.p r8 = (df.p) r8
            u0 r7 = r0.f3318v
            c0.i0 r6 = r0.f3317u
            pe.a.e(r9)
            goto L5d
        L42:
            pe.a.e(r9)
            r0.f3317u = r6
            r0.f3318v = r7
            r9 = r8
            ve.i r9 = (ve.i) r9
            r0.f3319w = r9
            r0.f3322z = r4
            e r9 = r6.f3353x
            java.lang.Object r9 = r9.f(r0)
            if (r9 != r5) goto L59
            goto L5a
        L59:
            r9 = r2
        L5a:
            if (r9 != r5) goto L5d
            goto L7f
        L5d:
            l r9 = r6.f3340k
            boolean r9 = r9.a()
            if (r9 != 0) goto L6e
            int r9 = r6.j()
            r0.f1 r1 = r6.f3349t
            r1.i(r9)
        L6e:
            l r9 = r6.f3340k
            r0.f3317u = r6
            r1 = 0
            r0.f3318v = r1
            r0.f3319w = r1
            r0.f3322z = r3
            java.lang.Object r7 = r9.e(r7, r8, r0)
            if (r7 != r5) goto L80
        L7f:
            return r5
        L80:
            r7 = -1
            r0.f1 r6 = r6.f3348s
            r6.i(r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.i0.s(c0.i0, u0, df.p, te.c):java.lang.Object");
    }

    @Override // s1
    public final boolean a() {
        return this.f3340k.a();
    }

    @Override // s1
    public final boolean b() {
        return ((Boolean) this.F.getValue()).booleanValue();
    }

    @Override // s1
    public final boolean c() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    @Override // s1
    public final float d(float f10) {
        return this.f3340k.d(f10);
    }

    @Override // s1
    public final Object e(u0 u0Var, df.p pVar, te.c cVar) {
        return s(this, u0Var, pVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r18, r0 r19, ve.c r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            boolean r3 = r2 instanceof c0
            if (r3 == 0) goto L19
            r3 = r2
            c0 r3 = (c0) r3
            int r4 = r3.f3292z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f3292z = r4
            goto L1e
        L19:
            c0 r3 = new c0
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f3290x
            int r4 = r3.f3292z
            r5 = 0
            pe.z r6 = pe.z.f22715a
            r7 = 2
            r8 = 1
            ue.a r9 = ue.a.f27192u
            if (r4 == 0) goto L46
            if (r4 == r8) goto L3a
            if (r4 != r7) goto L33
            pe.a.e(r2)
            return r6
        L33:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            x.o(r1)
            r1 = 0
            return r1
        L3a:
            int r1 = r3.f3289w
            r0 r4 = r3.f3288v
            c0.i0 r8 = r3.f3287u
            pe.a.e(r2)
            r14 = r4
            r11 = r8
            goto L78
        L46:
            pe.a.e(r2)
            int r2 = r0.j()
            if (r1 != r2) goto L58
            float r2 = r0.k()
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L58
            goto Lbd
        L58:
            int r2 = r0.m()
            if (r2 != 0) goto L5f
            goto Lbd
        L5f:
            r3.f3287u = r0
            r2 = r19
            r3.f3288v = r2
            r3.f3289w = r1
            r3.f3292z = r8
            e r4 = r0.f3353x
            java.lang.Object r4 = r4.f(r3)
            if (r4 != r9) goto L72
            goto L73
        L72:
            r4 = r6
        L73:
            if (r4 != r9) goto L76
            goto Lbc
        L76:
            r11 = r0
            r14 = r2
        L78:
            double r12 = (double) r5
            r15 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r2 = (r15 > r12 ? 1 : (r15 == r12 ? 0 : -1))
            if (r2 > 0) goto L86
            r15 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r2 > 0) goto L86
            goto L9c
        L86:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "pageOffsetFraction "
            r2.<init>(r4)
            r2.append(r5)
            java.lang.String r4 = " is not within the range -0.5 to 0.5"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            a.a(r2)
        L9c:
            int r12 = r11.i(r1)
            int r1 = r11.o()
            float r1 = (float) r1
            float r13 = r5 * r1
            e0 r10 = new e0
            r15 = 0
            r10.<init>(r11, r12, r13, r14, r15)
            r1 = 0
            r3.f3287u = r1
            r3.f3288v = r1
            r3.f3292z = r7
            u0 r1 = u0.f24148u
            java.lang.Object r1 = r11.e(r1, r10, r3)
            if (r1 != r9) goto Lbd
        Lbc:
            return r9
        Lbd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.i0.f(int, r0, ve.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x012a A[Catch: all -> 0x0130, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:28:0x00cd, B:30:0x00e0, B:32:0x00e4, B:34:0x00f0, B:38:0x012a, B:40:0x0120, B:44:0x0108), top: B:27:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(x r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c0.i0.h(x, boolean, boolean):void");
    }

    public final int i(int i) {
        if (m() <= 0) {
            return 0;
        }
        return b9.e(i, 0, m() - 1);
    }

    public final int j() {
        return ((f1) this.f3335d.f3438w).h();
    }

    public final float k() {
        return ((e1) this.f3335d.f3439x).h();
    }

    public final x l() {
        return (x) this.f3345p.getValue();
    }

    public abstract int m();

    public final int n() {
        return ((x) this.f3345p.getValue()).f3420b;
    }

    public final int o() {
        return ((x) this.f3345p.getValue()).f3421c + n();
    }

    public final long p() {
        return ((j1.b) this.f3334c.getValue()).f18762a;
    }

    public final boolean q() {
        if (((int) Float.intBitsToFloat((int) (p() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (p() & 4294967295L))) == 0) {
            return true;
        }
        return false;
    }

    public final void r(float f10, x xVar) {
        boolean z3;
        int i;
        m0 m0Var;
        m0 m0Var2;
        m0 m0Var3;
        if (this.f3341l) {
            List list = xVar.f3419a;
            if (!list.isEmpty()) {
                if (f10 > 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    i = ((j) qe.l.C(list)).f3356a + 1;
                } else {
                    i = ((j) qe.l.w(list)).f3356a - 1;
                }
                if (i >= 0 && i < m()) {
                    if (i != this.f3342m) {
                        if (this.f3344o != z3 && (m0Var3 = this.f3343n) != null) {
                            m0Var3.cancel();
                        }
                        this.f3344o = z3;
                        this.f3342m = i;
                        this.f3343n = this.f3351v.a(i, this.A);
                    }
                    if (z3) {
                        if ((((j) qe.l.C(list)).f3365l + (xVar.f3420b + xVar.f3421c)) - xVar.f3424g < f10 && (m0Var2 = this.f3343n) != null) {
                            m0Var2.a();
                            return;
                        }
                        return;
                    }
                    if (xVar.f3423f - ((j) qe.l.w(list)).f3365l < (-f10) && (m0Var = this.f3343n) != null) {
                        m0Var.a();
                    }
                }
            }
        }
    }

    public final void t(int i, float f10, boolean z3) {
        z zVar = this.f3335d;
        ((f1) zVar.f3438w).i(i);
        ((b0.i0) zVar.f3441z).a(i);
        ((e1) zVar.f3439x).i(f10);
        zVar.f3440y = null;
        if (z3) {
            b2.i0 i0Var = (b2.i0) this.f3354y.getValue();
            if (i0Var != null) {
                i0Var.k();
                return;
            }
            return;
        }
        this.D.setValue(pe.z.f22715a);
    }
}