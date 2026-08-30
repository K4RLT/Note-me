package com.google.android.gms.internal.ads;
import g9.r;
import k9.a0;
import l9.i;
import r.e;
import s1.b;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class od0 {

    /* renamed from: a, reason: collision with root package name */
    public final hq0 f9099a;

    /* renamed from: b, reason: collision with root package name */
    public final nd0 f9100b;

    public od0(hq0 hq0Var, nd0 nd0Var) {
        this.f9099a = hq0Var;
        this.f9100b = nd0Var;
    }

    public final iq0 a(String str, JSONObject jSONObject) {
        xr o10;
        nd0 nd0Var = this.f9100b;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                o10 = new ks(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                o10 = new ks(new zzbym());
            } else {
                vr vrVar = (vr) ((AtomicReference) this.f9099a.f6874x).get();
                if (vrVar != null) {
                    if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                        try {
                            String string = jSONObject.getString("class_name");
                            if (vrVar.t(string)) {
                                o10 = vrVar.o("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                            } else if (vrVar.C(string)) {
                                o10 = vrVar.o(string);
                            } else {
                                o10 = vrVar.o("com.google.ads.mediation.customevent.CustomEventAdapter");
                            }
                        } catch (JSONException e) {
                            int i = k9.a0.f19634b;
                            l9.i.d("Invalid custom event.", e);
                        }
                    }
                    o10 = vrVar.o(str);
                } else {
                    int i10 = k9.a0.f19634b;
                    l9.i.f("Unexpected call to adapter creator.");
                    throw new RemoteException();
                }
            }
            iq0 iq0Var = new iq0(o10);
            nd0Var.a(str, iq0Var);
            return iq0Var;
        } catch (Throwable th) {
            if (((Boolean) g9.r.e.f17698c.a(sl.Ha)).booleanValue()) {
                nd0Var.a(str, null);
            }
            throw new Exception(th);
        }
    }

    public final zs b(String str) {
        vr vrVar = (vr) ((AtomicReference) this.f9099a.f6874x).get();
        if (vrVar != null) {
            zs H = vrVar.H(str);
            nd0 nd0Var = this.f9100b;
            synchronized (nd0Var) {
                if (nd0Var.f8673a.containsKey(str)) {
                    return H;
                }
                try {
                    nd0Var.f8673a.put(str, new md0(str, H.b(), H.e(), true));
                    return H;
                } catch (Throwable unused) {
                    return H;
                }
            }
        }
        int i = k9.a0.f19634b;
        l9.i.f("Unexpected call to adapter creator.");
        androidx.datastore.preferences.protobuf.s1.b();
        return null;
    }
}
