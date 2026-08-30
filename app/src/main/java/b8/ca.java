package b8;
import a5.a;
import g3.a;
import l.a;
import p.a;
import p0.e;

/* loaded from: classes.dex */
public final class ca {
    public static final ba Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f1935a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1936b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1937c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1938d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1939f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1940g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1941h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1942j;

    /* renamed from: k, reason: collision with root package name */
    public final int f1943k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f1944l;

    /* renamed from: m, reason: collision with root package name */
    public final long f1945m;

    /* renamed from: n, reason: collision with root package name */
    public final String f1946n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1947o;

    /* renamed from: p, reason: collision with root package name */
    public final String f1948p;

    /* renamed from: q, reason: collision with root package name */
    public final String f1949q;

    /* renamed from: r, reason: collision with root package name */
    public final String f1950r;

    public /* synthetic */ ca(int i, String str, String str2, String str3, String str4, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z3, long j10, String str5, boolean z9, String str6, String str7, String str8) {
        if (7 != (i & 7)) {
            eg.e(i, 7, aa.f1854a.d());
            throw null;
        }
        this.f1935a = str;
        this.f1936b = str2;
        this.f1937c = str3;
        if ((i & 8) == 0) {
            this.f1938d = "template";
        } else {
            this.f1938d = str4;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i10;
        }
        if ((i & 32) == 0) {
            this.f1939f = 0;
        } else {
            this.f1939f = i11;
        }
        if ((i & 64) == 0) {
            this.f1940g = 0;
        } else {
            this.f1940g = i12;
        }
        if ((i & 128) == 0) {
            this.f1941h = 0;
        } else {
            this.f1941h = i13;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i14;
        }
        if ((i & 512) == 0) {
            this.f1942j = 0;
        } else {
            this.f1942j = i15;
        }
        if ((i & 1024) == 0) {
            this.f1943k = 0;
        } else {
            this.f1943k = i16;
        }
        if ((i & 2048) == 0) {
            this.f1944l = true;
        } else {
            this.f1944l = z3;
        }
        this.f1945m = (i & 4096) == 0 ? 0L : j10;
        if ((i & 8192) == 0) {
            this.f1946n = "";
        } else {
            this.f1946n = str5;
        }
        if ((i & 16384) == 0) {
            this.f1947o = false;
        } else {
            this.f1947o = z9;
        }
        if ((32768 & i) == 0) {
            this.f1948p = "";
        } else {
            this.f1948p = str6;
        }
        if ((65536 & i) == 0) {
            this.f1949q = "";
        } else {
            this.f1949q = str7;
        }
        if ((i & 131072) == 0) {
            this.f1950r = "";
        } else {
            this.f1950r = str8;
        }
    }

    public static ca a(ca caVar, int i, int i10, int i11, long j10, boolean z3, int i12) {
        int i13;
        int i14;
        int i15;
        long j11;
        boolean z9;
        String str = caVar.f1935a;
        String str2 = caVar.f1936b;
        String str3 = caVar.f1937c;
        String str4 = caVar.f1938d;
        int i16 = caVar.e;
        if ((i12 & 32) != 0) {
            i13 = caVar.f1939f;
        } else {
            i13 = i;
        }
        if ((i12 & 64) != 0) {
            i14 = caVar.f1940g;
        } else {
            i14 = i10;
        }
        int i17 = caVar.f1941h;
        if ((i12 & 256) != 0) {
            i15 = caVar.i;
        } else {
            i15 = i11;
        }
        int i18 = caVar.f1942j;
        int i19 = i13;
        int i20 = i14;
        int i21 = i15;
        int i22 = caVar.f1943k;
        boolean z10 = caVar.f1944l;
        if ((i12 & 4096) != 0) {
            j11 = caVar.f1945m;
        } else {
            j11 = j10;
        }
        String str5 = caVar.f1946n;
        if ((i12 & 16384) != 0) {
            z9 = caVar.f1947o;
        } else {
            z9 = z3;
        }
        String str6 = caVar.f1948p;
        String str7 = caVar.f1949q;
        String str8 = caVar.f1950r;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new ca(str, str2, str3, str4, i16, i19, i20, i17, i21, i18, i22, z10, j11, str5, z9, str6, str7, str8);
    }

    public final String b() {
        return this.f1935a;
    }

    public final boolean c() {
        if (kotlin.jvm.internal.a(d(), "money") && !mf.f.u(this.f1949q)) {
            return true;
        }
        return false;
    }

    public final String d() {
        String str = this.f1948p;
        if (!mf.f.u(str)) {
            return str;
        }
        if (this.e > 0) {
            return "coins";
        }
        return "free";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca)) {
            return false;
        }
        ca caVar = (ca) obj;
        if (kotlin.jvm.internal.a(this.f1935a, caVar.f1935a) && kotlin.jvm.internal.a(this.f1936b, caVar.f1936b) && kotlin.jvm.internal.a(this.f1937c, caVar.f1937c) && kotlin.jvm.internal.a(this.f1938d, caVar.f1938d) && this.e == caVar.e && this.f1939f == caVar.f1939f && this.f1940g == caVar.f1940g && this.f1941h == caVar.f1941h && this.i == caVar.i && this.f1942j == caVar.f1942j && this.f1943k == caVar.f1943k && this.f1944l == caVar.f1944l && this.f1945m == caVar.f1945m && kotlin.jvm.internal.a(this.f1946n, caVar.f1946n) && this.f1947o == caVar.f1947o && kotlin.jvm.internal.a(this.f1948p, caVar.f1948p) && kotlin.jvm.internal.a(this.f1949q, caVar.f1949q) && kotlin.jvm.internal.a(this.f1950r, caVar.f1950r)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1950r.hashCode() + a.e(this.f1949q, a.e(this.f1948p, a.c(a.e(this.f1946n, a.d(this.f1945m, a.c(a.b(this.f1943k, a.b(this.f1942j, a.b(this.i, a.b(this.f1941h, a.b(this.f1940g, a.b(this.f1939f, a.b(this.e, a.e(this.f1938d, a.e(this.f1937c, a.e(this.f1936b, this.f1935a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f1944l), 31), 31), 31, this.f1947o), 31), 31);
    }

    public final String toString() {
        StringBuilder q10 = a.q("UniverseListing(cloudId=", this.f1935a, ", title=", this.f1936b, ", authorHandle=");
        a.t(q10, this.f1937c, ", kind=", this.f1938d, ", priceCoins=");
        a.n(this.e, this.f1939f, ", hearts=", ", downloads=", q10);
        a.n(this.f1940g, this.f1941h, ", pageCount=", ", previewCount=", q10);
        a.n(this.i, this.f1942j, ", coverArgb=", ", spineArgb=", q10);
        q10.append(this.f1943k);
        q10.append(", spineEnabled=");
        q10.append(this.f1944l);
        q10.append(", publishedAt=");
        q10.append(this.f1945m);
        q10.append(", originNotebookId=");
        q10.append(this.f1946n);
        q10.append(", heartedByMe=");
        q10.append(this.f1947o);
        q10.append(", unlockRaw=");
        q10.append(this.f1948p);
        a.t(q10, ", priceTier=", this.f1949q, ", houseItemId=", this.f1950r);
        q10.append(")");
        return q10.toString();
    }

    public ca(String str, String str2, String str3, String str4, int i, int i10, int i11, int i12, int i13, int i14, int i15, boolean z3, long j10, String str5, boolean z9, String str6, String str7, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        this.f1935a = str;
        this.f1936b = str2;
        this.f1937c = str3;
        this.f1938d = str4;
        this.e = i;
        this.f1939f = i10;
        this.f1940g = i11;
        this.f1941h = i12;
        this.i = i13;
        this.f1942j = i14;
        this.f1943k = i15;
        this.f1944l = z3;
        this.f1945m = j10;
        this.f1946n = str5;
        this.f1947o = z9;
        this.f1948p = str6;
        this.f1949q = str7;
        this.f1950r = str8;
    }

    public /* synthetic */ ca(String str, String str2, String str3, String str4, int i, int i10, int i11, int i12, int i13, int i14, int i15, boolean z3, long j10, String str5, boolean z9, String str6, String str7, String str8, int i16) {
        this(str, str2, str3, str4, i, (i16 & 32) != 0 ? 0 : i10, (i16 & 64) != 0 ? 0 : i11, i12, i13, i14, i15, z3, j10, str5, (i16 & 16384) != 0 ? false : z9, str6, (65536 & i16) != 0 ? "" : str7, (i16 & 131072) != 0 ? "" : str8);
    }
}
