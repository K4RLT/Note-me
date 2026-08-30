package c2;
import c2.b;
import m2.m0;
import x2.j;

import java.text.BreakIterator;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: f, reason: collision with root package name */
    public static c f3481f;

    /* renamed from: g, reason: collision with root package name */
    public static c f3482g;

    /* renamed from: h, reason: collision with root package name */
    public static c f3483h;
    public static final j i = j.f30058v;

    /* renamed from: j, reason: collision with root package name */
    public static final j f3484j = j.f30057u;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3485d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10) {
        super(0);
        this.f3485d = i10;
    }

    @Override // b
    public final int[] a(int i10) {
        int i11;
        switch (this.f3485d) {
            case 0:
                int length = e().length();
                if (length <= 0 || i10 >= length) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.e;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i10);
                        BreakIterator breakIterator2 = (BreakIterator) this.e;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i10 = breakIterator2.following(i10);
                            } else {
                                kotlin.jvm.internal.l.h("impl");
                                throw null;
                            }
                        } else {
                            if (breakIterator2 != null) {
                                int following = breakIterator2.following(i10);
                                if (following == -1) {
                                    return null;
                                }
                                return b(i10, following);
                            }
                            kotlin.jvm.internal.l.h("impl");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.l.h("impl");
                        throw null;
                    }
                } while (i10 != -1);
                return null;
            case 1:
                if (e().length() <= 0 || i10 >= e().length()) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                while (!o(i10) && (!o(i10) || (i10 != 0 && o(i10 - 1)))) {
                    BreakIterator breakIterator3 = (BreakIterator) this.e;
                    if (breakIterator3 != null) {
                        i10 = breakIterator3.following(i10);
                        if (i10 == -1) {
                            return null;
                        }
                    } else {
                        kotlin.jvm.internal.l.h("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.e;
                if (breakIterator4 != null) {
                    int following2 = breakIterator4.following(i10);
                    if (following2 == -1 || !n(following2)) {
                        return null;
                    }
                    return b(i10, following2);
                }
                kotlin.jvm.internal.l.h("impl");
                throw null;
            default:
                if (e().length() <= 0 || i10 >= e().length()) {
                    return null;
                }
                m0 m0Var = (m0) this.e;
                j jVar = i;
                if (i10 < 0) {
                    if (m0Var != null) {
                        i11 = m0Var.f20525b.d(0);
                    } else {
                        kotlin.jvm.internal.l.h("layoutResult");
                        throw null;
                    }
                } else if (m0Var != null) {
                    int d2 = m0Var.f20525b.d(i10);
                    if (l(d2, jVar) == i10) {
                        i11 = d2;
                    } else {
                        i11 = d2 + 1;
                    }
                } else {
                    kotlin.jvm.internal.l.h("layoutResult");
                    throw null;
                }
                m0 m0Var2 = (m0) this.e;
                if (m0Var2 != null) {
                    if (i11 >= m0Var2.f20525b.f20551f) {
                        return null;
                    }
                    return b(l(i11, jVar), l(i11, f3484j) + 1);
                }
                kotlin.jvm.internal.l.h("layoutResult");
                throw null;
        }
    }

    @Override // b
    public final int[] f(int i10) {
        int i11;
        switch (this.f3485d) {
            case 0:
                int length = e().length();
                if (length <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length) {
                    i10 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.e;
                    if (breakIterator != null) {
                        boolean isBoundary = breakIterator.isBoundary(i10);
                        BreakIterator breakIterator2 = (BreakIterator) this.e;
                        if (!isBoundary) {
                            if (breakIterator2 != null) {
                                i10 = breakIterator2.preceding(i10);
                            } else {
                                kotlin.jvm.internal.l.h("impl");
                                throw null;
                            }
                        } else {
                            if (breakIterator2 != null) {
                                int preceding = breakIterator2.preceding(i10);
                                if (preceding == -1) {
                                    return null;
                                }
                                return b(preceding, i10);
                            }
                            kotlin.jvm.internal.l.h("impl");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.l.h("impl");
                        throw null;
                    }
                } while (i10 != -1);
                return null;
            case 1:
                int length2 = e().length();
                if (length2 <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length2) {
                    i10 = length2;
                }
                while (i10 > 0 && !o(i10 - 1) && !n(i10)) {
                    BreakIterator breakIterator3 = (BreakIterator) this.e;
                    if (breakIterator3 != null) {
                        i10 = breakIterator3.preceding(i10);
                        if (i10 == -1) {
                            return null;
                        }
                    } else {
                        kotlin.jvm.internal.l.h("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator4 = (BreakIterator) this.e;
                if (breakIterator4 != null) {
                    int preceding2 = breakIterator4.preceding(i10);
                    if (preceding2 == -1 || !o(preceding2)) {
                        return null;
                    }
                    if (preceding2 != 0 && o(preceding2 - 1)) {
                        return null;
                    }
                    return b(preceding2, i10);
                }
                kotlin.jvm.internal.l.h("impl");
                throw null;
            default:
                if (e().length() <= 0 || i10 <= 0) {
                    return null;
                }
                int length3 = e().length();
                m0 m0Var = (m0) this.e;
                j jVar = f3484j;
                if (i10 > length3) {
                    if (m0Var != null) {
                        i11 = m0Var.f20525b.d(e().length());
                    } else {
                        kotlin.jvm.internal.l.h("layoutResult");
                        throw null;
                    }
                } else if (m0Var != null) {
                    int d2 = m0Var.f20525b.d(i10);
                    if (l(d2, jVar) + 1 == i10) {
                        i11 = d2;
                    } else {
                        i11 = d2 - 1;
                    }
                } else {
                    kotlin.jvm.internal.l.h("layoutResult");
                    throw null;
                }
                if (i11 < 0) {
                    return null;
                }
                return b(l(i11, i), l(i11, jVar) + 1);
        }
    }

    public int l(int i10, j jVar) {
        m0 m0Var = (m0) this.e;
        if (m0Var != null) {
            int h3 = m0Var.h(i10);
            m0 m0Var2 = (m0) this.e;
            if (m0Var2 != null) {
                j i11 = m0Var2.i(h3);
                m0 m0Var3 = (m0) this.e;
                if (jVar != i11) {
                    if (m0Var3 != null) {
                        return m0Var3.h(i10);
                    }
                    kotlin.jvm.internal.l.h("layoutResult");
                    throw null;
                }
                if (m0Var3 != null) {
                    return m0Var3.f20525b.c(i10, false) - 1;
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

    public void m(String str) {
        switch (this.f3485d) {
            case 0:
                this.f3468b = str;
                BreakIterator breakIterator = (BreakIterator) this.e;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.h("impl");
                    throw null;
                }
            default:
                this.f3468b = str;
                BreakIterator breakIterator2 = (BreakIterator) this.e;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.l.h("impl");
                    throw null;
                }
        }
    }

    public boolean n(int i10) {
        if (i10 > 0 && o(i10 - 1)) {
            if (i10 == e().length() || !o(i10)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean o(int i10) {
        if (i10 >= 0 && i10 < e().length()) {
            return Character.isLetterOrDigit(e().codePointAt(i10));
        }
        return false;
    }
}
