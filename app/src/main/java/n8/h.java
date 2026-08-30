package n8;
import q.h;

import b2.f1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f21173a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f21174b;

    /* renamed from: c, reason: collision with root package name */
    public final k f21175c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21176d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f21177f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f21178g;

    /* renamed from: h, reason: collision with root package name */
    public final String f21179h;
    public final byte[] i;

    /* renamed from: j, reason: collision with root package name */
    public final byte[] f21180j;

    public h(String str, Integer num, k kVar, long j10, long j11, HashMap hashMap, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f21173a = str;
        this.f21174b = num;
        this.f21175c = kVar;
        this.f21176d = j10;
        this.e = j11;
        this.f21177f = hashMap;
        this.f21178g = num2;
        this.f21179h = str2;
        this.i = bArr;
        this.f21180j = bArr2;
    }

    public final String a(String str) {
        String str2 = (String) this.f21177f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f21177f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final f1 c() {
        f1 f1Var = new f1();
        String str = this.f21173a;
        if (str != null) {
            f1Var.f1456v = str;
            f1Var.f1457w = this.f21174b;
            f1Var.B = this.f21178g;
            f1Var.C = this.f21179h;
            f1Var.D = this.i;
            f1Var.E = this.f21180j;
            k kVar = this.f21175c;
            if (kVar != null) {
                f1Var.f1458x = kVar;
                f1Var.f1459y = Long.valueOf(this.f21176d);
                f1Var.f1460z = Long.valueOf(this.e);
                f1Var.A = new HashMap(this.f21177f);
                return f1Var;
            }
            g5.q.h("Null encodedPayload");
            return null;
        }
        g5.q.h("Null transportName");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f21173a.equals(hVar.f21173a)) {
                Integer num = hVar.f21174b;
                Integer num2 = this.f21174b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.f21175c.equals(hVar.f21175c) && this.f21176d == hVar.f21176d && this.e == hVar.e && this.f21177f.equals(hVar.f21177f)) {
                        Integer num3 = hVar.f21178g;
                        Integer num4 = this.f21178g;
                        if (num4 != null ? num4.equals(num3) : num3 == null) {
                            String str = hVar.f21179h;
                            String str2 = this.f21179h;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (Arrays.equals(this.i, hVar.i) && Arrays.equals(this.f21180j, hVar.f21180j)) {
                                    return true;
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
        int hashCode3 = (this.f21173a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        Integer num = this.f21174b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = (((hashCode3 ^ hashCode) * 1000003) ^ this.f21175c.hashCode()) * 1000003;
        long j10 = this.f21176d;
        int i10 = (hashCode4 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.e;
        int hashCode5 = (((i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f21177f.hashCode()) * 1000003;
        Integer num2 = this.f21178g;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i11 = (hashCode5 ^ hashCode2) * 1000003;
        String str = this.f21179h;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((i11 ^ i) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003) ^ Arrays.hashCode(this.f21180j);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f21173a + ", code=" + this.f21174b + ", encodedPayload=" + this.f21175c + ", eventMillis=" + this.f21176d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f21177f + ", productId=" + this.f21178g + ", pseudonymousId=" + this.f21179h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f21180j) + "}";
    }
}
