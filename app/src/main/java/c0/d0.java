package c0;
import b0.b;
import b0.x;
import g0.a1;
import k0.n;
import p.g0;
import q.f0;

import c2.o1;
import g0.i2;
import g0.n1;
import g0.p1;
import k0.a1;
import k0.b1;
import k0.j1;
import p.q0;
import t.q1;
import t.r1;
import wa.n7;
import ya.ac;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.m implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3293u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3294v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i, Object obj) {
        super(2);
        this.f3293u = i;
        this.f3294v = obj;
    }

    /* JADX WARN: Type inference failed for: r9v23, types: [kotlin.jvm.internal.m, java.lang.Object, df.q] */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        long j10;
        int a10;
        boolean z9;
        switch (this.f3293u) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                i0 i0Var = (i0) this.f3294v;
                i0Var.f3348s.i(i0Var.i(intValue));
                return pe.z.f22715a;
            case 1:
                r0.m mVar = (r0.m) obj;
                int intValue2 = ((Number) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r0.r rVar = (r0.r) mVar;
                if (rVar.R(intValue2 & 1, z3)) {
                    ((c2.a) this.f3294v).a(0, rVar);
                } else {
                    rVar.U();
                }
                return pe.z.f22715a;
            case 2:
                ((Number) obj2).intValue();
                ((o1) this.f3294v).a(r0.y.L(1), (r0.m) obj);
                return pe.z.f22715a;
            case 3:
                ((Number) obj2).intValue();
                ((c3.t) this.f3294v).a(r0.y.L(1), (r0.m) obj);
                return pe.z.f22715a;
            case 4:
                ((Number) obj2).intValue();
                ((c3.x) this.f3294v).a(r0.y.L(1), (r0.m) obj);
                return pe.z.f22715a;
            case 5:
                d1.r rVar2 = (d1.r) obj;
                d1.r rVar3 = (d1.p) obj2;
                r0.m mVar2 = (r0.m) this.f3294v;
                if (rVar3 instanceof d1.m) {
                    Object r92 = ((d1.m) rVar3).f15685a;
                    kotlin.jvm.internal.b(3, r92);
                    rVar3 = d1.a.b((d1.r) r92.b(d1.o.f15687a, mVar2, 0), mVar2);
                }
                return rVar2.d(rVar3);
            case 6:
                ((f1.d) this.f3294v).j(((Number) obj).intValue(), (j2.n) obj2);
                return pe.z.f22715a;
            case 7:
                long longValue = ((Number) obj2).longValue();
                if (b1.a((a1) this.f3294v, longValue)) {
                    return Long.valueOf(longValue);
                }
                return null;
            case 8:
                ((Number) obj2).intValue();
                r0.r rVar4 = (r0.r) ((r0.m) obj);
                rVar4.a0(-1744780674);
                String b10 = n7.b(((n1) this.f3294v).f17227u, rVar4);
                rVar4.p(false);
                return b10;
            case 9:
                ((Number) obj2).intValue();
                a1.j((j1) this.f3294v, (r0.m) obj, r0.y.L(1));
                return pe.z.f22715a;
            case 10:
                ((p1) this.f3294v).d(((j1.b) obj2).f18762a);
                return pe.z.f22715a;
            case 11:
                ((Number) obj2).intValue();
                ((i2) this.f3294v).a(r0.y.L(1), (r0.m) obj);
                return pe.z.f22715a;
            case 12:
                z1.x xVar = (z1.x) this.f3294v;
                z1.x c10 = ((n) obj).c();
                z1.x c11 = ((n) obj2).c();
                long j11 = 0;
                if (c10 != null) {
                    j10 = xVar.d(c10, 0L);
                } else {
                    j10 = 0;
                }
                if (c11 != null) {
                    j11 = xVar.d(c11, 0L);
                }
                int i = (int) (j10 & 4294967295L);
                int i10 = (int) (4294967295L & j11);
                if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i10)) {
                    a10 = ac.a(Float.valueOf(Float.intBitsToFloat((int) (j10 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j11 >> 32))));
                } else {
                    a10 = ac.a(Float.valueOf(Float.intBitsToFloat(i)), Float.valueOf(Float.intBitsToFloat(i10)));
                }
                return Integer.valueOf(a10);
            case 13:
                g0 g0Var = (g0) obj;
                g0 g0Var2 = (g0) obj2;
                g0 g0Var3 = g0.f22154w;
                if (g0Var == g0Var3 && g0Var2 == g0Var3 && !((q0) this.f3294v).f22233a.e) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 14:
                ((Number) obj2).intValue();
                ((f0) this.f3294v).a(r0.y.L(1), (r0.m) obj);
                return pe.z.f22715a;
            case 15:
                float floatValue = ((Number) obj).floatValue();
                float floatValue2 = ((Number) obj2).floatValue();
                r1 r1Var = (r1) this.f3294v;
                pf.x(r1Var.M0(), null, new q1(r1Var, floatValue, floatValue2, null, 0), 3);
                return Boolean.TRUE;
            case 16:
                return new y2.j((((d1.i) this.f3294v).a(0, (int) (((y2.l) obj).f30813a & 4294967295L)) & 4294967295L) | (0 << 32));
            case 17:
                return new y2.j(((d1.j) this.f3294v).a(0L, ((y2.l) obj).f30813a, (y2.m) obj2));
            default:
                long j12 = ((y2.l) obj).f30813a;
                return new y2.j((((d1.h) this.f3294v).a(0, (int) (j12 >> 32), (y2.m) obj2) << 32) | (0 & 4294967295L));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(Object obj, int i, int i10) {
        super(2);
        this.f3293u = i10;
        this.f3294v = obj;
    }
}