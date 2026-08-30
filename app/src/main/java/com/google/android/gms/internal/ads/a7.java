package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.ads.AdError;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a7 {
    public static final a7 C;
    public final Integer A;
    public final d51 B;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f4379a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f4380b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f4381c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f4382d;
    public final CharSequence e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f4383f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f4384g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f4385h;
    public final Integer i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f4386j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f4387k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f4388l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f4389m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f4390n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f4391o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f4392p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f4393q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f4394r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f4395s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f4396t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f4397u;

    /* renamed from: v, reason: collision with root package name */
    public final CharSequence f4398v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f4399w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f4400x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f4401y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f4402z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.j6] */
    static {
        com.google.android.gms.internal.ads.j6 obj = new Object();
        b51 b51Var = d51.f5314v;
        obj.A = y51.f12781y;
        C = new a7(obj);
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(AdError.NETWORK_ERROR_CODE, 36);
    }

    public a7(j6 j6Var) {
        Boolean bool = j6Var.f7344k;
        Integer num = j6Var.f7359z;
        Integer num2 = j6Var.f7343j;
        int i = 1;
        int i10 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num2 = -1;
            } else if (num2 == null || num2.intValue() == -1) {
                if (num != null) {
                    switch (num.intValue()) {
                        case gl.zzm /* 21 */:
                            i = 2;
                            break;
                        case 22:
                            i = 3;
                            break;
                        case 23:
                            i = 4;
                            break;
                        case 24:
                            i = 5;
                            break;
                        case 25:
                            i = 6;
                            break;
                    }
                    num2 = Integer.valueOf(i);
                }
                i = 0;
                num2 = Integer.valueOf(i);
            }
        } else if (num2 != null) {
            boolean z3 = num2.intValue() != -1;
            bool = Boolean.valueOf(z3);
            if (z3 && num == null) {
                switch (num2.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i10 = 21;
                        break;
                    case 3:
                        i10 = 22;
                        break;
                    case 4:
                        i10 = 23;
                        break;
                    case 5:
                        i10 = 24;
                        break;
                    case 6:
                        i10 = 25;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                num = Integer.valueOf(i10);
            }
        } else {
            num2 = null;
        }
        this.f4379a = j6Var.f7336a;
        this.f4380b = j6Var.f7337b;
        this.f4381c = j6Var.f7338c;
        this.f4382d = j6Var.f7339d;
        this.e = j6Var.e;
        this.f4383f = j6Var.f7340f;
        this.f4384g = j6Var.f7341g;
        this.f4385h = j6Var.f7342h;
        this.i = j6Var.i;
        this.f4386j = num2;
        this.f4387k = bool;
        Integer num3 = j6Var.f7345l;
        this.f4388l = num3;
        this.f4389m = num3;
        this.f4390n = j6Var.f7346m;
        this.f4391o = j6Var.f7347n;
        this.f4392p = j6Var.f7348o;
        this.f4393q = j6Var.f7349p;
        this.f4394r = j6Var.f7350q;
        this.f4395s = j6Var.f7351r;
        this.f4396t = j6Var.f7352s;
        this.f4397u = j6Var.f7353t;
        this.f4398v = j6Var.f7354u;
        this.f4399w = j6Var.f7355v;
        this.f4400x = j6Var.f7356w;
        this.f4401y = j6Var.f7357x;
        this.f4402z = j6Var.f7358y;
        this.A = num;
        this.B = j6Var.A;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.google.android.gms.internal.ads.j6] */
    public final j6 a() {
        com.google.android.gms.internal.ads.j6 obj = new Object();
        obj.f7336a = this.f4379a;
        obj.f7337b = this.f4380b;
        obj.f7338c = this.f4381c;
        obj.f7339d = this.f4382d;
        obj.e = this.e;
        obj.f7340f = this.f4383f;
        obj.f7341g = this.f4384g;
        obj.f7342h = this.f4385h;
        obj.i = this.i;
        obj.f7343j = this.f4386j;
        obj.f7344k = this.f4387k;
        obj.f7345l = this.f4389m;
        obj.f7346m = this.f4390n;
        obj.f7347n = this.f4391o;
        obj.f7348o = this.f4392p;
        obj.f7349p = this.f4393q;
        obj.f7350q = this.f4394r;
        obj.f7351r = this.f4395s;
        obj.f7352s = this.f4396t;
        obj.f7353t = this.f4397u;
        obj.f7355v = this.f4399w;
        obj.f7354u = this.f4398v;
        obj.f7356w = this.f4400x;
        obj.f7357x = this.f4401y;
        obj.f7358y = this.f4402z;
        obj.f7359z = this.A;
        obj.A = this.B;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a7.class == obj.getClass()) {
            a7 a7Var = (a7) obj;
            if (TextUtils.equals(this.f4379a, a7Var.f4379a) && TextUtils.equals(this.f4380b, a7Var.f4380b) && TextUtils.equals(this.f4381c, a7Var.f4381c) && TextUtils.equals(this.f4382d, a7Var.f4382d) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(this.e, a7Var.e) && Arrays.equals(this.f4383f, a7Var.f4383f) && Objects.equals(this.f4384g, a7Var.f4384g) && Objects.equals(this.f4385h, a7Var.f4385h) && Objects.equals(this.i, a7Var.i) && Objects.equals(this.f4386j, a7Var.f4386j) && Objects.equals(this.f4387k, a7Var.f4387k) && Objects.equals(this.f4389m, a7Var.f4389m) && Objects.equals(this.f4390n, a7Var.f4390n) && Objects.equals(this.f4391o, a7Var.f4391o) && Objects.equals(this.f4392p, a7Var.f4392p) && Objects.equals(this.f4393q, a7Var.f4393q) && Objects.equals(this.f4394r, a7Var.f4394r) && TextUtils.equals(this.f4395s, a7Var.f4395s) && TextUtils.equals(this.f4396t, a7Var.f4396t) && TextUtils.equals(this.f4397u, a7Var.f4397u) && TextUtils.equals(this.f4398v, a7Var.f4398v) && Objects.equals(this.f4399w, a7Var.f4399w) && Objects.equals(this.f4400x, a7Var.f4400x) && TextUtils.equals(this.f4401y, a7Var.f4401y) && TextUtils.equals(null, null) && TextUtils.equals(this.f4402z, a7Var.f4402z) && Objects.equals(this.A, a7Var.A) && Objects.equals(this.B, a7Var.B)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f4379a, this.f4380b, this.f4381c, this.f4382d, null, null, this.e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f4383f)), this.f4384g, null, this.f4385h, this.i, this.f4386j, this.f4387k, null, this.f4389m, this.f4390n, this.f4391o, this.f4392p, this.f4393q, this.f4394r, this.f4395s, this.f4396t, this.f4397u, this.f4398v, this.f4399w, this.f4400x, this.f4401y, null, this.f4402z, this.A, Boolean.TRUE, this.B);
    }
}
