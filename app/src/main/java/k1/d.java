package k1;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderNode;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ BlendModeColorFilter b(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* synthetic */ RenderNode c() {
        return new RenderNode("graphicsLayer");
    }

    public static /* synthetic */ void d() {
    }

    public static /* bridge */ /* synthetic */ void e(Canvas canvas) {
        canvas.enableZ();
    }

    public static /* bridge */ /* synthetic */ void f(Paint paint, BlendMode blendMode) {
        paint.setBlendMode(blendMode);
    }

    public static /* bridge */ /* synthetic */ void g(RenderNode renderNode) {
        renderNode.discardDisplayList();
    }

    public static /* bridge */ /* synthetic */ void l(RenderNode renderNode, Paint paint) {
        renderNode.setUseCompositingLayer(true, paint);
    }

    public static /* bridge */ /* synthetic */ boolean o(RenderNode renderNode) {
        return renderNode.hasDisplayList();
    }

    public static /* bridge */ /* synthetic */ void p(Canvas canvas) {
        canvas.disableZ();
    }

    public static /* bridge */ /* synthetic */ void q(RenderNode renderNode) {
        renderNode.setHasOverlappingRendering(true);
    }
}
