package r2;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public class n extends m {
    @Override // r2.m, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        i0.s sVar = this.f24500b;
        if (sVar != null) {
            return sVar.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
