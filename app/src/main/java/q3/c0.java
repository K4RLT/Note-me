package q3;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c0 {
    public static /* bridge */ /* synthetic */ RecordingCanvas d(RenderNode renderNode) {
        return renderNode.beginRecording();
    }

    public static /* synthetic */ RenderNode e() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* synthetic */ WindowInsets.Builder f(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ void j(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public static /* bridge */ /* synthetic */ void k(RenderNode renderNode) {
        renderNode.endRecording();
    }

    public static /* bridge */ /* synthetic */ void l(RenderNode renderNode, int i, int i10) {
        renderNode.setPosition(0, 0, i, i10);
    }
}
