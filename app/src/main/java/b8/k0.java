package b8;
import g3.a;
import l.a;
import p.a;

/* loaded from: classes.dex */
public final class k0 {
    public static final j0 Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f2287a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2288b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2289c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2290d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2291f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2292g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2293h;
    public final String i;

    public /* synthetic */ k0(int i, String str, String str2, String str3, String str4, boolean z3, long j10, String str5, String str6, String str7) {
        if ((i & 1) == 0) {
            this.f2287a = "";
        } else {
            this.f2287a = str;
        }
        if ((i & 2) == 0) {
            this.f2288b = "";
        } else {
            this.f2288b = str2;
        }
        if ((i & 4) == 0) {
            this.f2289c = "";
        } else {
            this.f2289c = str3;
        }
        if ((i & 8) == 0) {
            this.f2290d = "";
        } else {
            this.f2290d = str4;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
        if ((i & 32) == 0) {
            this.f2291f = 0L;
        } else {
            this.f2291f = j10;
        }
        if ((i & 64) == 0) {
            this.f2292g = "";
        } else {
            this.f2292g = str5;
        }
        if ((i & 128) == 0) {
            this.f2293h = "";
        } else {
            this.f2293h = str6;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str7;
        }
    }

    public static k0 a(k0 k0Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = k0Var.f2287a;
        }
        String str3 = str;
        String str4 = k0Var.f2288b;
        if ((i & 4) != 0) {
            str2 = k0Var.f2289c;
        }
        String str5 = str2;
        String str6 = k0Var.f2290d;
        boolean z3 = k0Var.e;
        long j10 = k0Var.f2291f;
        String str7 = k0Var.f2292g;
        String str8 = k0Var.f2293h;
        String str9 = k0Var.i;
        k0Var.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        return new k0(str3, str4, str5, str6, z3, j10, str7, str8, str9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (kotlin.jvm.internal.a(this.f2287a, k0Var.f2287a) && kotlin.jvm.internal.a(this.f2288b, k0Var.f2288b) && kotlin.jvm.internal.a(this.f2289c, k0Var.f2289c) && kotlin.jvm.internal.a(this.f2290d, k0Var.f2290d) && this.e == k0Var.e && this.f2291f == k0Var.f2291f && kotlin.jvm.internal.a(this.f2292g, k0Var.f2292g) && kotlin.jvm.internal.a(this.f2293h, k0Var.f2293h) && kotlin.jvm.internal.a(this.i, k0Var.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + a.e(this.f2293h, a.e(this.f2292g, a.d(this.f2291f, a.c(a.e(this.f2290d, a.e(this.f2289c, a.e(this.f2288b, this.f2287a.hashCode() * 31, 31), 31), 31), 31, this.e), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("Certificate(notebookId=", this.f2287a, ", recipeId=", this.f2288b, ", title=");
        a.t(q10, this.f2289c, ", serial=", this.f2290d, ", fromPlay=");
        q10.append(this.e);
        q10.append(", purchasedAt=");
        q10.append(this.f2291f);
        a.t(q10, ", productId=", this.f2292g, ", price=", this.f2293h);
        return a.o(q10, ", device=", this.i, ")");
    }

    public k0(String str, String str2, String str3, String str4, boolean z3, long j10, String str5, String str6, String str7) {
        str4.getClass();
        str5.getClass();
        str7.getClass();
        this.f2287a = str;
        this.f2288b = str2;
        this.f2289c = str3;
        this.f2290d = str4;
        this.e = z3;
        this.f2291f = j10;
        this.f2292g = str5;
        this.f2293h = str6;
        this.i = str7;
    }
}
