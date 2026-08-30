package a7;

import android.content.pm.ApkChecksum;
import android.media.metrics.MediaMetricsManager;
import android.view.AttachedSurfaceControl;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {
    public static /* bridge */ /* synthetic */ ApkChecksum d(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager g(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* bridge */ /* synthetic */ AttachedSurfaceControl p(ViewGroup viewGroup) {
        return viewGroup.getRootSurfaceControl();
    }
}
