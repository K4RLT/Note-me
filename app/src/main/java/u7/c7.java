package u7;
import p.a;
import u7.c7;

/* loaded from: classes.dex */
public final class c7 extends h7 {

    /* renamed from: a, reason: collision with root package name */
    public final float f26026a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26027b;

    /* renamed from: c, reason: collision with root package name */
    public final float f26028c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ c7(int r2, float r3) {
        /*
            r1 = this;
            r2 = r2 & 4
            if (r2 == 0) goto L7
            r2 = 1056964608(0x3f000000, float:0.5)
            goto La
        L7:
            r2 = 1058642330(0x3f19999a, float:0.6)
        La:
            r0 = 1500741516(0x59737f8c, float:4.28366616E15)
            r1.<init>(r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.c7.<init>(int, float):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c7) {
                c7 c7Var = (c7) obj;
                if (Float.compare(this.f26026a, c7Var.f26026a) != 0 || this.f26027b != c7Var.f26027b || Float.compare(this.f26028c, c7Var.f26028c) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26028c) + a.b(this.f26027b, Float.hashCode(this.f26026a) * 31, 31);
    }

    public final String toString() {
        return "Dots(spacingMm=" + this.f26026a + ", colorArgb=" + this.f26027b + ", sizeMm=" + this.f26028c + ")";
    }

    public c7(int i, float f10, float f11) {
        this.f26026a = f10;
        this.f26027b = i;
        this.f26028c = f11;
    }
}
