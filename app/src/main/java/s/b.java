package s;

import k1.r;
import pe.u;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f24826a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24827b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24828c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24829d;
    public final long e;

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f24826a = j10;
        this.f24827b = j11;
        this.f24828c = j12;
        this.f24829d = j13;
        this.e = j14;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                long j10 = bVar.f24826a;
                int i = r.f19522m;
                if (u.a(this.f24826a, j10) && u.a(this.f24827b, bVar.f24827b) && u.a(this.f24828c, bVar.f24828c) && u.a(this.f24829d, bVar.f24829d) && u.a(this.e, bVar.e)) {
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
        return Long.hashCode(this.e) + p.a.d(this.f24829d, p.a.d(this.f24828c, p.a.d(this.f24827b, Long.hashCode(this.f24826a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContextMenuColors(backgroundColor=");
        p.a.u(this.f24826a, sb2, ", textColor=");
        p.a.u(this.f24827b, sb2, ", iconColor=");
        p.a.u(this.f24828c, sb2, ", disabledTextColor=");
        p.a.u(this.f24829d, sb2, ", disabledIconColor=");
        sb2.append((Object) r.i(this.e));
        sb2.append(')');
        return sb2.toString();
    }
}
