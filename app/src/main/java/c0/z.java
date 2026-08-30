package c0;
import a0.k;
import r.e;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.bj0;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.gms.internal.ads.o21;
import com.google.android.gms.internal.ads.q21;
import com.google.android.gms.internal.ads.r1;
import com.google.android.gms.internal.ads.s21;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.v21;
import com.google.android.gms.internal.ads.xx;
import com.google.android.gms.internal.ads.zq0;
import com.google.android.gms.internal.mlkit_vision_digital_ink.pw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ra;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class z implements fa.d {

    /* renamed from: u, reason: collision with root package name */
    public boolean f3436u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3437v;

    /* renamed from: w, reason: collision with root package name */
    public Object f3438w;

    /* renamed from: x, reason: collision with root package name */
    public Object f3439x;

    /* renamed from: y, reason: collision with root package name */
    public Object f3440y = new c7.i0(this, true);

    /* renamed from: z, reason: collision with root package name */
    public Object f3441z = new c7.i0(this, false);

    public z(Context context, c7.l lVar, pw pwVar) {
        this.f3437v = context;
        this.f3438w = lVar;
        this.f3439x = pwVar;
    }

    @Override // fa.d
    public void a(ca.b bVar) {
        ((ea.d) this.f3441z).G.post(new iv1(6, this, bVar, false));
    }

    public synchronized boolean b() {
        boolean z3;
        Boolean bool = (Boolean) this.f3439x;
        if (bool != null) {
            z3 = bool.booleanValue();
        } else {
            try {
                z3 = ((bc.g) this.f3437v).h();
            } catch (IllegalStateException unused) {
                z3 = false;
            }
        }
        c(z3);
        return z3;
    }

    public void c(boolean z3) {
        String str;
        String str2;
        if (z3) {
            str = "ENABLED";
        } else {
            str = "DISABLED";
        }
        if (((Boolean) this.f3439x) == null) {
            str2 = "global Firebase setting";
        } else if (this.f3436u) {
            str2 = "firebase_crashlytics_collection_enabled manifest flag";
        } else {
            str2 = "API";
        }
        String h3 = a5.a.h("Crashlytics automatic data collection ", str, " by ", str2, ".");
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", h3, null);
        }
    }

    public void d(ca.b bVar) {
        ea.l lVar = (ea.l) ((ea.d) this.f3441z).D.get((ea.a) this.f3438w);
        if (lVar != null) {
            lVar.m(bVar);
        }
    }

    public synchronized boolean e(Context context) {
        if (!v21.a(context)) {
            return false;
        }
        try {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            this.f3440y = new zq0(6, new s21(context));
        } catch (NullPointerException e) {
            k9.k("Error connecting LMD Overlay service");
            f9.k.C.f16817h.d("LastMileDeliveryOverlay.bindLastMileDeliveryService", e);
        }
        if (((zq0) this.f3440y) == null) {
            this.f3436u = false;
            return false;
        }
        if (((z5.h) this.f3441z) == null) {
            this.f3441z = new z5.h(25, this);
        }
        this.f3436u = true;
        return true;
    }

    public void f(h00 h00Var, o21 o21Var) {
        String str = o21Var.f8927b;
        if (h00Var == null) {
            g("adWebview missing", "onLMDShow");
            return;
        }
        this.f3439x = h00Var;
        if (!this.f3436u && !e(h00Var.getContext())) {
            g("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) g9.e.f17698c.a(sl.Vc)).booleanValue()) {
            this.f3438w = str;
        }
        if (((z5.h) this.f3441z) == null) {
            this.f3441z = new z5.h(25, this);
        }
        zq0 zq0Var = (zq0) this.f3440y;
        if (zq0Var != null) {
            z5.h hVar = (z5.h) this.f3441z;
            s21 s21Var = (s21) zq0Var.f13255v;
            bj0 bj0Var = s21Var.f10469a;
            if (bj0Var == null) {
                s21.f10467c.d("error: %s", "Play Store not found.");
            } else if (s21.c(hVar, "Failed to apply OverlayDisplayShowRequest: missing appId and sessionToken.", Arrays.asList(null, str))) {
                bj0Var.a(new ra(bj0Var, 28, new r1(12, s21Var, o21Var, hVar)));
            }
        }
    }

    public void g(String str, String str2) {
        k9.k(str);
        if (((h00) this.f3439x) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            h(hashMap, "onError");
        }
    }

    public void h(HashMap hashMap, String str) {
        xx.f12655f.execute(new ba.j(23, this, str, hashMap));
    }

    public q21 i() {
        String str;
        String str2 = null;
        if (((Boolean) g9.e.f17698c.a(sl.Vc)).booleanValue() && !TextUtils.isEmpty((String) this.f3438w)) {
            str = (String) this.f3438w;
        } else {
            String str3 = (String) this.f3437v;
            if (str3 != null) {
                str2 = str3;
                str = null;
            } else {
                g("Missing session token and/or appId", "onLMDupdate");
                str = null;
            }
        }
        return new q21(str2, str);
    }
}
