package com.google.android.gms.internal.ads;
import i0.m;

import java.util.Objects;

/* loaded from: classes.dex */
public final class bu1 {

    /* renamed from: a, reason: collision with root package name */
    public final zw1 f4882a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4883b;

    /* renamed from: c, reason: collision with root package name */
    public final zw1 f4884c;

    /* renamed from: d, reason: collision with root package name */
    public int f4885d = 0;
    public boolean e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4886f = false;

    public bu1(zw1 zw1Var, zw1 zw1Var2, int i) {
        this.f4882a = zw1Var;
        this.f4883b = i;
        this.f4884c = zw1Var2;
    }

    public static boolean l(zw1 zw1Var) {
        if (zw1Var.B != 0) {
            return true;
        }
        return false;
    }

    public static final void n(zw1 zw1Var) {
        boolean z3;
        int i = zw1Var.B;
        if (i == 2) {
            if (i == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.K(z3);
            zw1Var.B = 1;
            zw1Var.h();
        }
    }

    public final void A(long j10, long j11) {
        zw1 zw1Var = this.f4882a;
        if (l(zw1Var)) {
            zw1Var.H(j10, j11);
        }
        zw1 zw1Var2 = this.f4884c;
        if (zw1Var2 != null && zw1Var2.B != 0) {
            zw1Var2.H(j10, j11);
        }
    }

    public final boolean B(lt1 lt1Var) {
        zw1 m4 = m(lt1Var);
        if (m4 != null && !m4.r0() && !m4.I() && !m4.J()) {
            return false;
        }
        return true;
    }

    public final void C() {
        int i;
        zw1 zw1Var = this.f4882a;
        int i10 = zw1Var.B;
        boolean z3 = false;
        if (i10 == 1 && this.f4885d != 4) {
            if (i10 == 1) {
                z3 = true;
            }
            b80.K(z3);
            zw1Var.B = 2;
            zw1Var.g();
            return;
        }
        zw1 zw1Var2 = this.f4884c;
        if (zw1Var2 != null && (i = zw1Var2.B) == 1 && this.f4885d != 3) {
            if (i == 1) {
                z3 = true;
            }
            b80.K(z3);
            zw1Var2.B = 2;
            zw1Var2.g();
        }
    }

    public final void a() {
        boolean z3;
        int i = this.f4885d;
        int i10 = 0;
        if (i != 3 && i != 4) {
            if (i == 2) {
                this.f4885d = 0;
                return;
            }
            return;
        }
        if (i == 4) {
            z3 = true;
        } else {
            z3 = false;
        }
        zw1 zw1Var = this.f4882a;
        zw1 zw1Var2 = this.f4884c;
        if (z3) {
            zw1Var2.getClass();
            zw1Var2.b(17, zw1Var);
        } else {
            zw1Var2.getClass();
            zw1Var.b(17, zw1Var2);
        }
        if (this.f4885d != 4) {
            i10 = 1;
        }
        this.f4885d = i10;
    }

    public final void b() {
        if (!l(this.f4882a)) {
            j(true);
        }
        zw1 zw1Var = this.f4884c;
        if (zw1Var != null && zw1Var.B == 0) {
            j(false);
        }
    }

    public final int c(lt1 lt1Var, u uVar, in0 in0Var) {
        int k3 = k(this.f4882a, lt1Var, uVar, in0Var);
        int k4 = k(this.f4884c, lt1Var, uVar, in0Var);
        if (k3 == 1) {
            return k4;
        }
        return k3;
    }

    public final void d() {
        boolean z3;
        zw1 zw1Var = this.f4882a;
        boolean z9 = true;
        if (zw1Var.B == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        zw1Var.k();
        this.e = false;
        zw1 zw1Var2 = this.f4884c;
        if (zw1Var2 != null) {
            if (zw1Var2.B != 0) {
                z9 = false;
            }
            b80.K(z9);
            zw1Var2.k();
            this.f4886f = false;
        }
    }

    public final void e(Object obj) {
        zw1 zw1Var = this.f4882a;
        if (zw1Var.f13314v != 2) {
            return;
        }
        int i = this.f4885d;
        if (i != 4 && i != 1) {
            zw1Var.b(1, obj);
            return;
        }
        zw1 zw1Var2 = this.f4884c;
        zw1Var2.getClass();
        zw1Var2.b(1, obj);
    }

    public final void f(h1 h1Var) {
        zw1 zw1Var = this.f4882a;
        if (zw1Var.f13314v == 2) {
            zw1Var.b(7, h1Var);
            zw1 zw1Var2 = this.f4884c;
            if (zw1Var2 != null) {
                zw1Var2.b(7, h1Var);
            }
        }
    }

    public final boolean g() {
        int i = this.f4885d;
        if (i != 0 && i != 2 && i != 4) {
            zw1 zw1Var = this.f4884c;
            zw1Var.getClass();
            if (zw1Var.B != 0) {
                return true;
            }
            return false;
        }
        return l(this.f4882a);
    }

    public final boolean h(lt1 lt1Var, zw1 zw1Var) {
        if (zw1Var != null) {
            sy1[] sy1VarArr = lt1Var.f8138c;
            int i = this.f4883b;
            sy1 sy1Var = sy1VarArr[i];
            sy1 sy1Var2 = zw1Var.C;
            if (sy1Var2 != null) {
                if (sy1Var2 != sy1Var || (sy1Var != null && !zw1Var.r0())) {
                    lt1 lt1Var2 = lt1Var.f8146m;
                    if (lt1Var2 == null || lt1Var2.f8138c[i] != zw1Var.C) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void i(zw1 zw1Var, in0 in0Var) {
        boolean z3;
        boolean z9 = true;
        if (this.f4882a == zw1Var || this.f4884c == zw1Var) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.K(z3);
        if (!l(zw1Var)) {
            return;
        }
        if (zw1Var == ((zw1) in0Var.f7182y)) {
            in0Var.f7183z = null;
            in0Var.f7182y = null;
            in0Var.f7178u = true;
        }
        n(zw1Var);
        if (zw1Var.B != 1) {
            z9 = false;
        }
        b80.K(z9);
        m mVar = zw1Var.f13316w;
        mVar.f18055w = null;
        mVar.f18054v = null;
        zw1Var.B = 0;
        zw1Var.C = null;
        zw1Var.D = null;
        zw1Var.H = false;
        zw1Var.i();
        zw1Var.K = null;
        zw1Var.L = -9223372036854775807L;
    }

    public final void j(boolean z3) {
        boolean z9 = true;
        if (z3) {
            if (this.e) {
                zw1 zw1Var = this.f4882a;
                if (zw1Var.B != 0) {
                    z9 = false;
                }
                b80.K(z9);
                m mVar = zw1Var.f13316w;
                mVar.f18055w = null;
                mVar.f18054v = null;
                zw1Var.j();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f4886f) {
            zw1 zw1Var2 = this.f4884c;
            zw1Var2.getClass();
            if (zw1Var2.B != 0) {
                z9 = false;
            }
            b80.K(z9);
            m mVar2 = zw1Var2.f13316w;
            mVar2.f18055w = null;
            mVar2.f18054v = null;
            zw1Var2.j();
            this.f4886f = false;
        }
    }

    public final int k(zw1 zw1Var, lt1 lt1Var, u uVar, in0 in0Var) {
        boolean z3;
        int i;
        int i10;
        if (zw1Var != null && zw1Var.B != 0) {
            zw1 zw1Var2 = this.f4882a;
            if (zw1Var == zw1Var2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (zw1Var == zw1Var2 && ((i10 = this.f4885d) == 2 || i10 == 4)) {
                return 1;
            }
            if (zw1Var == this.f4884c && this.f4885d == 3) {
                return 1;
            }
            sy1 sy1Var = zw1Var.C;
            sy1[] sy1VarArr = lt1Var.f8138c;
            int i11 = this.f4883b;
            sy1 sy1Var2 = sy1VarArr[i11];
            boolean c10 = uVar.c(i11);
            if (!c10 || sy1Var != sy1Var2) {
                if (!zw1Var.H) {
                    r rVar = ((r[]) uVar.f11499w)[i11];
                    if (rVar != null) {
                        i = rVar.a();
                    } else {
                        i = 0;
                    }
                    mw1[] mw1VarArr = new mw1[i];
                    for (int i12 = 0; i12 < i; i12++) {
                        rVar.getClass();
                        mw1VarArr[i12] = rVar.w(i12);
                    }
                    sy1 sy1Var3 = sy1VarArr[i11];
                    sy1Var3.getClass();
                    zw1Var.p0(mw1VarArr, sy1Var3, lt1Var.a(), lt1Var.f8149p, lt1Var.f8141g.f8413a);
                    return 3;
                }
                if (!zw1Var.J()) {
                    return 0;
                }
                i(zw1Var, in0Var);
                if (!c10 || q()) {
                    j(!z3);
                    return 1;
                }
            }
        }
        return 1;
    }

    public final zw1 m(lt1 lt1Var) {
        if (lt1Var != null) {
            sy1 sy1Var = lt1Var.f8138c[this.f4883b];
            if (sy1Var != null) {
                zw1 zw1Var = this.f4882a;
                if (zw1Var.C == sy1Var) {
                    return zw1Var;
                }
                zw1 zw1Var2 = this.f4884c;
                if (zw1Var2 != null && zw1Var2.C == sy1Var) {
                    return zw1Var2;
                }
            }
        }
        return null;
    }

    public final boolean o() {
        return this.f4884c != null;
    }

    public final void p() {
        int i;
        b80.K(!q());
        if (l(this.f4882a)) {
            i = 3;
        } else {
            i = 2;
            zw1 zw1Var = this.f4884c;
            if (zw1Var != null && zw1Var.B != 0) {
                i = 4;
            }
        }
        this.f4885d = i;
    }

    public final boolean q() {
        int i = this.f4885d;
        if (i != 2 && i != 4 && i != 3) {
            return false;
        }
        return true;
    }

    public final int r() {
        boolean l10 = l(this.f4882a);
        int i = 0;
        zw1 zw1Var = this.f4884c;
        if (zw1Var != null && zw1Var.B != 0) {
            i = 1;
        }
        return (l10 ? 1 : 0) + i;
    }

    public final boolean s(lt1 lt1Var) {
        zw1 m4 = m(lt1Var);
        m4.getClass();
        return m4.r0();
    }

    public final void t(lt1 lt1Var) {
        zw1 m4 = m(lt1Var);
        m4.getClass();
        m4.H = true;
    }

    public final void u(u uVar, u uVar2) {
        int i;
        int i10 = this.f4883b;
        boolean c10 = uVar.c(i10);
        boolean c11 = uVar2.c(i10);
        zw1 zw1Var = this.f4882a;
        zw1 zw1Var2 = this.f4884c;
        if (zw1Var2 == null || (i = this.f4885d) == 3 || (i == 0 && l(zw1Var))) {
            zw1Var2 = zw1Var;
        }
        if (c10 && !zw1Var2.H) {
            int i11 = zw1Var.f13314v;
            au1 au1Var = ((au1[]) uVar.f11498v)[i10];
            au1 au1Var2 = ((au1[]) uVar2.f11498v)[i10];
            if (!c11 || !Objects.equals(au1Var2, au1Var) || q()) {
                zw1Var2.H = true;
            }
        }
    }

    public final void v() {
        int i;
        zw1 zw1Var = this.f4882a;
        if (l(zw1Var) && (i = this.f4885d) != 4 && i != 2) {
            zw1Var.H = true;
        }
        zw1 zw1Var2 = this.f4884c;
        if (zw1Var2 != null && zw1Var2.B != 0 && this.f4885d != 3) {
            zw1Var2.H = true;
        }
    }

    public final void w() {
        zw1 zw1Var = this.f4882a;
        if (l(zw1Var)) {
            zw1Var.s();
            return;
        }
        zw1 zw1Var2 = this.f4884c;
        if (zw1Var2 != null && zw1Var2.B != 0) {
            zw1Var2.s();
        }
    }

    public final boolean x() {
        boolean z3;
        zw1 zw1Var = this.f4882a;
        if (l(zw1Var)) {
            z3 = zw1Var.J();
        } else {
            z3 = true;
        }
        zw1 zw1Var2 = this.f4884c;
        if (zw1Var2 != null && zw1Var2.B != 0) {
            return z3 & zw1Var2.J();
        }
        return z3;
    }

    public final boolean y(lt1 lt1Var) {
        boolean z3;
        boolean z9;
        int i = this.f4885d;
        if ((i != 2 && i != 4) || m(lt1Var) != this.f4882a) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (this.f4885d == 3 && m(lt1Var) == this.f4884c) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z3 || z9) {
            return true;
        }
        return false;
    }

    public final boolean z(lt1 lt1Var) {
        if (h(lt1Var, this.f4882a) && h(lt1Var, this.f4884c)) {
            return true;
        }
        return false;
    }
}
