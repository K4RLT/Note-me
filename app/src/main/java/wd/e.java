package wd;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f29893a;

    public e(String str) {
        this.f29893a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof e) || !this.f29893a.equals(((e) obj).f29893a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f29893a.hashCode();
    }

    public final String toString() {
        return p.a.n(new StringBuilder("SessionDetails(sessionId="), this.f29893a, ')');
    }
}
