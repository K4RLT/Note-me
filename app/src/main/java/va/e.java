package va;
import p.a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Object f27478a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f27479b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f27480c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f27478a = obj;
        this.f27479b = obj2;
        this.f27480c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f27478a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f27479b);
        return new IllegalArgumentException(a.o(a.q("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f27480c)));
    }
}
