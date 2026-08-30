package x2;
import a.a;
import r.d;
import r.i;

import pe.u;

/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final long f30045a;

    public c(long j10) {
        this.f30045a = j10;
        if (j10 != 16) {
            return;
        }
        s2.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // x2.o
    public final float a() {
        return k1.d(this.f30045a);
    }

    @Override // x2.o
    public final long b() {
        return this.f30045a;
    }

    @Override // x2.o
    public final k1.n c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                long j10 = ((c) obj).f30045a;
                int i = k1.r.f19522m;
                if (!u.a(this.f30045a, j10)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = k1.r.f19522m;
        return Long.hashCode(this.f30045a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) k1.i(this.f30045a)) + ')';
    }
}
