package z1;
import a.a;
import b1.i;
import b1.p;
import b1.w;
import j0.h;
import l.a;
import n.f0;
import n.i0;
import n.j0;
import n.p0;
import n.t0;
import q.x;
import r.m1;
import r0.j;
import r0.u;
import r0.x;
import r0.y;
import t0.b;
import t0.e;

import android.os.Handler;
import b2.t1;
import java.util.List;

/* loaded from: classes.dex */
public final class j0 implements j {
    public final i0 A;
    public final e0 B;
    public final b0 C;
    public final i0 D;
    public final t0 E;
    public final i0 F;
    public final e G;
    public int H;
    public int I;
    public final String J;

    /* renamed from: u, reason: collision with root package name */
    public final b2.i0 f31828u;

    /* renamed from: v, reason: collision with root package name */
    public u f31829v;

    /* renamed from: w, reason: collision with root package name */
    public m1 f31830w;

    /* renamed from: x, reason: collision with root package name */
    public int f31831x;

    /* renamed from: y, reason: collision with root package name */
    public int f31832y;

    /* renamed from: z, reason: collision with root package name */
    public final i0 f31833z;

    public j0(b2.i0 i0Var, m1 m1Var) {
        this.f31828u = i0Var;
        this.f31830w = m1Var;
        long[] jArr = p0.f20923a;
        this.f31833z = new i0();
        this.A = new i0();
        this.B = new e0(this);
        this.C = new b0(this);
        this.D = new i0();
        this.E = new t0();
        this.F = new i0();
        this.G = new e(new Object[16]);
        this.J = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }

    @Override // j
    public final void a() {
        x xVar;
        b2.i0 i0Var = this.f31828u;
        i0Var.K = true;
        i0 i0Var2 = this.f31833z;
        Object[] objArr = i0Var2.f20894c;
        long[] jArr = i0Var2.f20892a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j10 = jArr[i];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j10) < 128 && (xVar = ((c0) objArr[(i << 3) + i11]).f31784c) != null) {
                            xVar.l();
                        }
                        j10 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i0Var.P();
        i0Var.K = false;
        i0Var2.a();
        this.A.a();
        this.I = 0;
        this.H = 0;
        this.D.a();
        d();
    }

    @Override // j
    public final void b() {
        e(true);
    }

    public final void c(int i) {
        boolean z3;
        df.l lVar;
        boolean z9 = false;
        this.H = 0;
        List o10 = this.f31828u.o();
        b bVar = (b) o10;
        int i10 = (bVar.f25611u.f25619w - this.I) - 1;
        if (i <= i10) {
            this.E.clear();
            if (i <= i10) {
                int i11 = i;
                while (true) {
                    Object g8 = this.f31833z.g((b2.i0) bVar.get(i11));
                    g8.getClass();
                    ((f0) this.E.f20946v).a(((c0) g8).f31782a);
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f31830w.c(this.E);
            i d2 = w.d();
            if (d2 != null) {
                lVar = d2.e();
            } else {
                lVar = null;
            }
            i g10 = w.g(d2);
            z3 = false;
            while (i10 >= i) {
                try {
                    b2.i0 i0Var = (b2.i0) ((b) o10).get(i10);
                    Object g11 = this.f31833z.g(i0Var);
                    g11.getClass();
                    c0 c0Var = (c0) g11;
                    Object obj = c0Var.f31782a;
                    if (((f0) this.E.f20946v).c(obj)) {
                        this.H++;
                        if (((Boolean) c0Var.f31786f.getValue()).booleanValue()) {
                            b2.n0 n0Var = i0Var.f1478a0;
                            b2.a1 a1Var = n0Var.f1558p;
                            b2.g0 g0Var = b2.g0.f1468w;
                            a1Var.F = g0Var;
                            b2.w0 w0Var = n0Var.f1559q;
                            if (w0Var != null) {
                                w0Var.D = g0Var;
                            }
                            g(c0Var, false);
                            if (c0Var.f31787g) {
                                z3 = true;
                            }
                        }
                    } else {
                        b2.i0 i0Var2 = this.f31828u;
                        i0Var2.K = true;
                        this.f31833z.k(i0Var);
                        x xVar = c0Var.f31784c;
                        if (xVar != null) {
                            xVar.l();
                        }
                        this.f31828u.Q(i10, 1);
                        i0Var2.K = false;
                    }
                    this.A.k(obj);
                    i10--;
                } catch (Throwable th) {
                    w.j(d2, g10, lVar);
                    throw th;
                }
            }
            w.j(d2, g10, lVar);
        } else {
            z3 = false;
        }
        if (z3) {
            synchronized (p.f1387c) {
                n.j0 j0Var = p.f1392j.f1323h;
                if (j0Var != null) {
                    if (j0Var.h()) {
                        z9 = true;
                    }
                }
            }
            if (z9) {
                p.a();
            }
        }
        d();
    }

    public final void d() {
        int i = ((b) this.f31828u.o()).f25611u.f25619w;
        i0 i0Var = this.f31833z;
        if (i0Var.e != i) {
            y1.a("Inconsistency between the count of nodes tracked by the state (" + i0Var.e + ") and the children count on the SubcomposeLayout (" + i + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if ((i - this.H) - this.I < 0) {
            StringBuilder m4 = g3.a.m("Incorrect state. Total children ", i, ". Reusable children ");
            m4.append(this.H);
            m4.append(". Precomposed children ");
            m4.append(this.I);
            y1.a(m4.toString());
        }
        i0 i0Var2 = this.D;
        if (i0Var2.e == this.I) {
            return;
        }
        y1.a("Incorrect state. Precomposed children " + this.I + ". Map size " + i0Var2.e);
    }

    public final void e(boolean z3) {
        df.l lVar;
        this.I = 0;
        this.D.a();
        List o10 = this.f31828u.o();
        int i = ((b) o10).f25611u.f25619w;
        if (this.H != i) {
            this.H = i;
            i d2 = w.d();
            if (d2 != null) {
                lVar = d2.e();
            } else {
                lVar = null;
            }
            i g8 = w.g(d2);
            for (int i10 = 0; i10 < i; i10++) {
                try {
                    b2.i0 i0Var = (b2.i0) ((b) o10).get(i10);
                    c0 c0Var = (c0) this.f31833z.g(i0Var);
                    if (c0Var != null && ((Boolean) c0Var.f31786f.getValue()).booleanValue()) {
                        b2.n0 n0Var = i0Var.f1478a0;
                        b2.a1 a1Var = n0Var.f1558p;
                        b2.g0 g0Var = b2.g0.f1468w;
                        a1Var.F = g0Var;
                        b2.w0 w0Var = n0Var.f1559q;
                        if (w0Var != null) {
                            w0Var.D = g0Var;
                        }
                        g(c0Var, z3);
                        c0Var.f31782a = h1.f31820a;
                    }
                } catch (Throwable th) {
                    w.j(d2, g8, lVar);
                    throw th;
                }
            }
            w.j(d2, g8, lVar);
            this.A.a();
        }
        d();
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [z1.i1, java.lang.Object] */
    public final i1 f(df.p pVar, Object obj) {
        b2.i0 i0Var = this.f31828u;
        if (i0Var.I()) {
            d();
            if (!this.A.c(obj)) {
                this.F.k(obj);
                i0 i0Var2 = this.D;
                Object g8 = i0Var2.g(obj);
                if (g8 == null) {
                    g8 = i(obj);
                    if (g8 != null) {
                        int l10 = ((b) i0Var.o()).f25611u.l(g8);
                        int i = ((b) i0Var.o()).f25611u.f25619w;
                        i0Var.K = true;
                        i0Var.M(l10, i, 1);
                        i0Var.K = false;
                        this.I++;
                    } else {
                        int i10 = ((b) i0Var.o()).f25611u.f25619w;
                        b2.i0 i0Var3 = new b2.i0(2);
                        i0Var.K = true;
                        i0Var.B(i10, i0Var3);
                        i0Var.K = false;
                        this.I++;
                        g8 = i0Var3;
                    }
                    i0Var2.m(obj, g8);
                }
                h((b2.i0) g8, obj, pVar);
            }
        }
        if (!i0Var.I()) {
            return new Object();
        }
        return new i0(this, obj);
    }

    public final void g(c0 c0Var, boolean z3) {
        x xVar;
        if (!z3 && c0Var.f31787g) {
            c0Var.f31786f.setValue(Boolean.FALSE);
        } else {
            c0Var.f31786f = y.B(Boolean.FALSE);
        }
        c0Var.getClass();
        if (z3) {
            x xVar2 = c0Var.f31784c;
            if (xVar2 != null) {
                xVar2.k();
                return;
            }
            return;
        }
        t1 outOfFrameExecutor = ((c2.x) b2.m0.a(this.f31828u)).getOutOfFrameExecutor();
        if (outOfFrameExecutor != null) {
            m1 m1Var = new m1(9, c0Var);
            Handler handler = ((c2.x) outOfFrameExecutor).getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(new a6.e(5, m1Var));
                return;
            } else {
                x.n("schedule is called when outOfFrameExecutor is not available (view is detached)");
                return;
            }
        }
        if (!c0Var.f31787g && (xVar = c0Var.f31784c) != null) {
            xVar.k();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00dc), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00dc), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c3 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00dc), top: B:26:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:27:0x005c, B:30:0x0068, B:35:0x0082, B:37:0x0094, B:38:0x00a8, B:40:0x00ac, B:41:0x00c6, B:44:0x00c3, B:45:0x0097, B:47:0x0075, B:48:0x00d0, B:49:0x00dc), top: B:26:0x005c }] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, z1.c0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(b2.i0 r10, java.lang.Object r11, df.p r12) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.h(b2.i0, java.lang.Object, df.p):void");
    }

    public final b2.i0 i(Object obj) {
        i0 i0Var;
        int i;
        if (this.H != 0) {
            b2.i0 i0Var2 = this.f31828u;
            b bVar = (b) i0Var2.o();
            int i10 = bVar.f25611u.f25619w - this.I;
            int i11 = i10 - this.H;
            int i12 = i10 - 1;
            int i13 = i12;
            while (true) {
                i0Var = this.f31833z;
                if (i13 >= i11) {
                    Object g8 = i0Var.g((b2.i0) bVar.get(i13));
                    g8.getClass();
                    if (kotlin.jvm.internal.a(((c0) g8).f31782a, obj)) {
                        i = i13;
                        break;
                    }
                    i13--;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                while (i12 >= i11) {
                    Object g10 = i0Var.g((b2.i0) bVar.get(i12));
                    g10.getClass();
                    c0 c0Var = (c0) g10;
                    Object obj2 = c0Var.f31782a;
                    if (obj2 != h1.f31820a && !this.f31830w.a(obj, obj2)) {
                        i12--;
                    } else {
                        c0Var.f31782a = obj;
                        i13 = i12;
                        i = i13;
                        break;
                    }
                }
                i13 = i12;
            }
            if (i == -1) {
                return null;
            }
            if (i13 != i11) {
                i0Var2.K = true;
                i0Var2.M(i13, i11, 1);
                i0Var2.K = false;
            }
            this.H--;
            b2.i0 i0Var3 = (b2.i0) bVar.get(i11);
            Object g11 = i0Var.g(i0Var3);
            g11.getClass();
            c0 c0Var2 = (c0) g11;
            c0Var2.f31786f = y.B(Boolean.TRUE);
            c0Var2.e = true;
            c0Var2.f31785d = true;
            return i0Var3;
        }
        return null;
    }
}
