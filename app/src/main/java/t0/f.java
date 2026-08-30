package t0;

import java.util.List;

/* loaded from: classes.dex */
public abstract class f {
    public static final void a(int i, List list) {
        int size = list.size();
        if (i >= 0 && i < size) {
            return;
        }
        c(i, size);
    }

    public static final void b(int i, int i10, List list) {
        if (i > i10) {
            f(i, i10);
        }
        if (i < 0) {
            d(i);
        }
        if (i10 > list.size()) {
            e(i10, list.size());
        }
    }

    private static final void c(int i, int i10) {
        throw new IndexOutOfBoundsException(g3.a.j("Index ", i, " is out of bounds. The list has ", " elements.", i10));
    }

    private static final void d(int i) {
        throw new IndexOutOfBoundsException(g3.a.i("fromIndex (", i, ") is less than 0."));
    }

    private static final void e(int i, int i10) {
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is more than than the list size (" + i10 + ')');
    }

    private static final void f(int i, int i10) {
        throw new IllegalArgumentException(g3.a.j("Indices are out of order. fromIndex (", i, ") is greater than toIndex (", ").", i10));
    }
}
