package ya;

import android.text.Layout;

/* loaded from: classes.dex */
public abstract class c1 {
    public static final int a(Layout layout, int i, boolean z3) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z3) {
                    return lineForOffset - 1;
                }
            } else if (!z3) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }
}
