package z1;
import a.a;
import b0.h1;
import d1.q;
import l.b;
import l.e;
import n.m;
import n.x;

import b2.i2;
import b2.j2;

/* loaded from: classes.dex */
public final class i0 implements i1 {

    /* renamed from: a, reason: collision with root package name */
    public final x f31821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f31822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f31823c;

    public i0(j0 j0Var, Object obj) {
        this.f31822b = j0Var;
        this.f31823c = obj;
        int[] iArr = m.f20915a;
        this.f31821a = new x();
    }

    @Override // z1.i1
    public final void a() {
        j0 j0Var = this.f31822b;
        b2.i0 i0Var = j0Var.f31828u;
        j0Var.d();
        b2.i0 i0Var2 = (b2.i0) j0Var.D.k(this.f31823c);
        if (i0Var2 != null) {
            if (j0Var.I <= 0) {
                y1.a.b("No pre-composed items to dispose");
            }
            int l10 = ((b) i0Var.o()).f25611u.l(i0Var2);
            if (l10 < ((b) i0Var.o()).f25611u.f25619w - j0Var.I) {
                y1.a.b("Item is not in pre-composed item range");
            }
            j0Var.H++;
            j0Var.I--;
            c0 c0Var = (c0) j0Var.f31833z.g(i0Var2);
            if (c0Var != null) {
                c0Var.getClass();
            }
            int i = (((b) i0Var.o()).f25611u.f25619w - j0Var.I) - j0Var.H;
            i0Var.K = true;
            i0Var.M(l10, i, 1);
            i0Var.K = false;
            j0Var.c(i);
        }
    }

    @Override // z1.i1
    public final int b() {
        b2.i0 i0Var = (b2.i0) this.f31822b.D.g(this.f31823c);
        if (i0Var != null) {
            return ((b) i0Var.n()).f25611u.f25619w;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [h1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [q] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // z1.i1
    public final void c(h1 h1Var) {
        b2.f1 f1Var;
        q qVar;
        i2 i2Var;
        b2.i0 i0Var = (b2.i0) this.f31822b.D.g(this.f31823c);
        if (i0Var != null && (f1Var = i0Var.Z) != null && (qVar = (q) f1Var.A) != null) {
            if (!qVar.f15688u.H) {
                y1.a.b("visitSubtreeIf called on an unattached node");
            }
            e eVar = new e(new q[16]);
            q qVar2 = qVar.f15688u;
            q qVar3 = qVar2.f15693z;
            if (qVar3 == null) {
                b2.b(eVar, qVar2);
            } else {
                eVar.b(qVar3);
            }
            while (true) {
                int i = eVar.f25619w;
                if (i != 0) {
                    q qVar4 = (q) eVar.n(i - 1);
                    if ((qVar4.f15691x & 262144) != 0) {
                        for (q qVar5 = qVar4; qVar5 != null; qVar5 = qVar5.f15693z) {
                            if ((qVar5.f15690w & 262144) != 0) {
                                b2.k kVar = qVar5;
                                Object r72 = 0;
                                while (kVar != 0) {
                                    if (kVar instanceof j2) {
                                        j2 j2Var = (j2) kVar;
                                        boolean equals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(j2Var.j());
                                        i2 i2Var2 = i2.f1502v;
                                        if (equals) {
                                            h1Var.invoke(j2Var);
                                            i2Var = i2Var2;
                                        } else {
                                            i2Var = i2.f1501u;
                                        }
                                        if (i2Var != i2.f1503w) {
                                            if (i2Var == i2Var2) {
                                                break;
                                            }
                                        } else {
                                            return;
                                        }
                                    } else if ((kVar.f15690w & 262144) != 0 && (kVar instanceof b2.k)) {
                                        q qVar6 = kVar.J;
                                        int i10 = 0;
                                        kVar = kVar;
                                        r72 = r72;
                                        while (qVar6 != null) {
                                            if ((qVar6.f15690w & 262144) != 0) {
                                                i10++;
                                                r72 = r72;
                                                if (i10 == 1) {
                                                    kVar = qVar6;
                                                } else {
                                                    if (r72 == 0) {
                                                        r72 = new e(new q[16]);
                                                    }
                                                    if (kVar != 0) {
                                                        r72.b(kVar);
                                                        kVar = 0;
                                                    }
                                                    r72.b(qVar6);
                                                }
                                            }
                                            qVar6 = qVar6.f15693z;
                                            kVar = kVar;
                                            r72 = r72;
                                        }
                                        if (i10 == 1) {
                                        }
                                    }
                                    kVar = b2.e(r72);
                                }
                            }
                        }
                    }
                    b2.b(eVar, qVar4);
                } else {
                    return;
                }
            }
        }
    }

    @Override // z1.i1
    public final void d(int i, long j10) {
        j0 j0Var = this.f31822b;
        b2.i0 i0Var = (b2.i0) j0Var.D.g(this.f31823c);
        if (i0Var != null && i0Var.I()) {
            int i10 = ((b) i0Var.n()).f25611u.f25619w;
            if (i < 0 || i >= i10) {
                y1.a.d("Index (" + i + ") is out of bound of [0, " + i10 + ')');
            }
            if (i0Var.J()) {
                y1.a("Pre-measure called on node that is not placed");
            }
            b2.i0 i0Var2 = j0Var.f31828u;
            i0Var2.K = true;
            ((c2.x) b2.m0.a(i0Var)).w((b2.i0) ((b) i0Var.n()).get(i), j10);
            i0Var2.K = false;
            this.f31821a.a(i);
        }
    }
}