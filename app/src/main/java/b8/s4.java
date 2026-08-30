package b8;
import a5.a;
import g3.a;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2707a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2708b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2709c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2710d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2711f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2712g;

    public s4(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        this.f2707a = str;
        this.f2708b = str2;
        this.f2709c = str3;
        this.f2710d = str4;
        this.e = str5;
        this.f2711f = str6;
        this.f2712g = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof s4) {
                s4 s4Var = (s4) obj;
                if (!kotlin.jvm.internal.a(this.f2707a, s4Var.f2707a) || !kotlin.jvm.internal.a(this.f2708b, s4Var.f2708b) || !kotlin.jvm.internal.a(this.f2709c, s4Var.f2709c) || !kotlin.jvm.internal.a(this.f2710d, s4Var.f2710d) || !kotlin.jvm.internal.a(this.e, s4Var.e) || !kotlin.jvm.internal.a(this.f2711f, s4Var.f2711f) || !kotlin.jvm.internal.a(this.f2712g, s4Var.f2712g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2712g.hashCode() + a.e(this.f2711f, a.e(this.e, a.b(0, a.e(this.f2710d, a.e(this.f2709c, a.e(this.f2708b, this.f2707a.hashCode() * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("PublishRequest(notebookId=", this.f2707a, ", title=", this.f2708b, ", authorHandle=");
        a.t(q10, this.f2709c, ", kind=", this.f2710d, ", priceCoins=0, unlock=");
        a.t(q10, this.e, ", priceTier=", this.f2711f, ", houseItemId=");
        return a.k(q10, this.f2712g, ")");
    }
}
