package qc;

import java.util.List;

/* loaded from: classes.dex */
public final class g0 extends r1 {

    /* renamed from: a, reason: collision with root package name */
    public final List f23776a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23777b;

    public g0(List list, String str) {
        this.f23776a = list;
        this.f23777b = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof r1) {
                g0 g0Var = (g0) ((r1) obj);
                if (this.f23776a.equals(g0Var.f23776a)) {
                    String str = g0Var.f23777b;
                    String str2 = this.f23777b;
                    if (str2 == null) {
                        if (str == null) {
                            return true;
                        }
                        return false;
                    }
                    if (str2.equals(str)) {
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
        int hashCode2 = (this.f23776a.hashCode() ^ 1000003) * 1000003;
        String str = this.f23777b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f23776a);
        sb2.append(", orgId=");
        return a5.a.k(sb2, this.f23777b, "}");
    }
}
