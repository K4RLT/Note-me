package lb;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f20087a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20088b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20089c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f20090d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f20091f;

    public b0(String str, long j10, int i, boolean z3, boolean z9, byte[] bArr) {
        this.f20087a = str;
        this.f20088b = j10;
        this.f20089c = i;
        this.f20090d = z3;
        this.e = z9;
        this.f20091f = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b0) {
                b0 b0Var = (b0) obj;
                String str = b0Var.f20087a;
                String str2 = this.f20087a;
                if (str2 == null) {
                    if (str != null) {
                        return false;
                    }
                } else if (!str2.equals(str)) {
                    return false;
                }
                if (this.f20088b == b0Var.f20088b && this.f20089c == b0Var.f20089c && this.f20090d == b0Var.f20090d && this.e == b0Var.e && Arrays.equals(this.f20091f, b0Var.f20091f)) {
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
        int i;
        String str = this.f20087a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = 1231;
        if (true != this.f20090d) {
            i = 1237;
        } else {
            i = 1231;
        }
        long j10 = this.f20088b;
        int i11 = ((((hashCode ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f20089c;
        if (true != this.e) {
            i10 = 1237;
        }
        return (((((i11 * 1000003) ^ i) * 1000003) ^ i10) * 1000003) ^ Arrays.hashCode(this.f20091f);
    }

    public final String toString() {
        return "ZipEntry{name=" + this.f20087a + ", size=" + this.f20088b + ", compressionMethod=" + this.f20089c + ", isPartial=" + this.f20090d + ", isEndOfArchive=" + this.e + ", headerBytes=" + Arrays.toString(this.f20091f) + "}";
    }
}
