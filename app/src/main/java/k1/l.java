package k1;
import d.b;
import d.d;
import p.a;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: b, reason: collision with root package name */
    public final long f19493b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19494c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(long r4, int r6) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L16
            k1.d()
            int r0 = k1.l0.F(r4)
            android.graphics.BlendMode r1 = k1.l0.A(r6)
            android.graphics.BlendModeColorFilter r0 = k1.b(r0, r1)
            goto L23
        L16:
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            int r1 = k1.l0.F(r4)
            android.graphics.PorterDuff$Mode r2 = k1.l0.J(r6)
            r0.<init>(r1, r2)
        L23:
            r3.<init>(r0)
            r3.f19493b = r4
            r3.f19494c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.l.<init>(long, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                long j10 = lVar.f19493b;
                int i = r.f19522m;
                if (pe.a(this.f19493b, j10) && this.f19494c == lVar.f19494c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = r.f19522m;
        return Integer.hashCode(this.f19494c) + (Long.hashCode(this.f19493b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BlendModeColorFilter(color=");
        a.u(this.f19493b, sb2, ", blendMode=");
        sb2.append((Object) l0.K(this.f19494c));
        sb2.append(')');
        return sb2.toString();
    }
}
