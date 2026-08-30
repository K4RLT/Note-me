package k6;
import c.c;
import f.a;
import n.a;
import q.d;
import q.f;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import ya.a0;

/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: y, reason: collision with root package name */
    public static final String f19558y = a6.q.f("ForceStopRunnable");

    /* renamed from: z, reason: collision with root package name */
    public static final long f19559z = 315360000000L;

    /* renamed from: u, reason: collision with root package name */
    public final Context f19560u;

    /* renamed from: v, reason: collision with root package name */
    public final b6.r f19561v;

    /* renamed from: w, reason: collision with root package name */
    public final ic.c f19562w;

    /* renamed from: x, reason: collision with root package name */
    public int f19563x = 0;

    public f(Context context, b6.r rVar) {
        this.f19560u = context.getApplicationContext();
        this.f19561v = rVar;
        this.f19562w = rVar.f1777g;
    }

    public static void c(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f19559z;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k6.a():void");
    }

    public final boolean b() {
        a6.a aVar = this.f19561v.f1773b;
        aVar.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f19558y;
        if (isEmpty) {
            a6.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a10 = a(this.f19560u, aVar);
        a6.d().a(str, "Is default app process = " + a10);
        return a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Context context = this.f19560u;
        String str2 = f19558y;
        b6.r rVar = this.f19561v;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    t1.c(context);
                    a6.d().a(str2, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e) {
                        int i = this.f19563x + 1;
                        this.f19563x = i;
                        if (i >= 3) {
                            if (a0.a(context)) {
                                str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                            } else {
                                str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            }
                            a6.d().c(str2, str, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str, e);
                            rVar.f1773b.getClass();
                            throw illegalStateException;
                        }
                        long j10 = i * 300;
                        String str3 = "Retrying after " + j10;
                        if (a6.d().f288a <= 3) {
                            Log.d(str2, str3, e);
                        }
                        try {
                            Thread.sleep(this.f19563x * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e8) {
                    a6.d().b(str2, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e8);
                    rVar.f1773b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            rVar.d();
        }
    }
}
