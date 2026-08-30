package j6;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f18916a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f18917b;

    public d(String str, Long l10) {
        this.f18916a = str;
        this.f18917b = l10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!this.f18916a.equals(dVar.f18916a) || !this.f18917b.equals(dVar.f18917b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f18917b.hashCode() + (this.f18916a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.f18916a + ", value=" + this.f18917b + ')';
    }
}
