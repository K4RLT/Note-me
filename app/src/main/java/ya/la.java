package ya;

import android.app.Activity;

/* loaded from: classes.dex */
public abstract class la {
    public static int a(Activity activity, int i) {
        return (int) ((i * activity.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Activity activity) {
        return a(activity, activity.getResources().getConfiguration().screenHeightDp);
    }
}
