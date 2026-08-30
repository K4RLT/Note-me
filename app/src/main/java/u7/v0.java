package u7;
import g3.a;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26938a;

    /* renamed from: b, reason: collision with root package name */
    public final int f26939b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26940c;

    /* renamed from: d, reason: collision with root package name */
    public final String f26941d;
    public final boolean e;

    public v0(String str, int i, String str2, String str3, int i10) {
        boolean z3;
        str2 = (i10 & 4) != 0 ? null : str2;
        str3 = (i10 & 8) != 0 ? null : str3;
        if ((i10 & 16) != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f26938a = str;
        this.f26939b = i;
        this.f26940c = str2;
        this.f26941d = str3;
        this.e = z3;
    }

    public final int a() {
        return this.f26939b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v0) {
                v0 v0Var = (v0) obj;
                if (!this.f26938a.equals(v0Var.f26938a) || this.f26939b != v0Var.f26939b || !kotlin.jvm.internal.a(this.f26940c, v0Var.f26940c) || !kotlin.jvm.internal.a(this.f26941d, v0Var.f26941d) || this.e != v0Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int b10 = a.b(this.f26939b, this.f26938a.hashCode() * 31, 31);
        int i = 0;
        String str = this.f26940c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (b10 + hashCode) * 31;
        String str2 = this.f26941d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Boolean.hashCode(this.e) + ((i10 + i) * 31);
    }

    public final String toString() {
        StringBuilder m4 = a5.a.m("CoverMaterial(id=", this.f26938a, ", labelRes=", this.f26939b, ", grainAsset=");
        a.t(m4, this.f26940c, ", normalAsset=", this.f26941d, ", procedural=");
        m4.append(this.e);
        m4.append(")");
        return m4.toString();
    }
}
