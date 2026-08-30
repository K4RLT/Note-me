package b8;
import b8.h4;
import g3.a;

/* loaded from: classes.dex */
public final /* synthetic */ class r1 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f2620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f2622c;

    public /* synthetic */ r1(int i, String str, boolean z3) {
        this.f2620a = str;
        this.f2621b = i;
        this.f2622c = z3;
    }

    @Override // h4
    public final void a(i4 i4Var) {
        i4 i4Var2 = i4Var;
        i4Var2.l(this.f2620a, 0.11f, "sans", 0.036f);
        int i = this.f2621b;
        float f10 = 0.64f / i;
        if (!this.f2622c) {
            for (int i10 = 0; i10 < i; i10++) {
                float f11 = (i10 * f10) + 0.22f;
                i4.c(i4Var2, i4Var2.h() + 0.03f, f11);
                i4.o(((i4Var2.k() - 0.12f) / 2.0f) + i4Var2.h() + 0.09f, f11 + 0.03f, i4Var2.k() - 0.12f, 0, 24, i4Var2);
            }
            return;
        }
        float k3 = (i4Var2.k() / 2.0f) - 0.03f;
        int i11 = 0;
        while (i11 < i) {
            float c10 = a.c(i11, f10, 2.0f, 0.22f);
            if (c10 <= 0.88f) {
                i4.c(i4Var2, i4Var2.h() + 0.03f, c10);
                float f12 = k3 / 2.0f;
                float f13 = c10 + 0.03f;
                float f14 = k3 - 0.06f;
                i4.o(i4Var2.h() + 0.06f + f12, f13, f14, 0, 24, i4Var2);
                i4.c(i4Var2, i4Var2.i() + 0.05f, c10);
                i4.o(i4Var2.i() + 0.08f + f12, f13, f14, 0, 24, i4Var2);
            }
            i11++;
            i4Var2 = i4Var;
        }
    }
}
