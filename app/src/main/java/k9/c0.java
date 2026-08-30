package k9;
import r.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.ki;
import com.google.android.gms.internal.ads.mx;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.xx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f19643b;

    /* renamed from: d, reason: collision with root package name */
    public ac.b f19645d;

    /* renamed from: f, reason: collision with root package name */
    public SharedPreferences f19646f;

    /* renamed from: g, reason: collision with root package name */
    public SharedPreferences.Editor f19647g;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public String f19649j;

    /* renamed from: a, reason: collision with root package name */
    public final Object f19642a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f19644c = new ArrayList();
    public ki e = null;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19648h = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f19650k = true;

    /* renamed from: l, reason: collision with root package name */
    public String f19651l = "-1";

    /* renamed from: m, reason: collision with root package name */
    public int f19652m = -1;

    /* renamed from: n, reason: collision with root package name */
    public mx f19653n = new mx("", 0);

    /* renamed from: o, reason: collision with root package name */
    public long f19654o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f19655p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f19656q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f19657r = 0;

    /* renamed from: s, reason: collision with root package name */
    public Set f19658s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    public JSONObject f19659t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    public boolean f19660u = true;

    /* renamed from: v, reason: collision with root package name */
    public boolean f19661v = true;

    /* renamed from: w, reason: collision with root package name */
    public String f19662w = null;

    /* renamed from: x, reason: collision with root package name */
    public String f19663x = "";

    /* renamed from: y, reason: collision with root package name */
    public boolean f19664y = false;

    /* renamed from: z, reason: collision with root package name */
    public String f19665z = "";
    public String A = "{}";
    public int B = -1;
    public int C = -1;
    public long D = 0;
    public boolean E = false;
    public int F = 0;
    public int G = 0;

    public final void a(String str) {
        i();
        synchronized (this.f19642a) {
            try {
                this.f19651l = str;
                if (this.f19647g != null) {
                    boolean equals = str.equals("-1");
                    SharedPreferences.Editor editor = this.f19647g;
                    if (equals) {
                        editor.remove("IABTCF_TCString");
                    } else {
                        editor.putString("IABTCF_TCString", str);
                    }
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i) {
        i();
        synchronized (this.f19642a) {
            try {
                this.f19652m = i;
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    if (i == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i);
                    }
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(int i) {
        i();
        synchronized (this.f19642a) {
            try {
                if (this.C == i) {
                    return;
                }
                this.C = i;
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i);
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(long j10) {
        i();
        synchronized (this.f19642a) {
            try {
                if (this.D == j10) {
                    return;
                }
                this.D = j10;
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j10);
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(boolean z3) {
        if (!((Boolean) g9.e.f17698c.a(sl.f11048za)).booleanValue()) {
            return;
        }
        i();
        synchronized (this.f19642a) {
            try {
                if (this.f19664y == z3) {
                    return;
                }
                this.f19664y = z3;
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    editor.putBoolean("linked_device", z3);
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(String str) {
        if (!((Boolean) g9.e.f17698c.a(sl.f11048za)).booleanValue()) {
            return;
        }
        i();
        synchronized (this.f19642a) {
            try {
                if (this.f19665z.equals(str)) {
                    return;
                }
                this.f19665z = str;
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    editor.putString("linked_ad_unit", str);
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(String str) {
        if (!((Boolean) g9.e.f17698c.a(sl.Na)).booleanValue()) {
            return;
        }
        i();
        synchronized (this.f19642a) {
            try {
                if (this.A.equals(str)) {
                    return;
                }
                this.A = str;
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    editor.putString("inspector_ui_storage", str);
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        i();
        synchronized (this.f19642a) {
            try {
                if (this.E) {
                    return;
                }
                this.E = true;
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    editor.putBoolean("is_install_referrer_reported", true);
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        ac.b bVar = this.f19645d;
        if (bVar != null && !bVar.isDone()) {
            try {
                this.f19645d.get(1L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                int i = a0.f19634b;
                l9.i.g("Interrupted while waiting for preferences loaded.", e);
            } catch (CancellationException e8) {
                e = e8;
                int i10 = a0.f19634b;
                l9.i.d("Fail to initialize AdSharedPreferenceManager.", e);
            } catch (ExecutionException e10) {
                e = e10;
                int i102 = a0.f19634b;
                l9.i.d("Fail to initialize AdSharedPreferenceManager.", e);
            } catch (TimeoutException e11) {
                e = e11;
                int i1022 = a0.f19634b;
                l9.i.d("Fail to initialize AdSharedPreferenceManager.", e);
            }
        }
    }

    public final void j() {
        xx.f12651a.execute(new a6.x(26, this));
    }

    public final void k(Context context) {
        synchronized (this.f19642a) {
            try {
                if (this.f19646f != null) {
                    return;
                }
                this.f19645d = xx.f12651a.f(new iv1(this, 20, context));
                this.f19643b = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l() {
        boolean z3;
        i();
        synchronized (this.f19642a) {
            z3 = this.f19660u;
        }
        return z3;
    }

    public final boolean m() {
        boolean z3;
        i();
        synchronized (this.f19642a) {
            z3 = this.f19661v;
        }
        return z3;
    }

    public final mx n() {
        mx mxVar;
        i();
        synchronized (this.f19642a) {
            try {
                if (((Boolean) g9.e.f17698c.a(sl.f10718ed)).booleanValue() && this.f19653n.a()) {
                    ArrayList arrayList = this.f19644c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((Runnable) obj).run();
                    }
                }
                mxVar = this.f19653n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mxVar;
    }

    public final void o(long j10) {
        i();
        synchronized (this.f19642a) {
            try {
                if (this.f19655p == j10) {
                    return;
                }
                this.f19655p = j10;
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j10);
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(String str, String str2, boolean z3) {
        i();
        synchronized (this.f19642a) {
            try {
                JSONArray optJSONArray = this.f19659t.optJSONArray(str);
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                int length = optJSONArray.length();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject == null) {
                        return;
                    }
                    if (str2.equals(optJSONObject.optString("template_id"))) {
                        if (z3 && optJSONObject.optBoolean("uses_media_view", false)) {
                            return;
                        } else {
                            length = i;
                        }
                    }
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("template_id", str2);
                    jSONObject.put("uses_media_view", z3);
                    f9.k.C.f16819k.getClass();
                    jSONObject.put("timestamp_ms", System.currentTimeMillis());
                    optJSONArray.put(length, jSONObject);
                    this.f19659t.put(str, optJSONArray);
                } catch (JSONException e) {
                    int i10 = a0.f19634b;
                    l9.i.g("Could not update native advanced settings", e);
                }
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    editor.putString("native_advanced_settings", this.f19659t.toString());
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String q() {
        String str;
        i();
        synchronized (this.f19642a) {
            str = this.f19662w;
        }
        return str;
    }

    public final void r(String str) {
        i();
        synchronized (this.f19642a) {
            try {
                if (TextUtils.equals(this.f19662w, str)) {
                    return;
                }
                this.f19662w = str;
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(boolean z3) {
        i();
        synchronized (this.f19642a) {
            try {
                if (z3 == this.f19650k) {
                    return;
                }
                this.f19650k = z3;
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z3);
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t() {
        boolean z3;
        if (!((Boolean) g9.e.f17698c.a(sl.f10693d1)).booleanValue()) {
            return false;
        }
        i();
        synchronized (this.f19642a) {
            z3 = this.f19650k;
        }
        return z3;
    }

    public final void u(boolean z3) {
        i();
        synchronized (this.f19642a) {
            try {
                long currentTimeMillis = System.currentTimeMillis() + ((Long) g9.e.f17698c.a(sl.Rb)).longValue();
                SharedPreferences.Editor editor = this.f19647g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z3);
                    this.f19647g.putLong("topics_consent_expiry_time_ms", currentTimeMillis);
                    this.f19647g.apply();
                }
                j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
