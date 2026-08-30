package f3;
import b.a;
import b.b;
import b.c;
import q.e;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.facebook.ads.AdError;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p implements Handler.Callback, ServiceConnection {

    /* renamed from: u, reason: collision with root package name */
    public final Context f16693u;

    /* renamed from: v, reason: collision with root package name */
    public final Handler f16694v;

    /* renamed from: w, reason: collision with root package name */
    public final HashMap f16695w = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public HashSet f16696x = new HashSet();

    public p(Context context) {
        this.f16693u = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f16694v = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(o oVar) {
        boolean z3;
        ArrayDeque arrayDeque = oVar.f16692d;
        ComponentName componentName = oVar.f16689a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (oVar.f16690b) {
                z3 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f16693u;
                boolean bindService = context.bindService(component, this, 33);
                oVar.f16690b = bindService;
                if (bindService) {
                    oVar.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z3 = oVar.f16690b;
            }
            if (z3 && oVar.f16691c != null) {
                while (true) {
                    m mVar = (m) arrayDeque.peek();
                    if (mVar == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + mVar);
                        }
                        mVar.a(oVar.f16691c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(oVar);
                    return;
                }
                return;
            }
            b(oVar);
        }
    }

    public final void b(o oVar) {
        ComponentName componentName = oVar.f16689a;
        ArrayDeque arrayDeque = oVar.f16692d;
        Handler handler = this.f16694v;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = oVar.e;
        int i10 = i + 1;
        oVar.e = i10;
        if (i10 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + oVar.e + " retries");
            arrayDeque.clear();
            return;
        }
        int i11 = (1 << i) * AdError.NETWORK_ERROR_CODE;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i11 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i11);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [a, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        c cVar = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    o oVar = (o) this.f16695w.get((ComponentName) message.obj);
                    if (oVar != null) {
                        a(oVar);
                        return true;
                    }
                } else {
                    o oVar2 = (o) this.f16695w.get((ComponentName) message.obj);
                    if (oVar2 != null) {
                        if (oVar2.f16690b) {
                            this.f16693u.unbindService(this);
                            oVar2.f16690b = false;
                        }
                        oVar2.f16691c = null;
                        return true;
                    }
                }
            } else {
                n nVar = (n) message.obj;
                ComponentName componentName = nVar.f16687a;
                IBinder iBinder = nVar.f16688b;
                o oVar3 = (o) this.f16695w.get(componentName);
                if (oVar3 != null) {
                    int i10 = b.f1136u;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(c.f1137c);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof c)) {
                            cVar = (c) queryLocalInterface;
                        } else {
                            Object obj = new Object();
                            obj.f1135u = iBinder;
                            cVar = obj;
                        }
                    }
                    oVar3.f16691c = cVar;
                    oVar3.e = 0;
                    a(oVar3);
                    return true;
                }
            }
        } else {
            m mVar = (m) message.obj;
            String string = Settings.Secure.getString(this.f16693u.getContentResolver(), "enabled_notification_listeners");
            synchronized (q.f16697c) {
                if (string != null) {
                    try {
                        if (!string.equals(q.f16698d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            e = hashSet2;
                            q.f16698d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = e;
            }
            if (!hashSet.equals(this.f16696x)) {
                this.f16696x = hashSet;
                List<ResolveInfo> queryIntentServices = this.f16693u.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.f16695w.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.f16695w.put(componentName3, new o(componentName3));
                    }
                }
                Iterator it2 = this.f16695w.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        o oVar4 = (o) entry.getValue();
                        if (oVar4.f16690b) {
                            this.f16693u.unbindService(this);
                            oVar4.f16690b = false;
                        }
                        oVar4.f16691c = null;
                        it2.remove();
                    }
                }
            }
            for (o oVar5 : this.f16695w.values()) {
                oVar5.f16692d.add(mVar);
                a(oVar5);
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f16694v.obtainMessage(1, new n(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f16694v.obtainMessage(2, componentName).sendToTarget();
    }
}