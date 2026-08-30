package r3;
import c.a;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.ink.storage.DecompressedBytes;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f24528c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f24529d;
    public static final d e;

    /* renamed from: f, reason: collision with root package name */
    public static final d f24530f;

    /* renamed from: g, reason: collision with root package name */
    public static final d f24531g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f24532h;
    public static final d i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f24533j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f24534a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24535b;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        new d(null, 1, null, null);
        new d(null, 2, null, null);
        new d(null, 4, null, null);
        new d(null, 8, null, null);
        new d(null, 16, null, null);
        new d(null, 32, null, null);
        f24528c = new d(null, 64, null, null);
        f24529d = new d(null, 128, null, null);
        new d(null, 256, null, h.class);
        new d(null, 512, null, h.class);
        new d(null, 1024, null, i.class);
        new d(null, 2048, null, i.class);
        e = new d(null, 4096, null, null);
        f24530f = new d(null, 8192, null, null);
        new d(null, 16384, null, null);
        new d(null, DecompressedBytes.DECOMPRESSED_BYTES_INITIAL_CAPACITY, null, null);
        new d(null, 65536, null, null);
        new d(null, 131072, null, m.class);
        new d(null, 262144, null, null);
        new d(null, 524288, null, null);
        new d(null, 1048576, null, null);
        new d(null, 2097152, null, n.class);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, k.class);
        f24531g = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f24532h = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        i = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f24533j = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction = null;
        }
        new d(accessibilityAction, R.id.accessibilityActionPageUp, null, null);
        if (i10 >= 29) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        } else {
            accessibilityAction2 = null;
        }
        new d(accessibilityAction2, R.id.accessibilityActionPageDown, null, null);
        if (i10 >= 29) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction3 = null;
        }
        new d(accessibilityAction3, R.id.accessibilityActionPageLeft, null, null);
        if (i10 >= 29) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        } else {
            accessibilityAction4 = null;
        }
        new d(accessibilityAction4, R.id.accessibilityActionPageRight, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, l.class);
        if (i10 >= 26) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction5 = null;
        }
        new d(accessibilityAction5, R.id.accessibilityActionMoveWindow, null, j.class);
        if (i10 >= 28) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        } else {
            accessibilityAction6 = null;
        }
        new d(accessibilityAction6, R.id.accessibilityActionShowTooltip, null, null);
        if (i10 >= 28) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction7 = null;
        }
        new d(accessibilityAction7, R.id.accessibilityActionHideTooltip, null, null);
        if (i10 >= 30) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction8 = null;
        }
        new d(accessibilityAction8, R.id.accessibilityActionPressAndHold, null, null);
        if (i10 >= 30) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        } else {
            accessibilityAction9 = null;
        }
        new d(accessibilityAction9, R.id.accessibilityActionImeEnter, null, null);
        if (i10 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction10 = null;
        }
        new d(accessibilityAction10, R.id.ALT, null, null);
        if (i10 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction11 = null;
        }
        new d(accessibilityAction11, R.id.CTRL, null, null);
        if (i10 >= 32) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        } else {
            accessibilityAction12 = null;
        }
        new d(accessibilityAction12, R.id.FUNCTION, null, null);
        if (i10 >= 33) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction13 = null;
        }
        new d(accessibilityAction13, R.id.KEYCODE_0, null, null);
        if (i10 >= 34) {
            accessibilityAction14 = a.a();
        } else {
            accessibilityAction14 = null;
        }
        new d(accessibilityAction14, R.id.KEYCODE_3D_MODE, null, null);
    }

    public d(Object obj, int i10, CharSequence charSequence, Class cls) {
        this.f24535b = i10;
        if (obj == null) {
            this.f24534a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
        } else {
            this.f24534a = obj;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f24534a;
        Object obj3 = this.f24534a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f24534a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String c10 = e.c(this.f24535b);
        if (c10.equals("ACTION_UNKNOWN")) {
            Object obj = this.f24534a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(c10);
        return sb2.toString();
    }

    public d(int i10, String str) {
        this(null, i10, str, null);
    }
}
