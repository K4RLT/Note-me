package j2;
import l.e;
import n.i0;
import n.j;
import n.l;
import n.w;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import b2.e2;
import b2.k1;
import java.util.List;
import ya.ud;
import z1.h1;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final j1.c f18832a = new j1.c(0.0f, 0.0f, 10.0f, 10.0f);

    public static final n a(i0 i0Var, boolean z3) {
        d1.q qVar = (d1.q) i0Var.Z.A;
        b2.j jVar = null;
        if ((qVar.f15691x & 8) != 0) {
            loop0: while (true) {
                if (qVar == null) {
                    break;
                }
                if ((qVar.f15690w & 8) != 0) {
                    d1.q qVar2 = qVar;
                    t0.e eVar = null;
                    while (qVar2 != null) {
                        if (qVar2 instanceof e2) {
                            jVar = qVar2;
                            break loop0;
                        }
                        if ((qVar2.f15690w & 8) != 0 && (qVar2 instanceof b2.k)) {
                            int i = 0;
                            for (d1.q qVar3 = ((b2.k) qVar2).J; qVar3 != null; qVar3 = qVar3.f15693z) {
                                if ((qVar3.f15690w & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        qVar2 = qVar3;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new t0.e(new d1.q[16]);
                                        }
                                        if (qVar2 != null) {
                                            eVar.b(qVar2);
                                            qVar2 = null;
                                        }
                                        eVar.b(qVar3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        qVar2 = b2.e(eVar);
                    }
                }
                if ((qVar.f15691x & 8) == 0) {
                    break;
                }
                qVar = qVar.f15693z;
            }
        }
        jVar.getClass();
        d1.q qVar4 = ((d1.q) ((e2) jVar)).f15688u;
        j x9 = i0Var.x();
        if (x9 == null) {
            x9 = new j();
        }
        return new n(qVar4, z3, i0Var, x9);
    }

    public static final w b(p pVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            n a10 = pVar.a();
            i0 i0Var = a10.f18822c;
            if (i0Var.J() && i0Var.I()) {
                w wVar = new w(48);
                z5.h hVar = new z5.h(24);
                y2.k a11 = ud.a(a10.g());
                ((Region) hVar.f31922v).set(a11.f30809a, a11.f30810b, a11.f30811c, a11.f30812d);
                c(hVar, a10, wVar, a10, new z5.h(24));
                return wVar;
            }
            w wVar2 = l.f20912a;
            wVar2.getClass();
            return wVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(z5.h hVar, n nVar, w wVar, n nVar2, z5.h hVar2) {
        boolean z3;
        j1.c B1;
        j1.c cVar;
        i0 i0Var;
        int i = nVar.f18825g;
        Region region = (Region) hVar2.f31922v;
        i0 i0Var2 = nVar2.f18822c;
        int i10 = nVar2.f18825g;
        boolean z9 = false;
        if (i0Var2.J() && i0Var2.I()) {
            z3 = false;
        } else {
            z3 = true;
        }
        Region region2 = (Region) hVar.f31922v;
        if (!region2.isEmpty() || i10 == i) {
            if (!z3 || nVar2.e) {
                b2.j f10 = nVar2.f();
                if (f10 == null) {
                    B1 = ((b2.s) i0Var2.Z.f1458x).B1();
                } else {
                    d1.q qVar = ((d1.q) f10).f15688u;
                    Object g8 = nVar2.f18823d.f18813u.g(i.f18790b);
                    if (g8 == null) {
                        g8 = null;
                    }
                    if (g8 != null) {
                        z9 = true;
                    }
                    if (!qVar.f15688u.H) {
                        B1 = j1.c.e;
                    } else if (!z9) {
                        k1 s10 = b2.l.s(qVar, 8);
                        B1 = h1.i(s10).u(s10, true);
                    } else {
                        B1 = b2.l.s(qVar, 8).B1();
                    }
                }
                y2.k a10 = ud.a(B1);
                region.set(a10.f30809a, a10.f30810b, a10.f30811c, a10.f30812d);
                if (i10 == i) {
                    i10 = -1;
                }
                if (region.op(region2, Region.Op.INTERSECT)) {
                    Rect bounds = region.getBounds();
                    wVar.i(i10, new o(nVar2, new y2.k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    List j10 = j(4, nVar2);
                    for (int size = j10.size() - 1; -1 < size; size--) {
                        if (!((n) j10.get(size)).k().f18813u.c(s.f18862z)) {
                            c(hVar, nVar, wVar, (n) j10.get(size), hVar2);
                        }
                    }
                    if (f(nVar2)) {
                        region2.op(a10.f30809a, a10.f30810b, a10.f30811c, a10.f30812d, Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                if (nVar2.e) {
                    n l10 = nVar2.l();
                    if (l10 != null && (i0Var = l10.f18822c) != null && i0Var.J()) {
                        cVar = l10.g();
                    } else {
                        cVar = f18832a;
                    }
                    wVar.i(i10, new o(nVar2, ud.a(cVar)));
                    return;
                }
                if (i10 == -1) {
                    Rect bounds2 = region.getBounds();
                    wVar.i(i10, new o(nVar2, new y2.k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                }
            }
        }
    }

    public static final Object d(j jVar, v vVar) {
        Object g8 = jVar.f18813u.g(vVar);
        if (g8 == null) {
            return null;
        }
        return g8;
    }

    public static final boolean e(n nVar) {
        boolean z3;
        k1 d2 = nVar.d();
        i0 i0Var = nVar.f18823d.f18813u;
        if (d2 != null) {
            z3 = d2.p1();
        } else {
            z3 = false;
        }
        if (!z3 && !i0Var.c(s.f18852p) && !i0Var.c(s.f18851o)) {
            return false;
        }
        return true;
    }

    public static final boolean f(n nVar) {
        if (!e(nVar)) {
            j jVar = nVar.f18823d;
            if (!jVar.f18815w) {
                i0 i0Var = jVar.f18813u;
                Object[] objArr = i0Var.f20893b;
                Object[] objArr2 = i0Var.f20894c;
                long[] jArr = i0Var.f20892a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j10 = jArr[i];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j10) < 128) {
                                    int i12 = (i << 3) + i11;
                                    Object obj = objArr[i12];
                                    Object obj2 = objArr2[i12];
                                    if (((v) obj).f18868c) {
                                        return true;
                                    }
                                }
                                j10 >>= 8;
                            }
                            if (i10 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
