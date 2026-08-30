package oc;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f21944a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21945b;

    public v(String str, String str2) {
        this.f21944a = str;
        this.f21945b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (kotlin.jvm.internal.a(this.f21944a, vVar.f21944a) && kotlin.jvm.internal.a(this.f21945b, vVar.f21945b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.f21944a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        String str2 = this.f21945b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i10 + i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f21944a);
        sb2.append(", authToken=");
        return a.n(sb2, this.f21945b, ')');
    }
}
