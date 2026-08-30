package c;

import android.app.ActivityOptions;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.BackEvent;

/* loaded from: classes.dex */
public abstract class a {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static boolean e(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }

    public static float f(BackEvent backEvent) {
        return backEvent.getProgress();
    }

    public static void g(AccessibilityEvent accessibilityEvent, boolean z3) {
        accessibilityEvent.setAccessibilityDataSensitive(z3);
    }

    public static void h(AccessibilityNodeInfo accessibilityNodeInfo, boolean z3) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z3);
    }

    public static void i(ActivityOptions activityOptions) {
        activityOptions.setShareIdentityEnabled(false);
    }

    public static int j(BackEvent backEvent) {
        return backEvent.getSwipeEdge();
    }

    public static float k(BackEvent backEvent) {
        return backEvent.getTouchX();
    }

    public static float l(BackEvent backEvent) {
        return backEvent.getTouchY();
    }
}
