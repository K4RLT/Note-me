package ya;
import k9.e0;
import s2.a;

import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class f1 {
    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, int i13, boolean z3, int i14, int i15, int i16, int i17) {
        LineBreakConfig.Builder lineBreakStyle;
        LineBreakConfig.Builder lineBreakWordStyle;
        LineBreakConfig build;
        if (i10 < 0) {
            a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            a.a("invalid end value");
        }
        if (i11 < 0) {
            a.a("invalid maxLines value");
        }
        if (i < 0) {
            a.a("invalid width value");
        }
        if (i12 < 0) {
            a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, i10, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i11);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i12);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z3);
        obtain.setBreakStrategy(i14);
        obtain.setHyphenationFrequency(i17);
        obtain.setIndents(null, null);
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 26) {
            obtain.setJustificationMode(i13);
        }
        if (i18 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i18 >= 33) {
            lineBreakStyle = e0.b().setLineBreakStyle(i15);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i16);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i18 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }
}
