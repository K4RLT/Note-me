package q7;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f23570a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23571b;

    /* renamed from: c, reason: collision with root package name */
    public final d f23572c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23573d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23574f;

    public h(int i, int i10, d dVar, int i11, int i12, int i13) {
        dVar.getClass();
        this.f23570a = i;
        this.f23571b = i10;
        this.f23572c = dVar;
        this.f23573d = i11;
        this.e = i12;
        this.f23574f = i13;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.f23570a != hVar.f23570a || this.f23571b != hVar.f23571b || this.f23572c != hVar.f23572c || this.f23573d != hVar.f23573d || this.e != hVar.e || this.f23574f != hVar.f23574f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f23574f) + p.a.b(this.e, p.a.b(this.f23573d, (this.f23572c.hashCode() + p.a.b(this.f23571b, Integer.hashCode(this.f23570a) * 31, 31)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder n10 = g3.a.n("ReengageStep(id=", this.f23570a, ", afterDays=", ", kind=", this.f23571b);
        n10.append(this.f23572c);
        n10.append(", titles=");
        n10.append(this.f23573d);
        n10.append(", bodiesPersonal=");
        n10.append(this.e);
        n10.append(", bodiesGeneric=");
        n10.append(this.f23574f);
        n10.append(")");
        return n10.toString();
    }
}
