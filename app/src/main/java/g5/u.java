package g5;
import a0.j0;
import a0.o;
import b0.x;
import r.b0;
import r.c0;
import v.d;
import v.e;
import v.h;
import v.i;

import b2.k1;
import wa.z6;

/* loaded from: classes.dex */
public final /* synthetic */ class u extends kotlin.jvm.internal.j implements df.p {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f17534u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i, i10, cls, obj, str, str2);
        this.f17534u = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.jvm.internal.y] */
    /* JADX WARN: Type inference failed for: r5v17, types: [h, java.lang.Object, d] */
    @Override // df.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z3;
        boolean b10;
        c0 c12;
        switch (this.f17534u) {
            case 0:
                return z6.a((v) this.receiver, (df.l) obj, (te.c) obj2);
            case 1:
                return z6.a((v) this.receiver, (df.l) obj, (te.c) obj2);
            case 2:
                cg.d dVar = (cg.d) obj;
                int intValue = ((Number) obj2).intValue();
                dVar.getClass();
                gg.j jVar = (gg.j) this.receiver;
                jVar.getClass();
                if (!dVar.j(intValue) && dVar.i(intValue).c()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                jVar.f17772b = z3;
                return Boolean.valueOf(z3);
            default:
                i1.r rVar = (i1.r) obj;
                i1.r rVar2 = (i1.r) obj2;
                b0 b0Var = (b0) this.receiver;
                if (b0Var.H && (b10 = rVar2.b()) != rVar.b()) {
                    df.l lVar = b0Var.L;
                    if (lVar != null) {
                        lVar.invoke(Boolean.valueOf(b10));
                    }
                    te.c cVar = null;
                    if (b10) {
                        pf.x(b0Var.M0(), null, new j0(b0Var, cVar, 15), 3);
                        Object obj3 = new Object();
                        b2.l.q(b0Var, new o((Object) obj3, 20, b0Var));
                        j0 j0Var = (j0) obj3.f19787u;
                        if (j0Var != null) {
                            j0Var.a();
                        } else {
                            j0Var = null;
                        }
                        b0Var.N = j0Var;
                        k1 k1Var = b0Var.O;
                        if (k1Var != null && k1Var.h1().H && (c12 = b0Var.c1()) != null) {
                            c12.Y0(b0Var.O);
                        }
                    } else {
                        j0 j0Var2 = b0Var.N;
                        if (j0Var2 != null) {
                            j0Var2.b();
                        }
                        b0Var.N = null;
                        c0 c13 = b0Var.c1();
                        if (c13 != null) {
                            c13.Y0(null);
                        }
                    }
                    b2.l.m(b0Var);
                    i iVar = b0Var.K;
                    if (iVar != null) {
                        d dVar2 = b0Var.M;
                        if (b10) {
                            if (dVar2 != null) {
                                b0Var.b1(iVar, new e(dVar2));
                                b0Var.M = null;
                            }
                            Object obj4 = new Object();
                            b0Var.b1(iVar, obj4);
                            b0Var.M = obj4;
                        } else if (dVar2 != null) {
                            b0Var.b1(iVar, new e(dVar2));
                            b0Var.M = null;
                        }
                    }
                }
                return pe.z.f22715a;
        }
    }
}