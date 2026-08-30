package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import bc.i;
import f3.k;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ConfigFetchHttpClient {

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f15614h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a, reason: collision with root package name */
    public final Context f15615a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15616b;

    /* renamed from: c, reason: collision with root package name */
    public final String f15617c;

    /* renamed from: d, reason: collision with root package name */
    public final String f15618d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15619f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15620g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j10, long j11) {
        String str3;
        this.f15615a = context;
        this.f15616b = str;
        this.f15617c = str2;
        Matcher matcher = f15614h.matcher(str);
        if (matcher.matches()) {
            str3 = matcher.group(1);
        } else {
            str3 = null;
        }
        this.f15618d = str3;
        this.e = "firebase";
        this.f15619f = j10;
        this.f15620g = j11;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read != -1) {
                sb2.append((char) read);
            } else {
                return new JSONObject(sb2.toString());
            }
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l10) {
        long j10;
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f15616b);
            Context context = this.f15615a;
            Locale locale = context.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            hashMap.put("languageCode", locale.toLanguageTag());
            int i = Build.VERSION.SDK_INT;
            hashMap.put("platformVersion", Integer.toString(i));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    if (i >= 28) {
                        j10 = k.d(packageInfo);
                    } else {
                        j10 = packageInfo.versionCode;
                    }
                    hashMap.put("appBuild", Long.toString(j10));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", context.getPackageName());
            hashMap.put("sdkVersion", "22.0.0");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            if (l10 != null) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                hashMap.put("firstOpenTime", simpleDateFormat.format(l10));
            }
            return new JSONObject(hashMap);
        }
        throw new i("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.f15618d + "/namespaces/" + this.e + ":fetch").openConnection();
        } catch (IOException e) {
            throw new i(e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a0 A[LOOP:0: B:8:0x009a->B:10:0x00a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6 A[Catch: all -> 0x01ab, JSONException -> 0x01ad, IOException | JSONException -> 0x01af, TRY_LEAVE, TryCatch #3 {all -> 0x01ab, blocks: (B:14:0x00ba, B:16:0x00d6, B:85:0x01b1, B:86:0x01ba, B:95:0x01bb, B:96:0x01c2), top: B:13:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b1 A[Catch: all -> 0x01ab, JSONException -> 0x01ad, IOException | JSONException -> 0x01af, TRY_ENTER, TryCatch #3 {all -> 0x01ab, blocks: (B:14:0x00ba, B:16:0x00d6, B:85:0x01b1, B:86:0x01ba, B:95:0x01bb, B:96:0x01c2), top: B:13:0x00ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rd.e fetch(java.net.HttpURLConnection r13, java.lang.String r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.String> r16, java.lang.String r17, java.util.Map<java.lang.String, java.lang.String> r18, java.lang.Long r19, java.util.Date r20) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.lang.Long, java.util.Date):rd.e");
    }
}
