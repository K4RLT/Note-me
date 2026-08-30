package k1;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f19529b = l0.k(0.5f, 0.5f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f19530c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f19531a;

    public static final boolean a(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static String b(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t0) {
            if (this.f19531a != ((t0) obj).f19531a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19531a);
    }

    public final String toString() {
        return b(this.f19531a);
    }
}
