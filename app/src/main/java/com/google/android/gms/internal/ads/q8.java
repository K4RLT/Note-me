package com.google.android.gms.internal.ads;
import g3.a;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* loaded from: classes.dex */
public final class q8 implements p7 {
    public final int A;

    /* renamed from: u, reason: collision with root package name */
    public final xk0 f9767u = new xk0();

    /* renamed from: v, reason: collision with root package name */
    public final boolean f9768v;

    /* renamed from: w, reason: collision with root package name */
    public final int f9769w;

    /* renamed from: x, reason: collision with root package name */
    public final int f9770x;

    /* renamed from: y, reason: collision with root package name */
    public final String f9771y;

    /* renamed from: z, reason: collision with root package name */
    public final float f9772z;

    public q8(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f9769w = bArr[24];
            this.f9770x = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f9771y = true == "Serif".equals(new String(bArr, 43, bArr.length + (-43), StandardCharsets.UTF_8)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.A = i;
            boolean z3 = (bArr[0] & 32) != 0;
            this.f9768v = z3;
            if (z3) {
                this.f9772z = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
                return;
            } else {
                this.f9772z = 0.85f;
                return;
            }
        }
        this.f9769w = 0;
        this.f9770x = -1;
        this.f9771y = "sans-serif";
        this.f9768v = false;
        this.f9772z = 0.85f;
        this.A = -1;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            int i14 = i13 | 33;
            int i15 = i & 1;
            int i16 = i & 2;
            boolean z3 = true;
            if (i15 != 0) {
                if (i16 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i11, i12, i14);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i11, i12, i14);
                    z3 = false;
                }
            } else {
                if (i16 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i11, i12, i14);
                }
                z3 = false;
            }
            if ((i & 4) == 0) {
                if (i15 == 0 && !z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(0), i11, i12, i14);
                    return;
                }
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i12, i14);
        }
    }

    public static void b(SpannableStringBuilder spannableStringBuilder, int i, int i10, int i11, int i12, int i13) {
        if (i != i10) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i11, i12, i13 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.p7
    public final void w(int i, int i10, r7 r7Var, byte[] bArr) {
        boolean z3;
        String k3;
        int i11;
        int i12;
        float f10;
        int i13;
        boolean z9;
        float max;
        boolean z10;
        boolean z11;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        int i18;
        xk0 xk0Var = this.f9767u;
        xk0Var.z(bArr, i + i10);
        xk0Var.E(i);
        int i19 = 0;
        int i20 = 1;
        int i21 = 2;
        if (xk0Var.B() >= 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        b80.l(z3);
        int L = xk0Var.L();
        if (L == 0) {
            k3 = "";
        } else {
            int i22 = xk0Var.f12581b;
            Charset q10 = xk0Var.q();
            int i23 = xk0Var.f12581b - i22;
            if (q10 == null) {
                q10 = StandardCharsets.UTF_8;
            }
            k3 = xk0Var.k(L - i23, q10);
        }
        if (k3.isEmpty()) {
            b51 b51Var = d51.f5314v;
            r7Var.mo213l(new l7(y51.f12781y, -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k3);
        int length = spannableStringBuilder.length();
        int i24 = this.f9769w;
        a(spannableStringBuilder, i24, 0, 0, length, 16711680);
        int i25 = i24;
        int length2 = spannableStringBuilder.length();
        int i26 = this.f9770x;
        b(spannableStringBuilder, i26, -1, 0, length2, 16711680);
        int i27 = i26;
        int length3 = spannableStringBuilder.length();
        String str = this.f9771y;
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length3, 16711713);
        }
        float f12 = this.f9772z;
        while (xk0Var.B() >= 8) {
            int i28 = xk0Var.f12581b;
            int b10 = xk0Var.b();
            int b11 = xk0Var.b();
            if (b11 == 1937013100) {
                if (xk0Var.B() >= i21) {
                    z10 = i20;
                } else {
                    z10 = i19;
                }
                b80.l(z10);
                int L2 = xk0Var.L();
                int i29 = i19;
                while (i29 < L2) {
                    if (xk0Var.B() >= 12) {
                        z11 = i20;
                    } else {
                        z11 = i19;
                    }
                    b80.l(z11);
                    int L3 = xk0Var.L();
                    int L4 = xk0Var.L();
                    xk0Var.G(i21);
                    int i30 = L2;
                    int K = xk0Var.K();
                    xk0Var.G(i20);
                    int b12 = xk0Var.b();
                    if (L4 > spannableStringBuilder.length()) {
                        int length4 = spannableStringBuilder.length();
                        i14 = i25;
                        i15 = i27;
                        f11 = f12;
                        StringBuilder sb2 = new StringBuilder(g3.a.v(String.valueOf(length4), String.valueOf(L4).length() + 44, 2));
                        sb2.append("Truncating styl end (");
                        sb2.append(L4);
                        sb2.append(") to cueText.length() (");
                        sb2.append(length4);
                        sb2.append(").");
                        x21.F("Tx3gParser", sb2.toString());
                        L4 = spannableStringBuilder.length();
                    } else {
                        i14 = i25;
                        i15 = i27;
                        f11 = f12;
                    }
                    if (L3 >= L4) {
                        StringBuilder sb3 = new StringBuilder(g3.a.v(String.valueOf(L4), String.valueOf(L3).length() + 36, 2));
                        sb3.append("Ignoring styl with start (");
                        sb3.append(L3);
                        sb3.append(") >= end (");
                        sb3.append(L4);
                        sb3.append(").");
                        x21.F("Tx3gParser", sb3.toString());
                        i17 = i29;
                        i16 = i30;
                        i18 = i15;
                    } else {
                        i16 = i30;
                        i17 = i29;
                        a(spannableStringBuilder, K, i14, L3, L4, 0);
                        i18 = i15;
                        b(spannableStringBuilder, b12, i18, L3, L4, 0);
                    }
                    L2 = i16;
                    i27 = i18;
                    f12 = f11;
                    i25 = i14;
                    i20 = 1;
                    i21 = 2;
                    i29 = i17 + 1;
                    i19 = 0;
                }
                i11 = i25;
                i12 = i27;
                f10 = f12;
                i13 = i21;
            } else {
                i11 = i25;
                i12 = i27;
                f10 = f12;
                if (b11 == 1952608120 && this.f9768v) {
                    i13 = 2;
                    if (xk0Var.B() >= 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    b80.l(z9);
                    float L5 = xk0Var.L();
                    String str2 = bq0.f4860a;
                    max = Math.max(0.0f, Math.min(L5 / this.A, 0.95f));
                    xk0Var.E(i28 + b10);
                    i21 = i13;
                    i27 = i12;
                    i19 = 0;
                    i20 = 1;
                    f12 = max;
                    i25 = i11;
                } else {
                    i13 = 2;
                }
            }
            max = f10;
            xk0Var.E(i28 + b10);
            i21 = i13;
            i27 = i12;
            i19 = 0;
            i20 = 1;
            f12 = max;
            i25 = i11;
        }
        r7Var.mo213l(new l7(d51.q(new s40(spannableStringBuilder, null, null, null, f12, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, 0.0f, 0)), -9223372036854775807L, -9223372036854775807L));
    }
}
