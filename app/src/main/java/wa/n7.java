package wa;
import r0.m;
import r0.r;

import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class n7 {
    public static final String a(int i, int i10, Object[] objArr, m mVar) {
        return ((Resources) ((r) mVar).j(AndroidCompositionLocals_androidKt.f643c)).getQuantityString(i, i10, Arrays.copyOf(objArr, objArr.length));
    }

    public static final String b(int i, m mVar) {
        return ((Resources) ((r) mVar).j(AndroidCompositionLocals_androidKt.f643c)).getString(i);
    }

    public static final String c(int i, Object[] objArr, m mVar) {
        return ((Resources) ((r) mVar).j(AndroidCompositionLocals_androidKt.f643c)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }
}
