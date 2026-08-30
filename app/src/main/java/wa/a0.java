package wa;
import b0.a;
import q.x;

/* loaded from: classes.dex */
public abstract class a0 {
    public static void a(int i, int i10) {
        String a10;
        if (i >= 0 && i < i10) {
            return;
        }
        if (i >= 0) {
            if (i10 < 0) {
                x.n(a.g(i10, "negative size: "));
                return;
            }
            a10 = a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
        } else {
            a10 = a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(a10);
    }

    public static void b(int i, int i10) {
        if (i >= 0 && i <= i10) {
            return;
        }
        x.l(d("index", i, i10));
    }

    public static void c(int i, int i10, int i11) {
        String d2;
        if (i >= 0 && i10 >= i && i10 <= i11) {
            return;
        }
        if (i >= 0 && i <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                d2 = a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            } else {
                d2 = d("end index", i10, i11);
            }
        } else {
            d2 = d("start index", i, i11);
        }
        throw new IndexOutOfBoundsException(d2);
    }

    public static String d(String str, int i, int i10) {
        if (i < 0) {
            return a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        x.n(a.g(i10, "negative size: "));
        return null;
    }
}
