package b8;
import j1.c;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    public final ca f2377a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2378b;

    /* renamed from: c, reason: collision with root package name */
    public final c f2379c;

    public lb(ca caVar, int i, c cVar) {
        this.f2377a = caVar;
        this.f2378b = i;
        this.f2379c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lb) {
                lb lbVar = (lb) obj;
                if (!this.f2377a.equals(lbVar.f2377a) || this.f2378b != lbVar.f2378b || !kotlin.jvm.internal.a(this.f2379c, lbVar.f2379c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int b10 = a.b(this.f2378b, this.f2377a.hashCode() * 31, 31);
        c cVar = this.f2379c;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        return b10 + hashCode;
    }

    public final String toString() {
        return "ViewerRequest(listing=" + this.f2377a + ", index=" + this.f2378b + ", from=" + this.f2379c + ")";
    }
}
