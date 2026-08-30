package h8;

import a0.f0;
import k1.j0;
import k1.s0;
import pe.z;
import v1.t;
import wa.u8;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17952u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ f f17953v;

    public /* synthetic */ j(f fVar, int i) {
        this.f17952u = i;
        this.f17953v = fVar;
    }

    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f17952u;
        z zVar = z.f22715a;
        f fVar = this.f17953v;
        switch (i) {
            case 0:
                if (fVar.c(((t) obj).f27343c)) {
                    fVar.a(true);
                }
                return zVar;
            default:
                k1.p pVar = (k1.p) obj;
                fVar.getClass();
                pVar.getClass();
                long j10 = fVar.f17924b;
                f0 f0Var = k.f17954a;
                long b10 = u8.b(j10);
                float c10 = j1.e.c(j10) * 0.5f;
                s0 s0Var = k.f17956c;
                f0 f0Var2 = k.f17954a;
                s0Var.a(1.0f, j10, f0Var2);
                j0 j0Var = k.f17957d;
                f0 f0Var3 = k.f17955b;
                j0Var.a(1.0f, j10, f0Var3);
                pVar.u(c10, b10, f0Var2);
                pVar.u(c10, b10, f0Var3);
                return zVar;
        }
    }
}
