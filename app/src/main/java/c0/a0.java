package c0;
import l.a;
import z.i;
import z.j;
import z.m;

import java.util.Collection;
import t.f1;
import t.s1;
import wa.b9;
import ya.ye;

/* loaded from: classes.dex */
public final class a0 implements f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f1 f3281b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f3282c;

    public /* synthetic */ a0(f1 f1Var, s1 s1Var, int i) {
        this.f3280a = i;
        this.f3282c = s1Var;
        this.f3281b = f1Var;
    }

    @Override // f1
    public final float a(float f10) {
        switch (this.f3280a) {
            case 0:
                return this.f3281b.a(f10);
            default:
                return this.f3281b.a(f10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    public final int b(int i) {
        Object obj;
        switch (this.f3280a) {
            case 0:
                i0 i0Var = (i0) this.f3282c;
                return (int) (b9.f(wa.a(i0Var) + ff.a.b(((i0Var.o() * (i - i0Var.j())) - (i0Var.k() * i0Var.o())) + 0), i0Var.f3338h, i0Var.f3337g) - wa.a(i0Var));
            default:
                m mVar = (m) this.f3282c;
                i i10 = mVar.i();
                if (i10.f31697k.isEmpty()) {
                    return 0;
                }
                int g8 = mVar.g();
                if (i <= e() && g8 <= i) {
                    Object r02 = i10.f31697k;
                    int size = ((Collection) r02).size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size) {
                            obj = r02.get(i11);
                            if (((j) obj).f31704a != i) {
                                i11++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    j jVar = (j) obj;
                    if (jVar == null) {
                        return 0;
                    }
                    return jVar.f31713l;
                }
                return ((i - mVar.g()) * ye.a(i10)) - mVar.h();
        }
    }

    public final int c() {
        switch (this.f3280a) {
            case 0:
                return ((i0) this.f3282c).e;
            default:
                return ((m) this.f3282c).g();
        }
    }

    public final int d() {
        switch (this.f3280a) {
            case 0:
                return ((i0) this.f3282c).f3336f;
            default:
                return ((m) this.f3282c).h();
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List, java.lang.Object] */
    public final int e() {
        switch (this.f3280a) {
            case 0:
                return ((j) qe.l.C(((i0) this.f3282c).l().f3419a)).f3356a;
            default:
                j jVar = (j) qe.l.D(((m) this.f3282c).i().f31697k);
                if (jVar != null) {
                    return jVar.f31704a;
                }
                return 0;
        }
    }

    public final void f(int i) {
        switch (this.f3280a) {
            case 0:
                ((i0) this.f3282c).t(i, 0 / r1.o(), true);
                return;
            default:
                ((m) this.f3282c).l(i);
                return;
        }
    }
}