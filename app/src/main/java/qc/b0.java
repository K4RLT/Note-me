package qc;

/* loaded from: classes.dex */
public final class b0 extends m2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f23703b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23704c;

    /* renamed from: d, reason: collision with root package name */
    public final int f23705d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23706f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23707g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23708h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public final String f23709j;

    /* renamed from: k, reason: collision with root package name */
    public final l2 f23710k;

    /* renamed from: l, reason: collision with root package name */
    public final r1 f23711l;

    /* renamed from: m, reason: collision with root package name */
    public final o1 f23712m;

    public b0(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, l2 l2Var, r1 r1Var, o1 o1Var) {
        this.f23703b = str;
        this.f23704c = str2;
        this.f23705d = i;
        this.e = str3;
        this.f23706f = str4;
        this.f23707g = str5;
        this.f23708h = str6;
        this.i = str7;
        this.f23709j = str8;
        this.f23710k = l2Var;
        this.f23711l = r1Var;
        this.f23712m = o1Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, qc.a0] */
    public final a0 a() {
        Object obj = new Object();
        obj.f23678a = this.f23703b;
        obj.f23679b = this.f23704c;
        obj.f23680c = this.f23705d;
        obj.f23681d = this.e;
        obj.e = this.f23706f;
        obj.f23682f = this.f23707g;
        obj.f23683g = this.f23708h;
        obj.f23684h = this.i;
        obj.i = this.f23709j;
        obj.f23685j = this.f23710k;
        obj.f23686k = this.f23711l;
        obj.f23687l = this.f23712m;
        obj.f23688m = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m2) {
            b0 b0Var = (b0) ((m2) obj);
            if (this.f23703b.equals(b0Var.f23703b) && this.f23704c.equals(b0Var.f23704c) && this.f23705d == b0Var.f23705d && this.e.equals(b0Var.e)) {
                String str = b0Var.f23706f;
                String str2 = this.f23706f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = b0Var.f23707g;
                    String str4 = this.f23707g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = b0Var.f23708h;
                        String str6 = this.f23708h;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            if (this.i.equals(b0Var.i) && this.f23709j.equals(b0Var.f23709j)) {
                                l2 l2Var = b0Var.f23710k;
                                l2 l2Var2 = this.f23710k;
                                if (l2Var2 != null ? l2Var2.equals(l2Var) : l2Var == null) {
                                    r1 r1Var = b0Var.f23711l;
                                    r1 r1Var2 = this.f23711l;
                                    if (r1Var2 != null ? r1Var2.equals(r1Var) : r1Var == null) {
                                        o1 o1Var = b0Var.f23712m;
                                        o1 o1Var2 = this.f23712m;
                                        if (o1Var2 != null ? o1Var2.equals(o1Var) : o1Var == null) {
                                            return true;
                                        }
                                    }
                                }
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
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.f23703b.hashCode() ^ 1000003) * 1000003) ^ this.f23704c.hashCode()) * 1000003) ^ this.f23705d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = 0;
        String str = this.f23706f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.f23707g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode2) * 1000003;
        String str3 = this.f23708h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i11 ^ hashCode3) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.f23709j.hashCode()) * 1000003;
        l2 l2Var = this.f23710k;
        if (l2Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = l2Var.hashCode();
        }
        int i12 = (hashCode7 ^ hashCode4) * 1000003;
        r1 r1Var = this.f23711l;
        if (r1Var == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = r1Var.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        o1 o1Var = this.f23712m;
        if (o1Var != null) {
            i = o1Var.hashCode();
        }
        return i13 ^ i;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f23703b + ", gmpAppId=" + this.f23704c + ", platform=" + this.f23705d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f23706f + ", firebaseAuthenticationToken=" + this.f23707g + ", appQualitySessionId=" + this.f23708h + ", buildVersion=" + this.i + ", displayVersion=" + this.f23709j + ", session=" + this.f23710k + ", ndkPayload=" + this.f23711l + ", appExitInfo=" + this.f23712m + "}";
    }
}