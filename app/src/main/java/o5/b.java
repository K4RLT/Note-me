package o5;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.util.Log;
import ba.j;
import com.google.android.gms.internal.ads.iv1;
import com.google.android.play.core.hsdp.service.HsdpShimActivity;
import j.i0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.e;
import pb.g;
import q.x;
import qb.d;
import qb.f;
import qb.h;
import qb.i;
import qb.l;
import qb.n;
import qb.o;
import qb.p;
import qb.q;
import ya.la;
import ya.ma;
import za.c;

/* loaded from: classes.dex */
public final class b implements qb.b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21777a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f21778b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f21779c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f21780d;
    public final Object e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f21781f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f21782g;

    /* renamed from: h, reason: collision with root package name */
    public Object f21783h;

    public b(Context context, c cVar, c cVar2, boolean z3, boolean z9, boolean z10) {
        i0 i0Var;
        boolean z11 = false;
        if (z10 && (context instanceof Activity)) {
            z11 = true;
        }
        if (context instanceof Activity) {
            i0Var = new i0((Activity) context);
        } else {
            i0Var = null;
        }
        this.f21783h = null;
        this.f21780d = context;
        this.e = cVar;
        this.f21781f = cVar2;
        this.f21777a = z3;
        this.f21778b = z9;
        this.f21779c = z11;
        this.f21782g = i0Var;
    }

    public static void f(String str, pd.c cVar, HashMap hashMap, n nVar, Activity activity) {
        int a10 = la.a(activity, activity.getResources().getConfiguration().screenWidthDp);
        int b10 = la.b(activity);
        p pVar = (p) nVar;
        Activity activity2 = pVar.f23666b;
        String packageName = activity2.getPackageName();
        IBinder windowToken = activity2.getWindow().getDecorView().getWindowToken();
        if (windowToken != null) {
            o oVar = new o(pVar, str, packageName, windowToken, a10, b10, cVar, hashMap);
            l lVar = pVar.f23665a;
            if (lVar == null) {
                Log.e("HpoaClientImpl", "HPOA service is not available");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("appId", str);
            bundle.putString("callerId", packageName);
            bundle.putBinder("windowToken", windowToken);
            lVar.a(new j(29, pVar, bundle, oVar));
            return;
        }
        x.o("Window token is null, cannot open HPOA service.");
    }

    public void a(String str) {
        d dVar = (d) ((q) ((c) this.f21781f).zza());
        if (((i) dVar.f23628c.get(str)) == null) {
            Log.w("HsdpClientImpl", "No active overlay for target package: " + str + ". Please call show() first.");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("callingPackage", dVar.f23626a.getPackageName());
            bundle.putString("targetPackage", str);
            bundle.putString("sdkVersion", "2.0.0");
            bundle.putLong("requestTimestampMs", SystemClock.elapsedRealtime());
            dVar.f23627b.a(new iv1(dVar, 26, bundle));
        }
        d();
    }

    public void b(String str, String str2, pd.c cVar, HashMap hashMap, boolean z3) {
        qb.a hVar;
        c cVar2 = (c) this.e;
        Context context = (Context) this.f21780d;
        Intent b10 = ma.b(str, str2, context.getPackageName(), hashMap);
        if (this.f21778b) {
            Uri data = b10.getData();
            if (data == null) {
                Bundle bundle = new Bundle();
                bundle.putString("errorMessage", "Deeplink URL is null.");
                cVar.K(bundle);
                return;
            }
            String uri = data.toString();
            if (!(context instanceof Activity)) {
                Intent intent = new Intent(context, (Class<?>) HsdpShimActivity.class);
                intent.putExtra("target_package_name", str);
                intent.putExtra("referrer", str2);
                intent.putExtra("auto_trigger", z3);
                intent.putExtra("deeplink_url", uri);
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry : hashMap.entrySet()) {
                    bundle2.putString((String) entry.getKey(), (String) entry.getValue());
                }
                intent.putExtra("extra_query_params_bundle", bundle2);
                intent.addFlags(262144);
                intent.addFlags(268435456);
                Log.i("HsdpDeepLinkServiceImpl", "Starting HSDP Shim Activity.");
                context.startActivity(intent);
                return;
            }
            c cVar3 = (c) this.f21781f;
            Activity activity = (Activity) context;
            g gVar = (g) ((d) ((q) cVar3.zza())).f23627b.f23655k;
            if (gVar == null || !gVar.asBinder().isBinderAlive()) {
                e();
            }
            q qVar = (q) cVar3.zza();
            IBinder windowToken = activity.getWindow().getDecorView().getWindowToken();
            int a10 = la.a(activity, activity.getResources().getConfiguration().screenWidthDp);
            int b11 = la.b(activity);
            if (!this.f21779c) {
                hVar = new f(this, cVar, activity, str, str2, hashMap);
            } else {
                hVar = new h(this, cVar, activity, str, str2, hashMap);
            }
            ((d) qVar).a(str, uri, windowToken, a10, b11, z3, hVar);
            return;
        }
        Activity activity2 = (Activity) context;
        if (((i0) this.f21782g) != null) {
            b10.addFlags(536870912);
            b10.addFlags(262144);
            if (activity2.getPackageManager().resolveActivity(b10, 65536) != null) {
                e();
                Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity found.");
                activity2.startActivityForResult(b10, 0);
                f(str, cVar, hashMap, (n) cVar2.zza(), activity2);
                return;
            }
            if (this.f21777a) {
                Log.i("HsdpDeepLinkServiceImpl", "HSDP Activity not found. Ignoring error and still showing HPOA affordance.");
                f(str, cVar, hashMap, (n) cVar2.zza(), activity2);
                return;
            } else {
                activity2.startActivityForResult(ma.a(str, str2, hashMap), 0);
                return;
            }
        }
        x.o("hsdpLoadingPanel cannot be null when using activity-based HSDP.");
    }

    public void c() {
        e eVar = (e) this.f21780d;
        if (eVar.g().f1084d == androidx.lifecycle.p.f1049v) {
            if (!this.f21777a) {
                ((a1.c) this.e).invoke();
                eVar.g().a(new a(0, this));
                this.f21777a = true;
                return;
            }
            x.o("SavedStateRegistry was already attached.");
            return;
        }
        x.o("Restarter must be created only during owner's initialization stage");
    }

    public void d() {
        if (this.f21779c) {
            Context context = (Context) this.f21780d;
            i0 i0Var = (i0) this.f21782g;
            Activity activity = (Activity) context;
            if (i0Var != null) {
                i0Var.N();
                if (((qb.e) this.f21783h) != null) {
                    activity.getApplication().unregisterActivityLifecycleCallbacks((qb.e) this.f21783h);
                    this.f21783h = null;
                    return;
                }
                return;
            }
            x.o("hsdpLoadingPanel cannot be null when loading panel is enabled.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.b.e():void");
    }

    public b(e eVar, a1.c cVar) {
        this.f21780d = eVar;
        this.e = cVar;
        this.f21781f = new Object();
        this.f21782g = new LinkedHashMap();
        this.f21779c = true;
    }
}
