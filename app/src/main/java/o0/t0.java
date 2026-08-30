package o0;
import p.c;
import p0.o;
import r0.e;
import x.j0;
import z1.a1;
import z1.r0;
import z1.z0;

/* loaded from: classes.dex */
public final class t0 extends kotlin.jvm.internal.m implements df.l {
    public final /* synthetic */ a1 A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ a1 C;
    public final /* synthetic */ a1 D;
    public final /* synthetic */ a1 E;
    public final /* synthetic */ u0 F;
    public final /* synthetic */ r0 G;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f21683u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f21684v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a1 f21685w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ a1 f21686x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ a1 f21687y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ a1 f21688z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(int i, int i10, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5, a1 a1Var6, a1 a1Var7, a1 a1Var8, a1 a1Var9, u0 u0Var, r0 r0Var) {
        super(1);
        this.f21683u = i;
        this.f21684v = i10;
        this.f21685w = a1Var;
        this.f21686x = a1Var2;
        this.f21687y = a1Var3;
        this.f21688z = a1Var4;
        this.A = a1Var5;
        this.B = a1Var6;
        this.C = a1Var7;
        this.D = a1Var8;
        this.E = a1Var9;
        this.F = u0Var;
        this.G = r0Var;
    }

    @Override // df.l
    public final Object invoke(Object obj) {
        int i;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f11;
        z0 z0Var = (z0) obj;
        u0 u0Var = this.F;
        float f12 = u0Var.f21696c;
        boolean z3 = u0Var.f21695b;
        r0 r0Var = this.G;
        float a10 = r0Var.a();
        y2.m layoutDirection = r0Var.getLayoutDirection();
        j0 j0Var = u0Var.f21697d;
        float f13 = r0.f21644a;
        z0.j(z0Var, this.D, 0L);
        float f14 = o.f22344b;
        a1 a1Var = this.E;
        if (a1Var != null) {
            i = a1Var.f31770v;
        } else {
            i = 0;
        }
        int i15 = this.f21683u - i;
        int b10 = ff.a.b(j0Var.d() * a10);
        int b11 = ff.a.b(androidx.compose.foundation.layout.a.e(j0Var, layoutDirection) * a10);
        float f15 = o.f22345c * a10;
        a1 a1Var2 = this.f21685w;
        if (a1Var2 != null) {
            z0.k(z0Var, a1Var2, 0, Math.round((1 + 0.0f) * ((i15 - a1Var2.f31770v) / 2.0f)));
        }
        a1 a1Var3 = this.B;
        if (a1Var3 != null) {
            if (z3) {
                f10 = 2.0f;
                i14 = Math.round((1 + 0.0f) * ((i15 - a1Var3.f31770v) / 2.0f));
            } else {
                f10 = 2.0f;
                i14 = b10;
            }
            int c10 = c7.c(i14, -(a1Var3.f31770v / 2), f12);
            if (a1Var2 == null) {
                f11 = 0.0f;
            } else {
                f11 = (1 - f12) * (a1Var2.f31769u - f15);
            }
            z0.k(z0Var, a1Var3, ff.a.b(f11) + b11, c10);
        } else {
            f10 = 2.0f;
        }
        a1 a1Var4 = this.f21687y;
        if (a1Var4 != null) {
            if (a1Var2 != null) {
                i13 = a1Var2.f31769u;
            } else {
                i13 = 0;
            }
            z0.k(z0Var, a1Var4, i13, e(z3, i15, b10, a1Var3, a1Var4));
        }
        if (a1Var2 != null) {
            i10 = a1Var2.f31769u;
        } else {
            i10 = 0;
        }
        if (a1Var4 != null) {
            i11 = a1Var4.f31769u;
        } else {
            i11 = 0;
        }
        int i16 = i10 + i11;
        a1 a1Var5 = this.A;
        z0.k(z0Var, a1Var5, i16, e(z3, i15, b10, a1Var3, a1Var5));
        a1 a1Var6 = this.C;
        if (a1Var6 != null) {
            z0.k(z0Var, a1Var6, i16, e(z3, i15, b10, a1Var3, a1Var6));
        }
        int i17 = this.f21684v;
        a1 a1Var7 = this.f21686x;
        a1 a1Var8 = this.f21688z;
        if (a1Var8 != null) {
            if (a1Var7 != null) {
                i12 = a1Var7.f31769u;
            } else {
                i12 = 0;
            }
            z0.k(z0Var, a1Var8, (i17 - i12) - a1Var8.f31769u, e(z3, i15, b10, a1Var3, a1Var8));
        }
        if (a1Var7 != null) {
            z0.k(z0Var, a1Var7, i17 - a1Var7.f31769u, Math.round((1 + 0.0f) * ((i15 - a1Var7.f31770v) / f10)));
        }
        if (a1Var != null) {
            z0.k(z0Var, a1Var, 0, i15);
        }
        return pe.z.f22715a;
    }
}
