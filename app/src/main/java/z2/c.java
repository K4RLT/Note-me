package z2;
import c.j;

import java.util.Arrays;
import q.x;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f31908a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f31909b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length == fArr2.length && fArr.length != 0) {
            this.f31908a = fArr;
            this.f31909b = fArr2;
        } else {
            x.n("Array lengths must match and be nonzero");
            throw null;
        }
    }

    @Override // z2.a
    public final float a(float f10) {
        return mc.j(f10, this.f31909b, this.f31908a);
    }

    @Override // z2.a
    public final float b(float f10) {
        return mc.j(f10, this.f31908a, this.f31909b);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof c)) {
                c cVar = (c) obj;
                if (Arrays.equals(this.f31908a, cVar.f31908a) && Arrays.equals(this.f31909b, cVar.f31909b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f31909b) + (Arrays.hashCode(this.f31908a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f31908a);
        arrays.getClass();
        sb2.append(arrays);
        sb2.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f31909b);
        arrays2.getClass();
        sb2.append(arrays2);
        sb2.append('}');
        return sb2.toString();
    }
}
