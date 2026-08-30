package m2;
import g0.b;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: b, reason: collision with root package name */
    public static final long f20544b = b(0, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20545c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f20546a;

    public /* synthetic */ p0(long j10) {
        this.f20546a = j10;
    }

    public static final boolean a(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    public static final boolean b(long j10) {
        if (((int) (j10 >> 32)) == ((int) (j10 & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static final int c(long j10) {
        return d(j10) - e(j10);
    }

    public static final int d(long j10) {
        return Math.max((int) (j10 >> 32), (int) (j10 & 4294967295L));
    }

    public static final int e(long j10) {
        return Math.min((int) (j10 >> 32), (int) (j10 & 4294967295L));
    }

    public static final boolean f(long j10) {
        if (((int) (j10 >> 32)) > ((int) (j10 & 4294967295L))) {
            return true;
        }
        return false;
    }

    public static String g(long j10) {
        StringBuilder sb2 = new StringBuilder("TextRange(");
        sb2.append((int) (j10 >> 32));
        sb2.append(", ");
        return a5.a.i(sb2, (int) (j10 & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            if (this.f20546a != ((p0) obj).f20546a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20546a);
    }

    public final String toString() {
        return g(this.f20546a);
    }
}
