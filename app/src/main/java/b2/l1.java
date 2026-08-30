package b2;
import a2.e;
import b0.e;
import c2.x;
import d1.p;
import d1.q;
import g2.a;
import i1.e;
import i1.g;
import i1.j;
import i1.n;
import i1.s;
import l.b;
import l.e;
import n.c0;
import n.m0;
import p.y0;
import r.o0;
import t0.e;
import t1.d;
import v1.z;
import x.a0;
import x1.a;
import y1.a;
import z1.x0;
import z1.z;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.ink.storage.DecompressedBytes;
import com.google.android.gms.internal.mlkit_vision_digital_ink.iw;

/* loaded from: classes.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f1535a;

    static {
        c0 c0Var = m0.f20916a;
        f1535a = new c0();
    }

    public static final void a(q qVar, int i, int i10) {
        if (qVar instanceof k) {
            k kVar = (k) qVar;
            int i11 = kVar.I;
            b(qVar, i11 & i, i10);
            int i12 = (~i11) & i;
            for (q qVar2 = kVar.J; qVar2 != null; qVar2 = qVar2.f15693z) {
                a(qVar2, i12, i10);
            }
            return;
        }
        b(qVar, i & qVar.f15690w, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(q qVar, int i, int i10) {
        if (i10 != 0 || qVar.N0()) {
            if ((i & 2) != 0 && (qVar instanceof x)) {
                l.l((x) qVar);
                if (i10 == 2) {
                    k1 s10 = l.s(qVar, 2);
                    s10.N = true;
                    s10.f1529c0.invoke();
                    s10.y1();
                }
            }
            if ((i & 128) != 0 && (qVar instanceof w) && i10 != 2) {
                l.u(qVar).E();
            }
            if ((i & 256) != 0 && (qVar instanceof o)) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        l.u(qVar).a0(r0.f1487j0 - 1);
                    }
                } else {
                    i0 u9 = l.u(qVar);
                    u9.a0(u9.f1487j0 + 1);
                }
                if (i10 != 2) {
                    i0 u10 = l.u(qVar);
                    if (u10.f1487j0 != 0 && !u10.p() && !u10.q() && !u10.f1486i0) {
                        x xVar = (x) m0.a(u10);
                        iw iwVar = xVar.l0.e;
                        iwVar.getClass();
                        if (u10.f1487j0 > 0) {
                            ((e) iwVar.f14489v).b(u10);
                            u10.f1486i0 = true;
                        }
                        xVar.F(null);
                    }
                }
            }
            if ((i & 4) != 0 && (qVar instanceof n)) {
                l.k((n) qVar);
            }
            if ((i & 8) != 0 && (qVar instanceof e2)) {
                l.u(qVar).L = true;
            }
            if ((i & 64) != 0 && (qVar instanceof y1)) {
                n0 n0Var = l.u((y1) qVar).f1478a0;
                n0Var.f1558p.J = true;
                w0 w0Var = n0Var.f1559q;
                if (w0Var != null) {
                    w0Var.O = true;
                }
            }
            if ((i & 2048) != 0 && (qVar instanceof n)) {
                n nVar = (n) qVar;
                e.f1442b = null;
                nVar.A0(e.f1441a);
                if (e.f1442b != null) {
                    q qVar2 = (q) nVar;
                    if (!qVar2.f15688u.H) {
                        a.b("visitChildren called on an unattached node");
                    }
                    e eVar = new e(new q[16]);
                    q qVar3 = qVar2.f15688u;
                    q qVar4 = qVar3.f15693z;
                    if (qVar4 == null) {
                        b(eVar, qVar3);
                    } else {
                        eVar.b(qVar4);
                    }
                    while (true) {
                        int i11 = eVar.f25619w;
                        if (i11 == 0) {
                            break;
                        }
                        q qVar5 = (q) eVar.n(i11 - 1);
                        if ((qVar5.f15691x & 1024) == 0) {
                            b(eVar, qVar5);
                        } else {
                            while (true) {
                                if (qVar5 == null) {
                                    break;
                                }
                                if ((qVar5.f15690w & 1024) != 0) {
                                    e eVar2 = null;
                                    while (qVar5 != null) {
                                        if (qVar5 instanceof s) {
                                            s sVar = (s) qVar5;
                                            g gVar = ((j) ((x) l.v(sVar)).getFocusOwner()).f18109d;
                                            if (gVar.f18103c.a(sVar)) {
                                                gVar.a();
                                            }
                                        } else if ((qVar5.f15690w & 1024) != 0 && (qVar5 instanceof k)) {
                                            int i12 = 0;
                                            for (q qVar6 = ((k) qVar5).J; qVar6 != null; qVar6 = qVar6.f15693z) {
                                                if ((qVar6.f15690w & 1024) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        qVar5 = qVar6;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new e(new q[16]);
                                                        }
                                                        if (qVar5 != null) {
                                                            eVar2.b(qVar5);
                                                            qVar5 = null;
                                                        }
                                                        eVar2.b(qVar6);
                                                    }
                                                }
                                            }
                                            if (i12 == 1) {
                                            }
                                        }
                                        qVar5 = e(eVar2);
                                    }
                                } else {
                                    qVar5 = qVar5.f15693z;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) != 0 && (qVar instanceof e)) {
                e eVar3 = (e) qVar;
                g gVar2 = ((j) ((x) l.v(eVar3)).getFocusOwner()).f18109d;
                if (gVar2.f18104d.a(eVar3)) {
                    gVar2.a();
                }
            }
        }
    }

    public static final void c(q qVar) {
        if (!qVar.H) {
            a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(qVar, -1, 0);
    }

    public static final int d(p pVar) {
        int i;
        if (pVar instanceof z) {
            i = 3;
        } else {
            i = 1;
        }
        if (pVar instanceof o0) {
            i |= 4;
        }
        if (pVar instanceof AppendedSemanticsElement) {
            i |= 8;
        }
        if (pVar instanceof z) {
            i |= 16;
        }
        boolean z3 = pVar instanceof a0;
        if (z3 || z3) {
            i |= 32;
        }
        if (pVar instanceof e) {
            i |= 256;
        }
        if (pVar instanceof x0) {
            i |= 64;
        }
        if (pVar instanceof a) {
            return 524288 | i;
        }
        return i;
    }

    public static final int e(q qVar) {
        int i;
        int i10 = qVar.f15690w;
        if (i10 != 0) {
            return i10;
        }
        Class<?> cls = qVar.getClass();
        c0 c0Var = f1535a;
        int d2 = c0Var.d(cls);
        if (d2 >= 0) {
            return c0Var.f20851c[d2];
        }
        if (qVar instanceof x) {
            i = 3;
        } else {
            i = 1;
        }
        if (qVar instanceof n) {
            i |= 4;
        }
        if (qVar instanceof e2) {
            i |= 8;
        }
        if (qVar instanceof a2) {
            i |= 16;
        }
        if (qVar instanceof e) {
            i |= 32;
        }
        if (qVar instanceof y1) {
            i |= 64;
        }
        if (qVar instanceof w) {
            i |= 128;
        }
        if (qVar instanceof o) {
            i |= 256;
        }
        if (qVar instanceof y0) {
            i |= 512;
        }
        if (qVar instanceof s) {
            i |= 1024;
        }
        if (qVar instanceof n) {
            i |= 2048;
        }
        if (qVar instanceof e) {
            i |= 4096;
        }
        if (qVar instanceof d) {
            i |= 8192;
        }
        if (qVar instanceof a) {
            i |= 16384;
        }
        if (qVar instanceof i) {
            i |= DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY;
        }
        if (qVar instanceof j2) {
            i |= 262144;
        }
        if (qVar instanceof a) {
            i |= 524288;
        }
        c0Var.h(i, cls);
        return i;
    }

    public static final int f(q qVar) {
        if (qVar instanceof k) {
            k kVar = (k) qVar;
            int i = kVar.I;
            for (q qVar2 = kVar.J; qVar2 != null; qVar2 = qVar2.f15693z) {
                i |= f(qVar2);
            }
            return i;
        }
        return e(qVar);
    }

    public static final boolean g(int i) {
        if ((i & 128) != 0) {
            return true;
        }
        return false;
    }
}
