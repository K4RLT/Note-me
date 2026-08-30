package rd;
import b.c;

import android.content.Context;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qb.t;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f24724p = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f24725q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f24726a;

    /* renamed from: c, reason: collision with root package name */
    public int f24728c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f24730f;

    /* renamed from: g, reason: collision with root package name */
    public final f f24731g;

    /* renamed from: h, reason: collision with root package name */
    public final bc.g f24732h;
    public final hd.e i;

    /* renamed from: j, reason: collision with root package name */
    public final b f24733j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f24734k;

    /* renamed from: o, reason: collision with root package name */
    public final i f24738o;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24727b = false;

    /* renamed from: m, reason: collision with root package name */
    public final Random f24736m = new Random();

    /* renamed from: n, reason: collision with root package name */
    public final la.a f24737n = la.a.f20062a;

    /* renamed from: l, reason: collision with root package name */
    public final String f24735l = "firebase";

    /* renamed from: d, reason: collision with root package name */
    public boolean f24729d = false;
    public boolean e = false;

    public k(bc.g gVar, hd.e eVar, f fVar, b bVar, Context context, LinkedHashSet linkedHashSet, i iVar, ScheduledExecutorService scheduledExecutorService) {
        this.f24726a = linkedHashSet;
        this.f24730f = scheduledExecutorService;
        this.f24728c = Math.max(8 - iVar.b().f24716a, 1);
        this.f24732h = gVar;
        this.f24731g = fVar;
        this.i = eVar;
        this.f24733j = bVar;
        this.f24734k = context;
        this.f24738o = iVar;
    }

    public static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    public static boolean d(int i) {
        if (i != 408 && i != 429 && i != 502 && i != 503 && i != 504) {
            return false;
        }
        return true;
    }

    public static String f(InputStream inputStream) {
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine);
            }
        } catch (IOException unused) {
            if (sb2.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb2.toString();
    }

    public final synchronized boolean a() {
        boolean z3;
        if (!this.f24726a.isEmpty() && !this.f24727b && !this.f24729d) {
            if (!this.e) {
                z3 = true;
            }
        }
        z3 = false;
        return z3;
    }

    public final String c(String str) {
        String str2;
        bc.g gVar = this.f24732h;
        gVar.a();
        Matcher matcher = f24725q.matcher(gVar.f3179c.f3191b);
        if (matcher.matches()) {
            str2 = matcher.group(1);
        } else {
            str2 = null;
        }
        return a5.a.h("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", str2, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j10) {
        try {
            if (!a()) {
                return;
            }
            int i = this.f24728c;
            if (i > 0) {
                this.f24728c = i - 1;
                this.f24730f.schedule(new t(2, this), j10, TimeUnit.MILLISECONDS);
            } else if (!this.e) {
                new bc.i("Unable to connect to the server. Check your connection and try again.");
                g();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g() {
        Iterator it = this.f24726a.iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    public final synchronized void h() {
        this.f24737n.getClass();
        e(Math.max(0L, this.f24738o.b().f24717b.getTime() - new Date(System.currentTimeMillis()).getTime()));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            bc.g r9 = r6.f24732h
            r9.a()
            bc.j r0 = r9.f3179c
            java.lang.String r1 = r0.f3190a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f24734k
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            java.lang.String r2 = "FirebaseRemoteConfig"
            java.lang.String r3 = "Could not get fingerprint hash for package: "
            r4 = 0
            java.lang.String r5 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            byte[] r5 = la.b.g(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            if (r5 != 0) goto L47
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.<init>(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            java.lang.String r3 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            android.util.Log.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
        L45:
            r1 = r4
            goto L62
        L47:
            java.lang.String r1 = la.c(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4c
            goto L62
        L4c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "No such package: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getPackageName()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.i(r2, r1)
            goto L45
        L62:
            java.lang.String r2 = "X-Android-Cert"
            r7.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r2 = "yes"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r2 = "true"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r7.setRequestProperty(r1, r2)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.a()
            java.lang.String r2 = r0.f3191b
            java.util.regex.Pattern r3 = rd.k.f24725q
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 == 0) goto L9c
            r3 = 1
            java.lang.String r4 = r2.group(r3)
        L9c:
            java.lang.String r2 = "project"
            r1.put(r2, r4)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f24735l
            r1.put(r2, r3)
            rd.f r2 = r6.f24731g
            rd.i r2 = r2.f24709g
            android.content.SharedPreferences r2 = r2.f24719a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = r0.f3191b
            java.lang.String r0 = "appId"
            r1.put(r0, r9)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "22.0.0"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rd.k.i(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [tc.c, java.lang.Object] */
    public final synchronized tc.c j(HttpURLConnection httpURLConnection) {
        Object obj;
        j jVar = new j(this);
        f fVar = this.f24731g;
        b bVar = this.f24733j;
        LinkedHashSet linkedHashSet = this.f24726a;
        ScheduledExecutorService scheduledExecutorService = this.f24730f;
        obj = new Object();
        obj.f25698v = httpURLConnection;
        obj.f25699w = fVar;
        obj.f25700x = bVar;
        obj.f25697u = linkedHashSet;
        obj.f25701y = jVar;
        obj.f25702z = scheduledExecutorService;
        obj.A = new Random();
        return obj;
    }

    public final void k(Date date) {
        i iVar = this.f24738o;
        int i = iVar.b().f24716a + 1;
        int i10 = 8;
        if (i < 8) {
            i10 = i;
        }
        iVar.d(i, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f24724p[i10 - 1]) / 2) + this.f24736m.nextInt((int) r2)));
    }
}