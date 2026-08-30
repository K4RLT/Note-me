package g4;

import android.graphics.RenderNode;
import android.view.SurfaceControl;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ RenderNode c() {
        return new RenderNode("node");
    }

    public static /* synthetic */ SurfaceControl.Builder d() {
        return new SurfaceControl.Builder();
    }

    public static /* synthetic */ SurfaceControl.Transaction e() {
        return new SurfaceControl.Transaction();
    }

    public static /* synthetic */ RenderNode z() {
        return new RenderNode("testNode");
    }
}
