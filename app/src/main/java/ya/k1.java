package ya;
import o2.d;

/* loaded from: classes.dex */
public abstract class k1 implements d {
    public abstract int a(int i);

    public abstract int b(int i);

    @Override // d
    public int g(int i) {
        int a10 = a(i);
        if (a10 == -1 || a(a10) == -1) {
            return -1;
        }
        return a10;
    }

    @Override // d
    public int h(int i) {
        int b10 = b(i);
        if (b10 == -1 || b(b10) == -1) {
            return -1;
        }
        return b10;
    }

    @Override // d
    public int i(int i) {
        return b(i);
    }

    @Override // d
    public int j(int i) {
        return a(i);
    }
}
