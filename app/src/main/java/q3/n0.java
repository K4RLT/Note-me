package q3;
import x.n;
import q.x;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class n0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f23414b;

    /* renamed from: a, reason: collision with root package name */
    public final q0 f23415a;

    static {
        g0 b0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            b0Var = new f0();
        } else if (i >= 30) {
            b0Var = new e0();
        } else if (i >= 29) {
            b0Var = new d0();
        } else {
            b0Var = new b0();
        }
        f23414b = b0Var.b().f23423a.a().f23423a.b().f23423a.c();
    }

    public n0(q0 q0Var) {
        this.f23415a = q0Var;
    }

    public q0 a() {
        return this.f23415a;
    }

    public q0 b() {
        return this.f23415a;
    }

    public q0 c() {
        return this.f23415a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        if (p() == n0Var.p() && o() == n0Var.o() && Objects.equals(l(), n0Var.l()) && Objects.equals(j(), n0Var.j()) && Objects.equals(f(), n0Var.f())) {
            return true;
        }
        return false;
    }

    public c f() {
        return null;
    }

    public j3.c g(int i) {
        return j3.c.e;
    }

    public j3.c h(int i) {
        if ((i & 8) == 0) {
            return j3.c.e;
        }
        x.n("Unable to query the maximum insets for IME");
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public j3.c i() {
        return l();
    }

    public j3.c j() {
        return j3.c.e;
    }

    public j3.c k() {
        return l();
    }

    public j3.c l() {
        return j3.c.e;
    }

    public j3.c m() {
        return l();
    }

    public q0 n(int i, int i10, int i11, int i12) {
        return f23414b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void e(q0 q0Var) {
    }

    public void r(j3.c[] cVarArr) {
    }

    public void s(j3.c cVar) {
    }

    public void t(q0 q0Var) {
    }

    public void u(j3.c cVar) {
    }

    public void v(int i) {
    }
}
