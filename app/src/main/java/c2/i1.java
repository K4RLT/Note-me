package c2;
import c2.h1;
import k1.l0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class i1 implements h1 {

    /* renamed from: u, reason: collision with root package name */
    public final Matrix f3555u = new Matrix();

    /* renamed from: v, reason: collision with root package name */
    public final int[] f3556v = new int[2];

    @Override // h1
    public void c(View view, float[] fArr) {
        Matrix matrix = this.f3555u;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f3556v;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i10 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i, iArr[1] - i10);
        l0.y(matrix, fArr);
    }
}
