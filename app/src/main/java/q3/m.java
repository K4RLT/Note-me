package q3;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public abstract class m {
    public static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i10) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i10);
    }

    public static void b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
}
