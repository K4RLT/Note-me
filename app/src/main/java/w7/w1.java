package w7;
import p7.e0;
import r0.a1;
import r0.e1;
import t1.e;
import v1.h0;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class w1 implements PointerInputEventHandler {
    public final /* synthetic */ e3 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ kotlin.jvm.internal.y D;
    public final /* synthetic */ e3 E;
    public final /* synthetic */ a1 F;
    public final /* synthetic */ e1 G;
    public final /* synthetic */ a1 H;
    public final /* synthetic */ q.d I;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f29327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f29328b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f29329c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f29330d;
    public final /* synthetic */ e0 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b1.v f29331f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f29332g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b1.v f29333h;
    public final /* synthetic */ b1.v i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b1.v f29334j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f29335k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f29336l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pf.z f29337m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ df.p f29338n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a1 f29339o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ e3 f29340p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a1 f29341q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1 f29342r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a1 f29343s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a1 f29344t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ e1 f29345u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e3 f29346v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e3 f29347w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e3 f29348x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e3 f29349y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ e3 f29350z;

    public w1(boolean z3, float f10, float f11, float f12, e0 e0Var, b1.v vVar, u7.m3 m3Var, b1.v vVar2, b1.v vVar3, b1.v vVar4, int i, int i10, pf.z zVar, df.p pVar, a1 a1Var, e3 e3Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, e1 e1Var, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, e3 e3Var6, e3 e3Var7, int i11, int i12, kotlin.jvm.internal.y yVar, e3 e3Var8, a1 a1Var6, e1 e1Var2, a1 a1Var7, q.d dVar) {
        this.f29327a = z3;
        this.f29328b = f10;
        this.f29329c = f11;
        this.f29330d = f12;
        this.e = e0Var;
        this.f29331f = vVar;
        this.f29332g = m3Var;
        this.f29333h = vVar2;
        this.i = vVar3;
        this.f29334j = vVar4;
        this.f29335k = i;
        this.f29336l = i10;
        this.f29337m = zVar;
        this.f29338n = pVar;
        this.f29339o = a1Var;
        this.f29340p = e3Var;
        this.f29341q = a1Var2;
        this.f29342r = a1Var3;
        this.f29343s = a1Var4;
        this.f29344t = a1Var5;
        this.f29345u = e1Var;
        this.f29346v = e3Var2;
        this.f29347w = e3Var3;
        this.f29348x = e3Var4;
        this.f29349y = e3Var5;
        this.f29350z = e3Var6;
        this.A = e3Var7;
        this.B = i11;
        this.C = i12;
        this.D = yVar;
        this.E = e3Var8;
        this.F = a1Var6;
        this.G = e1Var2;
        this.H = a1Var7;
        this.I = dVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        float f10;
        if (!this.f29327a) {
            h0 h0Var = (h0) wVar;
            float a10 = h0Var.a() * 28;
            float a11 = h0Var.a() * 16;
            if (this.f29328b == 0.0f) {
                f10 = this.f29330d;
            } else {
                f10 = this.f29329c;
            }
            float f11 = f10;
            float a12 = h0Var.a() * 700;
            float f12 = this.f29328b;
            Object e = t.e(h0Var, new v1(a10, f12, a11, this.e, this.f29331f, this.f29332g, this.f29333h, this.i, this.f29334j, f11, this.f29335k, new b8.n4(3, f12), this.f29336l, this.f29337m, a12, this.f29338n, this.f29339o, this.f29340p, this.f29341q, this.f29342r, this.f29343s, this.f29344t, this.f29345u, this.f29346v, this.f29347w, this.f29348x, this.f29349y, this.f29350z, this.A, this.f29330d, this.f29329c, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, null), cVar);
            if (e == ue.a.f27192u) {
                return e;
            }
        }
        return pe.z.f22715a;
    }
}
