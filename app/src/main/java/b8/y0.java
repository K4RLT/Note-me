package b8;
import a5.a;
import g3.a;
import l.a;
import p.a;

import androidx.ink.storage.DecompressedBytes;

/* loaded from: classes.dex */
public final class y0 {
    public static final x0 Companion = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final String f3006a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3007b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3008c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3009d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3010f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3011g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3012h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3013j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3014k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3015l;

    /* renamed from: m, reason: collision with root package name */
    public final int f3016m;

    /* renamed from: n, reason: collision with root package name */
    public final String f3017n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f3018o;

    /* renamed from: p, reason: collision with root package name */
    public final String f3019p;

    public /* synthetic */ y0(int i, String str, String str2, String str3, String str4, int i10, String str5, int i11, int i12, int i13, int i14, boolean z3, int i15, int i16, String str6, boolean z9, String str7) {
        if ((i & 1) == 0) {
            this.f3006a = "";
        } else {
            this.f3006a = str;
        }
        if ((i & 2) == 0) {
            this.f3007b = "";
        } else {
            this.f3007b = str2;
        }
        if ((i & 4) == 0) {
            this.f3008c = "template";
        } else {
            this.f3008c = str3;
        }
        if ((i & 8) == 0) {
            this.f3009d = "free";
        } else {
            this.f3009d = str4;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i10;
        }
        if ((i & 32) == 0) {
            this.f3010f = "";
        } else {
            this.f3010f = str5;
        }
        if ((i & 64) == 0) {
            this.f3011g = 0;
        } else {
            this.f3011g = i11;
        }
        if ((i & 128) == 0) {
            this.f3012h = 0;
        } else {
            this.f3012h = i12;
        }
        if ((i & 256) == 0) {
            this.i = 0;
        } else {
            this.i = i13;
        }
        if ((i & 512) == 0) {
            this.f3013j = 0;
        } else {
            this.f3013j = i14;
        }
        if ((i & 1024) == 0) {
            this.f3014k = true;
        } else {
            this.f3014k = z3;
        }
        if ((i & 2048) == 0) {
            this.f3015l = 0;
        } else {
            this.f3015l = i15;
        }
        if ((i & 4096) == 0) {
            this.f3016m = 0;
        } else {
            this.f3016m = i16;
        }
        if ((i & 8192) == 0) {
            this.f3017n = null;
        } else {
            this.f3017n = str6;
        }
        if ((i & 16384) == 0) {
            this.f3018o = false;
        } else {
            this.f3018o = z9;
        }
        if ((i & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) == 0) {
            this.f3019p = null;
        } else {
            this.f3019p = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (kotlin.jvm.internal.a(this.f3006a, y0Var.f3006a) && kotlin.jvm.internal.a(this.f3007b, y0Var.f3007b) && kotlin.jvm.internal.a(this.f3008c, y0Var.f3008c) && kotlin.jvm.internal.a(this.f3009d, y0Var.f3009d) && this.e == y0Var.e && kotlin.jvm.internal.a(this.f3010f, y0Var.f3010f) && this.f3011g == y0Var.f3011g && this.f3012h == y0Var.f3012h && this.i == y0Var.i && this.f3013j == y0Var.f3013j && this.f3014k == y0Var.f3014k && this.f3015l == y0Var.f3015l && this.f3016m == y0Var.f3016m && kotlin.jvm.internal.a(this.f3017n, y0Var.f3017n) && this.f3018o == y0Var.f3018o && kotlin.jvm.internal.a(this.f3019p, y0Var.f3019p)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b10 = a.b(this.f3016m, a.b(this.f3015l, a.c(a.b(this.f3013j, a.b(this.i, a.b(this.f3012h, a.b(this.f3011g, a.e(this.f3010f, a.b(this.e, a.e(this.f3009d, a.e(this.f3008c, a.e(this.f3007b, this.f3006a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.f3014k), 31), 31);
        int i = 0;
        String str = this.f3017n;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = a.c((b10 + hashCode) * 31, 31, this.f3018o);
        String str2 = this.f3019p;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return c10 + i;
    }

    public final String toString() {
        StringBuilder q10 = a.q("FeedRow(id=", this.f3006a, ", author_handle=", this.f3007b, ", kind=");
        a.t(q10, this.f3008c, ", unlock=", this.f3009d, ", price_coins=");
        q10.append(this.e);
        q10.append(", title=");
        q10.append(this.f3010f);
        q10.append(", page_count=");
        a.n(this.f3011g, this.f3012h, ", preview_count=", ", cover_argb=", q10);
        a.n(this.i, this.f3013j, ", spine_argb=", ", spine_enabled=", q10);
        q10.append(this.f3014k);
        q10.append(", hearts_count=");
        q10.append(this.f3015l);
        q10.append(", downloads_count=");
        q10.append(this.f3016m);
        q10.append(", published_at=");
        q10.append(this.f3017n);
        q10.append(", hearted_by_me=");
        q10.append(this.f3018o);
        q10.append(", price_tier=");
        q10.append(this.f3019p);
        q10.append(")");
        return q10.toString();
    }
}
