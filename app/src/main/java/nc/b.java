package nc;

import android.util.Log;
import oc.o;

/* loaded from: classes.dex */
public final class b implements a {
    @Override // nc.a
    public final void c(o oVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
        }
    }
}
