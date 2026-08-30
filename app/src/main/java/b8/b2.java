package b8;
import b8.h4;

/* loaded from: classes.dex */
public final /* synthetic */ class b2 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1870a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1871b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1872c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1873d;

    public /* synthetic */ b2(String str, int i, String str2, String str3) {
        this.f1870a = str;
        this.f1871b = i;
        this.f1872c = str2;
        this.f1873d = str3;
    }

    @Override // h4
    public final void a(i4 i4Var) {
        i4Var.l(this.f1870a, 0.11f, "sans", 0.036f);
        int i = this.f1871b;
        float f10 = 0.64f / i;
        float h3 = 0.02f + i4Var.h();
        d2 d2Var = i4Var.e;
        i4.t(i4Var, this.f1872c, h3, 0.195f, 0.022f, d2Var.f1966c, "sans", null, 3968);
        i4.t(i4Var, this.f1873d, i4Var.j() - 0.1f, 0.195f, 0.022f, d2Var.f1966c, "sans", null, 3968);
        int i10 = 0;
        while (true) {
            int i11 = d2Var.f1965b;
            if (i10 < i) {
                i4.o(i4Var.i(), 0.24f + (i10 * f10), i4Var.k(), i11, 16, i4Var);
                i10++;
            } else {
                i4.a(i4Var, i4Var.j() - 0.22f, 0.56f, 0.0022f, 0.64f, Integer.valueOf(i11), null, 0.0f, 0.0f, 0.0f, null, 864);
                return;
            }
        }
    }
}
