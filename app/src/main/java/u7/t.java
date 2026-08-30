package u7;
import b2.f1;
import d.a;
import o7.b;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f26873u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ m3 f26874v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f26875w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f26876x;

    public /* synthetic */ t(int i, int i10, Context context, m3 m3Var) {
        this.f26873u = i10;
        this.f26874v = m3Var;
        this.f26875w = i;
        this.f26876x = context;
    }

    @Override // df.a
    public final Object invoke() {
        String str;
        switch (this.f26873u) {
            case 0:
                Context context = this.f26876x;
                context.getClass();
                m3 m3Var = this.f26874v;
                b bVar = (b) qe.l.y(this.f26875w, m3Var.f26547u);
                if (bVar != null && (str = bVar.f21848a) != null) {
                    f1 f1Var = m3Var.f26541o;
                    f1Var.getClass();
                    v7.d a10 = v7.a(f1Var.m(context, str), null, false, 0, false, null, null, 0, 0.0f, 1.0f, 0.0f, 0.0f, null, 0, null, 30975);
                    ((ConcurrentHashMap) f1Var.f1458x).put(str, a10);
                    f1.o(str, context, a10);
                    f1Var.f(str);
                }
                return pe.z.f22715a;
            default:
                this.f26874v.V0(this.f26875w, this.f26876x, -1);
                return pe.z.f22715a;
        }
    }
}
