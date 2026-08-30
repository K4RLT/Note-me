package u7;
import a.a;
import p.a;

/* loaded from: classes.dex */
public final class d7 extends h7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26100a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26101b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26102c;

    /* renamed from: d, reason: collision with root package name */
    public final float f26103d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final float f26104f;

    public d7(float f10, int i, float f11, float f12, int i10) {
        int i11;
        i = (i10 & 2) != 0 ? 1430216332 : i;
        f11 = (i10 & 4) != 0 ? 0.16f : f11;
        f12 = (i10 & 8) != 0 ? 0.0f : f12;
        if ((i10 & 16) != 0) {
            i11 = 0;
        } else {
            i11 = 5;
        }
        float f13 = (i10 & 32) == 0 ? 10.0f : 0.0f;
        this.f26100a = f10;
        this.f26101b = i;
        this.f26102c = f11;
        this.f26103d = f12;
        this.e = i11;
        this.f26104f = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7)) {
            return false;
        }
        d7 d7Var = (d7) obj;
        if (Float.compare(this.f26100a, d7Var.f26100a) == 0 && this.f26101b == d7Var.f26101b && Float.compare(this.f26102c, d7Var.f26102c) == 0 && Float.compare(this.f26103d, d7Var.f26103d) == 0 && this.e == d7Var.e && Float.compare(this.f26104f, d7Var.f26104f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26104f) + a.b(this.e, a.a(a.a(a.b(this.f26101b, Float.hashCode(this.f26100a) * 31, 31), 31, this.f26102c), 31, this.f26103d), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Lines(spacingMm=");
        sb2.append(this.f26100a);
        sb2.append(", colorArgb=");
        sb2.append(this.f26101b);
        sb2.append(", widthMm=");
        a5.a.s(sb2, this.f26102c, ", startMm=", this.f26103d, ", groupOf=");
        sb2.append(this.e);
        sb2.append(", groupGapMm=");
        sb2.append(this.f26104f);
        sb2.append(")");
        return sb2.toString();
    }
}
