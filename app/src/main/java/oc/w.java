package oc;
import q.x;
import y.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import c0.z;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f21946g = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: h, reason: collision with root package name */
    public static final String f21947h = Pattern.quote("/");

    /* renamed from: a, reason: collision with root package name */
    public final c7.a f21948a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f21949b;

    /* renamed from: c, reason: collision with root package name */
    public final String f21950c;

    /* renamed from: d, reason: collision with root package name */
    public final hd.e f21951d;
    public final z e;

    /* renamed from: f, reason: collision with root package name */
    public b f21952f;

    public w(Context context, String str, hd.e eVar, z zVar) {
        if (context != null) {
            if (str != null) {
                this.f21949b = context;
                this.f21950c = str;
                this.f21951d = eVar;
                this.e = zVar;
                this.f21948a = new c7.a(6, false);
                return;
            }
            x.n("appIdentifier must not be null");
            throw null;
        }
        x.n("appContext must not be null");
        throw null;
    }

    public final synchronized String a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f21946g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        String str2 = "Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str2, null);
        }
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(7:13|14|4|5|6|7|8)|3|4|5|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        android.util.Log.w("FirebaseCrashlytics", "Error getting Firebase installation id.", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final oc.v b(boolean r5) {
        /*
            r4 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            hd.e r1 = r4.f21951d
            r2 = 0
            if (r5 == 0) goto L1d
            r5 = r1
            hd.d r5 = (hd.d) r5     // Catch: java.lang.Exception -> L17
            ib.o r5 = r5.d()     // Catch: java.lang.Exception -> L17
            java.lang.Object r5 = oc.a(r5)     // Catch: java.lang.Exception -> L17
            hd.a r5 = (hd.a) r5     // Catch: java.lang.Exception -> L17
            java.lang.String r5 = r5.f18003a     // Catch: java.lang.Exception -> L17
            goto L1e
        L17:
            r5 = move-exception
            java.lang.String r3 = "Error getting Firebase authentication token."
            android.util.Log.w(r0, r3, r5)
        L1d:
            r5 = r2
        L1e:
            hd.d r1 = (hd.d) r1     // Catch: java.lang.Exception -> L2c
            ib.o r1 = r1.c()     // Catch: java.lang.Exception -> L2c
            java.lang.Object r1 = oc.a(r1)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2c
            r2 = r1
            goto L32
        L2c:
            r1 = move-exception
            java.lang.String r3 = "Error getting Firebase installation id."
            android.util.Log.w(r0, r3, r1)
        L32:
            oc.v r0 = new oc.v
            r0.<init>(r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.w.b(boolean):oc.v");
    }

    public final synchronized b c() {
        String str;
        b bVar = this.f21952f;
        if (bVar != null && (bVar.f21871b != null || !this.e.b())) {
            return this.f21952f;
        }
        lc.d dVar = lc.d.f20327a;
        dVar.e("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferences = this.f21949b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        dVar.e("Cached Firebase Installation ID: " + string);
        if (this.e.b()) {
            v b10 = b(false);
            dVar.e("Fetched Firebase Installation ID: " + b10.f21944a);
            if (b10.f21944a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                b10 = new v(str, null);
            }
            if (Objects.equals(b10.f21944a, string)) {
                this.f21952f = new b(sharedPreferences.getString("crashlytics.installation.id", null), b10.f21944a, b10.f21945b);
            } else {
                this.f21952f = new b(a(sharedPreferences, b10.f21944a), b10.f21944a, b10.f21945b);
            }
        } else if (string != null && string.startsWith("SYN_")) {
            this.f21952f = new b(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        } else {
            this.f21952f = new b(a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        }
        dVar.e("Install IDs: " + this.f21952f);
        return this.f21952f;
    }

    public final String d() {
        String str;
        c7.a aVar = this.f21948a;
        Context context = this.f21949b;
        synchronized (aVar) {
            try {
                if (aVar.f3896v == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    aVar.f3896v = installerPackageName;
                }
                if ("".equals(aVar.f3896v)) {
                    str = null;
                } else {
                    str = aVar.f3896v;
                }
            } finally {
            }
        }
        return str;
    }
}
