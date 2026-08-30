package nd;
import c.a;
import v.j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import j.m0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f21246c;

    public /* synthetic */ e(Object obj, int i, Object obj2) {
        this.f21244a = i;
        this.f21245b = obj;
        this.f21246c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        ComponentName startService;
        o6.a a10;
        switch (this.f21244a) {
            case 0:
                Context context = (Context) this.f21245b;
                Intent intent = (Intent) this.f21246c;
                o j10 = o.j();
                j10.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) j10.f21274x).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (j10) {
                    try {
                        str = (String) j10.f21271u;
                        if (str == null) {
                            ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                if (context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                    if (str2.startsWith(".")) {
                                        j10.f21271u = context.getPackageName() + serviceInfo.name;
                                    } else {
                                        j10.f21271u = serviceInfo.name;
                                    }
                                    str = (String) j10.f21271u;
                                }
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                                str = null;
                            }
                            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            str = null;
                        }
                    } finally {
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (j10.l(context)) {
                        startService = j(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e8) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e8);
                    i = 401;
                }
                return Integer.valueOf(i);
            case 1:
                Context context2 = (Context) this.f21245b;
                String str3 = (String) this.f21246c;
                if (str3 == null) {
                    a10 = null;
                } else {
                    a10 = u6.e.f25877b.a(str3);
                }
                if (a10 != null) {
                    return new o6.n(a10);
                }
                try {
                    return o6.a(context2, context2.getAssets().open("apis_bee.json"), str3);
                } catch (IOException e10) {
                    return new o6.n(e10);
                }
            case 2:
                m0 m0Var = (m0) this.f21245b;
                ((pc.g) m0Var.f18662u).h((String) m0Var.f18664w, (List) this.f21246c);
                return null;
            case 3:
                qd.a aVar = (qd.a) this.f21245b;
                b0.a aVar2 = (b0.a) this.f21246c;
                rd.i iVar = aVar.f23986g;
                synchronized (iVar.f24720b) {
                    iVar.f24719a.edit().putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", aVar2.f1139v).commit();
                }
                return null;
            default:
                rd.b bVar = (rd.b) this.f21245b;
                rd.c cVar = (rd.c) this.f21246c;
                rd.l lVar = bVar.f24687b;
                synchronized (lVar) {
                    FileOutputStream openFileOutput = lVar.f24740a.openFileOutput(lVar.f24741b, 0);
                    try {
                        openFileOutput.write(cVar.f24690a.toString().getBytes("UTF-8"));
                    } finally {
                        openFileOutput.close();
                    }
                }
                return null;
        }
    }
}
