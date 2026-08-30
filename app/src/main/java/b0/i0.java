package b0;
import r0.i1;
import r0.v0;

import r0.n2;
import wa.b9;

/* loaded from: classes.dex */
public final class i0 implements n2 {

    /* renamed from: u, reason: collision with root package name */
    public final int f1199u;

    /* renamed from: v, reason: collision with root package name */
    public final int f1200v;

    /* renamed from: w, reason: collision with root package name */
    public final i1 f1201w;

    /* renamed from: x, reason: collision with root package name */
    public int f1202x;

    public i0(int i, int i10, int i11) {
        this.f1199u = i10;
        this.f1200v = i11;
        int i12 = (i / i10) * i10;
        this.f1201w = new i1(b9.i(Math.max(i12 - i11, 0), i12 + i10 + i11), v0.f24421z);
        this.f1202x = i;
    }

    public final void a(int i) {
        if (i != this.f1202x) {
            this.f1202x = i;
            int i10 = this.f1199u;
            int i11 = (i / i10) * i10;
            int i12 = this.f1200v;
            this.f1201w.setValue(b9.i(Math.max(i11 - i12, 0), i11 + i10 + i12));
        }
    }

    @Override // n2
    public final Object getValue() {
        return (jf.d) this.f1201w.getValue();
    }
}
