package b8;
import g0.c;
import b0.x;
import p7.o0;
import r0.a1;
import x7.g0;

import android.content.Context;
import java.util.Set;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3000u = 1;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f3001v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f3002w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3003x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f3004y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Object f3005z;

    public /* synthetic */ y(Context context, o0 o0Var, w7.e3 e3Var, boolean z3, a1 a1Var) {
        this.f3003x = context;
        this.f3004y = o0Var;
        this.f3005z = e3Var;
        this.f3001v = z3;
        this.f3002w = a1Var;
    }

    @Override // df.a
    public final Object invoke() {
        int i = this.f3000u;
        pe.z zVar = pe.z.f22715a;
        a1 a1Var = this.f3002w;
        boolean z3 = this.f3001v;
        Object obj = this.f3005z;
        Object obj2 = this.f3004y;
        Object obj3 = this.f3003x;
        switch (i) {
            case 0:
                df.a aVar = (df.a) obj3;
                pf.z zVar2 = (pf.z) obj2;
                q.d dVar = (q.d) obj;
                if (!z3) {
                    aVar.invoke();
                } else if (!((Boolean) a1Var.getValue()).booleanValue()) {
                    a1Var.setValue(Boolean.TRUE);
                    sf.n0 n0Var = q0.f2557f;
                    Boolean bool = Boolean.FALSE;
                    n0Var.getClass();
                    n0Var.k(null, bool);
                    pf.x(zVar2, null, new c0(3, dVar, null), 3);
                }
                return zVar;
            default:
                Set set = g0.f30195a;
                String str = ((o0) obj2).f22545a;
                g0.c((Context) obj3, "magic:".concat(str));
                ((w7.e3) obj).A.setValue(str);
                if (z3) {
                    a1Var.setValue(Boolean.TRUE);
                }
                return zVar;
        }
    }

    public /* synthetic */ y(boolean z3, df.a aVar, pf.z zVar, a1 a1Var, q.d dVar) {
        this.f3001v = z3;
        this.f3003x = aVar;
        this.f3004y = zVar;
        this.f3002w = a1Var;
        this.f3005z = dVar;
    }
}
