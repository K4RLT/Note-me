package jd;

import b0.e1;
import q0.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f19164a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19165b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19166c;

    public b(String str, long j10, int i) {
        this.f19164a = str;
        this.f19165b = j10;
        this.f19166c = i;
    }

    public static e1 a() {
        e1 e1Var = new e1(9, (char) 0);
        e1Var.f1181d = 0L;
        return e1Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                String str = bVar.f19164a;
                String str2 = this.f19164a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f19165b == bVar.f19165b) {
                    int i = bVar.f19166c;
                    int i10 = this.f19166c;
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.f19164a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j10 = this.f19165b;
        int i10 = (((hashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003;
        int i11 = this.f19166c;
        if (i11 != 0) {
            i = d.b(i11);
        }
        return i ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f19164a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f19165b);
        sb2.append(", responseCode=");
        int i = this.f19166c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "null";
                } else {
                    str = "AUTH_ERROR";
                }
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
