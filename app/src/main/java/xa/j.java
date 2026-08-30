package xa;
import p.a;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f30433a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30434b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30435c;

    public j(Object obj, Object obj2, Object obj3) {
        this.f30433a = obj;
        this.f30434b = obj2;
        this.f30435c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f30433a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f30434b);
        return new IllegalArgumentException(a.o(a.q("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(obj), "=", String.valueOf(this.f30435c)));
    }
}
