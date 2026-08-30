package p2;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f22385a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22386b;

    public k(boolean z3, boolean z9) {
        this.f22385a = z3;
        this.f22386b = z9;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f22385a);
        textPaint.setStrikeThruText(this.f22386b);
    }
}
