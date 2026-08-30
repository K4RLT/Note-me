package k0;
import a1.a;
import b0.b1;
import b0.x;
import c0.d0;
import g0.n1;
import h1.c;
import h1.d;
import j.f;
import j.i0;
import j1.b;
import j1.e;
import k1.e0;
import k1.h;
import k1.l0;
import k1.m;
import k1.n;
import k1.p0;
import k1.q0;
import o0.r0;
import p.c0;
import p0.j;
import q.c1;
import q.f0;
import q.f1;
import q.g1;
import s.i;
import s.k;
import t.z0;
import x.j0;
import x.w0;
import x.z;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.gl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import o0.t1;
import t.m2;
import t.x1;
import t.z1;
import w7.f3;
import w7.r5;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19443u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f19444v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f19445w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, int i, Object obj2) {
        super(1);
        this.f19443u = i;
        this.f19444v = obj;
        this.f19445w = obj2;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float f10;
        long a10;
        v1.x xVar;
        pe.z zVar;
        Throwable th;
        int i = this.f19443u;
        float f11 = 0.0f;
        te.c cVar = null;
        int i10 = 0;
        int i11 = 1;
        pe.z zVar2 = pe.z.f22715a;
        Object obj2 = this.f19445w;
        Object obj3 = this.f19444v;
        switch (i) {
            case 0:
                pf.x((pf.z) obj3, null, new b5.a((c2.k1) obj2, (m2.g) obj, cVar, 29), 1);
                return zVar2;
            case 1:
                r rVar = (r) obj;
                ((t0) obj3).m(rVar);
                ((df.l) obj2).invoke(rVar);
                return zVar2;
            case 2:
                f fVar = (f) obj;
                k kVar = (k) obj3;
                n1 n1Var = n1.f17223w;
                t0 t0Var = (t0) obj2;
                int i12 = 8;
                if (t0Var.h()) {
                    f.b(fVar, new d0(i12, n1Var), new w0(kVar, t0Var, i10));
                }
                n1 n1Var2 = n1.f17225y;
                if (!t0Var.f()) {
                    f.b(fVar, new d0(i12, n1Var2), new w0(kVar, t0Var, i11));
                }
                qe.h(zVar2, zVar2);
                return zVar2;
            case 3:
                z1.z0.n((z1.z0) obj, (z1.a1) obj3, 0, 0, ((m) obj2).I, 4);
                return zVar2;
            case 4:
                z1.z0.n((z1.z0) obj, (z1.a1) obj3, 0, 0, ((q0) obj2).U, 4);
                return zVar2;
            case 5:
                b2.l0 l0Var = (b2.l0) obj;
                long j10 = ((e) ((j) obj3).get()).f18774a;
                float d2 = e.d(j10);
                if (d2 > 0.0f) {
                    float l0 = l0Var.l0(r0.f21644a);
                    b bVar = l0Var.f1533u;
                    float l02 = l0Var.l0(((j0) obj2).b(l0Var.getLayoutDirection())) - l0;
                    float f12 = 2;
                    float f13 = (l0 * f12) + d2 + l02;
                    y2.m layoutDirection = l0Var.getLayoutDirection();
                    int[] iArr = q0.f21635a;
                    if (iArr[layoutDirection.ordinal()] == 1) {
                        f10 = e.d(bVar.e()) - f13;
                    } else if (l02 < 0.0f) {
                        f10 = 0.0f;
                    } else {
                        f10 = l02;
                    }
                    float f14 = f10;
                    if (iArr[l0Var.getLayoutDirection().ordinal()] == 1) {
                        float d10 = e.d(bVar.e());
                        if (l02 >= 0.0f) {
                            f11 = l02;
                        }
                        f13 = d10 - f11;
                    }
                    float f15 = f13;
                    float b10 = e.b(j10);
                    float f16 = (-b10) / f12;
                    float f17 = b10 / f12;
                    i0 i0Var = bVar.f20424v;
                    long r8 = i0Var.r();
                    i0Var.j().l();
                    try {
                        ((ic.c) i0Var.f18636v).e(f14, f16, f15, f17, 0);
                        l0Var.b();
                    } finally {
                        a.v(i0Var, r8);
                    }
                } else {
                    l0Var.b();
                }
                return zVar2;
            case 6:
                ((z1.z0) obj).h((z1.a1) obj3, 0, 0, ((d0) obj2).f22124c.h());
                return zVar2;
            case 7:
                l0.p((d) obj, (l0) obj3, ((t1) obj2).a());
                return zVar2;
            case 8:
                d dVar = (d) obj;
                return dVar.b(new c(i10, new w(((p0) obj3).a(dVar.f17824u.e(), dVar.f17824u.getLayoutDirection(), dVar), 7, (t1) obj2)));
            case 9:
                f0 f0Var = (f0) obj3;
                e0 e0Var = (e0) obj2;
                f0Var.f22890a.b(e0Var);
                f0Var.f22891b.setValue(Boolean.TRUE);
                return new b1(f0Var, 9, e0Var);
            case 10:
                pf.x((pf.z) obj3, null, new n((g1) obj2, null), 1);
                return new b8.g0(6);
            case 11:
                g1 g1Var = (g1) obj3;
                g1 g1Var2 = (g1) obj2;
                g1Var.f22909j.add(g1Var2);
                return new b1(g1Var, 10, g1Var2);
            case 12:
                return new b1((g1) obj3, 11, (c1) obj2);
            case 13:
                g1 g1Var3 = (g1) obj3;
                f1 f1Var = (f1) obj2;
                g1Var3.i.add(f1Var);
                return new b1(g1Var3, 12, f1Var);
            case 14:
                b2.l0 l0Var2 = (b2.l0) obj;
                l0Var2.b();
                d.g0(l0Var2, ((e0) obj3).e, (n) obj2, 0.0f, null, 60);
                return zVar2;
            case 15:
                b2.l0 l0Var3 = (b2.l0) obj;
                l0Var3.b();
                d.g0(l0Var3, (h) obj3, (n) obj2, 0.0f, null, 60);
                return zVar2;
            case 16:
                ((i) obj3).b((h) obj2);
                return zVar2;
            case 17:
                long j11 = ((b) obj).f18762a;
                ((df.a) obj3).invoke();
                ((k) obj2).f24849a.setValue(new i(j11));
                return zVar2;
            case 18:
                ((e) ((k6.i) obj3).f19569v).m((h) obj2);
                return zVar2;
            case 19:
                x1 x1Var = (x1) obj3;
                long j12 = ((n) obj).f25478a;
                if (((z1) obj2).f25603d == z0.f25598v) {
                    a10 = b.a(j12, 1, 0.0f);
                } else {
                    a10 = b.a(j12, 2, 0.0f);
                }
                x1Var.a(1, a10);
                return zVar2;
            case 20:
                ((Number) obj).longValue();
                m2 m2Var = (m2) obj3;
                float f18 = m2Var.e;
                m2Var.e = 0.0f;
                ((df.l) obj2).invoke(Float.valueOf(f18));
                return zVar2;
            case gl.zzm /* 21 */:
                MotionEvent motionEvent = (MotionEvent) obj;
                v1.z zVar3 = (v1.z) obj2;
                if (motionEvent.getActionMasked() == 0) {
                    j6.n nVar = (j6.n) obj3;
                    df.l lVar = zVar3.f27372a;
                    if (lVar != null) {
                        if (((Boolean) lVar.invoke(motionEvent)).booleanValue()) {
                            xVar = v1.x.f27367v;
                        } else {
                            xVar = v1.x.f27368w;
                        }
                        nVar.f18939w = xVar;
                    } else {
                        kotlin.jvm.internal.l.h("onTouchEvent");
                        throw null;
                    }
                } else {
                    df.l lVar2 = zVar3.f27372a;
                    if (lVar2 != null) {
                        lVar2.invoke(motionEvent);
                    } else {
                        kotlin.jvm.internal.l.h("onTouchEvent");
                        throw null;
                    }
                }
                return zVar2;
            case 22:
                int intValue = ((Number) obj).intValue();
                return ((uf.u) obj3).invoke(Integer.valueOf(intValue), ((List) obj2).get(intValue));
            case 23:
                int intValue2 = ((Number) obj).intValue();
                return ((r5) obj3).invoke(Integer.valueOf(intValue2), ((List) obj2).get(intValue2));
            case 24:
                int intValue3 = ((Number) obj).intValue();
                return ((uf.u) obj3).invoke(Integer.valueOf(intValue3), ((ArrayList) obj2).get(intValue3));
            case 25:
                int intValue4 = ((Number) obj).intValue();
                return ((a) obj3).invoke(Integer.valueOf(intValue4), ((ArrayList) obj2).get(intValue4));
            case 26:
                return ((f3) obj3).invoke(((List) obj2).get(((Number) obj).intValue()));
            case 27:
                int intValue5 = ((Number) obj).intValue();
                return ((r5) obj3).invoke(Integer.valueOf(intValue5), ((List) obj2).get(intValue5));
            case 28:
                w0 w0Var = (w0) obj3;
                View view = (View) obj2;
                z zVar4 = w0Var.f30029t;
                if (w0Var.f30028s == 0) {
                    boolean z3 = q3.p.f23420a;
                    q3.f(view, zVar4);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(zVar4);
                    q3.d(view, zVar4);
                }
                w0Var.f30028s++;
                return new b1(w0Var, 14, view);
            default:
                Throwable th2 = (Throwable) obj;
                ((c0) obj3).invoke(th2);
                rf.h hVar = (rf.h) ((j6.i) obj2).f18926w;
                hVar.k(th2, false);
                do {
                    Object a11 = rf.a(hVar.c());
                    if (a11 == null) {
                        zVar = null;
                    } else {
                        y3.l lVar3 = (y3.l) a11;
                        if (lVar3 instanceof y3.k) {
                            pf.q qVar = ((y3.k) lVar3).f30835b;
                            if (th2 == null) {
                                th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                            } else {
                                th = th2;
                            }
                            qVar.getClass();
                            qVar.W(new pf.t(th, false));
                        }
                        zVar = zVar2;
                    }
                } while (zVar != null);
                return zVar2;
        }
    }
}
