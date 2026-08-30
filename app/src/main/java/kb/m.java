package kb;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import c4.s;
import c7.a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f19754n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f19755a;

    /* renamed from: b, reason: collision with root package name */
    public final s f19756b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19760g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f19761h;

    /* renamed from: l, reason: collision with root package name */
    public a0 f19764l;

    /* renamed from: m, reason: collision with root package name */
    public g f19765m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f19758d = new ArrayList();
    public final HashSet e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f19759f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final j f19762j = new j(0, this);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f19763k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f19757c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public m(Context context, s sVar, Intent intent) {
        this.f19755a = context;
        this.f19756b = sVar;
        this.f19761h = intent;
    }

    public static void b(m mVar, jb.g gVar) {
        g gVar2 = mVar.f19765m;
        s sVar = mVar.f19756b;
        ArrayList arrayList = mVar.f19758d;
        int i = 0;
        if (gVar2 == null && !mVar.f19760g) {
            sVar.a("Initiate binding to the service.", new Object[0]);
            arrayList.add(gVar);
            a0 a0Var = new a0(1, mVar);
            mVar.f19764l = a0Var;
            mVar.f19760g = true;
            if (!mVar.f19755a.bindService(mVar.f19761h, a0Var, 1)) {
                sVar.a("Failed to bind to the service.", new Object[0]);
                mVar.f19760g = false;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ab.b bVar = new ab.b("Failed to bind to the service.", 12);
                    ib.h hVar = ((i) obj).f19747u;
                    if (hVar != null) {
                        hVar.c(bVar);
                    }
                }
                arrayList.clear();
                return;
            }
            return;
        }
        if (mVar.f19760g) {
            sVar.a("Waiting to bind to the service.", new Object[0]);
            arrayList.add(gVar);
        } else {
            gVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f19754n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f19757c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f19757c, 10);
                    handlerThread.start();
                    hashMap.put(this.f19757c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f19757c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(ib.h hVar) {
        synchronized (this.f19759f) {
            this.e.remove(hVar);
        }
        a().post(new k(0, this));
    }

    public final void d() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ib.h) it.next()).c(new RemoteException(String.valueOf(this.f19757c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
