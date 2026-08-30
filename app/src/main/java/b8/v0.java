package b8;
import a5.a;
import p0.e;

/* loaded from: classes.dex */
public final class v0 {
    public static final u0 Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f2854a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2855b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2856c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2857d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2858f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2859g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2860h;
    public final boolean i;

    public /* synthetic */ v0(int i, String str, String str2, String str3, int i10, String str4, int i11, int i12, int i13, boolean z3) {
        if (511 == (i & 511)) {
            this.f2854a = str;
            this.f2855b = str2;
            this.f2856c = str3;
            this.f2857d = i10;
            this.e = str4;
            this.f2858f = i11;
            this.f2859g = i12;
            this.f2860h = i13;
            this.i = z3;
            return;
        }
        eg.e(i, 511, t0.f2745a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (kotlin.jvm.internal.a(this.f2854a, v0Var.f2854a) && kotlin.jvm.internal.a(this.f2855b, v0Var.f2855b) && kotlin.jvm.internal.a(this.f2856c, v0Var.f2856c) && this.f2857d == v0Var.f2857d && kotlin.jvm.internal.a(this.e, v0Var.e) && this.f2858f == v0Var.f2858f && this.f2859g == v0Var.f2859g && this.f2860h == v0Var.f2860h && this.i == v0Var.i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b10 = a.b(this.f2857d, a.e(this.f2856c, a.e(this.f2855b, this.f2854a.hashCode() * 31, 31), 31), 31);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.i) + a.b(this.f2860h, a.b(this.f2859g, a.b(this.f2858f, (b10 + hashCode) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("DraftArgs(p_title=", this.f2854a, ", p_kind=", this.f2855b, ", p_unlock=");
        q10.append(this.f2856c);
        q10.append(", p_price_coins=");
        q10.append(this.f2857d);
        q10.append(", p_price_tier=");
        q10.append(this.e);
        q10.append(", p_page_count=");
        q10.append(this.f2858f);
        q10.append(", p_cover_argb=");
        a.n(this.f2859g, this.f2860h, ", p_spine_argb=", ", p_spine_enabled=", q10);
        q10.append(this.i);
        q10.append(")");
        return q10.toString();
    }

    public v0(String str, String str2, String str3, String str4, int i, int i10, int i11, boolean z3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f2854a = str;
        this.f2855b = str2;
        this.f2856c = str3;
        this.f2857d = 0;
        this.e = str4;
        this.f2858f = i;
        this.f2859g = i10;
        this.f2860h = i11;
        this.i = z3;
    }
}
