package p2;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes.dex */
public final class b extends MetricAffectingSpan {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f22365u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f22366v;

    public /* synthetic */ b(int i, Object obj) {
        this.f22365u = i;
        this.f22366v = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f22365u) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f22366v);
                return;
            default:
                textPaint.setTypeface((Typeface) this.f22366v);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.f22365u) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.f22366v);
                return;
            default:
                textPaint.setTypeface((Typeface) this.f22366v);
                return;
        }
    }
}
