package com.google.android.gms.internal.mlkit_vision_digital_ink;
import c.g;
import g5.q;
import p.a;
import q.b;
import ra.e;
import u6.a;
import w7.i1;
import wa.u6;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.internal.ads.wd0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: l, reason: collision with root package name */
    public static final s1 f14127l = new s1(2);

    /* renamed from: m, reason: collision with root package name */
    public static final s1 f14128m = new s1(3);

    /* renamed from: n, reason: collision with root package name */
    public static final s1 f14129n = new s1(4);

    /* renamed from: a, reason: collision with root package name */
    public final Context f14130a;

    /* renamed from: b, reason: collision with root package name */
    public final wl f14131b;

    /* renamed from: c, reason: collision with root package name */
    public final s5 f14132c;

    /* renamed from: d, reason: collision with root package name */
    public final ConnectivityManager f14133d;
    public final ow e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f14134f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f14135g;

    /* renamed from: h, reason: collision with root package name */
    public final ConcurrentLinkedQueue f14136h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f14137j;

    /* renamed from: k, reason: collision with root package name */
    public final com.google.android.gms.internal.ads.hg f14138k;

    public c(s5 s5Var, Context context, wl wlVar) {
        ow owVar = new ow(6);
        this.f14134f = new HashMap();
        this.f14135g = new HashMap();
        this.f14136h = new ConcurrentLinkedQueue();
        this.i = new ArrayList();
        this.f14137j = false;
        this.f14138k = new com.google.android.gms.internal.ads.hg(6, this);
        this.f14130a = context;
        this.f14132c = s5Var;
        this.f14131b = wlVar;
        this.e = owVar;
        this.f14133d = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public static String b(File file, String str) {
        return wd0.n(file.getAbsolutePath(), "/", str);
    }

    /*  JADX ERROR: Type inference failed
//         jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static void g(com.google.android.gms.internal.mlkit_vision_digital_ink.c r28, com.google.android.gms.internal.mlkit_vision_digital_ink.ox r29) {
        /*
            Method dump skipped, instructions count: 1689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_digital_ink.c.g(com.google.android.gms.internal.mlkit_vision_digital_ink.c, com.google.android.gms.internal.mlkit_vision_digital_ink.ox):void");
    }

    public static void j(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (IllegalStateException | NullPointerException unused) {
            }
        }
    }

    public static com.google.android.gms.internal.ads.l3 l(int i) {
        String str;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "null";
                    } else {
                        str = "INVALID_PAYLOAD";
                    }
                } else {
                    str = "INVALID_ENCODING";
                }
            } else {
                str = "UNKNOWN_OPTION";
            }
        } else {
            str = "MALFORMED";
        }
        return new com.google.android.gms.internal.ads.l3(3, -1, "DataUri error type: ".concat(str), (Exception) null);
    }

    public static final void n(z4 z4Var, Consumer consumer) {
        e4 listIterator = z4Var.listIterator(0);
        while (listIterator.hasNext()) {
            if (listIterator.next() == null) {
                consumer.accept(null);
            } else {
                g5.q.b();
                return;
            }
        }
    }

    public final synchronized z4 a() {
        Object[] objArr;
        try {
            e4 e4Var = h4.f14393v;
            n5.d(4, "initialCapacity");
            objArr = new Object[4];
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next()).get() == null) {
                    it.remove();
                } else {
                    throw new ClassCastException();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return h4.r(objArr, 0);
    }

    public final synchronized HttpURLConnection c(String str, String str2) {
        HttpURLConnection c10;
        if (wa.u6.a(this.f14130a, "android.permission.INTERNET") == 0) {
            if (!((ox) this.f14134f.get(str)).f()) {
                s5 s5Var = this.f14132c;
                s5Var.getClass();
                URL url = new URL(str2);
                ir irVar = (ir) s5Var.f14961v;
                c10 = irVar.c(url, irVar.f14482u.f18565v);
                this.e.getClass();
                this.f14135g.put(str, c10);
            } else {
                throw new IllegalStateException();
            }
        } else {
            throw new IllegalStateException("Missing INTERNET permission, can't start download");
        }
        return c10;
    }

    public final synchronized void d() {
        TrafficStats.clearThreadStatsTag();
        TrafficStats.clearThreadStatsUid();
    }

    public final void e(ox oxVar) {
        z4 z4Var;
        synchronized (oxVar) {
        }
        synchronized (this) {
            try {
                ConcurrentLinkedQueue concurrentLinkedQueue = this.f14136h;
                boolean isEmpty = concurrentLinkedQueue.isEmpty();
                concurrentLinkedQueue.add(oxVar);
                if (isEmpty) {
                    this.f14130a.registerReceiver(this.f14138k, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f14137j = true;
                    f();
                }
                if (concurrentLinkedQueue.containsAll(this.f14134f.values())) {
                    z4Var = a();
                } else {
                    z4Var = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4Var != null) {
            n(z4Var, f14127l);
        }
    }

    public final synchronized void f() {
        nx nxVar;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f14136h;
        Log.d("c", "Running " + concurrentLinkedQueue.size() + " requests pending connectivity");
        Iterator it = concurrentLinkedQueue.iterator();
        while (it.hasNext()) {
            ox oxVar = (ox) it.next();
            if (!oxVar.f()) {
                synchronized (oxVar) {
                    nxVar = oxVar.f14777k;
                }
                if (k(nxVar)) {
                }
            }
            it.remove();
            synchronized (oxVar) {
            }
            h(oxVar);
        }
        if (concurrentLinkedQueue.isEmpty() && this.f14137j) {
            this.f14130a.unregisterReceiver(this.f14138k);
            this.f14137j = false;
        }
    }

    public final void h(ox oxVar) {
        n(a(), f14128m);
        this.f14131b.execute(new px(this, oxVar));
    }

    public final synchronized void i(int i) {
        if (i != -1) {
            TrafficStats.setThreadStatsTag(i);
        }
    }

    public final synchronized boolean k(nx nxVar) {
        boolean z3;
        try {
            if (nxVar == nx.f14726w) {
                return true;
            }
            if (wa.u6.a(this.f14130a, "android.permission.ACCESS_NETWORK_STATE") == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                ConnectivityManager connectivityManager = this.f14133d;
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                    if (activeNetworkInfo.isConnected()) {
                        int ordinal = nxVar.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                Log.e("c", "Unknown connectivity type checked: ".concat(String.valueOf(nxVar.name())));
                            } else if (activeNetworkInfo.getType() != 0 && activeNetworkInfo.getType() != 4 && activeNetworkInfo.getType() != 6 && activeNetworkInfo.getType() != 7 && activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 9 && activeNetworkInfo.getType() != 16 && activeNetworkInfo.getType() != 17) {
                                return false;
                            }
                        } else if (connectivityManager.isActiveNetworkMetered() && activeNetworkInfo.getType() != 1 && activeNetworkInfo.getType() != 9 && activeNetworkInfo.getType() != 17) {
                            return false;
                        }
                        return true;
                    }
                    Log.d("c", "Network disconnected, connectivity cannot be satisfied.");
                    return false;
                }
                Log.d("c", "No current network, connectivity cannot be satisfied.");
                return false;
            }
            throw new IllegalStateException("Attempting to determine connectivity without the ACCESS_NETWORK_STATE permission.");
        } finally {
        }
    }

    public final void m(File file, String str, s5 s5Var, com.google.android.gms.internal.ads.l3 l3Var, File file2) {
        z4 z4Var;
        z4 z4Var2;
        vq vqVar;
        String b10 = b(file, str);
        synchronized (this) {
            try {
                HashMap hashMap = this.f14134f;
                hashMap.remove(b10);
                this.f14135g.remove(b10);
                if (hashMap.isEmpty()) {
                    z4Var = a();
                    z4Var2 = null;
                } else if (this.f14136h.containsAll(hashMap.values())) {
                    z4Var2 = a();
                    z4Var = null;
                } else {
                    z4Var = null;
                    z4Var2 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (l3Var == null) {
            s5Var.getClass();
            Log.d("DownloadCompleteHandler", "Downloaded file " + file2.getName());
            fm fmVar = (fm) s5Var.f14961v;
            fmVar.f14309d = true;
            hm hmVar = fmVar.f14307b;
            if (hmVar != null) {
                gm gmVar = hmVar.f14428v;
                gmVar.getClass();
                if (em.f14257z.v(gmVar, null, em.A)) {
                    em.c(gmVar);
                    fmVar.f14306a = null;
                    fmVar.f14307b = null;
                    fmVar.f14308c = null;
                }
            }
        } else {
            s5Var.getClass();
            Throwable th2 = (Throwable) l3Var.f7927d;
            String name = file2.getName();
            int i = l3Var.f7926c;
            Log.d("DownloadCompleteHandler", p.a.l("Failed to download file ", name, " due to ", gn.c(i)), th2);
            int i10 = jr.f14529v;
            ra.e eVar = new ra.e(21, false);
            int i11 = i - 1;
            if (i != 0) {
                switch (i11) {
                    case 0:
                        vqVar = vq.ANDROID_DOWNLOADER_UNKNOWN;
                        break;
                    case 1:
                        vqVar = vq.ANDROID_DOWNLOADER_CANCELED;
                        break;
                    case 2:
                        vqVar = vq.ANDROID_DOWNLOADER_INVALID_REQUEST;
                        break;
                    case 3:
                        vqVar = vq.ANDROID_DOWNLOADER_HTTP_ERROR;
                        break;
                    case 4:
                        vqVar = vq.ANDROID_DOWNLOADER_REQUEST_ERROR;
                        break;
                    case 5:
                        vqVar = vq.ANDROID_DOWNLOADER_RESPONSE_OPEN_ERROR;
                        break;
                    case 6:
                        vqVar = vq.ANDROID_DOWNLOADER_RESPONSE_CLOSE_ERROR;
                        break;
                    case 7:
                        vqVar = vq.ANDROID_DOWNLOADER_NETWORK_IO_ERROR;
                        break;
                    case 8:
                        vqVar = vq.ANDROID_DOWNLOADER_DISK_IO_ERROR;
                        break;
                    case 9:
                        vqVar = vq.ANDROID_DOWNLOADER_FILE_SYSTEM_ERROR;
                        break;
                    case 10:
                        vqVar = vq.ANDROID_DOWNLOADER_UNKNOWN_IO_ERROR;
                        break;
                    default:
                        throw new RuntimeException(null, null);
                }
                eVar.f24675v = vqVar;
                String c10 = gn.c(i);
                if (i != 0) {
                    int i12 = l3Var.f7925b;
                    if (i12 >= 0) {
                        c10 = c10 + " HttpCode: " + i12 + ";";
                    }
                    String str2 = (String) l3Var.e;
                    if (str2 != null) {
                        c10 = w7.i1.d(c10, " Message: ", str2, ";");
                    }
                    eVar.f24676w = c10;
                    if (th2 != null) {
                        eVar.f24677x = th2;
                    }
                    fm fmVar2 = (fm) s5Var.f14961v;
                    jr C = eVar.C();
                    fmVar2.f14309d = true;
                    hm hmVar2 = fmVar2.f14307b;
                    if (hmVar2 != null && hmVar2.b(C)) {
                        fmVar2.f14306a = null;
                        fmVar2.f14307b = null;
                        fmVar2.f14308c = null;
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        if (z4Var != null) {
            n(z4Var, f14129n);
        } else if (z4Var2 != null) {
            n(z4Var2, f14127l);
        }
    }
}
