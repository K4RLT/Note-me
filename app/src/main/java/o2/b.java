package o2;

import android.text.TextPaint;
import ya.k1;

/* loaded from: classes.dex */
public final class b extends k1 {

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f21764u;

    /* renamed from: v, reason: collision with root package name */
    public final TextPaint f21765v;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.f21764u = charSequence;
        this.f21765v = textPaint;
    }

    @Override // ya.k1
    public final int a(int i) {
        int textRunCursor;
        CharSequence charSequence = this.f21764u;
        textRunCursor = this.f21765v.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
        return textRunCursor;
    }

    @Override // ya.k1
    public final int b(int i) {
        int textRunCursor;
        CharSequence charSequence = this.f21764u;
        textRunCursor = this.f21765v.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
        return textRunCursor;
    }
}
