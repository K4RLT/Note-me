package p2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import ya.l9;

/* loaded from: classes.dex */
public final class c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14, int i15, boolean z3, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i14)) == layout.getLineCount() - 1) {
            n2.g gVar = n2.i.f21142a;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float b10 = l9.b(layout, lineForOffset, paint) + l9.a(layout, lineForOffset, paint);
                if (b10 == 0.0f) {
                    return;
                }
                canvas.getClass();
                canvas.translate(b10, 0.0f);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z3) {
        return 0;
    }
}
