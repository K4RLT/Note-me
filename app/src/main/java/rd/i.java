package rd;

import android.content.SharedPreferences;
import java.util.Date;

/* loaded from: classes.dex */
public final class i {
    public static final Date e = new Date(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Date f24718f = new Date(-1);

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f24719a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24720b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Object f24721c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final Object f24722d = new Object();

    public i(SharedPreferences sharedPreferences) {
        this.f24719a = sharedPreferences;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [rd.h, java.lang.Object] */
    public final h a() {
        Object obj;
        synchronized (this.f24721c) {
            int i = this.f24719a.getInt("num_failed_fetches", 0);
            Date date = new Date(this.f24719a.getLong("backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f24716a = i;
            obj.f24717b = date;
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [rd.h, java.lang.Object] */
    public final h b() {
        Object obj;
        synchronized (this.f24722d) {
            int i = this.f24719a.getInt("num_failed_realtime_streams", 0);
            Date date = new Date(this.f24719a.getLong("realtime_backoff_end_time_in_millis", -1L));
            obj = new Object();
            obj.f24716a = i;
            obj.f24717b = date;
        }
        return obj;
    }

    public final void c(int i, Date date) {
        synchronized (this.f24721c) {
            this.f24719a.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    public final void d(int i, Date date) {
        synchronized (this.f24722d) {
            this.f24719a.edit().putInt("num_failed_realtime_streams", i).putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}