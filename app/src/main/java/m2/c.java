package m2;
import l.a;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20441a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20442b;

    /* renamed from: c, reason: collision with root package name */
    public int f20443c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20444d;

    public c(Object obj, int i, int i10, String str) {
        this.f20441a = obj;
        this.f20442b = i;
        this.f20443c = i10;
        this.f20444d = str;
    }

    public final e a(int i) {
        boolean z3;
        int i10 = this.f20443c;
        if (i10 != Integer.MIN_VALUE) {
            i = i10;
        }
        if (i != Integer.MIN_VALUE) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            s2.a.b("Item.end should be set first");
        }
        return new e(this.f20441a, this.f20442b, i, this.f20444d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.a(this.f20441a, cVar.f20441a) && this.f20442b == cVar.f20442b && this.f20443c == cVar.f20443c && kotlin.jvm.internal.a(this.f20444d, cVar.f20444d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f20441a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.f20444d.hashCode() + p.a.b(this.f20443c, p.a.b(this.f20442b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MutableRange(item=");
        sb2.append(this.f20441a);
        sb2.append(", start=");
        sb2.append(this.f20442b);
        sb2.append(", end=");
        sb2.append(this.f20443c);
        sb2.append(", tag=");
        return p.a.n(sb2, this.f20444d, ')');
    }

    public /* synthetic */ c(h0 h0Var, int i, int i10, int i11) {
        this(h0Var, i, (i11 & 4) != 0 ? Integer.MIN_VALUE : i10, "");
    }
}
