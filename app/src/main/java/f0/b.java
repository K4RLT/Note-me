package f0;

import y2.f;

/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f16623a;

    public b(float f10) {
        this.f16623a = f10;
    }

    @Override // f0.a
    public final float a(long j10, y2.c cVar) {
        return cVar.l0(this.f16623a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof b) || !f.a(this.f16623a, ((b) obj).f16623a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16623a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f16623a + ".dp)";
    }
}
