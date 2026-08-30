package m2;
import a.a;
import p0.d;
import p0.e;
import r0.l;
import r0.m;
import r0.r;

import c2.p1;
import com.google.android.gms.internal.ads.x90;
import java.util.ArrayList;
import java.util.List;
import ya.ic;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x90 f20480a;

    /* renamed from: b, reason: collision with root package name */
    public static final x90 f20481b;

    /* renamed from: c, reason: collision with root package name */
    public static final x90 f20482c;

    static {
        int i = 1;
        f20480a = new x90(new a0(12), i, new j7.p(29));
        f20481b = new x90(new a0(13), i, new f0(0));
        f20482c = new x90(new a0(14), i, new f0(1));
    }

    public static a a(String str, q0 q0Var, long j10, y2.c cVar, q2.h hVar, int i, int i10) {
        qe.s sVar = qe.s.f24023u;
        return new a(new u2.c(str, q0Var, sVar, sVar, hVar, cVar), i, 1, j10);
    }

    public static final long b(int i, int i10) {
        if (i < 0 || i10 < 0) {
            s2.a("start and end cannot be negative. [start: " + i + ", end: " + i10 + ']');
        }
        long j10 = (i10 & 4294967295L) | (i << 32);
        int i11 = p0.f20545c;
        return j10;
    }

    public static final long c(int i, long j10) {
        int i10;
        int i11 = p0.f20545c;
        int i12 = (int) (j10 >> 32);
        int i13 = 0;
        if (i12 < 0) {
            i10 = 0;
        } else {
            i10 = i12;
        }
        if (i10 > i) {
            i10 = i;
        }
        int i14 = (int) (4294967295L & j10);
        if (i14 >= 0) {
            i13 = i14;
        }
        if (i13 <= i) {
            i = i13;
        }
        if (i10 == i12 && i == i14) {
            return j10;
        }
        return b(i10, i);
    }

    public static final int d(int i, List list) {
        int i10;
        char c10;
        int i11 = ((s) qe.l.C(list)).f20563c;
        if (i > ((s) qe.l.C(list)).f20563c) {
            s2.a("Index " + i + " should be less or equal than last line's end " + i11);
        }
        int size = list.size() - 1;
        int i12 = 0;
        while (true) {
            if (i12 <= size) {
                i10 = (i12 + size) >>> 1;
                s sVar = (s) list.get(i10);
                if (sVar.f20562b > i) {
                    c10 = 1;
                } else if (sVar.f20563c <= i) {
                    c10 = 65535;
                } else {
                    c10 = 0;
                }
                if (c10 < 0) {
                    i12 = i10 + 1;
                } else {
                    if (c10 <= 0) {
                        break;
                    }
                    size = i10 - 1;
                }
            } else {
                i10 = -(i12 + 1);
                break;
            }
        }
        if (i10 >= 0 && i10 < list.size()) {
            return i10;
        }
        StringBuilder m4 = g3.a.m("Found paragraph index ", i10, " should be in range [0, ");
        m4.append(list.size());
        m4.append(").\nDebug info: index=");
        m4.append(i);
        m4.append(", paragraphs=[");
        m4.append(a3.a(list, null, new j7.p(6), 31));
        m4.append(']');
        s2.a(m4.toString());
        return i10;
    }

    public static final int e(int i, List list) {
        char c10;
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            s sVar = (s) list.get(i11);
            if (sVar.f20564d > i) {
                c10 = 1;
            } else if (sVar.e <= i) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i10 = i11 + 1;
            } else if (c10 > 0) {
                size = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public static final int f(ArrayList arrayList, float f10) {
        char c10;
        if (f10 <= 0.0f) {
            return 0;
        }
        if (f10 >= ((s) qe.l.C(arrayList)).f20566g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i10 = (i + size) >>> 1;
            s sVar = (s) arrayList.get(i10);
            if (sVar.f20565f > f10) {
                c10 = 1;
            } else if (sVar.f20566g <= f10) {
                c10 = 65535;
            } else {
                c10 = 0;
            }
            if (c10 < 0) {
                i = i10 + 1;
            } else if (c10 > 0) {
                size = i10 - 1;
            } else {
                return i10;
            }
        }
        return -(i + 1);
    }

    public static final void g(ArrayList arrayList, long j10, df.l lVar) {
        int size = arrayList.size();
        for (int d2 = d(e(j10), arrayList); d2 < size; d2++) {
            s sVar = (s) arrayList.get(d2);
            if (sVar.f20562b < d(j10)) {
                if (sVar.f20562b != sVar.f20563c) {
                    lVar.invoke(sVar);
                }
            } else {
                return;
            }
        }
    }

    public static final o0 h(m mVar) {
        r rVar = (r) mVar;
        q2.h hVar = (q2.h) rVar.j(p1.f3608k);
        y2.c cVar = (y2.c) rVar.j(p1.f3606h);
        y2.m mVar2 = (y2.m) rVar.j(p1.f3611n);
        boolean f10 = rVar.f(hVar) | rVar.f(cVar) | rVar.d(mVar2.ordinal()) | rVar.d(8);
        Object O = rVar.O();
        if (f10 || O == l.f24285a) {
            O = new o0(hVar, cVar, mVar2);
            rVar.k0(O);
        }
        return (o0) O;
    }

    public static final q0 i(q0 q0Var, y2.m mVar) {
        int i;
        int i10;
        float f10;
        h0 h0Var = q0Var.f20555a;
        x2.o oVar = i0.f20507d;
        x2.o oVar2 = h0Var.f20484a;
        if (oVar2.equals(x2.n.f30066a)) {
            oVar2 = i0.f20507d;
        }
        x2.o oVar3 = oVar2;
        long j10 = h0Var.f20485b;
        y2.p[] pVarArr = y2.o.f30818b;
        if ((j10 & 1095216660480L) == 0) {
            j10 = i0.f20504a;
        }
        long j11 = j10;
        q2.s sVar = h0Var.f20486c;
        if (sVar == null) {
            sVar = q2.s.f23367y;
        }
        q2.s sVar2 = sVar;
        q2.o oVar4 = h0Var.f20487d;
        if (oVar4 != null) {
            i = oVar4.f23361a;
        } else {
            i = 0;
        }
        q2.o oVar5 = new q2.o(i);
        q2.p pVar = h0Var.e;
        if (pVar != null) {
            i10 = pVar.f23362a;
        } else {
            i10 = 65535;
        }
        q2.p pVar2 = new q2.p(i10);
        q2.i iVar = h0Var.f20488f;
        if (iVar == null) {
            iVar = q2.i.f23345u;
        }
        q2.i iVar2 = iVar;
        String str = h0Var.f20489g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j12 = h0Var.f20490h;
        if ((j12 & 1095216660480L) == 0) {
            j12 = i0.f20505b;
        }
        long j13 = j12;
        x2.a aVar = h0Var.i;
        if (aVar != null) {
            f10 = aVar.f30042a;
        } else {
            f10 = 0.0f;
        }
        x2.a aVar2 = new x2.a(f10);
        x2.p pVar3 = h0Var.f20491j;
        if (pVar3 == null) {
            pVar3 = x2.p.f30067c;
        }
        x2.p pVar4 = pVar3;
        t2.b bVar = h0Var.f20492k;
        if (bVar == null) {
            t2.b bVar2 = t2.b.f25637w;
            bVar = ic.a();
        }
        t2.b bVar3 = bVar;
        long j14 = h0Var.f20493l;
        if (j14 == 16) {
            j14 = i0.f20506c;
        }
        long j15 = j14;
        x2.l lVar = h0Var.f20494m;
        if (lVar == null) {
            lVar = x2.l.f30061b;
        }
        x2.l lVar2 = lVar;
        k1.o0 o0Var = h0Var.f20495n;
        if (o0Var == null) {
            o0Var = k1.o0.f19508d;
        }
        k1.o0 o0Var2 = o0Var;
        y yVar = h0Var.f20496o;
        m1.e eVar = h0Var.f20497p;
        if (eVar == null) {
            eVar = m1.g.f20429a;
        }
        h0 h0Var2 = new h0(oVar3, j11, sVar2, oVar5, pVar2, iVar2, str2, j13, aVar2, pVar4, bVar3, j15, lVar2, o0Var2, yVar, eVar);
        v vVar = q0Var.f20556b;
        int i11 = w.f20579b;
        int i12 = vVar.f20571a;
        int i13 = 5;
        if (i12 == Integer.MIN_VALUE) {
            i12 = 5;
        }
        int i14 = vVar.f20572b;
        if (i14 == 3) {
            int ordinal = mVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    l4.a.o();
                    return null;
                }
            } else {
                i13 = 4;
            }
        } else if (i14 == Integer.MIN_VALUE) {
            int ordinal2 = mVar.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    i13 = 2;
                } else {
                    l4.a.o();
                    return null;
                }
            } else {
                i13 = 1;
            }
        } else {
            i13 = i14;
        }
        long j16 = vVar.f20573c;
        if ((j16 & 1095216660480L) == 0) {
            j16 = w.f20578a;
        }
        x2.q qVar = vVar.f20574d;
        if (qVar == null) {
            qVar = x2.q.f30070c;
        }
        x xVar = vVar.e;
        x2.i iVar3 = vVar.f20575f;
        int i15 = vVar.f20576g;
        if (i15 == 0) {
            i15 = x2.e.f30047b;
        }
        int i16 = vVar.f20577h;
        if (i16 == Integer.MIN_VALUE) {
            i16 = 1;
        }
        x2.s sVar3 = vVar.i;
        if (sVar3 == null) {
            sVar3 = x2.s.f30074c;
        }
        return new q0(h0Var2, new v(i12, i13, j16, qVar, xVar, iVar3, i15, i16, sVar3), q0Var.f20557c);
    }
}
