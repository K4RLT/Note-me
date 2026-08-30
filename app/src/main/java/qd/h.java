package qd;
import c.b;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.internal.ads.z11;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gw;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import j.i0;
import j6.n;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import rd.i;
import rd.l;
import wa.h8;

/* loaded from: classes.dex */
public final class h implements td.a {

    /* renamed from: j, reason: collision with root package name */
    public static final Random f23991j = new Random();

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f23992k = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Context f23994b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f23995c;

    /* renamed from: d, reason: collision with root package name */
    public final bc.g f23996d;
    public final hd.e e;

    /* renamed from: f, reason: collision with root package name */
    public final cc.c f23997f;

    /* renamed from: g, reason: collision with root package name */
    public final gd.b f23998g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23999h;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f23993a = new HashMap();
    public final HashMap i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, ea.b] */
    public h(Context context, ScheduledExecutorService scheduledExecutorService, bc.g gVar, hd.e eVar, cc.c cVar, gd.b bVar) {
        this.f23994b = context;
        this.f23995c = scheduledExecutorService;
        this.f23996d = gVar;
        this.e = eVar;
        this.f23997f = cVar;
        this.f23998g = bVar;
        gVar.a();
        this.f23999h = gVar.f3179c.f3191b;
        AtomicReference atomicReference = g.f23990a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = g.f23990a;
        if (atomicReference2.get() == null) {
            Object obj = new Object();
            while (true) {
                if (atomicReference2.compareAndSet(null, obj)) {
                    ea.b(application);
                    ea.c.f16001y.a(obj);
                    break;
                } else if (atomicReference2.get() != null) {
                    break;
                }
            }
        }
        h8.c(new k6.g(2, this), scheduledExecutorService);
    }

    public final synchronized a a() {
        z11 z11Var;
        try {
            try {
                rd.b c10 = c("fetch");
                rd.b c11 = c("activate");
                rd.b c12 = c("defaults");
                i iVar = new i(this.f23994b.getSharedPreferences("frc_" + this.f23999h + "_firebase_settings", 0));
                rd.g gVar = new rd.g(this.f23995c, c11, c12);
                bc.g gVar2 = this.f23996d;
                gd.b bVar = this.f23998g;
                gVar2.a();
                if (gVar2.f3178b.equals("[DEFAULT]")) {
                    z11Var = new z11(bVar);
                } else {
                    z11Var = null;
                }
                if (z11Var != null) {
                    f fVar = new f(z11Var);
                    synchronized (gVar.f24712a) {
                        gVar.f24712a.add(fVar);
                    }
                }
                gw gwVar = new gw(19);
                gwVar.f14386v = c11;
                gwVar.f14387w = c12;
                ScheduledExecutorService scheduledExecutorService = this.f23995c;
                n nVar = new n(9);
                nVar.f18941y = Collections.newSetFromMap(new ConcurrentHashMap());
                nVar.f18938v = c11;
                nVar.f18939w = gwVar;
                nVar.f18940x = scheduledExecutorService;
                return b(this.f23996d, this.e, this.f23997f, this.f23995c, c10, c11, c12, d(c10, iVar), gVar, iVar, nVar);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized a b(bc.g gVar, hd.e eVar, cc.c cVar, Executor executor, rd.b bVar, rd.b bVar2, rd.b bVar3, rd.f fVar, rd.g gVar2, i iVar, n nVar) {
        cc.c cVar2;
        if (!this.f23993a.containsKey("firebase")) {
            gVar.a();
            if (gVar.f3178b.equals("[DEFAULT]")) {
                cVar2 = cVar;
            } else {
                cVar2 = null;
            }
            Context context = this.f23994b;
            synchronized (this) {
                a aVar = new a(cVar2, executor, bVar, bVar2, bVar3, fVar, gVar2, iVar, new i0(gVar, eVar, fVar, bVar2, context, iVar, this.f23995c), nVar);
                bVar2.b();
                bVar3.b();
                bVar.b();
                this.f23993a.put("firebase", aVar);
                f23992k.put("firebase", aVar);
            }
        }
        return (a) this.f23993a.get("firebase");
    }

    public final rd.b c(String str) {
        l lVar;
        rd.b bVar;
        String h3 = a5.a.h("frc_", this.f23999h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f23995c;
        Context context = this.f23994b;
        HashMap hashMap = l.f24739c;
        synchronized (l.class) {
            try {
                HashMap hashMap2 = l.f24739c;
                if (!hashMap2.containsKey(h3)) {
                    hashMap2.put(h3, new l(context, h3));
                }
                lVar = (l) hashMap2.get(h3);
            } finally {
            }
        }
        HashMap hashMap3 = rd.b.f24685d;
        synchronized (rd.b.class) {
            try {
                String str2 = lVar.f24741b;
                HashMap hashMap4 = rd.b.f24685d;
                if (!hashMap4.containsKey(str2)) {
                    hashMap4.put(str2, new rd.b(scheduledExecutorService, lVar));
                }
                bVar = (rd.b) hashMap4.get(str2);
            } finally {
            }
        }
        return bVar;
    }

    public final synchronized rd.f d(rd.b bVar, i iVar) {
        hd.e eVar;
        gd.b fVar;
        gd.b bVar2;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        bc.g gVar;
        try {
            eVar = this.e;
            bc.g gVar2 = this.f23996d;
            gVar2.a();
            if (gVar2.f3178b.equals("[DEFAULT]")) {
                fVar = this.f23998g;
            } else {
                fVar = new ic.f(6);
            }
            bVar2 = fVar;
            scheduledExecutorService = this.f23995c;
            random = f23991j;
            bc.g gVar3 = this.f23996d;
            gVar3.a();
            str = gVar3.f3179c.f3190a;
            gVar = this.f23996d;
            gVar.a();
        } catch (Throwable th) {
            throw th;
        }
        return new rd.f(eVar, bVar2, scheduledExecutorService, random, bVar, new ConfigFetchHttpClient(this.f23994b, gVar.f3179c.f3191b, str, iVar.f24719a.getLong("fetch_timeout_in_seconds", 60L), iVar.f24719a.getLong("fetch_timeout_in_seconds", 60L)), iVar, this.i);
    }
}