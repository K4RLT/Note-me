package w7;
import a1.g;
import c.d;
import c.k;
import c.m;
import d1.c;
import d1.o;
import d1.r;
import h9.c;
import m2.f0;
import p.p0;
import p.x;
import r0.a1;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.v0;
import r0.y;
import w7.a;
import x.p;
import y2.c;
import z0.h;
import z1.x;

import android.content.Context;
import android.util.LruCache;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes.dex */
public abstract class w7 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f29379a = 14;

    public static final void a(final p pVar, final u7.m3 m3Var, final e3 e3Var, final boolean z3, final int i, final int i10, final boolean z9, final x xVar, final a1 a1Var, final a1 a1Var2, final a1 a1Var3, final LruCache lruCache, final a1 a1Var4, final a1 a1Var5, final a1 a1Var6, final o0 o0Var, final h0 h0Var, final df.l lVar, m mVar, final int i11) {
        int i12;
        e3 e3Var2;
        int i13;
        int i14;
        float f10;
        pVar.getClass();
        a1Var2.getClass();
        lruCache.getClass();
        r rVar = (r) mVar;
        rVar.c0(2111986470);
        if ((i11 & 6) == 0) {
            i12 = (rVar.f(pVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= rVar.h(m3Var) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            e3Var2 = e3Var;
            i12 |= rVar.f(e3Var2) ? 256 : 128;
        } else {
            e3Var2 = e3Var;
        }
        if ((i11 & 24576) == 0) {
            i13 = i;
            i12 |= rVar.d(i13) ? 16384 : 8192;
        } else {
            i13 = i;
        }
        if ((196608 & i11) == 0) {
            i14 = i10;
            i12 |= rVar.d(i14) ? 131072 : 65536;
        } else {
            i14 = i10;
        }
        if ((1572864 & i11) == 0) {
            i12 |= rVar.g(z9) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= rVar.h(xVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i12 |= rVar.f(a1Var) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i12 |= rVar.f(a1Var2) ? 536870912 : 268435456;
        }
        if (rVar.R(i12 & 1, ((i12 & 306782355) == 306782354 && (((((28038 | (rVar.h(lruCache) ? ' ' : (char) 16)) | (rVar.h(o0Var) ? 131072 : 65536)) | (rVar.h(h0Var) ? (char) 0 : (char) 0)) | (rVar.h(lVar) ? (char) 0 : (char) 0)) & 4793491) == 4793490) ? false : true)) {
            final Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = y.p(rVar);
                rVar.k0(O);
            }
            final pf.z zVar = (pf.z) O;
            boolean z10 = ((Boolean) a1Var.getValue()).booleanValue() && z9 && !e3Var2.m();
            r a10 = pVar.a(o.f15687a, c.B);
            if (e3Var2.p() > 0) {
                rVar.a0(-1900414498);
                f10 = ((c) rVar.j(c2.p1.f3606h)).Y(e3Var2.p());
                rVar.p(false);
            } else {
                rVar.a0(-1900410680);
                rVar.p(false);
                f10 = 132;
            }
            r o10 = androidx.compose.foundation.layout.a.o(a10, 0.0f, 0.0f, 0.0f, f10 - f29379a, 7);
            q.r0 r8 = q.e.r(0.8f, 520.0f, null, 4);
            Object O2 = rVar.O();
            if (O2 == v0Var) {
                O2 = new f0(13);
                rVar.k0(O2);
            }
            p0 a11 = androidx.compose.animation.k((df.l) O2, r8).a(androidx.compose.animation.d(q.e.r(0.8f, 520.0f, null, 4), 2));
            q.r0 r10 = q.e.r(1.0f, 800.0f, null, 4);
            Object O3 = rVar.O();
            if (O3 == v0Var) {
                O3 = new f0(13);
                rVar.k0(O3);
            }
            final e3 e3Var3 = e3Var2;
            final int i15 = i13;
            final int i16 = i14;
            ya.c(z10, o10, a11, androidx.compose.animation.m((df.l) O3, r10).a(androidx.compose.animation.c.e(q.e.r(1.0f, 800.0f, null, 4), 2)), null, h.d(1728665934, new df.q() { // from class: w7.r7
                @Override // df.q
                public final Object b(Object obj, Object obj2, Object obj3) {
                    pf.z zVar2;
                    u7.m3 m3Var2;
                    int i17;
                    Context context2;
                    int i18;
                    ((Integer) obj3).getClass();
                    ((x) obj).getClass();
                    final a1 a1Var7 = a1.this;
                    String str = (String) a1Var7.getValue();
                    r rVar2 = (r) ((m) obj2);
                    boolean f11 = rVar2.f(a1Var7);
                    Object O4 = rVar2.O();
                    Object obj4 = l.f24285a;
                    if (f11 || O4 == obj4) {
                        O4 = new b8.a0(a1Var7, 25);
                        rVar2.k0(O4);
                    }
                    df.l lVar2 = (df.l) O4;
                    final a1 a1Var8 = a1Var;
                    boolean f12 = rVar2.f(a1Var8) | rVar2.f(a1Var7);
                    Object obj5 = o0Var;
                    boolean f13 = f12 | rVar2.f(obj5);
                    Object O5 = rVar2.O();
                    if (f13 || O5 == obj4) {
                        O5 = new androidx.ink.brush.i(12, obj5, a1Var8, a1Var7);
                        rVar2.k0(O5);
                    }
                    df.a aVar = (df.a) O5;
                    Object obj6 = h0Var;
                    boolean f14 = rVar2.f(obj6);
                    Object O6 = rVar2.O();
                    if (f14 || O6 == obj4) {
                        O6 = new b8.e8(4, obj6);
                        rVar2.k0(O6);
                    }
                    df.q qVar = (df.q) O6;
                    e3 e3Var4 = e3Var3;
                    k0 k0Var = new k0(e3Var4, 5);
                    a1 a1Var9 = a1Var3;
                    boolean f15 = rVar2.f(a1Var9);
                    Object O7 = rVar2.O();
                    if (f15 || O7 == obj4) {
                        O7 = new b8.a0(a1Var9, 26);
                        rVar2.k0(O7);
                    }
                    df.l lVar3 = (df.l) O7;
                    boolean f16 = rVar2.f(a1Var8) | rVar2.f(a1Var7);
                    Object O8 = rVar2.O();
                    if (f16 || O8 == obj4) {
                        O8 = new b8.s6(21, a1Var8, a1Var7);
                        rVar2.k0(O8);
                    }
                    df.a aVar2 = (df.a) O8;
                    boolean f17 = rVar2.f(a1Var8) | rVar2.f(a1Var7);
                    final x xVar2 = xVar;
                    boolean h3 = f17 | rVar2.h(xVar2);
                    final pf.z zVar3 = zVar;
                    boolean h10 = h3 | rVar2.h(zVar3);
                    final Context context3 = context;
                    boolean h11 = h10 | rVar2.h(context3);
                    final u7.m3 m3Var3 = m3Var;
                    boolean h12 = h11 | rVar2.h(m3Var3);
                    final int i19 = i15;
                    boolean d2 = h12 | rVar2.d(i19);
                    final int i20 = i16;
                    boolean d10 = d2 | rVar2.d(i20);
                    Object O9 = rVar2.O();
                    if (!d10 && O9 != obj4) {
                        zVar2 = zVar3;
                        m3Var2 = m3Var3;
                        i17 = i19;
                        context2 = context3;
                        i18 = i20;
                    } else {
                        Object obj7 = new df.q() { // from class: w7.u7
                            /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
                            /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.v, java.lang.Object] */
                            @Override // df.q
                            public final Object b(Object obj8, Object obj9, Object obj10) {
                                x xVar3;
                                a5 a5Var = (a5) obj8;
                                Float f18 = (Float) obj9;
                                Float f19 = (Float) obj10;
                                a5Var.getClass();
                                a1Var8.setValue(Boolean.FALSE);
                                a1Var7.setValue(null);
                                Object obj11 = new Object();
                                obj11.f19784u = 0.5f;
                                Object obj12 = new Object();
                                obj12.f19784u = 0.5f;
                                if (f18 != null && f19 != null && (xVar3 = x.this) != null) {
                                    float floatValue = f18.floatValue();
                                    long E = xVar3.E((Float.floatToRawIntBits(f19.floatValue()) & 4294967295L) | (Float.floatToRawIntBits(floatValue) << 32));
                                    float k3 = (int) (xVar3.k() >> 32);
                                    float k4 = (int) (xVar3.k() & 4294967295L);
                                    obj11.f19784u = wa.b9.d(Float.intBitsToFloat((int) (E >> 32)) / k3, 0.0f, 1.0f);
                                    obj12.f19784u = wa.b9.d(Float.intBitsToFloat((int) (E & 4294967295L)) / k4, 0.0f, 1.0f);
                                }
                                pf.b0.x(zVar3, null, new b8.i1(m3Var3, i19, i20, (kotlin.jvm.internal.v) obj11, (kotlin.jvm.internal.v) obj12, a5Var, context3, (te.c) null), 3);
                                return pe.z.f22715a;
                            }
                        };
                        zVar2 = zVar3;
                        m3Var2 = m3Var3;
                        i17 = i19;
                        context2 = context3;
                        i18 = i20;
                        rVar2.k0(obj7);
                        O9 = obj7;
                    }
                    df.q qVar2 = (df.q) O9;
                    int i21 = i18;
                    a1 a1Var10 = a1Var4;
                    a1 a1Var11 = a1Var5;
                    a1 a1Var12 = a1Var6;
                    s7 s7Var = new s7(xVar2, m3Var2, i17, i21, a1Var8, a1Var7, e3Var4, a1Var10, a1Var11, a1Var12);
                    s7 s7Var2 = new s7(xVar2, zVar2, m3Var2, i17, i21, context2, e3Var4, a1Var11, a1Var12, a1Var10);
                    boolean f18 = rVar2.f(a1Var8) | rVar2.f(a1Var7);
                    Object obj8 = lVar;
                    boolean f19 = f18 | rVar2.f(obj8);
                    Object O10 = rVar2.O();
                    if (f19 || O10 == obj4) {
                        O10 = new g(23, obj8, a1Var8, a1Var7);
                        rVar2.k0(O10);
                    }
                    u7.m3 m3Var4 = m3Var2;
                    int i22 = i17;
                    n4.r0(str, lVar2, i22, i21, m3Var4, lruCache, aVar, qVar, k0Var, lVar3, aVar2, qVar2, s7Var, s7Var2, (df.l) O10, rVar2, 0);
                    return pe.z.f22715a;
                }
            }, rVar), rVar, 196608, 16);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: w7.t7
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(i11 | 1);
                    a(p.this, m3Var, e3Var, z3, i, i10, z9, xVar, a1Var, a1Var2, a1Var3, lruCache, a1Var4, a1Var5, a1Var6, o0Var, h0Var, lVar, (m) obj, L);
                    return pe.z.f22715a;
                }
            };
        }
    }
}