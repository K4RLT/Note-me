package tc;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import c4.n;
import com.google.android.gms.internal.ads.s1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.b4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.d4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.e0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.e4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.gn;
import com.google.android.gms.internal.mlkit_vision_digital_ink.h4;
import com.google.android.gms.internal.mlkit_vision_digital_ink.l;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pa;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k6.i;
import lb.f1;
import lb.g1;
import lb.n0;
import lb.s;
import lb.w0;
import lc.d;
import mb.f;
import oc.g;
import org.json.JSONException;
import org.json.JSONObject;
import q.x;
import qc.z0;
import qd.e;
import rd.j;

/* loaded from: classes.dex */
public final class c implements f {
    public Object A;

    /* renamed from: u, reason: collision with root package name */
    public Object f25697u;

    /* renamed from: v, reason: collision with root package name */
    public Object f25698v;

    /* renamed from: w, reason: collision with root package name */
    public Object f25699w;

    /* renamed from: x, reason: collision with root package name */
    public Object f25700x;

    /* renamed from: y, reason: collision with root package name */
    public Object f25701y;

    /* renamed from: z, reason: collision with root package name */
    public Object f25702z;

    public c(Context context, int i) {
        boolean z3;
        String str;
        String replaceAll;
        switch (i) {
            case 1:
                this.f25699w = "files";
                this.f25700x = "common";
                this.f25701y = l.f14582b;
                this.f25702z = "";
                e4 e4Var = h4.f14393v;
                this.A = new b4(4);
                if (context != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                pa.h(z3, "Context cannot be null", new Object[0]);
                this.f25698v = context;
                this.f25697u = context.getPackageName();
                return;
            default:
                String str2 = ((z0) d.f20328b.d(context)).f23977a;
                this.f25697u = str2;
                File filesDir = context.getFilesDir();
                this.f25698v = filesDir;
                if (!str2.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
                    sb2.append(File.separator);
                    if (str2.length() > 40) {
                        replaceAll = g.i(str2);
                    } else {
                        replaceAll = str2.replaceAll("[^a-zA-Z0-9.]", "_");
                    }
                    sb2.append(replaceAll);
                    str = sb2.toString();
                } else {
                    str = ".com.google.firebase.crashlytics.files.v1";
                }
                File file = new File(filesDir, str);
                g(file);
                this.f25699w = file;
                File file2 = new File(file, "open-sessions");
                g(file2);
                this.f25700x = file2;
                File file3 = new File(file, "reports");
                g(file3);
                this.f25701y = file3;
                File file4 = new File(file, "priority-reports");
                g(file4);
                this.f25702z = file4;
                File file5 = new File(file, "native-reports");
                g(file5);
                this.A = file5;
                return;
        }
    }

    public static synchronized void g(File file) {
        synchronized (c.class) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        return;
                    }
                    String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str, null);
                    }
                    file.delete();
                }
                if (!file.mkdirs()) {
                    Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean i(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                i(file2);
            }
        }
        return file.delete();
    }

    public static List j(Object[] objArr) {
        if (objArr == null) {
            return Collections.EMPTY_LIST;
        }
        return Arrays.asList(objArr);
    }

    public void a(int i, long j10) {
        if (i == 0) {
            new e("Unable to fetch the latest version of the template.");
            h();
        } else {
            ((ScheduledExecutorService) this.f25702z).schedule(new s1(this, i, j10, 1), ((Random) this.A).nextInt(4), TimeUnit.SECONDS);
        }
    }

    @Override // mb.f
    public Object b() {
        File externalFilesDir;
        String str = (String) ((mb.e) this.f25697u).b();
        Object b10 = ((ic.c) this.f25698v).b();
        Object b11 = ((mb.e) this.f25699w).b();
        Context context = ((n) ((i) this.f25700x).f19569v).f3851u;
        Object b12 = ((mb.e) this.f25701y).b();
        mb.e eVar = new mb.e(new i(9, (mb.e) this.f25702z));
        s sVar = (s) b10;
        n0 n0Var = (n0) b11;
        g1 g1Var = (g1) b12;
        f1 f1Var = (f1) ((mb.e) this.A).b();
        if (str != null) {
            externalFilesDir = new File(context.getExternalFilesDir(null), str);
        } else {
            externalFilesDir = context.getExternalFilesDir(null);
        }
        return new w0(externalFilesDir, sVar, n0Var, context, g1Var, eVar, f1Var);
    }

    public void c(String str) {
        File file = new File((File) this.f25698v, str);
        if (file.exists() && i(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    public File d(String str, String str2) {
        File file = new File((File) this.f25700x, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public void e(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = "";
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = str.concat(readLine);
            if (readLine.contains("}")) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
                    str = "";
                } else {
                    str = str.substring(indexOf, lastIndexOf + 1);
                }
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e) {
                        new bc.i("Unable to parse config update message.", e.getCause());
                        h();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        j jVar = (j) this.f25701y;
                        new e("The server is temporarily unavailable. Try again in a few minutes.");
                        jVar.a();
                        break;
                    }
                    synchronized (this) {
                        isEmpty = ((LinkedHashSet) this.f25697u).isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j10 = ((rd.f) this.f25699w).f24709g.f24719a.getLong("last_template_version", 0L);
                        long j11 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j11 > j10) {
                            a(3, j11);
                        }
                    }
                    str = "";
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public void f() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.f25698v;
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            e(inputStream);
            inputStream.close();
        } catch (IOException e) {
            Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e);
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public synchronized void h() {
        Iterator it = ((LinkedHashSet) this.f25697u).iterator();
        while (it.hasNext()) {
            ((j) it.next()).a();
        }
    }

    public Uri k() {
        String str = (String) this.f25699w;
        String str2 = (String) this.f25700x;
        String o10 = p.a.o(p.a.q("/", str, "/", str2, "/"), com.google.android.gms.internal.mlkit_vision_digital_ink.j.b((Account) this.f25701y), "/", (String) this.f25702z);
        return new Uri.Builder().scheme("android").authority((String) this.f25697u).path(o10).encodedFragment(e0.a(((d4) this.A).d())).build();
    }

    public void l(String str) {
        String substring;
        boolean z3;
        Context context = (Context) this.f25698v;
        File k3 = gn.k(context);
        String absolutePath = new File(k3, "managed").getAbsolutePath();
        if (str.startsWith(absolutePath)) {
            l.a("managed");
            this.f25699w = "managed";
            substring = str.substring(absolutePath.length());
        } else {
            String absolutePath2 = k3.getAbsolutePath();
            if (str.startsWith(absolutePath2)) {
                l.a("files");
                this.f25699w = "files";
                substring = str.substring(absolutePath2.length());
            } else {
                String absolutePath3 = context.getCacheDir().getAbsolutePath();
                if (str.startsWith(absolutePath3)) {
                    l.a("cache");
                    this.f25699w = "cache";
                    substring = str.substring(absolutePath3.length());
                } else {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        String absolutePath4 = externalFilesDir.getAbsolutePath();
                        if (str.startsWith(absolutePath4)) {
                            l.a("external");
                            this.f25699w = "external";
                            substring = str.substring(absolutePath4.length());
                        }
                    }
                    File parentFile = gn.k(context.createDeviceProtectedStorageContext()).getParentFile();
                    String absolutePath5 = new File(parentFile, "files").getAbsolutePath();
                    if (str.startsWith(absolutePath5)) {
                        l.a("directboot-files");
                        this.f25699w = "directboot-files";
                        substring = str.substring(absolutePath5.length());
                    } else {
                        String absolutePath6 = new File(parentFile, "cache").getAbsolutePath();
                        if (str.startsWith(absolutePath6)) {
                            l.a("directboot-cache");
                            this.f25699w = "directboot-cache";
                            substring = str.substring(absolutePath6.length());
                        } else {
                            x.n("Path must be in app-private files dir or external files dir: ".concat(str));
                            return;
                        }
                    }
                }
            }
        }
        List asList = Arrays.asList(substring.split(File.separator));
        if (asList.size() >= 3) {
            z3 = true;
        } else {
            z3 = false;
        }
        pa.h(z3, "Path must be in module and account subdirectories: %s", str);
        String str2 = (String) asList.get(1);
        l.b(str2);
        this.f25700x = str2;
        String str3 = (String) asList.get(2);
        if ("managed".equals((String) this.f25699w)) {
            Account account = com.google.android.gms.internal.mlkit_vision_digital_ink.j.f14493a;
            if (!"shared".equals(str3)) {
                try {
                    Integer.parseInt(str3);
                    pa.h(false, "AccountManager cannot be null", new Object[0]);
                    try {
                        throw null;
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IllegalArgumentException(new IOException(e));
                    } catch (ExecutionException e8) {
                        throw new IllegalArgumentException(new IOException(e8.getCause()));
                    }
                } catch (NumberFormatException e10) {
                    throw new IllegalArgumentException(e10);
                }
            }
        }
        Account a10 = com.google.android.gms.internal.mlkit_vision_digital_ink.j.a(str3);
        com.google.android.gms.internal.mlkit_vision_digital_ink.j.b(a10);
        this.f25701y = a10;
        n(substring.substring(str3.length() + ((String) this.f25700x).length() + 2));
    }

    public void m(String str) {
        l.b(str);
        this.f25700x = str;
    }

    public void n(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = l.f14581a;
        this.f25702z = str;
    }
}
