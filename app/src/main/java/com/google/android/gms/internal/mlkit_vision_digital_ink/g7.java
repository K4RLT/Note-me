package com.google.android.gms.internal.mlkit_vision_digital_ink;

import android.os.Build;
import dalvik.system.VMStack;

/* loaded from: classes.dex */
public final class g7 extends c7 {

    /* renamed from: b, reason: collision with root package name */
    public static final jm f14364b;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            f7.class.getName().equals(a());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        f14364b = new jm(14);
    }

    public static String a() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
