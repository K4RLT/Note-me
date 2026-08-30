package j2;
import l.a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18775a;

    /* renamed from: b, reason: collision with root package name */
    public final pe.d f18776b;

    public a(String str, pe.d dVar) {
        this.f18775a = str;
        this.f18776b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (kotlin.jvm.internal.l.a(this.f18775a, aVar.f18775a) && kotlin.jvm.internal.l.a(this.f18776b, aVar.f18776b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i10 = 0;
        String str = this.f18775a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i11 = i * 31;
        pe.d dVar = this.f18776b;
        if (dVar != null) {
            i10 = dVar.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "AccessibilityAction(label=" + this.f18775a + ", action=" + this.f18776b + ')';
    }
}
