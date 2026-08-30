package ya;

import android.text.Spanned;

/* loaded from: classes.dex */
public abstract class e1 {
    public static final boolean a(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }
}
