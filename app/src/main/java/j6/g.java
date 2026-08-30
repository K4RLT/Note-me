package j6;
import l.a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f18920a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18921b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18922c;

    public g(String str, int i, int i10) {
        str.getClass();
        this.f18920a = str;
        this.f18921b = i;
        this.f18922c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (kotlin.jvm.internal.a(this.f18920a, gVar.f18920a) && this.f18921b == gVar.f18921b && this.f18922c == gVar.f18922c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18922c) + a.b(this.f18921b, this.f18920a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.f18920a);
        sb2.append(", generation=");
        sb2.append(this.f18921b);
        sb2.append(", systemId=");
        return a5.a.i(sb2, this.f18922c, ')');
    }
}
