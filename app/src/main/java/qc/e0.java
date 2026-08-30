package qc;

/* loaded from: classes.dex */
public final class e0 extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23755a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23756b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23757c;

    public e0(String str, String str2, String str3) {
        this.f23755a = str;
        this.f23756b = str2;
        this.f23757c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n1) {
            e0 e0Var = (e0) ((n1) obj);
            if (this.f23755a.equals(e0Var.f23755a) && this.f23756b.equals(e0Var.f23756b) && this.f23757c.equals(e0Var.f23757c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f23755a.hashCode() ^ 1000003) * 1000003) ^ this.f23756b.hashCode()) * 1000003) ^ this.f23757c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f23755a);
        sb2.append(", libraryName=");
        sb2.append(this.f23756b);
        sb2.append(", buildId=");
        return a5.a.k(sb2, this.f23757c, "}");
    }
}
