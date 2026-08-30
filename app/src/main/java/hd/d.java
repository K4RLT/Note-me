package hd;
import b.a;
import c.a;
import c.b;
import c.f;
import c.g;
import c.h;
import d.a;
import d.b;
import d.f;

import android.net.TrafficStats;
import android.util.Log;
import b0.e1;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.r7;
import eb.x;
import fa.y;
import ib.o;
import ic.n;
import j6.l;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import wa.h8;

/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f18010m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final bc.g f18011a;

    /* renamed from: b, reason: collision with root package name */
    public final jd.c f18012b;

    /* renamed from: c, reason: collision with root package name */
    public final l f18013c;

    /* renamed from: d, reason: collision with root package name */
    public final k f18014d;
    public final n e;

    /* renamed from: f, reason: collision with root package name */
    public final i f18015f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f18016g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f18017h;
    public final jc.k i;

    /* renamed from: j, reason: collision with root package name */
    public String f18018j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f18019k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f18020l;

    static {
        new AtomicInteger(1);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [hd.i, java.lang.Object] */
    public d(bc.g gVar, gd.b bVar, ExecutorService executorService, jc.k kVar) {
        gVar.a();
        jd.c cVar = new jd.c(gVar.f3177a, bVar);
        l lVar = new l(15, gVar);
        if (x.f16448v == null) {
            x.f16448v = new x(27);
        }
        x xVar = x.f16448v;
        if (k.f18027c == null) {
            k.f18027c = new k(xVar);
        }
        k kVar2 = k.f18027c;
        n nVar = new n(new b(0, gVar));
        Object obj = new Object();
        this.f18016g = new Object();
        this.f18019k = new HashSet();
        this.f18020l = new ArrayList();
        this.f18011a = gVar;
        this.f18012b = cVar;
        this.f18013c = lVar;
        this.f18014d = kVar2;
        this.e = nVar;
        this.f18015f = obj;
        this.f18017h = executorService;
        this.i = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        r3 = f(r2);
        r4 = r6.f18013c;
        r2 = r2.a();
        r2.f5482a = r3;
        r2.f5483b = 3;
        r2 = r2.a();
        r4.j(r2);
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r6 = this;
            java.lang.Object r0 = hd.d.f18010m
            monitor-enter(r0)
            bc.g r1 = r6.f18011a     // Catch: java.lang.Throwable -> L3f
            r1.a()     // Catch: java.lang.Throwable -> L3f
            android.content.Context r1 = r1.f3177a     // Catch: java.lang.Throwable -> L3f
            j6.c r1 = j6.a(r1)     // Catch: java.lang.Throwable -> L3f
            j6.l r2 = r6.f18013c     // Catch: java.lang.Throwable -> L37
            id.a r2 = r2.k()     // Catch: java.lang.Throwable -> L37
            int r3 = r2.f18425b     // Catch: java.lang.Throwable -> L37
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L1e
            if (r3 != r5) goto L1d
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L39
            java.lang.String r3 = r6.f(r2)     // Catch: java.lang.Throwable -> L37
            j6.l r4 = r6.f18013c     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.dr r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r2.f5482a = r3     // Catch: java.lang.Throwable -> L37
            r3 = 3
            r2.f5483b = r3     // Catch: java.lang.Throwable -> L37
            id.a r2 = r2.a()     // Catch: java.lang.Throwable -> L37
            r4.j(r2)     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r2 = move-exception
            goto L51
        L39:
            if (r1 == 0) goto L41
            r1.h()     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r1 = move-exception
            goto L57
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            r6.i(r2)
            jc.k r0 = r6.i
            hd.c r1 = new hd.c
            r2 = 2
            r1.<init>(r6, r2)
            r0.execute(r1)
            return
        L51:
            if (r1 == 0) goto L56
            r1.h()     // Catch: java.lang.Throwable -> L3f
        L56:
            throw r2     // Catch: java.lang.Throwable -> L3f
        L57:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.a():void");
    }

    public final id.a b(id.a aVar) {
        int responseCode;
        boolean z3;
        jd.b f10;
        jd.c cVar = this.f18012b;
        bc.g gVar = this.f18011a;
        gVar.a();
        String str = gVar.f3179c.f3190a;
        String str2 = aVar.f18424a;
        bc.g gVar2 = this.f18011a;
        gVar2.a();
        String str3 = gVar2.f3179c.f3195g;
        String str4 = aVar.f18427d;
        r7 r7Var = cVar.f19170c;
        if (r7Var.a()) {
            URL a10 = jd.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
            for (int i = 0; i <= 1; i++) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a10, str);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                        c10.setDoOutput(true);
                        jd.h(c10);
                        responseCode = c10.getResponseCode();
                        r7Var.b(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } finally {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused) {
                }
                if (z3) {
                    f10 = jd.f(c10);
                } else {
                    jd.b(c10, null, str, str3);
                    if (responseCode != 401 && responseCode != 404) {
                        if (responseCode != 429) {
                            if (responseCode < 500 || responseCode >= 600) {
                                Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                e1 a11 = jd.a();
                                a11.f1179b = 2;
                                f10 = a11.b();
                            }
                        } else {
                            throw new bc.i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        }
                    } else {
                        e1 a12 = jd.a();
                        a12.f1179b = 3;
                        f10 = a12.b();
                    }
                }
                int b10 = q0.b(f10.f19166c);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 == 2) {
                            synchronized (this) {
                                this.f18018j = null;
                            }
                            dr a13 = aVar.a();
                            a13.f5483b = 2;
                            return a13.a();
                        }
                        throw new bc.i("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    dr a14 = aVar.a();
                    a14.f5487g = "BAD CONFIG";
                    a14.f5483b = 5;
                    return a14.a();
                }
                String str5 = f10.f19164a;
                long j10 = f10.f19165b;
                this.f18014d.f18028a.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                dr a15 = aVar.a();
                a15.f5484c = str5;
                a15.e = Long.valueOf(j10);
                a15.f5486f = Long.valueOf(currentTimeMillis);
                return a15.a();
            }
            throw new bc.i("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new bc.i("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final o c() {
        String str;
        e();
        synchronized (this) {
            str = this.f18018j;
        }
        if (str != null) {
            return h8.e(str);
        }
        ib.h hVar = new ib.h();
        h hVar2 = new h(hVar);
        synchronized (this.f18016g) {
            this.f18020l.add(hVar2);
        }
        o oVar = hVar.f18363a;
        this.f18017h.execute(new c(this, 0));
        return oVar;
    }

    public final o d() {
        e();
        ib.h hVar = new ib.h();
        g gVar = new g(this.f18014d, hVar);
        synchronized (this.f18016g) {
            this.f18020l.add(gVar);
        }
        o oVar = hVar.f18363a;
        this.f18017h.execute(new c(this, 1));
        return oVar;
    }

    public final void e() {
        bc.g gVar = this.f18011a;
        gVar.a();
        y.f(gVar.f3179c.f3191b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        y.f(gVar.f3179c.f3195g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        y.f(gVar.f3179c.f3190a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        gVar.a();
        String str = gVar.f3179c.f3191b;
        Pattern pattern = k.f18026b;
        y.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        gVar.a();
        y.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.f18026b.matcher(gVar.f3179c.f3190a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f3178b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(id.a r6) {
        /*
            r5 = this;
            bc.g r0 = r5.f18011a
            r0.a()
            java.lang.String r0 = r0.f3178b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            bc.g r0 = r5.f18011a
            java.lang.String r1 = "[DEFAULT]"
            r0.a()
            java.lang.String r0 = r0.f3178b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5c
        L1e:
            int r6 = r6.f18425b
            r0 = 1
            if (r6 != r0) goto L5c
            ic.n r6 = r5.e
            java.lang.Object r6 = r6.get()
            id.b r6 = (id.b) r6
            android.content.SharedPreferences r0 = r6.f18431a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f18431a     // Catch: java.lang.Throwable -> L3f
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L3f
            android.content.SharedPreferences r2 = r6.f18431a     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L41
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r6 = move-exception
            goto L5a
        L41:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
        L46:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L56
            hd.i r6 = r5.f18015f
            r6.getClass()
            java.lang.String r6 = hd.i.a()
            return r6
        L56:
            return r2
        L57:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L57
            throw r6     // Catch: java.lang.Throwable -> L3f
        L5a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3f
            throw r6
        L5c:
            hd.i r6 = r5.f18015f
            r6.getClass()
            java.lang.String r6 = hd.i.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.f(id.a):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [jd.c] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [jd.a] */
    public final id.a g(id.a aVar) {
        int responseCode;
        boolean z3;
        String str = aVar.f18424a;
        String str2 = null;
        if (str != null && str.length() == 11) {
            id.b bVar = (id.b) this.e.get();
            synchronized (bVar.f18431a) {
                try {
                    String[] strArr = id.b.f18430c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str3 = strArr[i];
                            String string = bVar.f18431a.getString("|T|" + bVar.f18432b + "|" + str3, null);
                            if (string != null && !string.isEmpty()) {
                                if (string.startsWith("{")) {
                                    try {
                                        str2 = new JSONObject(string).getString("token");
                                    } catch (JSONException unused) {
                                    }
                                } else {
                                    str2 = string;
                                }
                            } else {
                                i++;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        jd.c cVar = this.f18012b;
        bc.g gVar = this.f18011a;
        gVar.a();
        String str4 = gVar.f3179c.f3190a;
        String str5 = aVar.f18424a;
        bc.g gVar2 = this.f18011a;
        gVar2.a();
        String str6 = gVar2.f3179c.f3195g;
        bc.g gVar3 = this.f18011a;
        gVar3.a();
        String str7 = gVar3.f3179c.f3191b;
        r7 r7Var = cVar.f19170c;
        if (r7Var.a()) {
            URL a10 = jd.a("projects/" + str6 + "/installations");
            int i10 = 0;
            jd.a aVar2 = cVar;
            while (i10 <= 1) {
                TrafficStats.setThreadStatsTag(32769);
                HttpURLConnection c10 = aVar2.c(a10, str4);
                try {
                    try {
                        c10.setRequestMethod("POST");
                        c10.setDoOutput(true);
                        if (str2 != null) {
                            c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                        }
                        jd.g(c10, str5, str7);
                        responseCode = c10.getResponseCode();
                        r7Var.b(responseCode);
                        if (responseCode >= 200 && responseCode < 300) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                    } finally {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                } catch (IOException | AssertionError unused2) {
                }
                if (z3) {
                    jd.a e = jd.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVar2 = e;
                } else {
                    try {
                        jd.b(c10, str7, str4, str6);
                    } catch (IOException | AssertionError unused3) {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i10++;
                        aVar2 = aVar2;
                    }
                    if (responseCode != 429) {
                        if (responseCode >= 500 && responseCode < 600) {
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i10++;
                            aVar2 = aVar2;
                        } else {
                            Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                            jd.a aVar3 = new jd.a(null, null, null, null, 2);
                            c10.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            aVar2 = aVar3;
                        }
                    } else {
                        throw new bc.i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        break;
                    }
                }
                int b10 = q0.b(aVar2.e);
                if (b10 != 0) {
                    if (b10 == 1) {
                        dr a11 = aVar.a();
                        a11.f5487g = "BAD CONFIG";
                        a11.f5483b = 5;
                        return a11.a();
                    }
                    throw new bc.i("Firebase Installations Service is unavailable. Please try again later.");
                }
                String str8 = aVar2.f19161b;
                String str9 = aVar2.f19162c;
                this.f18014d.f18028a.getClass();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                jd.b bVar2 = aVar2.f19163d;
                String str10 = bVar2.f19164a;
                long j10 = bVar2.f19165b;
                dr a12 = aVar.a();
                a12.f5482a = str8;
                a12.f5483b = 4;
                a12.f5484c = str10;
                a12.f5485d = str9;
                a12.e = Long.valueOf(j10);
                a12.f5486f = Long.valueOf(currentTimeMillis);
                return a12.a();
            }
            throw new bc.i("Firebase Installations Service is unavailable. Please try again later.");
        }
        throw new bc.i("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void h(Exception exc) {
        synchronized (this.f18016g) {
            try {
                Iterator it = this.f18020l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(id.a aVar) {
        synchronized (this.f18016g) {
            try {
                Iterator it = this.f18020l.iterator();
                while (it.hasNext()) {
                    if (((j) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}