package r0;
import l.a;

/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f24320a;

    public p1(df.a aVar) {
        this.f24320a = new u0(aVar);
    }

    public abstract k9.z a(Object obj);

    public q2 b() {
        return this.f24320a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final q2 c(k9.z zVar, q2 q2Var) {
        k0 k0Var = null;
        if (q2Var instanceof k0) {
            if (zVar.f19732b) {
                k0Var = (k0) q2Var;
                k0Var.f24275a.setValue(zVar.a());
            }
        } else if (q2Var instanceof p2) {
            if ((zVar.f19731a || zVar.f19735f != null) && !zVar.f19732b) {
                p2 p2Var = (p2) q2Var;
                if (kotlin.jvm.internal.a(zVar.a(), p2Var.f24321a)) {
                    k0Var = p2Var;
                }
            }
        } else if (q2Var instanceof d0) {
            zVar.getClass();
        }
        if (k0Var == null) {
            if (zVar.f19732b) {
                Object obj = zVar.f19735f;
                v0 v0Var = (v0) zVar.e;
                if (v0Var == null) {
                    v0Var = v0.f24421z;
                }
                return new k0(new i1(obj, v0Var));
            }
            return new p2(zVar.a());
        }
        return k0Var;
    }
}
