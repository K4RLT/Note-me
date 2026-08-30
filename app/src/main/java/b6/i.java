package b6;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class i extends j5.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1747c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final Context f1748d;

    public i(Context context) {
        super(9, 10);
        this.f1748d = context;
    }

    @Override // j5.a
    public final void a(r5.c cVar) {
        int i = this.f1747c;
        cVar.getClass();
        switch (i) {
            case 0:
                if (this.f18909b >= 10) {
                    cVar.p(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f1748d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                cVar.o("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f1748d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j10 = 0;
                    long j11 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                        j10 = 1;
                    }
                    cVar.f();
                    try {
                        cVar.p(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j11)});
                        cVar.p(new Object[]{"reschedule_needed", Long.valueOf(j10)});
                        sharedPreferences.edit().clear().apply();
                        cVar.w();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    cVar.f();
                    try {
                        cVar.p(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        cVar.p(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        cVar.w();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public i(int i, int i10, Context context) {
        super(i, i10);
        this.f1748d = context;
    }
}
