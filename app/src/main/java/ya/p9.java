package ya;
import f.a;
import k.a;
import r.d;
import b.a;
import d0.b;
import m.d;
import m.g;
import m.i;
import r.c;
import a6.f;
import b1.c0;
import b1.v;
import b1.w;
import d1.e;
import d1.o;
import d1.r;
import df.l;
import df.p;
import df.q;
import k1.h;
import k1.k;
import k1.l0;
import pe.z;
import qe.m;
import qe.s;
import r0.q1;
import r0.v0;
import r0.y;
import v1.d0;
import w7.j0;
import w7.k0;
import wa.n7;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.daren.scraply.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import o0.x1;
import r0.a1;
import r0.n2;
import wa.j7;
import ya.ae;
import ya.p9;
import ya.ta;

/* loaded from: classes.dex */
public abstract class p9 {
    public static final void a(final long j10, final float f10, final float f11, final j0 j0Var, final k0 k0Var, m mVar, final int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        float f12;
        a1 a1Var;
        e eVar;
        r rVar = (r) mVar;
        rVar.c0(713535114);
        if (rVar.e(j10)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i | i10;
        if (rVar.c(f10)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (rVar.c(f11)) {
            i12 = 2048;
        } else {
            i12 = 1024;
        }
        int i16 = i15 | i12;
        if (rVar.h(j0Var)) {
            i13 = 16384;
        } else {
            i13 = 8192;
        }
        int i17 = i16 | i13;
        if ((i17 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i17 & 1, z3)) {
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = new v();
                rVar.k0(O);
            }
            final v vVar = (v) O;
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = new v();
                rVar.k0(O2);
            }
            final v vVar2 = (v) O2;
            Object O3 = rVar.O();
            if (O3 == v0Var) {
                O3 = y.B(Boolean.FALSE);
                rVar.k0(O3);
            }
            final a1 a1Var2 = (a1) O3;
            Object O4 = rVar.O();
            if (O4 == v0Var) {
                O4 = y.B(Boolean.FALSE);
                rVar.k0(O4);
            }
            final a1 a1Var3 = (a1) O4;
            Object O5 = rVar.O();
            if (O5 == v0Var) {
                O5 = y.B(Boolean.valueOf(o9.f31412b));
                rVar.k0(O5);
            }
            final a1 a1Var4 = (a1) O5;
            String b10 = n7.b(R.string.handwriting_preparing, rVar);
            String b11 = n7.b(R.string.handwriting_unavailable, rVar);
            final String b12 = n7.b(R.string.handwriting_not_recognized, rVar);
            Object O6 = rVar.O();
            if (O6 == v0Var) {
                if (o9.f31412b) {
                    b10 = "";
                }
                O6 = y.B(b10);
                rVar.k0(O6);
            }
            a1 a1Var5 = (a1) O6;
            Object O7 = rVar.O();
            if (O7 == v0Var) {
                O7 = y.B(Boolean.FALSE);
                rVar.k0(O7);
            }
            final a1 a1Var6 = (a1) O7;
            if (((Boolean) a1Var6.getValue()).booleanValue()) {
                f12 = 0.0f;
            } else {
                f12 = 1.0f;
            }
            final n2 a10 = f.a(f12, e.s(280, 0, null, 6), null, rVar, 48, 28);
            boolean f13 = rVar.f(b11);
            Object O8 = rVar.O();
            if (f13 || O8 == v0Var) {
                a1Var = a1Var5;
                O8 = new k(b11, a1Var4, a1Var, (c) null, 0);
                eVar = null;
                rVar.k0(O8);
            } else {
                a1Var = a1Var5;
                eVar = null;
            }
            y.f((p) O8, "es", rVar);
            final a1 a1Var7 = a1Var;
            b.a(androidx.compose.foundation.layout.d.f506c, eVar, h.d(-678982944, new q() { // from class: p7.h
                @Override // q
                public final Object b(Object obj, Object obj2, Object obj3) {
                    boolean z9;
                    v vVar3;
                    a1 a1Var8;
                    Boolean bool;
                    int i18;
                    androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj;
                    m mVar2 = (m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    cVar.getClass();
                    long j11 = cVar.f503b;
                    if ((intValue & 6) == 0) {
                        if (((r) mVar2).f(cVar)) {
                            i18 = 4;
                        } else {
                            i18 = 2;
                        }
                        intValue |= i18;
                    }
                    if ((intValue & 19) != 18) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    r rVar2 = (r) mVar2;
                    boolean R = rVar2.R(intValue & 1, z9);
                    z zVar = z.f22715a;
                    if (R) {
                        float h3 = a.h(j11);
                        float g8 = a.g(j11);
                        FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
                        Object O9 = rVar2.O();
                        v vVar4 = vVar;
                        final v vVar5 = vVar2;
                        a1 a1Var9 = a1Var3;
                        v0 v0Var2 = l.f24285a;
                        if (O9 == v0Var2) {
                            O9 = new m(vVar5, vVar4, a1Var9);
                            rVar2.k0(O9);
                        }
                        r b13 = d0.b(fillElement, zVar, (PointerInputEventHandler) O9);
                        final v vVar6 = vVar4;
                        final long j12 = j10;
                        boolean e = rVar2.e(j12);
                        final n2 n2Var = a10;
                        boolean f14 = e | rVar2.f(n2Var);
                        final float f15 = f10;
                        boolean c10 = f14 | rVar2.c(f15);
                        Object O10 = rVar2.O();
                        if (!c10 && O10 != v0Var2) {
                            vVar3 = vVar5;
                        } else {
                            l lVar = new l() { // from class: p7.j
                                @Override // l
                                public final Object invoke(Object obj4) {
                                    d dVar = (d) obj4;
                                    dVar.getClass();
                                    long j13 = j12;
                                    long c11 = r.c(j13, ((Number) n2Var.getValue()).floatValue() * r.d(j13));
                                    ListIterator listIterator = vVar6.listIterator();
                                    while (true) {
                                        c0 c0Var = (c0) listIterator;
                                        boolean hasNext = c0Var.hasNext();
                                        float f16 = f15;
                                        if (hasNext) {
                                            List<f> list = (List) c0Var.next();
                                            ArrayList arrayList = new ArrayList(m.d(list, 10));
                                            for (f fVar : list) {
                                                float f17 = fVar.f22475a;
                                                float f18 = fVar.f22476b;
                                                arrayList.add(new b((Float.floatToRawIntBits(f17) << 32) | (Float.floatToRawIntBits(f18) & 4294967295L)));
                                            }
                                            b(dVar, c11, f16, arrayList);
                                        } else {
                                            v vVar7 = vVar5;
                                            vVar7.getClass();
                                            b(dVar, c11, f16, w.e(vVar7).f1328c);
                                            return z.f22715a;
                                        }
                                    }
                                }
                            };
                            vVar3 = vVar5;
                            rVar2.k0(lVar);
                            O10 = lVar;
                        }
                        a(b13, (l) O10, rVar2, 0);
                        Integer valueOf = Integer.valueOf(vVar6.size());
                        Boolean bool2 = (Boolean) a1Var9.getValue();
                        bool2.getClass();
                        a1 a1Var10 = a1Var4;
                        Boolean bool3 = (Boolean) a1Var10.getValue();
                        bool3.getClass();
                        boolean c11 = rVar2.c(h3) | rVar2.c(g8);
                        float f16 = f11;
                        boolean c12 = c11 | rVar2.c(f16);
                        j0 j0Var2 = j0Var;
                        boolean f17 = c12 | rVar2.f(j0Var2);
                        String str = b12;
                        boolean f18 = f17 | rVar2.f(str);
                        Object O11 = rVar2.O();
                        a1 a1Var11 = a1Var7;
                        a1 a1Var12 = a1Var6;
                        if (!f18 && O11 != v0Var2) {
                            a1Var8 = a1Var12;
                            bool = bool3;
                        } else {
                            a1Var8 = a1Var12;
                            bool = bool3;
                            n nVar = new n(vVar6, h3, g8, f16, j0Var2, str, a1Var9, a1Var2, a1Var10, a1Var11, a1Var8, null);
                            vVar6 = vVar6;
                            rVar2.k0(nVar);
                            O11 = nVar;
                        }
                        y.h(valueOf, bool2, bool, (p) O11, rVar2);
                        Boolean bool4 = (Boolean) a1Var8.getValue();
                        bool4.getClass();
                        Object O12 = rVar2.O();
                        if (O12 == v0Var2) {
                            f fVar = new f(vVar6, vVar3, a1Var8, (c) null, 23);
                            rVar2.k0(fVar);
                            O12 = fVar;
                        }
                        y.f((p) O12, bool4, rVar2);
                        if (((String) a1Var11.getValue()).length() > 0) {
                            rVar2.a0(1722978878);
                            b((String) a1Var11.getValue(), androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.b(a(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.b.f501a.a(o.f15687a, c.f15671v), 0.0f, 12, 0.0f, 0.0f, 13), e.a(8)), l0.c(1711276032), l0.f19495a), 10, 5), r.c(r.f19515d, 0.85f), ae.f(4294967296L, 12.0f), null, null, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, 384, 0, 131056);
                            rVar2.p(false);
                            return zVar;
                        }
                        rVar2.a0(1710999362);
                        rVar2.p(false);
                        return zVar;
                    }
                    rVar2.U();
                    return zVar;
                }
            }, rVar), rVar, 3078);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new p(j10, f10, f11, j0Var, k0Var, i) { // from class: p7.i

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ long f22491u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ float f22492v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ float f22493w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ j0 f22494x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ k0 f22495y;

                @Override // p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(49);
                    a(this.f22491u, this.f22492v, this.f22493w, this.f22494x, this.f22495y, (m) obj, L);
                    return z.f22715a;
                }
            };
        }
    }

    public static final void b(d dVar, long j10, float f10, List list) {
        float f11;
        float f12;
        if (list.isEmpty()) {
            return;
        }
        int i = 1;
        if (list.size() == 1) {
            float f13 = f10 / 2.0f;
            if (f13 < 1.0f) {
                f12 = 1.0f;
            } else {
                f12 = f13;
            }
            d.D(dVar, j10, f12, ((b) list.get(0)).f18762a, null, 120);
            return;
        }
        h a10 = k.a();
        a10.h(Float.intBitsToFloat((int) (((b) list.get(0)).f18762a >> 32)), Float.intBitsToFloat((int) (((b) list.get(0)).f18762a & 4294967295L)));
        if (list.size() == 2) {
            a10.g(Float.intBitsToFloat((int) (((b) list.get(1)).f18762a >> 32)), Float.intBitsToFloat((int) (((b) list.get(1)).f18762a & 4294967295L)));
        } else {
            int size = list.size() - 1;
            while (i < size) {
                int i10 = i + 1;
                a10.f19481a.quadTo(Float.intBitsToFloat((int) (((b) list.get(i)).f18762a >> 32)), Float.intBitsToFloat((int) (((b) list.get(i)).f18762a & 4294967295L)), (Float.intBitsToFloat((int) (((b) list.get(i10)).f18762a >> 32)) + Float.intBitsToFloat((int) (((b) list.get(i)).f18762a >> 32))) / 2.0f, (Float.intBitsToFloat((int) (((b) list.get(i10)).f18762a & 4294967295L)) + Float.intBitsToFloat((int) (((b) list.get(i)).f18762a & 4294967295L))) / 2.0f);
                i = i10;
            }
            a10.g(Float.intBitsToFloat((int) (((b) l.C(list)).f18762a >> 32)), Float.intBitsToFloat((int) (((b) l.C(list)).f18762a & 4294967295L)));
        }
        if (f10 < 1.0f) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        d.o0(dVar, a10, j10, new h(f11, 0.0f, 1, 1, null, 18), 52);
    }

    public static final ArrayList c(ArrayList arrayList, double d2) {
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        ArrayList arrayList2 = new ArrayList(m.d(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            List<f> list = (List) obj;
            ArrayList arrayList3 = new ArrayList(m.d(list, 10));
            for (f fVar : list) {
                float f10 = fVar.f22475a;
                float f11 = fVar.f22476b;
                arrayList3.add(new f((f11 * sin) + (f10 * cos), (f11 * cos) + ((-f10) * sin), fVar.f22477c));
            }
            arrayList2.add(arrayList3);
        }
        return arrayList2;
    }

    public static final List d(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return s.f24023u;
        }
        float[][] fArr = new float[size];
        char c10 = 0;
        for (int i = 0; i < size; i++) {
            float f10 = -3.4028235E38f;
            float f11 = Float.MAX_VALUE;
            float f12 = Float.MAX_VALUE;
            float f13 = -3.4028235E38f;
            for (f fVar : (List) arrayList.get(i)) {
                float f14 = fVar.f22475a;
                if (f14 < f11) {
                    f11 = f14;
                }
                if (f14 > f10) {
                    f10 = f14;
                }
                float f15 = fVar.f22476b;
                if (f15 < f12) {
                    f12 = f15;
                }
                if (f15 > f13) {
                    f13 = f15;
                }
            }
            float[] fArr2 = new float[4];
            fArr2[0] = f11;
            fArr2[1] = f12;
            fArr2[2] = f10;
            fArr2[3] = f13;
            fArr[i] = fArr2;
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            float[] fArr3 = fArr[i10];
            arrayList2.add(Float.valueOf(fArr3[3] - fArr3[1]));
        }
        List J = l.J(arrayList2);
        float floatValue = ((Number) J.get(J.size() / 2)).floatValue();
        if (floatValue < 18.0f) {
            floatValue = 18.0f;
        }
        float f16 = 1.7f * floatValue;
        float f17 = floatValue * 0.6f;
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = i11;
        }
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            int i14 = i13;
            while (i14 < size) {
                float[] fArr4 = fArr[i12];
                float[] fArr5 = fArr[i14];
                float max = Math.max(fArr4[c10], fArr5[c10]) - Math.min(fArr4[2], fArr5[2]);
                float max2 = Math.max(fArr4[1], fArr5[1]) - Math.min(fArr4[3], fArr5[3]);
                if (max < f16 && max2 < f17) {
                    int i15 = i12;
                    while (true) {
                        int i16 = iArr[i15];
                        if (i16 == i15) {
                            break;
                        }
                        int i17 = iArr[i16];
                        iArr[i15] = i17;
                        i15 = i17;
                    }
                    int i18 = i14;
                    while (true) {
                        int i19 = iArr[i18];
                        if (i19 == i18) {
                            break;
                        }
                        int i20 = iArr[i19];
                        iArr[i18] = i20;
                        i18 = i20;
                    }
                    if (i15 != i18) {
                        iArr[i18] = i15;
                    }
                }
                i14++;
                c10 = 0;
            }
            i12 = i13;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i21 = 0; i21 < size; i21++) {
            int i22 = i21;
            while (true) {
                int i23 = iArr[i22];
                if (i23 == i22) {
                    break;
                }
                int i24 = iArr[i23];
                iArr[i22] = i24;
                i22 = i24;
            }
            Integer valueOf = Integer.valueOf(i22);
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Integer.valueOf(i21));
        }
        Collection values = linkedHashMap.values();
        values.getClass();
        return l.P(values);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Comparator] */
    public static final List e(ArrayList arrayList) {
        if (arrayList.size() <= 1) {
            return m.g(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(m.d(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 >= 0) {
                Iterator it = ((List) obj).iterator();
                float f10 = Float.MAX_VALUE;
                float f11 = -3.4028235E38f;
                while (it.hasNext()) {
                    float f12 = ((f) it.next()).f22476b;
                    if (f12 < f10) {
                        f10 = f12;
                    }
                    if (f12 > f11) {
                        f11 = f12;
                    }
                }
                arrayList2.add(new p(i10, f10, f11));
                i10 = i12;
            } else {
                m.l();
                throw null;
            }
        }
        List K = l.K(arrayList2, new Object());
        List<p> list = K;
        ArrayList arrayList3 = new ArrayList(m.d(list, 10));
        for (p pVar : list) {
            arrayList3.add(Float.valueOf(pVar.f22550c - pVar.f22549b));
        }
        List J = l.J(arrayList3);
        float floatValue = ((Number) J.get(J.size() / 2)).floatValue() * 0.45f;
        if (floatValue < 6.0f) {
            floatValue = 6.0f;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList i13 = m.i(Integer.valueOf(((p) K.get(0)).f22548a));
        float f13 = ((p) K.get(0)).f22550c;
        int size2 = K.size();
        for (int i14 = 1; i14 < size2; i14++) {
            if (((p) K.get(i14)).f22549b <= f13 + floatValue) {
                i13.add(Integer.valueOf(((p) K.get(i14)).f22548a));
                if (((p) K.get(i14)).f22550c > f13) {
                    f13 = ((p) K.get(i14)).f22550c;
                }
            } else {
                arrayList4.add(i13);
                i13 = m.i(Integer.valueOf(((p) K.get(i14)).f22548a));
                f13 = ((p) K.get(i14)).f22550c;
            }
        }
        arrayList4.add(i13);
        ArrayList arrayList5 = new ArrayList(m.d(arrayList4, 10));
        int size3 = arrayList4.size();
        while (i < size3) {
            Object obj2 = arrayList4.get(i);
            i++;
            List J2 = l.J((List) obj2);
            ArrayList arrayList6 = new ArrayList(m.d(J2, 10));
            Iterator it2 = J2.iterator();
            while (it2.hasNext()) {
                arrayList6.add((List) arrayList.get(((Number) it2.next()).intValue()));
            }
            arrayList5.add(arrayList6);
        }
        return arrayList5;
    }

    public static final float f(ArrayList arrayList, float f10) {
        double d2;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i = 0;
        double d10 = 0.0d;
        double d11 = 0.0d;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            for (f fVar : (List) obj) {
                d10 += fVar.f22475a;
                d11 += fVar.f22476b;
                i++;
            }
        }
        if (i >= 8) {
            double d12 = i;
            double d13 = d10 / d12;
            double d14 = d11 / d12;
            int size2 = arrayList2.size();
            int i11 = 0;
            double d15 = 0.0d;
            double d16 = 0.0d;
            double d17 = 0.0d;
            while (i11 < size2) {
                Object obj2 = arrayList2.get(i11);
                i11++;
                for (f fVar2 : (List) obj2) {
                    double d18 = fVar2.f22475a - d13;
                    int i12 = size2;
                    double d19 = fVar2.f22476b - d14;
                    d15 = (d18 * d18) + d15;
                    d16 = (d19 * d19) + d16;
                    d17 = (d18 * d19) + d17;
                    size2 = i12;
                }
            }
            double d20 = d15 + d16;
            double d21 = d15 - d16;
            double sqrt = Math.sqrt((4.0d * d17 * d17) + (d21 * d21));
            double d22 = (d20 - sqrt) / 2.0d;
            if (d22 <= 1.0E-6d || ((d20 + sqrt) / 2.0d) / d22 >= 1.5d) {
                double atan2 = Math.atan2(d17 * 2.0d, d21) * 0.5d;
                double cos = Math.cos(atan2);
                double sin = Math.sin(atan2);
                int size3 = arrayList2.size();
                double d23 = 0.0d;
                double d24 = 0.0d;
                double d25 = 0.0d;
                int i13 = 0;
                int i14 = 0;
                while (i13 < size3) {
                    Object obj3 = arrayList2.get(i13);
                    i13++;
                    int i15 = i14;
                    for (f fVar3 : (List) obj3) {
                        double d26 = atan2;
                        double d27 = cos;
                        double d28 = ((fVar3.f22476b - d14) * sin) + ((fVar3.f22475a - d13) * d27);
                        double d29 = i15;
                        d24 += d29;
                        d25 += d28;
                        d23 += d29 * d28;
                        i15++;
                        atan2 = d26;
                        cos = d27;
                    }
                    i14 = i15;
                    arrayList2 = arrayList;
                }
                double d30 = atan2;
                if (d23 - ((d24 * d25) / d12) < 0.0d) {
                    d2 = d30 + 3.141592653589793d;
                } else {
                    d2 = d30;
                }
                return g((float) Math.toDegrees(d2));
            }
        }
        return f10;
    }

    public static final float g(float f10) {
        float f11 = f10 % 360.0f;
        if (f11 > 180.0f) {
            f11 -= 360.0f;
        }
        if (f11 <= -180.0f) {
            return f11 + 360.0f;
        }
        return f11;
    }
}
