package wa;

/* loaded from: classes.dex */
public abstract class u {
    public static int a(int i) {
        int[] iArr = {1, 2, 3};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 - 1;
            if (i11 != 0) {
                if (i12 == i) {
                    return i11;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }
}
