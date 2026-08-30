package u7;
import b8.c0;
import j1.b;
import k6.r;
import n0.n;
import o7.b;
import q.d;
import r0.a1;
import r0.f1;
import t.b0;
import t.f0;
import t.q1;
import t.t1;
import v1.k;
import v1.m;
import v1.t;
import v1.w;
import y2.q;

import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.gms.internal.ads.n00;
import java.util.List;
import wa.b9;
import ya.be;

/* loaded from: classes.dex */
public final class s5 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f26840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f26841b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f26842c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f26843d;
    public final /* synthetic */ a1 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f26844f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f26845g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pf.z f26846h;
    public final /* synthetic */ o1 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f26847j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b f26848k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a1 f26849l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f26850m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a1 f26851n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ f1 f26852o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ List f26853p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ d f26854q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f26855r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f1 f26856s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l2 f26857t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f1 f26858u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ d f26859v;

    public s5(Context context, float f10, float f11, float f12, a1 a1Var, boolean z3, d dVar, pf.z zVar, o1 o1Var, d dVar2, b bVar, a1 a1Var2, d dVar3, a1 a1Var3, f1 f1Var, List list, d dVar4, d dVar5, f1 f1Var2, l2 l2Var, f1 f1Var3, d dVar6) {
        this.f26840a = context;
        this.f26841b = f10;
        this.f26842c = f11;
        this.f26843d = f12;
        this.e = a1Var;
        this.f26844f = z3;
        this.f26845g = dVar;
        this.f26846h = zVar;
        this.i = o1Var;
        this.f26847j = dVar2;
        this.f26848k = bVar;
        this.f26849l = a1Var2;
        this.f26850m = dVar3;
        this.f26851n = a1Var3;
        this.f26852o = f1Var;
        this.f26853p = list;
        this.f26854q = dVar4;
        this.f26855r = dVar5;
        this.f26856s = f1Var2;
        this.f26857t = l2Var;
        this.f26858u = f1Var3;
        this.f26859v = dVar6;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        float f10;
        float k3;
        final n00 n00Var = new n00(2);
        Context context = this.f26840a;
        int i = context.getResources().getConfiguration().smallestScreenWidthDp;
        float[] fArr = v1.f26942a;
        if (i >= 720) {
            f10 = 1.8f;
        } else if (i >= 600) {
            f10 = 1.4f;
        } else {
            f10 = 1.0f;
        }
        final float f11 = f10 * 2.0f;
        boolean booleanValue = ((Boolean) this.e.getValue()).booleanValue();
        float f12 = this.f26841b;
        if (booleanValue) {
            k3 = m(f12);
        } else {
            k3 = k(f12);
        }
        float f13 = (this.f26842c * 1.0f) / (k3 * f12);
        if (f13 < 1.0f) {
            f13 = 1.0f;
        }
        final float f14 = (0.68f * f11) / f13;
        int i10 = context.getResources().getConfiguration().smallestScreenWidthDp;
        if (i10 < 360) {
            i10 = 360;
        }
        float pow = (float) Math.pow(i10 / 360.0f, 0.75f);
        if (pow > 2.4f) {
            pow = 2.4f;
        }
        float f15 = pow * 1.0f;
        float f16 = this.f26843d;
        final float f17 = this.f26842c;
        final float f18 = (f16 / f17) * f15;
        final float f19 = (2.0f / (0.78f * f17)) * f15;
        final boolean z3 = this.f26844f;
        final d dVar = this.f26845g;
        final pf.z zVar = this.f26846h;
        final o1 o1Var = this.i;
        final d dVar2 = this.f26847j;
        final b bVar = this.f26848k;
        final a1 a1Var = this.f26849l;
        final d dVar3 = this.f26850m;
        final a1 a1Var2 = this.f26851n;
        final f1 f1Var = this.f26852o;
        df.l lVar = new df.l() { // from class: u7.n5
            @Override // df.l
            public final Object invoke(Object obj) {
                b bVar2 = (b) obj;
                if (!z3) {
                    float f20 = k6.f26414a;
                    boolean booleanValue2 = ((Boolean) a1Var.getValue()).booleanValue();
                    d dVar4 = dVar;
                    if (!booleanValue2 || ((Number) dVar4.e()).floatValue() <= 0.5f) {
                        d dVar5 = dVar2;
                        c0 c0Var = new c0(17, dVar5, null);
                        pf.z zVar2 = zVar;
                        pf.b0.x(zVar2, null, c0Var, 3);
                        if (((Number) dVar4.e()).floatValue() > 0.5f && ((Number) o1Var.f26660p.e()).floatValue() < 0.5f) {
                            pf.b0.x(zVar2, null, new c0(18, dVar3, null), 3);
                        }
                        r(a1Var2, true);
                        f1Var.i(b9.e(ff.a.b(((Number) dVar5.e()).floatValue()), 0, bVar.f21850c - 1));
                        n00 n00Var2 = n00Var;
                        n00Var2.c();
                        n00Var2.a(0L, bVar2.f18762a);
                    }
                }
                return pe.z.f22715a;
            }
        };
        final List list = this.f26853p;
        final float f20 = this.f26841b;
        final d dVar4 = this.f26854q;
        final d dVar5 = this.f26855r;
        final f1 f1Var2 = this.f26856s;
        final l2 l2Var = this.f26857t;
        final f1 f1Var3 = this.f26858u;
        df.a aVar = new df.a() { // from class: u7.o5
            @Override // df.a
            public final Object invoke() {
                float f21 = k6.f26414a;
                boolean booleanValue2 = ((Boolean) a1Var.getValue()).booleanValue();
                d dVar6 = d.this;
                if (!booleanValue2 || ((Number) dVar6.e()).floatValue() <= 0.5f) {
                    float b10 = q.b(n00Var.b(be.a(Float.MAX_VALUE, Float.MAX_VALUE)));
                    float f22 = f17;
                    float f23 = 12.0f * f22;
                    r(a1Var2, false);
                    List list2 = list;
                    o1 o1Var2 = o1Var;
                    float f24 = f20;
                    float f25 = f19;
                    float f26 = f18;
                    d dVar7 = dVar4;
                    d dVar8 = dVar3;
                    d dVar9 = dVar2;
                    b bVar2 = bVar;
                    d dVar10 = dVar5;
                    pf.z zVar2 = zVar;
                    pf.b0.x(zVar2, null, new q5(dVar6, list2, o1Var2, f24, b10, f25, f26, dVar7, dVar8, dVar9, bVar2, f22, b9.d(b10, -f23, f23), dVar10, zVar2, f22 * 8.0f, f14, f11, f1Var, f1Var2, l2Var, f1Var3, null), 3);
                }
                return pe.z.f22715a;
            }
        };
        c4 c4Var = new c4(dVar, o1Var, zVar, a1Var, a1Var2, dVar3, dVar2, bVar);
        final d dVar6 = this.f26859v;
        df.p pVar = new df.p() { // from class: u7.p5
            @Override // df.p
            public final Object invoke(Object obj, Object obj2) {
                t tVar = (t) obj;
                float floatValue = ((Float) obj2).floatValue();
                tVar.getClass();
                if (!z3) {
                    float f21 = k6.f26414a;
                    boolean booleanValue2 = ((Boolean) a1Var.getValue()).booleanValue();
                    d dVar7 = dVar;
                    if ((!booleanValue2 || ((Number) dVar7.e()).floatValue() <= 0.5f) && ((Number) dVar6.e()).floatValue() <= 0.5f) {
                        n00Var.a(tVar.f27342b, tVar.f27343c);
                        float floatValue2 = ((Number) dVar7.e()).floatValue();
                        pf.z zVar2 = zVar;
                        if (floatValue2 > 0.5f) {
                            o1 o1Var2 = o1Var;
                            if (((Number) o1Var2.f26660p.e()).floatValue() > 0.5f) {
                                if (f20 >= 1.0f) {
                                    pf.b0.x(zVar2, null, new r5(o1Var2, (-floatValue) * f19, o1Var2.i().f26212a.size() - 1, null, 0), 3);
                                }
                            } else {
                                pf.b0.x(zVar2, null, new n(dVar4, o1Var2, (-floatValue) * f18, (te.c) null), 3);
                            }
                        } else {
                            float f22 = (-floatValue) * f14;
                            int i11 = bVar.f21850c - 1;
                            if (i11 < 0) {
                                i11 = 0;
                            }
                            pf.b0.x(zVar2, null, new q1(dVar2, f22, i11, null, 1), 3);
                        }
                    }
                }
                return pe.z.f22715a;
            }
        };
        float f21 = f0.f25388a;
        Object e = t1.e(wVar, new b0(lVar, pVar, aVar, c4Var, null, 0), cVar);
        pe.z zVar2 = pe.z.f22715a;
        ue.a aVar2 = ue.a.f27192u;
        if (e != aVar2) {
            e = zVar2;
        }
        if (e == aVar2) {
            return e;
        }
        return zVar2;
    }
}
