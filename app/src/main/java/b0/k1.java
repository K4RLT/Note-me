package b0;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final h0 f1225a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        h0 h0Var;
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (lowerCase.equals("robolectric")) {
            h0Var = new Object();
        } else {
            h0Var = null;
        }
        f1225a = h0Var;
    }
}
