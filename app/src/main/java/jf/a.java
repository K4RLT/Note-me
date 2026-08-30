package jf;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f19187a;

    /* renamed from: b, reason: collision with root package name */
    public final float f19188b;

    public a(float f10, float f11) {
        this.f19187a = f10;
        this.f19188b = f11;
    }

    public static boolean a(Float f10, Float f11) {
        if (f10.floatValue() <= f11.floatValue()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            float f10 = this.f19187a;
            float f11 = this.f19188b;
            if (f10 > f11) {
                a aVar = (a) obj;
                if (aVar.f19187a > aVar.f19188b) {
                    return true;
                }
            }
            a aVar2 = (a) obj;
            if (f10 == aVar2.f19187a && f11 == aVar2.f19188b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        float f10 = this.f19187a;
        float f11 = this.f19188b;
        if (f10 > f11) {
            return -1;
        }
        return Float.hashCode(f11) + (Float.hashCode(f10) * 31);
    }

    public final String toString() {
        return this.f19187a + ".." + this.f19188b;
    }
}
