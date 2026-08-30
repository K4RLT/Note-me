package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s40 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;

    /* renamed from: q, reason: collision with root package name */
    public static final String f10491q;

    /* renamed from: r, reason: collision with root package name */
    public static final String f10492r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f10493s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f10494t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f10495u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f10496v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f10497w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f10498x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f10499y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f10500z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f10501a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f10502b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f10503c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f10504d;
    public final float e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10505f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10506g;

    /* renamed from: h, reason: collision with root package name */
    public final float f10507h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f10508j;

    /* renamed from: k, reason: collision with root package name */
    public final float f10509k;

    /* renamed from: l, reason: collision with root package name */
    public final int f10510l;

    /* renamed from: m, reason: collision with root package name */
    public final float f10511m;

    /* renamed from: n, reason: collision with root package name */
    public final int f10512n;

    /* renamed from: o, reason: collision with root package name */
    public final float f10513o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10514p;

    static {
        Layout.Alignment alignment = null;
        float f10 = -3.4028235E38f;
        int i = Integer.MIN_VALUE;
        new s40("", alignment, alignment, null, f10, i, i, f10, i, i, f10, f10, f10, i, 0.0f, 0);
        String str = bq0.f4860a;
        f10491q = Integer.toString(0, 36);
        f10492r = Integer.toString(17, 36);
        f10493s = Integer.toString(1, 36);
        f10494t = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f10495u = Integer.toString(18, 36);
        f10496v = Integer.toString(4, 36);
        f10497w = Integer.toString(5, 36);
        f10498x = Integer.toString(6, 36);
        f10499y = Integer.toString(7, 36);
        f10500z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        F = Integer.toString(14, 36);
        G = Integer.toString(15, 36);
        H = Integer.toString(16, 36);
        I = Integer.toString(19, 36);
    }

    public /* synthetic */ s40(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i, int i10, float f11, int i11, int i12, float f12, float f13, float f14, int i13, float f15, int i14) {
        boolean z3;
        String str;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            b80.l(z3);
        }
        if (charSequence instanceof Spanned) {
            this.f10501a = SpannedString.valueOf(charSequence);
        } else {
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            this.f10501a = str;
        }
        this.f10502b = alignment;
        this.f10503c = alignment2;
        this.f10504d = bitmap;
        this.e = f10;
        this.f10505f = i;
        this.f10506g = i10;
        this.f10507h = f11;
        this.i = i11;
        this.f10508j = f13;
        this.f10509k = f14;
        this.f10510l = i12;
        this.f10511m = f12;
        this.f10512n = i13;
        this.f10513o = f15;
        this.f10514p = i14;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && s40.class == obj.getClass()) {
                s40 s40Var = (s40) obj;
                if (TextUtils.equals(this.f10501a, s40Var.f10501a) && this.f10502b == s40Var.f10502b && this.f10503c == s40Var.f10503c) {
                    Bitmap bitmap = s40Var.f10504d;
                    Bitmap bitmap2 = this.f10504d;
                    if (bitmap2 == null) {
                        if (bitmap != null) {
                            return false;
                        }
                    } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
                        return false;
                    }
                    if (this.e == s40Var.e && this.f10505f == s40Var.f10505f && this.f10506g == s40Var.f10506g && this.f10507h == s40Var.f10507h && this.i == s40Var.i && this.f10508j == s40Var.f10508j && this.f10509k == s40Var.f10509k && this.f10510l == s40Var.f10510l && this.f10511m == s40Var.f10511m && this.f10512n == s40Var.f10512n && this.f10513o == s40Var.f10513o && this.f10514p == s40Var.f10514p) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.f10501a, this.f10502b, this.f10503c, this.f10504d, Float.valueOf(this.e), Integer.valueOf(this.f10505f), Integer.valueOf(this.f10506g), Float.valueOf(this.f10507h), Integer.valueOf(this.i), Float.valueOf(this.f10508j), Float.valueOf(this.f10509k), Boolean.FALSE, -16777216, Integer.valueOf(this.f10510l), Float.valueOf(this.f10511m), Integer.valueOf(this.f10512n), Float.valueOf(this.f10513o), Integer.valueOf(this.f10514p));
    }
}
