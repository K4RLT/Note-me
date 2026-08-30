package pc;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f22660c = new h(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f22661a;

    /* renamed from: b, reason: collision with root package name */
    public final int f22662b;

    public h(int i, int i10) {
        this.f22661a = i;
        this.f22662b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(h.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f22661a);
        sb2.append(", length = ");
        return p.a.j(this.f22662b, "]", sb2);
    }
}
