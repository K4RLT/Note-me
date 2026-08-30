package q7;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import mf.m;
import qe.s;
import sf.e0;
import sf.n0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final n0 f23567a = e0.b(new g(true));

    public static int a(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        return calendar.get(5) + ((calendar.get(2) + 1) * 100) + (calendar.get(1) * 10000);
    }

    public static boolean b(g gVar, long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        int i = calendar.get(11);
        if (i < 22 && i >= 8) {
            return false;
        }
        return true;
    }

    public static g c(Context context) {
        context.getClass();
        g gVar = new g(context.getApplicationContext().getSharedPreferences("scraply_notify", 0).getBoolean("master", true));
        n0 n0Var = f23567a;
        n0Var.getClass();
        n0Var.k(null, gVar);
        return gVar;
    }

    public static long d(g gVar, long j10) {
        if (!b(gVar, j10)) {
            return j10;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j10);
        Object clone = calendar.clone();
        clone.getClass();
        Calendar calendar2 = (Calendar) clone;
        calendar2.set(11, 8);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        if (calendar2.getTimeInMillis() <= j10) {
            calendar2.add(6, 1);
        }
        return calendar2.getTimeInMillis();
    }

    public static void e(Context context, boolean z3) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("scraply_notify", 0);
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (sharedPreferences.getLong("first_seen_at", 0L) == 0) {
            edit.putLong("first_seen_at", currentTimeMillis);
        }
        edit.putLong("last_open_at", currentTimeMillis);
        edit.putInt("launches", sharedPreferences.getInt("launches", 0) + 1);
        long j10 = sharedPreferences.getLong("awaiting_since", 0L);
        if (j10 > 0) {
            if (z3 || currentTimeMillis - j10 < 172800000) {
                edit.putInt("ignored_streak", 0).putBoolean("dormant", false);
                if (z3) {
                    edit.putInt("opened_from_notif", sharedPreferences.getInt("opened_from_notif", 0) + 1);
                }
            }
            edit.putLong("awaiting_since", 0L);
        }
        if (!z3 && sharedPreferences.getBoolean("dormant", false)) {
            edit.putBoolean("dormant", false).putInt("ignored_streak", 0);
        }
        edit.putInt("last_step", 0);
        edit.apply();
    }

    public static List f(Context context) {
        String string = context.getApplicationContext().getSharedPreferences("scraply_notify", 0).getString("sent_stamps", "");
        if (string != null) {
            List D = mf.f.D(string, new char[]{','});
            ArrayList arrayList = new ArrayList();
            Iterator it = D.iterator();
            while (it.hasNext()) {
                Long l10 = m.l(mf.f.I((String) it.next()).toString());
                if (l10 != null) {
                    arrayList.add(l10);
                }
            }
            return arrayList;
        }
        return s.f24023u;
    }
}
