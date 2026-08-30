package m8;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f20748a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20749b;

    /* renamed from: c, reason: collision with root package name */
    public final n f20750c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f20751d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f20752f;

    public t(long j10, long j11, n nVar, Integer num, String str, ArrayList arrayList) {
        j0 j0Var = j0.f20719u;
        this.f20748a = j10;
        this.f20749b = j11;
        this.f20750c = nVar;
        this.f20751d = num;
        this.e = str;
        this.f20752f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof f0) {
                t tVar = (t) ((f0) obj);
                if (this.f20748a == tVar.f20748a && this.f20749b == tVar.f20749b && this.f20750c.equals(tVar.f20750c)) {
                    Integer num = tVar.f20751d;
                    Integer num2 = this.f20751d;
                    if (num2 == null) {
                        if (num != null) {
                            return false;
                        }
                    } else if (!num2.equals(num)) {
                        return false;
                    }
                    String str = tVar.e;
                    String str2 = this.e;
                    if (str2 == null) {
                        if (str != null) {
                            return false;
                        }
                    } else if (!str2.equals(str)) {
                        return false;
                    }
                    if (this.f20752f.equals(tVar.f20752f)) {
                        Object obj2 = j0.f20719u;
                        if (obj2.equals(obj2)) {
                            return true;
                        }
                        return false;
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
        long j10 = this.f20748a;
        long j11 = this.f20749b;
        int hashCode2 = (((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f20750c.hashCode()) * 1000003;
        int i = 0;
        Integer num = this.f20751d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (hashCode2 ^ hashCode) * 1000003;
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((i10 ^ i) * 1000003) ^ this.f20752f.hashCode()) * 1000003) ^ j0.f20719u.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f20748a + ", requestUptimeMs=" + this.f20749b + ", clientInfo=" + this.f20750c + ", logSource=" + this.f20751d + ", logSourceName=" + this.e + ", logEvents=" + this.f20752f + ", qosTier=" + j0.f20719u + "}";
    }
}
