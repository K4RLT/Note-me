package t1;

import android.view.KeyEvent;
import d1.q;
import df.l;

/* loaded from: classes.dex */
public final class e extends q implements d {
    public l I;
    public l J;

    @Override // t1.d
    public final boolean E(KeyEvent keyEvent) {
        l lVar = this.I;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // t1.d
    public final boolean h(KeyEvent keyEvent) {
        l lVar = this.J;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }
}
