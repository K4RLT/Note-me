package lc;
import c.t;
import d.d;

import android.app.ActivityManager;
import android.content.Context;
import android.util.Log;
import g5.q;
import java.util.ArrayList;
import java.util.List;
import qe.l;
import qe.m;
import qe.s;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f20327a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final d f20328b = new Object();

    /* JADX WARN: Type inference failed for: r5v2, types: [qc.y0, java.lang.Object] */
    public static ArrayList c(Context context) {
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
            list = s.f24023u;
        }
        ArrayList u9 = l.u(list);
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
        ArrayList arrayList2 = new ArrayList(m.d(arrayList, 10));
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj2;
            Object obj3 = new Object();
            String str2 = runningAppProcessInfo.processName;
            if (str2 != null) {
                obj3.f23971a = str2;
                obj3.f23972b = runningAppProcessInfo.pid;
                byte b10 = (byte) (obj3.e | 1);
                obj3.f23973c = runningAppProcessInfo.importance;
                obj3.e = (byte) (b10 | 2);
                obj3.f23974d = kotlin.jvm.internal.l.a(str2, str);
                obj3.e = (byte) (obj3.e | 4);
                arrayList2.add(obj3.a());
            } else {
                q.h("Null processName");
                return null;
            }
        }
        return arrayList2;
    }

    public boolean a(int i) {
        if (4 > i && !Log.isLoggable("FirebaseCrashlytics", i)) {
            return false;
        }
        return true;
    }

    public void b(String str) {
        if (a(3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        r7 = android.app.Application.getProcessName();
     */
    /* JADX WARN: Type inference failed for: r1v3, types: [qc.y0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public qc.b2 d(android.content.Context r7) {
        /*
            r6 = this;
            r7.getClass()
            int r0 = android.os.Process.myPid()
            java.util.ArrayList r7 = c(r7)
            int r1 = r7.size()
            r2 = 0
            r3 = r2
        L11:
            if (r3 >= r1) goto L23
            java.lang.Object r4 = r7.get(r3)
            int r3 = r3 + 1
            r5 = r4
            qc.b2 r5 = (qc.b2) r5
            qc.z0 r5 = (qc.z0) r5
            int r5 = r5.f23978b
            if (r5 != r0) goto L11
            goto L24
        L23:
            r4 = 0
        L24:
            qc.b2 r4 = (qc.b2) r4
            if (r4 != 0) goto L62
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r7 < r1) goto L36
            java.lang.String r7 = k9.e0.j()
            r7.getClass()
            goto L43
        L36:
            r1 = 28
            java.lang.String r3 = ""
            if (r7 < r1) goto L42
            java.lang.String r7 = t.j()
            if (r7 != 0) goto L43
        L42:
            r7 = r3
        L43:
            qc.y0 r1 = new qc.y0
            r1.<init>()
            r1.f23971a = r7
            r1.f23972b = r0
            byte r7 = r1.e
            r7 = r7 | 1
            byte r7 = (byte) r7
            r1.f23973c = r2
            r7 = r7 | 2
            byte r7 = (byte) r7
            r1.f23974d = r2
            r7 = r7 | 4
            byte r7 = (byte) r7
            r1.e = r7
            qc.z0 r7 = r1.a()
            return r7
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lc.d.d(android.content.Context):qc.b2");
    }

    public void e(String str) {
        if (a(2)) {
            Log.v("FirebaseCrashlytics", str, null);
        }
    }

    public void f(Exception exc, String str) {
        if (a(5)) {
            Log.w("FirebaseCrashlytics", str, exc);
        }
    }
}