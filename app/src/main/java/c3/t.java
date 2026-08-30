package c3;
import j.f;
import p.d;

import android.content.Context;
import android.view.View;
import android.view.Window;
import c0.d0;
import q3.q0;
import r0.i1;
import r0.q1;

/* loaded from: classes.dex */
public final class t extends c2.a implements q3.d {
    public final Window C;
    public final i1 D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;

    public t(Context context, Window window) {
        super(context);
        this.C = window;
        this.D = r0.y.B(r.f3801a);
        boolean z3 = q3.p.f23420a;
        q3.f(this, this);
        q3.d(this, new b3.b(this, 1));
    }

    @Override // c2.a
    public final void a(int i, r0.m mVar) {
        int i10;
        boolean z3;
        r0.r rVar = (r0.r) mVar;
        rVar.c0(1735448596);
        if (rVar.h(this)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i;
        if ((i11 & 3) != 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rVar.R(i11 & 1, z3)) {
            ((df.p) this.D.getValue()).invoke(rVar, 0);
        } else {
            rVar.U();
        }
        q1 t3 = rVar.t();
        if (t3 != null) {
            t3.f24332d = new d0(this, i, 3);
        }
    }

    @Override // q3.d
    public final q0 c(View view, q0 q0Var) {
        if (!this.F) {
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                return q0Var.f23423a.n(max, max2, max3, max4);
            }
        }
        return q0Var;
    }

    @Override // c2.a
    public final void e(boolean z3, int i, int i10, int i11, int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = i11 - i;
        int i14 = i12 - i10;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i13 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i14 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // c2.a
    public final void f(int i, int i10) {
        int i11;
        int min;
        int i12 = 0;
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.f(i, i10);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        Window window = this.C;
        if (mode == Integer.MIN_VALUE && !this.E && !this.F && window.getAttributes().height == -2) {
            i11 = size2 + 1;
        } else {
            i11 = size2;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i13 = size - paddingRight;
        if (i13 < 0) {
            i13 = 0;
        }
        int i14 = i11 - paddingBottom;
        if (i14 >= 0) {
            i12 = i14;
        }
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
        }
        childAt.measure(i, i10);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 1073741824) {
                size = childAt.getMeasuredWidth() + paddingRight;
            }
        } else {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                min = childAt.getMeasuredHeight() + paddingBottom;
            } else {
                min = size2;
            }
        } else {
            min = Math.min(size2, childAt.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, min);
        if (!this.F && childAt.getMeasuredHeight() + paddingBottom > size2 && window.getAttributes().height == -2) {
            window.addFlags(Integer.MIN_VALUE);
            if (!this.E) {
                window.setLayout(-1, -1);
            }
        }
    }

    @Override // c2.a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.H;
    }
}
