package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class dm extends m.a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f5455a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final List f5456b = Arrays.asList(((String) g9.r.e.f17698c.a(sl.f10876ob)).split(","));

    /* renamed from: c, reason: collision with root package name */
    public final fm f5457c;

    /* renamed from: d, reason: collision with root package name */
    public final m.a f5458d;
    public final fe0 e;

    public dm(fm fmVar, m.a aVar, fe0 fe0Var) {
        this.f5458d = aVar;
        this.f5457c = fmVar;
        this.e = fe0Var;
    }

    @Override // m.a
    public final void a(String str, Bundle bundle) {
        m.a aVar = this.f5458d;
        if (aVar != null) {
            aVar.a(str, bundle);
        }
    }

    @Override // m.a
    public final Bundle b(String str, Bundle bundle) {
        m.a aVar = this.f5458d;
        if (aVar != null) {
            return aVar.b(str, bundle);
        }
        return null;
    }

    @Override // m.a
    public final void c(int i, int i10, Bundle bundle) {
        m.a aVar = this.f5458d;
        if (aVar != null) {
            aVar.c(i, i10, bundle);
        }
    }

    @Override // m.a
    public final void d(Bundle bundle) {
        this.f5455a.set(false);
        m.a aVar = this.f5458d;
        if (aVar != null) {
            aVar.d(bundle);
        }
    }

    @Override // m.a
    public final void e(int i, Bundle bundle) {
        this.f5455a.set(false);
        m.a aVar = this.f5458d;
        if (aVar != null) {
            aVar.e(i, bundle);
        }
        f9.k kVar = f9.k.C;
        kVar.f16819k.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        fm fmVar = this.f5457c;
        fmVar.f6114j = currentTimeMillis;
        List list = this.f5456b;
        if (list != null && list.contains(String.valueOf(i))) {
            kVar.f16819k.getClass();
            fmVar.i = SystemClock.elapsedRealtime() + ((Integer) g9.r.e.f17698c.a(sl.f10827lb)).intValue();
            if (fmVar.e == null) {
                fmVar.e = new f(14, fmVar);
            }
            fmVar.d();
            ya.zb.d(this.e, "pact_action", new Pair("pe", "pact_reqpmc"));
        }
    }

    @Override // m.a
    public final void f(String str, Bundle bundle) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optInt("gpa", -1) == 0) {
                this.f5455a.set(true);
                ya.zb.d(this.e, "pact_action", new Pair("pe", "pact_con"));
                this.f5457c.a(jSONObject.getString("paw_id"));
            }
        } catch (JSONException e) {
            k9.a0.l("Message is not in JSON format: ", e);
        }
        m.a aVar = this.f5458d;
        if (aVar != null) {
            aVar.f(str, bundle);
        }
    }

    @Override // m.a
    public final void g(int i, Uri uri, boolean z3, Bundle bundle) {
        m.a aVar = this.f5458d;
        if (aVar != null) {
            aVar.g(i, uri, z3, bundle);
        }
    }
}
