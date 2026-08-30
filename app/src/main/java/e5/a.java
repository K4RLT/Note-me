package e5;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15911a;

    public a(boolean z3) {
        this.f15911a = z3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof a) && this.f15911a == ((a) obj).f15911a) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15911a) + 1169068184;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=com.google.android.gms.ads, shouldRecordObservation=" + this.f15911a;
    }
}
