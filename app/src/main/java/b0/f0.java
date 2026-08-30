package b0;
import a.a;
import t.c;
import y.a;
import a0.g;
import a0.k0;
import a0.o;
import a0.u;
import a1.e;
import a1.l;
import a1.m;
import a1.q;
import a1.t;
import b1.i;
import b1.w;
import d1.r;
import n.j;
import n.v;
import r0.a1;
import r0.c0;
import r0.i1;
import r0.v0;
import r0.y;
import w.a;
import z0.c;
import z0.h;

import com.google.android.gms.internal.ads.x90;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r0.p1;
import r0.q1;
import wa.b9;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f1182a = new e0(0);

    public static final void a(df.a aVar, r rVar, n0 n0Var, df.p pVar, m mVar, int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        r rVar2 = (r) mVar;
        rVar2.c0(2002163445);
        if (rVar2.h(aVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i10 | i;
        if (rVar2.f(rVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11;
        if (rVar2.f(n0Var)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i16 = i15 | i12;
        if (rVar2.h(pVar)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i17 = i16 | i13;
        if ((i17 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar2.R(i17 & 1, z3)) {
            c(h.d(-1488997347, new androidx.compose.foundation.lazy.layout.c(n0Var, rVar, pVar, y.G(aVar, rVar2)), rVar2), rVar2, 6);
        } else {
            rVar2.U();
        }
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new b0(aVar, rVar, n0Var, pVar, i);
        }
    }

    public static final void b(Object obj, int i, k0 k0Var, c cVar, m mVar, int i10) {
        int i11;
        boolean z3;
        df.l lVar;
        int i12;
        int i13;
        int i14;
        int i15;
        r rVar = (r) mVar;
        rVar.c0(-2079116560);
        if ((i10 & 6) == 0) {
            if (rVar.h(obj)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.d(i)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (rVar.h(k0Var)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.h(cVar)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            boolean f10 = rVar.f(obj) | rVar.f(k0Var);
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (f10 || O == v0Var) {
                O = new j0(obj, k0Var);
                rVar.k0(O);
            }
            j0 j0Var = (j0) O;
            j0Var.f1218c = i;
            i1 i1Var = j0Var.f1221g;
            c0 c0Var = z1.y0.f31903a;
            j0 j0Var2 = (j0) rVar.j(c0Var);
            i d2 = w.d();
            if (d2 != null) {
                lVar = d2.e();
            } else {
                lVar = null;
            }
            i g8 = w.g(d2);
            try {
                if (j0Var2 != ((j0) i1Var.getValue())) {
                    i1Var.setValue(j0Var2);
                    if (j0Var.f1219d > 0) {
                        j0 j0Var3 = j0Var.e;
                        if (j0Var3 != null) {
                            j0Var3.b();
                        }
                        if (j0Var2 != null) {
                            j0Var2.a();
                        } else {
                            j0Var2 = null;
                        }
                        j0Var.e = j0Var2;
                    }
                }
                w.j(d2, g8, lVar);
                boolean f11 = rVar.f(j0Var);
                Object O2 = rVar.O();
                if (f11 || O2 == v0Var) {
                    O2 = new k0(3, j0Var);
                    rVar.k0(O2);
                }
                y.c(j0Var, (df.l) O2, rVar);
                y.a(c0Var.a(j0Var), cVar, rVar, ((i11 >> 6) & 112) | 8);
            } catch (Throwable th) {
                w.j(d2, g8, lVar);
                throw th;
            }
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new y(obj, i, k0Var, cVar, i10);
        }
    }

    public static final void c(c cVar, m mVar, int i) {
        boolean z3;
        r rVar = (r) mVar;
        rVar.c0(674185128);
        if ((i & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i & 1, z3)) {
            p1 p1Var = q.f219a;
            Object obj = (o) rVar.j(p1Var);
            rVar.a0(1967008021);
            Object[] objArr = new Object[0];
            Object O = rVar.O();
            Object obj2 = l.f24285a;
            if (O == obj2) {
                O = new m(0);
                rVar.k0(O);
            }
            l lVar = (l) t.c(Arrays.copyOf(objArr, 0), l.f210y, (df.a) O, rVar, 3456, 0);
            lVar.f213w = (o) rVar.j(p1Var);
            rVar.p(false);
            Object[] objArr2 = {obj};
            x90 x90Var = new x90(a1.f1145u, 1, new u(obj, 3, lVar));
            boolean h3 = rVar.h(obj) | rVar.h(lVar);
            Object O2 = rVar.O();
            if (h3 || O2 == obj2) {
                O2 = new o(obj, 2, lVar);
                rVar.k0(O2);
            }
            Object obj3 = (c1) t.c(objArr2, x90Var, (df.a) O2, rVar, 0, 4);
            y.a(p1Var.a(obj3), h.d(1863926504, new g(cVar, 3, obj3), rVar), rVar, 56);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d1(cVar, i, 0);
        }
    }

    public static final void d(z zVar, Object obj, int i, Object obj2, m mVar, int i10) {
        int i11;
        boolean z3;
        int i12;
        int i13;
        int i14;
        int i15;
        r rVar = (r) mVar;
        rVar.c0(1439843069);
        if ((i10 & 6) == 0) {
            if (rVar.f(zVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.f(obj)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (rVar.d(i)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.f(obj2)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            ((e) obj).a(obj2, h.d(980966366, new x(i, zVar, obj2), rVar), rVar, 48);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new y(zVar, obj, i, obj2, i10);
        }
    }

    public static final int e(int i, e eVar) {
        int i10 = eVar.f25619w - 1;
        int i11 = 0;
        while (i11 < i10) {
            int i12 = ((i10 - i11) / 2) + i11;
            Object[] objArr = eVar.f25617u;
            int i13 = ((i) objArr[i12]).f1196a;
            if (i13 != i) {
                if (i13 < i) {
                    i11 = i12 + 1;
                    if (i < ((i) objArr[i11]).f1196a) {
                    }
                } else {
                    i10 = i12 - 1;
                }
            }
            return i12;
        }
        return i11;
    }

    public static final List f(h0 h0Var, ArrayList arrayList, v vVar, int i, int i10, int i11, df.l lVar) {
        v vVar2;
        d0 d0Var;
        long j10;
        long j11;
        int i12;
        Object obj;
        int i13;
        int max;
        long j12;
        int i14;
        if (h0Var != null && !arrayList.isEmpty() && vVar.f20953b != 0) {
            int index = ((d0) qe.l.w(arrayList)).getIndex();
            int i15 = -1;
            if (((d0) qe.l.C(arrayList)).getIndex() - index >= 0 && (i14 = vVar.f20953b) != 0) {
                jf.d i16 = b9.i(0, i14);
                int i17 = i16.f19189u;
                int i18 = i16.f19190v;
                int i19 = -1;
                if (i17 <= i18) {
                    while (vVar.c(i17) <= index) {
                        i19 = vVar.c(i17);
                        if (i17 == i18) {
                            break;
                        }
                        i17++;
                    }
                }
                if (i19 == -1) {
                    vVar2 = j.f20897a;
                } else {
                    v vVar3 = j.f20897a;
                    vVar2 = new v(1);
                    vVar2.a(i19);
                }
            } else {
                vVar2 = j.f20897a;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i20 = 0; i20 < size; i20++) {
                Object obj2 = arrayList.get(i20);
                int index2 = ((d0) obj2).getIndex();
                int[] iArr = vVar.f20952a;
                int i21 = vVar.f20953b;
                int i22 = 0;
                while (true) {
                    if (i22 >= i21) {
                        break;
                    }
                    if (iArr[i22] == index2) {
                        arrayList3.add(obj2);
                        break;
                    }
                    i22++;
                }
            }
            int[] iArr2 = vVar2.f20952a;
            int i23 = vVar2.f20953b;
            int i24 = 0;
            while (i24 < i23) {
                int i25 = iArr2[i24];
                int size2 = arrayList.size();
                int i26 = 0;
                int i27 = 0;
                while (true) {
                    if (i27 < size2) {
                        Object obj3 = arrayList.get(i27);
                        i27++;
                        if (((d0) obj3).getIndex() == i25) {
                            break;
                        }
                        i26++;
                    } else {
                        i26 = i15;
                        break;
                    }
                }
                if (i26 == i15) {
                    d0Var = (d0) lVar.invoke(Integer.valueOf(i25));
                } else {
                    d0Var = (d0) arrayList.remove(i26);
                }
                int c10 = d0Var.c();
                if (i26 == i15) {
                    i12 = Integer.MIN_VALUE;
                    j10 = 4294967295L;
                } else {
                    long i28 = d0Var.i(0);
                    if (d0Var.f()) {
                        j10 = 4294967295L;
                        j11 = i28 & 4294967295L;
                    } else {
                        j10 = 4294967295L;
                        j11 = i28 >> 32;
                    }
                    i12 = (int) j11;
                }
                int size3 = arrayList3.size();
                int i29 = 0;
                while (true) {
                    if (i29 < size3) {
                        obj = arrayList3.get(i29);
                        if (((d0) obj).getIndex() != i25) {
                            break;
                        }
                        i29++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                d0 d0Var2 = (d0) obj;
                if (d0Var2 != null) {
                    long i30 = d0Var2.i(0);
                    if (d0Var2.f()) {
                        j12 = i30 & j10;
                    } else {
                        j12 = i30 >> 32;
                    }
                    i13 = (int) j12;
                } else {
                    i13 = Integer.MIN_VALUE;
                }
                if (i12 == Integer.MIN_VALUE) {
                    max = -i;
                } else {
                    max = Math.max(-i, i12);
                }
                if (i13 != Integer.MIN_VALUE) {
                    max = Math.min(max, i13 - c10);
                }
                d0Var.g();
                d0Var.h(max, i10, i11);
                arrayList2.add(d0Var);
                i24++;
                i15 = -1;
            }
            return arrayList2;
        }
        return qe.s.f24023u;
    }

    public static final List g(z zVar, k0 k0Var, pd.c cVar) {
        boolean z3;
        jf.b bVar;
        e eVar = (e) cVar.f22681u;
        if (eVar.f25619w != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && k0Var.f1224u.isEmpty()) {
            return qe.s.f24023u;
        }
        ArrayList arrayList = new ArrayList();
        if (((e) cVar.f22681u).f25619w != 0) {
            int i = eVar.f25619w;
            if (i != 0) {
                Object[] objArr = eVar.f25617u;
                int i10 = ((k) objArr[0]).f1222a;
                for (int i11 = 0; i11 < i; i11++) {
                    int i12 = ((k) objArr[i11]).f1222a;
                    if (i12 < i10) {
                        i10 = i12;
                    }
                }
                if (i10 < 0) {
                    a.a("negative minIndex");
                }
                int i13 = eVar.f25619w;
                if (i13 != 0) {
                    Object[] objArr2 = eVar.f25617u;
                    int i14 = ((k) objArr2[0]).f1223b;
                    for (int i15 = 0; i15 < i13; i15++) {
                        int i16 = ((k) objArr2[i15]).f1223b;
                        if (i16 > i14) {
                            i14 = i16;
                        }
                    }
                    bVar = new jf.b(i10, Math.min(i14, zVar.a() - 1), 1);
                } else {
                    l4.a.h("MutableVector is empty.");
                    return null;
                }
            } else {
                l4.a.h("MutableVector is empty.");
                return null;
            }
        } else {
            bVar = jf.d.f19196x;
        }
        int size = k0Var.f1224u.size();
        for (int i17 = 0; i17 < size; i17++) {
            j0 j0Var = (j0) k0Var.get(i17);
            int i18 = i(j0Var.f1218c, zVar, j0Var.f1216a);
            int i19 = bVar.f19189u;
            if ((i18 > bVar.f19190v || i19 > i18) && i18 >= 0 && i18 < zVar.a()) {
                arrayList.add(Integer.valueOf(i18));
            }
        }
        int i20 = bVar.f19189u;
        int i21 = bVar.f19190v;
        if (i20 <= i21) {
            while (true) {
                arrayList.add(Integer.valueOf(i20));
                if (i20 == i21) {
                    break;
                }
                i20++;
            }
        }
        return arrayList;
    }

    public static a1 h() {
        return new i1(pe.z.f22715a, v0.f24418w);
    }

    public static final int i(int i, z zVar, Object obj) {
        int d2;
        if (obj != null && zVar.a() != 0 && ((i >= zVar.a() || !obj.equals(zVar.b(i))) && (d2 = zVar.d(obj)) != -1)) {
            return d2;
        }
        return i;
    }

    public static final List m(int i, int i10, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return qe.s.f24023u;
        }
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            d0 d0Var = (d0) arrayList.get(i11);
            int index = d0Var.getIndex();
            if (i <= index && index <= i10) {
                arrayList2.add(d0Var);
            }
        }
        qe.m(arrayList2, f1182a);
        return arrayList2;
    }

    public Object j(int i) {
        i c10 = k().c(i);
        return c10.f1198c.getType().invoke(Integer.valueOf(i - c10.f1196a));
    }

    public abstract e1 k();

    public Object l(int i) {
        Object invoke;
        i c10 = k().c(i);
        int i10 = i - c10.f1196a;
        df.l key = c10.f1198c.getKey();
        if (key != null && (invoke = key.invoke(Integer.valueOf(i10))) != null) {
            return invoke;
        }
        return new g(i);
    }
}
