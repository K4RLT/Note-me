package k1;
import q.x;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t extends s {

    /* renamed from: b, reason: collision with root package name */
    public float[] f19528b;

    public final float[] a() {
        float[] fArr = this.f19528b;
        if (fArr == null) {
            ColorFilter colorFilter = this.f19525a;
            if ((colorFilter instanceof ColorMatrixColorFilter) && 26 <= Build.VERSION.SDK_INT) {
                ColorMatrix colorMatrix = new ColorMatrix();
                ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
                float[] array = colorMatrix.getArray();
                this.f19528b = array;
                return array;
            }
            x.n("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            return null;
        }
        return fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && Arrays.equals(a(), ((t) obj).a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.f19528b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f19528b;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
