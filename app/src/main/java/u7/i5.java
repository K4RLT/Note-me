package u7;
import h.a;
import b8.c0;
import i5.a;
import j1.b;
import q.d;
import r0.a1;
import r0.e1;
import r0.f1;
import t.f0;
import v1.t;
import v1.w;
import z7.h;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* loaded from: classes.dex */
public final class i5 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f26319a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o1 f26320b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f26321c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f26322d;
    public final /* synthetic */ float e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f26323f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f26324g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ a1 f26325h;
    public final /* synthetic */ a1 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e1 f26326j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e1 f26327k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f26328l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pf.z f26329m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a1 f26330n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e1 f26331o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e1 f26332p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f26333q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f26334r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f26335s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f1 f26336t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m3 f26337u;

    public i5(d dVar, o1 o1Var, d dVar2, List list, float f10, float f11, d dVar3, a1 a1Var, a1 a1Var2, e1 e1Var, e1 e1Var2, a aVar, pf.z zVar, a1 a1Var3, e1 e1Var3, e1 e1Var4, float f12, d dVar4, d dVar5, f1 f1Var, m3 m3Var) {
        this.f26319a = dVar;
        this.f26320b = o1Var;
        this.f26321c = dVar2;
        this.f26322d = list;
        this.e = f10;
        this.f26323f = f11;
        this.f26324g = dVar3;
        this.f26325h = a1Var;
        this.i = a1Var2;
        this.f26326j = e1Var;
        this.f26327k = e1Var2;
        this.f26328l = aVar;
        this.f26329m = zVar;
        this.f26330n = a1Var3;
        this.f26331o = e1Var3;
        this.f26332p = e1Var4;
        this.f26333q = f12;
        this.f26334r = dVar4;
        this.f26335s = dVar5;
        this.f26336t = f1Var;
        this.f26337u = m3Var;
    }

    public static final float a(float f10, float f11, e1 e1Var) {
        float f12 = k6.f26414a;
        if (e1Var.h() > 0.0f) {
            f10 = e1Var.h();
        }
        if (f11 <= 0.0f) {
            f11 = 1.0f;
        }
        return (d(f11) * 0.41421357f) / (f10 / 2.0f);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        final d dVar = this.f26319a;
        final o1 o1Var = this.f26320b;
        final d dVar2 = this.f26321c;
        final List list = this.f26322d;
        final float f10 = this.e;
        final float f11 = this.f26323f;
        final d dVar3 = this.f26324g;
        final a1 a1Var = this.f26325h;
        final a1 a1Var2 = this.i;
        final e1 e1Var = this.f26326j;
        final e1 e1Var2 = this.f26327k;
        final a aVar = this.f26328l;
        final pf.z zVar = this.f26329m;
        final a1 a1Var3 = this.f26330n;
        final e1 e1Var3 = this.f26331o;
        final e1 e1Var4 = this.f26332p;
        final float f12 = this.f26333q;
        final d dVar4 = this.f26334r;
        final d dVar5 = this.f26335s;
        df.l lVar = new df.l() { // from class: u7.g5
            @Override // df.l
            public final Object invoke(Object obj) {
                float f13;
                float f14;
                int i;
                boolean z3;
                b bVar = (b) obj;
                if (((Number) d.this.e()).floatValue() > 0.5f) {
                    o1 o1Var2 = o1Var;
                    if (((Number) o1Var2.f26660p.e()).floatValue() < 0.5f) {
                        float f15 = k6.f26414a;
                        if (!((Boolean) a1Var3.getValue()).booleanValue() && ((Number) dVar2.e()).floatValue() < 0.1f) {
                            List list2 = list;
                            List list3 = list2;
                            if (!list3.isEmpty()) {
                                e1 e1Var5 = e1Var3;
                                if (e1Var5.h() > 0.0f) {
                                    f13 = e1Var5.h();
                                } else {
                                    f13 = f10;
                                }
                                e1 e1Var6 = e1Var4;
                                float h3 = e1Var6.h();
                                float f16 = f11;
                                if (h3 > 0.0f) {
                                    f14 = e1Var6.h();
                                } else {
                                    f14 = f16;
                                }
                                float a10 = a(f16, f12, e1Var6);
                                float intBitsToFloat = (Float.intBitsToFloat((int) (bVar.f18762a >> 32)) - (f13 / 2.0f)) * a10;
                                float intBitsToFloat2 = ((f14 / 2.0f) - Float.intBitsToFloat((int) (bVar.f18762a & 4294967295L))) * a10;
                                d dVar6 = dVar3;
                                float floatValue = (intBitsToFloat / 1.3f) + ((Number) dVar6.e()).floatValue();
                                int b10 = ff.a.b(floatValue);
                                int[] iArr = (int[]) qe.k.o(o1Var2.i().e, o1Var2.k());
                                if (iArr != null && b10 >= 0 && b10 < iArr.length) {
                                    i = iArr[b10];
                                } else {
                                    i = -1;
                                }
                                float abs = Math.abs(intBitsToFloat - ((b10 - ((Number) dVar6.e()).floatValue()) * 1.3f));
                                boolean z9 = true;
                                if (abs <= 0.606f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (Math.abs(intBitsToFloat2) > 1.0125f) {
                                    z9 = false;
                                }
                                if (i >= 0 && i < list3.size() && z3 && z9) {
                                    a1Var.setValue(((b) list2.get(i)).f21848a);
                                    a1Var2.setValue(Boolean.TRUE);
                                    e1Var.i(intBitsToFloat);
                                    e1Var2.i(o1Var2.a(floatValue));
                                    a aVar2 = aVar;
                                    aVar2.getClass();
                                    if (h.a()) {
                                        aVar2.a(0);
                                    }
                                    c0 c0Var = new c0(12, dVar4, null);
                                    pf.z zVar2 = zVar;
                                    pf.b0.x(zVar2, null, c0Var, 3);
                                    pf.b0.x(zVar2, null, new c0(13, dVar5, null), 3);
                                }
                            }
                        }
                    }
                }
                return pe.z.f22715a;
            }
        };
        final f1 f1Var = this.f26336t;
        Object h3 = f0.h(wVar, lVar, new d4(a1Var2, f1Var, a1Var, o1Var, e1Var2, this.f26337u, zVar, dVar3, dVar4, dVar5), new c4(a1Var2, f1Var, zVar, dVar3, o1Var, dVar4, dVar5, a1Var), new df.p() { // from class: u7.h5
            @Override // df.p
            public final Object invoke(Object obj, Object obj2) {
                float f13;
                int i;
                t tVar = (t) obj;
                tVar.getClass();
                long j10 = tVar.f27343c;
                if (((Boolean) a1.this.getValue()).booleanValue()) {
                    tVar.a();
                    float f14 = k6.f26414a;
                    e1 e1Var5 = e1Var3;
                    if (e1Var5.h() > 0.0f) {
                        f13 = e1Var5.h();
                    } else {
                        f13 = f10;
                    }
                    int i10 = (int) (j10 >> 32);
                    float a10 = a(f11, f12, e1Var4) * (Float.intBitsToFloat(i10) - (f13 / 2.0f));
                    e1Var.i(a10);
                    e1Var2.i(o1Var.a((a10 / 1.3f) + ((Number) dVar3.e()).floatValue()));
                    float f15 = 0.13f * f13;
                    if (Float.intBitsToFloat(i10) < f15) {
                        i = -1;
                    } else if (Float.intBitsToFloat(i10) > f13 - f15) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    f1Var.i(i);
                }
                return pe.z.f22715a;
            }
        }, cVar);
        if (h3 == ue.a.f27192u) {
            return h3;
        }
        return pe.z.f22715a;
    }
}
