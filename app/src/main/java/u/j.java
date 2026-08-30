package u;
import l.b;
import l.d;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.v;
import pe.z;
import r0.i1;
import t.f1;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f25787u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f25788v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f25789w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f1 f25790x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ df.l f25791y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(float f10, v vVar, f1 f1Var, df.l lVar, int i) {
        super(1);
        this.f25787u = i;
        this.f25788v = f10;
        this.f25789w = vVar;
        this.f25790x = f1Var;
        this.f25791y = lVar;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        float f10;
        switch (this.f25787u) {
            case 0:
                q.j jVar = (q.j) obj;
                float abs = Math.abs(((Number) jVar.e.getValue()).floatValue());
                float f11 = this.f25788v;
                float abs2 = Math.abs(f11);
                i1 i1Var = jVar.e;
                df.l lVar = this.f25791y;
                f1 f1Var = this.f25790x;
                v vVar = this.f25789w;
                if (abs >= abs2) {
                    float d2 = d(((Number) i1Var.getValue()).floatValue(), f11);
                    b(jVar, f1Var, lVar, d2 - vVar.f19784u);
                    jVar.a();
                    vVar.f19784u = d2;
                } else {
                    b(jVar, f1Var, lVar, ((Number) i1Var.getValue()).floatValue() - vVar.f19784u);
                    vVar.f19784u = ((Number) i1Var.getValue()).floatValue();
                }
                return z.f22715a;
            default:
                q.j jVar2 = (q.j) obj;
                float d10 = d(((Number) jVar2.e.getValue()).floatValue(), this.f25788v);
                v vVar2 = this.f25789w;
                float f12 = d10 - vVar2.f19784u;
                try {
                    f10 = this.f25790x.a(f12);
                } catch (CancellationException unused) {
                    jVar2.a();
                    f10 = 0.0f;
                }
                this.f25791y.invoke(Float.valueOf(f10));
                if (Math.abs(f12 - f10) > 0.5f || d10 != ((Number) jVar2.e.getValue()).floatValue()) {
                    jVar2.a();
                }
                vVar2.f19784u += f10;
                return z.f22715a;
        }
    }
}
