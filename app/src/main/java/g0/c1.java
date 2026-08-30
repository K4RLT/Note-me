package g0;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: b, reason: collision with root package name */
    public static final c1 f17032b = new c1(63, null);

    /* renamed from: a, reason: collision with root package name */
    public final df.l f17033a;

    public c1(int i, df.l lVar) {
        this.f17033a = (i & 1) != 0 ? null : lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c1) {
            if (this.f17033a == ((c1) obj).f17033a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        df.l lVar = this.f17033a;
        if (lVar != null) {
            i = lVar.hashCode();
        } else {
            i = 0;
        }
        return i * 28629151;
    }
}
