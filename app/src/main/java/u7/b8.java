package u7;
import l.a;

/* loaded from: classes.dex */
public final class b8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25967a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25968b;

    public b8(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f25967a = str;
        this.f25968b = str2;
    }

    public final String a() {
        return this.f25967a;
    }

    public final String b() {
        return this.f25968b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8)) {
            return false;
        }
        b8 b8Var = (b8) obj;
        if (kotlin.jvm.internal.a(this.f25967a, b8Var.f25967a) && kotlin.jvm.internal.a(this.f25968b, b8Var.f25968b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f25968b.hashCode() + (this.f25967a.hashCode() * 31);
    }

    public final String toString() {
        return a5.a.h("SpreadPaper(left=", this.f25967a, ", right=", this.f25968b, ")");
    }

    public /* synthetic */ b8() {
        this("plain", "plain");
    }
}
