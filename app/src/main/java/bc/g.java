package bc;
import c.b;
import j.a;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.ads.mu;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.provider.FirebaseInitProvider;
import fa.y;
import ic.n;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import jc.l;
import n.r0;
import ya.a0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f3175k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final n.e f3176l = new r0(0);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3177a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3178b;

    /* renamed from: c, reason: collision with root package name */
    public final j f3179c;

    /* renamed from: d, reason: collision with root package name */
    public final ic.g f3180d;
    public final AtomicBoolean e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f3181f;

    /* renamed from: g, reason: collision with root package name */
    public final n f3182g;

    /* renamed from: h, reason: collision with root package name */
    public final gd.b f3183h;
    public final CopyOnWriteArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f3184j;

    /* JADX WARN: Type inference failed for: r12v2, types: [ic.e, java.lang.Object] */
    public g(Context context, String str, j jVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f3181f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.f3184j = new CopyOnWriteArrayList();
        this.f3177a = context;
        y.e(str);
        this.f3178b = str;
        this.f3179c = jVar;
        a aVar = FirebaseInitProvider.f15612u;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList a10 = new j6.e(context, new ic.c(0, ComponentDiscoveryService.class)).a();
        Trace.endSection();
        Trace.beginSection("Runtime");
        l lVar = l.f19157u;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(a10);
        int i = 2;
        arrayList.add(new hd.b(i, new Object()));
        arrayList.add(new hd.b(i, new Object()));
        arrayList2.add(ic.a.c(context, Context.class, new Class[0]));
        arrayList2.add(ic.a.c(this, g.class, new Class[0]));
        arrayList2.add(ic.a.c(jVar, j.class, new Class[0]));
        Object obj = new Object();
        if (a0.a(context) && FirebaseInitProvider.f15613v.get()) {
            arrayList2.add(ic.a.c(aVar, a.class, new Class[0]));
        }
        ic.g gVar = new ic.g(lVar, arrayList, arrayList2, obj);
        this.f3180d = gVar;
        Trace.endSection();
        this.f3182g = new n(new c(this, 0, context));
        this.f3183h = gVar.e(ed.d.class);
        d dVar = new d(this);
        a();
        if (atomicBoolean.get()) {
            ea.c.f16001y.f16002u.get();
        }
        copyOnWriteArrayList.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f3175k) {
            try {
                gVar = (g) f3176l.get("[DEFAULT]");
                if (gVar != null) {
                    ((ed.d) gVar.f3183h.get()).b();
                } else {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + la.b.f() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (f3175k) {
            try {
                if (f3176l.containsKey("[DEFAULT]")) {
                    return c();
                }
                j a10 = a(context);
                if (a10 == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, a10);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, ea.b] */
    public static g g(Context context, j jVar) {
        g gVar;
        AtomicReference atomicReference = e.f3172a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f3172a;
            if (atomicReference2.get() == null) {
                Object obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        ea.b(application);
                        ea.c.f16001y.a(obj);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f3175k) {
            n.e eVar = f3176l;
            y.j("FirebaseApp name [DEFAULT] already exists!", !eVar.containsKey("[DEFAULT]"));
            y.i(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", jVar);
            eVar.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        y.j("FirebaseApp was deleted", !this.f3181f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f3180d.a(cls);
    }

    public final String d() {
        String encodeToString;
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f3178b.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        sb2.append(encodeToString);
        sb2.append("+");
        a();
        byte[] bytes2 = this.f3179c.f3191b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final void e() {
        Context context = this.f3177a;
        boolean a10 = a0.a(context);
        String str = this.f3178b;
        if (!a10) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(str);
            Log.i("FirebaseApp", sb2.toString());
            AtomicReference atomicReference = f.f3173b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(str);
        Log.i("FirebaseApp", sb3.toString());
        a();
        this.f3180d.c("[DEFAULT]".equals(str));
        ((ed.d) this.f3183h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f3178b.equals(gVar.f3178b);
    }

    public final boolean h() {
        boolean z3;
        a();
        ld.a aVar = (ld.a) this.f3182g.get();
        synchronized (aVar) {
            z3 = aVar.f20329a;
        }
        return z3;
    }

    public final int hashCode() {
        return this.f3178b.hashCode();
    }

    public final String toString() {
        mu muVar = new mu(this);
        muVar.f(this.f3178b, "name");
        muVar.f(this.f3179c, "options");
        return muVar.toString();
    }
}