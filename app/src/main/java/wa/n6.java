package wa;
import c.c;
import c.i;
import f7.c;
import f7.d;
import z7.f;

import android.content.Context;
import android.util.Log;
import android.view.Choreographer;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class n6 {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f29759a;

    /* renamed from: b, reason: collision with root package name */
    public static int f29760b;

    /* renamed from: c, reason: collision with root package name */
    public static long f29761c;

    /* renamed from: d, reason: collision with root package name */
    public static long f29762d;
    public static float e;

    /* renamed from: f, reason: collision with root package name */
    public static d f29763f;

    public static void a(long j10) {
        String str;
        Object kVar;
        f fVar;
        String str2 = "unknown";
        f29759a = false;
        d dVar = f29763f;
        if (dVar != null) {
            Choreographer.getInstance().removeFrameCallback(dVar);
        }
        Object obj = null;
        f29763f = null;
        int i = f29760b;
        if (i >= 60 && j10 > 0) {
            float f10 = (i * 1.0E9f) / ((float) j10);
            try {
                Context context = c.f16779a;
                if (context != null) {
                    String string = context.getSharedPreferences("scraply_settings", 0).getString("graphics_quality", null);
                    if (string != null) {
                        try {
                            kVar = f.valueOf(string);
                        } catch (Throwable th) {
                            kVar = new pe.k(th);
                        }
                        if (!(kVar instanceof pe.k)) {
                            obj = kVar;
                        }
                        fVar = (f) obj;
                        if (fVar != null) {
                            String lowerCase = fVar.name().toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            str2 = lowerCase;
                        }
                    }
                    fVar = f.AUTO;
                    String lowerCase2 = fVar.name().toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    str2 = lowerCase2;
                }
            } catch (Exception unused) {
            }
            float f11 = e;
            if (f10 >= 55.0f) {
                str = "60";
            } else if (f10 >= 40.0f) {
                str = "45";
            } else if (f10 >= 25.0f) {
                str = "30";
            } else if (f10 >= 15.0f) {
                str = "20";
            } else {
                str = "under_15";
            }
            c.i("perf_session", c.c(new pe.j("fps_bucket", str), new pe.j("worst_ms", Integer.valueOf((int) f11)), new pe.j("quality", str2)));
            Log.d("PerfSampler", String.format("Muestra: %.1f fps, peor frame %.0f ms, calidad %s", Arrays.copyOf(new Object[]{Float.valueOf(f10), Float.valueOf(e), str2}, 3)));
            return;
        }
        Log.d("PerfSampler", "Muestra descartada (frames=" + i + ")");
    }
}
