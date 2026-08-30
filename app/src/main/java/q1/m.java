package q1;
import p.a;

/* loaded from: classes.dex */
public final class m extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f23287b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23288c;

    public m(float f10, float f11) {
        super(3);
        this.f23287b = f10;
        this.f23288c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (Float.compare(this.f23287b, mVar.f23287b) == 0 && Float.compare(this.f23288c, mVar.f23288c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23288c) + (Float.hashCode(this.f23287b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.f23287b);
        sb2.append(", y=");
        return a.m(sb2, this.f23288c, ')');
    }
}
