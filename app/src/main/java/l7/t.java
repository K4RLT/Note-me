package l7;
import l.a;
import p.a;

import eg.p0;

/* loaded from: classes.dex */
public final class t {
    public static final s Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f20006a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20007b;

    /* renamed from: c, reason: collision with root package name */
    public final float f20008c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20009d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f20010f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20011g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f20012h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final String f20013j;

    /* renamed from: k, reason: collision with root package name */
    public final Float f20014k;

    /* renamed from: l, reason: collision with root package name */
    public final String f20015l;

    /* renamed from: m, reason: collision with root package name */
    public final int f20016m;

    /* renamed from: n, reason: collision with root package name */
    public final float f20017n;

    public /* synthetic */ t(int i, String str, int i10, float f10, String str2, boolean z3, boolean z9, int i11, boolean z10, boolean z11, String str3, Float f11, String str4, int i12, float f12) {
        String str5;
        int i13;
        float f13;
        if (7 == (i & 7)) {
            this.f20006a = str;
            this.f20007b = i10;
            this.f20008c = f10;
            if ((i & 8) == 0) {
                this.f20009d = "default";
            } else {
                this.f20009d = str2;
            }
            if ((i & 16) == 0) {
                this.e = false;
            } else {
                this.e = z3;
            }
            if ((i & 32) == 0) {
                this.f20010f = false;
            } else {
                this.f20010f = z9;
            }
            if ((i & 64) == 0) {
                this.f20011g = 0;
            } else {
                this.f20011g = i11;
            }
            if ((i & 128) == 0) {
                this.f20012h = true;
            } else {
                this.f20012h = z10;
            }
            if ((i & 256) == 0) {
                this.i = false;
            } else {
                this.i = z11;
            }
            if ((i & 512) == 0) {
                this.f20013j = null;
            } else {
                this.f20013j = str3;
            }
            if ((i & 1024) == 0) {
                this.f20014k = null;
            } else {
                this.f20014k = f11;
            }
            if ((i & 2048) == 0) {
                str5 = "none";
            } else {
                str5 = str4;
            }
            this.f20015l = str5;
            if ((i & 4096) == 0) {
                i13 = -1;
            } else {
                i13 = i12;
            }
            this.f20016m = i13;
            if ((i & 8192) == 0) {
                f13 = 0.5f;
            } else {
                f13 = f12;
            }
            this.f20017n = f13;
            return;
        }
        p0.e(i, 7, r.f20005a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (kotlin.jvm.internal.a(this.f20006a, tVar.f20006a) && this.f20007b == tVar.f20007b && Float.compare(this.f20008c, tVar.f20008c) == 0 && kotlin.jvm.internal.a(this.f20009d, tVar.f20009d) && this.e == tVar.e && this.f20010f == tVar.f20010f && this.f20011g == tVar.f20011g && this.f20012h == tVar.f20012h && this.i == tVar.i && kotlin.jvm.internal.a(this.f20013j, tVar.f20013j) && kotlin.jvm.internal.a(this.f20014k, tVar.f20014k) && kotlin.jvm.internal.a(this.f20015l, tVar.f20015l) && this.f20016m == tVar.f20016m && Float.compare(this.f20017n, tVar.f20017n) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int c10 = a.c(a.c(a.b(this.f20011g, a.c(a.c(g3.a.e(this.f20009d, a.a(a.b(this.f20007b, this.f20006a.hashCode() * 31, 31), 31, this.f20008c), 31), 31, this.e), 31, this.f20010f), 31), 31, this.f20012h), 31, this.i);
        int i = 0;
        String str = this.f20013j;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (c10 + hashCode) * 31;
        Float f10 = this.f20014k;
        if (f10 != null) {
            i = f10.hashCode();
        }
        return Float.hashCode(this.f20017n) + a.b(this.f20016m, g3.a.e(this.f20015l, (i10 + i) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder m4 = a5.a.m("TextPayload(text=", this.f20006a, ", colorArgb=", this.f20007b, ", fontSizeSp=");
        m4.append(this.f20008c);
        m4.append(", fontFamily=");
        m4.append(this.f20009d);
        m4.append(", bold=");
        m4.append(this.e);
        m4.append(", italic=");
        m4.append(this.f20010f);
        m4.append(", align=");
        m4.append(this.f20011g);
        m4.append(", visible=");
        m4.append(this.f20012h);
        m4.append(", locked=");
        m4.append(this.i);
        m4.append(", name=");
        m4.append(this.f20013j);
        m4.append(", boxWFrac=");
        m4.append(this.f20014k);
        m4.append(", effect=");
        m4.append(this.f20015l);
        m4.append(", effectColorArgb=");
        m4.append(this.f20016m);
        m4.append(", effectAmount=");
        m4.append(this.f20017n);
        m4.append(")");
        return m4.toString();
    }

    public t(String str, int i, float f10, String str2, boolean z3, boolean z9, boolean z10, boolean z11, String str3, Float f11, String str4, int i10, float f12) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        this.f20006a = str;
        this.f20007b = i;
        this.f20008c = f10;
        this.f20009d = str2;
        this.e = z3;
        this.f20010f = z9;
        this.f20011g = 0;
        this.f20012h = z10;
        this.i = z11;
        this.f20013j = str3;
        this.f20014k = f11;
        this.f20015l = str4;
        this.f20016m = i10;
        this.f20017n = f12;
    }
}
