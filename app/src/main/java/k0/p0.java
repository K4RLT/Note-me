package k0;
import j1.b;
import q.n;

import r0.n2;

/* loaded from: classes.dex */
public final class p0 extends kotlin.jvm.internal.m implements df.a {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f19388u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ n2 f19389v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(n2 n2Var, int i) {
        super(0);
        this.f19388u = i;
        this.f19389v = n2Var;
    }

    @Override // df.a
    public final Object invoke() {
        int i = this.f19388u;
        boolean z3 = false;
        n2 n2Var = this.f19389v;
        switch (i) {
            case 0:
                return new b(((b) n2Var.getValue()).f18762a);
            case 1:
                n nVar = q0.f19395a;
                return new b(((b) n2Var.getValue()).f18762a);
            case 2:
                if (((Number) n2Var.getValue()).floatValue() > 0.0f) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            default:
                if (((Number) n2Var.getValue()).floatValue() > 0.0f) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
        }
    }
}
