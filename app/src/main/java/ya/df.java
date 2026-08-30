package ya;
import q.f;
import g5.q;

/* loaded from: classes.dex */
public abstract class df {
    public static int a(int i, int i10) {
        if (i10 >= 0) {
            int i11 = i + (i >> 1) + 1;
            if (i11 < i10) {
                i11 = Integer.highestOneBit(i10 - 1) << 1;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }
        q.f("cannot store more than MAX_VALUE elements");
        return 0;
    }
}
