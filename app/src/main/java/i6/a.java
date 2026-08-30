package i6;

import a6.h;
import a6.q;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import b6.r;
import c7.n;
import com.google.android.gms.internal.ads.ma0;
import d6.i;
import f6.e;
import j6.j;
import j6.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import pf.d1;
import wa.y8;

/* loaded from: classes.dex */
public final class a implements e, b6.c {
    public static final String D = q.f("SystemFgDispatcher");
    public final HashMap A;
    public final n B;
    public SystemForegroundService C;

    /* renamed from: u, reason: collision with root package name */
    public final r f18318u;

    /* renamed from: v, reason: collision with root package name */
    public final m6.a f18319v;

    /* renamed from: w, reason: collision with root package name */
    public final Object f18320w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public j f18321x;

    /* renamed from: y, reason: collision with root package name */
    public final LinkedHashMap f18322y;

    /* renamed from: z, reason: collision with root package name */
    public final HashMap f18323z;

    public a(Context context) {
        r b10 = r.b(context);
        this.f18318u = b10;
        this.f18319v = b10.f1775d;
        this.f18321x = null;
        this.f18322y = new LinkedHashMap();
        this.A = new HashMap();
        this.f18323z = new HashMap();
        this.B = new n(b10.f1779j);
        b10.f1776f.a(this);
    }

    public static Intent a(Context context, j jVar, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f275a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f276b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f277c);
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f18928a);
        intent.putExtra("KEY_GENERATION", jVar.f18929b);
        return intent;
    }

    public static Intent c(Context context, j jVar, h hVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f18928a);
        intent.putExtra("KEY_GENERATION", jVar.f18929b);
        intent.putExtra("KEY_NOTIFICATION_ID", hVar.f275a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hVar.f276b);
        intent.putExtra("KEY_NOTIFICATION", hVar.f277c);
        return intent;
    }

    @Override // f6.e
    public final void b(p pVar, f6.c cVar) {
        if (cVar instanceof f6.b) {
            String str = pVar.f18944a;
            q.d().a(D, "Constraints unmet for WorkSpec " + str);
            j a10 = y8.a(pVar);
            r rVar = this.f18318u;
            m6.a aVar = rVar.f1775d;
            b6.h hVar = rVar.f1776f;
            b6.n nVar = new b6.n(a10);
            hVar.getClass();
            aVar.a(new ma0(hVar, nVar, true, -512));
        }
    }

    public final void d(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        j jVar = new j(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        q.d().a(D, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.C != null) {
            h hVar = new h(intExtra, notification, intExtra2);
            LinkedHashMap linkedHashMap = this.f18322y;
            linkedHashMap.put(jVar, hVar);
            if (this.f18321x == null) {
                this.f18321x = jVar;
                SystemForegroundService systemForegroundService = this.C;
                systemForegroundService.f1128v.post(new b(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = this.C;
            systemForegroundService2.f1128v.post(new i(systemForegroundService2, intExtra, notification, 1));
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((h) ((Map.Entry) it.next()).getValue()).f276b;
                }
                h hVar2 = (h) linkedHashMap.get(this.f18321x);
                if (hVar2 != null) {
                    SystemForegroundService systemForegroundService3 = this.C;
                    systemForegroundService3.f1128v.post(new b(systemForegroundService3, hVar2.f275a, hVar2.f277c, i));
                }
            }
        }
    }

    @Override // b6.c
    public final void e(j jVar, boolean z3) {
        d1 d1Var;
        Map.Entry entry;
        synchronized (this.f18320w) {
            try {
                if (((p) this.f18323z.remove(jVar)) != null) {
                    d1Var = (d1) this.A.remove(jVar);
                } else {
                    d1Var = null;
                }
                if (d1Var != null) {
                    d1Var.j(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h hVar = (h) this.f18322y.remove(jVar);
        if (jVar.equals(this.f18321x)) {
            if (this.f18322y.size() > 0) {
                Iterator it = this.f18322y.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.f18321x = (j) entry.getKey();
                if (this.C != null) {
                    h hVar2 = (h) entry.getValue();
                    SystemForegroundService systemForegroundService = this.C;
                    systemForegroundService.f1128v.post(new b(systemForegroundService, hVar2.f275a, hVar2.f277c, hVar2.f276b));
                    SystemForegroundService systemForegroundService2 = this.C;
                    systemForegroundService2.f1128v.post(new c4.i(systemForegroundService2, hVar2.f275a, 10));
                }
            } else {
                this.f18321x = null;
            }
        }
        SystemForegroundService systemForegroundService3 = this.C;
        if (hVar != null && systemForegroundService3 != null) {
            q.d().a(D, "Removing Notification (id: " + hVar.f275a + ", workSpecId: " + jVar + ", notificationType: " + hVar.f276b);
            systemForegroundService3.f1128v.post(new c4.i(systemForegroundService3, hVar.f275a, 10));
        }
    }

    public final void f() {
        this.C = null;
        synchronized (this.f18320w) {
            try {
                Iterator it = this.A.values().iterator();
                while (it.hasNext()) {
                    ((d1) it.next()).j(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f18318u.f1776f.e(this);
    }
}
