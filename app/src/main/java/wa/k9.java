package wa;
import l9.i;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.pu;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public abstract class k9 {
    public static Object a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            i.d("Unexpected exception.", th);
            pu.a(context).c("StrictModeUtil.runWithLaxStrictMode", th);
            return null;
        }
    }
}
