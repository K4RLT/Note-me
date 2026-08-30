package w7;
import a5.a;

/* loaded from: classes.dex */
public final class la extends ma {

    /* renamed from: a, reason: collision with root package name */
    public final String f28657a;

    /* renamed from: b, reason: collision with root package name */
    public final String f28658b;

    public la(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f28657a = str;
        this.f28658b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la)) {
            return false;
        }
        la laVar = (la) obj;
        if (kotlin.jvm.internal.l.a(this.f28657a, laVar.f28657a) && kotlin.jvm.internal.l.a(this.f28658b, laVar.f28658b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f28658b.hashCode() + (this.f28657a.hashCode() * 31);
    }

    public final String toString() {
        return a.h("Remote(packId=", this.f28657a, ", fileName=", this.f28658b, ")");
    }
}
