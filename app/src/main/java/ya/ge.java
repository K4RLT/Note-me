package ya;
import n.a;
import c2.p1;
import c3.b0;
import c3.n;
import df.p;
import k1.l0;
import r0.a1;
import r0.l;
import r0.q1;
import r0.r;
import r0.v0;
import x7.w;
import y2.c;
import z0.h;

import pe.z;
import r0.m;
import r0.y;
import ya.ge;

/* loaded from: classes.dex */
public abstract class ge {
    public static final void a(final boolean z3, final a aVar, final a aVar2, final a aVar3, final a aVar4, final a aVar5, final a aVar6, final a aVar7, final a aVar8, final a aVar9, m mVar, final int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z9;
        q1 t3;
        p pVar;
        a1 a1Var;
        Object nVar;
        int i15;
        Object cVar;
        float f10;
        aVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        aVar6.getClass();
        aVar7.getClass();
        aVar8.getClass();
        aVar9.getClass();
        r rVar = (r) mVar;
        rVar.c0(-1773625405);
        if (rVar.g(z3)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i16 = i | i10;
        if (rVar.h(aVar2)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i17 = i16 | i11;
        if (rVar.h(aVar6)) {
            i12 = 1048576;
        } else {
            i12 = 524288;
        }
        int i18 = i17 | i12;
        if (rVar.h(aVar8)) {
            i13 = 67108864;
        } else {
            i13 = 33554432;
        }
        int i19 = i18 | i13;
        if (rVar.h(null)) {
            i14 = 536870912;
        } else {
            i14 = 268435456;
        }
        int i20 = i19 | i14;
        boolean z10 = true;
        if ((306783363 & i20) == 306783362) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (rVar.R(i20 & 1, z9)) {
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = y.B(Boolean.valueOf(z3));
                rVar.k0(O);
            }
            a1 a1Var2 = (a1) O;
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = y.B(Boolean.FALSE);
                rVar.k0(O2);
            }
            a1 a1Var3 = (a1) O2;
            Boolean valueOf = Boolean.valueOf(z3);
            if ((i20 & 14) != 4) {
                z10 = false;
            }
            Object O3 = rVar.O();
            if (z10 || O3 == v0Var) {
                a1Var = a1Var3;
                i15 = 14;
                nVar = new n(z3, a1Var2, a1Var, null, 5);
                rVar.k0(nVar);
            } else {
                a1Var = a1Var3;
                nVar = O3;
                i15 = 14;
            }
            y.f((p) nVar, valueOf, rVar);
            if (!((Boolean) a1Var2.getValue()).booleanValue()) {
                t3 = rVar.t();
                if (t3 != null) {
                    final int i21 = 0;
                    pVar = new p(z3, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, i, i21) { // from class: y7.a
                        public final /* synthetic */ a A;
                        public final /* synthetic */ a B;
                        public final /* synthetic */ a C;
                        public final /* synthetic */ a D;
                        public final /* synthetic */ a E;

                        /* renamed from: u, reason: collision with root package name */
                        public final /* synthetic */ int f30971u;

                        /* renamed from: v, reason: collision with root package name */
                        public final /* synthetic */ boolean f30972v;

                        /* renamed from: w, reason: collision with root package name */
                        public final /* synthetic */ a f30973w;

                        /* renamed from: x, reason: collision with root package name */
                        public final /* synthetic */ a f30974x;

                        /* renamed from: y, reason: collision with root package name */
                        public final /* synthetic */ a f30975y;

                        /* renamed from: z, reason: collision with root package name */
                        public final /* synthetic */ a f30976z;

                        {
                            this.f30971u = i21;
                        }

                        @Override // p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.f30971u) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int L = y.L(12807217);
                                    a(this.f30972v, this.f30973w, this.f30974x, this.f30975y, this.f30976z, this.A, this.B, this.C, this.D, this.E, (m) obj, L);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int L2 = y.L(12807217);
                                    a(this.f30972v, this.f30973w, this.f30974x, this.f30975y, this.f30976z, this.A, this.B, this.C, this.D, this.E, (m) obj, L2);
                                    break;
                            }
                            return z.f22715a;
                        }
                    };
                    t3.f24332d = pVar;
                }
                return;
            }
            long d2 = l0.d(4062323239L);
            c cVar2 = (c) rVar.j(p1.f3606h);
            float l0 = cVar2.l0(16);
            int b10 = a.b(cVar2.l0(8));
            int b11 = a.b(cVar2.l0(2));
            Object O4 = rVar.O();
            if (O4 == v0Var) {
                O4 = y.B(null);
                rVar.k0(O4);
            }
            a1 a1Var4 = (a1) O4;
            Object O5 = rVar.O();
            if (O5 == v0Var) {
                O5 = y.B(0);
                rVar.k0(O5);
            }
            a1 a1Var5 = (a1) O5;
            boolean c10 = rVar.c(l0) | rVar.d(b10) | rVar.d(b11);
            Object O6 = rVar.O();
            if (!c10 && O6 != v0Var) {
                cVar = O6;
                f10 = l0;
            } else {
                cVar = new c(b10, b11, l0, a1Var4, a1Var5);
                f10 = l0;
                rVar.k0(cVar);
            }
            n.a((c) cVar, aVar9, new b0(i15, false), h.d(554399585, new w(a1Var, a1Var4, a1Var5, f10, d2, aVar2, aVar9, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8), rVar), rVar, 3504, 0);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            final int i22 = 1;
            pVar = new p(z3, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, i, i22) { // from class: y7.a
                public final /* synthetic */ a A;
                public final /* synthetic */ a B;
                public final /* synthetic */ a C;
                public final /* synthetic */ a D;
                public final /* synthetic */ a E;

                /* renamed from: u, reason: collision with root package name */
                public final /* synthetic */ int f30971u;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ boolean f30972v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ a f30973w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ a f30974x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ a f30975y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ a f30976z;

                {
                    this.f30971u = i22;
                }

                @Override // p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f30971u) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int L = y.L(12807217);
                            a(this.f30972v, this.f30973w, this.f30974x, this.f30975y, this.f30976z, this.A, this.B, this.C, this.D, this.E, (m) obj, L);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int L2 = y.L(12807217);
                            a(this.f30972v, this.f30973w, this.f30974x, this.f30975y, this.f30976z, this.A, this.B, this.C, this.D, this.E, (m) obj, L2);
                            break;
                    }
                    return z.f22715a;
                }
            };
            t3.f24332d = pVar;
        }
    }
}
