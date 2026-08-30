package l1;
import b.a;
import b.b;
import p.a;

import q.x;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f19810a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19811b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19812c;

    public c(String str, long j10, int i) {
        this.f19810a = str;
        this.f19811b = j10;
        this.f19812c = i;
        if (str.length() != 0) {
            if (i >= -1 && i <= 63) {
                return;
            }
            x.n("The id must be between -1 and 63");
            throw null;
        }
        x.n("The name of a color space cannot be null and must contain at least 1 character");
        throw null;
    }

    public abstract float a(int i);

    public abstract float b(int i);

    public boolean c() {
        return false;
    }

    public abstract long d(float f10, float f11, float f12);

    public abstract float e(float f10, float f11, float f12);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f19812c == cVar.f19812c && this.f19810a.equals(cVar.f19810a)) {
                return a(this.f19811b, cVar.f19811b);
            }
            return false;
        }
        return false;
    }

    public abstract long f(float f10, float f11, float f12, float f13, c cVar);

    public int hashCode() {
        int hashCode = this.f19810a.hashCode() * 31;
        int i = b.e;
        return a.d(this.f19811b, hashCode, 31) + this.f19812c;
    }

    public final String toString() {
        return this.f19810a + " (id=" + this.f19812c + ", model=" + ((Object) b(this.f19811b)) + ')';
    }
}
