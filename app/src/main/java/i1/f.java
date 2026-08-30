package i1;
import f.a;
import l.a;
import l.b;
import l.e;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import b2.f1;
import b2.g2;
import b2.i0;
import b2.k0;
import b2.k1;
import java.util.Arrays;
import q.x;
import z1.h1;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f18100a = new int[2];

    public static final boolean A(int i, k0 k0Var, s sVar, j1.c cVar) {
        s h3;
        t0.e eVar = new t0.e(new s[16]);
        if (!sVar.f15688u.H) {
            y1.a.b("visitChildren called on an unattached node");
        }
        t0.e eVar2 = new t0.e(new d1.q[16]);
        d1.q qVar = sVar.f15688u;
        d1.q qVar2 = qVar.f15693z;
        if (qVar2 == null) {
            b2.b(eVar2, qVar);
        } else {
            eVar2.b(qVar2);
        }
        while (true) {
            int i10 = eVar2.f25619w;
            if (i10 == 0) {
                break;
            }
            d1.q qVar3 = (d1.q) eVar2.n(i10 - 1);
            if ((qVar3.f15691x & 1024) == 0) {
                b2.b(eVar2, qVar3);
            } else {
                while (true) {
                    if (qVar3 == null) {
                        break;
                    }
                    if ((qVar3.f15690w & 1024) != 0) {
                        t0.e eVar3 = null;
                        while (qVar3 != null) {
                            if (qVar3 instanceof s) {
                                s sVar2 = (s) qVar3;
                                if (sVar2.H) {
                                    eVar.b(sVar2);
                                }
                            } else if ((qVar3.f15690w & 1024) != 0 && (qVar3 instanceof b2.k)) {
                                int i11 = 0;
                                for (d1.q qVar4 = ((b2.k) qVar3).J; qVar4 != null; qVar4 = qVar4.f15693z) {
                                    if ((qVar4.f15690w & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            qVar3 = qVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new t0.e(new d1.q[16]);
                                            }
                                            if (qVar3 != null) {
                                                eVar3.b(qVar3);
                                                qVar3 = null;
                                            }
                                            eVar3.b(qVar4);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            qVar3 = b2.e(eVar3);
                        }
                    } else {
                        qVar3 = qVar3.f15693z;
                    }
                }
            }
        }
        while (eVar.f25619w != 0 && (h3 = h(eVar, cVar, i)) != null) {
            if (h3.Z0().f18117a) {
                return ((Boolean) k0Var.invoke(h3)).booleanValue();
            }
            if (l(i, k0Var, h3, cVar)) {
                return true;
            }
            eVar.m(h3);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x019b A[EDGE_INSN: B:151:0x019b->B:132:0x019b BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean B(i1.s r12, i1.s r13, int r14, b2.k0 r15) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.B(i1.s, i1.s, int, b2.k0):boolean");
    }

    public static final Integer C(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 1;
        }
        return null;
    }

    public static final d D(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return null;
                            }
                            return new d(6);
                        }
                        return new d(4);
                    }
                    return new d(5);
                }
                return new d(3);
            }
            return new d(1);
        }
        return new d(2);
    }

    public static final Boolean E(int i, k0 k0Var, s sVar, j1.c cVar) {
        int ordinal = sVar.a1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (sVar.Z0().f18117a) {
                            return (Boolean) k0Var.invoke(sVar);
                        }
                        if (cVar == null) {
                            return Boolean.valueOf(i(sVar, i, k0Var));
                        }
                        return Boolean.valueOf(A(i, k0Var, sVar, cVar));
                    }
                    l4.a.o();
                    return null;
                }
            } else {
                s n10 = n(sVar);
                if (n10 != null) {
                    int ordinal2 = n10.a1().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    l4.a.o();
                                    return null;
                                }
                                x.o("ActiveParent must have a focusedChild");
                                return null;
                            }
                        } else {
                            Boolean E = E(i, k0Var, n10, cVar);
                            if (!kotlin.jvm.internal.a(E, Boolean.FALSE)) {
                                return E;
                            }
                            if (cVar == null) {
                                if (n10.a1() == r.f18131v) {
                                    s g8 = g(n10);
                                    if (g8 != null) {
                                        cVar = j(g8);
                                    } else {
                                        x.o("ActiveParent must have a focusedChild");
                                        return null;
                                    }
                                } else {
                                    x.o("Searching for active node in inactive hierarchy");
                                    return null;
                                }
                            }
                            return Boolean.valueOf(l(i, k0Var, sVar, cVar));
                        }
                    }
                    if (cVar == null) {
                        cVar = j(n10);
                    }
                    return Boolean.valueOf(l(i, k0Var, sVar, cVar));
                }
                x.o("ActiveParent must have a focusedChild");
                return null;
            }
        }
        return Boolean.valueOf(i(sVar, i, k0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(i1.s r7, b2.k0 r8) {
        /*
            i1.r r0 = r7.a1()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L82
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L36
            if (r0 == r3) goto L82
            if (r0 != r1) goto L31
            boolean r0 = w(r7, r8)
            if (r0 != 0) goto L78
            i1.m r0 = r7.Z0()
            boolean r0 = r0.f18117a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L77
            goto L78
        L31:
            l4.a.o()
        L34:
            r7 = 0
            return r7
        L36:
            i1.s r0 = n(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L7e
            i1.r r6 = r0.a1()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L79
            if (r6 == r4) goto L56
            if (r6 == r3) goto L79
            if (r6 == r1) goto L52
            l4.a.o()
            goto L34
        L52:
            x.o(r5)
            goto L34
        L56:
            boolean r1 = a(r0, r8)
            if (r1 != 0) goto L78
            boolean r7 = m(r7, r0, r3, r8)
            if (r7 != 0) goto L78
            i1.m r7 = r0.Z0()
            boolean r7 = r7.f18117a
            if (r7 == 0) goto L77
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L77
            goto L78
        L77:
            return r2
        L78:
            return r4
        L79:
            boolean r7 = m(r7, r0, r3, r8)
            return r7
        L7e:
            x.o(r5)
            goto L34
        L82:
            boolean r7 = w(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.a(i1.s, b2.k0):boolean");
    }

    public static final boolean b(j1.c cVar, j1.c cVar2, j1.c cVar3, int i) {
        float f10;
        float f11;
        boolean c10 = c(i, cVar3, cVar);
        float f12 = cVar3.f18764b;
        float f13 = cVar3.f18766d;
        float f14 = cVar3.f18763a;
        float f15 = cVar3.f18765c;
        float f16 = cVar.f18766d;
        float f17 = cVar.f18764b;
        float f18 = cVar.f18765c;
        float f19 = cVar.f18763a;
        if (!c10 && c(i, cVar2, cVar)) {
            if (i == 3) {
                if (f19 < f15) {
                    return true;
                }
            } else if (i == 4) {
                if (f18 > f14) {
                    return true;
                }
            } else if (i == 5) {
                if (f17 < f13) {
                    return true;
                }
            } else if (i == 6) {
                if (f16 > f12) {
                    return true;
                }
            } else {
                x.o("This function should only be used for 2-D focus search");
                return false;
            }
            if (i != 3 && i != 4) {
                if (i == 3) {
                    f10 = f19 - cVar2.f18765c;
                } else if (i == 4) {
                    f10 = cVar2.f18763a - f18;
                } else if (i == 5) {
                    f10 = f17 - cVar2.f18766d;
                } else if (i == 6) {
                    f10 = cVar2.f18764b - f16;
                } else {
                    x.o("This function should only be used for 2-D focus search");
                    return false;
                }
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                if (i == 3) {
                    f11 = f19 - f14;
                } else if (i == 4) {
                    f11 = f15 - f18;
                } else if (i == 5) {
                    f11 = f17 - f12;
                } else if (i == 6) {
                    f11 = f13 - f16;
                } else {
                    x.o("This function should only be used for 2-D focus search");
                    return false;
                }
                if (f11 < 1.0f) {
                    f11 = 1.0f;
                }
                if (f10 < f11) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean c(int i, j1.c cVar, j1.c cVar2) {
        if (i == 3 || i == 4) {
            if (cVar.f18766d > cVar2.f18764b && cVar.f18764b < cVar2.f18766d) {
                return true;
            }
            return false;
        }
        if (i == 5 || i == 6) {
            if (cVar.f18765c > cVar2.f18763a && cVar.f18763a < cVar2.f18765c) {
                return true;
            }
            return false;
        }
        x.o("This function should only be used for 2-D focus search");
        return false;
    }

    public static final j1.c d(View view, c2.x xVar) {
        int[] iArr = f18100a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i10 = iArr[1];
        xVar.getLocationInWindow(iArr);
        float f10 = i - iArr[0];
        float f11 = i10 - iArr[1];
        return new j1.c(f10, f11, view.getWidth() + f10, view.getHeight() + f11);
    }

    public static final boolean e(s sVar, boolean z3) {
        boolean z9;
        int ordinal = sVar.a1().ordinal();
        r rVar = r.f18133x;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return true;
                    }
                    l4.a.o();
                    return false;
                }
                if (z3) {
                    ((j) ((c2.x) b2.l.v(sVar)).getFocusOwner()).h(null);
                    sVar.Y0(r.f18132w, rVar);
                }
                return z3;
            }
            s n10 = n(sVar);
            if (n10 != null) {
                z9 = e(n10, z3);
            } else {
                z9 = true;
            }
            if (z9) {
                sVar.Y0(r.f18131v, rVar);
                return true;
            }
            return false;
        }
        ((j) ((c2.x) b2.l.v(sVar)).getFocusOwner()).h(null);
        sVar.Y0(r.f18130u, rVar);
        return true;
    }

    public static final void f(s sVar, t0.e eVar) {
        if (!sVar.f15688u.H) {
            y1.a.b("visitChildren called on an unattached node");
        }
        t0.e eVar2 = new t0.e(new d1.q[16]);
        d1.q qVar = sVar.f15688u;
        d1.q qVar2 = qVar.f15693z;
        if (qVar2 == null) {
            b2.b(eVar2, qVar);
        } else {
            eVar2.b(qVar2);
        }
        while (true) {
            int i = eVar2.f25619w;
            if (i != 0) {
                d1.q qVar3 = (d1.q) eVar2.n(i - 1);
                if ((qVar3.f15691x & 1024) == 0) {
                    b2.b(eVar2, qVar3);
                } else {
                    while (true) {
                        if (qVar3 == null) {
                            break;
                        }
                        if ((qVar3.f15690w & 1024) != 0) {
                            t0.e eVar3 = null;
                            while (qVar3 != null) {
                                if (qVar3 instanceof s) {
                                    s sVar2 = (s) qVar3;
                                    if (sVar2.H && !b2.l.u(sVar2).f1488k0) {
                                        if (sVar2.Z0().f18117a) {
                                            eVar.b(sVar2);
                                        } else {
                                            f(sVar2, eVar);
                                        }
                                    }
                                } else if ((qVar3.f15690w & 1024) != 0 && (qVar3 instanceof b2.k)) {
                                    int i10 = 0;
                                    for (d1.q qVar4 = ((b2.k) qVar3).J; qVar4 != null; qVar4 = qVar4.f15693z) {
                                        if ((qVar4.f15690w & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                qVar3 = qVar4;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new t0.e(new d1.q[16]);
                                                }
                                                if (qVar3 != null) {
                                                    eVar3.b(qVar3);
                                                    qVar3 = null;
                                                }
                                                eVar3.b(qVar4);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                qVar3 = b2.e(eVar3);
                            }
                        } else {
                            qVar3 = qVar3.f15693z;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public static final s g(s sVar) {
        s sVar2 = ((j) ((c2.x) b2.l.v(sVar)).getFocusOwner()).f18112h;
        if (sVar2 != null && sVar2.H) {
            return sVar2;
        }
        return null;
    }

    public static final s h(t0.e eVar, j1.c cVar, int i) {
        j1.c h3;
        if (i == 3) {
            h3 = cVar.h((cVar.f18765c - cVar.f18763a) + 1, 0.0f);
        } else if (i == 4) {
            h3 = cVar.h(-((cVar.f18765c - cVar.f18763a) + 1), 0.0f);
        } else if (i == 5) {
            h3 = cVar.h(0.0f, (cVar.f18766d - cVar.f18764b) + 1);
        } else if (i == 6) {
            h3 = cVar.h(0.0f, -((cVar.f18766d - cVar.f18764b) + 1));
        } else {
            x.o("This function should only be used for 2-D focus search");
            return null;
        }
        Object[] objArr = eVar.f25617u;
        int i10 = eVar.f25619w;
        s sVar = null;
        for (int i11 = 0; i11 < i10; i11++) {
            s sVar2 = (s) objArr[i11];
            if (r(sVar2)) {
                j1.c j10 = j(sVar2);
                if (o(j10, h3, cVar, i)) {
                    sVar = sVar2;
                    h3 = j10;
                }
            }
        }
        return sVar;
    }

    public static final boolean i(s sVar, int i, df.l lVar) {
        j1.c cVar;
        Object obj;
        t0.e eVar = new t0.e(new s[16]);
        f(sVar, eVar);
        int i10 = eVar.f25619w;
        if (i10 <= 1) {
            if (i10 == 0) {
                obj = null;
            } else {
                obj = eVar.f25617u[0];
            }
            s sVar2 = (s) obj;
            if (sVar2 != null) {
                return ((Boolean) lVar.invoke(sVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                j1.c j10 = j(sVar);
                float f10 = j10.f18763a;
                float f11 = j10.f18764b;
                cVar = new j1.c(f10, f11, f10, f11);
            } else if (i == 3 || i == 5) {
                j1.c j11 = j(sVar);
                float f12 = j11.f18765c;
                float f13 = j11.f18766d;
                cVar = new j1.c(f12, f13, f12, f13);
            } else {
                x.o("This function should only be used for 2-D focus search");
                return false;
            }
            s h3 = h(eVar, cVar, i);
            if (h3 != null) {
                return ((Boolean) lVar.invoke(h3)).booleanValue();
            }
        }
        return false;
    }

    public static final j1.c j(s sVar) {
        k1 k1Var = sVar.B;
        if (k1Var != null) {
            return h1.i(k1Var).u(k1Var, false);
        }
        return j1.c.e;
    }

    public static final boolean k(s sVar, k0 k0Var) {
        int ordinal = sVar.a1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (sVar.Z0().f18117a) {
                            return ((Boolean) k0Var.invoke(sVar)).booleanValue();
                        }
                        return x(sVar, k0Var);
                    }
                    l4.a.o();
                    return false;
                }
            } else {
                s n10 = n(sVar);
                if (n10 != null) {
                    if (k(n10, k0Var) || m(sVar, n10, 1, k0Var)) {
                        return true;
                    }
                    return false;
                }
                x.o("ActiveParent must have a focusedChild");
                return false;
            }
        }
        return x(sVar, k0Var);
    }

    public static final boolean l(int i, k0 k0Var, s sVar, j1.c cVar) {
        if (A(i, k0Var, sVar, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) z(sVar, i, new u(((j) ((c2.x) b2.l.v(sVar)).getFocusOwner()).f18112h, sVar, cVar, i, k0Var, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(s sVar, s sVar2, int i, k0 k0Var) {
        if (B(sVar, sVar2, i, k0Var)) {
            return true;
        }
        Boolean bool = (Boolean) z(sVar, i, new u(((j) ((c2.x) b2.l.v(sVar)).getFocusOwner()).f18112h, sVar, sVar2, i, k0Var, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final i1.s n(i1.s r8) {
        /*
            d1.q r0 = r8.f15688u
            boolean r0 = r0.H
            r1 = 0
            if (r0 != 0) goto L9
            goto Laa
        L9:
            if (r0 != 0) goto L10
            java.lang.String r0 = "visitChildren called on an unattached node"
            y1.a.b(r0)
        L10:
            t0.e r0 = new t0.e
            r2 = 16
            d1.q[] r3 = new d1.q[r2]
            r0.<init>(r3)
            d1.q r8 = r8.f15688u
            d1.q r3 = r8.f15693z
            if (r3 != 0) goto L23
            b2.b(r0, r8)
            goto L26
        L23:
            r0.b(r3)
        L26:
            int r8 = r0.f25619w
            if (r8 == 0) goto Laa
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.n(r8)
            d1.q r8 = (d1.q) r8
            int r3 = r8.f15691x
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L3c
            b2.b(r0, r8)
            goto L26
        L3c:
            if (r8 == 0) goto L26
            int r3 = r8.f15690w
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto La7
            r3 = r1
        L45:
            if (r8 == 0) goto L26
            boolean r4 = r8 instanceof i1.s
            r5 = 1
            if (r4 == 0) goto L6c
            i1.s r8 = (i1.s) r8
            d1.q r4 = r8.f15688u
            boolean r4 = r4.H
            if (r4 == 0) goto La2
            i1.r r4 = r8.a1()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L6b
            if (r4 == r5) goto L6b
            r5 = 2
            if (r4 == r5) goto L6b
            r8 = 3
            if (r4 != r8) goto L67
            goto La2
        L67:
            l4.a.o()
            r8 = 0
        L6b:
            return r8
        L6c:
            int r4 = r8.f15690w
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto La2
            boolean r4 = r8 instanceof b2.k
            if (r4 == 0) goto La2
            r4 = r8
            b2.k r4 = (b2.k) r4
            d1.q r4 = r4.J
            r6 = 0
        L7c:
            if (r4 == 0) goto L9f
            int r7 = r4.f15690w
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L9c
            int r6 = r6 + 1
            if (r6 != r5) goto L8a
            r8 = r4
            goto L9c
        L8a:
            if (r3 != 0) goto L93
            t0.e r3 = new t0.e
            d1.q[] r7 = new d1.q[r2]
            r3.<init>(r7)
        L93:
            if (r8 == 0) goto L99
            r3.b(r8)
            r8 = r1
        L99:
            r3.b(r4)
        L9c:
            d1.q r4 = r4.f15693z
            goto L7c
        L9f:
            if (r6 != r5) goto La2
            goto L45
        La2:
            d1.q r8 = b2.e(r3)
            goto L45
        La7:
            d1.q r8 = r8.f15693z
            goto L3c
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.n(i1.s):i1.s");
    }

    public static final boolean o(j1.c cVar, j1.c cVar2, j1.c cVar3, int i) {
        if (p(i, cVar, cVar3)) {
            if (p(i, cVar2, cVar3) && !b(cVar3, cVar, cVar2, i)) {
                if (!b(cVar3, cVar2, cVar, i) && q(i, cVar3, cVar) < q(i, cVar3, cVar2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean p(int i, j1.c cVar, j1.c cVar2) {
        float f10 = cVar.f18764b;
        float f11 = cVar.f18766d;
        float f12 = cVar.f18763a;
        float f13 = cVar.f18765c;
        if (i == 3) {
            float f14 = cVar2.f18765c;
            float f15 = cVar2.f18763a;
            if ((f14 > f13 || f15 >= f13) && f15 > f12) {
                return true;
            }
            return false;
        }
        if (i == 4) {
            float f16 = cVar2.f18763a;
            float f17 = cVar2.f18765c;
            if ((f16 < f12 || f17 <= f12) && f17 < f13) {
                return true;
            }
            return false;
        }
        if (i == 5) {
            float f18 = cVar2.f18766d;
            float f19 = cVar2.f18764b;
            if ((f18 > f11 || f19 >= f11) && f19 > f10) {
                return true;
            }
            return false;
        }
        if (i == 6) {
            float f20 = cVar2.f18764b;
            float f21 = cVar2.f18766d;
            if ((f20 < f10 || f21 <= f10) && f21 < f11) {
                return true;
            }
            return false;
        }
        x.o("This function should only be used for 2-D focus search");
        return false;
    }

    public static final long q(int i, j1.c cVar, j1.c cVar2) {
        float f10;
        float f11;
        float f12 = cVar2.f18764b;
        float f13 = cVar2.f18766d;
        float f14 = cVar2.f18763a;
        float f15 = cVar2.f18765c;
        if (i == 3) {
            f10 = cVar.f18763a - f15;
        } else if (i == 4) {
            f10 = f14 - cVar.f18765c;
        } else if (i == 5) {
            f10 = cVar.f18764b - f13;
        } else if (i == 6) {
            f10 = f12 - cVar.f18766d;
        } else {
            x.o("This function should only be used for 2-D focus search");
            return 0L;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        long j10 = f10;
        if (i == 3 || i == 4) {
            float f16 = cVar.f18764b;
            float f17 = 2;
            f11 = (((cVar.f18766d - f16) / f17) + f16) - (((f13 - f12) / f17) + f12);
        } else if (i == 5 || i == 6) {
            float f18 = cVar.f18763a;
            float f19 = 2;
            f11 = (((cVar.f18765c - f18) / f19) + f18) - (((f15 - f14) / f19) + f14);
        } else {
            x.o("This function should only be used for 2-D focus search");
            return 0L;
        }
        long j11 = f11;
        return (j11 * j11) + (13 * j10 * j10);
    }

    public static final boolean r(s sVar) {
        i0 i0Var;
        k1 k1Var;
        i0 i0Var2;
        k1 k1Var2 = sVar.B;
        if (k1Var2 != null && (i0Var = k1Var2.I) != null && i0Var.J() && (k1Var = sVar.B) != null && (i0Var2 = k1Var.I) != null && i0Var2.I()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.internal.m, df.l] */
    public static final b s(s sVar, int i) {
        int ordinal = sVar.a1().ordinal();
        b bVar = b.f18095u;
        if (ordinal != 0) {
            b bVar2 = b.f18096v;
            b bVar3 = null;
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        l4.a.o();
                        return null;
                    }
                } else {
                    return bVar2;
                }
            } else {
                s n10 = n(sVar);
                if (n10 != null) {
                    b s10 = s(n10, i);
                    if (s10 != bVar) {
                        bVar3 = s10;
                    }
                    if (bVar3 == null) {
                        if (!sVar.J) {
                            sVar.J = true;
                            try {
                                m Z0 = sVar.Z0();
                                a aVar = new a(i);
                                i focusOwner = ((c2.x) b2.l.v(sVar)).getFocusOwner();
                                s sVar2 = ((j) focusOwner).f18112h;
                                Z0.f18125k.invoke(aVar);
                                s sVar3 = ((j) focusOwner).f18112h;
                                if (aVar.f18094b) {
                                    o oVar = o.f18126b;
                                    return bVar2;
                                }
                                if (sVar2 != sVar3 && sVar3 != null) {
                                    if (o.f18128d == o.f18127c) {
                                        return bVar2;
                                    }
                                    return b.f18097w;
                                }
                                return bVar;
                            } finally {
                                sVar.J = false;
                            }
                        }
                        return bVar;
                    }
                    return bVar3;
                }
                x.n("ActiveParent with no focused child");
                return null;
            }
        }
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.m, df.l] */
    public static final b t(s sVar, int i) {
        if (!sVar.K) {
            sVar.K = true;
            try {
                m Z0 = sVar.Z0();
                a aVar = new a(i);
                i focusOwner = ((c2.x) b2.l.v(sVar)).getFocusOwner();
                s sVar2 = ((j) focusOwner).f18112h;
                Z0.f18124j.invoke(aVar);
                s sVar3 = ((j) focusOwner).f18112h;
                boolean z3 = aVar.f18094b;
                b bVar = b.f18096v;
                if (z3) {
                    o oVar = o.f18126b;
                    return bVar;
                }
                if (sVar2 != sVar3 && sVar3 != null) {
                    if (o.f18128d == o.f18127c) {
                        return bVar;
                    }
                    return b.f18097w;
                }
            } finally {
                sVar.K = false;
            }
        }
        return b.f18095u;
    }

    public static final b u(s sVar, int i) {
        b bVar;
        d1.q qVar;
        f1 f1Var;
        int ordinal = sVar.a1().ordinal();
        b bVar2 = b.f18095u;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (!sVar.f15688u.H) {
                            y1.a.b("visitAncestors called on an unattached node");
                        }
                        d1.q qVar2 = sVar.f15688u.f15692y;
                        i0 u9 = b2.l.u(sVar);
                        loop0: while (true) {
                            bVar = null;
                            if (u9 != null) {
                                if ((((d1.q) u9.Z.A).f15691x & 1024) != 0) {
                                    while (qVar2 != null) {
                                        if ((qVar2.f15690w & 1024) != 0) {
                                            qVar = qVar2;
                                            t0.e eVar = null;
                                            while (qVar != null) {
                                                if (qVar instanceof s) {
                                                    break loop0;
                                                }
                                                if ((qVar.f15690w & 1024) != 0 && (qVar instanceof b2.k)) {
                                                    int i10 = 0;
                                                    for (d1.q qVar3 = ((b2.k) qVar).J; qVar3 != null; qVar3 = qVar3.f15693z) {
                                                        if ((qVar3.f15690w & 1024) != 0) {
                                                            i10++;
                                                            if (i10 == 1) {
                                                                qVar = qVar3;
                                                            } else {
                                                                if (eVar == null) {
                                                                    eVar = new t0.e(new d1.q[16]);
                                                                }
                                                                if (qVar != null) {
                                                                    eVar.b(qVar);
                                                                    qVar = null;
                                                                }
                                                                eVar.b(qVar3);
                                                            }
                                                        }
                                                    }
                                                    if (i10 == 1) {
                                                    }
                                                }
                                                qVar = b2.e(eVar);
                                            }
                                        }
                                        qVar2 = qVar2.f15692y;
                                    }
                                }
                                u9 = u9.v();
                                if (u9 != null && (f1Var = u9.Z) != null) {
                                    qVar2 = (g2) f1Var.f1460z;
                                } else {
                                    qVar2 = null;
                                }
                            } else {
                                qVar = null;
                                break;
                            }
                        }
                        s sVar2 = (s) qVar;
                        if (sVar2 == null) {
                            return bVar2;
                        }
                        int ordinal2 = sVar2.a1().ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    if (ordinal2 == 3) {
                                        b u10 = u(sVar2, i);
                                        if (u10 != bVar2) {
                                            bVar = u10;
                                        }
                                        if (bVar == null) {
                                            return t(sVar2, i);
                                        }
                                        return bVar;
                                    }
                                    l4.a.o();
                                    return null;
                                }
                                return b.f18096v;
                            }
                            return u(sVar2, i);
                        }
                        return t(sVar2, i);
                    }
                    l4.a.o();
                    return null;
                }
            } else {
                s n10 = n(sVar);
                if (n10 != null) {
                    return s(n10, i);
                }
                x.n("ActiveParent with no focused child");
                return null;
            }
        }
        return bVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean v(s sVar) {
        t0.e eVar;
        r rVar;
        f1 f1Var;
        char c10;
        Boolean bool;
        f1 f1Var2;
        j jVar = (j) ((c2.x) b2.l.v(sVar)).getFocusOwner();
        s sVar2 = jVar.f18112h;
        r a12 = sVar.a1();
        if (sVar2 == sVar) {
            sVar.Y0(a12, a12);
            return true;
        }
        int i = 0;
        if (sVar2 == null && !((j) ((c2.x) b2.l.v(sVar)).getFocusOwner()).f18106a.E()) {
            return false;
        }
        char c11 = 16;
        if (sVar2 != null) {
            eVar = new t0.e(new s[16]);
            if (!sVar2.f15688u.H) {
                y1.a.b("visitAncestors called on an unattached node");
            }
            d1.q qVar = sVar2.f15688u.f15692y;
            i0 u9 = b2.l.u(sVar2);
            while (u9 != null) {
                if ((((d1.q) u9.Z.A).f15691x & 1024) != 0) {
                    while (qVar != null) {
                        if ((qVar.f15690w & 1024) != 0) {
                            d1.q qVar2 = qVar;
                            t0.e eVar2 = null;
                            while (qVar2 != null) {
                                if (qVar2 instanceof s) {
                                    eVar.b((s) qVar2);
                                } else if ((qVar2.f15690w & 1024) != 0 && (qVar2 instanceof b2.k)) {
                                    int i10 = 0;
                                    for (d1.q qVar3 = ((b2.k) qVar2).J; qVar3 != null; qVar3 = qVar3.f15693z) {
                                        if ((qVar3.f15690w & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                qVar2 = qVar3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new t0.e(new d1.q[16]);
                                                }
                                                if (qVar2 != null) {
                                                    eVar2.b(qVar2);
                                                    qVar2 = null;
                                                }
                                                eVar2.b(qVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                qVar2 = b2.e(eVar2);
                            }
                        }
                        qVar = qVar.f15692y;
                    }
                }
                u9 = u9.v();
                if (u9 != null && (f1Var2 = u9.Z) != null) {
                    qVar = (g2) f1Var2.f1460z;
                } else {
                    qVar = null;
                }
            }
        } else {
            eVar = null;
        }
        s[] sVarArr = new s[16];
        if (!sVar.f15688u.H) {
            y1.a.b("visitAncestors called on an unattached node");
        }
        d1.q qVar4 = sVar.f15688u.f15692y;
        i0 u10 = b2.l.u(sVar);
        int i11 = 1;
        int i12 = 0;
        while (u10 != null) {
            if ((((d1.q) u10.Z.A).f15691x & 1024) != 0) {
                while (qVar4 != null) {
                    if ((qVar4.f15690w & 1024) != 0) {
                        d1.q qVar5 = qVar4;
                        t0.e eVar3 = null;
                        while (qVar5 != null) {
                            if (qVar5 instanceof s) {
                                s sVar3 = (s) qVar5;
                                if (eVar != null) {
                                    bool = Boolean.valueOf(eVar.m(sVar3));
                                } else {
                                    bool = null;
                                }
                                if (bool == null || !bool.booleanValue()) {
                                    int i13 = i12 + 1;
                                    if (sVarArr.length < i13) {
                                        int length = sVarArr.length;
                                        Object r42 = new Object[Math.max(i13, length * 2)];
                                        System.arraycopy(sVarArr, i, r42, i, length);
                                        sVarArr = r42;
                                    }
                                    sVarArr[i12] = sVar3;
                                    i12 = i13;
                                }
                                if (sVar3 == sVar2) {
                                    i11 = i;
                                }
                            } else if ((qVar5.f15690w & 1024) != 0 && (qVar5 instanceof b2.k)) {
                                int i14 = i;
                                for (d1.q qVar6 = ((b2.k) qVar5).J; qVar6 != null; qVar6 = qVar6.f15693z) {
                                    if ((qVar6.f15690w & 1024) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            qVar5 = qVar6;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new t0.e(new d1.q[16]);
                                            }
                                            if (qVar5 != null) {
                                                eVar3.b(qVar5);
                                                qVar5 = null;
                                            }
                                            eVar3.b(qVar6);
                                        }
                                    }
                                }
                                c10 = 16;
                                if (i14 == 1) {
                                    c11 = 16;
                                    i = 0;
                                }
                                qVar5 = b2.e(eVar3);
                                c11 = c10;
                                i = 0;
                            }
                            c10 = 16;
                            qVar5 = b2.e(eVar3);
                            c11 = c10;
                            i = 0;
                        }
                    }
                    qVar4 = qVar4.f15692y;
                    c11 = c11;
                    i = 0;
                }
            }
            char c12 = c11;
            u10 = u10.v();
            if (u10 != null && (f1Var = u10.Z) != null) {
                qVar4 = (g2) f1Var.f1460z;
            } else {
                qVar4 = null;
            }
            c11 = c12;
            i = 0;
        }
        if (i11 == 0 || sVar2 == null || e(sVar2, false)) {
            b2.l.q(sVar, new a2.c(17, sVar));
            int ordinal = sVar.a1().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            l4.a.o();
                            return false;
                        }
                    }
                }
                ((j) ((c2.x) b2.l.v(sVar)).getFocusOwner()).h(sVar);
            }
            r rVar2 = r.f18133x;
            r rVar3 = r.f18131v;
            if (eVar != null) {
                int i15 = eVar.f25619w - 1;
                Object[] objArr = eVar.f25617u;
                if (i15 < objArr.length) {
                    while (i15 >= 0) {
                        s sVar4 = (s) objArr[i15];
                        if (jVar.f18112h != sVar) {
                            break;
                        }
                        sVar4.Y0(rVar3, rVar2);
                        i15--;
                    }
                }
            }
            int i16 = i12 - 1;
            int length2 = sVarArr.length;
            r rVar4 = r.f18130u;
            if (i16 < length2) {
                while (i16 >= 0) {
                    s sVar5 = sVarArr[i16];
                    if (jVar.f18112h != sVar) {
                        break;
                    }
                    if (sVar5 == sVar2) {
                        rVar = rVar4;
                    } else {
                        rVar = rVar2;
                    }
                    sVar5.Y0(rVar, rVar3);
                    i16--;
                }
            }
            if (jVar.f18112h == sVar) {
                sVar.Y0(a12, rVar4);
                if (jVar.f18112h != sVar) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean w(s sVar, k0 k0Var) {
        s[] sVarArr = new s[16];
        if (!sVar.f15688u.H) {
            y1.a.b("visitChildren called on an unattached node");
        }
        t0.e eVar = new t0.e(new d1.q[16]);
        d1.q qVar = sVar.f15688u;
        d1.q qVar2 = qVar.f15693z;
        if (qVar2 == null) {
            b2.b(eVar, qVar);
        } else {
            eVar.b(qVar2);
        }
        int i = 0;
        while (true) {
            int i10 = eVar.f25619w;
            if (i10 == 0) {
                break;
            }
            d1.q qVar3 = (d1.q) eVar.n(i10 - 1);
            if ((qVar3.f15691x & 1024) == 0) {
                b2.b(eVar, qVar3);
            } else {
                while (true) {
                    if (qVar3 == null) {
                        break;
                    }
                    if ((qVar3.f15690w & 1024) != 0) {
                        t0.e eVar2 = null;
                        while (qVar3 != null) {
                            if (qVar3 instanceof s) {
                                s sVar2 = (s) qVar3;
                                int i11 = i + 1;
                                if (sVarArr.length < i11) {
                                    int length = sVarArr.length;
                                    Object r10 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(sVarArr, 0, r10, 0, length);
                                    sVarArr = r10;
                                }
                                sVarArr[i] = sVar2;
                                i = i11;
                            } else if ((qVar3.f15690w & 1024) != 0 && (qVar3 instanceof b2.k)) {
                                int i12 = 0;
                                for (d1.q qVar4 = ((b2.k) qVar3).J; qVar4 != null; qVar4 = qVar4.f15693z) {
                                    if ((qVar4.f15690w & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            qVar3 = qVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new t0.e(new d1.q[16]);
                                            }
                                            if (qVar3 != null) {
                                                eVar2.b(qVar3);
                                                qVar3 = null;
                                            }
                                            eVar2.b(qVar4);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            qVar3 = b2.e(eVar2);
                        }
                    } else {
                        qVar3 = qVar3.f15693z;
                    }
                }
            }
        }
        Arrays.sort(sVarArr, 0, i, t.f18135u);
        int i13 = i - 1;
        if (i13 < sVarArr.length) {
            while (i13 >= 0) {
                s sVar3 = sVarArr[i13];
                if (r(sVar3) && a(sVar3, k0Var)) {
                    return true;
                }
                i13--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean x(s sVar, k0 k0Var) {
        s[] sVarArr = new s[16];
        if (!sVar.f15688u.H) {
            y1.a.b("visitChildren called on an unattached node");
        }
        t0.e eVar = new t0.e(new d1.q[16]);
        d1.q qVar = sVar.f15688u;
        d1.q qVar2 = qVar.f15693z;
        if (qVar2 == null) {
            b2.b(eVar, qVar);
        } else {
            eVar.b(qVar2);
        }
        int i = 0;
        while (true) {
            int i10 = eVar.f25619w;
            if (i10 == 0) {
                break;
            }
            d1.q qVar3 = (d1.q) eVar.n(i10 - 1);
            if ((qVar3.f15691x & 1024) == 0) {
                b2.b(eVar, qVar3);
            } else {
                while (true) {
                    if (qVar3 == null) {
                        break;
                    }
                    if ((qVar3.f15690w & 1024) != 0) {
                        t0.e eVar2 = null;
                        while (qVar3 != null) {
                            if (qVar3 instanceof s) {
                                s sVar2 = (s) qVar3;
                                int i11 = i + 1;
                                if (sVarArr.length < i11) {
                                    int length = sVarArr.length;
                                    Object r10 = new Object[Math.max(i11, length * 2)];
                                    System.arraycopy(sVarArr, 0, r10, 0, length);
                                    sVarArr = r10;
                                }
                                sVarArr[i] = sVar2;
                                i = i11;
                            } else if ((qVar3.f15690w & 1024) != 0 && (qVar3 instanceof b2.k)) {
                                int i12 = 0;
                                for (d1.q qVar4 = ((b2.k) qVar3).J; qVar4 != null; qVar4 = qVar4.f15693z) {
                                    if ((qVar4.f15690w & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            qVar3 = qVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new t0.e(new d1.q[16]);
                                            }
                                            if (qVar3 != null) {
                                                eVar2.b(qVar3);
                                                qVar3 = null;
                                            }
                                            eVar2.b(qVar4);
                                        }
                                    }
                                }
                                if (i12 == 1) {
                                }
                            }
                            qVar3 = b2.e(eVar2);
                        }
                    } else {
                        qVar3 = qVar3.f15693z;
                    }
                }
            }
        }
        Arrays.sort(sVarArr, 0, i, t.f18135u);
        for (int i13 = 0; i13 < i; i13++) {
            s sVar3 = sVarArr[i13];
            if (r(sVar3) && k(sVar3, k0Var)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean y(View view, Integer num, Rect rect) {
        View view2;
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof c2.x) {
            return ((c2.x) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            if (findNextFocusFromRect != null) {
                return findNextFocusFromRect.requestFocus(num.intValue(), rect);
            }
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (viewGroup.hasFocus()) {
            view2 = viewGroup.findFocus();
        } else {
            view2 = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view2, num.intValue());
        if (findNextFocus != null) {
            return findNextFocus.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue());
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x009d, code lost:
    
        if (kotlin.jvm.internal.a((b0.o) r5.b(r0), (b0.o) r10.b(r0)) != false) goto L97;
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(i1.s r10, int r11, df.l r12) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.f.z(i1.s, int, df.l):java.lang.Object");
    }
}