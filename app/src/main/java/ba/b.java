package ba;

import a6.x;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import n.r0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static int f3114h;
    public static PendingIntent i;

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f3115j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* renamed from: a, reason: collision with root package name */
    public final r0 f3116a = new r0(0);

    /* renamed from: b, reason: collision with root package name */
    public final Context f3117b;

    /* renamed from: c, reason: collision with root package name */
    public final r f3118c;

    /* renamed from: d, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f3119d;
    public final Messenger e;

    /* renamed from: f, reason: collision with root package name */
    public Messenger f3120f;

    /* renamed from: g, reason: collision with root package name */
    public g f3121g;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ba.r] */
    public b(Context context) {
        this.f3117b = context;
        Object obj = new Object();
        obj.f3162v = 0;
        obj.f3163w = context;
        this.f3118c = obj;
        this.e = new Messenger(new e(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3119d = scheduledThreadPoolExecutor;
    }

    public final ib.o a(Bundle bundle) {
        String num;
        synchronized (b.class) {
            int i10 = f3114h;
            f3114h = i10 + 1;
            num = Integer.toString(i10);
        }
        ib.h hVar = new ib.h();
        synchronized (this.f3116a) {
            this.f3116a.put(num, hVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f3118c.v() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f3117b;
        synchronized (b.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, ta.a.f25688a);
                }
                intent.putExtra("app", i);
            } finally {
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f3120f != null || this.f3121g != null) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f3120f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.f3121g.f3128u;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            hVar.f18363a.c(h.f3130w, new ra.e(9, this, num, this.f3119d.schedule(new x(1, hVar), 30L, TimeUnit.SECONDS)));
            return hVar.f18363a;
        }
        int v2 = this.f3118c.v();
        Context context2 = this.f3117b;
        if (v2 == 2) {
            context2.sendBroadcast(intent);
        } else {
            context2.startService(intent);
        }
        hVar.f18363a.c(h.f3130w, new ra.e(9, this, num, this.f3119d.schedule(new x(1, hVar), 30L, TimeUnit.SECONDS)));
        return hVar.f18363a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f3116a) {
            try {
                ib.h hVar = (ib.h) this.f3116a.remove(str);
                if (hVar == null) {
                    Log.w("Rpc", "Missing callback for " + str);
                    return;
                }
                hVar.b(bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}