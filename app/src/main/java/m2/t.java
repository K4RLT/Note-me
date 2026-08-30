package m2;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final u2.c f20568a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20569b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20570c;

    public t(u2.c cVar, int i, int i10) {
        this.f20568a = cVar;
        this.f20569b = i;
        this.f20570c = i10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t) {
                t tVar = (t) obj;
                if (!this.f20568a.equals(tVar.f20568a) || this.f20569b != tVar.f20569b || this.f20570c != tVar.f20570c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20570c) + p.a.b(this.f20569b, this.f20568a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f20568a);
        sb2.append(", startIndex=");
        sb2.append(this.f20569b);
        sb2.append(", endIndex=");
        return a5.a.i(sb2, this.f20570c, ')');
    }
}
