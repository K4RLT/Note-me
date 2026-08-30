package m8;

/* loaded from: classes.dex */
public final class q extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f20739a;

    public q(Integer num) {
        this.f20739a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        Integer num = this.f20739a;
        q qVar = (q) ((c0) obj);
        if (num == null) {
            if (qVar.f20739a == null) {
                return true;
            }
            return false;
        }
        return num.equals(qVar.f20739a);
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.f20739a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f20739a + "}";
    }
}
