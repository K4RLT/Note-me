package ya;
import q.x;

/* loaded from: classes.dex */
public abstract class nd {
    public static final int a(int i, int i10, int i11) {
        if (i11 > 0) {
            if (i < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
        } else if (i11 < 0) {
            if (i > i10) {
                int i15 = -i11;
                int i16 = i % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i18 + i10;
            }
        } else {
            x.n("Step is zero.");
            return 0;
        }
        return i10;
    }
}
