package xa;
import x.o;
import p.a;
import q.x;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q1 extends i0 {

    /* renamed from: c, reason: collision with root package name */
    public static final p1 f30505c = new p1(new q1(2, 0), 0);

    /* renamed from: d, reason: collision with root package name */
    public static final r1 f30506d = new r1(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30507a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30508b;

    public /* synthetic */ q1(int i, int i10) {
        this.f30507a = i10;
        this.f30508b = i;
    }

    @Override // xa.i0
    public final Object a(l2 l2Var) {
        Object arrayList;
        String str;
        Serializable arrayList2;
        Serializable serializable;
        switch (this.f30507a) {
            case 0:
                int c02 = l2Var.c0();
                int i = c02 - 1;
                if (i != 5 && i != 6) {
                    if (i == 8) {
                        l2Var.Y();
                        return null;
                    }
                    throw new ab.b(a.l("Expecting number, got: ", u0.c(c02), "; at path ", l2Var.h0(false)), 21);
                }
                if (this.f30508b - 1 != 0) {
                    return new w0(l2Var.O());
                }
                return Double.valueOf(l2Var.B());
            default:
                int c03 = l2Var.c0();
                int i10 = c03 - 1;
                if (i10 != 0) {
                    if (i10 != 2) {
                        arrayList = null;
                    } else {
                        l2Var.V();
                        arrayList = new b1(true);
                    }
                } else {
                    l2Var.R();
                    arrayList = new ArrayList();
                }
                if (arrayList == null) {
                    return c(l2Var, c03);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (l2Var.a0()) {
                        if (arrayList instanceof Map) {
                            str = l2Var.N();
                        } else {
                            str = null;
                        }
                        int c04 = l2Var.c0();
                        int i11 = c04 - 1;
                        if (i11 != 0) {
                            if (i11 != 2) {
                                arrayList2 = null;
                            } else {
                                l2Var.V();
                                arrayList2 = new b1(true);
                            }
                        } else {
                            l2Var.R();
                            arrayList2 = new ArrayList();
                        }
                        if (arrayList2 == null) {
                            serializable = c(l2Var, c04);
                        } else {
                            serializable = arrayList2;
                        }
                        if (arrayList instanceof List) {
                            ((List) arrayList).add(serializable);
                        } else {
                            ((Map) arrayList).put(str, serializable);
                        }
                        if (arrayList2 != null) {
                            arrayDeque.addLast(arrayList);
                            arrayList = serializable;
                        }
                    } else {
                        if (arrayList instanceof List) {
                            l2Var.W();
                        } else {
                            l2Var.X();
                        }
                        if (arrayDeque.isEmpty()) {
                            return arrayList;
                        }
                        arrayList = arrayDeque.removeLast();
                    }
                }
        }
    }

    public Serializable c(l2 l2Var, int i) {
        int i10 = i - 1;
        if (i10 != 5) {
            if (i10 != 6) {
                if (i10 != 7) {
                    if (i10 == 8) {
                        l2Var.Y();
                        return null;
                    }
                    x.o("Unexpected token: ".concat(u0.c(i)));
                    return null;
                }
                return Boolean.valueOf(l2Var.b0());
            }
            if (this.f30508b - 1 != 0) {
                return new w0(l2Var.O());
            }
            return Double.valueOf(l2Var.B());
        }
        return l2Var.O();
    }
}
