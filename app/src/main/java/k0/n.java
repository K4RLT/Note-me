package k0;
import j0.i;

import wa.b9;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final long f19361a;

    /* renamed from: b, reason: collision with root package name */
    public final i f19362b;

    /* renamed from: c, reason: collision with root package name */
    public final i f19363c;
    public m2.m0 e;

    /* renamed from: d, reason: collision with root package name */
    public final n f19364d = this;

    /* renamed from: f, reason: collision with root package name */
    public int f19365f = -1;

    public n(long j10, i iVar, i iVar2) {
        this.f19361a = j10;
        this.f19362b = iVar;
        this.f19363c = iVar2;
    }

    public final long a(r rVar, boolean z3) {
        m2.m0 m0Var;
        int i;
        q qVar = rVar.f19400b;
        q qVar2 = rVar.f19399a;
        long j10 = this.f19361a;
        if (!z3 || qVar2.f19394c == j10) {
            if ((!z3 && qVar.f19394c != j10) || c() == null || (m0Var = (m2.m0) this.f19363c.invoke()) == null) {
                return 9205357640488583168L;
            }
            if (z3) {
                i = qVar2.f19393b;
            } else {
                i = qVar.f19393b;
            }
            return v0.t(m0Var, b9.e(i, 0, b(m0Var)), z3, rVar.f19401c);
        }
        return 9205357640488583168L;
    }

    public final int b(m2.m0 m0Var) {
        int i;
        int i10;
        synchronized (this.f19364d) {
            try {
                if (this.e != m0Var) {
                    if (m0Var.d()) {
                        m2.q qVar = m0Var.f20525b;
                        if (!qVar.f20549c) {
                            i10 = qVar.e((int) (m0Var.f20526c & 4294967295L));
                            int i11 = m0Var.f20525b.f20551f - 1;
                            if (i10 > i11) {
                                i10 = i11;
                            }
                            while (i10 >= 0 && m0Var.f20525b.f(i10) >= ((int) (m0Var.f20526c & 4294967295L))) {
                                i10--;
                            }
                            if (i10 < 0) {
                                i10 = 0;
                            }
                            this.f19365f = m0Var.f20525b.c(i10, true);
                            this.e = m0Var;
                        }
                    }
                    i10 = m0Var.f20525b.f20551f - 1;
                    this.f19365f = m0Var.f20525b.c(i10, true);
                    this.e = m0Var;
                }
                i = this.f19365f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final z1.x c() {
        z1.x xVar = (z1.x) this.f19362b.invoke();
        if (xVar != null && xVar.i()) {
            return xVar;
        }
        return null;
    }

    public final m2.g d() {
        m2.m0 m0Var = (m2.m0) this.f19363c.invoke();
        if (m0Var == null) {
            return new m2.g("");
        }
        return m0Var.f20524a.f20514a;
    }
}
