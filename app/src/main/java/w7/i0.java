package w7;
import r0.a1;
import r0.e1;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements df.a {
    public final /* synthetic */ Object A;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f28384u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u7.m3 f28385v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f28386w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f28387x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f28388y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f28389z;

    public /* synthetic */ i0(int i, int i10, int i11, Object obj, Object obj2, Object obj3, u7.m3 m3Var) {
        this.f28384u = i11;
        this.f28385v = m3Var;
        this.f28386w = i;
        this.f28387x = i10;
        this.f28388y = obj;
        this.f28389z = obj2;
        this.A = obj3;
    }

    @Override // df.a
    public final Object invoke() {
        int i = this.f28384u;
        pe.z zVar = pe.z.f22715a;
        Object obj = this.A;
        Object obj2 = this.f28389z;
        Object obj3 = this.f28388y;
        switch (i) {
            case 0:
                b1.v vVar = (b1.v) obj3;
                vVar.getClass();
                v0.b bVar = b1.w.e(vVar).f1328c;
                float h3 = ((e3) obj).f28145w.h();
                Context context = (Context) ((kotlin.jvm.internal.y) obj2).f19787u;
                u7.m3 m3Var = this.f28385v;
                m3Var.V(this.f28386w, this.f28387x, bVar, h3, context);
                vVar.clear();
                m3Var.U();
                return zVar;
            default:
                float f10 = m7.f28734c;
                this.f28385v.W0(this.f28386w, this.f28387x, (List) ((a1) obj3).getValue());
                ((a1) obj2).setValue(null);
                ((e1) obj).i(0.0f);
                return zVar;
        }
    }
}
