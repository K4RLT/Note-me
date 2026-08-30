package u7;
import g3.a;
import l.a;
import p.a;
import u7.d;

import androidx.ink.storage.DecompressedBytes;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f26033a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26034b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26035c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26036d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final float f26037f;

    /* renamed from: g, reason: collision with root package name */
    public final float f26038g;

    /* renamed from: h, reason: collision with root package name */
    public final float f26039h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final int f26040j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f26041k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26042l;

    /* renamed from: m, reason: collision with root package name */
    public final String f26043m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f26044n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f26045o;

    /* renamed from: p, reason: collision with root package name */
    public final Float f26046p;

    /* renamed from: q, reason: collision with root package name */
    public final String f26047q;

    /* renamed from: r, reason: collision with root package name */
    public final int f26048r;

    /* renamed from: s, reason: collision with root package name */
    public final float f26049s;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ d(java.lang.String r24, java.lang.String r25, java.lang.String r26, int r27, float r28, float r29, float r30, float r31, boolean r32, java.lang.String r33, boolean r34, boolean r35, java.lang.Float r36, int r37) {
        /*
            r23 = this;
            r0 = r37
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r1 == 0) goto L9
            r15 = r2
            goto Lb
        L9:
            r15 = r32
        Lb:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r3 = 0
            if (r1 == 0) goto L13
            r16 = r3
            goto L15
        L13:
            r16 = r33
        L15:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L1c
            r17 = r2
            goto L1e
        L1c:
            r17 = r34
        L1e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L25
            r18 = r2
            goto L27
        L25:
            r18 = r35
        L27:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L30
            r19 = r3
            goto L32
        L30:
            r19 = r36
        L32:
            r21 = -1
            r22 = 1056964608(0x3f000000, float:0.5)
            r11 = 1065353216(0x3f800000, float:1.0)
            r13 = 0
            r14 = 1
            java.lang.String r20 = "none"
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r10 = r30
            r12 = r31
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u7.d.<init>(java.lang.String, java.lang.String, java.lang.String, int, float, float, float, float, boolean, java.lang.String, boolean, boolean, java.lang.Float, int):void");
    }

    public static d a(d dVar, String str, String str2, String str3, int i, float f10, float f11, float f12, float f13, int i10, boolean z3, boolean z9, String str4, boolean z10, boolean z11, Float f14, String str5, int i11, float f15, int i12) {
        String str6 = (i12 & 1) != 0 ? dVar.f26033a : str;
        String str7 = (i12 & 2) != 0 ? dVar.f26034b : str2;
        String str8 = (i12 & 4) != 0 ? dVar.f26035c : str3;
        int i13 = (i12 & 8) != 0 ? dVar.f26036d : i;
        float f16 = (i12 & 16) != 0 ? dVar.e : 0.42f;
        float f17 = (i12 & 32) != 0 ? dVar.f26037f : f10;
        float f18 = (i12 & 64) != 0 ? dVar.f26038g : f11;
        float f19 = (i12 & 128) != 0 ? dVar.f26039h : f12;
        float f20 = (i12 & 256) != 0 ? dVar.i : f13;
        int i14 = (i12 & 512) != 0 ? dVar.f26040j : i10;
        boolean z12 = (i12 & 1024) != 0 ? dVar.f26041k : z3;
        boolean z13 = (i12 & 2048) != 0 ? dVar.f26042l : z9;
        String str9 = (i12 & 4096) != 0 ? dVar.f26043m : str4;
        boolean z14 = (i12 & 8192) != 0 ? dVar.f26044n : z10;
        String str10 = str6;
        boolean z15 = (i12 & 16384) != 0 ? dVar.f26045o : z11;
        Float f21 = (i12 & DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY) != 0 ? dVar.f26046p : f14;
        String str11 = (i12 & 65536) != 0 ? dVar.f26047q : str5;
        int i15 = (i12 & 131072) != 0 ? dVar.f26048r : i11;
        float f22 = (i12 & 262144) != 0 ? dVar.f26049s : f15;
        dVar.getClass();
        str10.getClass();
        str7.getClass();
        str8.getClass();
        str11.getClass();
        return new d(str10, str7, str8, i13, f16, f17, f18, f19, f20, i14, z12, z13, str9, z14, z15, f21, str11, i15, f22);
    }

    public final String b() {
        return this.f26033a;
    }

    public final boolean c() {
        return this.f26042l;
    }

    public final float d() {
        return this.i;
    }

    public final float e() {
        return this.f26039h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.a(this.f26033a, dVar.f26033a) && kotlin.jvm.internal.a(this.f26034b, dVar.f26034b) && kotlin.jvm.internal.a(this.f26035c, dVar.f26035c) && this.f26036d == dVar.f26036d && Float.compare(this.e, dVar.e) == 0 && Float.compare(this.f26037f, dVar.f26037f) == 0 && Float.compare(this.f26038g, dVar.f26038g) == 0 && Float.compare(this.f26039h, dVar.f26039h) == 0 && Float.compare(this.i, dVar.i) == 0 && this.f26040j == dVar.f26040j && this.f26041k == dVar.f26041k && this.f26042l == dVar.f26042l && kotlin.jvm.internal.a(this.f26043m, dVar.f26043m) && this.f26044n == dVar.f26044n && this.f26045o == dVar.f26045o && kotlin.jvm.internal.a(this.f26046p, dVar.f26046p) && kotlin.jvm.internal.a(this.f26047q, dVar.f26047q) && this.f26048r == dVar.f26048r && Float.compare(this.f26049s, dVar.f26049s) == 0) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.e;
    }

    public final float g() {
        return this.f26037f;
    }

    public final float h() {
        return this.f26038g;
    }

    public final int hashCode() {
        int hashCode;
        int c10 = a.c(a.c(a.b(this.f26040j, a.a(a.a(a.a(a.a(a.a(a.b(this.f26036d, a.e(this.f26035c, a.e(this.f26034b, this.f26033a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f26037f), 31, this.f26038g), 31, this.f26039h), 31, this.i), 31), 31, this.f26041k), 31, this.f26042l);
        int i = 0;
        String str = this.f26043m;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int c11 = a.c(a.c((c10 + hashCode) * 31, 31, this.f26044n), 31, this.f26045o);
        Float f10 = this.f26046p;
        if (f10 != null) {
            i = f10.hashCode();
        }
        return Float.hashCode(this.f26049s) + a.b(this.f26048r, a.e(this.f26047q, (c11 + i) * 31, 31), 31);
    }

    public final int i() {
        return this.f26040j;
    }

    public final String toString() {
        StringBuilder q10 = a.q("CanvasText(id=", this.f26033a, ", text=", this.f26034b, ", fontId=");
        q10.append(this.f26035c);
        q10.append(", colorArgb=");
        q10.append(this.f26036d);
        q10.append(", sizeFrac=");
        a5.a.s(q10, this.e, ", x=", this.f26037f, ", y=");
        a5.a.s(q10, this.f26038g, ", scale=", this.f26039h, ", rotation=");
        q10.append(this.i);
        q10.append(", z=");
        q10.append(this.f26040j);
        q10.append(", visible=");
        q10.append(this.f26041k);
        q10.append(", locked=");
        q10.append(this.f26042l);
        q10.append(", name=");
        q10.append(this.f26043m);
        q10.append(", isBold=");
        q10.append(this.f26044n);
        q10.append(", isItalic=");
        q10.append(this.f26045o);
        q10.append(", wFrac=");
        q10.append(this.f26046p);
        q10.append(", effect=");
        q10.append(this.f26047q);
        q10.append(", effectColorArgb=");
        q10.append(this.f26048r);
        q10.append(", effectAmount=");
        q10.append(this.f26049s);
        q10.append(")");
        return q10.toString();
    }

    public d(String str, String str2, String str3, int i, float f10, float f11, float f12, float f13, float f14, int i10, boolean z3, boolean z9, String str4, boolean z10, boolean z11, Float f15, String str5, int i11, float f16) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str5.getClass();
        this.f26033a = str;
        this.f26034b = str2;
        this.f26035c = str3;
        this.f26036d = i;
        this.e = f10;
        this.f26037f = f11;
        this.f26038g = f12;
        this.f26039h = f13;
        this.i = f14;
        this.f26040j = i10;
        this.f26041k = z3;
        this.f26042l = z9;
        this.f26043m = str4;
        this.f26044n = z10;
        this.f26045o = z11;
        this.f26046p = f15;
        this.f26047q = str5;
        this.f26048r = i11;
        this.f26049s = f16;
    }
}
