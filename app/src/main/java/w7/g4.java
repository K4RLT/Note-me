package w7;
import r0.a1;
import r0.e1;
import y8.c;

import android.content.Context;
import android.util.Log;
import android.view.Choreographer;
import android.view.TextureView;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class g4 implements df.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28289u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f28290v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28291w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f28292x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f28293y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f28294z;

    public /* synthetic */ g4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, int i) {
        this.f28289u = i;
        this.f28290v = obj;
        this.f28291w = obj2;
        this.f28292x = obj3;
        this.f28293y = obj4;
        this.f28294z = obj5;
        this.A = obj6;
        this.B = obj7;
        this.C = obj8;
        this.D = obj9;
        this.E = obj10;
        this.F = obj11;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i = this.f28289u;
        pe.z zVar = pe.z.f22715a;
        Object obj2 = this.F;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.B;
        Object obj7 = this.A;
        Object obj8 = this.f28294z;
        Object obj9 = this.f28293y;
        Object obj10 = this.f28292x;
        Object obj11 = this.f28291w;
        Object obj12 = this.f28290v;
        switch (i) {
            case 0:
                float f10 = j4.f28501a;
                ((e3) obj12).s(false);
                ((e3) obj11).C(false);
                ((e3) obj10).v(false);
                ((e3) obj9).w(false);
                ((e3) obj8).z(false);
                ((e3) obj7).y(false);
                ((e3) obj6).x(false);
                ((e3) obj5).t(false);
                ((e3) obj4).u(false);
                ((e3) obj3).B(false);
                ((e3) obj2).A(!r5.m());
                return zVar;
            case 1:
                float f11 = j4.f28501a;
                ((e3) obj12).s(false);
                ((e3) obj11).C(false);
                ((e3) obj10).v(false);
                ((e3) obj9).w(false);
                ((e3) obj8).z(false);
                ((e3) obj7).y(false);
                ((e3) obj6).x(false);
                ((e3) obj5).t(false);
                ((e3) obj4).u(true);
                ((e3) obj3).B(false);
                ((e3) obj2).A(!r5.m());
                return zVar;
            default:
                u7.l2 l2Var = (u7.l2) obj12;
                Context context = (Context) obj11;
                List list = (List) obj10;
                List list2 = (List) obj9;
                c cVar = (c) obj8;
                u7.q7 q7Var = (u7.q7) obj7;
                u7.d6 d6Var = (u7.d6) obj6;
                Choreographer choreographer = (Choreographer) obj5;
                e1 e1Var = (e1) obj4;
                e1 e1Var2 = (e1) obj3;
                a1 a1Var = (a1) obj2;
                TextureView textureView = (TextureView) obj;
                textureView.getClass();
                try {
                    if (l2Var.f26432a == null) {
                        l2Var.d(context, list, list2);
                        l2Var.c(textureView, cVar, q7Var, new b8.l(e1Var, 5, e1Var2));
                        d6Var.f26092u = true;
                        choreographer.postFrameCallback(d6Var);
                        a1Var.setValue(Boolean.TRUE);
                    }
                } catch (Throwable th) {
                    Log.e("FILAMENT_DIAG", "fallo en init Filament", th);
                }
                return zVar;
        }
    }
}
