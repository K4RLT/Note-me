package b8;
import g3.a;

/* loaded from: classes.dex */
public final class f6 {
    public static final e6 Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f2080a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2081b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2082c;

    /* renamed from: d, reason: collision with root package name */
    public final i6 f2083d;

    public /* synthetic */ f6(int i, String str, String str2, long j10, i6 i6Var) {
        if ((i & 1) == 0) {
            this.f2080a = "";
        } else {
            this.f2080a = str;
        }
        if ((i & 2) == 0) {
            this.f2081b = "";
        } else {
            this.f2081b = str2;
        }
        if ((i & 4) == 0) {
            this.f2082c = 3600L;
        } else {
            this.f2082c = j10;
        }
        if ((i & 8) == 0) {
            this.f2083d = null;
        } else {
            this.f2083d = i6Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj;
        if (kotlin.jvm.internal.a(this.f2080a, f6Var.f2080a) && kotlin.jvm.internal.a(this.f2081b, f6Var.f2081b) && this.f2082c == f6Var.f2082c && kotlin.jvm.internal.a(this.f2083d, f6Var.f2083d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int d2 = a.d(this.f2082c, a.e(this.f2081b, this.f2080a.hashCode() * 31, 31), 31);
        i6 i6Var = this.f2083d;
        if (i6Var == null) {
            hashCode = 0;
        } else {
            hashCode = i6Var.f2210a.hashCode();
        }
        return d2 + hashCode;
    }

    public final String toString() {
        StringBuilder q10 = a.q("TokenResponse(access_token=", this.f2080a, ", refresh_token=", this.f2081b, ", expires_in=");
        q10.append(this.f2082c);
        q10.append(", user=");
        q10.append(this.f2083d);
        q10.append(")");
        return q10.toString();
    }
}
