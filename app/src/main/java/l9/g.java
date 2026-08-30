package l9;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f20046a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20047b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20048c;

    public g(int i, int i10, boolean z3) {
        this.f20046a = i;
        this.f20047b = i10;
        this.f20048c = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f20046a == gVar.f20046a && this.f20047b == gVar.f20047b && this.f20048c == gVar.f20048c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.f20048c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return i ^ ((((this.f20046a ^ 1000003) * 1000003) ^ this.f20047b) * 1000003);
    }

    public final String toString() {
        int i = this.f20046a;
        int length = String.valueOf(i).length();
        int i10 = this.f20047b;
        int length2 = String.valueOf(i10).length();
        boolean z3 = this.f20048c;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z3).length() + 1);
        g3.a.r(i, i10, "OfflineAdConfig{impressionPrerequisite=", ", clickPrerequisite=", sb2);
        sb2.append(", notificationFlowEnabled=");
        sb2.append(z3);
        sb2.append("}");
        return sb2.toString();
    }
}
