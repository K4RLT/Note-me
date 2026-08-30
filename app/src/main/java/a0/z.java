package a0;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import t.z0;
import ya.mc;
import z1.q0;

/* loaded from: classes.dex */
public final class z implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f162b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f163c;

    /* renamed from: d, reason: collision with root package name */
    public final float f164d;
    public final q0 e;

    /* renamed from: f, reason: collision with root package name */
    public final float f165f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f166g;

    /* renamed from: h, reason: collision with root package name */
    public final pf.z f167h;
    public final y2.c i;

    /* renamed from: j, reason: collision with root package name */
    public final int f168j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlin.jvm.internal.m f169k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f170l;

    /* renamed from: m, reason: collision with root package name */
    public final int f171m;

    /* renamed from: n, reason: collision with root package name */
    public final int f172n;

    /* renamed from: o, reason: collision with root package name */
    public final int f173o;

    /* renamed from: p, reason: collision with root package name */
    public final z0 f174p;

    /* renamed from: q, reason: collision with root package name */
    public final int f175q;

    /* renamed from: r, reason: collision with root package name */
    public final int f176r;

    /* JADX WARN: Multi-variable type inference failed */
    public z(b0 b0Var, int i, boolean z3, float f10, q0 q0Var, float f11, boolean z9, pf.z zVar, y2.c cVar, int i10, df.l lVar, List list, int i11, int i12, int i13, z0 z0Var, int i14, int i15) {
        this.f161a = b0Var;
        this.f162b = i;
        this.f163c = z3;
        this.f164d = f10;
        this.e = q0Var;
        this.f165f = f11;
        this.f166g = z9;
        this.f167h = zVar;
        this.i = cVar;
        this.f168j = i10;
        this.f169k = (kotlin.jvm.internal.m) lVar;
        this.f170l = list;
        this.f171m = i11;
        this.f172n = i12;
        this.f173o = i13;
        this.f174p = z0Var;
        this.f175q = i14;
        this.f176r = i15;
    }

    @Override // z1.q0
    public final void a() {
        this.e.a();
    }

    @Override // z1.q0
    public final Map b() {
        return this.e.b();
    }

    @Override // z1.q0
    public final df.l c() {
        return this.e.c();
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.internal.m, df.l] */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List, java.lang.Object] */
    public final z d(int i, boolean z3) {
        b0 b0Var;
        boolean z9;
        int i10;
        if (!this.f166g) {
            Object r15 = this.f170l;
            if (!r15.isEmpty() && (b0Var = this.f161a) != null) {
                int i11 = b0Var.f25g;
                int i12 = this.f162b - i;
                if (i12 >= 0 && i12 < i11) {
                    a0 a0Var = (a0) qe.l.w(r15);
                    a0 a0Var2 = (a0) qe.l.C(r15);
                    if (!a0Var.f18r && !a0Var2.f18r) {
                        int i13 = this.f172n;
                        int i14 = this.f171m;
                        z0 z0Var = this.f174p;
                        if (i < 0) {
                            if (Math.min((mc.a(a0Var, z0Var) + a0Var.f12l) - i14, (mc.a(a0Var2, z0Var) + a0Var2.f12l) - i13) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(i14 - mc.a(a0Var, z0Var), i13 - mc.a(a0Var2, z0Var)) <= i) {
                            return null;
                        }
                        int size = ((Collection) r15).size();
                        int i15 = 0;
                        while (i15 < size) {
                            a0 a0Var3 = (a0) r15.get(i15);
                            a0Var3.getClass();
                            if (a0Var3.f18r) {
                                i10 = i15;
                            } else {
                                long j10 = a0Var3.f15o;
                                i10 = i15;
                                a0Var3.f15o = (((int) (j10 >> 32)) << 32) | ((((int) (j10 & 4294967295L)) + i) & 4294967295L);
                                if (z3) {
                                    int size2 = a0Var3.e.size();
                                    for (int i16 = 0; i16 < size2; i16++) {
                                        a0Var3.f9h.a(i16, a0Var3.f4b);
                                    }
                                }
                            }
                            i15 = i10 + 1;
                        }
                        if (!this.f163c && i <= 0) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        return new z(this.f161a, i12, z9, i, this.e, this.f165f, this.f166g, this.f167h, this.i, this.f168j, this.f169k, r15, this.f171m, this.f172n, this.f173o, z0Var, this.f175q, this.f176r);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final long e() {
        q0 q0Var = this.e;
        return (q0Var.getWidth() << 32) | (q0Var.getHeight() & 4294967295L);
    }

    @Override // z1.q0
    public final int getHeight() {
        return this.e.getHeight();
    }

    @Override // z1.q0
    public final int getWidth() {
        return this.e.getWidth();
    }
}