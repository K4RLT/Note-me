package q3;
import c0.f;
import q0.c;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class d0 extends g0 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f23388c;

    public d0(q0 q0Var) {
        super(q0Var);
        WindowInsets.Builder e;
        WindowInsets b10 = q0Var.b();
        if (b10 != null) {
            e = f(b10);
        } else {
            e = n1.f.e();
        }
        this.f23388c = e;
    }

    @Override // q3.g0
    public q0 b() {
        WindowInsets build;
        a();
        build = this.f23388c.build();
        q0 c10 = c(build, null);
        c10.f23423a.r(this.f23395b);
        return c10;
    }

    @Override // q3.g0
    public void d(j3.c cVar) {
        this.f23388c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // q3.g0
    public void e(j3.c cVar) {
        this.f23388c.setStableInsets(cVar.d());
    }

    @Override // q3.g0
    public void f(j3.c cVar) {
        this.f23388c.setSystemGestureInsets(cVar.d());
    }

    @Override // q3.g0
    public void g(j3.c cVar) {
        this.f23388c.setSystemWindowInsets(cVar.d());
    }

    @Override // q3.g0
    public void h(j3.c cVar) {
        this.f23388c.setTappableElementInsets(cVar.d());
    }

    public d0() {
        this.f23388c = n1.f.e();
    }
}
