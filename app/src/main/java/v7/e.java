package v7;
import a.a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f27419a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27420b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27421c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27422d;

    public e(float f10, float f11, float f12, float f13) {
        this.f27419a = f10;
        this.f27420b = f11;
        this.f27421c = f12;
        this.f27422d = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Float.compare(this.f27419a, eVar.f27419a) == 0 && Float.compare(this.f27420b, eVar.f27420b) == 0 && Float.compare(this.f27421c, eVar.f27421c) == 0 && Float.compare(this.f27422d, eVar.f27422d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f27422d) + p.a(p.a(Float.hashCode(this.f27419a) * 31, 31, this.f27420b), 31, this.f27421c);
    }

    public final String toString() {
        return "CropWindow(l=" + this.f27419a + ", t=" + this.f27420b + ", r=" + this.f27421c + ", b=" + this.f27422d + ")";
    }
}
