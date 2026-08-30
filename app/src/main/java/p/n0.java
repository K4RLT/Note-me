package p;
import q.d1;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.m implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22215u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o0 f22216v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(o0 o0Var, int i) {
        super(1);
        this.f22215u = i;
        this.f22216v = o0Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        switch (this.f22215u) {
            case 0:
                d1 d1Var = (d1) obj;
                g0 g0Var = g0.f22152u;
                g0 g0Var2 = g0.f22153v;
                boolean b10 = d1Var.b(g0Var, g0Var2);
                Object obj2 = null;
                o0 o0Var = this.f22216v;
                if (b10) {
                    b0 b0Var = o0Var.M.f22224a.f22280c;
                    if (b0Var != null) {
                        obj2 = b0Var.f22104c;
                    }
                } else if (d1Var.b(g0Var2, g0.f22154w)) {
                    b0 b0Var2 = o0Var.N.f22233a.f22280c;
                    if (b0Var2 != null) {
                        obj2 = b0Var2.f22104c;
                    }
                } else {
                    obj2 = androidx.compose.animation.c.f428d;
                }
                if (obj2 == null) {
                    return androidx.compose.animation.c.f428d;
                }
                return obj2;
            default:
                d1 d1Var2 = (d1) obj;
                g0 g0Var3 = g0.f22152u;
                g0 g0Var4 = g0.f22153v;
                boolean b11 = d1Var2.b(g0Var3, g0Var4);
                o0 o0Var2 = this.f22216v;
                if (b11) {
                    t1 t1Var = o0Var2.M.f22224a.f22279b;
                    if (t1Var != null) {
                        return t1Var.f22261b;
                    }
                    return androidx.compose.animation.c.f427c;
                }
                if (d1Var2.b(g0Var4, g0.f22154w)) {
                    t1 t1Var2 = o0Var2.N.f22233a.f22279b;
                    if (t1Var2 != null) {
                        return t1Var2.f22261b;
                    }
                    return androidx.compose.animation.c.f427c;
                }
                return androidx.compose.animation.c.f427c;
        }
    }
}
