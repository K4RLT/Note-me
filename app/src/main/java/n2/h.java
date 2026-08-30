package n2;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.l3;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f21127a;

    /* renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f21128b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21129c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f21130d;
    public l3 e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout f21131f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21132g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21133h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f21134j;

    /* renamed from: k, reason: collision with root package name */
    public final float f21135k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21136l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f21137m;

    /* renamed from: n, reason: collision with root package name */
    public final int f21138n;

    /* renamed from: o, reason: collision with root package name */
    public final p2.h[] f21139o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f21140p = new Rect();

    /* renamed from: q, reason: collision with root package name */
    public u0 f21141q;

    /* JADX WARN: Removed duplicated region for block: B:106:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, boolean r28, int r29, int r30, int r31, int r32, int r33, int r34, n2.e r35) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, n2.e):void");
    }

    public final int a() {
        int height;
        boolean z3 = this.f21130d;
        Layout layout = this.f21131f;
        if (z3) {
            height = layout.getLineBottom(this.f21132g - 1);
        } else {
            height = layout.getHeight();
        }
        return height + this.f21133h + this.i + this.f21138n;
    }

    public final float b(int i) {
        if (i == this.f21132g - 1) {
            return this.f21134j + this.f21135k;
        }
        return 0.0f;
    }

    public final u0 c() {
        u0 u0Var = this.f21141q;
        if (u0Var == null) {
            u0 u0Var2 = new u0(this.f21131f);
            this.f21141q = u0Var2;
            return u0Var2;
        }
        return u0Var;
    }

    public final float d(int i) {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        float f10 = this.f21133h;
        if (i == this.f21132g - 1 && (fontMetricsInt = this.f21137m) != null) {
            lineBaseline = g(i) - fontMetricsInt.ascent;
        } else {
            lineBaseline = this.f21131f.getLineBaseline(i);
        }
        return f10 + lineBaseline;
    }

    public final float e(int i) {
        int i10;
        Paint.FontMetricsInt fontMetricsInt;
        int i11 = this.f21132g;
        int i12 = i11 - 1;
        Layout layout = this.f21131f;
        if (i == i12 && (fontMetricsInt = this.f21137m) != null) {
            return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
        }
        float lineBottom = this.f21133h + layout.getLineBottom(i);
        if (i == i11 - 1) {
            i10 = this.i;
        } else {
            i10 = 0;
        }
        return lineBottom + i10;
    }

    public final int f(int i) {
        g gVar = i.f21142a;
        Layout layout = this.f21131f;
        if (layout.getEllipsisCount(i) > 0 && this.f21128b == TextUtils.TruncateAt.END) {
            return layout.getText().length();
        }
        return layout.getLineEnd(i);
    }

    public final float g(int i) {
        int i10;
        float lineTop = this.f21131f.getLineTop(i);
        if (i == 0) {
            i10 = 0;
        } else {
            i10 = this.f21133h;
        }
        return lineTop + i10;
    }

    public final float h(int i, boolean z3) {
        return b(this.f21131f.getLineForOffset(i)) + c().i(i, true, z3);
    }

    public final float i(int i, boolean z3) {
        return b(this.f21131f.getLineForOffset(i)) + c().i(i, false, z3);
    }

    public final l3 j() {
        l3 l3Var = this.e;
        if (l3Var != null) {
            return l3Var;
        }
        Layout layout = this.f21131f;
        l3 l3Var2 = new l3(layout.getText(), layout.getText().length(), this.f21127a.getTextLocale());
        this.e = l3Var2;
        return l3Var2;
    }
}
