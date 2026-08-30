package a0;
import a.a;
import f0.d;
import b0.c0;
import b0.f0;
import b0.v;
import b0.w;
import b0.z;
import c0.a0;
import c0.n;
import k.a;
import o0.x1;
import s.b;
import s.c;
import s.f;
import s.l;
import x.d;

import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.c1;
import b2.h1;
import b2.k1;
import c2.m2;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.n00;
import java.util.ArrayList;
import o0.b2;
import r0.a1;
import r0.a2;
import r0.v0;
import t.f1;
import t.r1;
import wa.g7;
import ya.ed;
import z1.l1;
import z1.q0;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f51u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f52v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f53w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(df.l lVar, b bVar) {
        super(2);
        this.f51u = 12;
        this.f52v = bVar;
        this.f53w = (kotlin.jvm.internal.m) lVar;
    }

    /* JADX WARN: Type inference failed for: r8v23, types: [kotlin.jvm.internal.m, df.l] */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean z3;
        boolean z9;
        boolean z10;
        float f10;
        boolean z11;
        boolean z12;
        int i10 = this.f51u;
        v0 v0Var = r0.l.f24285a;
        int i11 = 2;
        boolean z13 = false;
        int i12 = 1;
        pe.z zVar = pe.z.f22715a;
        Object obj3 = this.f53w;
        Object obj4 = this.f52v;
        switch (i10) {
            case 0:
                y2.c cVar = (y2.c) obj;
                long j10 = ((y2.a) obj2).f30799a;
                if (y2.a.h(j10) == Integer.MAX_VALUE) {
                    a.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int h3 = y2.a.h(j10);
                d dVar = (d) obj3;
                int t02 = cVar.t0(dVar.a());
                int i13 = ((b) obj4).f19a;
                int i14 = h3 - ((i13 - 1) * t02);
                int i15 = i14 / i13;
                int i16 = i14 % i13;
                ArrayList arrayList = new ArrayList(i13);
                for (int i17 = 0; i17 < i13; i17++) {
                    if (i17 < i16) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    arrayList.add(Integer.valueOf(i + i15));
                }
                int[] O = qe.l.O(arrayList);
                int[] iArr = new int[O.length];
                dVar.c(cVar, h3, O, y2.m.f30814u, iArr);
                return new mu(O, i12, iArr);
            case 1:
                r0.m mVar = (r0.m) obj;
                int intValue = ((Number) obj2).intValue();
                w wVar = (w) obj4;
                v vVar = (v) obj3;
                if ((intValue & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r0.r rVar = (r0.r) mVar;
                if (rVar.R(1 & intValue, z3)) {
                    z zVar2 = (z) wVar.f1272b.invoke();
                    int i18 = vVar.f1269c;
                    Object obj5 = vVar.f1267a;
                    if ((i18 >= zVar2.a() || !zVar2.b(i18).equals(obj5)) && (i18 = zVar2.d(obj5)) != -1) {
                        vVar.f1269c = i18;
                    }
                    int i19 = i18;
                    if (i19 != -1) {
                        rVar.a0(-660404355);
                        f0.d(zVar2, wVar.f1271a, i19, vVar.f1267a, rVar, 0);
                        rVar.p(false);
                    } else {
                        rVar.a0(-660169871);
                        rVar.p(false);
                    }
                    boolean h10 = rVar.h(vVar);
                    Object O2 = rVar.O();
                    if (h10 || O2 == v0Var) {
                        O2 = new k0(i11, vVar);
                        rVar.k0(O2);
                    }
                    r0.y.c(obj5, (df.l) O2, rVar);
                } else {
                    rVar.U();
                }
                return zVar;
            case 2:
                return (q0) ((df.p) obj3).invoke(new c0((w) obj4, (l1) obj), new y2.a(((y2.a) obj2).f30799a));
            case 3:
                r0.m mVar2 = (r0.m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                r0.r rVar2 = (r0.r) mVar2;
                if (rVar2.R(intValue2 & 1, z9)) {
                    ((z0.c) obj4).b((c1) obj3, rVar2, 0);
                } else {
                    rVar2.U();
                }
                return zVar;
            case 4:
                k1.p pVar = (k1.p) obj;
                n1.b bVar = (n1.b) obj2;
                k1 k1Var = (k1) obj4;
                b2.i0 i0Var = k1Var.I;
                if (i0Var.J()) {
                    k1Var.f1527a0 = pVar;
                    k1Var.Z = bVar;
                    x1 snapshotObserver = ((c2.x) b2.m0.a(i0Var)).getSnapshotObserver();
                    k1.m0 m0Var = k1.f1522f0;
                    snapshotObserver.a(k1Var, b2.d.f1426x, (h1) obj3);
                    k1Var.f1530d0 = false;
                } else {
                    k1Var.f1530d0 = true;
                }
                return zVar;
            case 5:
                float floatValue = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                kotlin.jvm.internal.v vVar2 = (kotlin.jvm.internal.v) obj4;
                vVar2.f19784u += ((a0) obj3).f3281b.a(floatValue - vVar2.f19784u);
                return zVar;
            case 6:
                ((Number) obj2).intValue();
                AndroidCompositionLocals_androidKt.a((c2.x) obj4, (df.p) obj3, (r0.m) obj, r0.y.L(1));
                return zVar;
            case 7:
                r0.m mVar3 = (r0.m) obj;
                int intValue3 = ((Number) obj2).intValue();
                c3.x xVar = (c3.x) obj4;
                if ((intValue3 & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r0.r rVar3 = (r0.r) mVar3;
                if (rVar3.R(intValue3 & 1, z10)) {
                    Object O3 = rVar3.O();
                    if (O3 == v0Var) {
                        O3 = c3.c.f3754y;
                        rVar3.k0(O3);
                    }
                    d1.r a10 = j2.a(d1.o.f15687a, false, (df.l) O3);
                    boolean h11 = rVar3.h(xVar);
                    Object O4 = rVar3.O();
                    if (h11 || O4 == v0Var) {
                        O4 = new c3.k(xVar, 1);
                        rVar3.k0(O4);
                    }
                    d1.r e = androidx.compose.ui.layout.a.e(a10, (df.l) O4);
                    if (xVar.getCanCalculatePosition()) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    d1.r a11 = g7.a(e, f10);
                    df.p pVar2 = (df.p) ((a1) obj3).getValue();
                    Object O5 = rVar3.O();
                    if (O5 == v0Var) {
                        O5 = c3.f.f3767c;
                        rVar3.k0(O5);
                    }
                    z1.p0 p0Var = (z1.p0) O5;
                    int hashCode = Long.hashCode(rVar3.T);
                    z0.g l10 = rVar3.l();
                    d1.r c10 = d1.a.c(a11, rVar3);
                    b2.h.f1471d.getClass();
                    b2.b0 b0Var = b2.g.f1462b;
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(b0Var);
                    } else {
                        rVar3.n0();
                    }
                    r0.y.I(b2.g.e, p0Var, rVar3);
                    r0.y.I(b2.g.f1464d, l10, rVar3);
                    b2.f fVar = b2.g.f1465f;
                    if (rVar3.S || !kotlin.jvm.internal.a(rVar3.O(), Integer.valueOf(hashCode))) {
                        a.t(hashCode, rVar3, hashCode, fVar);
                    }
                    r0.y.I(b2.g.f1463c, c10, rVar3);
                    pVar2.invoke(rVar3, 0);
                    rVar3.p(true);
                } else {
                    rVar3.U();
                }
                return zVar;
            case 8:
                int intValue4 = ((Number) obj).intValue();
                j2.n nVar = (j2.n) obj2;
                f1.d dVar2 = (f1.d) obj3;
                if (!((m2) obj4).f3579b.b(nVar.f18825g)) {
                    dVar2.j(intValue4, nVar);
                    dVar2.B.e(zVar);
                }
                return zVar;
            case 9:
                r0.m mVar4 = (r0.m) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    r0.r rVar4 = (r0.r) mVar4;
                    if (rVar4.D()) {
                        rVar4.U();
                        return zVar;
                    }
                }
                x1.a(((b2) obj4).f21423j, (z0.c) obj3, mVar4, 0);
                return zVar;
            case 10:
                ((Number) obj2).intValue();
                ((f) obj4).a((b) obj3, (r0.m) obj, r0.y.L(1));
                return zVar;
            case 11:
                ((Number) obj2).intValue();
                a((b) obj4, (z0.c) obj3, (r0.m) obj, r0.y.L(385));
                return zVar;
            case 12:
                r0.m mVar5 = (r0.m) obj;
                int intValue5 = ((Number) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z13 = true;
                }
                r0.r rVar5 = (r0.r) mVar5;
                if (rVar5.R(intValue5 & 1, z13)) {
                    b bVar2 = (b) obj4;
                    a(bVar2, z0.h.d(1156688164, new n((df.l) obj3, bVar2), rVar5), rVar5, 384);
                } else {
                    rVar5.U();
                }
                return zVar;
            case 13:
                long j11 = ((j1.b) obj2).f18762a;
                ed.a((n00) obj4, (v1.t) obj);
                rf.h hVar = ((r1) obj3).O;
                if (hVar != null) {
                    hVar.e(new n(j11));
                }
                return zVar;
            case 14:
                float floatValue2 = ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                kotlin.jvm.internal.v vVar3 = (kotlin.jvm.internal.v) obj4;
                float f11 = vVar3.f19784u;
                vVar3.f19784u = ((f1) obj3).a(floatValue2 - f11) + f11;
                return zVar;
            case 15:
                r0.m mVar6 = (r0.m) obj;
                int intValue6 = ((Number) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r0.r rVar6 = (r0.r) mVar6;
                if (rVar6.R(intValue6 & 1, z11)) {
                    ((z0.c) obj4).b((androidx.compose.foundation.layout.c) obj3, rVar6, 0);
                } else {
                    rVar6.U();
                }
                return zVar;
            case 16:
                l1 l1Var = (l1) obj;
                long j12 = ((y2.a) obj2).f30799a;
                return ((z1.p0) obj4).g(l1Var, l1Var.V(new z0.c(-1945019079, new g((z0.c) obj3, 15, new androidx.compose.foundation.layout.c(l1Var, j12)), true), zVar), j12);
            default:
                r0.m mVar7 = (r0.m) obj;
                int intValue7 = ((Number) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r0.r rVar7 = (r0.r) mVar7;
                if (rVar7.R(intValue7 & 1, z12)) {
                    Boolean bool = (Boolean) ((z1.c0) obj4).f31786f.getValue();
                    boolean booleanValue = bool.booleanValue();
                    df.p pVar3 = (df.p) obj3;
                    rVar7.d0(bool);
                    boolean g8 = rVar7.g(booleanValue);
                    if (booleanValue) {
                        pVar3.invoke(rVar7, 0);
                    } else {
                        if (rVar7.f24344l != 0) {
                            r0.c("No nodes can be emitted before calling dactivateToEndGroup");
                        }
                        if (!rVar7.S) {
                            if (!g8) {
                                rVar7.T();
                            } else {
                                a2 a2Var = rVar7.G;
                                int i20 = a2Var.f24183g;
                                int i21 = a2Var.f24184h;
                                s0.b bVar3 = rVar7.M;
                                bVar3.getClass();
                                bVar3.d(false);
                                bVar3.f24855b.f24852a.e(s0.i.f24878c);
                                r0.a(i20, i21, rVar7.f24351s);
                                rVar7.G.t();
                            }
                        }
                    }
                    if (rVar7.f24357y && rVar7.G.i == rVar7.f24358z) {
                        rVar7.f24358z = -1;
                        rVar7.f24357y = false;
                    }
                    rVar7.p(false);
                } else {
                    rVar7.U();
                }
                return zVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i, int i10, Object obj, Object obj2) {
        super(2);
        this.f51u = i10;
        this.f52v = obj;
        this.f53w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Object obj, int i, Object obj2) {
        super(2);
        this.f51u = i;
        this.f52v = obj;
        this.f53w = obj2;
    }
}
