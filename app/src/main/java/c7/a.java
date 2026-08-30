package c7;
import j.i0;

import android.net.Uri;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.ay0;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.uw;
import g9.k1;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import w7.i1;
import xa.c1;

/* loaded from: classes.dex */
public final class a implements q5.d, c1 {

    /* renamed from: w, reason: collision with root package name */
    public static a f3894w;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3895u;

    /* renamed from: v, reason: collision with root package name */
    public String f3896v;

    public a(String str, int i) {
        this.f3895u = i;
        switch (i) {
            case 10:
                this.f3896v = g3.a.j("UID: [", Process.myUid(), "]  PID: [", "] ", Process.myPid()).concat(str);
                return;
            default:
                this.f3896v = g3.a.j("UID: [", Process.myUid(), "]  PID: [", "] ", Process.myPid()).concat(str);
                return;
        }
    }

    public static void b(i0 i0Var, uw uwVar) {
        String str = (String) uwVar.f15100b;
        if (str != null) {
            i0Var.v("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        i0Var.v("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        i0Var.v("X-CRASHLYTICS-API-CLIENT-VERSION", "19.0.3");
        i0Var.v("Accept", "application/json");
        i0Var.v("X-CRASHLYTICS-DEVICE-MODEL", (String) uwVar.f15101c);
        String str2 = (String) uwVar.f15102d;
        if (str2 != null) {
            i0Var.v("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = (String) uwVar.e;
        if (str3 != null) {
            i0Var.v("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = ((oc.w) uwVar.f15103f).c().f21870a;
        if (str4 != null) {
            i0Var.v("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    public static String h(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = i1.d(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return wd0.n(str, " : ", str2);
    }

    public static HashMap k(uw uwVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", (String) uwVar.i);
        hashMap.put("display_version", (String) uwVar.f15105h);
        hashMap.put("source", Integer.toString(uwVar.f15099a));
        String str = (String) uwVar.f15104g;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    public static String p(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = i1.d(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return wd0.n(str, " : ", str2);
    }

    public void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", h(this.f3896v, str, objArr));
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h(this.f3896v, str, objArr));
        }
    }

    public void d(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", h(this.f3896v, str, objArr), exc);
        }
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", h(this.f3896v, str, objArr));
        }
    }

    public void g(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", h(this.f3896v, str, objArr));
        }
    }

    public String i(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f3896v).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    @Override // q5.d
    public String j() {
        return this.f3896v;
    }

    public JSONObject l(rd.m mVar) {
        String str = this.f3896v;
        int i = mVar.f24742a;
        lc.d dVar = lc.d.f20327a;
        dVar.e("Settings response code was: " + i);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String str2 = "Settings request failed; (status: " + i + ") from " + str;
            if (dVar.a(6)) {
                Log.e("FirebaseCrashlytics", str2, null);
            }
            return null;
        }
        String str3 = mVar.f24743b;
        try {
            return new JSONObject(str3);
        } catch (Exception e) {
            dVar.f(e, "Failed to parse settings JSON from ".concat(str));
            dVar.f(null, "Settings response " + str3);
            return null;
        }
    }

    public void m(String str) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", this.f3896v + " : " + str);
        }
    }

    public void n(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", p(this.f3896v, str, objArr));
        }
    }

    public void o(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", p(this.f3896v, str, objArr));
        }
    }

    public String toString() {
        switch (this.f3895u) {
            case 3:
                return this.f3896v;
            default:
                return super.toString();
        }
    }

    @Override // xa.c1
    public Object zza() {
        throw new ab.b(this.f3896v, 21);
    }

    @Override // q5.d
    public void f(q5.c cVar) {
    }

    public /* synthetic */ a(int i, boolean z3) {
        this.f3895u = i;
    }

    public a(int i) {
        this.f3895u = i;
        switch (i) {
            case 14:
                this.f3896v = g3.a.j("UID: [", Process.myUid(), "]  PID: [", "] ", Process.myPid()).concat("PhoneskyVerificationUtils");
                return;
            default:
                this.f3896v = (String) ay0.f4630v.p();
                return;
        }
    }

    public a(k1 k1Var) {
        String str;
        this.f3895u = 3;
        try {
            str = k1Var.a();
        } catch (RemoteException e) {
            l9.i.d("", e);
            str = null;
        }
        this.f3896v = str;
    }

    public /* synthetic */ a(int i, String str, boolean z3) {
        this.f3895u = i;
        this.f3896v = str;
    }

    public a(String str, mc.c cVar) {
        this.f3895u = 11;
        this.f3896v = str;
    }
}
