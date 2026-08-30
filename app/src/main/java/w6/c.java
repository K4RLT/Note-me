package w6;
import f.c;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f27712a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f27713b;

    public c(float[] fArr, int[] iArr) {
        this.f27712a = fArr;
        this.f27713b = iArr;
    }

    public final void a(c cVar) {
        int i = 0;
        while (true) {
            int[] iArr = cVar.f27713b;
            if (i < iArr.length) {
                this.f27712a[i] = cVar.f27712a[i];
                this.f27713b[i] = iArr[i];
                i++;
            } else {
                return;
            }
        }
    }

    public final c b(float[] fArr) {
        int c10;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f10 = fArr[i];
            float[] fArr2 = this.f27712a;
            int binarySearch = Arrays.binarySearch(fArr2, f10);
            int[] iArr2 = this.f27713b;
            if (binarySearch >= 0) {
                c10 = iArr2[binarySearch];
            } else {
                int i10 = -(binarySearch + 1);
                if (i10 == 0) {
                    c10 = iArr2[0];
                } else if (i10 == iArr2.length - 1) {
                    c10 = iArr2[iArr2.length - 1];
                } else {
                    int i11 = i10 - 1;
                    float f11 = fArr2[i11];
                    c10 = j6.f.c(iArr2[i11], iArr2[i10], (f10 - f11) / (fArr2[i10] - f11));
                }
            }
            iArr[i] = c10;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && c.class == obj.getClass()) {
                c cVar = (c) obj;
                if (Arrays.equals(this.f27712a, cVar.f27712a) && Arrays.equals(this.f27713b, cVar.f27713b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27713b) + (Arrays.hashCode(this.f27712a) * 31);
    }
}
