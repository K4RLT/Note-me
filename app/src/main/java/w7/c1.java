package w7;
import j1.b;

import android.content.Context;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements df.l {
    public final /* synthetic */ float A;
    public final /* synthetic */ e3 B;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ float f28012u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f28013v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28014w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28015x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f28016y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ float f28017z;

    public /* synthetic */ c1(float f10, kotlin.jvm.internal.y yVar, u7.m3 m3Var, int i, int i10, float f11, float f12, e3 e3Var) {
        this.f28012u = f10;
        this.f28013v = yVar;
        this.f28014w = m3Var;
        this.f28015x = i;
        this.f28016y = i10;
        this.f28017z = f11;
        this.A = f12;
        this.B = e3Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float f10;
        b bVar = (b) obj;
        float h3 = (this.B.f28145w.h() * this.f28012u) / 2.0f;
        if (h3 < 1.0f) {
            f10 = 1.0f;
        } else {
            f10 = h3;
        }
        Context context = (Context) this.f28013v.f19787u;
        u7.m3 m3Var = this.f28014w;
        int i = this.f28015x;
        int i10 = this.f28016y;
        Iterator it = n4.y1(context, qe.l.P(m3Var.k1(i, i10)), bVar.f18762a, f10, this.f28017z, this.A).iterator();
        while (it.hasNext()) {
            m3Var.Q0((String) it.next(), i, i10);
        }
        return pe.z.f22715a;
    }
}
