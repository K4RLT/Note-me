package p2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f22381a;

    /* renamed from: b, reason: collision with root package name */
    public final float f22382b;

    /* renamed from: c, reason: collision with root package name */
    public final float f22383c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22384d;

    public j(float f10, float f11, float f12, int i) {
        this.f22381a = i;
        this.f22382b = f10;
        this.f22383c = f11;
        this.f22384d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f22384d, this.f22382b, this.f22383c, this.f22381a);
    }
}
