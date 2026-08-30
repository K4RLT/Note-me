package c4;
import k.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import ya.m9;

/* loaded from: classes.dex */
public final class a0 extends ReplacementSpan {

    /* renamed from: v, reason: collision with root package name */
    public final z f3821v;

    /* renamed from: y, reason: collision with root package name */
    public TextPaint f3824y;

    /* renamed from: u, reason: collision with root package name */
    public final Paint.FontMetricsInt f3820u = new Paint.FontMetricsInt();

    /* renamed from: w, reason: collision with root package name */
    public short f3822w = -1;

    /* renamed from: x, reason: collision with root package name */
    public float f3823x = 1.0f;

    public a0(z zVar) {
        m9.a(zVar, "rasterizer cannot be null");
        this.f3821v = zVar;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i10, float f10, int i11, int i12, int i13, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i10, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f3824y;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f3824y = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            characterStyle.updateDrawState(textPaint);
                        }
                    }
                }
            }
            if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f10, i11, f10 + this.f3822w, i13, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        a().getClass();
        float f11 = i12;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        z zVar = this.f3821v;
        j6.n nVar = zVar.f3879b;
        Typeface typeface = (Typeface) nVar.f18941y;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) nVar.f18939w, zVar.f3878a * 2, 2, f10, f11, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i10, Paint.FontMetricsInt fontMetricsInt) {
        short s10;
        Paint.FontMetricsInt fontMetricsInt2 = this.f3820u;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        z zVar = this.f3821v;
        d4.a b10 = zVar.b();
        int a10 = b10.a(14);
        short s11 = 0;
        if (a10 != 0) {
            s10 = ((ByteBuffer) b10.f15727x).getShort(a10 + b10.f15724u);
        } else {
            s10 = 0;
        }
        this.f3823x = abs / s10;
        d4.a b11 = zVar.b();
        int a11 = b11.a(14);
        if (a11 != 0) {
            ((ByteBuffer) b11.f15727x).getShort(a11 + b11.f15724u);
        }
        d4.a b12 = zVar.b();
        int a12 = b12.a(12);
        if (a12 != 0) {
            s11 = ((ByteBuffer) b12.f15727x).getShort(a12 + b12.f15724u);
        }
        short s12 = (short) (s11 * this.f3823x);
        this.f3822w = s12;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s12;
    }
}
