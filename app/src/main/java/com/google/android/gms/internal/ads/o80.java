package com.google.android.gms.internal.ads;
import a9.d;
import q.x;
import q4.b;

import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o80 {

    /* renamed from: a, reason: collision with root package name */
    public Object f9020a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public Object f9021b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public Object f9022c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public Object f9023d = new HashSet();
    public Object e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public Object f9024f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public Object f9025g = new HashSet();

    /* renamed from: h, reason: collision with root package name */
    public Object f9026h = new HashSet();
    public Object i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public Object f9027j = new HashSet();

    /* renamed from: k, reason: collision with root package name */
    public Object f9028k = new HashSet();

    /* renamed from: l, reason: collision with root package name */
    public Object f9029l = new HashSet();

    /* renamed from: m, reason: collision with root package name */
    public Object f9030m = new HashSet();

    /* renamed from: n, reason: collision with root package name */
    public Object f9031n = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public Object f9032o;

    public void a() {
        b bVar = (b) this.f9020a;
        b bVar2 = (b) this.e;
        b bVar3 = (b) this.f9025g;
        bVar2.a(bVar, bVar3);
        this.f9020a = bVar3;
        this.f9025g = bVar;
        b bVar4 = (b) this.e;
        b bVar5 = (b) this.f9021b;
        b bVar6 = (b) this.f9026h;
        bVar4.a(bVar5, bVar6);
        bVar6.b((b) this.e, bVar5);
        bVar5.e((b) this.f9022c);
    }

    public void b(b bVar) {
        double d2;
        b bVar2 = (b) this.f9027j;
        b bVar3 = (b) this.f9024f;
        b bVar4 = (b) this.f9020a;
        b bVar5 = (b) this.f9029l;
        bVar3.a(bVar4, bVar5);
        bVar.d(bVar5);
        b bVar6 = (b) this.f9024f;
        b bVar7 = (b) this.f9021b;
        b bVar8 = (b) this.f9030m;
        bVar6.a(bVar7, bVar8);
        b bVar9 = (b) this.f9024f;
        b bVar10 = (b) this.f9031n;
        bVar8.b(bVar9, bVar10);
        bVar10.e((b) this.f9023d);
        b bVar11 = (b) this.f9032o;
        int i = bVar10.f23449a;
        int i10 = bVar10.f23450b;
        if (i == i10) {
            int i11 = bVar11.f23449a;
            int i12 = bVar11.f23450b;
            if (i11 == i && i12 == i10 * 2) {
                for (int i13 = 0; i13 < i; i13++) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        bVar11.f(i13, i14, bVar10.c(i13, i14));
                        int i15 = i10 + i14;
                        if (i13 == i14) {
                            d2 = 1.0d;
                        } else {
                            d2 = 0.0d;
                        }
                        bVar11.f(i13, i15, d2);
                    }
                }
                double d10 = 0.0d;
                int i16 = 0;
                while (i16 < i) {
                    double abs = Math.abs(bVar11.c(i16, i16));
                    int i17 = i16 + 1;
                    int i18 = i16;
                    for (int i19 = i17; i19 < i; i19++) {
                        double abs2 = Math.abs(bVar11.c(i19, i16));
                        if (abs2 > abs) {
                            i18 = i19;
                            abs = abs2;
                        }
                    }
                    if (i18 != i16) {
                        int i20 = 0;
                        while (i20 < i12) {
                            double c10 = bVar11.c(i16, i20);
                            bVar11.f(i16, i20, bVar11.c(i18, i20));
                            bVar11.f(i18, i20, c10);
                            i20++;
                            i17 = i17;
                            d10 = d10;
                        }
                    }
                    double d11 = d10;
                    int i21 = i17;
                    double c11 = bVar11.c(i16, i16);
                    if (c11 != d11) {
                        for (int i22 = 0; i22 < i12; i22++) {
                            bVar11.f(i16, i22, bVar11.c(i16, i22) / c11);
                        }
                        for (int i23 = i21; i23 < i; i23++) {
                            double c12 = bVar11.c(i23, i16);
                            for (int i24 = 0; i24 < i12; i24++) {
                                bVar11.f(i23, i24, bVar11.c(i23, i24) - (bVar11.c(i16, i24) * c12));
                            }
                        }
                        i16 = i21;
                        d10 = d11;
                    } else {
                        throw new ArithmeticException("Singular matrix");
                    }
                }
                for (int i25 = i - 1; i25 >= 0; i25--) {
                    for (int i26 = 0; i26 < i25; i26++) {
                        double c13 = bVar11.c(i26, i25);
                        for (int i27 = 0; i27 < i12; i27++) {
                            bVar11.f(i26, i27, bVar11.c(i26, i27) - (bVar11.c(i25, i27) * c13));
                        }
                    }
                }
                for (int i28 = 0; i28 < i; i28++) {
                    for (int i29 = 0; i29 < i10; i29++) {
                        bVar10.f(i28, i29, bVar11.c(i28, i10 + i29));
                    }
                }
                b bVar12 = (b) this.f9024f;
                b bVar13 = (b) this.f9028k;
                bVar7.b(bVar12, bVar13);
                bVar13.a(bVar10, bVar2);
                b bVar14 = (b) this.f9020a;
                b bVar15 = (b) this.f9025g;
                bVar2.a(bVar, bVar15);
                bVar14.e(bVar15);
                b bVar16 = (b) this.f9024f;
                b bVar17 = (b) this.f9026h;
                bVar2.a(bVar16, bVar17);
                b bVar18 = (b) this.i;
                bVar17.a(bVar7, bVar18);
                bVar7.d(bVar18);
                return;
            }
            Locale locale = Locale.ROOT;
            x.n("The scratch matrix size is not correct. this:".concat(bVar11.h()));
            return;
        }
        Locale locale2 = Locale.ROOT;
        x.n("The matrix is not square. this:".concat(bVar10.h()));
    }

    public void c(v60 v60Var, Executor executor) {
        ((HashSet) this.i).add(new c90(v60Var, executor));
    }

    public void d(d dVar, Executor executor) {
        ((HashSet) this.f9028k).add(new c90(dVar, executor));
    }

    public void e(f90 f90Var, Executor executor) {
        ((HashSet) this.f9023d).add(new c90(f90Var, executor));
    }

    public void f(a80 a80Var, Executor executor) {
        ((HashSet) this.f9021b).add(new c90(a80Var, executor));
    }
}
