package com.google.android.filament;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static e f4243a;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.google.android.filament.e] */
    public static e a() {
        if (f4243a == null) {
            try {
                if ("The Android Project".equalsIgnoreCase(System.getProperty("java.vendor"))) {
                    int i = a.f4240b;
                    f4243a = (e) a.class.newInstance();
                } else {
                    f4243a = (e) Class.forName("com.google.android.filament.DesktopPlatform").newInstance();
                }
            } catch (Exception unused) {
            }
            if (f4243a == null) {
                f4243a = new Object();
            }
        }
        return f4243a;
    }

    public abstract boolean b(Object obj);
}
