package ya;
import p.a;
import q.x;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class q0 {
    public static final Bundle a(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        x.n(a.k("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }
}
