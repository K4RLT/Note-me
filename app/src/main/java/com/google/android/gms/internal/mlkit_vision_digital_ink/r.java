package com.google.android.gms.internal.mlkit_vision_digital_ink;
import s.b;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public String f14879a;

    /* renamed from: b, reason: collision with root package name */
    public String f14880b;

    /* renamed from: c, reason: collision with root package name */
    public long f14881c;

    public r(long j10, String str, String str2) {
        this.f14879a = str;
        this.f14880b = str2;
        this.f14881c = j10;
    }

    public static String a(long j10, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j10);
            return jSONObject.toString();
        } catch (JSONException e) {
            Log.w("FirebaseMessaging", "Failed to encode token: " + e);
            return null;
        }
    }

    public static r b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new r(jSONObject.getLong("timestamp"), jSONObject.getString("token"), jSONObject.getString("appVersion"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }
        return new r(0L, str, null);
    }

    public Uri c() {
        Uri.Builder path = new Uri.Builder().scheme("blobstore").authority(this.f14880b).path(this.f14879a);
        String str = this.f14879a;
        w2 w2Var = s.f14944a;
        if (str.endsWith(".lease")) {
            String str2 = this.f14879a;
            if (str2.startsWith("/")) {
                str2 = str2.substring(1);
            }
            if (!TextUtils.equals(str2, "*.lease")) {
                path.appendQueryParameter("expiryDateSecs", String.valueOf(this.f14881c));
            }
        }
        Uri build = path.build();
        b(build);
        return build;
    }

    public void d(long j10, String str) {
        this.f14879a = String.valueOf(str).concat(".lease");
        this.f14881c = j10;
    }
}
