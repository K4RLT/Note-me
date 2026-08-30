package k0;
import a1.s;
import a1.t;
import e1.h;
import g0.a1;
import g0.b;
import j1.c;
import k0.e1;
import m.g;
import m.h;
import p0.d;
import p0.e;

import g0.g2;
import java.util.List;

/* loaded from: classes.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final m2.g f19264a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19265b;

    /* renamed from: c, reason: collision with root package name */
    public final m2.m0 f19266c;

    /* renamed from: d, reason: collision with root package name */
    public final r2.q f19267d;
    public final n1 e;

    /* renamed from: f, reason: collision with root package name */
    public long f19268f;

    /* renamed from: g, reason: collision with root package name */
    public final m2.g f19269g;

    /* renamed from: h, reason: collision with root package name */
    public final r2.x f19270h;
    public final g2 i;

    public e1(r2.x xVar, r2.q qVar, g2 g2Var, n1 n1Var) {
        m2.m0 m0Var;
        m2.g gVar = xVar.f24515a;
        long j10 = xVar.f24516b;
        if (g2Var != null) {
            m0Var = g2Var.f17113a;
        } else {
            m0Var = null;
        }
        this.f19264a = gVar;
        this.f19265b = j10;
        this.f19266c = m0Var;
        this.f19267d = qVar;
        this.e = n1Var;
        this.f19268f = j10;
        this.f19269g = gVar;
        this.f19270h = xVar;
        this.i = g2Var;
    }

    public final List a(df.l lVar) {
        if (m2.b(this.f19268f)) {
            r2.g gVar = (r2.g) lVar.invoke(this);
            if (gVar != null) {
                return qe.g(gVar);
            }
            return null;
        }
        return qe.h(new r2.a("", 0), new r2.w(m2.e(this.f19268f), m2.e(this.f19268f)));
    }

    public final Integer b() {
        m2.m0 m0Var = this.f19266c;
        if (m0Var != null) {
            m2.q qVar = m0Var.f20525b;
            int d2 = m2.d(this.f19268f);
            r2.q qVar2 = this.f19267d;
            return Integer.valueOf(qVar2.c(qVar.c(qVar.d(qVar2.g(d2)), true)));
        }
        return null;
    }

    public final Integer c() {
        m2.m0 m0Var = this.f19266c;
        if (m0Var != null) {
            int e = m2.e(this.f19268f);
            r2.q qVar = this.f19267d;
            return Integer.valueOf(qVar.c(m0Var.h(m0Var.f20525b.d(qVar.g(e)))));
        }
        return null;
    }

    public final Integer d() {
        int length;
        m2.m0 m0Var = this.f19266c;
        if (m0Var != null) {
            int q10 = q();
            while (true) {
                m2.g gVar = this.f19264a;
                if (q10 >= gVar.f20477v.length()) {
                    length = gVar.f20477v.length();
                    break;
                }
                int length2 = this.f19269g.f20477v.length() - 1;
                if (q10 <= length2) {
                    length2 = q10;
                }
                long k3 = m0Var.k(length2);
                int i = m2.p0.f20545c;
                int i10 = (int) (k3 & 4294967295L);
                if (i10 <= q10) {
                    q10++;
                } else {
                    length = this.f19267d.c(i10);
                    break;
                }
            }
            return Integer.valueOf(length);
        }
        return null;
    }

    public final Integer e() {
        int i;
        m2.m0 m0Var = this.f19266c;
        if (m0Var != null) {
            int q10 = q();
            while (true) {
                if (q10 <= 0) {
                    i = 0;
                    break;
                }
                int length = this.f19269g.f20477v.length() - 1;
                if (q10 <= length) {
                    length = q10;
                }
                long k3 = m0Var.k(length);
                int i10 = m2.p0.f20545c;
                int i11 = (int) (k3 >> 32);
                if (i11 >= q10) {
                    q10--;
                } else {
                    i = this.f19267d.c(i11);
                    break;
                }
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public final boolean f() {
        x2.j jVar;
        m2.m0 m0Var = this.f19266c;
        if (m0Var != null) {
            jVar = m0Var.i(q());
        } else {
            jVar = null;
        }
        if (jVar != x2.j.f30058v) {
            return true;
        }
        return false;
    }

    public final int g(m2.m0 m0Var, int i) {
        int q10 = q();
        n1 n1Var = this.e;
        if (n1Var.f19375a == null) {
            n1Var.f19375a = Float.valueOf(m0Var.c(q10).f18763a);
        }
        m2.q qVar = m0Var.f20525b;
        int d2 = qVar.d(q10) + i;
        if (d2 < 0) {
            return 0;
        }
        if (d2 >= qVar.f20551f) {
            return this.f19269g.f20477v.length();
        }
        float b10 = qVar.b(d2) - 1;
        Float f10 = n1Var.f19375a;
        f10.getClass();
        float floatValue = f10.floatValue();
        if ((f() && floatValue >= m0Var.g(d2)) || (!f() && floatValue <= m0Var.f(d2))) {
            return qVar.c(d2, true);
        }
        return this.f19267d.c(qVar.g((Float.floatToRawIntBits(b10) & 4294967295L) | (Float.floatToRawIntBits(f10.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(g2 r9, int r10) {
        /*
            r8 = this;
            z1.x r0 = r9.f17114b
            m2.m0 r1 = r9.f17113a
            if (r0 == 0) goto L13
            z1.x r9 = r9.f17115c
            if (r9 == 0) goto L10
            r2 = 1
            c r9 = r9.u(r0, r2)
            goto L11
        L10:
            r9 = 0
        L11:
            if (r9 != 0) goto L15
        L13:
            c r9 = c.e
        L15:
            r2.x r0 = r8.f19270h
            long r2 = r0.f24516b
            int r0 = m2.p0.f20545c
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r0 = (int) r2
            r2.q r2 = r8.f19267d
            int r0 = r2.g(r0)
            c r0 = r1.c(r0)
            float r3 = r0.f18763a
            float r0 = r0.f18764b
            long r6 = r9.c()
            long r6 = r6 & r4
            int r9 = (int) r6
            float r9 = java.lang.Float.intBitsToFloat(r9)
            float r10 = (float) r10
            float r9 = r9 * r10
            float r9 = r9 + r0
            int r10 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r10
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r9 = (long) r9
            r0 = 32
            long r6 = r6 << r0
            long r9 = r9 & r4
            long r9 = r9 | r6
            m2.q r0 = r1.f20525b
            int r9 = g(r9)
            int r9 = r2.c(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.e1.h(g2, int):int");
    }

    public final void i() {
        n1 n1Var = this.e;
        n1Var.f19375a = null;
        m2.g gVar = this.f19269g;
        if (gVar.f20477v.length() > 0) {
            if (f()) {
                n1Var.f19375a = null;
                if (gVar.f20477v.length() > 0) {
                    String str = gVar.f20477v;
                    long j10 = this.f19268f;
                    int i = m2.p0.f20545c;
                    int v2 = a1.v((int) (j10 & 4294967295L), str);
                    if (v2 != -1) {
                        p(v2, v2);
                        return;
                    }
                    return;
                }
                return;
            }
            n1Var.f19375a = null;
            if (gVar.f20477v.length() > 0) {
                String str2 = gVar.f20477v;
                long j11 = this.f19268f;
                int i10 = m2.p0.f20545c;
                int s10 = a1.s((int) (j11 & 4294967295L), str2);
                if (s10 != -1) {
                    p(s10, s10);
                }
            }
        }
    }

    public final void j() {
        this.e.f19375a = null;
        m2.g gVar = this.f19269g;
        String str = gVar.f20477v;
        String str2 = gVar.f20477v;
        if (str.length() > 0) {
            int t3 = a1.t(str2, m2.d(this.f19268f));
            if (t3 == m2.d(this.f19268f) && t3 != str2.length()) {
                t3 = a1.t(str2, t3 + 1);
            }
            p(t3, t3);
        }
    }

    public final void k() {
        this.e.f19375a = null;
        m2.g gVar = this.f19269g;
        String str = gVar.f20477v;
        String str2 = gVar.f20477v;
        if (str.length() > 0) {
            int u9 = a1.u(str2, m2.e(this.f19268f));
            if (u9 == m2.e(this.f19268f) && u9 != 0) {
                u9 = a1.u(str2, u9 - 1);
            }
            p(u9, u9);
        }
    }

    public final void l() {
        n1 n1Var = this.e;
        n1Var.f19375a = null;
        m2.g gVar = this.f19269g;
        if (gVar.f20477v.length() > 0) {
            if (f()) {
                n1Var.f19375a = null;
                if (gVar.f20477v.length() > 0) {
                    String str = gVar.f20477v;
                    long j10 = this.f19268f;
                    int i = m2.p0.f20545c;
                    int s10 = a1.s((int) (j10 & 4294967295L), str);
                    if (s10 != -1) {
                        p(s10, s10);
                        return;
                    }
                    return;
                }
                return;
            }
            n1Var.f19375a = null;
            if (gVar.f20477v.length() > 0) {
                String str2 = gVar.f20477v;
                long j11 = this.f19268f;
                int i10 = m2.p0.f20545c;
                int v2 = a1.v((int) (j11 & 4294967295L), str2);
                if (v2 != -1) {
                    p(v2, v2);
                }
            }
        }
    }

    public final void m() {
        Integer b10;
        this.e.f19375a = null;
        if (this.f19269g.f20477v.length() > 0 && (b10 = b()) != null) {
            int intValue = b10.intValue();
            p(intValue, intValue);
        }
    }

    public final void n() {
        Integer c10;
        this.e.f19375a = null;
        if (this.f19269g.f20477v.length() > 0 && (c10 = c()) != null) {
            int intValue = c10.intValue();
            p(intValue, intValue);
        }
    }

    public final void o() {
        if (this.f19269g.f20477v.length() > 0) {
            int i = m2.p0.f20545c;
            this.f19268f = m2.b((int) (this.f19265b >> 32), (int) (this.f19268f & 4294967295L));
        }
    }

    public final void p(int i, int i10) {
        this.f19268f = m2.b(i, i10);
    }

    public final int q() {
        long j10 = this.f19268f;
        int i = m2.p0.f20545c;
        return this.f19267d.g((int) (j10 & 4294967295L));
    }
}
