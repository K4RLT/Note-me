package c3;
import b0.u;
import c.m;
import d.a;
import f.a;
import f.d;
import f.g;

import android.os.Bundle;
import b2.k0;
import b2.l0;
import c2.p1;
import c2.r2;
import g0.e1;
import g0.g2;
import g0.r1;
import java.util.LinkedHashMap;
import k0.j1;
import k1.r0;
import m2.p0;
import r0.a1;
import t.t0;
import t.u0;
import t.z1;
import wa.da;
import wa.q6;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3773u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f3774v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f3775w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3776x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3777y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f3778z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, m mVar, String str, q6 q6Var, a1 a1Var) {
        super(1);
        this.f3773u = 1;
        this.f3775w = aVar;
        this.f3776x = mVar;
        this.f3774v = str;
        this.f3777y = q6Var;
        this.f3778z = a1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        j1.c cVar;
        float rint;
        e1 e1Var;
        j1 j1Var;
        int i = this.f3773u;
        int i10 = 2;
        pe.z zVar = pe.z.f22715a;
        boolean z3 = true;
        Object obj2 = this.f3778z;
        Object obj3 = this.f3774v;
        Object obj4 = this.f3775w;
        Object obj5 = this.f3776x;
        Object obj6 = this.f3777y;
        switch (i) {
            case 0:
                x xVar = (x) obj4;
                xVar.H.addView(xVar, xVar.I);
                xVar.j((df.a) obj5, (b0) obj6, (String) obj3, (y2.m) obj2);
                return new u(5, xVar);
            case 1:
                a aVar = (a) obj4;
                m mVar = (m) obj5;
                String str = (String) obj3;
                q6 q6Var = (q6) obj6;
                b1.h hVar = new b1.h(i10, (a1) obj2);
                Bundle bundle = mVar.f3259g;
                str.getClass();
                mVar.c(str);
                mVar.e.put(str, new d(hVar, q6Var));
                LinkedHashMap linkedHashMap = mVar.f3258f;
                if (linkedHashMap.containsKey(str)) {
                    Object obj7 = linkedHashMap.get(str);
                    linkedHashMap.remove(str);
                    hVar.a(obj7);
                }
                a aVar2 = (a) da.a(bundle, str, a.class);
                if (aVar2 != null) {
                    bundle.remove(str);
                    hVar.a(q6Var.c(aVar2.f16604v, aVar2.f16603u));
                }
                aVar.f15632a = new g(mVar, str, q6Var, 1);
                return new u(6, aVar);
            case 2:
                l0 l0Var = (l0) obj;
                l0Var.b();
                float h3 = ((i0.h) obj4).f18049c.h();
                if (h3 != 0.0f) {
                    long j10 = ((r2.x) obj6).f24516b;
                    int i11 = p0.f20545c;
                    int g8 = ((r2.q) obj5).g((int) (j10 >> 32));
                    g2 d2 = ((e1) obj3).d();
                    if (d2 != null) {
                        cVar = d2.f17113a.c(g8);
                    } else {
                        cVar = new j1.c(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    float floor = (float) Math.floor(l0Var.l0(r1.f17272a));
                    if (floor < 1.0f) {
                        floor = 1.0f;
                    }
                    float f10 = floor / 2;
                    float f11 = cVar.f18763a + f10;
                    float intBitsToFloat = Float.intBitsToFloat((int) (l0Var.f1533u.e() >> 32)) - f10;
                    if (f11 > intBitsToFloat) {
                        f11 = intBitsToFloat;
                    }
                    if (f11 >= f10) {
                        f10 = f11;
                    }
                    if (((int) floor) % 2 == 1) {
                        rint = ((float) Math.floor(f10)) + 0.5f;
                    } else {
                        rint = (float) Math.rint(f10);
                    }
                    float f12 = cVar.f18764b;
                    long floatToRawIntBits = (Float.floatToRawIntBits(rint) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L);
                    float f13 = cVar.f18766d;
                    r0 r0Var = (r0) obj2;
                    m1.d.s0(l0Var, r0Var, floatToRawIntBits, (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(rint) << 32), floor, h3, 432);
                }
                return zVar;
            case 3:
                i0.r rVar = (i0.r) obj;
                i0.n nVar = ((i0.c) obj5).f18036a;
                rVar.f18079h = (r2.x) obj4;
                rVar.i = (r2.j) obj6;
                rVar.f18075c = (k0) obj3;
                rVar.f18076d = (df.l) obj2;
                r2 r2Var = null;
                if (nVar != null) {
                    e1Var = nVar.J;
                } else {
                    e1Var = null;
                }
                rVar.e = e1Var;
                if (nVar != null) {
                    j1Var = nVar.K;
                } else {
                    j1Var = null;
                }
                rVar.f18077f = j1Var;
                if (nVar != null) {
                    r2Var = (r2) b2.l.h(nVar, p1.f3616s);
                }
                rVar.f18078g = r2Var;
                return zVar;
            default:
                float floatValue = ((Number) obj).floatValue();
                kotlin.jvm.internal.v vVar = (kotlin.jvm.internal.v) obj6;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj5;
                f5.a aVar3 = (f5.a) obj4;
                u0 f14 = f5.a.f((rf.h) aVar3.f16727f);
                if (f14 != null) {
                    aVar3.g(f14);
                    u0 a10 = ((u0) yVar.f19787u).a(f14);
                    yVar.f19787u = a10;
                    z1 z1Var = (z1) obj3;
                    vVar.f19784u = z1Var.g(z1Var.e(a10.f25528a));
                    ((kotlin.jvm.internal.u) obj2).f19783u = !t0.a(r3 - floatValue);
                }
                if (f14 == null) {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(1);
        this.f3773u = i;
        this.f3775w = obj;
        this.f3776x = obj2;
        this.f3777y = obj3;
        this.f3774v = obj4;
        this.f3778z = obj5;
    }
}
