package u7;
import d.i;
import r0.a1;
import u0.b;
import u6.a;
import w7.e3;

import android.content.Context;
import android.os.Build;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements df.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26155u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f26156v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f26157w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f26158x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f26159y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f26160z;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, int i) {
        this.f26155u = i;
        this.f26156v = obj;
        this.f26157w = obj2;
        this.f26158x = obj3;
        this.f26159y = obj4;
        this.f26160z = obj5;
        this.A = obj6;
        this.B = obj7;
        this.C = obj8;
        this.D = obj9;
        this.E = obj10;
        this.F = obj11;
    }

    @Override // df.a
    public final Object invoke() {
        String str;
        boolean z3;
        switch (this.f26155u) {
            case 0:
                Context context = (Context) this.f26156v;
                df.a aVar = (df.a) this.f26157w;
                i iVar = (i) this.f26158x;
                a1 a1Var = (a1) this.f26159y;
                a1 a1Var2 = (a1) this.f26160z;
                a1 a1Var3 = (a1) this.A;
                a1 a1Var4 = (a1) this.B;
                a1 a1Var5 = (a1) this.C;
                a1 a1Var6 = (a1) this.D;
                a1 a1Var7 = (a1) this.E;
                a1 a1Var8 = (a1) this.F;
                if (Build.VERSION.SDK_INT >= 33) {
                    str = "android.permission.READ_MEDIA_IMAGES";
                } else {
                    str = "android.permission.READ_EXTERNAL_STORAGE";
                }
                if (wa.a(context, str) == 0) {
                    a1Var.setValue(Boolean.valueOf(!u0.e(a1Var)));
                    if (((Boolean) a1Var.getValue()).booleanValue()) {
                        u0.h(a1Var2);
                        u0.i(a1Var3);
                        u0.j(a1Var4);
                        b(a1Var5);
                        u0.d(a1Var6);
                        a1Var7.setValue(Boolean.FALSE);
                    }
                    if (((Boolean) a1Var.getValue()).booleanValue() && ((List) a1Var8.getValue()).isEmpty()) {
                        aVar.invoke();
                    }
                } else {
                    iVar.a(str);
                }
                return pe.z.f22715a;
            default:
                e3 e3Var = (e3) this.f26156v;
                e3 e3Var2 = (e3) this.f26157w;
                e3 e3Var3 = (e3) this.f26158x;
                e3 e3Var4 = (e3) this.f26159y;
                e3 e3Var5 = (e3) this.f26160z;
                e3 e3Var6 = (e3) this.A;
                e3 e3Var7 = (e3) this.B;
                e3 e3Var8 = (e3) this.C;
                e3 e3Var9 = (e3) this.D;
                e3 e3Var10 = (e3) this.E;
                e3 e3Var11 = (e3) this.F;
                if (e3Var.b() && !e3Var2.a() && !e3Var3.h() && !e3Var4.k() && !e3Var5.i()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                e3Var2.s(false);
                e3Var6.C(false);
                e3Var7.v(false);
                e3Var3.w(false);
                e3Var4.z(false);
                e3Var8.y(false);
                e3Var5.x(false);
                e3Var.t(true);
                e3Var9.u(false);
                e3Var10.B(false);
                if (z3) {
                    e3Var11.A(!e3Var11.m());
                } else {
                    e3Var11.A(false);
                }
                return pe.z.f22715a;
        }
    }
}
