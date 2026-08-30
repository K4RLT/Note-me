package p7;

import androidx.ink.rendering.android.canvas.CanvasStrokeRenderer;

/* loaded from: classes.dex */
public final class x0 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return CanvasStrokeRenderer.Companion.create(s0.f22566a);
    }
}
