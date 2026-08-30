package d6;
import a.a;
import c.c;

import a6.q;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f15730a = q.f("Alarms");

    public static void a(Context context, j6.j jVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f15731z;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service != null && alarmManager != null) {
            q.d().a(f15730a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i + ")");
            alarmManager.cancel(service);
        }
    }

    public static void b(Context context, WorkDatabase workDatabase, j6.j jVar, long j10) {
        j6.i z3 = workDatabase.z();
        j6.g g8 = z3.g(jVar);
        int i = 0;
        if (g8 != null) {
            int i10 = g8.f18922c;
            a(context, jVar, i10);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f15731z;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i10, intent, 201326592);
            if (alarmManager != null) {
                a(alarmManager, 0, j10, service);
                return;
            }
            return;
        }
        Object u9 = workDatabase.u(new k6.g(i, new k6.i(workDatabase)));
        u9.getClass();
        int intValue = ((Number) u9).intValue();
        z3.h(new j6.g(jVar.f18928a, jVar.f18929b, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f15731z;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, intValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a(alarmManager2, 0, j10, service2);
        }
    }
}
