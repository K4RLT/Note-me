package je;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f19171a;

    public a(b bVar) {
        this.f19171a = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && this.f19171a.equals(((a) obj).f19171a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f19171a.hashCode() ^ 1000003) * 1000003) ^ 10) * 1000003;
    }

    public final String toString() {
        return p.a.k("DigitalInkRecognizerOptions{model=", String.valueOf(this.f19171a), ", maxResultCount=10, executor=null}");
    }
}
