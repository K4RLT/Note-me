package ba;
import c.b;
import c.j;
import p.a;
import q.b;
import q.c;
import q.d;
import q.l;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.datastore.preferences.protobuf.s1;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import b0.e1;
import b8.l2;
import c0.z;
import c4.s;
import c7.b0;
import c7.e0;
import com.google.android.gms.internal.ads.gl;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.ads.ou1;
import com.google.android.gms.internal.ads.pu1;
import com.google.android.gms.internal.consent_sdk.a6;
import com.google.android.gms.internal.consent_sdk.d7;
import com.google.android.gms.internal.measurement.b3;
import com.google.android.gms.internal.measurement.c3;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.j2;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.v;
import com.google.android.gms.internal.measurement.y2;
import com.google.android.gms.internal.measurement.z2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.d2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.e2;
import com.google.android.gms.internal.mlkit_vision_digital_ink.fb;
import com.google.android.gms.internal.mlkit_vision_digital_ink.j1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.lw;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ml;
import com.google.android.gms.internal.mlkit_vision_digital_ink.n5;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ox;
import com.google.android.gms.internal.mlkit_vision_digital_ink.p1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.q1;
import com.google.android.gms.internal.mlkit_vision_digital_ink.ul;
import com.google.android.play.core.assetpacks.bn;
import eb.d0;
import eb.d1;
import eb.f1;
import eb.h3;
import eb.i2;
import eb.k0;
import eb.k3;
import eb.l3;
import eb.n1;
import eb.n2;
import eb.o3;
import eb.t;
import eb.u;
import eb.u0;
import eb.w2;
import eb.y0;
import fa.y;
import j.m0;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import lb.r1;
import lb.t1;
import lb.w0;
import org.json.JSONException;
import org.json.JSONObject;
import wa.h8;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f3133u;

    /* renamed from: v, reason: collision with root package name */
    public Object f3134v;

    /* renamed from: w, reason: collision with root package name */
    public Object f3135w;

    /* renamed from: x, reason: collision with root package name */
    public Object f3136x;

    public j(i2 i2Var, String str, URL url, pd.c cVar) {
        this.f3133u = 17;
        this.f3136x = i2Var;
        y.e(str);
        this.f3134v = url;
        this.f3135w = cVar;
    }

    private final void a() {
        boolean i;
        n2 n2Var;
        synchronized (((AtomicReference) this.f3134v)) {
            try {
                try {
                    i = ((n2) this.f3136x).s().F().i(n1.ANALYTICS_STORAGE);
                    n2Var = (n2) this.f3136x;
                } catch (RemoteException e) {
                    ((n2) this.f3136x).f().A.f(e, "Failed to get app instance id");
                }
                if (!i) {
                    n2Var.f().F.g("Analytics storage consent denied; will not get app instance id");
                    ((n2) this.f3136x).v().b0(null);
                    ((n2) this.f3136x).s().C.j(null);
                    ((AtomicReference) this.f3134v).set(null);
                    return;
                }
                d0 d0Var = n2Var.f16280y;
                if (d0Var == null) {
                    n2Var.f().A.g("Failed to get app instance id");
                    return;
                }
                ((AtomicReference) this.f3134v).set(d0Var.r1((o3) this.f3135w));
                String str = (String) ((AtomicReference) this.f3134v).get();
                if (str != null) {
                    ((n2) this.f3136x).v().b0(str);
                    ((n2) this.f3136x).s().C.j(str);
                }
                ((n2) this.f3136x).O();
                ((AtomicReference) this.f3134v).notify();
            } finally {
                ((AtomicReference) this.f3134v).notify();
            }
        }
    }

    public void b(int i, IOException iOException, byte[] bArr, Map map) {
        y0 h3 = ((i2) this.f3136x).h();
        ml mlVar = new ml(1);
        mlVar.f14667w = this;
        mlVar.f14666v = i;
        mlVar.f14668x = iOException;
        mlVar.f14669y = bArr;
        h3.D(mlVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v21 */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        ib.o d2;
        JSONObject jSONObject;
        t tVar;
        j2 j2Var;
        boolean z3;
        HttpURLConnection httpURLConnection;
        Map<String, List<String>> map;
        int i10 = 5;
        long j10 = 0;
        int i11 = 22;
        int i12 = 2;
        Integer num = 0;
        Object obj = null;
        v vVar = null;
        Bundle bundle = null;
        int i13 = 0;
        boolean z9 = true;
        switch (this.f3133u) {
            case 0:
                a aVar = (a) this.f3135w;
                Intent intent = aVar.f3113u;
                String stringExtra = intent.getStringExtra("google.message_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("message_id");
                }
                if (TextUtils.isEmpty(stringExtra)) {
                    d2 = h8.e(null);
                } else {
                    Bundle bundle2 = new Bundle();
                    Intent intent2 = aVar.f3113u;
                    String stringExtra2 = intent2.getStringExtra("google.message_id");
                    if (stringExtra2 == null) {
                        stringExtra2 = intent2.getStringExtra("message_id");
                    }
                    bundle2.putString("google.message_id", stringExtra2);
                    Intent intent3 = aVar.f3113u;
                    if (intent3.hasExtra("google.product_id")) {
                        num = Integer.valueOf(intent3.getIntExtra("google.product_id", 0));
                    }
                    if (num != 0) {
                        bundle2.putInt("google.product_id", num.intValue());
                    }
                    Context context = (Context) this.f3134v;
                    bundle2.putBoolean("supports_message_handled", true);
                    q c10 = c(context);
                    synchronized (c10) {
                        i = c10.f3157u;
                        c10.f3157u = i + 1;
                    }
                    d2 = c10.d(new o(i, 2, bundle2, 0));
                }
                d2.c(h.f3129v, new i((CountDownLatch) this.f3136x));
                return;
            case 1:
                c7.c cVar = (c7.c) this.f3134v;
                c7.g gVar = (c7.g) this.f3135w;
                c7.a aVar2 = (c7.a) this.f3136x;
                c7.f fVar = e0.f3938k;
                cVar.B(24, 4, fVar);
                gVar.a(fVar, aVar2.f3896v);
                return;
            case 2:
                b0.N((b0) this.f3134v, (pd.c) this.f3135w, (c7.j) this.f3136x);
                return;
            case 3:
                b0.M((b0) this.f3134v, (c7.a) this.f3135w, (c7.g) this.f3136x);
                return;
            case 4:
                b0.L((b0) this.f3134v, (s) this.f3135w, (s1) this.f3136x);
                return;
            case 5:
                String str = (String) this.f3134v;
                if (TextUtils.isEmpty(str)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                String str2 = (String) this.f3135w;
                String lowerCase = str.toLowerCase();
                if (TextUtils.isEmpty(str2)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str2);
                    } catch (JSONException unused) {
                        Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: failed to parse args: " + str2);
                        return;
                    }
                }
                com.google.android.gms.internal.consent_sdk.e0[] e0VarArr = (com.google.android.gms.internal.consent_sdk.e0[]) this.f3136x;
                Log.d("UserMessagingPlatform", "Action[" + lowerCase + "]: " + jSONObject.toString());
                while (i13 < e0VarArr.length) {
                    com.google.android.gms.internal.consent_sdk.e0 e0Var = e0VarArr[i13];
                    FutureTask futureTask = new FutureTask(new c7.r(i10, e0Var, lowerCase, jSONObject));
                    e0Var.mo192zza().execute(futureTask);
                    try {
                    } catch (InterruptedException e) {
                        Log.d("UserMessagingPlatform", "Thread interrupted for Action[" + lowerCase + "]: ", e);
                    } catch (ExecutionException e8) {
                        Log.d("UserMessagingPlatform", a.k("Failed to run Action[", lowerCase, "]: "), e8.getCause());
                    }
                    if (!((Boolean) futureTask.get()).booleanValue()) {
                        i13++;
                    } else {
                        return;
                    }
                }
                return;
            case 6:
                lw lwVar = (lw) this.f3134v;
                e7.c cVar2 = (e7.c) this.f3135w;
                r rVar = (r) this.f3136x;
                ((Handler) lwVar.f14644v).post(new com.google.android.gms.internal.consent_sdk.h(i12, cVar2));
                if (rVar.f3162v != 2) {
                    com.google.android.gms.internal.consent_sdk.n nVar = (com.google.android.gms.internal.consent_sdk.n) lwVar.f14647y;
                    com.google.android.gms.internal.consent_sdk.o oVar = (com.google.android.gms.internal.consent_sdk.o) nVar.f13496c.get();
                    if (oVar == null) {
                        Log.e("UserMessagingPlatform", "Failed to load and cache a form due to null consent form resources.");
                        return;
                    }
                    com.google.android.gms.internal.consent_sdk.b bVar = (com.google.android.gms.internal.consent_sdk.b) nVar.f13494a.zzb();
                    bVar.getClass();
                    com.google.android.gms.internal.consent_sdk.c cVar3 = bVar.f13361u;
                    d7 a10 = d7.a(new a6(4, (a6) cVar3.f13372w));
                    a6 a6Var = new a6(8, oVar);
                    a6 a6Var2 = new a6(7);
                    a6 a6Var3 = (a6) cVar3.f13372w;
                    d7 d7Var = (d7) cVar3.A;
                    com.google.android.gms.internal.consent_sdk.f fVar2 = (com.google.android.gms.internal.consent_sdk.f) cVar3.D;
                    d7 d7Var2 = (d7) cVar3.f13373x;
                    d7 a11 = d7.a(new m0(a6Var3, (d7) cVar3.f13374y, a10, d7Var2, a6Var, new com.google.android.gms.internal.consent_sdk.m(a10, new g9.n(a6Var3, a10, d7Var, fVar2, a6Var2, d7Var2, 1)), (d7) cVar3.B));
                    if (((d7) a6Var2.f13354v) == null) {
                        a6Var2.f13354v = a11;
                        com.google.android.gms.internal.consent_sdk.k kVar = (com.google.android.gms.internal.consent_sdk.k) a6Var2.zzb();
                        kVar.f13471m = true;
                        com.google.android.gms.internal.consent_sdk.d0.f13387a.post(new com.google.android.gms.internal.consent_sdk.l(nVar, i13, kVar));
                        return;
                    }
                    g5.l();
                    return;
                }
                return;
            case 7:
                g9.n nVar2 = (g9.n) this.f3134v;
                fb fbVar = (fb) this.f3135w;
                j1 j1Var = (j1) this.f3136x;
                try {
                    Object r8 = n5.r(fbVar);
                    fb fbVar2 = (fb) nVar2.A;
                    fbVar2.n(r8);
                    j1Var.f(fbVar2);
                    return;
                } catch (Throwable unused2) {
                    j1Var.f(fbVar);
                    return;
                }
            case 8:
                if (((kotlin.jvm.internal.y) this.f3134v).f19787u == null) {
                    e2 e2Var = (e2) this.f3135w;
                    Runnable runnable = (Runnable) this.f3136x;
                    d2 a12 = q1.a();
                    e2 c11 = q1.c(a12, e2Var);
                    try {
                        runnable.run();
                        return;
                    } catch (Throwable th) {
                        try {
                            p1.a(th);
                            throw th;
                        } finally {
                            q1.c(a12, c11);
                        }
                    }
                }
                g5.b();
                return;
            case 9:
                ul ulVar = (ul) this.f3134v;
                File file = (File) this.f3135w;
                String str3 = (String) this.f3136x;
                com.google.android.gms.internal.mlkit_vision_digital_ink.c cVar4 = ulVar.f15059b;
                synchronized (cVar4) {
                    HashMap hashMap = cVar4.f14134f;
                    String b10 = com.google.android.gms.internal.mlkit_vision_digital_ink.b(file, str3);
                    ox oxVar = (ox) hashMap.get(b10);
                    if (oxVar != null) {
                        synchronized (oxVar) {
                            oxVar.f14776j = true;
                        }
                    } else {
                        Log.v("c", "Attempted to setCanceled unknown request: ".concat(b10));
                    }
                    com.google.android.gms.internal.mlkit_vision_digital_ink.c.j((HttpURLConnection) cVar4.f14135g.get(b10));
                    if (oxVar != null) {
                        cVar4.f();
                    }
                }
                return;
            case 10:
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.f3136x;
                Context context2 = (Context) this.f3134v;
                Intent intent4 = (Intent) this.f3135w;
                try {
                    boolean booleanExtra = intent4.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = intent4.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = intent4.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = intent4.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    a6.d().a(ConstraintProxyUpdateReceiver.f1116a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                    k6.m.a(context2, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    k6.m.a(context2, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    k6.m.a(context2, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    k6.m.a(context2, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    pendingResult.finish();
                }
            case 11:
                ea.e eVar = (ea.e) this.f3134v;
                e1 e1Var = (e1) this.f3136x;
                if (e1Var.f1179b > 0) {
                    Bundle bundle3 = (Bundle) e1Var.f1181d;
                    if (bundle3 != null) {
                        bundle = bundle3.getBundle((String) this.f3135w);
                    }
                    eVar.c(bundle);
                }
                if (e1Var.f1179b >= 2) {
                    eVar.f();
                }
                if (e1Var.f1179b >= 3) {
                    eVar.d();
                }
                if (e1Var.f1179b >= 4) {
                    eVar.g();
                    return;
                }
                return;
            case 12:
                f1 f1Var = (f1) this.f3134v;
                String str4 = (String) this.f3135w;
                Bundle bundle4 = (Bundle) this.f3136x;
                eb.i iVar = f1Var.f16128u.f16171w;
                h3.t(iVar);
                iVar.u();
                iVar.y();
                d1 d1Var = (d1) iVar.f3443v;
                y.e(str4);
                y.e("dep");
                TextUtils.isEmpty("");
                if (bundle4 != null && !bundle4.isEmpty()) {
                    Bundle bundle5 = new Bundle(bundle4);
                    Iterator<String> it = bundle5.keySet().iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        if (next == null) {
                            k0 k0Var = d1Var.C;
                            d1.d(k0Var);
                            k0Var.A.g("Param name can't be null");
                            it.remove();
                        } else {
                            l3 l3Var = d1Var.F;
                            d1.b(l3Var);
                            Object r02 = l3Var.r0(bundle5.get(next), next);
                            if (r02 == null) {
                                k0 k0Var2 = d1Var.C;
                                d1.d(k0Var2);
                                k0Var2.D.f(d1Var.G.f(next), "Param value can't be null");
                                it.remove();
                            } else {
                                l3 l3Var2 = d1Var.F;
                                d1.b(l3Var2);
                                l3Var2.P(bundle5, next, r02);
                            }
                        }
                    }
                    tVar = new t(bundle5);
                } else {
                    tVar = new t(new Bundle());
                }
                Bundle bundle6 = tVar.f16371u;
                eb.m0 v2 = iVar.v();
                y2 C = z2.C();
                C.b();
                z2.z(0L, (z2) C.f13639v);
                for (String str5 : bundle6.keySet()) {
                    b3 D = c3.D();
                    D.e(str5);
                    Object obj2 = bundle6.get(str5);
                    y.h(obj2);
                    v2.V(D, obj2);
                    C.d(D);
                }
                byte[] c12 = ((z2) C.a()).c();
                iVar.f().I.h("Saving default event parameters, appId, data size", d1Var.G.c(str4), Integer.valueOf(c12.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str4);
                contentValues.put("parameters", c12);
                try {
                    if (iVar.B().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        iVar.f().A.f(k0.y(str4), "Failed to insert default event parameters (got -1). appId");
                        return;
                    }
                    return;
                } catch (SQLiteException e10) {
                    iVar.f().A.h("Error storing default event parameters. appId", k0.y(str4), e10);
                    return;
                }
            case 13:
                o3 o3Var = (o3) this.f3135w;
                h3 h3Var = ((f1) this.f3136x).f16128u;
                h3Var.Z();
                eb.d dVar = (eb.d) this.f3134v;
                if (dVar.f16095w.zza() == null) {
                    h3Var.p(dVar, o3Var);
                    return;
                } else {
                    h3Var.H(dVar, o3Var);
                    return;
                }
            case 14:
                h3 h3Var2 = ((f1) this.f3136x).f16128u;
                h3Var2.Z();
                h3Var2.r((u) this.f3134v, (String) this.f3135w);
                return;
            case 15:
                f1 f1Var2 = (f1) this.f3136x;
                h3 h3Var3 = f1Var2.f16128u;
                u uVar = (u) this.f3134v;
                String str6 = uVar.f16380u;
                t tVar2 = uVar.f16381v;
                if ("_cmp".equals(str6) && tVar2 != null) {
                    Bundle bundle7 = tVar2.f16371u;
                    if (bundle7.size() != 0) {
                        String string = bundle7.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            h3Var3.f().G.f(uVar.toString(), "Event has been filtered ");
                            uVar = new u("_cmpx", uVar.f16381v, uVar.f16382w, uVar.f16383x);
                        }
                    }
                }
                String str7 = uVar.f16380u;
                o3 o3Var2 = (o3) this.f3135w;
                u0 u0Var = h3Var3.f16169u;
                eb.m0 m0Var = h3Var3.A;
                h3.t(u0Var);
                String str8 = o3Var2.f16288u;
                if (!TextUtils.isEmpty(str8) && (j2Var = (j2) u0Var.C.get(str8)) != null && j2Var.p() != 0) {
                    h3Var3.f().I.f(str8, "EES config found for");
                    u0 u0Var2 = h3Var3.f16169u;
                    h3.t(u0Var2);
                    if (!TextUtils.isEmpty(str8)) {
                        vVar = (v) u0Var2.E.c(str8);
                    }
                    if (vVar == null) {
                        h3Var3.f().I.f(str8, "EES not loaded for");
                        f1Var2.o1(uVar, o3Var2);
                        return;
                    }
                    try {
                        h3.t(m0Var);
                        HashMap P = eb.m0.P(true, uVar.f16381v.b());
                        String c13 = eb.q1.c(str7, eb.q1.f16327g, eb.q1.e);
                        if (c13 == null) {
                            c13 = str7;
                        }
                        z3 = vVar.b(new com.google.android.gms.internal.measurement.c(c13, uVar.f16383x, P));
                    } catch (j0 unused3) {
                        h3Var3.f().A.h("EES error. appId, eventName", o3Var2.f16289v, str7);
                        z3 = false;
                    }
                    if (!z3) {
                        h3Var3.f().I.f(str7, "EES was not applied to event");
                        f1Var2.o1(uVar, o3Var2);
                        return;
                    }
                    ra.e eVar2 = vVar.f13943c;
                    if (!((com.google.android.gms.internal.measurement.c) eVar2.f24676w).equals((com.google.android.gms.internal.measurement.c) eVar2.f24675v)) {
                        h3Var3.f().I.f(str7, "EES edited event");
                        h3.t(m0Var);
                        f1Var2.o1(eb.m0.I((com.google.android.gms.internal.measurement.c) vVar.f13943c.f24676w), o3Var2);
                    } else {
                        f1Var2.o1(uVar, o3Var2);
                    }
                    if (!((ArrayList) vVar.f13943c.f24677x).isEmpty()) {
                        ArrayList arrayList = (ArrayList) vVar.f13943c.f24677x;
                        int size = arrayList.size();
                        while (i13 < size) {
                            Object obj3 = arrayList.get(i13);
                            i13++;
                            com.google.android.gms.internal.measurement.c cVar5 = (com.google.android.gms.internal.measurement.c) obj3;
                            h3Var3.f().I.f(cVar5.f13664a, "EES logging created event");
                            h3.t(m0Var);
                            f1Var2.o1(eb.m0.I(cVar5), o3Var2);
                        }
                        return;
                    }
                    return;
                }
                f1Var2.o1(uVar, o3Var2);
                return;
            case 16:
                o3 o3Var3 = (o3) this.f3135w;
                h3 h3Var4 = ((f1) this.f3136x).f16128u;
                h3Var4.Z();
                k3 k3Var = (k3) this.f3134v;
                if (k3Var.zza() == null) {
                    h3Var4.x(k3Var.f16212v, o3Var3);
                    return;
                } else {
                    h3Var4.u(k3Var, o3Var3);
                    return;
                }
            case 17:
                y0 y0Var = ((d1) ((i2) this.f3136x).f3443v).D;
                d1.d(y0Var);
                y0Var.G();
                try {
                    URL url = (URL) this.f3134v;
                    synchronized (o0.class) {
                    }
                    URLConnection openConnection = url.openConnection();
                    if (openConnection instanceof HttpURLConnection) {
                        httpURLConnection = (HttpURLConnection) openConnection;
                        httpURLConnection.setDefaultUseCaches(false);
                        httpURLConnection.setConnectTimeout(60000);
                        httpURLConnection.setReadTimeout(61000);
                        httpURLConnection.setInstanceFollowRedirects(false);
                        httpURLConnection.setDoInput(true);
                        try {
                            i13 = httpURLConnection.getResponseCode();
                            map = httpURLConnection.getHeaderFields();
                            try {
                                byte[] y10 = i2.y(httpURLConnection);
                                httpURLConnection.disconnect();
                                b(i13, null, y10, map);
                                return;
                            } catch (IOException e11) {
                                e = e11;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                b(i13, e, null, map);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                b(i13, null, null, map);
                                throw th;
                            }
                        } catch (IOException e12) {
                            e = e12;
                            map = null;
                        } catch (Throwable th3) {
                            th = th3;
                            map = null;
                        }
                    } else {
                        throw new IOException("Failed to obtain HTTP connection");
                    }
                } catch (IOException e13) {
                    e = e13;
                    httpURLConnection = null;
                    map = null;
                } catch (Throwable th4) {
                    th = th4;
                    httpURLConnection = null;
                    map = null;
                }
            case 18:
                o3 o3Var4 = (o3) this.f3134v;
                t0 t0Var = (t0) this.f3135w;
                n2 n2Var = (n2) this.f3136x;
                try {
                    if (!n2Var.s().F().i(n1.ANALYTICS_STORAGE)) {
                        n2Var.f().F.g("Analytics storage consent denied; will not get app instance id");
                        n2Var.v().b0(null);
                        n2Var.s().C.j(null);
                        return;
                    }
                    d0 d0Var = n2Var.f16280y;
                    if (d0Var == null) {
                        n2Var.f().A.g("Failed to get app instance id");
                        return;
                    }
                    String r12 = d0Var.r1(o3Var4);
                    if (r12 != null) {
                        n2Var.v().b0(r12);
                        n2Var.s().C.j(r12);
                    }
                    n2Var.O();
                    n2Var.t().a0(r12, t0Var);
                    return;
                } catch (RemoteException e14) {
                    n2Var.f().A.f(e14, "Failed to get app instance id");
                    return;
                } finally {
                    n2Var.t().a0(null, t0Var);
                }
            case 19:
                a();
                return;
            case 20:
                o3 o3Var5 = (o3) this.f3134v;
                n2 n2Var2 = (n2) this.f3136x;
                d0 d0Var2 = n2Var2.f16280y;
                if (d0Var2 == null) {
                    n2Var2.f().A.g("Failed to send default event parameters to service");
                    return;
                }
                try {
                    d0Var2.mo226q0((Bundle) this.f3135w, o3Var5);
                    return;
                } catch (RemoteException e15) {
                    n2Var2.f().A.f(e15, "Failed to send default event parameters to service");
                    return;
                }
            case gl.zzm /* 21 */:
                z5.h hVar = (z5.h) this.f3134v;
                k0 k0Var3 = (k0) this.f3135w;
                JobParameters jobParameters = (JobParameters) this.f3136x;
                k0Var3.I.g("AppMeasurementJobService processed last upload request.");
                ((w2) ((Service) hVar.f31922v)).b(jobParameters);
                return;
            case 22:
                pf.l lVar = (pf.l) this.f3134v;
                try {
                    pf.b0.C(lVar.f22766y.N(te.d.f25706u), new l2((g5.v) this.f3135w, lVar, (b5.a) this.f3136x, (te.c) null, 8));
                    return;
                } catch (Throwable th5) {
                    lVar.i(th5);
                    return;
                }
            case 23:
                z zVar = (z) this.f3134v;
                String str9 = (String) this.f3135w;
                HashMap hashMap2 = (HashMap) this.f3136x;
                h00 h00Var = (h00) zVar.f3439x;
                if (h00Var != null) {
                    h00Var.b(str9, hashMap2);
                    return;
                }
                return;
            case 24:
                ((b6.h) this.f3134v).h((b6.n) this.f3135w, (ra.e) this.f3136x);
                return;
            case 25:
                lb.s sVar = (lb.s) this.f3134v;
                Bundle bundle8 = (Bundle) this.f3135w;
                bn bnVar = (bn) this.f3136x;
                lb.t0 t0Var2 = sVar.f20263g;
                t0Var2.getClass();
                if (((Boolean) t0Var2.b(new j6.s(t0Var2, 14, bundle8))).booleanValue()) {
                    sVar.f20267l.post(new ou1(sVar, i11, bnVar));
                    ((t1) sVar.f20268m.b()).f();
                    return;
                }
                return;
            case 26:
                w0 w0Var = (w0) this.f3134v;
                ArrayList arrayList2 = (ArrayList) this.f3135w;
                ib.h hVar2 = (ib.h) this.f3136x;
                HashMap hashMap3 = new HashMap();
                int size2 = arrayList2.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj4 = arrayList2.get(i14);
                    i14++;
                    String str10 = (String) obj4;
                    try {
                        bn l10 = w0Var.l(1, str10);
                        j10 += l10.e;
                        hashMap3.put(str10, l10);
                    } catch (ob.a e16) {
                        hVar2.a(e16);
                        return;
                    }
                }
                long j11 = j10;
                int size3 = arrayList2.size();
                while (i13 < size3) {
                    Object obj5 = arrayList2.get(i13);
                    i13++;
                    String str11 = (String) obj5;
                    try {
                        int andIncrement = w0.i.getAndIncrement();
                        w0Var.k(str11, andIncrement, 1);
                        w0Var.k(str11, andIncrement, 2);
                        w0Var.k(str11, andIncrement, 3);
                    } catch (ob.a e17) {
                        hVar2.a(e17);
                        return;
                    }
                }
                hVar2.b(new lb.z(j11, hashMap3));
                return;
            case 27:
                r1 r1Var = (r1) this.f3134v;
                String str12 = (String) this.f3135w;
                ib.h hVar3 = (ib.h) this.f3136x;
                lb.v vVar2 = r1Var.f20250a;
                if (vVar2.c(str12).exists()) {
                    z9 = lb.v.h(vVar2.c(str12));
                }
                if (z9) {
                    hVar3.b(null);
                    ((t1) r1Var.i.b()).d(str12);
                    return;
                } else {
                    hVar3.a(new IOException(a.k("Failed to remove pack ", str12, ".")));
                    return;
                }
            case 28:
                try {
                    obj = ((m3.d) this.f3134v).call();
                } catch (Exception unused4) {
                }
                ((Handler) this.f3136x).post(new pu1((c7.v) this.f3135w, i11, obj));
                return;
            default:
                Bundle bundle9 = (Bundle) this.f3135w;
                qb.p pVar = (qb.p) this.f3134v;
                qb.o oVar2 = (qb.o) this.f3136x;
                try {
                    qb.l lVar2 = pVar.f23665a;
                    if (lVar2 != null) {
                        pb.d dVar2 = (pb.d) lVar2.f23655k;
                        if (dVar2 != null) {
                            pb.b bVar2 = (pb.b) dVar2;
                            Parcel o12 = bVar2.o1();
                            int i15 = za.a.f32013a;
                            o12.writeInt(1);
                            bundle9.writeToParcel(o12, 0);
                            o12.writeStrongBinder(oVar2);
                            bVar2.z1(o12, 1);
                            return;
                        }
                        return;
                    }
                    throw null;
                } catch (RemoteException e18) {
                    Log.e("HpoaClientImpl", "Failed to call hpoaService.startSession", e18);
                    return;
                }
        }
    }

    public String toString() {
        switch (this.f3133u) {
            case 8:
                return "propagating=[" + ((Runnable) this.f3136x) + "]";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j(int i, Object obj, Object obj2, Object obj3) {
        this.f3133u = i;
        this.f3134v = obj;
        this.f3135w = obj2;
        this.f3136x = obj3;
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i, boolean z3) {
        this.f3133u = i;
        this.f3134v = obj2;
        this.f3135w = obj3;
        this.f3136x = obj;
    }

    public /* synthetic */ j(int i) {
        this.f3133u = i;
    }

    public j(b6.h hVar, b6.n nVar, ra.e eVar) {
        this.f3133u = 24;
        hVar.getClass();
        this.f3134v = hVar;
        this.f3135w = nVar;
        this.f3136x = eVar;
    }

    public j(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
        this.f3133u = 10;
        this.f3135w = intent;
        this.f3134v = context;
        this.f3136x = pendingResult;
    }
}
