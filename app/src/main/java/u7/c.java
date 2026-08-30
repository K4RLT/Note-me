package u7;
import g3.a;
import l.a;
import p.a;

import androidx.ink.storage.DecompressedBytes;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f25969a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25970b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f25971c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f25972d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f25973f;

    /* renamed from: g, reason: collision with root package name */
    public final float f25974g;

    /* renamed from: h, reason: collision with root package name */
    public final float f25975h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f25976j;

    /* renamed from: k, reason: collision with root package name */
    public final float f25977k;

    /* renamed from: l, reason: collision with root package name */
    public final float f25978l;

    /* renamed from: m, reason: collision with root package name */
    public final int f25979m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f25980n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f25981o;

    /* renamed from: p, reason: collision with root package name */
    public final String f25982p;

    public c(String str, String str2, Integer num, Integer num2, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i, boolean z3, boolean z9, String str3) {
        str.getClass();
        str2.getClass();
        this.f25969a = str;
        this.f25970b = str2;
        this.f25971c = num;
        this.f25972d = num2;
        this.e = f10;
        this.f25973f = f11;
        this.f25974g = f12;
        this.f25975h = f13;
        this.i = f14;
        this.f25976j = f15;
        this.f25977k = f16;
        this.f25978l = f17;
        this.f25979m = i;
        this.f25980n = z3;
        this.f25981o = z9;
        this.f25982p = str3;
    }

    public static c a(c cVar, String str, Integer num, Integer num2, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i, boolean z3, boolean z9, String str2, int i10) {
        String str3;
        Integer num3;
        Integer num4;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        int i11;
        boolean z10;
        boolean z11;
        String str4;
        if ((i10 & 1) != 0) {
            str3 = cVar.f25969a;
        } else {
            str3 = str;
        }
        String str5 = cVar.f25970b;
        if ((i10 & 4) != 0) {
            num3 = cVar.f25971c;
        } else {
            num3 = num;
        }
        if ((i10 & 8) != 0) {
            num4 = cVar.f25972d;
        } else {
            num4 = num2;
        }
        if ((i10 & 16) != 0) {
            f18 = cVar.e;
        } else {
            f18 = f10;
        }
        if ((i10 & 32) != 0) {
            f19 = cVar.f25973f;
        } else {
            f19 = f11;
        }
        if ((i10 & 64) != 0) {
            f20 = cVar.f25974g;
        } else {
            f20 = f12;
        }
        if ((i10 & 128) != 0) {
            f21 = cVar.f25975h;
        } else {
            f21 = f13;
        }
        if ((i10 & 256) != 0) {
            f22 = cVar.i;
        } else {
            f22 = f14;
        }
        if ((i10 & 512) != 0) {
            f23 = cVar.f25976j;
        } else {
            f23 = f15;
        }
        if ((i10 & 1024) != 0) {
            f24 = cVar.f25977k;
        } else {
            f24 = f16;
        }
        if ((i10 & 2048) != 0) {
            f25 = cVar.f25978l;
        } else {
            f25 = f17;
        }
        if ((i10 & 4096) != 0) {
            i11 = cVar.f25979m;
        } else {
            i11 = i;
        }
        if ((i10 & 8192) != 0) {
            z10 = cVar.f25980n;
        } else {
            z10 = z3;
        }
        String str6 = str3;
        if ((i10 & 16384) != 0) {
            z11 = cVar.f25981o;
        } else {
            z11 = z9;
        }
        if ((i10 & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0) {
            str4 = cVar.f25982p;
        } else {
            str4 = str2;
        }
        cVar.getClass();
        str6.getClass();
        str5.getClass();
        return new c(str6, str5, num3, num4, f18, f19, f20, f21, f22, f23, f24, f25, i11, z10, z11, str4);
    }

    public final String b() {
        return this.f25969a;
    }

    public final boolean c() {
        return this.f25981o;
    }

    public final float d() {
        return this.f25978l;
    }

    public final float e() {
        return this.f25977k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (kotlin.jvm.internal.a(this.f25969a, cVar.f25969a) && kotlin.jvm.internal.a(this.f25970b, cVar.f25970b) && kotlin.jvm.internal.a(this.f25971c, cVar.f25971c) && kotlin.jvm.internal.a(this.f25972d, cVar.f25972d) && Float.compare(this.e, cVar.e) == 0 && Float.compare(this.f25973f, cVar.f25973f) == 0 && Float.compare(this.f25974g, cVar.f25974g) == 0 && Float.compare(this.f25975h, cVar.f25975h) == 0 && Float.compare(this.i, cVar.i) == 0 && Float.compare(this.f25976j, cVar.f25976j) == 0 && Float.compare(this.f25977k, cVar.f25977k) == 0 && Float.compare(this.f25978l, cVar.f25978l) == 0 && this.f25979m == cVar.f25979m && this.f25980n == cVar.f25980n && this.f25981o == cVar.f25981o && kotlin.jvm.internal.a(this.f25982p, cVar.f25982p)) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.i;
    }

    public final float g() {
        return this.f25976j;
    }

    public final int h() {
        return this.f25979m;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int e = a.e(this.f25970b, this.f25969a.hashCode() * 31, 31);
        int i = 0;
        Integer num = this.f25971c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (e + hashCode) * 31;
        Integer num2 = this.f25972d;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int c10 = a.c(a.c(a.b(this.f25979m, a.a(a.a(a.a(a.a(a.a(a.a(a.a(a.a((i10 + hashCode2) * 31, 31, this.e), 31, this.f25973f), 31, this.f25974g), 31, this.f25975h), 31, this.i), 31, this.f25976j), 31, this.f25977k), 31, this.f25978l), 31), 31, this.f25980n), 31, this.f25981o);
        String str = this.f25982p;
        if (str != null) {
            i = str.hashCode();
        }
        return c10 + i;
    }

    public final String toString() {
        StringBuilder q10 = a.q("CanvasShape(id=", this.f25969a, ", shape=", this.f25970b, ", fillArgb=");
        q10.append(this.f25971c);
        q10.append(", strokeArgb=");
        q10.append(this.f25972d);
        q10.append(", strokeWidth=");
        a5.a.s(q10, this.e, ", cornerRadius=", this.f25973f, ", wFrac=");
        a5.a.s(q10, this.f25974g, ", hFrac=", this.f25975h, ", x=");
        a5.a.s(q10, this.i, ", y=", this.f25976j, ", scale=");
        a5.a.s(q10, this.f25977k, ", rotation=", this.f25978l, ", z=");
        q10.append(this.f25979m);
        q10.append(", visible=");
        q10.append(this.f25980n);
        q10.append(", locked=");
        q10.append(this.f25981o);
        q10.append(", name=");
        q10.append(this.f25982p);
        q10.append(")");
        return q10.toString();
    }

    public /* synthetic */ c(String str, String str2, Integer num, Integer num2, float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this(str, str2, num, num2, f10, f11, f12, f13, f14, f15, 1.0f, f16, 0, true, false, null);
    }
}
