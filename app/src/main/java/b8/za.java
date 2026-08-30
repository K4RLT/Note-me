package b8;
import d.f;
import d1.o;
import d1.r;
import f0.e;
import j7.a;
import k1.l0;
import k1.m0;
import kb.d;
import r0.m;
import z.b;
import z0.c;

import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class za implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3103u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f3104v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f3105w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3106x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3107y;

    public /* synthetic */ za(Object obj, float f10, float f11, Object obj2, int i) {
        this.f3103u = i;
        this.f3106x = obj;
        this.f3104v = f10;
        this.f3105w = f11;
        this.f3107y = obj2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float a10;
        float f10;
        switch (this.f3103u) {
            case 0:
                final List list = (List) this.f3106x;
                final df.a aVar = (df.a) this.f3107y;
                e eVar = (e) obj;
                eVar.getClass();
                boolean isEmpty = list.isEmpty();
                final float f11 = this.f3104v;
                final float f12 = this.f3105w;
                if (isEmpty) {
                    e.n(eVar, null, new c(663547187, new df.q() { // from class: b8.cb
                        @Override // df.q
                        public final Object b(Object obj2, Object obj3, Object obj4) {
                            boolean z3;
                            m mVar = (m) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            ((b) obj2).getClass();
                            if ((intValue & 17) != 16) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            r rVar = (r) mVar;
                            if (rVar.R(intValue & 1, z3)) {
                                o oVar = o.f15687a;
                                float f13 = f11;
                                r n10 = androidx.compose.foundation.layout.d.n(androidx.compose.foundation.layout.f(oVar, f13), f12);
                                float f14 = m0.f30239a;
                                x.a(0, androidx.compose.foundation.a.b(wa.a(n10, e.a(f13 * 0.05333333f)), r.c(r.f19515d, 0.04f), l0.f19495a), rVar);
                            } else {
                                rVar.U();
                            }
                            return pe.z.f22715a;
                        }
                    }, true), 3);
                } else {
                    e.p(eVar, list.size(), null, new c(65423813, new df.r() { // from class: b8.db
                        @Override // df.r
                        public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                            boolean z3;
                            int i;
                            int intValue = ((Integer) obj3).intValue();
                            m mVar = (m) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            ((b) obj2).getClass();
                            if ((intValue2 & 48) == 0) {
                                if (((r) mVar).d(intValue)) {
                                    i = 32;
                                } else {
                                    i = 16;
                                }
                                intValue2 |= i;
                            }
                            if ((intValue2 & 145) != 144) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            r rVar = (r) mVar;
                            if (rVar.R(intValue2 & 1, z3)) {
                                d((File) list.get(intValue), f12, f11, aVar, rVar, 432);
                            } else {
                                rVar.U();
                            }
                            return pe.z.f22715a;
                        }
                    }, true), 6);
                }
                return pe.z.f22715a;
            default:
                w7.q4 q4Var = (w7.q4) this.f3106x;
                String str = (String) this.f3107y;
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                long j10 = q4Var.f28953d;
                m0Var.n(Float.intBitsToFloat((int) (j10 >> 32)) - (this.f3104v / 2.0f));
                m0Var.r(Float.intBitsToFloat((int) (j10 & 4294967295L)) - (this.f3105w / 2.0f));
                m0Var.h(1.08f);
                m0Var.i(1.08f);
                m0Var.g(-4.0f);
                if (str != null) {
                    a10 = 0.0f;
                } else {
                    a10 = 20 * m0Var.J.a();
                }
                m0Var.j(a10);
                if (str != null) {
                    f10 = 0.4f;
                } else {
                    f10 = 0.97f;
                }
                m0Var.b(f10);
                return pe.z.f22715a;
        }
    }
}
