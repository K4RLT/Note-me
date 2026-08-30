package f0;
import a.a;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f16624a;

    public c(float f10) {
        this.f16624a = f10;
        if (f10 >= 0.0f && f10 <= 100.0f) {
            return;
        }
        w.a("The percent should be in the range of [0, 100]");
    }

    @Override // f0.a
    public final float a(long j10, y2.c cVar) {
        return (this.f16624a / 100.0f) * j1.e.c(j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && Float.compare(this.f16624a, ((c) obj).f16624a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f16624a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f16624a + "%)";
    }
}
