package wa;
import s.e;
import c1.a;
import c1.i;
import n.d0;
import n.w;
import r0.a2;
import r0.e2;
import r0.o;
import r0.s;
import r0.u;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [i, a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [a] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Integer] */
    public static final List a(e2 e2Var, Integer num, int i, Integer num2) {
        int i10;
        int i11;
        d0 d0Var;
        if (!e2Var.f24237w && e2Var.p() != 0) {
            i iVar = new i(e2Var);
            if (num2 != null) {
                i10 = num2.intValue();
            } else {
                i10 = e2Var.f24236v;
                if (i10 < 0) {
                    i10 = e2Var.D(i, e2Var.f24218b);
                }
            }
            if (num == 0) {
                int M = e2Var.i - e2Var.M(e2Var.r(i), e2Var.f24218b);
                w wVar = e2Var.f24233s;
                if (wVar != null && (d0Var = (d0) wVar.b(i)) != null) {
                    i11 = d0Var.f20856b;
                } else {
                    i11 = 0;
                }
                num = Integer.valueOf(M + i11);
            }
            while (i >= 0) {
                iVar.m(e2Var.N(i), num);
                num = e2Var.b(i);
                if (i10 >= 0) {
                    int i12 = i10;
                    i10 = e2Var.D(i10, e2Var.f24218b);
                    i = i12;
                } else {
                    i = i10;
                }
            }
            return (ArrayList) iVar.f3443v;
        }
        return qe.s.f24023u;
    }

    public static final Integer b(a2 a2Var, u uVar, int i, int i10) {
        Integer b10;
        int[] iArr = a2Var.f24179b;
        while (true) {
            o oVar = null;
            if (i >= i10) {
                return null;
            }
            int i11 = iArr[(i * 5) + 3] + i;
            if (a2Var.j(i) && a2Var.i(i) == 206 && kotlin.jvm.internal.a(a2Var.p(i, iArr), s.e)) {
                Object h3 = a2Var.h(i, 0);
                if (h3 instanceof o) {
                    oVar = (o) h3;
                }
                if (oVar != null && oVar.f24307u.equals(uVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (a2Var.d(i) && (b10 = b(a2Var, uVar, i + 1, i11)) != null) {
                return Integer.valueOf(b10.intValue());
            }
            i = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [i, a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    public static final ArrayList c(a2 a2Var, int i, Integer num) {
        i iVar = new i(a2Var);
        int q10 = a2Var.q(i);
        a a10 = a2Var.a(i);
        while (i >= 0) {
            iVar.m(a2Var.f24178a.o(i), num);
            if (q10 >= 0) {
                a aVar = a10;
                a10 = a2Var.a(q10);
                i = q10;
                q10 = a2Var.q(q10);
                num = aVar;
            } else {
                i = q10;
                num = a10;
            }
        }
        return (ArrayList) iVar.f3443v;
    }
}