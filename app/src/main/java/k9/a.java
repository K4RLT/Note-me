package k9;
import r.e;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.sl;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static volatile float f19630c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public static volatile long f19631d;
    public static final Object e = new Object();

    /* renamed from: a, reason: collision with root package name */
    public boolean f19632a;

    /* renamed from: b, reason: collision with root package name */
    public float f19633b;

    public static float b(Context context) {
        nl nlVar = sl.Kf;
        g9.r rVar = g9.e;
        float f10 = 0.0f;
        if (((Boolean) rVar.f17698c.a(nlVar)).booleanValue()) {
            f9.k kVar = f9.k.C;
            kVar.f16819k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long intValue = ((Integer) rVar.f17698c.a(sl.Lf)).intValue();
            if (f19630c != -1.0f && currentTimeMillis - f19631d < intValue) {
                return f19630c;
            }
            synchronized (e) {
                try {
                    kVar.f16819k.getClass();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (f19630c != -1.0f && currentTimeMillis2 - f19631d < intValue) {
                        return f19630c;
                    }
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    if (audioManager == null) {
                        f19630c = 0.0f;
                        f19631d = currentTimeMillis2;
                        return 0.0f;
                    }
                    int streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamMaxVolume != 0) {
                        f10 = streamVolume / streamMaxVolume;
                    }
                    f19630c = f10;
                    f19631d = currentTimeMillis2;
                    return f19630c;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        AudioManager audioManager2 = (AudioManager) context.getSystemService("audio");
        if (audioManager2 == null) {
            return 0.0f;
        }
        int streamMaxVolume2 = audioManager2.getStreamMaxVolume(3);
        int streamVolume2 = audioManager2.getStreamVolume(3);
        if (streamMaxVolume2 == 0) {
            return 0.0f;
        }
        return streamVolume2 / streamMaxVolume2;
    }

    public final synchronized float a() {
        synchronized (this) {
            float f10 = this.f19633b;
            if (f10 >= 0.0f) {
                return f10;
            }
            return 1.0f;
        }
    }
}
