package u7;
import a.a;
import b1.y;
import b2.b0;
import b2.f;
import b2.g;
import b2.h;
import b8.e7;
import b8.n4;
import b8.o4;
import c.d;
import c.k;
import c.m;
import c2.n2;
import c2.p1;
import d.i;
import d1.c;
import d1.o;
import d1.r;
import k1.l0;
import m2.f0;
import p.p0;
import p.q0;
import p.x;
import q.e;
import q.r0;
import q.z;
import r0.a1;
import r0.l;
import r0.q1;
import r0.v0;
import u7.m3;
import u7.u0;
import v1.d0;
import x7.h0;
import x7.m0;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b8.ka;
import com.daren.scraply.R;
import java.util.concurrent.ConcurrentHashMap;
import ya.h9;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26903a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f26904b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f26905c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final float f26906d = 12;
    public static final float e = 9;

    /* renamed from: f, reason: collision with root package name */
    public static final ConcurrentHashMap f26907f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final ConcurrentHashMap f26908g = new ConcurrentHashMap();

    static {
        float f10 = 120;
        f26903a = f10;
        f26904b = f10 * 0.67333335f;
    }

    public static final void a(final m3 m3Var, final int i, final boolean z3, final float f10, final float f11, final float f12, final long j10, final df.a aVar, final df.a aVar2, final df.a aVar3, m mVar, final int i10) {
        int i11;
        boolean z9;
        r rVar;
        boolean z10;
        Context context;
        boolean z11;
        Object j0Var;
        int i12;
        Object obj;
        a1 a1Var;
        Boolean bool;
        Object obj2;
        View view;
        Context context2;
        a1 a1Var2;
        a1 a1Var3;
        a1 a1Var4;
        int i13;
        boolean z12;
        boolean z13;
        i iVar;
        Context context3;
        a1 a1Var5;
        a1 a1Var6;
        a1 a1Var7;
        a1 a1Var8;
        boolean z14;
        Object kaVar;
        a1 a1Var9;
        z zVar;
        boolean z15;
        boolean z16;
        final a1 a1Var10;
        final a1 a1Var11;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean h3;
        int i22;
        int i23;
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(292567744);
        int i24 = i10 & 6;
        androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f501a;
        if (i24 == 0) {
            if (rVar2.f(bVar)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i11 = i23 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i10 & 64) == 0) {
                h3 = rVar2.f(m3Var);
            } else {
                h3 = rVar2.h(m3Var);
            }
            if (h3) {
                i22 = 32;
            } else {
                i22 = 16;
            }
            i11 |= i22;
        }
        if ((i10 & 384) == 0) {
            if (rVar2.d(i)) {
                i21 = 256;
            } else {
                i21 = 128;
            }
            i11 |= i21;
        }
        if ((i10 & 3072) == 0) {
            if (rVar2.g(z3)) {
                i20 = 2048;
            } else {
                i20 = 1024;
            }
            i11 |= i20;
        }
        if ((i10 & 24576) == 0) {
            if (rVar2.c(f10)) {
                i19 = 16384;
            } else {
                i19 = 8192;
            }
            i11 |= i19;
        }
        if ((196608 & i10) == 0) {
            if (rVar2.c(f11)) {
                i18 = 131072;
            } else {
                i18 = 65536;
            }
            i11 |= i18;
        }
        if ((1572864 & i10) == 0) {
            if (rVar2.c(f12)) {
                i17 = 1048576;
            } else {
                i17 = 524288;
            }
            i11 |= i17;
        }
        if ((12582912 & i10) == 0) {
            if (rVar2.e(j10)) {
                i16 = 8388608;
            } else {
                i16 = 4194304;
            }
            i11 |= i16;
        }
        if ((i10 & 100663296) == 0) {
            if (rVar2.h(aVar)) {
                i15 = 67108864;
            } else {
                i15 = 33554432;
            }
            i11 |= i15;
        }
        if ((i10 & 805306368) == 0) {
            if (rVar2.h(aVar2)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i11 |= i14;
        }
        int i25 = i11;
        if ((306783379 & i25) == 306783378) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (rVar2.R(i25 & 1, z9)) {
            Context context4 = (Context) rVar2.j(AndroidCompositionLocals_androidKt.f642b);
            Object O = rVar2.O();
            Object obj3 = l.f24285a;
            if (O == obj3) {
                O = y.p(rVar2);
                rVar2.k0(O);
            }
            Object obj4 = (pf.z) O;
            View view2 = (View) rVar2.j(AndroidCompositionLocals_androidKt.f645f);
            Boolean valueOf = Boolean.valueOf(z3);
            int i26 = i25 & 7168;
            if (i26 == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object O2 = rVar2.O();
            if (z10 || O2 == obj3) {
                O2 = new o4(1, z3);
                rVar2.k0(O2);
            }
            y.c(valueOf, (df.l) O2, rVar2);
            Object O3 = rVar2.O();
            if (O3 == obj3) {
                O3 = y.B(Boolean.FALSE);
                rVar2.k0(O3);
            }
            final a1 a1Var12 = (a1) O3;
            Object O4 = rVar2.O();
            if (O4 == obj3) {
                O4 = y.B(Boolean.FALSE);
                rVar2.k0(O4);
            }
            final a1 a1Var13 = (a1) O4;
            Object O5 = rVar2.O();
            if (O5 == obj3) {
                O5 = y.B(Boolean.FALSE);
                rVar2.k0(O5);
            }
            a1 a1Var14 = (a1) O5;
            Boolean valueOf2 = Boolean.valueOf(l(a1Var14));
            Object O6 = rVar2.O();
            te.c cVar = null;
            if (O6 == obj3) {
                context = context4;
                O6 = new e7(a1Var14, cVar, 1);
                rVar2.k0(O6);
            } else {
                context = context4;
            }
            y.f((df.p) O6, valueOf2, rVar2);
            Object O7 = rVar2.O();
            if (O7 == obj3) {
                O7 = y.B(Boolean.FALSE);
                rVar2.k0(O7);
            }
            a1 a1Var15 = (a1) O7;
            Object O8 = rVar2.O();
            if (O8 == obj3) {
                O8 = y.B(Boolean.FALSE);
                rVar2.k0(O8);
            }
            a1 a1Var16 = (a1) O8;
            Object O9 = rVar2.O();
            if (O9 == obj3) {
                O9 = y.B(Boolean.FALSE);
                rVar2.k0(O9);
            }
            a1 a1Var17 = (a1) O9;
            Object O10 = rVar2.O();
            if (O10 == obj3) {
                O10 = y.B(Boolean.FALSE);
                rVar2.k0(O10);
            }
            a1 a1Var18 = (a1) O10;
            Object O11 = rVar2.O();
            if (O11 == obj3) {
                O11 = y.B(Boolean.FALSE);
                rVar2.k0(O11);
            }
            final a1 a1Var19 = (a1) O11;
            Object O12 = rVar2.O();
            if (O12 == obj3) {
                O12 = y.B(Boolean.FALSE);
                rVar2.k0(O12);
            }
            final a1 a1Var20 = (a1) O12;
            Object O13 = rVar2.O();
            if (O13 == obj3) {
                O13 = y.B(null);
                rVar2.k0(O13);
            }
            final a1 a1Var21 = (a1) O13;
            final n2 n2Var = (n2) rVar2.j(p1.f3613p);
            final i iVar2 = (i) rVar2.j(p1.i);
            Boolean valueOf3 = Boolean.valueOf(z3);
            if (i26 == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object O14 = rVar2.O();
            if (!z11 && O14 != obj3) {
                i12 = i26;
                bool = valueOf3;
                obj = obj4;
                a1Var = a1Var14;
                obj2 = obj3;
                j0Var = O14;
                view = view2;
                context2 = context;
                a1Var2 = a1Var17;
                a1Var3 = a1Var16;
                a1Var4 = a1Var15;
                i13 = 32;
            } else {
                i12 = i26;
                obj = obj4;
                a1Var = a1Var14;
                bool = valueOf3;
                obj2 = obj3;
                view = view2;
                context2 = context;
                a1Var2 = a1Var17;
                a1Var3 = a1Var16;
                a1Var4 = a1Var15;
                i13 = 32;
                j0Var = new j0(z3, a1Var12, a1Var4, a1Var2, a1Var18, a1Var19, a1Var3, null);
                rVar2.k0(j0Var);
            }
            y.f((df.p) j0Var, bool, rVar2);
            g.b bVar2 = new g.b(false);
            if ((i25 & 112) != i13 && ((i25 & 64) == 0 || !rVar2.h(m3Var))) {
                z12 = false;
            } else {
                z12 = true;
            }
            if ((i25 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean h10 = z12 | z13 | rVar2.h(context2);
            Object O15 = rVar2.O();
            Object obj5 = obj2;
            if (h10 || O15 == obj5) {
                O15 = new w(i, 1, context2, m3Var);
                rVar2.k0(O15);
            }
            i a10 = wa.a(bVar2, (df.l) O15, rVar2);
            Object O16 = rVar2.O();
            if (O16 == obj5) {
                O16 = y.B(qe.s.f24023u);
                rVar2.k0(O16);
            }
            a1 a1Var22 = (a1) O16;
            Object O17 = rVar2.O();
            if (O17 == obj5) {
                O17 = new y();
                rVar2.k0(O17);
            }
            final y yVar = (y) O17;
            Object obj6 = obj;
            boolean h11 = rVar2.h(obj6) | rVar2.h(context2);
            Object O18 = rVar2.O();
            if (h11 || O18 == obj5) {
                O18 = new androidx.ink.brush.i(5, obj6, context2, a1Var22);
                rVar2.k0(O18);
            }
            Object obj7 = (df.a) O18;
            g.b bVar3 = new g.b(3);
            boolean f13 = rVar2.f(obj7) | rVar2.h(a10) | rVar2.h(context2);
            Object O19 = rVar2.O();
            if (!f13 && O19 != obj5) {
                iVar = a10;
                context3 = context2;
            } else {
                Context context5 = context2;
                O19 = new androidx.ink.authoring.compose.c(obj7, (Object) a10, (Object) context5, a1Var2, 8);
                iVar = a10;
                context3 = context5;
                rVar2.k0(O19);
            }
            Object a11 = wa.a(bVar3, (df.l) O19, rVar2);
            boolean h12 = rVar2.h(context3) | rVar2.f(obj7) | rVar2.h(a11);
            Object O20 = rVar2.O();
            if (!h12 && O20 != obj5) {
                a1Var5 = a1Var22;
                a1Var8 = a1Var4;
                a1Var6 = a1Var2;
                a1Var7 = a1Var18;
            } else {
                a1Var5 = a1Var22;
                a1 a1Var23 = a1Var4;
                a1Var6 = a1Var2;
                a1Var7 = a1Var18;
                O20 = new f(context3, obj7, a11, a1Var6, a1Var7, a1Var19, a1Var12, a1Var23, a1Var3, a1Var20, a1Var5, 0);
                a1Var8 = a1Var23;
                rVar2.k0(O20);
            }
            final df.a aVar4 = (df.a) O20;
            Object O21 = rVar2.O();
            if (O21 == obj5) {
                O21 = y.B(null);
                rVar2.k0(O21);
            }
            a1 a1Var24 = (a1) O21;
            Boolean valueOf4 = Boolean.valueOf(z3);
            if (i12 == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean h13 = z14 | rVar2.h(context3);
            Object O22 = rVar2.O();
            if (!h13 && O22 != obj5) {
                kaVar = O22;
                a1Var9 = a1Var24;
                zVar = null;
            } else {
                kaVar = new ka(z3, context3, a1Var24, cVar, 1);
                a1Var9 = a1Var24;
                zVar = null;
                rVar2.k0(kaVar);
            }
            y.f((df.p) kaVar, valueOf4, rVar2);
            if (z3 && f10 < 0.1f) {
                z15 = true;
            } else {
                z15 = false;
            }
            final a1 a1Var25 = a1Var3;
            final a1 a1Var26 = a1Var8;
            final a1 a1Var27 = a1Var6;
            final a1 a1Var28 = a1Var7;
            final Context context6 = context3;
            h9.c(z15, null, androidx.compose.animation.d(zVar, 3), androidx.compose.animation.c.e(zVar, 3), null, h.d(-378831976, new df.q() { // from class: u7.g
                @Override // df.q
                public final Object b(Object obj8, Object obj9, Object obj10) {
                    a1 a1Var29;
                    a1 a1Var30;
                    Object m0Var;
                    m3 m3Var2;
                    ((Integer) obj10).getClass();
                    ((x) obj8).getClass();
                    FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
                    r rVar3 = (r) ((m) obj9);
                    n2 n2Var2 = n2.this;
                    boolean f14 = rVar3.f(n2Var2);
                    i iVar3 = iVar2;
                    boolean h14 = f14 | rVar3.h(iVar3);
                    m3 m3Var3 = m3Var;
                    boolean h15 = h14 | rVar3.h(m3Var3);
                    float f15 = f12;
                    boolean c10 = h15 | rVar3.c(f15);
                    long j11 = j10;
                    boolean e8 = c10 | rVar3.e(j11);
                    df.a aVar5 = aVar2;
                    boolean f16 = e8 | rVar3.f(aVar5);
                    df.a aVar6 = aVar3;
                    boolean f17 = f16 | rVar3.f(aVar6);
                    df.a aVar7 = aVar;
                    boolean f18 = f17 | rVar3.f(aVar7);
                    Object O23 = rVar3.O();
                    a1 a1Var31 = a1Var27;
                    a1 a1Var32 = a1Var25;
                    v0 v0Var = l.f24285a;
                    if (!f18 && O23 != v0Var) {
                        m0Var = O23;
                        a1Var29 = a1Var31;
                        a1Var30 = a1Var32;
                    } else {
                        a1Var29 = a1Var31;
                        a1Var30 = a1Var32;
                        m0Var = new m0(n2Var2, iVar3, m3Var3, f15, j11, aVar5, aVar6, aVar7, a1Var29, a1Var28, a1Var19, a1Var12, a1Var26, a1Var30);
                        rVar3.k0(m0Var);
                    }
                    pe.z zVar2 = pe.z.f22715a;
                    r b10 = d0.b(fillElement, zVar2, (PointerInputEventHandler) m0Var);
                    Boolean valueOf5 = Boolean.valueOf(u0.c(a1Var30));
                    boolean h16 = rVar3.h(m3Var3);
                    int i27 = i;
                    boolean d2 = h16 | rVar3.d(i27);
                    Context context7 = context6;
                    boolean h17 = d2 | rVar3.h(context7);
                    Object O24 = rVar3.O();
                    if (h17 || O24 == v0Var) {
                        m3Var2 = m3Var3;
                        n0 n0Var = new n0(i27, 0, context7, a1Var30, m3Var2);
                        rVar3.k0(n0Var);
                        O24 = n0Var;
                    } else {
                        m3Var2 = m3Var3;
                    }
                    r b11 = d0.b(b10, valueOf5, (PointerInputEventHandler) O24);
                    Boolean valueOf6 = Boolean.valueOf(u0.e(a1Var29));
                    boolean h18 = rVar3.h(m3Var2) | rVar3.d(i27) | rVar3.h(context7);
                    Object O25 = rVar3.O();
                    if (h18 || O25 == v0Var) {
                        n0 n0Var2 = new n0(i27, 1, context7, a1Var29, m3Var2);
                        rVar3.k0(n0Var2);
                        O25 = n0Var2;
                    }
                    x.m.a(0, d0.b(b11, valueOf6, (PointerInputEventHandler) O25), rVar3);
                    return zVar2;
                }
            }, rVar2), rVar2, 200064, 18);
            if (z3 && f10 < 0.1f) {
                z16 = true;
            } else {
                z16 = false;
            }
            r0 r8 = e.r(0.75f, 600.0f, null, 4);
            Object O23 = rVar2.O();
            if (O23 == obj5) {
                O23 = new f0(13);
                rVar2.k0(O23);
            }
            p0 a12 = androidx.compose.animation.k((df.l) O23, r8).a(androidx.compose.animation.d(e.r(0.75f, 600.0f, null, 4), 2));
            r0 r10 = e.r(1.0f, 800.0f, null, 4);
            Object O24 = rVar2.O();
            if (O24 == obj5) {
                O24 = new f0(13);
                rVar2.k0(O24);
            }
            q0 a13 = androidx.compose.animation.m((df.l) O24, r10).a(androidx.compose.animation.c.e(e.r(1.0f, 800.0f, null, 4), 2));
            r a14 = bVar.a(o.f15687a, c.B);
            View view3 = view;
            boolean h14 = rVar2.h(view3);
            Object O25 = rVar2.O();
            if (!h14 && O25 != obj5) {
                a1Var10 = a1Var6;
                a1Var11 = a1Var7;
            } else {
                a1 a1Var29 = a1Var6;
                a1 a1Var30 = a1Var7;
                O25 = new h(view3, a1Var8, a1Var29, a1Var30, a1Var19, a1Var25, a1Var12);
                a1Var10 = a1Var29;
                a1Var11 = a1Var30;
                rVar2.k0(O25);
            }
            final a1 a1Var31 = a1Var8;
            final a1 a1Var32 = a1Var9;
            final a1 a1Var33 = a1Var5;
            final a1 a1Var34 = a1Var;
            final i iVar3 = iVar;
            rVar = rVar2;
            h9.c(z16, androidx.compose.ui.layout.a.d(a14, (df.l) O25), a12, a13, null, h.d(792558799, new df.q() { // from class: u7.i
                @Override // df.q
                public final Object b(Object obj8, Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    u0.k(m3.this, i, context6, n2Var, iVar2, f11, a1Var10, a1Var11, a1Var19, a1Var12, a1Var31, a1Var25, aVar, a1Var13, a1Var34, iVar3, a1Var33, yVar, a1Var20, z3, a1Var21, aVar4, aVar2, a1Var32, (x) obj8, (m) obj9);
                    return pe.z.f22715a;
                }
            }, rVar), rVar, 196608, 16);
        } else {
            rVar = rVar2;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: u7.h0
                @Override // df.p
                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    a(m3.this, i, z3, f10, f11, f12, j10, aVar, aVar2, aVar3, (m) obj8, y.L(i10 | 1));
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void b(a1 a1Var) {
        a1Var.setValue(Boolean.FALSE);
    }

    public static final boolean c(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final void d(a1 a1Var) {
        a1Var.setValue(Boolean.FALSE);
    }

    public static final boolean e(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final void f(a1 a1Var, boolean z3) {
        a1Var.setValue(Boolean.valueOf(z3));
    }

    public static final boolean g(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final void h(a1 a1Var) {
        a1Var.setValue(Boolean.FALSE);
    }

    public static final void i(a1 a1Var) {
        a1Var.setValue(Boolean.FALSE);
    }

    public static final void j(a1 a1Var) {
        a1Var.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0143, code lost:
    
        if (r15 == r10) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0cb2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0d04  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0d57  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0d8d  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0e93  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0f7f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0fa2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0fff  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x104d  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x1094  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x10b0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x1118  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x11e7  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x129c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x12b9  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x12dc  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x1340  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x13a8  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x14bc  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x1524  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x1636  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x16f1  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x1714  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x1771  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x17ac  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x18b1  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x1963  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x1988  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x19c7  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x19f6  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x1b47  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x1b4b  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1a62  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x19cb  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x196f  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x18b5  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x17e8  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x1775  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x173d  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x16fd  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x163a  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x1528  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x14c0  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x13ac  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x1344  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x1308  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x12c5  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x12a1  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x11eb  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x111c  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x10d4  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x109f  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x1051  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x1003  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0fca  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0f8b  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0e97  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x0d5b  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0cb6  */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v193 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final m3 r112, final int r113, final android.content.Context r114, n2 r115, i r116, float r117, final a1 r118, final a1 r119, final a1 r120, final a1 r121, final a1 r122, final a1 r123, df.a r124, a1 r125, a1 r126, final i r127, final a1 r128, final y r129, final a1 r130, final boolean r131, final a1 r132, df.a r133, df.a r134, a1 r135, x r136, m r137) {
        /*
            Method dump skipped, instructions count: 7122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.u0.k(m3, int, android.content.Context, n2, i, float, a1, a1, a1, a1, a1, a1, df.a, a1, a1, i, a1, y, a1, boolean, a1, df.a, df.a, a1, x, m):void");
    }

    public static final boolean l(a1 a1Var) {
        return ((Boolean) a1Var.getValue()).booleanValue();
    }

    public static final void m(final String str, final f fVar, final int i, final df.a aVar, boolean z3, m mVar, final int i10, final int i11) {
        int i12;
        int i13;
        int i14;
        boolean z9;
        int i15;
        int i16;
        boolean z10;
        final boolean z11;
        final boolean z12;
        int i17;
        r rVar = (r) mVar;
        rVar.c0(1577237294);
        if (rVar.f(str)) {
            i12 = 4;
        } else {
            i12 = 2;
        }
        int i18 = i10 | i12;
        if ((i10 & 48) == 0) {
            if (rVar.h(fVar)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i18 |= i17;
        }
        if (rVar.d(i)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i19 = i18 | i13;
        if (rVar.h(aVar)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i20 = i19 | i14;
        int i21 = i11 & 16;
        if (i21 != 0) {
            i16 = i20 | 24576;
            z9 = z3;
        } else {
            z9 = z3;
            if (rVar.g(z9)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i16 = i20 | i15;
        }
        if ((i16 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.R(i16 & 1, z10)) {
            if (i21 != 0) {
                z12 = false;
            } else {
                z12 = z9;
            }
            float f10 = f26906d;
            float f11 = e;
            o oVar = o.f15687a;
            r n10 = androidx.compose.foundation.layout.a.n(oVar, f11, f26905c, f11, f10);
            p0 d2 = x.m.d(c.f15670u, false);
            int hashCode = Long.hashCode(rVar.T);
            g l10 = rVar.l();
            r c10 = a.c(n10, rVar);
            h.f1471d.getClass();
            b0 b0Var = g.f1462b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(b0Var);
            } else {
                rVar.n0();
            }
            y.I(g.e, d2, rVar);
            y.I(g.f1464d, l10, rVar);
            f fVar2 = g.f1465f;
            if (rVar.S || !kotlin.jvm.internal.a(rVar.O(), Integer.valueOf(hashCode))) {
                a.t(hashCode, rVar, hashCode, fVar2);
            }
            y.I(g.f1463c, c10, rVar);
            int i22 = i16 >> 3;
            m0.b(fVar, i, androidx.compose.foundation.layout.f(androidx.compose.foundation.layout.d.n(oVar, f26904b), f26903a), 0.0f, 0L, str, false, aVar, h.d(-1930469487, new df.q() { // from class: u7.v
                @Override // df.q
                public final Object b(Object obj, Object obj2, Object obj3) {
                    boolean z13;
                    int i23;
                    x.p pVar = (x.p) obj;
                    m mVar2 = (m) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    pVar.getClass();
                    if ((intValue & 6) == 0) {
                        if (((r) mVar2).f(pVar)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        intValue |= i23;
                    }
                    if ((intValue & 19) != 18) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    r rVar2 = (r) mVar2;
                    if (rVar2.R(intValue & 1, z13)) {
                        if (z12) {
                            rVar2.a0(-1004180774);
                            h0.a(0, androidx.compose.foundation.layout.a.k(pVar.a(o.f15687a, c.f15672w), 4), rVar2);
                        } else {
                            rVar2.a0(-1124877135);
                        }
                        rVar2.p(false);
                    } else {
                        rVar2.U();
                    }
                    return pe.z.f22715a;
                }
            }, rVar), rVar, (i22 & 112) | (i22 & 14) | 100663680 | ((i16 << 15) & 458752) | ((i16 << 12) & 29360128), 88);
            rVar.p(true);
            z11 = z12;
        } else {
            rVar.U();
            z11 = z9;
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: u7.b0
                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u0.m(str, fVar, i, aVar, z11, (m) obj, y.L(i10 | 1), i11);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final r n(r rVar, float f10) {
        rVar.getClass();
        return androidx.compose.ui.draw.a.c(rVar, new n4(1, f10));
    }

    public static final r o(r rVar, float f10) {
        rVar.getClass();
        return n(androidx.compose.foundation.a(wa.a(wa.a(rVar, 6, f0.e.a(f10), 0L, 0L, 28), f0.e.a(f10)), eb.w.k(qe.m.h(new r(l0.d(4281019957L)), new r(l0.d(4279506458L))), 0.0f, 0.0f, 14), 6), f10);
    }

    public static final String p(String str, r rVar) {
        if (mf.m.j(str, "strap")) {
            rVar.a0(-30058776);
            String c10 = wa.n7.c(R.string.cover_slot_strap, new Object[]{mf.f.z(str, "strap")}, rVar);
            rVar.p(false);
            return c10;
        }
        if (str.equals("center")) {
            return a.p(rVar, -30055795, R.string.cover_slot_center, rVar, false);
        }
        if (str.equals("top")) {
            return a.p(rVar, -30053750, R.string.cover_slot_top, rVar, false);
        }
        if (str.equals("bottom")) {
            return a.p(rVar, -30051699, R.string.cover_slot_bottom, rVar, false);
        }
        if (str.equals("left")) {
            return a.p(rVar, -30049621, R.string.cover_slot_left, rVar, false);
        }
        if (str.equals("right")) {
            return a.p(rVar, -30047572, R.string.cover_slot_right, rVar, false);
        }
        if (str.equals("top_left")) {
            return a.p(rVar, -30045393, R.string.cover_slot_top_left, rVar, false);
        }
        if (str.equals("top_right")) {
            return a.p(rVar, -30043088, R.string.cover_slot_top_right, rVar, false);
        }
        if (str.equals("bottom_left")) {
            return a.p(rVar, -30040686, R.string.cover_slot_bottom_left, rVar, false);
        }
        if (str.equals("bottom_right")) {
            return a.p(rVar, -30038189, R.string.cover_slot_bottom_right, rVar, false);
        }
        rVar.a0(-30036281);
        rVar.p(false);
        return str;
    }
}
