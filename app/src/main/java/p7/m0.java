package p7;
import b.a;
import d0.b;
import r0.l;
import r0.m;
import r0.r;
import r0.v0;
import r0.y;

import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.ink.brush.Brush;
import androidx.ink.brush.BrushFamily;
import androidx.ink.brush.StockBrushes;
import b8.e8;
import b8.m7;
import g0.y1;
import r0.a1;
import r0.q1;

/* loaded from: classes.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f22535a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final m2.f0 f22536b = new m2.f0(10);

    public static final void a(final e0 e0Var, final a aVar, final int i, final float f10, final w7.f0 f0Var, final int i10, df.a aVar2, final df.a aVar3, final df.s sVar, final w7.f0 f0Var2, final df.a aVar4, final df.l lVar, final boolean z3, final df.l lVar2, final df.p pVar, df.a aVar5, m mVar, final int i11) {
        final df.a aVar6;
        df.a aVar7;
        aVar.getClass();
        aVar2.getClass();
        r rVar = (r) mVar;
        rVar.c0(341887326);
        int i12 = i11 | (rVar.h(e0Var) ? 4 : 2) | (rVar.d(aVar.ordinal()) ? 32 : 16) | (rVar.d(i) ? 256 : 128) | (rVar.c(f10) ? 2048 : 1024) | (rVar.h(f0Var) ? 16384 : 8192) | (rVar.d(i10) ? 131072 : 65536) | (rVar.h(aVar3) ? 8388608 : 4194304) | (rVar.h(sVar) ? 67108864 : 33554432) | (rVar.h(f0Var2) ? 536870912 : 268435456);
        int i13 = (rVar.h(aVar4) ? (char) 4 : (char) 2) | 432 | (rVar.h(lVar) ? (char) 2048 : (char) 1024) | (rVar.g(z3) ? (char) 16384 : (char) 8192) | (rVar.h(lVar2) ? (char) 0 : (char) 0) | (rVar.h(pVar) ? 1048576 : 524288) | (rVar.h(aVar5) ? (char) 0 : (char) 0);
        if (rVar.R(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 4793491) == 4793490) ? false : true)) {
            e0Var.f22451a = aVar;
            e0Var.f22452b = i;
            e0Var.f22454d = f10;
            e0Var.e = f0Var;
            e0Var.f22453c = i10;
            aVar6 = aVar2;
            e0Var.f22455f = aVar6;
            aVar3.getClass();
            e0Var.f22456g = aVar3;
            e0Var.f22457h = sVar;
            e0Var.i = f0Var2;
            aVar4.getClass();
            e0Var.f22458j = aVar4;
            e0Var.f22459k = lVar;
            e0Var.f22460l = z3;
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = new m7(2, null, 3);
                rVar.k0(O);
            }
            pe.z zVar = pe.z.f22715a;
            y.f((df.p) O, zVar, rVar);
            FillElement fillElement = androidx.compose.foundation.layout.d.f506c;
            boolean h3 = rVar.h(e0Var);
            Object O2 = rVar.O();
            if (h3 || O2 == v0Var) {
                O2 = new g0(e0Var, 1);
                rVar.k0(O2);
            }
            d1.r e = androidx.compose.ui.layout.a.e(fillElement, (df.l) O2);
            boolean h10 = ((i13 & 458752) == 131072) | ((i13 & 3670016) == 1048576) | ((i13 & 29360128) == 8388608) | rVar.h(e0Var);
            Object O3 = rVar.O();
            if (h10 || O3 == v0Var) {
                aVar7 = aVar5;
                O3 = new y1(lVar2, pVar, aVar7, e0Var);
                rVar.k0(O3);
            } else {
                aVar7 = aVar5;
            }
            x.a(0, v1.b(e, zVar, (PointerInputEventHandler) O3), rVar);
        } else {
            aVar6 = aVar2;
            aVar7 = aVar5;
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            final df.a aVar8 = aVar7;
            t3.f24332d = new df.p(aVar, i, f10, f0Var, i10, aVar6, aVar3, sVar, f0Var2, aVar4, lVar, z3, lVar2, pVar, aVar8, i11) { // from class: p7.i0
                public final /* synthetic */ df.a A;
                public final /* synthetic */ df.a B;
                public final /* synthetic */ df.s C;
                public final /* synthetic */ w7.f0 D;
                public final /* synthetic */ df.a E;
                public final /* synthetic */ df.l F;
                public final /* synthetic */ boolean G;
                public final /* synthetic */ df.l H;
                public final /* synthetic */ df.p I;
                public final /* synthetic */ df.a J;

                /* renamed from: v, reason: collision with root package name */
                public final /* synthetic */ a f22497v;

                /* renamed from: w, reason: collision with root package name */
                public final /* synthetic */ int f22498w;

                /* renamed from: x, reason: collision with root package name */
                public final /* synthetic */ float f22499x;

                /* renamed from: y, reason: collision with root package name */
                public final /* synthetic */ w7.f0 f22500y;

                /* renamed from: z, reason: collision with root package name */
                public final /* synthetic */ int f22501z;

                @Override // df.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = y.L(1572865);
                    m0.a(e0.this, this.f22497v, this.f22498w, this.f22499x, this.f22500y, this.f22501z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (m) obj, L);
                    return pe.z.f22715a;
                }
            };
        }
    }

    public static final void b(e0 e0Var, m mVar, int i) {
        int i10;
        boolean z3;
        e0Var.getClass();
        r rVar = (r) mVar;
        rVar.c0(192458224);
        if (rVar.h(e0Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            x.a(androidx.compose.foundation.layout.d.f506c, null, z0.h.d(-55911738, new e8(1, e0Var), rVar), rVar, 3078);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new a1.a(e0Var, i, 8);
        }
    }

    public static final void c(e0 e0Var, boolean z3, m mVar, int i) {
        int i10;
        int i11;
        boolean z9;
        q1 t3;
        h0 h0Var;
        r rVar = (r) mVar;
        rVar.c0(-1146851436);
        if (rVar.h(e0Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i;
        if (rVar.g(z3)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        boolean z10 = true;
        if ((i13 & 19) != 18) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (rVar.R(i13 & 1, z9)) {
            if (e0Var == null) {
                t3 = rVar.t();
                if (t3 != null) {
                    h0Var = new h0(e0Var, z3, i, 0);
                    t3.f24332d = h0Var;
                }
                return;
            }
            Object O = rVar.O();
            v0 v0Var = l.f24285a;
            if (O == v0Var) {
                O = y.B(Boolean.valueOf(z3));
                rVar.k0(O);
            }
            a1 a1Var = (a1) O;
            Boolean valueOf = Boolean.valueOf(z3);
            if ((i13 & 112) != 32) {
                z10 = false;
            }
            boolean h3 = rVar.h(e0Var) | z10;
            Object O2 = rVar.O();
            if (h3 || O2 == v0Var) {
                O2 = new k0(z3, e0Var, a1Var, null);
                rVar.k0(O2);
            }
            y.f((df.p) O2, valueOf, rVar);
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) rVar.j(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean h10 = rVar.h(e0Var) | rVar.h(wVar);
            Object O3 = rVar.O();
            if (h10 || O3 == v0Var) {
                O3 = new androidx.ink.authoring.compose.d(wVar, 13, e0Var);
                rVar.k0(O3);
            }
            y.d(wVar, e0Var, (df.l) O3, rVar);
            if (((Boolean) a1Var.getValue()).booleanValue()) {
                rVar.a0(1682399851);
                b(e0Var, rVar, i13 & 14);
            } else {
                rVar.a0(560886798);
            }
            rVar.p(false);
        } else {
            rVar.U();
        }
        t3 = rVar.t();
        if (t3 != null) {
            h0Var = new h0(e0Var, z3, i, 1);
            t3.f24332d = h0Var;
        }
    }

    public static final float d() {
        return Math.round(2048 / 1.3333334f);
    }

    public static final Brush e(a aVar, int i, float f10) {
        BrushFamily highlighter$default;
        aVar.getClass();
        boolean z3 = v.f22585a;
        boolean z9 = v.f22585a;
        int i10 = l0.f22530a[aVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5) {
                            highlighter$default = StockBrushes.pressurePen$default(null, 1, null);
                        } else {
                            l4.a.o();
                            return null;
                        }
                    } else if (z9) {
                        highlighter$default = a(b(), "scraply-pencil-accum-v1");
                    } else {
                        highlighter$default = b();
                    }
                } else {
                    highlighter$default = StockBrushes.marker$default(null, 1, null);
                }
            } else {
                highlighter$default = StockBrushes.marker$default(null, 1, null);
            }
        } else if (z9) {
            highlighter$default = a(StockBrushes.highlighter$default(null, null, 3, null), "scraply-hl-accum-v1");
        } else {
            highlighter$default = StockBrushes.highlighter$default(null, null, 3, null);
        }
        Brush.Companion companion = Brush.Companion;
        if (f10 < 0.5f) {
            f10 = 0.5f;
        }
        return companion.createWithColorIntArgb(highlighter$default, i, f10, 0.1f);
    }

    public static final e0 f(m mVar) {
        r rVar = (r) mVar;
        Context context = (Context) rVar.j(AndroidCompositionLocals_androidKt.f642b);
        Object O = rVar.O();
        if (O == l.f24285a) {
            if (a()) {
                O = new e0(context);
            } else {
                O = null;
            }
            rVar.k0(O);
        }
        return (e0) O;
    }
}
