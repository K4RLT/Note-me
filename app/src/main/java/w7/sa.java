package w7;
import d1.o;
import d1.r;
import k1.l0;
import k1.r;
import p.a;
import r0.l;
import r0.m;
import r0.r;
import sa.a;
import x.m;
import z.b;
import z.e;
import z0.c;

import com.facebook.ads.AdError;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final /* synthetic */ class sa implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29091u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f29092v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29093w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f29094x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f29095y;

    public /* synthetic */ sa(u7.m3 m3Var, int i, int i10, String str) {
        this.f29091u = 2;
        this.f29093w = m3Var;
        this.f29094x = i;
        this.f29095y = i10;
        this.f29092v = str;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        b1.c0 c0Var;
        b1.c0 c0Var2;
        switch (this.f29091u) {
            case 0:
                final u7.d dVar = (u7.d) this.f29092v;
                e eVar = (e) obj;
                eVar.getClass();
                int size = xa.f29466c.size();
                final int i = 0;
                final u7.m3 m3Var = this.f29093w;
                final int i10 = this.f29094x;
                final int i11 = this.f29095y;
                e.p(eVar, size, null, new c(1801728524, new df.r() { // from class: w7.ua
                    @Override // df.r
                    public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                        boolean z3;
                        boolean z9;
                        float f10;
                        long c10;
                        int i12;
                        boolean z10;
                        boolean z11;
                        float f11;
                        long c11;
                        int i13;
                        int i14 = i;
                        int intValue = ((Integer) obj3).intValue();
                        m mVar = (m) obj4;
                        int intValue2 = ((Integer) obj5).intValue();
                        ((b) obj2).getClass();
                        int i15 = intValue2 & 48;
                        switch (i14) {
                            case 0:
                                if (i15 == 0) {
                                    if (((r) mVar).d(intValue)) {
                                        i12 = 32;
                                    } else {
                                        i12 = 16;
                                    }
                                    intValue2 |= i12;
                                }
                                if ((intValue2 & 145) != 144) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                r rVar = (r) mVar;
                                if (rVar.R(intValue2 & 1, z3)) {
                                    final long j10 = ((r) xa.f29466c.get(intValue)).f19523a;
                                    final u7.d dVar2 = dVar;
                                    if (dVar2.f26048r == l0.F(j10)) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 24);
                                    f0.d dVar3 = f0.e.f16629a;
                                    r b10 = androidx.compose.foundation.a.b(wa.j7.a(k3, dVar3), j10, l0.f19495a);
                                    if (z9) {
                                        f10 = 2;
                                    } else {
                                        f10 = 1;
                                    }
                                    if (z9) {
                                        c10 = r.f19515d;
                                    } else {
                                        c10 = r.c(r.f19515d, 0.25f);
                                    }
                                    r a10 = ya.a(b10, f10, c10, dVar3);
                                    final u7.m3 m3Var2 = m3Var;
                                    boolean h3 = rVar.h(m3Var2);
                                    final int i16 = i10;
                                    boolean d2 = h3 | rVar.d(i16);
                                    final int i17 = i11;
                                    boolean d10 = d2 | rVar.d(i17) | rVar.f(dVar2) | rVar.e(j10);
                                    Object O = rVar.O();
                                    if (d10 || O == l.f24285a) {
                                        final int i18 = 0;
                                        df.a aVar = new df.a() { // from class: w7.va
                                            @Override // df.a
                                            public final Object invoke() {
                                                switch (i18) {
                                                    case 0:
                                                        u7.m3.r1(m3Var2, i16, i17, dVar2.f26033a, null, null, null, null, null, null, Integer.valueOf(l0.F(j10)), null, 1528);
                                                        break;
                                                    default:
                                                        u7.m3.r1(m3Var2, i16, i17, dVar2.f26033a, null, null, Integer.valueOf(l0.F(j10)), null, null, null, null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                                        break;
                                                }
                                                return pe.z.f22715a;
                                            }
                                        };
                                        rVar.k0(aVar);
                                        O = aVar;
                                    }
                                    m.a(0, androidx.compose.foundation.a.f(null, false, a10, (df.a) O, 7), rVar);
                                } else {
                                    rVar.U();
                                }
                                return pe.z.f22715a;
                            default:
                                if (i15 == 0) {
                                    if (((r) mVar).d(intValue)) {
                                        i13 = 32;
                                    } else {
                                        i13 = 16;
                                    }
                                    intValue2 |= i13;
                                }
                                if ((intValue2 & 145) != 144) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                r rVar2 = (r) mVar;
                                if (rVar2.R(intValue2 & 1, z10)) {
                                    final long j11 = ((r) cb.f28050b.get(intValue)).f19523a;
                                    final u7.d dVar4 = dVar;
                                    if (dVar4.f26036d == l0.F(j11)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    r k4 = androidx.compose.foundation.layout.d.k(o.f15687a, 28);
                                    f0.d dVar5 = f0.e.f16629a;
                                    r b11 = androidx.compose.foundation.a.b(wa.j7.a(k4, dVar5), j11, l0.f19495a);
                                    if (z11) {
                                        f11 = 2;
                                    } else {
                                        f11 = 1;
                                    }
                                    if (z11) {
                                        c11 = r.f19515d;
                                    } else {
                                        c11 = r.c(r.f19515d, 0.2f);
                                    }
                                    r a11 = ya.a(b11, f11, c11, dVar5);
                                    final u7.m3 m3Var3 = m3Var;
                                    boolean h10 = rVar2.h(m3Var3);
                                    final int i19 = i10;
                                    boolean d11 = h10 | rVar2.d(i19);
                                    final int i20 = i11;
                                    boolean d12 = d11 | rVar2.d(i20) | rVar2.f(dVar4) | rVar2.e(j11);
                                    Object O2 = rVar2.O();
                                    if (d12 || O2 == l.f24285a) {
                                        final int i21 = 1;
                                        df.a aVar2 = new df.a() { // from class: w7.va
                                            @Override // df.a
                                            public final Object invoke() {
                                                switch (i21) {
                                                    case 0:
                                                        u7.m3.r1(m3Var3, i19, i20, dVar4.f26033a, null, null, null, null, null, null, Integer.valueOf(l0.F(j11)), null, 1528);
                                                        break;
                                                    default:
                                                        u7.m3.r1(m3Var3, i19, i20, dVar4.f26033a, null, null, Integer.valueOf(l0.F(j11)), null, null, null, null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                                        break;
                                                }
                                                return pe.z.f22715a;
                                            }
                                        };
                                        rVar2.k0(aVar2);
                                        O2 = aVar2;
                                    }
                                    m.a(0, androidx.compose.foundation.a.f(null, false, a11, (df.a) O2, 7), rVar2);
                                } else {
                                    rVar2.U();
                                }
                                return pe.z.f22715a;
                        }
                    }
                }, true), 6);
                break;
            case 1:
                final u7.d dVar2 = (u7.d) this.f29092v;
                e eVar2 = (e) obj;
                eVar2.getClass();
                int size2 = cb.f28050b.size();
                final int i12 = 1;
                final u7.m3 m3Var2 = this.f29093w;
                final int i13 = this.f29094x;
                final int i14 = this.f29095y;
                e.p(eVar2, size2, null, new c(853661038, new df.r() { // from class: w7.ua
                    @Override // df.r
                    public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                        boolean z3;
                        boolean z9;
                        float f10;
                        long c10;
                        int i122;
                        boolean z10;
                        boolean z11;
                        float f11;
                        long c11;
                        int i132;
                        int i142 = i12;
                        int intValue = ((Integer) obj3).intValue();
                        m mVar = (m) obj4;
                        int intValue2 = ((Integer) obj5).intValue();
                        ((b) obj2).getClass();
                        int i15 = intValue2 & 48;
                        switch (i142) {
                            case 0:
                                if (i15 == 0) {
                                    if (((r) mVar).d(intValue)) {
                                        i122 = 32;
                                    } else {
                                        i122 = 16;
                                    }
                                    intValue2 |= i122;
                                }
                                if ((intValue2 & 145) != 144) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                r rVar = (r) mVar;
                                if (rVar.R(intValue2 & 1, z3)) {
                                    final long j10 = ((r) xa.f29466c.get(intValue)).f19523a;
                                    final u7.d dVar22 = dVar2;
                                    if (dVar22.f26048r == l0.F(j10)) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    r k3 = androidx.compose.foundation.layout.d.k(o.f15687a, 24);
                                    f0.d dVar3 = f0.e.f16629a;
                                    r b10 = androidx.compose.foundation.a.b(wa.j7.a(k3, dVar3), j10, l0.f19495a);
                                    if (z9) {
                                        f10 = 2;
                                    } else {
                                        f10 = 1;
                                    }
                                    if (z9) {
                                        c10 = r.f19515d;
                                    } else {
                                        c10 = r.c(r.f19515d, 0.25f);
                                    }
                                    r a10 = ya.a(b10, f10, c10, dVar3);
                                    final u7.m3 m3Var22 = m3Var2;
                                    boolean h3 = rVar.h(m3Var22);
                                    final int i16 = i13;
                                    boolean d2 = h3 | rVar.d(i16);
                                    final int i17 = i14;
                                    boolean d10 = d2 | rVar.d(i17) | rVar.f(dVar22) | rVar.e(j10);
                                    Object O = rVar.O();
                                    if (d10 || O == l.f24285a) {
                                        final int i18 = 0;
                                        df.a aVar = new df.a() { // from class: w7.va
                                            @Override // df.a
                                            public final Object invoke() {
                                                switch (i18) {
                                                    case 0:
                                                        u7.m3.r1(m3Var22, i16, i17, dVar22.f26033a, null, null, null, null, null, null, Integer.valueOf(l0.F(j10)), null, 1528);
                                                        break;
                                                    default:
                                                        u7.m3.r1(m3Var22, i16, i17, dVar22.f26033a, null, null, Integer.valueOf(l0.F(j10)), null, null, null, null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                                        break;
                                                }
                                                return pe.z.f22715a;
                                            }
                                        };
                                        rVar.k0(aVar);
                                        O = aVar;
                                    }
                                    m.a(0, androidx.compose.foundation.a.f(null, false, a10, (df.a) O, 7), rVar);
                                } else {
                                    rVar.U();
                                }
                                return pe.z.f22715a;
                            default:
                                if (i15 == 0) {
                                    if (((r) mVar).d(intValue)) {
                                        i132 = 32;
                                    } else {
                                        i132 = 16;
                                    }
                                    intValue2 |= i132;
                                }
                                if ((intValue2 & 145) != 144) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                r rVar2 = (r) mVar;
                                if (rVar2.R(intValue2 & 1, z10)) {
                                    final long j11 = ((r) cb.f28050b.get(intValue)).f19523a;
                                    final u7.d dVar4 = dVar2;
                                    if (dVar4.f26036d == l0.F(j11)) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    r k4 = androidx.compose.foundation.layout.d.k(o.f15687a, 28);
                                    f0.d dVar5 = f0.e.f16629a;
                                    r b11 = androidx.compose.foundation.a.b(wa.j7.a(k4, dVar5), j11, l0.f19495a);
                                    if (z11) {
                                        f11 = 2;
                                    } else {
                                        f11 = 1;
                                    }
                                    if (z11) {
                                        c11 = r.f19515d;
                                    } else {
                                        c11 = r.c(r.f19515d, 0.2f);
                                    }
                                    r a11 = ya.a(b11, f11, c11, dVar5);
                                    final u7.m3 m3Var3 = m3Var2;
                                    boolean h10 = rVar2.h(m3Var3);
                                    final int i19 = i13;
                                    boolean d11 = h10 | rVar2.d(i19);
                                    final int i20 = i14;
                                    boolean d12 = d11 | rVar2.d(i20) | rVar2.f(dVar4) | rVar2.e(j11);
                                    Object O2 = rVar2.O();
                                    if (d12 || O2 == l.f24285a) {
                                        final int i21 = 1;
                                        df.a aVar2 = new df.a() { // from class: w7.va
                                            @Override // df.a
                                            public final Object invoke() {
                                                switch (i21) {
                                                    case 0:
                                                        u7.m3.r1(m3Var3, i19, i20, dVar4.f26033a, null, null, null, null, null, null, Integer.valueOf(l0.F(j11)), null, 1528);
                                                        break;
                                                    default:
                                                        u7.m3.r1(m3Var3, i19, i20, dVar4.f26033a, null, null, Integer.valueOf(l0.F(j11)), null, null, null, null, null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                                        break;
                                                }
                                                return pe.z.f22715a;
                                            }
                                        };
                                        rVar2.k0(aVar2);
                                        O2 = aVar2;
                                    }
                                    m.a(0, androidx.compose.foundation.a.f(null, false, a11, (df.a) O2, 7), rVar2);
                                } else {
                                    rVar2.U();
                                }
                                return pe.z.f22715a;
                        }
                    }
                }, true), 6);
                break;
            default:
                String str = (String) this.f29092v;
                String str2 = (String) obj;
                str2.getClass();
                String obj2 = mf.f.I(str2).toString();
                if (!mf.f.u(obj2)) {
                    Integer c10 = u7.a.c(str);
                    u7.m3 m3Var3 = this.f29093w;
                    int i15 = this.f29094x;
                    int i16 = this.f29095y;
                    if (c10 != null) {
                        m3Var3.y0(i15, i16, c10.intValue(), new b8.w(obj2, 13));
                    } else {
                        b1.v vVar = (b1.v) a.h(m3Var3.y(i15), Integer.valueOf(i16), m3Var3.f26533f);
                        if (vVar != null && !vVar.isEmpty()) {
                            ListIterator listIterator = vVar.listIterator();
                            do {
                                c0Var2 = (b1.c0) listIterator;
                                if (c0Var2.hasNext()) {
                                }
                            } while (!kotlin.jvm.internal.l.a(((u7.b) c0Var2.next()).f25917a, str));
                            m3Var3.x0(i15, i16, str, new b8.w(obj2, 14));
                        }
                        b1.v vVar2 = (b1.v) a.h(m3Var3.y(i15), Integer.valueOf(i16), m3Var3.f26535h);
                        if (vVar2 != null && !vVar2.isEmpty()) {
                            ListIterator listIterator2 = vVar2.listIterator();
                            do {
                                c0Var = (b1.c0) listIterator2;
                                if (c0Var.hasNext()) {
                                }
                            } while (!kotlin.jvm.internal.l.a(((u7.c) c0Var.next()).f25969a, str));
                            m3Var3.z0(i15, i16, str, new b8.w(obj2, 15));
                        }
                        m3Var3.A0(i15, i16, str, new b8.w(obj2, 16));
                    }
                }
                return pe.z.f22715a;
        }
        return pe.z.f22715a;
    }

    public /* synthetic */ sa(u7.d dVar, u7.m3 m3Var, int i, int i10, int i11) {
        this.f29091u = i11;
        this.f29092v = dVar;
        this.f29093w = m3Var;
        this.f29094x = i;
        this.f29095y = i10;
    }
}
