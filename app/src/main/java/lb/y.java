package lb;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final y f20304d = new y(null, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f20305a;

    /* renamed from: b, reason: collision with root package name */
    public final String f20306b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20307c;

    public y(String str, int i, String str2) {
        this.f20305a = i;
        this.f20306b = str;
        this.f20307c = str2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                if (this.f20305a == yVar.f20305a) {
                    String str = yVar.f20306b;
                    String str2 = this.f20306b;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    String str3 = yVar.f20307c;
                    String str4 = this.f20307c;
                    if (str4 == null) {
                        if (str3 == null) {
                            return true;
                        }
                        return false;
                    }
                    if (str4.equals(str3)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.f20306b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        String str2 = this.f20307c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i ^ ((hashCode ^ ((this.f20305a ^ 1000003) * 1000003)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AssetPackLocation{packStorageMethod=");
        sb2.append(this.f20305a);
        sb2.append(", path=");
        sb2.append(this.f20306b);
        sb2.append(", assetsPath=");
        return a5.a.k(sb2, this.f20307c, "}");
    }
}
