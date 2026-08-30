package vd;
import l.a;
import m.d;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final b4.e f27645a = new b4.e("session_id");

    public static ArrayList a(Context context) {
        ActivityManager activityManager;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        List<ActivityManager.RunningAppProcessInfo> list = null;
        if (systemService instanceof ActivityManager) {
            activityManager = (ActivityManager) systemService;
        } else {
            activityManager = null;
        }
        if (activityManager != null) {
            list = activityManager.getRunningAppProcesses();
        }
        if (list == null) {
            list = qe.s.f24023u;
        }
        ArrayList u9 = qe.l.u(list);
        ArrayList arrayList = new ArrayList();
        int size = u9.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = u9.get(i11);
            i11++;
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(qe.d(arrayList, 10));
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new s(str2, kotlin.jvm.internal.a(runningAppProcessInfo.processName, str), runningAppProcessInfo.pid, runningAppProcessInfo.importance));
        }
        return arrayList2;
    }
}
