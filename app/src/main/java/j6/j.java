package j6;
import l.a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f18928a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18929b;

    public j(String str, int i) {
        str.getClass();
        this.f18928a = str;
        this.f18929b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (kotlin.jvm.internal.a(this.f18928a, jVar.f18928a) && this.f18929b == jVar.f18929b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18929b) + (this.f18928a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WorkGenerationalId(workSpecId=");
        sb2.append(this.f18928a);
        sb2.append(", generation=");
        return a5.a.i(sb2, this.f18929b, ')');
    }
}
