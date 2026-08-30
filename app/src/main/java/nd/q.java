package nd;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.mlkit_vision_digital_ink.u0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static WeakReference f21279c;

    /* renamed from: a, reason: collision with root package name */
    public u0 f21280a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f21281b;

    public q(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f21281b = scheduledThreadPoolExecutor;
    }

    public final synchronized p a() {
        String str;
        p pVar;
        u0 u0Var = this.f21280a;
        synchronized (((ArrayDeque) u0Var.f15039y)) {
            str = (String) ((ArrayDeque) u0Var.f15039y).peek();
        }
        Pattern pattern = p.f21275d;
        pVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                pVar = new p(split[0], split[1]);
            }
        }
        return pVar;
    }
}
