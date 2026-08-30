package jd;

import q0.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f19160a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19161b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19162c;

    /* renamed from: d, reason: collision with root package name */
    public final b f19163d;
    public final int e;

    public a(String str, String str2, String str3, b bVar, int i) {
        this.f19160a = str;
        this.f19161b = str2;
        this.f19162c = str3;
        this.f19163d = bVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                String str = aVar.f19160a;
                String str2 = this.f19160a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                String str3 = aVar.f19161b;
                String str4 = this.f19161b;
                if (str4 == null) {
                    if (str3 != null) {
                        return false;
                    }
                } else if (!str4.equals(str3)) {
                    return false;
                }
                String str5 = aVar.f19162c;
                String str6 = this.f19162c;
                if (str6 == null) {
                    if (str5 != null) {
                        return false;
                    }
                } else if (!str6.equals(str5)) {
                    return false;
                }
                b bVar = aVar.f19163d;
                b bVar2 = this.f19163d;
                if (bVar2 == null) {
                    if (bVar != null) {
                        return false;
                    }
                } else if (!bVar2.equals(bVar)) {
                    return false;
                }
                int i = aVar.e;
                int i10 = this.e;
                if (i10 == 0) {
                    if (i == 0) {
                        return true;
                    }
                    return false;
                }
                if (d.a(i10, i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        String str = this.f19160a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f19161b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f19162c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode3) * 1000003;
        b bVar = this.f19163d;
        if (bVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bVar.hashCode();
        }
        int i13 = (i12 ^ hashCode4) * 1000003;
        int i14 = this.e;
        if (i14 != 0) {
            i = d.b(i14);
        }
        return i ^ i13;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f19160a);
        sb2.append(", fid=");
        sb2.append(this.f19161b);
        sb2.append(", refreshToken=");
        sb2.append(this.f19162c);
        sb2.append(", authToken=");
        sb2.append(this.f19163d);
        sb2.append(", responseCode=");
        int i = this.e;
        if (i != 1) {
            if (i != 2) {
                str = "null";
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}
