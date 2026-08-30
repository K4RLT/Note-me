package g0;
import a1.t;
import j1.c;
import m2.p0;
import r0.e1;
import r0.f1;
import r0.i1;
import r0.v0;
import t.z0;

import com.google.android.gms.internal.ads.x90;
import wa.b9;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: g, reason: collision with root package name */
    public static final x90 f17046g = t.b(c2.f17034u, l.H);

    /* renamed from: a, reason: collision with root package name */
    public final e1 f17047a;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f17048b = new e1(0.0f);

    /* renamed from: c, reason: collision with root package name */
    public final f1 f17049c = new f1(0);

    /* renamed from: d, reason: collision with root package name */
    public c f17050d = c.e;
    public long e = p0.f20544b;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f17051f;

    public d2(z0 z0Var, float f10) {
        this.f17047a = new e1(f10);
        this.f17051f = new i1(z0Var, v0.f24421z);
    }

    public final void a(z0 z0Var, c cVar, int i, int i10) {
        boolean z3;
        float f10;
        float f11;
        float f12 = i10 - i;
        this.f17048b.i(f12);
        float f13 = cVar.f18763a;
        float f14 = cVar.f18764b;
        c cVar2 = this.f17050d;
        float f15 = cVar2.f18763a;
        e1 e1Var = this.f17047a;
        if (f13 != f15 || f14 != cVar2.f18764b) {
            if (z0Var == z0.f25597u) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                f13 = f14;
            }
            if (z3) {
                f10 = cVar.f18766d;
            } else {
                f10 = cVar.f18765c;
            }
            float h3 = e1Var.h();
            float f16 = i;
            float f17 = h3 + f16;
            if (f10 > f17 || (f13 < h3 && f10 - f13 > f16)) {
                f11 = f10 - f17;
            } else if (f13 < h3 && f10 - f13 <= f16) {
                f11 = f13 - h3;
            } else {
                f11 = 0.0f;
            }
            e1Var.i(e1Var.h() + f11);
            this.f17050d = cVar;
        }
        e1Var.i(b9.d(e1Var.h(), 0.0f, f12));
        this.f17049c.i(i);
    }
}
