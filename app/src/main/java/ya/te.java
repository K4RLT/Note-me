package ya;
import q.x;
import ue.a;

/* loaded from: classes.dex */
public abstract class te {
    public static String a(String str, int i, int i10) {
        if (i < 0) {
            return a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i10 >= 0) {
            return a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i10));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void b(int i, int i10) {
        String a10;
        if (i >= 0 && i < i10) {
            return;
        }
        if (i >= 0) {
            if (i10 >= 0) {
                a10 = a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i10));
            } else {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("negative size: ");
                sb2.append(i10);
                throw new IllegalArgumentException(sb2.toString());
            }
        } else {
            a10 = a("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(a10);
    }

    public static void c(int i, int i10) {
        if (i >= 0 && i <= i10) {
            return;
        }
        x.l(a("index", i, i10));
    }

    public static void d(int i, int i10, int i11) {
        String a10;
        if (i >= 0 && i10 >= i && i10 <= i11) {
            return;
        }
        if (i >= 0 && i <= i11) {
            if (i10 >= 0 && i10 <= i11) {
                a10 = a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i));
            } else {
                a10 = a("end index", i10, i11);
            }
        } else {
            a10 = a("start index", i, i11);
        }
        throw new IndexOutOfBoundsException(a10);
    }
}
