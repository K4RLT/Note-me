package n2;

import android.os.Build;
import android.text.BoringLayout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import ya.e1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f21117a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f21118b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21119c;

    /* renamed from: d, reason: collision with root package name */
    public float f21120d = Float.NaN;
    public float e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f21121f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21122g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f21123h;

    public e(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f21117a = charSequence;
        this.f21118b = textPaint;
        this.f21119c = i;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metrics;
        if (!this.f21122g) {
            TextDirectionHeuristic a10 = i.a(this.f21119c);
            int i = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f21117a;
            TextPaint textPaint = this.f21118b;
            if (i >= 33) {
                metrics = BoringLayout.isBoring(charSequence, textPaint, a10, true, null);
            } else if (!a10.isRtl(charSequence, 0, charSequence.length())) {
                metrics = BoringLayout.isBoring(charSequence, textPaint, null);
            } else {
                metrics = null;
            }
            this.f21121f = metrics;
            this.f21122g = true;
        }
        return this.f21121f;
    }

    public final CharSequence b() {
        CharacterStyle[] characterStyleArr;
        boolean z3;
        CharSequence charSequence = this.f21123h;
        if (charSequence == null) {
            charSequence = this.f21117a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (e1.a(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    int i = 0;
                    while (true) {
                        if (i < characterStyleArr.length) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            break;
                        }
                        int i10 = i + 1;
                        try {
                            CharacterStyle characterStyle = characterStyleArr[i];
                            if (!(characterStyle instanceof MetricAffectingSpan)) {
                                if (spannableString == null) {
                                    spannableString = new SpannableString(charSequence);
                                }
                                spannableString.removeSpan(characterStyle);
                            }
                            i = i10;
                        } catch (ArrayIndexOutOfBoundsException e) {
                            l4.a.h(e.getMessage());
                            return null;
                        }
                    }
                    if (spannableString != null) {
                        charSequence = spannableString;
                    }
                }
            }
            this.f21123h = charSequence;
        }
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (ya.e1.a(r2, p2.e.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c() {
        /*
            r6 = this;
            float r0 = r6.f21120d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r6.f21120d
            return r0
        Lb:
            android.text.BoringLayout$Metrics r0 = r6.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r6.f21118b
            if (r2 >= 0) goto L34
            java.lang.CharSequence r0 = r6.b()
            int r0 = r0.length()
            java.lang.CharSequence r2 = r6.b()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r2, r4, r0, r3)
            double r4 = (double) r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
        L34:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L39
            goto L5d
        L39:
            java.lang.CharSequence r2 = r6.f21117a
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L51
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<p2.f> r4 = p2.f.class
            boolean r4 = ya.e1.a(r2, r4)
            if (r4 != 0) goto L5a
            java.lang.Class<p2.e> r4 = p2.e.class
            boolean r2 = ya.e1.a(r2, r4)
            if (r2 != 0) goto L5a
        L51:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L5a
            goto L5d
        L5a:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L5d:
            r6.f21120d = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.e.c():float");
    }
}
