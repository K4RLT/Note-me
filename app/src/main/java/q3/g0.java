package q3;
import c.a;

import ya.ea;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final q0 f23394a;

    /* renamed from: b, reason: collision with root package name */
    public j3.c[] f23395b;

    public g0() {
        this(new q0((q0) null));
    }

    public final void a() {
        j3.c[] cVarArr = this.f23395b;
        if (cVarArr != null) {
            j3.c cVar = cVarArr[0];
            j3.c cVar2 = cVarArr[1];
            q0 q0Var = this.f23394a;
            if (cVar2 == null) {
                cVar2 = q0Var.f23423a.g(2);
            }
            if (cVar == null) {
                cVar = q0Var.f23423a.g(1);
            }
            g(j3.a(cVar, cVar2));
            j3.c cVar3 = this.f23395b[ea.a(16)];
            if (cVar3 != null) {
                f(cVar3);
            }
            j3.c cVar4 = this.f23395b[ea.a(32)];
            if (cVar4 != null) {
                d(cVar4);
            }
            j3.c cVar5 = this.f23395b[ea.a(64)];
            if (cVar5 != null) {
                h(cVar5);
            }
        }
    }

    public abstract q0 b();

    public void c(int i, j3.c cVar) {
        if (this.f23395b == null) {
            this.f23395b = new j3.c[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i & i10) != 0) {
                this.f23395b[ea.a(i10)] = cVar;
            }
        }
    }

    public abstract void e(j3.c cVar);

    public abstract void g(j3.c cVar);

    public g0(q0 q0Var) {
        this.f23394a = q0Var;
    }

    public void d(j3.c cVar) {
    }

    public void f(j3.c cVar) {
    }

    public void h(j3.c cVar) {
    }
}
