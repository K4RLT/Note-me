package com.google.android.gms.internal.ads;
import j6.l;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class yu0 extends wu0 {

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f12969c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f12970d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12971f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(l lVar, HashSet hashSet, JSONObject jSONObject, long j10, int i) {
        super(lVar);
        this.f12971f = i;
        this.f12969c = new HashSet(hashSet);
        this.f12970d = jSONObject;
        this.e = j10;
    }

    @Override // com.google.android.gms.internal.ads.wu0
    /* renamed from: a */
    public final void onPostExecute(String str) {
        eu0 eu0Var;
        switch (this.f12971f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                return;
            default:
                if (!TextUtils.isEmpty(str) && (eu0Var = eu0.f5810c) != null) {
                    for (tt0 tt0Var : Collections.unmodifiableCollection(eu0Var.f5811a)) {
                        if (this.f12969c.contains(tt0Var.f11442g)) {
                            nu0 nu0Var = tt0Var.f11440d;
                            if (this.e >= nu0Var.f8869c) {
                                nu0Var.f8870d = 2;
                                s6.A.C(nu0Var.c(), "setNativeViewHierarchy", str, nu0Var.f8867a);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                return;
        }
    }

    public void b(String str) {
        eu0 eu0Var = eu0.f5810c;
        if (eu0Var != null) {
            for (tt0 tt0Var : Collections.unmodifiableCollection(eu0Var.f5811a)) {
                if (this.f12969c.contains(tt0Var.f11442g)) {
                    nu0 nu0Var = tt0Var.f11440d;
                    if (this.e >= nu0Var.f8869c && nu0Var.f8870d != 3) {
                        nu0Var.f8870d = 3;
                        s6.A.C(nu0Var.c(), "setNativeViewHierarchy", str, nu0Var.f8867a);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        switch (this.f12971f) {
            case 0:
                return this.f12970d.toString();
            default:
                l lVar = this.f12335b;
                JSONObject jSONObject = (JSONObject) lVar.f18933v;
                JSONObject jSONObject2 = this.f12970d;
                if (su0.e(jSONObject2, jSONObject)) {
                    return null;
                }
                lVar.f18933v = jSONObject2;
                return jSONObject2.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.wu0, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f12971f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                return;
            default:
                onPostExecute((String) obj);
                return;
        }
    }
}
