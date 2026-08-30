package ya;
import qe.f;

/* loaded from: classes.dex */
public abstract class ib {
    public static final String a(Object[] objArr, int i, int i10, f fVar) {
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 2);
        sb2.append("[");
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i + i11];
            if (obj == fVar) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public static final void b(Object[] objArr, int i, int i10) {
        objArr.getClass();
        while (i < i10) {
            objArr[i] = null;
            i++;
        }
    }
}
