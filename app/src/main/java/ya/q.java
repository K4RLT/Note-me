package ya;
import oe.a;

/* loaded from: classes.dex */
public final class q extends i {

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f31444w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f31445x;

    /* renamed from: y, reason: collision with root package name */
    public final transient int f31446y = 1;

    public q(Object[] objArr, int i) {
        this.f31444w = objArr;
        this.f31445x = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        a(i, this.f31446y);
        Object obj = this.f31444w[i + i + this.f31445x];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31446y;
    }
}
