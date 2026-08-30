package oc;
import q.h;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f21870a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21871b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21872c;

    public b(String str, String str2, String str3) {
        if (str != null) {
            this.f21870a = str;
            this.f21871b = str2;
            this.f21872c = str3;
            return;
        }
        g5.h("Null crashlyticsInstallId");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f21870a.equals(bVar.f21870a)) {
                String str = bVar.f21871b;
                String str2 = this.f21871b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = bVar.f21872c;
                    String str4 = this.f21872c;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f21870a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        String str = this.f21871b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f21872c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i10 ^ i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb2.append(this.f21870a);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f21871b);
        sb2.append(", firebaseAuthenticationToken=");
        return a5.a.k(sb2, this.f21872c, "}");
    }
}
