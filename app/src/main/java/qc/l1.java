package qc;
import q.h;

import android.os.Build;

/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23851a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23852b;

    /* renamed from: c, reason: collision with root package name */
    public final long f23853c;

    /* renamed from: d, reason: collision with root package name */
    public final long f23854d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final int f23855f;

    public l1(int i, int i10, long j10, long j11, boolean z3, int i11) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f23851a = i;
        if (str != null) {
            this.f23852b = i10;
            this.f23853c = j10;
            this.f23854d = j11;
            this.e = z3;
            this.f23855f = i11;
            if (str2 != null) {
                if (str3 != null) {
                    return;
                }
                g5.h("Null modelClass");
                throw null;
            }
            g5.h("Null manufacturer");
            throw null;
        }
        g5.h("Null model");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof l1) {
                l1 l1Var = (l1) obj;
                if (this.f23851a == l1Var.f23851a) {
                    String str = Build.MODEL;
                    if (str.equals(str) && this.f23852b == l1Var.f23852b && this.f23853c == l1Var.f23853c && this.f23854d == l1Var.f23854d && this.e == l1Var.e && this.f23855f == l1Var.f23855f) {
                        String str2 = Build.MANUFACTURER;
                        if (str2.equals(str2)) {
                            String str3 = Build.PRODUCT;
                            if (str3.equals(str3)) {
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f23851a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f23852b) * 1000003;
        long j10 = this.f23853c;
        int i10 = (hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f23854d;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        if (this.e) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((i11 ^ i) * 1000003) ^ this.f23855f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f23851a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f23852b);
        sb2.append(", totalRam=");
        sb2.append(this.f23853c);
        sb2.append(", diskSpace=");
        sb2.append(this.f23854d);
        sb2.append(", isEmulator=");
        sb2.append(this.e);
        sb2.append(", state=");
        sb2.append(this.f23855f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return a5.a.k(sb2, Build.PRODUCT, "}");
    }
}
