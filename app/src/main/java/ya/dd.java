package ya;
import qe.k;

/* loaded from: classes.dex */
public abstract class dd {
    public static final Object[] a(Object[] objArr, int i, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        k.g(0, i, 6, objArr, objArr2);
        k.d(i + 2, i, objArr.length, objArr, objArr2);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final Object[] b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 2];
        k.g(0, i, 6, objArr, objArr2);
        k.d(i, i + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] c(Object[] objArr, int i) {
        Object[] objArr2 = new Object[objArr.length - 1];
        k.g(0, i, 6, objArr, objArr2);
        k.d(i, i + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final int d(int i, int i10) {
        return (i >> i10) & 31;
    }
}
