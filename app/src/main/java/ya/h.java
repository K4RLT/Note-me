package ya;
import oe.a;
import ya.e;
import ya.i;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: w, reason: collision with root package name */
    public final transient int f31312w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f31313x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f31314y;

    public h(i iVar, int i, int i10) {
        this.f31314y = iVar;
        this.f31312w = i;
        this.f31313x = i10;
    }

    @Override // e
    public final int b() {
        return this.f31314y.d() + this.f31312w + this.f31313x;
    }

    @Override // e
    public final int d() {
        return this.f31314y.d() + this.f31312w;
    }

    @Override // e
    public final Object[] g() {
        return this.f31314y.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        a(i, this.f31313x);
        return this.f31314y.get(i + this.f31312w);
    }

    @Override // i, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final i subList(int i, int i10) {
        oe.b(i, i10, this.f31313x);
        int i11 = this.f31312w;
        return this.f31314y.subList(i + i11, i10 + i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31313x;
    }
}
