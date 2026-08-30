package p2;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class a extends MetricAffectingSpan {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22363u;

    /* renamed from: v, reason: collision with root package name */
    public final float f22364v;

    public /* synthetic */ a(int i, float f10) {
        this.f22363u = i;
        this.f22364v = f10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f22363u) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f22364v);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f22364v);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f22363u) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f22364v);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f22364v);
                return;
        }
    }
}
