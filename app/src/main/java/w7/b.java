package w7;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f27912a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27913b;

    public b(String str, int i) {
        this.f27912a = str;
        this.f27913b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (kotlin.jvm.internal.l.a(this.f27912a, bVar.f27912a) && this.f27913b == bVar.f27913b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f27912a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.f27913b) + (hashCode * 31);
    }

    public final String toString() {
        return "Target(notebookId=" + this.f27912a + ", spreadIndex=" + this.f27913b + ")";
    }
}
