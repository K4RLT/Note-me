package j;
import j.m;
import n.b;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public abstract class m extends ViewGroup {
    public float A;
    public boolean B;
    public int[] C;
    public int[] D;
    public Drawable E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18656u;

    /* renamed from: v, reason: collision with root package name */
    public int f18657v;

    /* renamed from: w, reason: collision with root package name */
    public int f18658w;

    /* renamed from: x, reason: collision with root package name */
    public int f18659x;

    /* renamed from: y, reason: collision with root package name */
    public int f18660y;

    /* renamed from: z, reason: collision with root package name */
    public int f18661z;

    public final void a(Canvas canvas, int i) {
        this.E.setBounds(getPaddingLeft() + this.I, i, (getWidth() - getPaddingRight()) - this.I, this.G + i);
        this.E.draw(canvas);
    }

    public final void b(Canvas canvas, int i) {
        this.E.setBounds(i, getPaddingTop() + this.I, this.F + i, (getHeight() - getPaddingBottom()) - this.I);
        this.E.draw(canvas);
    }

    public final boolean c(int i) {
        if (i == 0) {
            if ((this.H & 1) == 0) {
                return false;
            }
            return true;
        }
        int childCount = getChildCount();
        int i10 = this.H;
        if (i == childCount) {
            if ((i10 & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((i10 & 2) != 0) {
            for (int i11 = i - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        int i = this.f18659x;
        if (i == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f18657v < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i10 = this.f18657v;
        if (childCount > i10) {
            View childAt = getChildAt(i10);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f18657v == 0) {
                    return -1;
                }
                vd.b("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
                return 0;
            }
            int i11 = this.f18658w;
            if (this.f18659x == 1 && (i = this.f18660y & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i11 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f18661z;
                    }
                } else {
                    i11 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f18661z) / 2;
                }
            }
            return i11 + ((LinearLayout.LayoutParams) ((l) childAt.getLayoutParams())).topMargin + baseline;
        }
        vd.b("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        return 0;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f18657v;
    }

    public Drawable getDividerDrawable() {
        return this.E;
    }

    public int getDividerPadding() {
        return this.I;
    }

    public int getDividerWidth() {
        return this.F;
    }

    public int getGravity() {
        return this.f18660y;
    }

    public int getOrientation() {
        return this.f18659x;
    }

    public int getShowDividers() {
        return this.H;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.A;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z3;
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.E != null) {
            int i10 = 0;
            if (this.f18659x == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i10 < virtualChildCount) {
                    View childAt = getChildAt(i10);
                    if (childAt != null && childAt.getVisibility() != 8 && c(i10)) {
                        a(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((l) childAt.getLayoutParams())).topMargin) - this.G);
                    }
                    i10++;
                }
                if (c(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.G;
                    } else {
                        bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((l) childAt2.getLayoutParams())).bottomMargin;
                    }
                    a(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean z9 = o0.f18676a;
            boolean z10 = q3.p.f23420a;
            if (getLayoutDirection() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            while (i10 < virtualChildCount2) {
                View childAt3 = getChildAt(i10);
                if (childAt3 != null && childAt3.getVisibility() != 8 && c(i10)) {
                    l lVar = (l) childAt3.getLayoutParams();
                    if (z3) {
                        left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) lVar).rightMargin;
                    } else {
                        left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) lVar).leftMargin) - this.F;
                    }
                    b(canvas, left2);
                }
                i10++;
            }
            if (c(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 == null) {
                    if (z3) {
                        right = getPaddingLeft();
                    } else {
                        left = getWidth() - getPaddingRight();
                        i = this.F;
                        right = left - i;
                    }
                } else {
                    l lVar2 = (l) childAt4.getLayoutParams();
                    if (z3) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) lVar2).leftMargin;
                        i = this.F;
                        right = left - i;
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) lVar2).rightMargin;
                    }
                }
                b(canvas, right);
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0195  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.m.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0146  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.m.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z3) {
        this.f18656u = z3;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f18657v = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.E) {
            return;
        }
        this.E = drawable;
        boolean z3 = false;
        if (drawable != null) {
            this.F = drawable.getIntrinsicWidth();
            this.G = drawable.getIntrinsicHeight();
        } else {
            this.F = 0;
            this.G = 0;
        }
        if (drawable == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.I = i;
    }

    public void setGravity(int i) {
        if (this.f18660y != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f18660y = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i10 = i & 8388615;
        int i11 = this.f18660y;
        if ((8388615 & i11) != i10) {
            this.f18660y = i10 | ((-8388616) & i11);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.B = z3;
    }

    public void setOrientation(int i) {
        if (this.f18659x != i) {
            this.f18659x = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.H) {
            requestLayout();
        }
        this.H = i;
    }

    public void setVerticalGravity(int i) {
        int i10 = i & 112;
        int i11 = this.f18660y;
        if ((i11 & 112) != i10) {
            this.f18660y = i10 | (i11 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.A = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LinearLayout.LayoutParams(layoutParams);
    }
}
