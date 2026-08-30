package je;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f19185a;

    /* renamed from: b, reason: collision with root package name */
    public final e f19186b;

    public i(String str, e eVar) {
        this.f19185a = str;
        this.f19186b = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof i) {
                i iVar = (i) obj;
                if (this.f19185a.equals(iVar.f19185a) && this.f19186b.equals(iVar.f19186b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f19185a.hashCode() ^ 1000003) * 1000003) ^ this.f19186b.hashCode();
    }

    public final String toString() {
        return a5.a.l(new StringBuilder("RecognitionContext{preContext="), this.f19185a, ", writingArea=", String.valueOf(this.f19186b), "}");
    }
}
