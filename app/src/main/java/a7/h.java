package a7;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import androidx.ink.authoring.internal.CanvasInProgressStrokesRenderHelperV33;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ RenderNode D() {
        return new RenderNode("CanvasInProgressStrokesRenderHelperV29-OffScreen");
    }

    public static /* bridge */ /* synthetic */ int a(RecordingCanvas recordingCanvas) {
        return recordingCanvas.getSaveCount();
    }

    public static /* synthetic */ RenderNode e() {
        return new RenderNode("OffscreenLayer.main");
    }

    public static /* synthetic */ RenderNode f(String str) {
        return new RenderNode(str);
    }

    public static /* synthetic */ void g() {
    }

    public static /* bridge */ /* synthetic */ void i(Paint paint) {
        paint.setBlendMode(BlendMode.CLEAR);
    }

    public static /* bridge */ /* synthetic */ void k(RecordingCanvas recordingCanvas) {
        recordingCanvas.drawColor(0, BlendMode.CLEAR);
    }

    public static /* bridge */ /* synthetic */ void l(RenderNode renderNode) {
        renderNode.setClipRect(null);
    }

    public static /* bridge */ /* synthetic */ void m(RenderNode renderNode, Rect rect) {
        renderNode.setClipRect(rect);
    }

    public static /* bridge */ /* synthetic */ boolean u() {
        return HardwareBuffer.isSupported(1, 1, 1, 1, CanvasInProgressStrokesRenderHelperV33.DESIRED_USAGE_FLAGS);
    }

    public static /* synthetic */ RenderNode z() {
        return new RenderNode("OffscreenLayer.shadow");
    }
}
