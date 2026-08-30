package s9;
import b.a;
import k.a;
import r.e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.j51;
import com.google.android.gms.internal.ads.k51;
import com.google.android.gms.internal.ads.sl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import ya.ee;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25046a;

    /* renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f25047b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f25048c;

    /* renamed from: d, reason: collision with root package name */
    public final l9.a f25049d;
    public final JSONObject e = new JSONObject();

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f25050f = new AtomicBoolean(false);

    public b(Context context, ArrayList arrayList, l9.a aVar) {
        this.f25046a = context;
        this.f25047b = context.getApplicationInfo();
        this.f25048c = arrayList;
        this.f25049d = aVar;
    }

    public final void a(WebView webView) {
        if (!this.f25050f.getAndSet(true)) {
            PackageInfo packageInfo = null;
            ApplicationInfo applicationInfo = this.f25047b;
            if (applicationInfo != null) {
                try {
                    packageInfo = na.a(this.f25046a).c(0, applicationInfo.packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            JSONObject jSONObject = this.e;
            if (packageInfo != null) {
                try {
                    jSONObject.put("vc", packageInfo.versionCode);
                    jSONObject.put("vnm", packageInfo.versionName);
                } catch (JSONException e) {
                    f9.k.C.f16817h.d("PawAppSignalGenerator.initialize", e);
                }
            }
            if (applicationInfo != null) {
                jSONObject.put("pn", applicationInfo.packageName);
            }
            ArrayList arrayList = this.f25048c;
            ArrayList arrayList2 = new ArrayList();
            for (String str : ((String) g9.e.f17698c.a(sl.f10797jb)).split(",", -1)) {
                if (arrayList.contains(str)) {
                    arrayList2.add(str);
                }
            }
            jSONObject.put("eid", arrayList2);
            jSONObject.put("js", this.f25049d.f20029u);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj != null) {
                    jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
                }
            }
            if (((Boolean) bn.f4837b.p()).booleanValue() && ee.a("DOCUMENT_START_SCRIPT") && webView != null) {
                String format = String.format(Locale.getDefault(), (String) g9.e.f17698c.a(sl.f10781ib), b());
                int i = j51.f7334w;
                k51 k51Var = new k51("*");
                int i10 = y5.b.f30913a;
                if (z5.k.e.b()) {
                    return;
                }
                throw z5.a();
            }
        }
    }

    public final JSONObject b() {
        if (!this.f25050f.get()) {
            a(null);
        }
        return this.e;
    }
}
