package ya;

/* loaded from: classes.dex */
public abstract class ac {
    public static int a(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static int b(int i, int... iArr) {
        for (int i10 : iArr) {
            i = Math.max(i, i10);
        }
        return i;
    }
}
