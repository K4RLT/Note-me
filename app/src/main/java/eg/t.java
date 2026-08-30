package eg;
import l.a;
import p0.b;

/* loaded from: classes.dex */
public final class t extends r0 {

    /* renamed from: l, reason: collision with root package name */
    public final cg.h f16582l;

    /* renamed from: m, reason: collision with root package name */
    public final pe.n f16583m;

    public t(int i) {
        super("com.daren.scraply.data.local.payload.FrameShape", null, i);
        this.f16582l = cg.h.f4133c;
        this.f16583m = new pe.n(new androidx.ink.brush.c(i, this, 9));
    }

    @Override // eg.r0, cg.d
    public final wa.z e() {
        return this.f16582l;
    }

    @Override // eg.r0
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof cg.d)) {
                cg.d dVar = (cg.d) obj;
                if (dVar.e() != cg.h.f4133c || !this.f16569a.equals(dVar.a()) || !kotlin.jvm.internal.a(b(this), b(dVar))) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // eg.r0
    public final int hashCode() {
        int i;
        int hashCode = this.f16569a.hashCode();
        cg.f fVar = new cg.f(this);
        int i10 = 1;
        while (fVar.hasNext()) {
            int i11 = i10 * 31;
            String str = (String) fVar.next();
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            i10 = i11 + i;
        }
        return (hashCode * 31) + i10;
    }

    @Override // eg.r0, cg.d
    public final cg.d i(int i) {
        return ((cg.d[]) this.f16583m.getValue())[i];
    }

    @Override // eg.r0
    public final String toString() {
        return qe.l.B(new cg.g(0, this), ", ", this.f16569a.concat("("), ")", null, 56);
    }
}
