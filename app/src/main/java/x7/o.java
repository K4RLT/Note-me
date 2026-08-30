package x7;

import r0.a1;
import wa.b9;

/* loaded from: classes.dex */
public final class o implements c3.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f30249c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f30250d;
    public final /* synthetic */ a1 e;

    public o(int i, int i10, float f10, a1 a1Var, a1 a1Var2) {
        this.f30247a = i;
        this.f30248b = i10;
        this.f30249c = f10;
        this.f30250d = a1Var;
        this.e = a1Var2;
    }

    @Override // c3.a0
    public final long a(y2.k kVar, long j10, y2.m mVar, long j11) {
        kVar.getClass();
        mVar.getClass();
        int d2 = (kVar.d() / 2) + kVar.f30809a;
        int i = (int) (j11 >> 32);
        int i10 = d2 - (i / 2);
        int i11 = this.f30247a;
        int i12 = (((int) (j10 >> 32)) - i) - i11;
        if (i12 < i11) {
            i12 = i11;
        }
        int e = b9.e(i10, i11, i12);
        int i13 = (kVar.f30810b - ((int) (j11 & 4294967295L))) - this.f30248b;
        float f10 = this.f30249c / 2.0f;
        float f11 = d2 - e;
        float f12 = i - f10;
        if (f12 < f10) {
            f12 = f10;
        }
        this.f30250d.setValue(Float.valueOf(b9.d(f11, f10, f12)));
        this.e.setValue(Integer.valueOf(i));
        return (e << 32) | (i13 & 4294967295L);
    }
}
