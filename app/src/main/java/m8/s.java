package m8;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s extends e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f20741a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f20742b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f20743c;

    /* renamed from: d, reason: collision with root package name */
    public final long f20744d;
    public final byte[] e;

    /* renamed from: f, reason: collision with root package name */
    public final String f20745f;

    /* renamed from: g, reason: collision with root package name */
    public final long f20746g;

    /* renamed from: h, reason: collision with root package name */
    public final i0 f20747h;
    public final b0 i;

    public s(long j10, Integer num, a0 a0Var, long j11, byte[] bArr, String str, long j12, i0 i0Var, b0 b0Var) {
        this.f20741a = j10;
        this.f20742b = num;
        this.f20743c = a0Var;
        this.f20744d = j11;
        this.e = bArr;
        this.f20745f = str;
        this.f20746g = j12;
        this.f20747h = i0Var;
        this.i = b0Var;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            s sVar = (s) e0Var;
            if (this.f20741a == sVar.f20741a) {
                Integer num = sVar.f20742b;
                Integer num2 = this.f20742b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    a0 a0Var = sVar.f20743c;
                    a0 a0Var2 = this.f20743c;
                    if (a0Var2 != null ? a0Var2.equals(a0Var) : a0Var == null) {
                        if (this.f20744d == sVar.f20744d) {
                            if (e0Var instanceof s) {
                                bArr = ((s) e0Var).e;
                            } else {
                                bArr = sVar.e;
                            }
                            if (Arrays.equals(this.e, bArr)) {
                                String str = sVar.f20745f;
                                String str2 = this.f20745f;
                                if (str2 != null ? str2.equals(str) : str == null) {
                                    if (this.f20746g == sVar.f20746g) {
                                        i0 i0Var = sVar.f20747h;
                                        i0 i0Var2 = this.f20747h;
                                        if (i0Var2 != null ? i0Var2.equals(i0Var) : i0Var == null) {
                                            b0 b0Var = sVar.i;
                                            b0 b0Var2 = this.i;
                                            if (b0Var2 != null ? b0Var2.equals(b0Var) : b0Var == null) {
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
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j10 = this.f20741a;
        int i = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        int i10 = 0;
        Integer num = this.f20742b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (i ^ hashCode) * 1000003;
        a0 a0Var = this.f20743c;
        if (a0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = a0Var.hashCode();
        }
        int i12 = (i11 ^ hashCode2) * 1000003;
        long j11 = this.f20744d;
        int hashCode5 = (((i12 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f20745f;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i13 = (hashCode5 ^ hashCode3) * 1000003;
        long j12 = this.f20746g;
        int i14 = (i13 ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        i0 i0Var = this.f20747h;
        if (i0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = i0Var.hashCode();
        }
        int i15 = (i14 ^ hashCode4) * 1000003;
        b0 b0Var = this.i;
        if (b0Var != null) {
            i10 = b0Var.hashCode();
        }
        return i15 ^ i10;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f20741a + ", eventCode=" + this.f20742b + ", complianceData=" + this.f20743c + ", eventUptimeMs=" + this.f20744d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f20745f + ", timezoneOffsetSeconds=" + this.f20746g + ", networkConnectionInfo=" + this.f20747h + ", experimentIds=" + this.i + "}";
    }
}
