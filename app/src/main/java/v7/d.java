package v7;
import a.a;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f27406a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27407b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27408c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27409d;
    public final Integer e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27410f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27411g;

    /* renamed from: h, reason: collision with root package name */
    public final float f27412h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f27413j;

    /* renamed from: k, reason: collision with root package name */
    public final float f27414k;

    /* renamed from: l, reason: collision with root package name */
    public final String f27415l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f27416m;

    /* renamed from: n, reason: collision with root package name */
    public final int f27417n;

    /* renamed from: o, reason: collision with root package name */
    public final List f27418o;

    public d(String str, boolean z3, int i, boolean z9, Integer num, String str2, int i10, float f10, float f11, float f12, float f13, String str3, boolean z10, int i11, List list) {
        str2.getClass();
        list.getClass();
        this.f27406a = str;
        this.f27407b = z3;
        this.f27408c = i;
        this.f27409d = z9;
        this.e = num;
        this.f27410f = str2;
        this.f27411g = i10;
        this.f27412h = f10;
        this.i = f11;
        this.f27413j = f12;
        this.f27414k = f13;
        this.f27415l = str3;
        this.f27416m = z10;
        this.f27417n = i11;
        this.f27418o = list;
    }

    public static d a(d dVar, String str, boolean z3, int i, boolean z9, Integer num, String str2, int i10, float f10, float f11, float f12, float f13, String str3, int i11, ArrayList arrayList, int i12) {
        String str4;
        boolean z10;
        int i13;
        boolean z11;
        Integer num2;
        String str5;
        int i14;
        float f14;
        float f15;
        float f16;
        float f17;
        String str6;
        int i15;
        List list;
        if ((i12 & 1) != 0) {
            str4 = dVar.f27406a;
        } else {
            str4 = str;
        }
        if ((i12 & 2) != 0) {
            z10 = dVar.f27407b;
        } else {
            z10 = z3;
        }
        if ((i12 & 4) != 0) {
            i13 = dVar.f27408c;
        } else {
            i13 = i;
        }
        if ((i12 & 8) != 0) {
            z11 = dVar.f27409d;
        } else {
            z11 = z9;
        }
        if ((i12 & 16) != 0) {
            num2 = dVar.e;
        } else {
            num2 = num;
        }
        if ((i12 & 32) != 0) {
            str5 = dVar.f27410f;
        } else {
            str5 = str2;
        }
        if ((i12 & 64) != 0) {
            i14 = dVar.f27411g;
        } else {
            i14 = i10;
        }
        if ((i12 & 128) != 0) {
            f14 = dVar.f27412h;
        } else {
            f14 = f10;
        }
        if ((i12 & 256) != 0) {
            f15 = dVar.i;
        } else {
            f15 = f11;
        }
        if ((i12 & 512) != 0) {
            f16 = dVar.f27413j;
        } else {
            f16 = f12;
        }
        if ((i12 & 1024) != 0) {
            f17 = dVar.f27414k;
        } else {
            f17 = f13;
        }
        if ((i12 & 2048) != 0) {
            str6 = dVar.f27415l;
        } else {
            str6 = str3;
        }
        boolean z12 = dVar.f27416m;
        if ((i12 & 8192) != 0) {
            i15 = dVar.f27417n;
        } else {
            i15 = i11;
        }
        if ((i12 & 16384) != 0) {
            list = dVar.f27418o;
        } else {
            list = arrayList;
        }
        dVar.getClass();
        str5.getClass();
        list.getClass();
        return new d(str4, z10, i13, z11, num2, str5, i14, f14, f15, f16, f17, str6, z12, i15, list);
    }

    public final boolean b() {
        return this.f27416m;
    }

    public final String c() {
        return this.f27406a;
    }

    public final boolean d() {
        return this.f27409d;
    }

    public final boolean e() {
        return this.f27407b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.a(this.f27406a, dVar.f27406a) && this.f27407b == dVar.f27407b && this.f27408c == dVar.f27408c && this.f27409d == dVar.f27409d && kotlin.jvm.internal.a(this.e, dVar.e) && kotlin.jvm.internal.a(this.f27410f, dVar.f27410f) && this.f27411g == dVar.f27411g && Float.compare(this.f27412h, dVar.f27412h) == 0 && Float.compare(this.i, dVar.i) == 0 && Float.compare(this.f27413j, dVar.f27413j) == 0 && Float.compare(this.f27414k, dVar.f27414k) == 0 && kotlin.jvm.internal.a(this.f27415l, dVar.f27415l) && this.f27416m == dVar.f27416m && this.f27417n == dVar.f27417n && kotlin.jvm.internal.a(this.f27418o, dVar.f27418o)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        String str = this.f27406a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c10 = p.a.c(p.a.b(this.f27408c, p.a.c(hashCode * 31, 31, this.f27407b), 31), 31, this.f27409d);
        Integer num = this.e;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int a10 = p.a(p.a(p.a(p.a(p.a.b(this.f27411g, g3.a.e(this.f27410f, (c10 + hashCode2) * 31, 31), 31), 31, this.f27412h), 31, this.i), 31, this.f27413j), 31, this.f27414k);
        String str2 = this.f27415l;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return this.f27418o.hashCode() + p.a.b(this.f27417n, p.a.c((a10 + i) * 31, 31, this.f27416m), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CoverState(imagePath=");
        sb2.append(this.f27406a);
        sb2.append(", spineEnabled=");
        sb2.append(this.f27407b);
        sb2.append(", spineArgb=");
        sb2.append(this.f27408c);
        sb2.append(", nameEnabled=");
        sb2.append(this.f27409d);
        sb2.append(", coverColorArgb=");
        sb2.append(this.e);
        sb2.append(", coverTexture=");
        sb2.append(this.f27410f);
        sb2.append(", nameStyle=");
        sb2.append(this.f27411g);
        sb2.append(", nameYFrac=");
        sb2.append(this.f27412h);
        sb2.append(", imgScale=");
        a5.a.s(sb2, this.i, ", imgOffX=", this.f27413j, ", imgOffY=");
        sb2.append(this.f27414k);
        sb2.append(", nameFontId=");
        sb2.append(this.f27415l);
        sb2.append(", bandEnabled=");
        sb2.append(this.f27416m);
        sb2.append(", bandArgb=");
        sb2.append(this.f27417n);
        sb2.append(", ornaments=");
        sb2.append(this.f27418o);
        sb2.append(")");
        return sb2.toString();
    }
}
