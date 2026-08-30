package r0;
import l.b;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public abstract class d2 {
    public static final int a(ArrayList arrayList, int i, int i10) {
        int d2 = d(arrayList, i, i10);
        if (d2 >= 0) {
            return d2;
        }
        return -(d2 + 1);
    }

    public static final int b(int i, int[] iArr) {
        int i10 = i * 5;
        return Integer.bitCount(iArr[i10 + 1] >> 28) + iArr[i10 + 4];
    }

    public static final void c(int[] iArr, int i, int i10) {
        if (i10 >= 0) {
        }
        int i11 = (i * 5) + 1;
        iArr[i11] = i10 | (iArr[i11] & (-67108864));
    }

    public static final int d(ArrayList arrayList, int i, int i10) {
        int size = arrayList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int i13 = ((a) arrayList.get(i12)).f24176a;
            if (i13 < 0) {
                i13 += i10;
            }
            int b10 = kotlin.jvm.internal.b(i13, i);
            if (b10 < 0) {
                i11 = i12 + 1;
            } else if (b10 > 0) {
                size = i12 - 1;
            } else {
                return i12;
            }
        }
        return -(i11 + 1);
    }

    public static final void e() {
        throw new ConcurrentModificationException();
    }
}
