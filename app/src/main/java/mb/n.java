package mb;

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

/* loaded from: classes.dex */
public final class n {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f20779n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f20780a;

    /* renamed from: b, reason: collision with root package name */
    public final c7.a f20781b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20782c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f20785g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f20786h;

    /* renamed from: l, reason: collision with root package name */
    public a0 f20789l;

    /* renamed from: m, reason: collision with root package name */
    public j f20790m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f20783d = new ArrayList();
    public final HashSet e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f20784f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final kb.j f20787j = new kb.j(1, this);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f20788k = new AtomicInteger(0);
    public final WeakReference i = new WeakReference(null);

    public n(Context context, c7.a aVar, String str, Intent intent) {
        this.f20780a = context;
        this.f20781b = aVar;
        this.f20782c = str;
        this.f20786h = intent;
    }

    public static void b(n nVar, l lVar) {
        j jVar = nVar.f20790m;
        c7.a aVar = nVar.f20781b;
        ArrayList arrayList = nVar.f20783d;
        int i = 0;
        if (jVar == null && !nVar.f20785g) {
            aVar.e("Initiate binding to the service.", new Object[0]);
            arrayList.add(lVar);
            a0 a0Var = new a0(2, nVar);
            nVar.f20789l = a0Var;
            nVar.f20785g = true;
            if (!nVar.f20780a.bindService(nVar.f20786h, a0Var, 1)) {
                aVar.e("Failed to bind to the service.", new Object[0]);
                nVar.f20785g = false;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ab.b bVar = new ab.b("Failed to bind to the service.", 13);
                    ib.h hVar = ((l) obj).f20776u;
                    if (hVar != null) {
                        hVar.c(bVar);
                    }
                }
                arrayList.clear();
                return;
            }
            return;
        }
        if (nVar.f20785g) {
            aVar.e("Waiting to bind to the service.", new Object[0]);
            arrayList.add(lVar);
        } else {
            lVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f20779n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f20782c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f20782c, 10);
                    handlerThread.start();
                    hashMap.put(this.f20782c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f20782c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(l lVar, ib.h hVar) {
        a().post(new lb.b(this, lVar.f20776u, hVar, lVar));
    }

    public final void d(ib.h hVar) {
        synchronized (this.f20784f) {
            this.e.remove(hVar);
        }
        a().post(new m(0, this));
    }

    public final void e() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((ib.h) it.next()).c(new RemoteException(String.valueOf(this.f20782c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
