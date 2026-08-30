package w7;
import j4.b;
import r0.a1;
import v1.w;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* loaded from: classes.dex */
public final class f4 implements PointerInputEventHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f28206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e3 f28207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f28208c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e3 f28209d;
    public final /* synthetic */ e3 e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e3 f28210f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e3 f28211g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e3 f28212h;
    public final /* synthetic */ e3 i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e3 f28213j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e3 f28214k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e3 f28215l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a1 f28216m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ df.a f28217n;

    public f4(df.a aVar, a1 a1Var, a1 a1Var2, e3 e3Var, e3 e3Var2, e3 e3Var3, e3 e3Var4, e3 e3Var5, e3 e3Var6, e3 e3Var7, e3 e3Var8, e3 e3Var9, e3 e3Var10, e3 e3Var11) {
        this.f28206a = a1Var;
        this.f28207b = e3Var;
        this.f28208c = e3Var2;
        this.f28209d = e3Var3;
        this.e = e3Var4;
        this.f28210f = e3Var5;
        this.f28211g = e3Var6;
        this.f28212h = e3Var7;
        this.i = e3Var8;
        this.f28213j = e3Var9;
        this.f28214k = e3Var10;
        this.f28215l = e3Var11;
        this.f28216m = a1Var2;
        this.f28217n = aVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(w wVar, te.c cVar) {
        final a1 a1Var = this.f28206a;
        final e3 e3Var = this.f28207b;
        final e3 e3Var2 = this.f28208c;
        final e3 e3Var3 = this.f28209d;
        final e3 e3Var4 = this.e;
        final e3 e3Var5 = this.f28210f;
        final e3 e3Var6 = this.f28211g;
        final e3 e3Var7 = this.f28212h;
        final e3 e3Var8 = this.i;
        final e3 e3Var9 = this.f28213j;
        final e3 e3Var10 = this.f28214k;
        final e3 e3Var11 = this.f28215l;
        c4 c4Var = new c4(a1Var, e3Var, e3Var2, e3Var3, e3Var4, e3Var5, e3Var6, e3Var7, e3Var8, e3Var9, e3Var10, e3Var11, 3);
        final df.a aVar = this.f28217n;
        final a1 a1Var2 = this.f28216m;
        Object e = t.k2.e(wVar, null, c4Var, null, new df.l() { // from class: w7.e4
            @Override // df.l
            public final Object invoke(Object obj) {
                boolean z3;
                a1 a1Var3 = a1Var2;
                if (a1Var3 != null) {
                    a1Var3.setValue(Boolean.FALSE);
                }
                a1 a1Var4 = a1Var;
                if (a1Var4 != null) {
                    a1Var4.setValue(null);
                }
                float f10 = j4.f28501a;
                e3 e3Var12 = e3Var6;
                boolean j10 = e3Var12.j();
                e3 e3Var13 = e3Var;
                e3 e3Var14 = e3Var4;
                e3 e3Var15 = e3Var5;
                e3 e3Var16 = e3Var7;
                e3 e3Var17 = e3Var8;
                boolean z9 = true;
                if (j10 && !e3Var13.a() && !e3Var14.h() && !e3Var15.k() && !e3Var16.i() && !e3Var17.b()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                e3Var13.s(false);
                e3Var2.C(false);
                e3Var3.v(false);
                e3Var14.w(false);
                e3Var15.z(false);
                e3Var12.y(true);
                e3Var16.x(false);
                e3Var17.t(false);
                e3Var9.u(false);
                e3Var11.A(false);
                e3 e3Var18 = e3Var10;
                if (!z3 || ((Boolean) aVar.invoke()).booleanValue() || b(e3Var18)) {
                    z9 = false;
                }
                e3Var18.B(z9);
                return pe.z.f22715a;
            }
        }, cVar, 5);
        if (e == ue.a.f27192u) {
            return e;
        }
        return pe.z.f22715a;
    }
}
