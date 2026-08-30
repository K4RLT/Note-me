package s9;
import r.e;
import u.c;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.cq0;
import com.google.android.gms.internal.ads.em;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.nl;
import com.google.android.gms.internal.ads.of;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.wx;
import com.google.android.gms.internal.ads.xe;
import com.google.android.gms.internal.ads.xs0;
import com.google.android.gms.internal.ads.xx;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k9.a0;
import k9.f0;
import org.json.JSONException;
import org.json.JSONObject;
import ya.zb;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25036a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f25037b;

    /* renamed from: c, reason: collision with root package name */
    public final of f25038c;

    /* renamed from: d, reason: collision with root package name */
    public final cq0 f25039d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final fe0 f25040f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f25041g;

    /* renamed from: h, reason: collision with root package name */
    public final wx f25042h = xx.f12655f;
    public final xs0 i;

    /* renamed from: j, reason: collision with root package name */
    public final p f25043j;

    /* renamed from: k, reason: collision with root package name */
    public final b f25044k;

    /* renamed from: l, reason: collision with root package name */
    public final o f25045l;

    public a(WebView webView, of ofVar, fe0 fe0Var, xs0 xs0Var, cq0 cq0Var, p pVar, b bVar, o oVar) {
        this.f25037b = webView;
        Context context = webView.getContext();
        this.f25036a = context;
        this.f25038c = ofVar;
        this.f25040f = fe0Var;
        sl.a(context);
        nl nlVar = sl.Ya;
        g9.r rVar = g9.e;
        this.e = ((Integer) rVar.f17698c.a(nlVar)).intValue();
        this.f25041g = ((Boolean) rVar.f17698c.a(sl.Za)).booleanValue();
        this.i = xs0Var;
        this.f25039d = cq0Var;
        this.f25043j = pVar;
        this.f25044k = bVar;
        this.f25045l = oVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            f9.k kVar = f9.k.C;
            kVar.f16819k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String h3 = this.f25038c.f9103b.h(this.f25036a, str, this.f25037b);
            if (this.f25041g) {
                kVar.f16819k.getClass();
                zb.d(this.f25040f, "csg", new Pair("clat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                return h3;
            }
            return h3;
        } catch (RuntimeException e) {
            int i = a0.f19634b;
            l9.i.d("Exception getting click signals. ", e);
            f9.k.C.f16817h.d("TaggingLibraryJsInterface.getClickSignals", e);
            return "";
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i) {
        if (i <= 0) {
            String f10 = a5.a.f(i, "Invalid timeout for getting click signals. Timeout=", new StringBuilder(String.valueOf(i).length() + 51));
            int i10 = a0.f19634b;
            l9.i.c(f10);
            return "";
        }
        try {
            return (String) xx.f12651a.j(new xe(this, 27, str)).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i11 = a0.f19634b;
            l9.i.d("Exception getting click signals with timeout. ", e);
            f9.k.C.f16817h.d("TaggingLibraryJsInterface.getClickSignalsWithTimeout", e);
            if (!(e instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        f0 f0Var = f9.k.C.f16813c;
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        em emVar = new em(this, uuid);
        if (((Boolean) bn.e.p()).booleanValue()) {
            this.f25043j.a(this.f25037b, emVar);
            return uuid;
        }
        if (((Boolean) g9.e.f17698c.a(sl.f10670bb)).booleanValue()) {
            this.f25042h.execute(new qb.s(1, this, bundle, emVar));
            return uuid;
        }
        c.g(this.f25036a, new z8.g((z8.f) new c1.a(6).g(bundle)), emVar);
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            f9.k kVar = f9.k.C;
            kVar.f16819k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String i = this.f25038c.f9103b.i(this.f25036a, this.f25037b, null);
            if (this.f25041g) {
                kVar.f16819k.getClass();
                zb.d(this.f25040f, "vsg", new Pair("vlat", String.valueOf(System.currentTimeMillis() - currentTimeMillis)));
                return i;
            }
            return i;
        } catch (RuntimeException e) {
            int i10 = a0.f19634b;
            l9.i.d("Exception getting view signals. ", e);
            f9.k.C.f16817h.d("TaggingLibraryJsInterface.getViewSignals", e);
            return "";
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            String f10 = a5.a.f(i, "Invalid timeout for getting view signals. Timeout=", new StringBuilder(String.valueOf(i).length() + 50));
            int i10 = a0.f19634b;
            l9.i.c(f10);
            return "";
        }
        try {
            return (String) xx.f12651a.j(new c7.t(5, this)).get(Math.min(i, this.e), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i11 = a0.f19634b;
            l9.i.d("Exception getting view signals with timeout. ", e);
            f9.k.C.f16817h.d("TaggingLibraryJsInterface.getViewSignalsWithTimeout", e);
            if (!(e instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (((Boolean) g9.e.f17698c.a(sl.db)).booleanValue() && !TextUtils.isEmpty(str)) {
            xx.f12651a.execute(new iv1(this, 28, str));
        }
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt("x");
            int i11 = jSONObject.getInt("y");
            int i12 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i13 = jSONObject.getInt("type");
            if (i13 != 0) {
                i = 1;
                if (i13 != 1) {
                    i = 2;
                    if (i13 != 2) {
                        i = 3;
                        if (i13 != 3) {
                            i = -1;
                        }
                    }
                }
            } else {
                i = 0;
            }
            try {
                this.f25038c.f9103b.b(MotionEvent.obtain(0L, i12, i, i10, i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException e) {
                e = e;
                int i14 = a0.f19634b;
                l9.i.d("Failed to parse the touch string. ", e);
                f9.k.C.f16817h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
            } catch (JSONException e8) {
                e = e8;
                int i142 = a0.f19634b;
                l9.i.d("Failed to parse the touch string. ", e);
                f9.k.C.f16817h.d("TaggingLibraryJsInterface.reportTouchEvent", e);
            }
        } catch (RuntimeException | JSONException e10) {
            e = e10;
        }
    }
}
