package ya;
import oe.a;
import ya.e;
import ya.i;

/* loaded from: classes.dex */
public final class m extends i {

    /* renamed from: y, reason: collision with root package name */
    public static final m f31368y = new m(new Object[0], 0);

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f31369w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f31370x;

    public m(Object[] objArr, int i) {
        this.f31369w = objArr;
        this.f31370x = i;
    }

    @Override // i, e
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f31369w;
        int i = this.f31370x;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // e
    public final int b() {
        return this.f31370x;
    }

    @Override // e
    public final int d() {
        return 0;
    }

    @Override // e
    public final Object[] g() {
        return this.f31369w;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a(i, this.f31370x);
        Object obj = this.f31369w[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31370x;
    }
}
