package c2;
import b2.i0;
import b3.k;
import y1.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d1 extends ViewGroup {

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f3504u;

    /* renamed from: v, reason: collision with root package name */
    public final HashMap f3505v;

    public d1(Context context) {
        super(context);
        setClipChildren(false);
        this.f3504u = new HashMap();
        this.f3505v = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<k, i0> getHolderToLayoutNode() {
        return this.f3504u;
    }

    public final HashMap<i0, k> getLayoutNodeToHolder() {
        return this.f3505v;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i10, int i11, int i12) {
        for (k kVar : this.f3504u.keySet()) {
            kVar.layout(kVar.getLeft(), kVar.getTop(), kVar.getRight(), kVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        boolean z3;
        int i11;
        boolean z9 = false;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            a.a("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z9 = true;
        }
        if (!z9) {
            a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i10));
        for (k kVar : this.f3504u.keySet()) {
            int i12 = kVar.O;
            if (i12 != Integer.MIN_VALUE && (i11 = kVar.P) != Integer.MIN_VALUE) {
                kVar.measure(i12, i11);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            i0 i0Var = (i0) this.f3504u.get(childAt);
            if (childAt.isLayoutRequested() && i0Var != null) {
                i0.V(i0Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
