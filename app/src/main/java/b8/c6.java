package b8;
import a5.a;
import l.a;

/* loaded from: classes.dex */
public final class c6 {
    public static final b6 Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f1920a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1921b;

    public /* synthetic */ c6(String str, int i, String str2) {
        if ((i & 1) == 0) {
            this.f1920a = "";
        } else {
            this.f1920a = str;
        }
        if ((i & 2) == 0) {
            this.f1921b = "";
        } else {
            this.f1921b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6)) {
            return false;
        }
        c6 c6Var = (c6) obj;
        if (kotlin.jvm.internal.a(this.f1920a, c6Var.f1920a) && kotlin.jvm.internal.a(this.f1921b, c6Var.f1921b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1921b.hashCode() + (this.f1920a.hashCode() * 31);
    }

    public final String toString() {
        return a.h("ProfileRow(id=", this.f1920a, ", handle=", this.f1921b, ")");
    }
}
