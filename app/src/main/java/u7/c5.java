package u7;
import j1.b;
import o7.b;
import q.d;
import r0.a1;
import r0.e1;
import r0.f1;
import t.k2;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;

/* loaded from: classes.dex */
public final class c5 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf.z f26003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f26004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o1 f26005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f26006d;
    public final /* synthetic */ float e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f26007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f26008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df.l f26009h;
    public final /* synthetic */ d i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f26010j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f26011k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f26012l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f26013m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d f26014n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a1 f26015o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a1 f26016p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e1 f26017q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e1 f26018r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1 f26019s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f1 f26020t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ f1 f26021u;

    public c5(pf.z zVar, d dVar, o1 o1Var, float f10, float f11, float f12, List list, df.l lVar, d dVar2, d dVar3, boolean z3, b bVar, d dVar4, d dVar5, a1 a1Var, a1 a1Var2, e1 e1Var, e1 e1Var2, a1 a1Var3, f1 f1Var, f1 f1Var2) {
        this.f26003a = zVar;
        this.f26004b = dVar;
        this.f26005c = o1Var;
        this.f26006d = f10;
        this.e = f11;
        this.f26007f = f12;
        this.f26008g = list;
        this.f26009h = lVar;
        this.i = dVar2;
        this.f26010j = dVar3;
        this.f26011k = z3;
        this.f26012l = bVar;
        this.f26013m = dVar4;
        this.f26014n = dVar5;
        this.f26015o = a1Var;
        this.f26016p = a1Var2;
        this.f26017q = e1Var;
        this.f26018r = e1Var2;
        this.f26019s = a1Var3;
        this.f26020t = f1Var;
        this.f26021u = f1Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        final pf.z zVar = this.f26003a;
        final d dVar = this.f26004b;
        final o1 o1Var = this.f26005c;
        final float f10 = this.f26006d;
        final float f11 = this.e;
        final float f12 = this.f26007f;
        final List list = this.f26008g;
        final df.l lVar = this.f26009h;
        final d dVar2 = this.i;
        final d dVar3 = this.f26010j;
        final boolean z3 = this.f26011k;
        final b bVar = this.f26012l;
        final d dVar4 = this.f26013m;
        final d dVar5 = this.f26014n;
        final a1 a1Var = this.f26015o;
        final a1 a1Var2 = this.f26016p;
        final e1 e1Var = this.f26017q;
        final e1 e1Var2 = this.f26018r;
        final a1 a1Var3 = this.f26019s;
        final f1 f1Var = this.f26020t;
        final f1 f1Var2 = this.f26021u;
        Object e = k2.e(wVar, null, null, null, new df.l() { // from class: u7.a5
            @Override // df.l
            public final Object invoke(Object obj) {
                pf.b0.x(pf.z.this, null, new b5(dVar, o1Var, f10, f11, f12, (b) obj, list, lVar, dVar2, dVar3, z3, bVar, dVar4, dVar5, a1Var, a1Var2, e1Var, e1Var2, a1Var3, f1Var, f1Var2, null), 3);
                return pe.z.f22715a;
            }
        }, cVar, 7);
        if (e == ue.a.f27192u) {
            return e;
        }
        return pe.z.f22715a;
    }
}
