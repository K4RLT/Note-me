package a0;
import b0.e1;
import b0.i0;
import c0.d;
import c0.t;
import c0.u;
import k0.r;
import l.a;
import l.c;
import l.e;
import l.f;
import q.x;
import r.b0;
import r.i;
import x.b;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import b0.c1;
import b2.e2;
import b2.f1;
import b2.k1;
import b2.s0;
import b2.w0;
import c2.b1;
import c2.l2;
import g0.g2;
import g0.i2;
import g0.m1;
import g0.r0;
import java.io.File;
import java.util.List;
import k0.j1;
import k0.l1;
import k0.t0;
import k0.u0;
import k0.v0;
import r0.a1;
import wa.b9;
import wa.s8;
import ya.vd;
import z1.y0;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f110u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f111v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f112w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i2 i2Var, m2.e eVar, b1 b1Var) {
        super(0);
        this.f110u = 11;
        this.f111v = eVar;
        this.f112w = b1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v43, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r0v46, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15, types: [d1.q] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [t0.e] */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v72 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v41, types: [kotlin.jvm.internal.m, df.a] */
    /* JADX WARN: Type inference failed for: r8v14, types: [kotlin.jvm.internal.m, df.a] */
    @Override // df.a
    public final Object invoke() {
        float f10;
        float f11;
        j2.n nVar;
        b2.i0 i0Var;
        j1.c cVar;
        long j10;
        int i;
        long j11;
        m2.g gVar;
        int i10;
        long j12;
        g2 d2;
        e1 e1Var;
        m2.g gVar2;
        switch (this.f110u) {
            case 0:
                j jVar = (j) ((r0.g0) this.f111v).getValue();
                l0 l0Var = (l0) this.f112w;
                return new l(l0Var, jVar, new e1((jf.d) l0Var.f89d.f31f.getValue(), jVar));
            case 1:
                Context context = (Context) this.f111v;
                String str = ((a4.b) this.f112w).f239b;
                str.getClass();
                return new File(context.getApplicationContext().getFilesDir(), kotlin.jvm.internal.f(kotlin.jvm.internal.f(".preferences_pb", str), "datastore/"));
            case 2:
                return new c1((a1.o) this.f111v, qe.t.f24024u, (a1.l) this.f112w);
            case 3:
                f1 f1Var = ((b2.i0) this.f111v).Z;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f112w;
                if ((((d1.q) f1Var.A).f15691x & 8) != 0) {
                    for (d1.q qVar = (b2.g2) f1Var.f1460z; qVar != null; qVar = qVar.f15692y) {
                        if ((qVar.f15690w & 8) != 0) {
                            b2.k kVar = qVar;
                            Object r42 = 0;
                            while (kVar != 0) {
                                if (kVar instanceof e2) {
                                    e2 e2Var = (e2) kVar;
                                    if (e2Var.P()) {
                                        j2.j jVar2 = new j2.j();
                                        yVar.f19787u = jVar2;
                                        jVar2.f18816x = true;
                                    }
                                    if (e2Var.H0()) {
                                        ((j2.j) yVar.f19787u).f18815w = true;
                                    }
                                    e2Var.F0((j2.j) yVar.f19787u);
                                } else if ((kVar.f15690w & 8) != 0 && (kVar instanceof b2.k)) {
                                    d1.q qVar2 = kVar.J;
                                    int i11 = 0;
                                    kVar = kVar;
                                    r42 = r42;
                                    while (qVar2 != null) {
                                        if ((qVar2.f15690w & 8) != 0) {
                                            i11++;
                                            r42 = r42;
                                            if (i11 == 1) {
                                                kVar = qVar2;
                                            } else {
                                                if (r42 == 0) {
                                                    r42 = new t0.e(new d1.q[16]);
                                                }
                                                if (kVar != 0) {
                                                    r42.b(kVar);
                                                    kVar = 0;
                                                }
                                                r42.b(qVar2);
                                            }
                                        }
                                        qVar2 = qVar2.f15693z;
                                        kVar = kVar;
                                        r42 = r42;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                kVar = b2.e(r42);
                            }
                        }
                    }
                }
                return pe.z.f22715a;
            case 4:
                w0 w0Var = (w0) this.f111v;
                b2.n0 n0Var = w0Var.f1614z;
                n0Var.f1551h = 0;
                t0.e z3 = n0Var.f1545a.z();
                Object[] objArr = z3.f25617u;
                int i12 = z3.f25619w;
                for (int i13 = 0; i13 < i12; i13++) {
                    w0 w0Var2 = ((b2.i0) objArr[i13]).f1478a0.f1559q;
                    w0Var2.getClass();
                    w0Var2.B = w0Var2.C;
                    w0Var2.C = Integer.MAX_VALUE;
                    if (w0Var2.D == b2.g0.f1467v) {
                        w0Var2.D = b2.g0.f1468w;
                    }
                }
                b2.i0 i0Var2 = n0Var.f1545a;
                b2.i0 i0Var3 = n0Var.f1545a;
                t0.e z9 = i0Var2.z();
                Object[] objArr2 = z9.f25617u;
                int i14 = z9.f25619w;
                for (int i15 = 0; i15 < i14; i15++) {
                    w0 w0Var3 = ((b2.i0) objArr2[i15]).f1478a0.f1559q;
                    w0Var3.getClass();
                    w0Var3.K.getClass();
                }
                b2.r rVar = w0Var.g().l0;
                if (rVar != null) {
                    boolean z10 = rVar.E;
                    List n10 = i0Var3.n();
                    int size = n10.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        s0 f12 = ((k1) ((b2.i0) ((t0.b) n10).get(i16)).Z.f1459y).f1();
                        if (f12 != null) {
                            f12.E = z10;
                        }
                    }
                }
                ((s0) this.f112w).P0().a();
                if (w0Var.g().l0 != null) {
                    List n11 = i0Var3.n();
                    int size2 = n11.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        s0 f13 = ((k1) ((b2.i0) ((t0.b) n11).get(i17)).Z.f1459y).f1();
                        if (f13 != null) {
                            f13.E = false;
                        }
                    }
                }
                t0.e z11 = i0Var3.z();
                Object[] objArr3 = z11.f25617u;
                int i18 = z11.f25619w;
                for (int i19 = 0; i19 < i18; i19++) {
                    w0 w0Var4 = ((b2.i0) objArr3[i19]).f1478a0.f1559q;
                    w0Var4.getClass();
                    int i20 = w0Var4.B;
                    int i21 = w0Var4.C;
                    if (i20 != i21 && i21 == Integer.MAX_VALUE) {
                        w0Var4.C0(true);
                    }
                }
                t0.e z12 = i0Var3.z();
                Object[] objArr4 = z12.f25617u;
                int i22 = z12.f25619w;
                for (int i23 = 0; i23 < i22; i23++) {
                    w0 w0Var5 = ((b2.i0) objArr4[i23]).f1478a0.f1559q;
                    w0Var5.getClass();
                    b2.j0 j0Var = w0Var5.K;
                    j0Var.getClass();
                    j0Var.f1507c = false;
                }
                return pe.z.f22715a;
            case 5:
                t tVar = (t) ((r0.g0) this.f111v).getValue();
                d dVar = (d) this.f112w;
                return new u(dVar, tVar, new e1((jf.d) ((i0) dVar.f3335d.f3441z).getValue(), tVar));
            case 6:
                return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) this.f112w));
            case 7:
                return Boolean.valueOf(c2.b((MotionEvent) this.f112w, (c2.x) this.f111v));
            case 8:
                c2.f0 f0Var = (c2.f0) this.f112w;
                l2 l2Var = (l2) this.f111v;
                j2.h hVar = l2Var.f3573y;
                j2.h hVar2 = l2Var.f3574z;
                Float f14 = l2Var.f3571w;
                Float f15 = l2Var.f3572x;
                if (hVar != null && f14 != null) {
                    f10 = ((Number) hVar.f18787a.invoke()).floatValue() - f14.floatValue();
                } else {
                    f10 = 0.0f;
                }
                if (hVar2 != null && f15 != null) {
                    f11 = ((Number) hVar2.f18787a.invoke()).floatValue() - f15.floatValue();
                } else {
                    f11 = 0.0f;
                }
                if (f10 != 0.0f || f11 != 0.0f) {
                    int t3 = f0Var.t(l2Var.f3569u);
                    j2.o oVar = (j2.o) f0Var.m().b(f0Var.f3524n);
                    if (oVar != null) {
                        try {
                            r3.e eVar = f0Var.f3526p;
                            if (eVar != null) {
                                eVar.f24537a.setBoundsInScreen(f0Var.d(oVar));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    j2.o oVar2 = (j2.o) f0Var.m().b(f0Var.f3525o);
                    if (oVar2 != null) {
                        try {
                            r3.e eVar2 = f0Var.f3527q;
                            if (eVar2 != null) {
                                eVar2.f24537a.setBoundsInScreen(f0Var.d(oVar2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    f0Var.f3516d.invalidate();
                    j2.o oVar3 = (j2.o) f0Var.m().b(t3);
                    if (oVar3 != null && (nVar = oVar3.f18826a) != null && (i0Var = nVar.f18822c) != null) {
                        if (hVar != null) {
                            f0Var.f3529s.i(t3, hVar);
                        }
                        if (hVar2 != null) {
                            f0Var.f3530t.i(t3, hVar2);
                        }
                        f0Var.p(i0Var);
                    }
                }
                if (hVar != null) {
                    l2Var.f3571w = (Float) hVar.f18787a.invoke();
                }
                if (hVar2 != null) {
                    l2Var.f3572x = (Float) hVar2.f18787a.invoke();
                }
                return pe.z.f22715a;
            case 9:
                r2.x xVar = (r2.x) this.f111v;
                long j13 = xVar.f24516b;
                a1 a1Var = (a1) this.f112w;
                if (!m2.a(j13, ((r2.x) a1Var.getValue()).f24516b) || !kotlin.jvm.internal.a(xVar.f24517c, ((r2.x) a1Var.getValue()).f24517c)) {
                    a1Var.setValue(xVar);
                }
                return pe.z.f22715a;
            case 10:
                i2 i2Var = (i2) this.f111v;
                if (i2Var != null) {
                    b1.v vVar = i2Var.f17135c;
                    boolean isEmpty = vVar.isEmpty();
                    m2.g gVar3 = i2Var.f17134b;
                    if (!isEmpty) {
                        m1 m1Var = new m1(gVar3);
                        int size3 = vVar.size();
                        for (int i24 = 0; i24 < size3; i24++) {
                            ((df.l) vVar.get(i24)).invoke(m1Var);
                        }
                        gVar3 = m1Var.f17210b;
                    }
                    i2Var.f17134b = gVar3;
                    if (gVar3 != null) {
                        return gVar3;
                    }
                }
                return (m2.g) this.f112w;
            case 11:
                m2.n nVar2 = (m2.n) ((m2.e) this.f111v).f20451a;
                b1 b1Var = (b1) this.f112w;
                if (nVar2 instanceof m2.m) {
                    try {
                        b1Var.a(((m2.m) nVar2).f20522a);
                    } catch (IllegalArgumentException unused3) {
                    }
                }
                return pe.z.f22715a;
            case 12:
                df.a aVar = (df.a) this.f111v;
                if (aVar != null && (cVar = (j1.c) aVar.invoke()) != null) {
                    return cVar;
                }
                k1 k1Var = (k1) this.f112w;
                if (!k1Var.h1().H) {
                    k1Var = null;
                }
                if (k1Var == null) {
                    return null;
                }
                return s8.a(0L, vd.c(k1Var.f31771w));
            case 13:
                h6.e eVar3 = ((g6.c) this.f111v).f17555a;
                g6.b bVar = (g6.b) this.f112w;
                eVar3.getClass();
                synchronized (eVar3.f17858c) {
                    if (eVar3.f17859d.remove(bVar) && eVar3.f17859d.isEmpty()) {
                        eVar3.d();
                    }
                }
                return pe.z.f22715a;
            case 14:
                ((h1.b) this.f111v).K.invoke((h1.d) this.f112w);
                return pe.z.f22715a;
            case 15:
                ((kotlin.jvm.internal.y) this.f111v).f19787u = ((i1.s) this.f112w).Z0();
                return pe.z.f22715a;
            case 16:
                t0 t0Var = (t0) this.f111v;
                long j14 = ((y2.l) ((a1) this.f112w).getValue()).f30813a;
                r e = t0Var.e();
                if (e != null) {
                    r0 d10 = t0Var.d();
                    if (d10 == null) {
                        i = -1;
                    } else {
                        i = u0.f19435a[d10.ordinal()];
                    }
                    if (i != -1) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    l4.a.o();
                                    return null;
                                }
                                x.o("SelectionContainer does not support cursor");
                                return null;
                            }
                            j10 = v0.r(t0Var, j14, e.f19400b);
                        } else {
                            j10 = v0.r(t0Var, j14, e.f19399a);
                        }
                        return new j1.b(j10);
                    }
                }
                j10 = 9205357640488583168L;
                return new j1.b(j10);
            case 17:
                j1 j1Var = (j1) this.f111v;
                long j15 = ((y2.l) ((a1) this.f112w).getValue()).f30813a;
                j1.b g8 = j1Var.g();
                if (g8 != null) {
                    long j16 = g8.f18762a;
                    e1 e1Var2 = j1Var.f19321d;
                    if (e1Var2 != null) {
                        gVar = e1Var2.f17062a.f17232a;
                    } else {
                        gVar = null;
                    }
                    if (gVar != null && gVar.f20477v.length() != 0) {
                        r0 r0Var = (r0) j1Var.f19333r.getValue();
                        if (r0Var == null) {
                            i10 = -1;
                        } else {
                            i10 = l1.f19352a[r0Var.ordinal()];
                        }
                        if (i10 != -1) {
                            if (i10 != 1 && i10 != 2) {
                                if (i10 == 3) {
                                    long j17 = j1Var.k().f24516b;
                                    int i25 = m2.p0.f20545c;
                                    j12 = j17 & 4294967295L;
                                } else {
                                    l4.a.o();
                                    return null;
                                }
                            } else {
                                long j18 = j1Var.k().f24516b;
                                int i26 = m2.p0.f20545c;
                                j12 = j18 >> 32;
                            }
                            int i27 = (int) j12;
                            e1 e1Var3 = j1Var.f19321d;
                            if (e1Var3 != null && (d2 = e1Var3.d()) != null && (e1Var = j1Var.f19321d) != null && (gVar2 = e1Var.f17062a.f17232a) != null) {
                                int e8 = b9.e(j1Var.f19319b.g(i27), 0, gVar2.f20477v.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d2.d(j16) >> 32));
                                m2.m0 m0Var = d2.f17113a;
                                m2.q qVar3 = m0Var.f20525b;
                                int d11 = qVar3.d(e8);
                                float f16 = m0Var.f(d11);
                                float g10 = m0Var.g(d11);
                                float d12 = b9.d(intBitsToFloat, Math.min(f16, g10), Math.max(f16, g10));
                                if (y2.c(j15, 0L) || Math.abs(intBitsToFloat - d12) <= ((int) (j15 >> 32)) / 2) {
                                    float f17 = qVar3.f(d11);
                                    j11 = (Float.floatToRawIntBits(d12) << 32) | (Float.floatToRawIntBits(((qVar3.b(d11) - f17) / 2) + f17) & 4294967295L);
                                    return new j1.b(j11);
                                }
                            }
                        }
                    }
                }
                j11 = 9205357640488583168L;
                return new j1.b(j11);
            case 18:
                ((rf.l) this.f111v).e(this.f112w);
                return pe.z.f22715a;
            case 19:
                i iVar = (i) this.f111v;
                k1.p0 p0Var = iVar.L;
                b2.l0 l0Var2 = (b2.l0) this.f112w;
                iVar.Q = p0Var.a(l0Var2.f1533u.e(), l0Var2.getLayoutDirection(), l0Var2);
                return pe.z.f22715a;
            case 20:
                ((kotlin.jvm.internal.y) this.f111v).f19787u = b2.l.h((b0) this.f112w, y0.f31903a);
                return pe.z.f22715a;
            default:
                ((v1.e) this.f111v).d((d1.q) this.f112w);
                return pe.z.f22715a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, int i, Object obj2) {
        super(0);
        this.f110u = i;
        this.f111v = obj;
        this.f112w = obj2;
    }
}