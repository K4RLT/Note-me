package u7;
import o0.h;
import o7.b;
import r0.a1;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class s implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26799u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f26800v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26801w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f26802x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f26803y;

    public /* synthetic */ s(int i, int i10, Context context, a1 a1Var, m3 m3Var) {
        this.f26799u = i10;
        this.f26800v = m3Var;
        this.f26801w = i;
        this.f26802x = context;
        this.f26803y = a1Var;
    }

    @Override // df.a
    public final Object invoke() {
        String str;
        switch (this.f26799u) {
            case 0:
                a1 a1Var = this.f26803y;
                if (!((Boolean) a1Var.getValue()).booleanValue()) {
                    a1Var.setValue(Boolean.TRUE);
                } else {
                    Boolean bool = Boolean.FALSE;
                    a1Var.setValue(bool);
                    y0 y0Var = new y0(11);
                    Context context = this.f26802x;
                    context.getClass();
                    m3 m3Var = this.f26800v;
                    List list = m3Var.f26547u;
                    int i = this.f26801w;
                    b bVar = (b) qe.l.y(i, list);
                    if (bVar != null && (str = bVar.f21848a) != null) {
                        pf.b0.x(androidx.lifecycle.h(m3Var), null, new l3(m3Var, i, context, str, y0Var, null), 3);
                    } else {
                        y0Var.invoke(bool);
                    }
                }
                return pe.z.f22715a;
            default:
                this.f26800v.M0(this.f26802x, this.f26801w);
                u0.f(this.f26803y, false);
                return pe.z.f22715a;
        }
    }
}
