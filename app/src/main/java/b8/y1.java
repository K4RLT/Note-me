package b8;
import b8.h4;
import c2.d;
import c2.e;
import l7.b;

/* loaded from: classes.dex */
public final /* synthetic */ class y1 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3021b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f3022c;

    public /* synthetic */ y1(String str, b bVar) {
        this.f3020a = 2;
        this.f3022c = str;
        this.f3021b = bVar;
    }

    @Override // h4
    public final void a(i4 i4Var) {
        float f10;
        float f11;
        float f12;
        i4 i4Var2 = i4Var;
        switch (this.f3020a) {
            case 0:
                d2 d2Var = i4Var2.e;
                int i = d2Var.f1964a;
                b bVar = this.f3021b;
                float f13 = 0.48f;
                float e = e(bVar, 0.48f);
                String str = this.f3022c;
                if (mf.f.u(str)) {
                    f10 = 0.07f;
                } else {
                    f10 = 0.17f;
                }
                float f14 = f10;
                if (!mf.f.u(str)) {
                    i4.t(i4Var2, str, i4Var2.h() + 0.13f, 0.092f, 0.03f, d2Var.f1966c, "serif", Float.valueOf(0.34f), 3456);
                    i4.o(i4Var.i(), 0.128f, i4Var.k(), d(i, 38), 16, i4Var);
                    i4Var2 = i4Var;
                }
                float f15 = e + 0.1f;
                float b10 = i4.b(f15 + e + 0.032f, f14, 4, i4Var2);
                int i10 = 0;
                while (true) {
                    int i11 = 2;
                    if (i10 < 2) {
                        int i12 = 0;
                        while (i12 < i11) {
                            float i13 = i4Var2.i();
                            if (i12 == 0) {
                                f11 = -0.196f;
                            } else {
                                f11 = 0.196f;
                            }
                            float f16 = i13 + f11;
                            float f17 = e / 2.0f;
                            float f18 = (i10 * f15) + b10 + f17;
                            b bVar2 = bVar;
                            float f19 = f13;
                            i4.g(i4Var2, bVar2, f16, f18, f19, 0.0f, 48);
                            i4.o(f16, f18 + f17 + 0.032f, 0.28896f, d(i, 38), 16, i4Var);
                            i12++;
                            i4Var2 = i4Var;
                            i10 = i10;
                            i11 = i11;
                            f13 = f19;
                            bVar = bVar2;
                        }
                        i10++;
                        i4Var2 = i4Var;
                        bVar = bVar;
                    } else {
                        return;
                    }
                }
            case 1:
                b bVar3 = this.f3021b;
                float e8 = e(bVar3, 1.06f);
                float f20 = e8 / 2.0f;
                float b11 = i4.b(e8 + 0.055f + 0.052f + 0.06f, 0.0f, 6, i4Var2) + f20;
                i4.g(i4Var2, bVar3, i4Var2.i(), b11, 1.06f, 0.0f, 48);
                i4.s(i4Var, i4Var.i(), b11, 0.37099996f, f20, false, 0, 0.17f, 160);
                float i14 = i4Var.i();
                d2 d2Var2 = i4Var.e;
                i4.s(i4Var, i14, b11, 0.37099996f, f20, true, d2Var2.f1967d, 0.17f, 128);
                float f21 = b11 + f20 + 0.055f;
                float i15 = i4Var.i();
                float k3 = i4Var.k() * 0.84f;
                int i16 = d2Var2.f1964a;
                i4.o(i15, f21, k3, d(i16, 46), 16, i4Var);
                i4.o(i4Var.i(), f21 + 0.052f, i4Var.k() * 0.84f, d(i16, 46), 16, i4Var);
                i4.t(i4Var, this.f3022c, i4Var.h() + 0.09f, f21 + 0.112f, 0.02f, d(i16, 140), "sans", Float.valueOf(0.24f), 3520);
                i4.o(i4Var.h() + 0.36f, 0.125f + f21, 0.26f, d(i16, 46), 16, i4Var);
                return;
            default:
                String str2 = this.f3022c;
                if (mf.f.u(str2)) {
                    f12 = 0.3f;
                } else {
                    f12 = 0.36f;
                }
                float f22 = f12;
                if (!mf.f.u(str2)) {
                    i4Var2.l(str2, 0.12f, "sans", 0.036f);
                }
                float k4 = i4Var2.k() * 0.25f;
                float i17 = i4Var2.i() - k4;
                b bVar4 = this.f3021b;
                i4.g(i4Var2, bVar4, i17, f22, 0.5f, 0.0f, 48);
                i4.g(i4Var, bVar4, i4Var.i() + k4, f22, 0.5f, 0.0f, 48);
                float f23 = f22 + 0.33f;
                i4.g(i4Var, bVar4, i4Var.i() - k4, f23, 0.5f, 0.0f, 48);
                i4.g(i4Var, bVar4, i4Var.i() + k4, f23, 0.5f, 0.0f, 48);
                return;
        }
    }

    public /* synthetic */ y1(b bVar, String str, int i) {
        this.f3020a = i;
        this.f3021b = bVar;
        this.f3022c = str;
    }
}
