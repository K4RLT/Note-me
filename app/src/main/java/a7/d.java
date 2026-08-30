package a7;

import android.util.Log;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f304a = new Object();

    public static void a(String str) {
        f304a.getClass();
        HashSet hashSet = c.f303a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, null);
        hashSet.add(str);
    }

    public static void b(String str, Throwable th) {
        f304a.getClass();
        HashSet hashSet = c.f303a;
        if (hashSet.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        hashSet.add(str);
    }
}
