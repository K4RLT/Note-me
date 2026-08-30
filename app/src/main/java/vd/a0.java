package vd;
import l.a;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27542a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27543b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27544c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27545d;

    public a0(int i, long j10, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f27542a = str;
        this.f27543b = str2;
        this.f27544c = i;
        this.f27545d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (kotlin.jvm.internal.a(this.f27542a, a0Var.f27542a) && kotlin.jvm.internal.a(this.f27543b, a0Var.f27543b) && this.f27544c == a0Var.f27544c && this.f27545d == a0Var.f27545d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27545d) + a.b(this.f27544c, g3.a.e(this.f27543b, this.f27542a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f27542a + ", firstSessionId=" + this.f27543b + ", sessionIndex=" + this.f27544c + ", sessionStartTimestampUs=" + this.f27545d + ')';
    }
}
