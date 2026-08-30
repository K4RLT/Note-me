package p2;
import a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class i extends ReplacementSpan {

    /* renamed from: u, reason: collision with root package name */
    public Paint.FontMetricsInt f22377u;

    /* renamed from: v, reason: collision with root package name */
    public int f22378v;

    /* renamed from: w, reason: collision with root package name */
    public int f22379w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f22380x;

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.f22377u;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        l.h("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.f22380x) {
            s2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f22379w;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i10, Paint.FontMetricsInt fontMetricsInt) {
        this.f22380x = true;
        paint.getTextSize();
        this.f22377u = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            s2.a("Invalid fontMetrics: line height can not be negative.");
        }
        this.f22378v = (int) Math.ceil(0.0f);
        this.f22379w = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            if (fontMetricsInt.ascent > (-b())) {
                fontMetricsInt.ascent = -b();
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.f22380x) {
            s2.a.b("PlaceholderSpan is not laid out yet.");
        }
        return this.f22378v;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i10, float f10, int i11, int i12, int i13, Paint paint) {
    }
}
