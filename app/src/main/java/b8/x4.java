package b8;
import c0.d;
import l.a;
import n.c0;
import n.i0;
import r0.e1;
import r0.g0;
import r0.q1;
import r0.t;
import r0.x;

import ya.gc;

/* loaded from: classes.dex */
public final /* synthetic */ class x4 implements df.l {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2970u = 0;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2971v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f2972w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f2973x;

    public /* synthetic */ x4(int i, d dVar, e1 e1Var) {
        this.f2971v = i;
        this.f2972w = dVar;
        this.f2973x = e1Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        t tVar;
        long[] jArr;
        t tVar2;
        long[] jArr2;
        int i;
        boolean z3;
        switch (this.f2970u) {
            case 0:
                d dVar = (d) this.f2972w;
                e1 e1Var = (e1) this.f2973x;
                float floatValue = ((Float) obj).floatValue();
                if (this.f2971v == dVar.j()) {
                    e1Var.i(floatValue);
                }
                return pe.z.f22715a;
            default:
                q1 q1Var = (q1) this.f2972w;
                c0 c0Var = (c0) this.f2973x;
                t tVar3 = (t) obj;
                int i10 = q1Var.e;
                int i11 = this.f2971v;
                if (i10 == i11 && kotlin.jvm.internal.a(c0Var, q1Var.f24333f) && (tVar3 instanceof x)) {
                    long[] jArr3 = c0Var.f20849a;
                    int length = jArr3.length - 2;
                    if (length >= 0) {
                        int i12 = 0;
                        while (true) {
                            long j10 = jArr3[i12];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i13 = 8;
                                int i14 = 8 - ((~(i12 - length)) >>> 31);
                                int i15 = 0;
                                while (i15 < i14) {
                                    if ((255 & j10) < 128) {
                                        int i16 = (i12 << 3) + i15;
                                        Object obj2 = c0Var.f20850b[i16];
                                        if (c0Var.f20851c[i16] != i11) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            i = i13;
                                            x xVar = (x) tVar3;
                                            tVar2 = tVar3;
                                            i0 i0Var = xVar.A;
                                            gc.c(i0Var, obj2, q1Var);
                                            jArr2 = jArr3;
                                            if (obj2 instanceof g0) {
                                                g0 g0Var = (g0) obj2;
                                                if (!i0Var.c(g0Var)) {
                                                    gc.d(xVar.D, g0Var);
                                                }
                                                i0 i0Var2 = q1Var.f24334g;
                                                if (i0Var2 != null) {
                                                    i0Var2.k(obj2);
                                                }
                                            }
                                        } else {
                                            tVar2 = tVar3;
                                            jArr2 = jArr3;
                                            i = i13;
                                        }
                                        if (z3) {
                                            c0Var.g(i16);
                                        }
                                    } else {
                                        tVar2 = tVar3;
                                        jArr2 = jArr3;
                                        i = i13;
                                    }
                                    j10 >>= i;
                                    i15++;
                                    i13 = i;
                                    tVar3 = tVar2;
                                    jArr3 = jArr2;
                                }
                                tVar = tVar3;
                                jArr = jArr3;
                                if (i14 != i13) {
                                }
                            } else {
                                tVar = tVar3;
                                jArr = jArr3;
                            }
                            if (i12 != length) {
                                i12++;
                                tVar3 = tVar;
                                jArr3 = jArr;
                            }
                        }
                    }
                }
                return pe.z.f22715a;
        }
    }

    public /* synthetic */ x4(q1 q1Var, int i, c0 c0Var) {
        this.f2972w = q1Var;
        this.f2971v = i;
        this.f2973x = c0Var;
    }
}
