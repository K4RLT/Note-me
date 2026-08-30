package wa;
import a1.i;
import c2.p1;
import d.a;
import d.d;
import d1.r;
import f0.e;
import h8.b;
import h8.c;
import h8.f;
import h8.n;
import h8.q;
import j7.a;
import k1.f;
import k1.p;
import k1.r;
import m1.d;
import r0.l;
import r0.m;
import r0.q1;
import r0.r;
import r0.y;
import ta.a;
import v1.c0;
import v7.a;
import w7.a;
import y2.c;

import a0.f0;
import android.graphics.LinearGradient;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b8.b7;
import java.util.List;
import k1.l0;
import kotlin.jvm.internal.y;
import pe.z;
import r0.a1;
import wa.b9;
import wa.r8;
import wa.v7;
import wa.w7;

/* loaded from: classes.dex */
public abstract class w7 {
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, kotlin.jvm.internal.y] */
    public static final void a(final r rVar, final f fVar, final float f10, final float f11, final long j10, final float f12, final long j11, final float f13, final f0 f0Var, df.p pVar, final b7 b7Var, final b7 b7Var2, m mVar, final int i, final int i10) {
        float f14;
        b7 b7Var3;
        df.p iVar;
        r d2;
        r d10;
        b bVar = b.f17917u;
        fVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.c0(-505733824);
        if ((i & 14) == 0) {
            rVar2.f(rVar);
        }
        if ((i & 112) == 0) {
            rVar2.f(fVar);
        }
        if ((i & 896) == 0) {
            rVar2.c(f10);
        }
        if ((i & 7168) == 0) {
            rVar2.c(f11);
        }
        if ((i & 57344) == 0) {
            rVar2.e(j10);
        }
        if ((3670016 & i) == 0) {
            rVar2.c(f12);
        }
        if ((29360128 & i) == 0) {
            rVar2.e(j11);
        }
        if ((234881024 & i) == 0) {
            f14 = f13;
            rVar2.c(f14);
        } else {
            f14 = f13;
        }
        if ((i10 & 14) == 0) {
            rVar2.f(null);
        }
        if ((i10 & 896) == 0) {
            b7Var3 = b7Var;
            rVar2.h(b7Var3);
        } else {
            b7Var3 = b7Var;
        }
        if ((i10 & 7168) == 0) {
            rVar2.h(bVar);
        }
        if ((i10 & 57344) == 0) {
            rVar2.h(c.f17918u);
        }
        if ((458752 & i10) == 0) {
            rVar2.h(b7Var2);
        }
        rVar2.W();
        if ((i & 1) != 0 && !rVar2.A()) {
            rVar2.U();
            iVar = pVar;
        } else {
            iVar = new i(19);
        }
        rVar2.q();
        c cVar = (c) rVar2.j(p1.f3606h);
        final Object obj = new Object();
        f0 i11 = l0.i();
        i11.P(1);
        i11.O(cVar.l0(f11));
        i11.H(j10);
        final f0 i12 = l0.i();
        i12.H(((r) fVar.f17928g.getValue()).f19523a);
        final float l0 = cVar.l0(f12);
        rVar2.b0(-388990188);
        Object O = rVar2.O();
        if (O == l.f24285a) {
            O = y.B(Boolean.FALSE);
            rVar2.k0(O);
        }
        final a1 a1Var = (a1) O;
        rVar2.p(false);
        d2 = androidx.compose.ui.layout.a.e(a(androidx.compose.foundation.layout.d(rVar, 1.0f), e.a(f10)), new n((kotlin.jvm.internal.y) obj, iVar, f10, i11)).d(new SuspendPointerInputElement(pe.z.f22715a, null, null, new c0(new q(obj, fVar, null, 0)), 6));
        d10 = d2.d(new SuspendPointerInputElement(pe.z.f22715a, null, null, new c0(new q(obj, fVar, null, 1)), 6));
        final df.p pVar2 = iVar;
        final float f15 = f14;
        final b7 b7Var4 = b7Var3;
        ya.a(d10, new df.l(obj, fVar, i12, b7Var2, f10, b7Var4, l0, j11, f15, f0Var, a1Var) { // from class: h8.o
            public final /* synthetic */ float A;
            public final /* synthetic */ f0 B;
            public final /* synthetic */ a1 C;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ y f17972u;

            /* renamed from: v, reason: collision with root package name */
            public final /* synthetic */ f f17973v;

            /* renamed from: w, reason: collision with root package name */
            public final /* synthetic */ f0 f17974w;

            /* renamed from: x, reason: collision with root package name */
            public final /* synthetic */ b7 f17975x;

            /* renamed from: y, reason: collision with root package name */
            public final /* synthetic */ float f17976y;

            /* renamed from: z, reason: collision with root package name */
            public final /* synthetic */ b7 f17977z;

            {
                b bVar2 = b.f17917u;
                this.B = f0Var;
                this.C = a1Var;
            }

            @Override // df.l
            public final Object invoke(Object obj2) {
                b bVar2 = b.f17917u;
                d dVar = (d) obj2;
                f fVar2 = this.f17973v;
                fVar2.getClass();
                this.C.getClass();
                dVar.getClass();
                p j12 = dVar.p0().j();
                f fVar3 = (f) this.f17972u.f19787u;
                if (fVar3 != null) {
                    int a10 = (int) (a(fVar3) >> 32);
                    f0 f0Var2 = d.f17919a;
                    j12.getClass();
                    j12.a(fVar3, 0L, d.f17919a);
                    float f16 = ((int) (r2 & 4294967295L)) * 0.5f;
                    float f17 = a10;
                    LinearGradient h3 = l0.h(r8.a(0.0f, f16), r8.a(f17, f16), (List) this.f17975x.invoke(fVar2), null);
                    f0 f0Var3 = this.f17974w;
                    f0Var3.L(h3);
                    a(j12, a(fVar3), this.f17976y, f0Var3);
                    j12.u(this.A, r8.a(b9.d(((Number) this.f17977z.invoke(fVar2)).floatValue(), 0.0f, 1.0f) * f17, f16), this.B);
                }
                return z.f22715a;
            }
        }, rVar2, 0);
        q1 t3 = rVar2.t();
        if (t3 != null) {
            t3.f24332d = new df.p() { // from class: h8.p
                {
                    b bVar2 = b.f17917u;
                }

                @Override // df.p
                public final Object invoke(Object obj2, Object obj3) {
                    b bVar2 = b.f17917u;
                    ((Integer) obj3).getClass();
                    f fVar2 = fVar;
                    fVar2.getClass();
                    int L = y.L(i | 1);
                    int L2 = y.L(i10);
                    a(rVar, fVar2, f10, f11, j10, f12, j11, f13, f0Var, pVar2, b7Var, b7Var2, (m) obj2, L, L2);
                    return z.f22715a;
                }
            };
        }
    }

    public static final void b(kotlin.jvm.internal.y yVar, f fVar, float f10) {
        float f11;
        b bVar = b.f17917u;
        if (((f) yVar.f19787u) != null) {
            f11 = f10 / r2.f19477a.getWidth();
        } else {
            f11 = 0.0f;
        }
        bVar.b(fVar, Float.valueOf(b9.d(f11, 0.0f, 1.0f)), Boolean.TRUE);
    }
}