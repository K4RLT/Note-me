package k0;
import r.i;
import k1.r;
import p.a;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f19381a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19382b;

    public o1(long j10, long j11) {
        this.f19381a = j10;
        this.f19382b = j11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o1) {
                o1 o1Var = (o1) obj;
                long j10 = o1Var.f19381a;
                int i = r.f19522m;
                if (!pe.a(this.f19381a, j10) || !pe.a(this.f19382b, o1Var.f19382b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = r.f19522m;
        return Long.hashCode(this.f19382b) + (Long.hashCode(this.f19381a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionColors(selectionHandleColor=");
        a.u(this.f19381a, sb2, ", selectionBackgroundColor=");
        sb2.append((Object) r.i(this.f19382b));
        sb2.append(')');
        return sb2.toString();
    }
}
