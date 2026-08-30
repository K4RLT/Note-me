package ya;
import j6.n;
import q.x;
import r0.m;
import u7.u2;
import w4.b;

/* loaded from: classes.dex */
public abstract class md {
    public static final androidx.lifecycle.u0 a(kotlin.jvm.internal.e eVar, androidx.lifecycle.z0 z0Var, u2 u2Var, b bVar, m mVar) {
        androidx.lifecycle.y0 d2 = z0Var.d();
        d2.getClass();
        bVar.getClass();
        n nVar = new n(d2, u2Var, bVar);
        String b10 = eVar.b();
        if (b10 != null) {
            return nVar.j(eVar, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10));
        }
        x.n("Local and anonymous classes can not be ViewModels");
        return null;
    }
}
