package b8;
import b8.h4;
import c2.d;
import c2.f;
import c2.g;

/* loaded from: classes.dex */
public final /* synthetic */ class x1 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2961a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f2962b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2963c;

    public /* synthetic */ x1(int i, String str) {
        this.f2961a = 2;
        this.f2963c = i;
        this.f2962b = str;
    }

    @Override // h4
    public final void a(i4 i4Var) {
        i4 i4Var2 = i4Var;
        switch (this.f2961a) {
            case 0:
                f(i4Var2, this.f2962b, "");
                for (int i = 0; i < 5; i++) {
                    float f10 = (i * 0.13f) + 0.28f;
                    int i10 = c2.f1908c;
                    i4.e(i4Var2, i4Var2.h() + 0.055f, 0.014f + f10, 0.055f, null, Integer.valueOf(i10), 8);
                    i4Var2 = i4Var;
                    i4.t(i4Var2, String.valueOf(this.f2963c + i), i4Var.h() + 0.055f, f10 + 0.017f, 0.021f, i10, "cormorant", null, 3968);
                    g(i4Var2, f10, 56);
                    g(i4Var2, f10 + 0.035f, 26);
                }
                return;
            case 1:
                i4Var2.l(this.f2962b, 0.11f, "sans", 0.036f);
                int i11 = this.f2963c;
                float f11 = 0.64f / i11;
                float k3 = (i4Var2.k() * 0.42f) + i4Var2.h();
                float j10 = (i4Var2.j() - k3) / 14;
                for (int i12 = 0; i12 < i11; i12++) {
                    float f12 = (i12 * f11) + 0.24f;
                    i4.o((i4Var2.k() * 0.19f) + i4Var2.h(), 0.028f + f12, i4Var2.k() * 0.36f, 0, 24, i4Var);
                    i4Var2 = i4Var;
                    int i13 = 0;
                    while (i13 < 14) {
                        float f13 = f12;
                        i4.e(i4Var2, ((i13 + 0.5f) * j10) + k3, f13, j10 * 0.62f, null, Integer.valueOf(i4Var2.e.f1965b), 8);
                        i13++;
                        f12 = f13;
                    }
                }
                return;
            default:
                String valueOf = String.valueOf(this.f2963c);
                float j11 = i4Var2.j() - 0.075f;
                d2 d2Var = i4Var2.e;
                i4.t(i4Var2, valueOf, j11, 0.072f, 0.085f, d(d2Var.f1967d, 64), "sans", null, 3968);
                float i14 = i4Var.i();
                float k4 = i4Var.k();
                int i15 = d2Var.f1964a;
                i4.a(i4Var, i14, 0.545f, k4, 0.75f, null, Integer.valueOf(d(i15, 46)), 0.0035f, 0.03f, 0.0f, null, 784);
                i4.t(i4Var, this.f2962b, i4Var.h() + 0.16f, 0.2f, 0.024f, d(i15, 115), "casual", Float.valueOf(0.32f), 3520);
                return;
        }
    }

    public /* synthetic */ x1(String str, int i, int i10) {
        this.f2961a = i10;
        this.f2962b = str;
        this.f2963c = i;
    }
}
