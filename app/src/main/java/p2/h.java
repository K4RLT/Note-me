package p2;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes.dex */
public final class h implements LineHeightSpan {
    public int A = Integer.MIN_VALUE;
    public int B = Integer.MIN_VALUE;
    public int C = Integer.MIN_VALUE;
    public int D = Integer.MIN_VALUE;
    public int E;
    public int F;

    /* renamed from: u, reason: collision with root package name */
    public final float f22371u;

    /* renamed from: v, reason: collision with root package name */
    public final int f22372v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f22373w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f22374x;

    /* renamed from: y, reason: collision with root package name */
    public final float f22375y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f22376z;

    public h(float f10, int i, boolean z3, boolean z9, float f11, boolean z10) {
        this.f22371u = f10;
        this.f22372v = i;
        this.f22373w = z3;
        this.f22374x = z9;
        this.f22375y = f11;
        this.f22376z = z10;
        if ((0.0f <= f11 && f11 <= 1.0f) || f11 == -1.0f) {
            return;
        }
        s2.a.b("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i10, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        boolean z3;
        int i13;
        int i14;
        double ceil;
        int i15 = fontMetricsInt.descent;
        int i16 = fontMetricsInt.ascent;
        if (i15 - i16 > 0) {
            boolean z9 = true;
            if (i == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i10 != this.f22372v) {
                z9 = false;
            }
            boolean z10 = this.f22374x;
            boolean z11 = this.f22373w;
            if (z3 && z9 && z11 && z10) {
                return;
            }
            if (this.A == Integer.MIN_VALUE) {
                int i17 = i15 - i16;
                int ceil2 = (int) Math.ceil(this.f22371u);
                int i18 = ceil2 - i17;
                if (this.f22376z && i18 <= 0) {
                    int i19 = fontMetricsInt.ascent;
                    this.B = i19;
                    int i20 = fontMetricsInt.descent;
                    this.C = i20;
                    this.A = i19;
                    this.D = i20;
                    this.E = 0;
                    this.F = 0;
                } else {
                    float f10 = this.f22375y;
                    if (f10 == -1.0f) {
                        f10 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                    }
                    if (i18 <= 0) {
                        ceil = Math.ceil(i18 * f10);
                    } else {
                        ceil = Math.ceil((1.0f - f10) * i18);
                    }
                    int i21 = (int) ceil;
                    int i22 = fontMetricsInt.descent;
                    int i23 = i21 + i22;
                    this.C = i23;
                    int i24 = i23 - ceil2;
                    this.B = i24;
                    if (z11) {
                        i24 = fontMetricsInt.ascent;
                    }
                    this.A = i24;
                    if (z10) {
                        i23 = i22;
                    }
                    this.D = i23;
                    this.E = fontMetricsInt.ascent - i24;
                    this.F = i23 - i22;
                }
            }
            if (z3) {
                i13 = this.A;
            } else {
                i13 = this.B;
            }
            fontMetricsInt.ascent = i13;
            if (z9) {
                i14 = this.D;
            } else {
                i14 = this.C;
            }
            fontMetricsInt.descent = i14;
        }
    }
}
