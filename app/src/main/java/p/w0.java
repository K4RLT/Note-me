package p;
import j1.b;
import j1.c;

/* loaded from: classes.dex */
public final class w0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22286u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ y0 f22287v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z1.a1 f22288w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(y0 y0Var, z1.a1 a1Var, int i) {
        super(1);
        this.f22286u = i;
        this.f22287v = y0Var;
        this.f22288w = a1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        long d2;
        z1.x d10;
        switch (this.f22286u) {
            case 0:
                z1.z0 z0Var = (z1.z0) obj;
                z1.x d11 = z0Var.d();
                if (d11 != null) {
                    y0.Y0(this.f22287v, d11);
                }
                z0Var.h(this.f22288w, 0, 0, 0.0f);
                return pe.z.f22715a;
            default:
                z1.z0 z0Var2 = (z1.z0) obj;
                y0 y0Var = this.f22287v;
                if (y0Var.I.e().c() != null) {
                    z c10 = y0Var.I.c();
                    c a10 = y0Var.I.e().a();
                    a10.getClass();
                    c c11 = y0Var.I.e().c();
                    c11.getClass();
                    c10.a(a10, c11);
                }
                c c12 = y0Var.I.c().c();
                z1.x d12 = z0Var2.d();
                b bVar = null;
                long j10 = 0;
                if (d12 != null) {
                    z1.x xVar = y0Var.I.e().f22094b.A;
                    if (xVar != null) {
                        bVar = new b(xVar.d(d12, 0L));
                    } else {
                        kotlin.jvm.internal.l.h("root");
                        throw null;
                    }
                }
                b1 b1Var = y0Var.I;
                if (c12 != null) {
                    if (b1Var.c().b()) {
                        y0Var.I.e().e.setValue(c12);
                    }
                    d2 = c12.d();
                } else {
                    if (b1Var.c().b() && (d10 = z0Var2.d()) != null) {
                        y0.Y0(y0Var, d10);
                    }
                    c a11 = y0Var.I.e().a();
                    a11.getClass();
                    d2 = a11.d();
                }
                if (bVar != null) {
                    j10 = b.g(d2, bVar.f18762a);
                }
                z0Var2.h(this.f22288w, Math.round(Float.intBitsToFloat((int) (j10 >> 32))), Math.round(Float.intBitsToFloat((int) (4294967295L & j10))), 0.0f);
                return pe.z.f22715a;
        }
    }
}
