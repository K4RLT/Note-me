package ya;
import r.b;
import b6.o;
import b6.r;
import q7.e;
import q7.g;

import android.content.Context;
import android.util.Log;
import com.daren.scraply.notify.ReengagementWorker;
import java.util.Calendar;
import java.util.Collections;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class ia {
    public static final long a(Calendar calendar) {
        int i;
        int i10;
        int i11 = calendar.get(7);
        boolean z3 = true;
        if (i11 != 7 && i11 != 1) {
            z3 = false;
        }
        Object clone = calendar.clone();
        clone.getClass();
        Calendar calendar2 = (Calendar) clone;
        if (z3) {
            i = 11;
        } else {
            i = 19;
        }
        calendar2.set(11, i);
        if (z3) {
            i10 = 0;
        } else {
            i10 = 30;
        }
        calendar2.set(12, i10);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return calendar2.getTimeInMillis();
    }

    public static void b(Context context) {
        g c10 = e.c(context);
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        long a10 = a(calendar);
        long j10 = 60000;
        if (a10 <= currentTimeMillis + 60000) {
            Object clone = calendar.clone();
            clone.getClass();
            Calendar calendar2 = (Calendar) clone;
            calendar2.add(6, 1);
            a10 = a(calendar2);
        }
        long d2 = e.d(c10, a10) - System.currentTimeMillis();
        try {
            r b10 = r.b(context);
            e eVar = new e(ReengagementWorker.class);
            if (d2 >= 60000) {
                j10 = d2;
            }
            eVar.z(j10);
            ((LinkedHashSet) eVar.f24677x).add("scraply_reengagement");
            new o(b10, "scraply_reengagement", 1, Collections.singletonList(eVar.m())).a();
            Log.d("ReengageScheduler", "Próxima revisión en " + (d2 / 60000) + " min");
        } catch (Exception e) {
            Log.e("ReengageScheduler", "No se pudo encolar la cadena", e);
        }
    }
}
