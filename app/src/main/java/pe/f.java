package pe;

/* loaded from: classes.dex */
public final class f implements Comparable {

    /* renamed from: v, reason: collision with root package name */
    public static final f f22688v = new f();

    /* renamed from: u, reason: collision with root package name */
    public final int f22689u = 131840;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        fVar.getClass();
        return this.f22689u - fVar.f22689u;
    }

    public final boolean equals(Object obj) {
        f fVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            fVar = (f) obj;
        } else {
            fVar = null;
        }
        if (fVar != null && this.f22689u == fVar.f22689u) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22689u;
    }

    public final String toString() {
        return "2.3.0";
    }
}
