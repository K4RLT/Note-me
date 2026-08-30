package j0;
import l.a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f18752a;

    /* renamed from: b, reason: collision with root package name */
    public String f18753b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18754c = false;

    /* renamed from: d, reason: collision with root package name */
    public g f18755d = null;

    public p(String str, String str2) {
        this.f18752a = str;
        this.f18753b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (kotlin.jvm.internal.a(this.f18752a, pVar.f18752a) && kotlin.jvm.internal.a(this.f18753b, pVar.f18753b) && this.f18754c == pVar.f18754c && kotlin.jvm.internal.a(this.f18755d, pVar.f18755d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c10 = a.c(g3.a.e(this.f18753b, this.f18752a.hashCode() * 31, 31), 31, this.f18754c);
        g gVar = this.f18755d;
        if (gVar == null) {
            hashCode = 0;
        } else {
            hashCode = gVar.hashCode();
        }
        return c10 + hashCode;
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f18755d + ", isShowingSubstitution=" + this.f18754c + ')';
    }
}
