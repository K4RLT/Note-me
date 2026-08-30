package kb;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f19746a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        f19746a = new HashMap();
        g3.a.j("UID: [", Process.myUid(), "]  PID: [", "] ", Process.myPid()).concat("PlayCoreVersion");
    }
}
