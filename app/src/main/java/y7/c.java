package y7;

import c3.a0;
import r0.a1;
import wa.b9;
import y2.k;
import y2.m;

/* loaded from: classes.dex */
public final class c implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30980a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30981b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f30982c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f30983d;
    public final /* synthetic */ a1 e;

    public c(int i, int i10, float f10, a1 a1Var, a1 a1Var2) {
        this.f30980a = i;
        this.f30981b = i10;
        this.f30982c = f10;
        this.f30983d = a1Var;
        this.e = a1Var2;
    }

    @Override // c3.a0
    public final long a(k kVar, long j10, m mVar, long j11) {
        kVar.getClass();
        mVar.getClass();
        int d2 = (kVar.d() / 2) + kVar.f30809a;
        int i = (int) (j11 >> 32);
        int i10 = d2 - (i / 2);
        int i11 = this.f30980a;
        int i12 = (((int) (j10 >> 32)) - i) - i11;
        if (i12 < i11) {
            i12 = i11;
        }
        int e = b9.e(i10, i11, i12);
        int i13 = kVar.f30812d + this.f30981b;
        float f10 = this.f30982c / 2.0f;
        float f11 = d2 - e;
        float f12 = i - f10;
        if (f12 < f10) {
            f12 = f10;
        }
        this.f30983d.setValue(Float.valueOf(b9.d(f11, f10, f12)));
        this.e.setValue(Integer.valueOf(i));
        return (e << 32) | (i13 & 4294967295L);
    }
}
