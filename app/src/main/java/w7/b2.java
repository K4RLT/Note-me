package w7;
import p7.e0;
import r0.a1;
import r0.e1;
import t1.e;
import v1.h0;
import v1.w;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class b2 implements PointerInputEventHandler {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ float C;
    public final /* synthetic */ df.v D;
    public final /* synthetic */ df.l E;
    public final /* synthetic */ a1 F;
    public final /* synthetic */ a1 G;
    public final /* synthetic */ a1 H;
    public final /* synthetic */ a1 I;
    public final /* synthetic */ e1 J;
    public final /* synthetic */ a1 K;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f27950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27952c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f27953d;
    public final /* synthetic */ View e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0 f27954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1.v f27955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b1.v f27956h;
    public final /* synthetic */ e3 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a1 f27957j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a1 f27958k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f27959l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ df.l f27960m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ e3 f27961n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ e3 f27962o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e3 f27963p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e3 f27964q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1 f27965r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e3 f27966s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e3 f27967t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e3 f27968u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e3 f27969v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e3 f27970w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e3 f27971x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e3 f27972y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f27973z;

    public b2(u7.m3 m3Var, int i, int i10, kotlin.jvm.internal.y yVar, View view, e0 e0Var, b1.v vVar, b1.v vVar2, e3 e3Var, a1 a1Var, a1 a1Var2, int i11, df.l lVar, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, a1 a1Var3, e3 e3Var6, e3 e3Var7, e3 e3Var8, e3 e3Var9, e3 e3Var10, e3 e3Var11, e3 e3Var12, a1 a1Var4, a1 a1Var5, a1 a1Var6, float f10, df.v vVar3, df.l lVar2, a1 a1Var7, a1 a1Var8, a1 a1Var9, a1 a1Var10, e1 e1Var, a1 a1Var11) {
        this.f27950a = m3Var;
        this.f27951b = i;
        this.f27952c = i10;
        this.f27953d = yVar;
        this.e = view;
        this.f27954f = e0Var;
        this.f27955g = vVar;
        this.f27956h = vVar2;
        this.i = e3Var;
        this.f27957j = a1Var;
        this.f27958k = a1Var2;
        this.f27959l = i11;
        this.f27960m = lVar;
        this.f27961n = e3Var2;
        this.f27962o = e3Var3;
        this.f27963p = e3Var4;
        this.f27964q = e3Var5;
        this.f27965r = a1Var3;
        this.f27966s = e3Var6;
        this.f27967t = e3Var7;
        this.f27968u = e3Var8;
        this.f27969v = e3Var9;
        this.f27970w = e3Var10;
        this.f27971x = e3Var11;
        this.f27972y = e3Var12;
        this.f27973z = a1Var4;
        this.A = a1Var5;
        this.B = a1Var6;
        this.C = f10;
        this.D = vVar3;
        this.E = lVar2;
        this.F = a1Var7;
        this.G = a1Var8;
        this.H = a1Var9;
        this.I = a1Var10;
        this.J = e1Var;
        this.K = a1Var11;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        float f10 = (int) (((h0) wVar).S >> 32);
        Object e = t.e(wVar, new a2(f10, (int) (r2 & 4294967295L), f10 / 2.0f, this.f27950a, this.f27951b, this.f27952c, this.f27953d, this.e, this.f27954f, this.f27955g, this.f27956h, this.i, this.f27957j, this.f27958k, this.f27959l, this.f27960m, this.f27961n, this.f27962o, this.f27963p, this.f27964q, this.f27965r, this.f27966s, this.f27967t, this.f27968u, this.f27969v, this.f27970w, this.f27971x, this.f27972y, this.f27973z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, null), cVar);
        if (e == ue.a.f27192u) {
            return e;
        }
        return pe.z.f22715a;
    }
}
