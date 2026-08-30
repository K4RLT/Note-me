package qc;

/* loaded from: classes.dex */
public final class k0 extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23837a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23838b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23839c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23840d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23841f;

    public k0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f23837a = str;
        this.f23838b = str2;
        this.f23839c = str3;
        this.f23840d = str4;
        this.e = str5;
        this.f23841f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            k0 k0Var = (k0) ((t1) obj);
            if (this.f23837a.equals(k0Var.f23837a) && this.f23838b.equals(k0Var.f23838b)) {
                String str = k0Var.f23839c;
                String str2 = this.f23839c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = k0Var.f23840d;
                    String str4 = this.f23840d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = k0Var.e;
                        String str6 = this.e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = k0Var.f23841f;
                            String str8 = this.f23841f;
                            if (str8 != null ? str8.equals(str7) : str7 == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f23837a.hashCode() ^ 1000003) * 1000003) ^ this.f23838b.hashCode()) * 1000003;
        int i = 0;
        String str = this.f23839c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode4 ^ hashCode) * (-721379959);
        String str2 = this.f23840d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        String str4 = this.f23841f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i12 ^ i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f23837a);
        sb2.append(", version=");
        sb2.append(this.f23838b);
        sb2.append(", displayVersion=");
        sb2.append(this.f23839c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f23840d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.e);
        sb2.append(", developmentPlatformVersion=");
        return a5.a.k(sb2, this.f23841f, "}");
    }
}
