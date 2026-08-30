package f7;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.ads.wd0;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.h1;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.HashMap;
import kotlin.jvm.internal.l;
import mf.f;
import pe.j;
import qe.m;
import wa.m6;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile Context f16779a = null;

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f16780b = true;

    /* renamed from: c, reason: collision with root package name */
    public static volatile String f16781c;

    public static void a(String str, String str2, long j10, String str3, int i) {
        str.getClass();
        str3.getClass();
        if (str3.length() != 3) {
            return;
        }
        i("ad_impression", c(new j("ad_platform", "AdMob"), new j("ad_source", str2), new j("ad_format", "Rewarded"), new j("ad_unit_name", "rewarded_export"), new j("currency", str3), new j("value", Double.valueOf(j10 / 1000000.0d)), new j("surface", str), new j("precision", Integer.valueOf(i))));
    }

    public static void b(String str, String str2) {
        i("ad_missed", c(new j("surface", str), new j("reason", str2)));
    }

    public static Bundle c(j... jVarArr) {
        String str;
        Bundle bundle = new Bundle();
        for (j jVar : jVarArr) {
            String str2 = (String) jVar.f22693u;
            Object obj = jVar.f22694v;
            if (obj != null) {
                if (obj instanceof Integer) {
                    bundle.putInt(str2, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    bundle.putLong(str2, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    bundle.putDouble(str2, ((Number) obj).doubleValue());
                } else if (obj instanceof Float) {
                    bundle.putDouble(str2, ((Number) obj).floatValue());
                } else if (obj instanceof Boolean) {
                    if (((Boolean) obj).booleanValue()) {
                        str = "yes";
                    } else {
                        str = "no";
                    }
                    bundle.putString(str2, str);
                } else {
                    String obj2 = obj.toString();
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    bundle.putString(str2, f.H(100, obj2));
                }
            }
        }
        return bundle;
    }

    public static void d(String str) {
        i("cross_promo", c(new j("action", str)));
    }

    public static void e(String str, int i, String str2) {
        int i10;
        j jVar = new j("kind", str);
        j jVar2 = new j("in_spread", Integer.valueOf(i));
        String str3 = null;
        if (str2 != null) {
            if (f.u(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                str3 = f.H(60, str2);
            }
        }
        i("element_added", c(jVar, jVar2, new j("item", str3)));
        m6.a(a.CONTENT_ADDED);
        if (i >= 3) {
            m6.a(a.PAGE_COMPOSED);
        }
        synchronized (b.f16774a) {
            try {
                HashMap hashMap = b.f16778f;
                Integer num = (Integer) hashMap.get(str);
                if (num != null) {
                    i10 = num.intValue();
                } else {
                    i10 = 0;
                }
                hashMap.put(str, Integer.valueOf(i10 + 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void f(String str, String str2) {
        i("export_failed", c(new j("format", str), new j("reason", f.H(60, str2))));
    }

    public static void g(String str, int i, String str2) {
        i("export_done", c(new j("format", str), new j("action", str2), new j("spreads", Integer.valueOf(i))));
        m6.a(a.EXPORTED);
        q("has_exported", "yes");
    }

    public static FirebaseAnalytics h() {
        Context context = f16779a;
        if (context == null) {
            return null;
        }
        try {
            return FirebaseAnalytics.getInstance(context);
        } catch (Exception e) {
            wd0.o("Analytics no disponible: ", e.getMessage(), "Analytics");
            return null;
        }
    }

    public static void i(String str, Bundle bundle) {
        String str2;
        str.getClass();
        if (f16780b) {
            try {
                FirebaseAnalytics h3 = h();
                if (h3 != null) {
                    f1 f1Var = h3.f15587a;
                    f1Var.getClass();
                    str2 = str;
                    try {
                        f1Var.e(new h1(f1Var, null, str2, bundle, false, 2));
                    } catch (Exception e) {
                        e = e;
                        Log.w("Analytics", "No se pudo enviar " + str2 + ": " + e.getMessage());
                    }
                }
            } catch (Exception e8) {
                e = e8;
                str2 = str;
            }
        }
    }

    public static void j(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        i("pack_obtained", c(new j("pack", f.H(60, str)), new j("kind", str2), new j("unlock", str3)));
    }

    public static void k(String str) {
        if (str == null) {
            str = "";
        }
        i("paywall_shown", c(new j("feature", f.H(40, str))));
        o("paywall");
    }

    public static void l(String str, String str2, String str3, long j10, String str4, String str5) {
        str.getClass();
        str2.getClass();
        if (str4.length() == 3 && j10 > 0) {
            double d2 = j10 / 1000000.0d;
            Bundle bundle = new Bundle();
            bundle.putString("item_id", f.H(100, str));
            bundle.putString("item_name", f.H(100, str2));
            bundle.putString("item_category", f.H(100, str3));
            bundle.putString("currency", str4);
            bundle.putDouble("price", d2);
            bundle.putLong("quantity", 1L);
            Bundle bundle2 = new Bundle();
            bundle2.putString("currency", str4);
            bundle2.putDouble("value", d2);
            if (str5 != null && !f.u(str5)) {
                bundle2.putString("transaction_id", f.H(100, str5));
            }
            bundle2.putParcelableArray("items", new Parcelable[]{bundle});
            i("purchase", bundle2);
        }
    }

    public static void m() {
        String str;
        Context context = f16779a;
        if (context == null) {
            return;
        }
        we.a<a> entries = a.getEntries();
        int i = 0;
        if (entries == null || !entries.isEmpty()) {
            int i10 = 0;
            for (a aVar : entries) {
                aVar.getClass();
                if (context.getApplicationContext().getSharedPreferences("scraply_funnel", 0).getBoolean(aVar.getPrefKey(), false) && (i10 = i10 + 1) < 0) {
                    m.k();
                    throw null;
                }
            }
            i = i10;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "publisher";
                    } else {
                        str = "creator";
                    }
                } else {
                    str = "maker";
                }
            } else {
                str = "starter";
            }
        } else {
            str = "visitor";
        }
        q("user_stage", str);
    }

    public static void n(String str, boolean z3) {
        j jVar = new j("ok", Boolean.valueOf(z3));
        if (str == null) {
            str = "";
        }
        i("scrap_imported", c(jVar, new j("reason", f.H(60, str))));
    }

    public static void o(String str) {
        if (l.a(f16781c, str)) {
            return;
        }
        f16781c = str;
        i("screen_view", c(new j("screen_name", str), new j("screen_class", "Scraply")));
    }

    public static void p(int i) {
        String str;
        if (i == 0) {
            str = "0";
        } else if (i <= 2) {
            str = "1_2";
        } else if (i <= 5) {
            str = "3_5";
        } else if (i <= 15) {
            str = "6_15";
        } else {
            str = "16_plus";
        }
        q("notebooks_bucket", str);
    }

    public static void q(String str, String str2) {
        String str3;
        Exception exc;
        String str4;
        if (f16780b) {
            try {
                FirebaseAnalytics h3 = h();
                if (h3 != null) {
                    if (str2 != null) {
                        try {
                            str4 = f.H(36, str2);
                        } catch (Exception e) {
                            exc = e;
                            str3 = str;
                            Log.w("Analytics", "No se pudo fijar " + str3 + ": " + exc.getMessage());
                        }
                    } else {
                        str4 = null;
                    }
                    String str5 = str4;
                    try {
                        f1 f1Var = h3.f15587a;
                        try {
                            f1Var.getClass();
                            str3 = str;
                        } catch (Exception e8) {
                            e = e8;
                            str3 = str;
                        }
                        try {
                            f1Var.e(new h1(f1Var, null, str3, str5, false, 0));
                        } catch (Exception e10) {
                            e = e10;
                            exc = e;
                            Log.w("Analytics", "No se pudo fijar " + str3 + ": " + exc.getMessage());
                        }
                    } catch (Exception e11) {
                        e = e11;
                        str3 = str;
                    }
                }
            } catch (Exception e12) {
                str3 = str;
                exc = e12;
            }
        }
    }

    public static void r(String str, String str2) {
        i("tip_jar", c(new j("stage", str), new j("tier", str2)));
    }

    public static void s(String str) {
        i("universe_notice", c(new j("action", str)));
    }
}
