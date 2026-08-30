package g0;
import m2.g;
import w.a;

/* loaded from: classes.dex */
public abstract class l2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ba.r f17199a = new ba.r(r2.p.f24501a, 0, 0);

    public static final r2.c0 a(r2.e0 e0Var, g gVar) {
        r2.c0 g8 = e0Var.g(gVar);
        int length = gVar.f20477v.length();
        g gVar2 = g8.f24483a;
        r2.q qVar = g8.f24484b;
        int length2 = gVar2.f20477v.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            b(qVar.g(i), length2, i);
        }
        b(qVar.g(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i10 = 0; i10 < min2; i10++) {
            c(qVar.c(i10), length, i10);
        }
        c(qVar.c(length2), length, length2);
        return new r2.c0(gVar2, new ba.r(qVar, gVar.f20477v.length(), gVar2.f20477v.length()));
    }

    public static final void b(int i, int i10, int i11) {
        boolean z3 = false;
        if (i >= 0 && i <= i10) {
            z3 = true;
        }
        if (!z3) {
            StringBuilder n10 = g3.a.n("OffsetMapping.originalToTransformed returned invalid mapping: ", i11, " -> ", " is not in range of transformed text [0, ", i);
            n10.append(i10);
            n10.append(']');
            a.c(n10.toString());
        }
    }

    public static final void c(int i, int i10, int i11) {
        boolean z3 = false;
        if (i >= 0 && i <= i10) {
            z3 = true;
        }
        if (!z3) {
            StringBuilder n10 = g3.a.n("OffsetMapping.transformedToOriginal returned invalid mapping: ", i11, " -> ", " is not in range of original text [0, ", i);
            n10.append(i10);
            n10.append(']');
            a.c(n10.toString());
        }
    }
}
