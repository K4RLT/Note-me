package q1;
import p.a;

/* loaded from: classes.dex */
public final class l extends u {

    /* renamed from: b, reason: collision with root package name */
    public final float f23285b;

    /* renamed from: c, reason: collision with root package name */
    public final float f23286c;

    public l(float f10, float f11) {
        super(3);
        this.f23285b = f10;
        this.f23286c = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (Float.compare(this.f23285b, lVar.f23285b) == 0 && Float.compare(this.f23286c, lVar.f23286c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f23286c) + (Float.hashCode(this.f23285b) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineTo(x=");
        sb2.append(this.f23285b);
        sb2.append(", y=");
        return a.m(sb2, this.f23286c, ')');
    }
}
