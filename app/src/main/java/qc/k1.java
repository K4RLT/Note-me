package qc;
import q.h;

import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f23842a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23843b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23844c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23845d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final gw f23846f;

    public k1(String str, String str2, String str3, String str4, int i, gw gwVar) {
        if (str != null) {
            this.f23842a = str;
            if (str2 != null) {
                this.f23843b = str2;
                if (str3 != null) {
                    this.f23844c = str3;
                    if (str4 != null) {
                        this.f23845d = str4;
                        this.e = i;
                        this.f23846f = gwVar;
                        return;
                    }
                    g5.h("Null installUuid");
                    throw null;
                }
                g5.h("Null versionName");
                throw null;
            }
            g5.h("Null versionCode");
            throw null;
        }
        g5.h("Null appIdentifier");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                if (this.f23842a.equals(k1Var.f23842a) && this.f23843b.equals(k1Var.f23843b) && this.f23844c.equals(k1Var.f23844c) && this.f23845d.equals(k1Var.f23845d) && this.e == k1Var.e && this.f23846f.equals(k1Var.f23846f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((this.f23842a.hashCode() ^ 1000003) * 1000003) ^ this.f23843b.hashCode()) * 1000003) ^ this.f23844c.hashCode()) * 1000003) ^ this.f23845d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f23846f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f23842a + ", versionCode=" + this.f23843b + ", versionName=" + this.f23844c + ", installUuid=" + this.f23845d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f23846f + "}";
    }
}
