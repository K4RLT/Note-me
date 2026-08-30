package m2;
import a.a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20451a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20452b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20453c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20454d;

    public e(Object obj, int i, int i10, String str) {
        boolean z3;
        this.f20451a = obj;
        this.f20452b = i;
        this.f20453c = i10;
        this.f20454d = str;
        if (i <= i10) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            s2.a("Reversed range is not supported");
        }
    }

    public static e a(e eVar, v vVar, int i, int i10) {
        Object obj = vVar;
        if ((i10 & 1) != 0) {
            obj = eVar.f20451a;
        }
        int i11 = eVar.f20452b;
        if ((i10 & 4) != 0) {
            i = eVar.f20453c;
        }
        return new e(obj, i11, i, eVar.f20454d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.a(this.f20451a, eVar.f20451a) && this.f20452b == eVar.f20452b && this.f20453c == eVar.f20453c && kotlin.jvm.internal.a(this.f20454d, eVar.f20454d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f20451a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f20454d.hashCode() + p.a.b(this.f20453c, p.a.b(this.f20452b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Range(item=");
        sb2.append(this.f20451a);
        sb2.append(", start=");
        sb2.append(this.f20452b);
        sb2.append(", end=");
        sb2.append(this.f20453c);
        sb2.append(", tag=");
        return p.a.n(sb2, this.f20454d, ')');
    }

    public e(Object obj, int i, int i10) {
        this(obj, i, i10, "");
    }
}
