package wa;
import f3.q;
import g5.q;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class u6 {
    public static int a(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new q(context).f16702b.areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        q.h("permission must be non-null");
        return 0;
    }
}
