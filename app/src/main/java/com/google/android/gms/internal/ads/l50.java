package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.os.Build;

/* loaded from: classes.dex */
public final class l50 {

    /* renamed from: b, reason: collision with root package name */
    public static final l50 f7948b = new Object();

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f7949a;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.l50, java.lang.Object] */
    static {
        String str = bq0.f4860a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public final AudioAttributes a() {
        if (this.f7949a == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.f7949a = usage.build();
        }
        return this.f7949a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l50.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -436042064;
    }
}
