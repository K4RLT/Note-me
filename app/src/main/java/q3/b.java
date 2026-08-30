package q3;

import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f23379c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f23380a = f23379c;

    /* renamed from: b, reason: collision with root package name */
    public final a f23381b = new a(this);

    public k6.i a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f23380a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new k6.i(24, accessibilityNodeProvider);
        }
        return null;
    }

    public void b(View view, r3.e eVar) {
        this.f23380a.onInitializeAccessibilityNodeInfo(view, eVar.f24537a);
    }
}
