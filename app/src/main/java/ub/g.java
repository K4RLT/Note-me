package ub;

import android.os.Process;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f27158a;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        f27158a = new HashMap();
        g3.a.j("UID: [", Process.myUid(), "]  PID: [", "] ", Process.myPid()).concat("PlayCoreVersion");
    }
}
