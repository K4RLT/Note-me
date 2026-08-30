package q1;
import p.a;

/* loaded from: classes.dex */
public final class q extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f23298b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23299c;

    public q(float f10, float f11) {
        super(3);
        this.f23298b = f10;
        this.f23299c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(this.f23298b, qVar.f23298b) == 0 && Float.compare(this.f23299c, qVar.f23299c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23299c) + (Float.hashCode(this.f23298b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
        sb2.append(this.f23298b);
        sb2.append(", dy=");
        return a.m(sb2, this.f23299c, ')');
    }
}
