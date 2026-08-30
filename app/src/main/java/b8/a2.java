package b8;
import b8.h4;
import l7.b;

/* loaded from: classes.dex */
public final /* synthetic */ class a2 implements h4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f1821c;

    public /* synthetic */ a2(String str, String str2, boolean z3) {
        this.f1819a = str;
        this.f1820b = z3;
        this.f1821c = str2;
    }

    @Override // h4
    public final void a(i4 i4Var) {
        i4Var.l(this.f1819a, 0.11f, "sans", 0.036f);
        boolean z3 = this.f1820b;
        if (z3) {
            i4.g(i4Var, b.ROUNDED, i4Var.i(), 0.3f, 0.62f, 0.0f, 48);
        } else {
            for (int i = 0; i < 4; i++) {
                i4.o(i4Var.i(), (i * 0.06f) + 0.22f, i4Var.k(), 0, 24, i4Var);
            }
        }
        i4Var.l(this.f1821c, 0.55f, "sans", 0.036f);
        if (z3) {
            i4.g(i4Var, b.ROUNDED, i4Var.i(), 0.74f, 0.62f, 0.0f, 48);
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            i4.o(i4Var.i(), (i10 * 0.06f) + 0.66f, i4Var.k(), 0, 24, i4Var);
        }
    }
}
