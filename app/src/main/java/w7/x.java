package w7;
import j1.b;
import r0.a1;
import v1.w;
import z1.x;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class x implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29397a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1.y f29398b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f29399c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f29400d;
    public final /* synthetic */ a1 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a1 f29401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a1 f29402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b1.v f29403h;
    public final /* synthetic */ boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o1 f29404j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f29405k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ pf.z f29406l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f29407m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f29408n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ a1 f29409o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a1 f29410p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a1 f29411q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a1 f29412r;

    public x(int i, b1.y yVar, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, b1.v vVar, boolean z3, o1 o1Var, float f10, pf.z zVar, float f11, float f12, a1 a1Var6, a1 a1Var7, a1 a1Var8, a1 a1Var9) {
        this.f29397a = i;
        this.f29398b = yVar;
        this.f29399c = a1Var;
        this.f29400d = a1Var2;
        this.e = a1Var3;
        this.f29401f = a1Var4;
        this.f29402g = a1Var5;
        this.f29403h = vVar;
        this.i = z3;
        this.f29404j = o1Var;
        this.f29405k = f10;
        this.f29406l = zVar;
        this.f29407m = f11;
        this.f29408n = f12;
        this.f29409o = a1Var6;
        this.f29410p = a1Var7;
        this.f29411q = a1Var8;
        this.f29412r = a1Var9;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        final int i = this.f29397a;
        final b1.y yVar = this.f29398b;
        final a1 a1Var = this.f29399c;
        final a1 a1Var2 = this.f29400d;
        final a1 a1Var3 = this.e;
        final a1 a1Var4 = this.f29401f;
        final a1 a1Var5 = this.f29402g;
        final a1 a1Var6 = this.f29410p;
        final a1 a1Var7 = this.f29411q;
        df.l lVar = new df.l() { // from class: w7.s
            @Override // df.l
            public final Object invoke(Object obj) {
                a1 a1Var8 = a1Var;
                if (((Boolean) a1Var8.getValue()).booleanValue()) {
                    n4.f(a1Var6, a1Var8, a1Var7);
                }
                int i10 = i;
                a1Var2.setValue(Integer.valueOf(i10));
                long j10 = 0;
                n4.S0(a1Var3, 0L);
                z1.x xVar = (z1.x) a1Var4.getValue();
                z1.x xVar2 = (z1.x) yVar.get(Integer.valueOf(i10));
                if (xVar != null && xVar2 != null) {
                    j10 = xVar.d(xVar2, 0L);
                }
                a1Var5.setValue(new b(j10));
                return pe.z.f22715a;
            }
        };
        final b1.v vVar = this.f29403h;
        final boolean z3 = this.i;
        final o1 o1Var = this.f29404j;
        final float f10 = this.f29405k;
        final pf.z zVar = this.f29406l;
        final float f11 = this.f29407m;
        final float f12 = this.f29408n;
        final a1 a1Var8 = this.f29409o;
        final a1 a1Var9 = this.f29412r;
        Object h3 = t.f0.h(wVar, lVar, new df.a() { // from class: w7.t
            @Override // df.a
            public final Object invoke() {
                a1 a1Var10 = a1Var2;
                Integer num = (Integer) a1Var10.getValue();
                a1 a1Var11 = a1Var3;
                if (num == null) {
                    n4.S0(a1Var11, 0L);
                } else {
                    boolean h10 = n4.h(f11, f12, a1Var10, a1Var4, a1Var9, a1Var5, a1Var11);
                    b1.v vVar2 = b1.v.this;
                    if (h10) {
                        vVar2.remove(num.intValue());
                        a1 a1Var12 = a1Var8;
                        a1Var12.setValue(Integer.valueOf(((Number) a1Var12.getValue()).intValue() + 1));
                        if (z3 && !vVar2.isEmpty()) {
                            o1Var.invoke(vVar2.get(0));
                        }
                        a1Var10.setValue(null);
                        n4.S0(a1Var11, 0L);
                    } else {
                        int intValue = num.intValue();
                        pf.b0.x(zVar, null, new w(n4.g(f10, vVar2, a1Var11, intValue), num, vVar2, ((b) a1Var11.getValue()).f18762a, (Float.floatToRawIntBits((r1 - num.intValue()) * r2) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), a1Var11, a1Var10, null), 3);
                    }
                }
                return pe.z.f22715a;
            }
        }, new b8.s6(16, a1Var2, a1Var3), new u(a1Var3, 0), cVar);
        if (h3 == ue.a.f27192u) {
            return h3;
        }
        return pe.z.f22715a;
    }
}
