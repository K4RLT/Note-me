package c2;
import c2.b;
import j1.c;
import j2.n;
import m2.m0;
import x2.j;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: f, reason: collision with root package name */
    public static d f3495f;

    /* renamed from: g, reason: collision with root package name */
    public static final j f3496g = j.f30058v;

    /* renamed from: h, reason: collision with root package name */
    public static final j f3497h = j.f30057u;

    /* renamed from: d, reason: collision with root package name */
    public m0 f3498d;
    public n e;

    @Override // b
    public final int[] a(int i) {
        int i10;
        if (e().length() > 0 && i < e().length()) {
            try {
                n nVar = this.e;
                if (nVar != null) {
                    c g8 = nVar.g();
                    int round = Math.round(g8.f18766d - g8.f18764b);
                    if (i <= 0) {
                        i = 0;
                    }
                    m0 m0Var = this.f3498d;
                    if (m0Var != null) {
                        int d2 = m0Var.f20525b.d(i);
                        m0 m0Var2 = this.f3498d;
                        if (m0Var2 != null) {
                            float f10 = m0Var2.f20525b.f(d2) + round;
                            m0 m0Var3 = this.f3498d;
                            if (m0Var3 != null) {
                                float f11 = m0Var3.f20525b.f(r0.f20551f - 1);
                                m0 m0Var4 = this.f3498d;
                                if (f10 < f11) {
                                    if (m0Var4 != null) {
                                        i10 = m0Var4.f20525b.e(f10);
                                    } else {
                                        kotlin.jvm.internal.l.h("layoutResult");
                                        throw null;
                                    }
                                } else if (m0Var4 != null) {
                                    i10 = m0Var4.f20525b.f20551f;
                                } else {
                                    kotlin.jvm.internal.l.h("layoutResult");
                                    throw null;
                                }
                                return b(i, l(i10 - 1, f3497h) + 1);
                            }
                            kotlin.jvm.internal.l.h("layoutResult");
                            throw null;
                        }
                        kotlin.jvm.internal.l.h("layoutResult");
                        throw null;
                    }
                    kotlin.jvm.internal.l.h("layoutResult");
                    throw null;
                }
                kotlin.jvm.internal.l.h("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // b
    public final int[] f(int i) {
        int i10;
        if (e().length() > 0 && i > 0) {
            try {
                n nVar = this.e;
                if (nVar != null) {
                    c g8 = nVar.g();
                    int round = Math.round(g8.f18766d - g8.f18764b);
                    int length = e().length();
                    if (length <= i) {
                        i = length;
                    }
                    m0 m0Var = this.f3498d;
                    if (m0Var != null) {
                        int d2 = m0Var.f20525b.d(i);
                        m0 m0Var2 = this.f3498d;
                        if (m0Var2 != null) {
                            float f10 = m0Var2.f20525b.f(d2) - round;
                            if (f10 > 0.0f) {
                                m0 m0Var3 = this.f3498d;
                                if (m0Var3 != null) {
                                    i10 = m0Var3.f20525b.e(f10);
                                } else {
                                    kotlin.jvm.internal.l.h("layoutResult");
                                    throw null;
                                }
                            } else {
                                i10 = 0;
                            }
                            if (i == e().length() && i10 < d2) {
                                i10++;
                            }
                            return b(l(i10, f3496g), i);
                        }
                        kotlin.jvm.internal.l.h("layoutResult");
                        throw null;
                    }
                    kotlin.jvm.internal.l.h("layoutResult");
                    throw null;
                }
                kotlin.jvm.internal.l.h("node");
                throw null;
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    public final int l(int i, j jVar) {
        m0 m0Var = this.f3498d;
        if (m0Var != null) {
            int h3 = m0Var.h(i);
            m0 m0Var2 = this.f3498d;
            if (m0Var2 != null) {
                j i10 = m0Var2.i(h3);
                m0 m0Var3 = this.f3498d;
                if (jVar != i10) {
                    if (m0Var3 != null) {
                        return m0Var3.h(i);
                    }
                    kotlin.jvm.internal.l.h("layoutResult");
                    throw null;
                }
                if (m0Var3 != null) {
                    return m0Var3.f20525b.c(i, false) - 1;
                }
                kotlin.jvm.internal.l.h("layoutResult");
                throw null;
            }
            kotlin.jvm.internal.l.h("layoutResult");
            throw null;
        }
        kotlin.jvm.internal.l.h("layoutResult");
        throw null;
    }
}
