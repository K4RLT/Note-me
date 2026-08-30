package pe;
import l.c;

import ya.x0;

/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public final long f22710u;

    public /* synthetic */ u(long j10) {
        this.f22710u = j10;
    }

    public static final boolean a(long j10, long j11) {
        if (j10 == j11) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return kotlin.jvm.internal.c(this.f22710u ^ Long.MIN_VALUE, ((u) obj).f22710u ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            if (this.f22710u != ((u) obj).f22710u) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f22710u);
    }

    public final String toString() {
        long j10 = this.f22710u;
        if (j10 >= 0) {
            x0.a(10);
            String l10 = Long.toString(j10, 10);
            l10.getClass();
            return l10;
        }
        long j11 = 10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        x0.a(10);
        String l11 = Long.toString(j12, 10);
        l11.getClass();
        x0.a(10);
        String l12 = Long.toString(j13, 10);
        l12.getClass();
        return l11.concat(l12);
    }
}
