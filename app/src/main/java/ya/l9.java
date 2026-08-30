package ya;
import n2.g;
import n2.i;
import p2.d;

import android.graphics.Paint;
import android.text.Layout;

/* loaded from: classes.dex */
public abstract class l9 {
    public static final float a(Layout layout, int i, Paint paint) {
        int i10;
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        g gVar = i.f21142a;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if (paragraphAlignment == null) {
            i10 = -1;
        } else {
            i10 = d.f22367a[paragraphAlignment.ordinal()];
        }
        if (i10 == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final float b(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        g gVar = i.f21142a;
        if (layout.getEllipsisCount(i) > 0) {
            int i10 = -1;
            if (layout.getParagraphDirection(i) == -1 && layout.getWidth() < layout.getLineRight(i)) {
                float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
                Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
                if (paragraphAlignment != null) {
                    i10 = d.f22367a[paragraphAlignment.ordinal()];
                }
                if (i10 == 1) {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = (layout.getWidth() - measureText) / 2.0f;
                } else {
                    width = layout.getWidth() - layout.getLineRight(i);
                    width2 = layout.getWidth() - measureText;
                }
                return width - width2;
            }
            return 0.0f;
        }
        return 0.0f;
    }
}
