package x2;
import o.a;

import ya.ae;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final q f30070c = new q(ae.e(0), ae.e(0));

    /* renamed from: a, reason: collision with root package name */
    public final long f30071a;

    /* renamed from: b, reason: collision with root package name */
    public final long f30072b;

    public q(long j10, long j11) {
        this.f30071a = j10;
        this.f30072b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (y2.a(this.f30071a, qVar.f30071a) && y2.a(this.f30072b, qVar.f30072b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        y2.p[] pVarArr = y2.o.f30818b;
        return Long.hashCode(this.f30072b) + (Long.hashCode(this.f30071a) * 31);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) y2.o.e(this.f30071a)) + ", restLine=" + ((Object) y2.o.e(this.f30072b)) + ')';
    }
}
