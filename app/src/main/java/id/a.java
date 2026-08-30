package id;

import com.google.android.gms.internal.ads.dr;
import q0.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f18424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18425b;

    /* renamed from: c, reason: collision with root package name */
    public final String f18426c;

    /* renamed from: d, reason: collision with root package name */
    public final String f18427d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f18428f;

    /* renamed from: g, reason: collision with root package name */
    public final String f18429g;

    public a(String str, int i, String str2, String str3, long j10, long j11, String str4) {
        this.f18424a = str;
        this.f18425b = i;
        this.f18426c = str2;
        this.f18427d = str3;
        this.e = j10;
        this.f18428f = j11;
        this.f18429g = str4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.dr] */
    public final dr a() {
        Object obj = new Object();
        obj.f5482a = this.f18424a;
        obj.f5483b = this.f18425b;
        obj.f5484c = this.f18426c;
        obj.f5485d = this.f18427d;
        obj.e = Long.valueOf(this.e);
        obj.f5486f = Long.valueOf(this.f18428f);
        obj.f5487g = this.f18429g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                String str = aVar.f18424a;
                String str2 = this.f18424a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (d.a(this.f18425b, aVar.f18425b)) {
                    String str3 = aVar.f18426c;
                    String str4 = this.f18426c;
                    if (str4 == null) {
                        if (str3 != null) {
                            return false;
                        }
                    } else if (!str4.equals(str3)) {
                        return false;
                    }
                    String str5 = aVar.f18427d;
                    String str6 = this.f18427d;
                    if (str6 == null) {
                        if (str5 != null) {
                            return false;
                        }
                    } else if (!str6.equals(str5)) {
                        return false;
                    }
                    if (this.e == aVar.e && this.f18428f == aVar.f18428f) {
                        String str7 = aVar.f18429g;
                        String str8 = this.f18429g;
                        if (str8 == null) {
                            if (str7 == null) {
                                return true;
                            }
                            return false;
                        }
                        if (str8.equals(str7)) {
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
        int hashCode2;
        int hashCode3;
        int i = 0;
        String str = this.f18424a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int b10 = (((hashCode ^ 1000003) * 1000003) ^ d.b(this.f18425b)) * 1000003;
        String str2 = this.f18426c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (b10 ^ hashCode2) * 1000003;
        String str3 = this.f18427d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        long j10 = this.e;
        int i12 = (i11 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f18428f;
        int i13 = (i12 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f18429g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i ^ i13;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f18424a);
        sb2.append(", registrationStatus=");
        int i = this.f18425b;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            str = "null";
                        } else {
                            str = "REGISTER_ERROR";
                        }
                    } else {
                        str = "REGISTERED";
                    }
                } else {
                    str = "UNREGISTERED";
                }
            } else {
                str = "NOT_GENERATED";
            }
        } else {
            str = "ATTEMPT_MIGRATION";
        }
        sb2.append(str);
        sb2.append(", authToken=");
        sb2.append(this.f18426c);
        sb2.append(", refreshToken=");
        sb2.append(this.f18427d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f18428f);
        sb2.append(", fisError=");
        return a5.a.k(sb2, this.f18429g, "}");
    }
}