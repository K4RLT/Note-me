package vb;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import c7.a0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kb.j;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f27520n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f27521a;

    /* renamed from: b, reason: collision with root package name */
    public final c7.a f27522b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f27526g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f27527h;

    /* renamed from: l, reason: collision with root package name */
    public a0 f27530l;

    /* renamed from: m, reason: collision with root package name */
    public d f27531m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f27524d = new ArrayList();
    public final HashSet e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f27525f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final j f27528j = new j(3, this);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f27529k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f27523c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public h(Context context, c7.a aVar, Intent intent) {
        this.f27521a = context;
        this.f27522b = aVar;
        this.f27527h = intent;
    }

    public static void b(h hVar, ub.d dVar) {
        d dVar2 = hVar.f27531m;
        c7.a aVar = hVar.f27522b;
        ArrayList arrayList = hVar.f27524d;
        int i = 0;
        if (dVar2 == null && !hVar.f27526g) {
            aVar.n("Initiate binding to the service.", new Object[0]);
            arrayList.add(dVar);
            a0 a0Var = new a0(4, hVar);
            hVar.f27530l = a0Var;
            hVar.f27526g = true;
            if (!hVar.f27521a.bindService(hVar.f27527h, a0Var, 1)) {
                aVar.n("Failed to bind to the service.", new Object[0]);
                hVar.f27526g = false;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ab.b bVar = new ab.b("Failed to bind to the service.", 20);
                    ib.h hVar2 = ((e) obj).f27514u;
                    if (hVar2 != null) {
                        hVar2.c(bVar);
                    }
                }
                arrayList.clear();
                return;
            }
            return;
        }
        if (hVar.f27526g) {
            aVar.n("Waiting to bind to the service.", new Object[0]);
            arrayList.add(dVar);
        } else {
            dVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f27520n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f27523c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f27523c, 10);
                    handlerThread.start();
                    hashMap.put(this.f27523c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f27523c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ib.h) it.next()).c(new RemoteException(String.valueOf(this.f27523c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
