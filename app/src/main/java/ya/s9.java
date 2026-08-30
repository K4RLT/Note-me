package ya;
import k1.h;
import k1.i0;
import l4.a;
import q1.i;
import q1.j;
import q1.k;
import q1.l;
import q1.m;
import q1.n;
import q1.o;
import q1.p;
import q1.q;
import q1.r;
import q1.s;
import q1.t;
import q1.u;

import android.graphics.Path;
import java.util.List;

/* loaded from: classes.dex */
public abstract class s9 {
    public static final void a(List list, i0 i0Var) {
        int i;
        u uVar;
        Path path;
        float f10;
        u uVar2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        h hVar = (h) i0Var;
        Path path2 = hVar.f19481a;
        Path path3 = hVar.f19481a;
        if (path2.getFillType() == Path.FillType.EVEN_ODD) {
            i = 1;
        } else {
            i = 0;
        }
        path3.rewind();
        hVar.l(i);
        if (list.isEmpty()) {
            uVar = i.f23278b;
        } else {
            uVar = (u) list.get(0);
        }
        int size = list.size();
        float f22 = 0.0f;
        int i10 = 0;
        float f23 = 0.0f;
        float f24 = 0.0f;
        float f25 = 0.0f;
        float f26 = 0.0f;
        float f27 = 0.0f;
        float f28 = 0.0f;
        while (i10 < size) {
            u uVar3 = (u) list.get(i10);
            if (uVar3 instanceof i) {
                hVar.d();
                path = path3;
                uVar2 = uVar3;
                f24 = f26;
                f28 = f24;
                f23 = f27;
                f25 = f23;
            } else if (uVar3 instanceof m) {
                m mVar = (m) uVar3;
                f26 = mVar.f23287b;
                f27 = mVar.f23288c;
                hVar.h(f26, f27);
                path = path3;
                uVar2 = uVar3;
                f28 = f26;
                f23 = f27;
            } else {
                if (uVar3 instanceof q) {
                    q qVar = (q) uVar3;
                    float f29 = qVar.f23299c;
                    float f30 = qVar.f23298b;
                    path3.rLineTo(f30, f29);
                    f28 += f30;
                    f23 += f29;
                } else {
                    if (uVar3 instanceof l) {
                        l lVar = (l) uVar3;
                        f23 = lVar.f23286c;
                        f21 = lVar.f23285b;
                        hVar.g(f21, f23);
                    } else if (uVar3 instanceof p) {
                        float f31 = ((p) uVar3).f23297b;
                        path3.rLineTo(f31, f22);
                        f28 += f31;
                    } else if (uVar3 instanceof k) {
                        f21 = ((k) uVar3).f23284b;
                        hVar.g(f21, f23);
                    } else if (uVar3 instanceof s) {
                        float f32 = ((s) uVar3).f23303b;
                        path3.rLineTo(f22, f32);
                        f23 += f32;
                    } else if (uVar3 instanceof t) {
                        float f33 = ((t) uVar3).f23304b;
                        hVar.g(f28, f33);
                        f23 = f33;
                    } else {
                        if (uVar3 instanceof o) {
                            o oVar = (o) uVar3;
                            f10 = f23;
                            uVar2 = uVar3;
                            path3.rCubicTo(oVar.f23292b, oVar.f23293c, oVar.f23294d, oVar.e, oVar.f23295f, oVar.f23296g);
                            path = path3;
                            f18 = oVar.f23294d + f28;
                            f19 = f10 + oVar.e;
                            f28 += oVar.f23295f;
                            f20 = oVar.f23296g;
                        } else {
                            path = path3;
                            f10 = f23;
                            uVar2 = uVar3;
                            if (uVar2 instanceof j) {
                                j jVar = (j) uVar2;
                                hVar.e(jVar.f23279b, jVar.f23280c, jVar.f23281d, jVar.e, jVar.f23282f, jVar.f23283g);
                                f12 = jVar.f23281d;
                                f13 = jVar.e;
                                f14 = jVar.f23282f;
                                f15 = jVar.f23283g;
                            } else if (uVar2 instanceof r) {
                                if (uVar.f23305a) {
                                    float f34 = f28 - f24;
                                    f17 = f10 - f25;
                                    f16 = f34;
                                } else {
                                    f16 = 0.0f;
                                    f17 = 0.0f;
                                }
                                r rVar = (r) uVar2;
                                path.rCubicTo(f16, f17, rVar.f23300b, rVar.f23301c, rVar.f23302d, rVar.e);
                                path = path;
                                f18 = rVar.f23300b + f28;
                                f19 = f10 + rVar.f23301c;
                                f28 += rVar.f23302d;
                                f20 = rVar.e;
                            } else if (uVar2 instanceof n) {
                                if (uVar.f23305a) {
                                    float f35 = 2;
                                    f28 = (f28 * f35) - f24;
                                    f11 = (f35 * f10) - f25;
                                } else {
                                    f11 = f10;
                                }
                                n nVar = (n) uVar2;
                                hVar.e(f28, f11, nVar.f23289b, nVar.f23290c, nVar.f23291d, nVar.e);
                                f12 = nVar.f23289b;
                                f13 = nVar.f23290c;
                                f14 = nVar.f23291d;
                                f15 = nVar.e;
                            } else {
                                a.o();
                                return;
                            }
                            f25 = f13;
                            f28 = f14;
                            f23 = f15;
                            f24 = f12;
                        }
                        f24 = f18;
                        f25 = f19;
                        f23 = f10 + f20;
                    }
                    f28 = f21;
                }
                path = path3;
                uVar2 = uVar3;
            }
            i10++;
            path3 = path;
            uVar = uVar2;
            f22 = 0.0f;
        }
    }
}
