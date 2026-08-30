package h8;

import k1.r;
import pe.u;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f17920a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17921b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17922c;

    public e(long j10, String str, boolean z3) {
        this.f17920a = j10;
        this.f17921b = str;
        this.f17922c = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                long j10 = eVar.f17920a;
                int i = r.f19522m;
                if (!u.a(this.f17920a, j10) || !this.f17921b.equals(eVar.f17921b) || this.f17922c != eVar.f17922c) {
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
        return Boolean.hashCode(this.f17922c) + g3.a.e(this.f17921b, Long.hashCode(this.f17920a) * 31, 31);
    }

    public final String toString() {
        StringBuilder q10 = p.a.q("ColorEnvelope(color=", r.i(this.f17920a), ", hexCode=", this.f17921b, ", fromUser=");
        q10.append(this.f17922c);
        q10.append(")");
        return q10.toString();
    }
}
